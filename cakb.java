import android.app.usage.UsageEvents.Event;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class cakb implements Runnable {
    public final IpaGcmTaskChimeraService a;

    public cakb(IpaGcmTaskChimeraService ipaGcmTaskChimeraService0) {
        this.a = ipaGcmTaskChimeraService0;
    }

    @Override
    public final void run() {
        String s;
        ResolveInfo resolveInfo0;
        ArrayList arrayList0 = new ArrayList();
        IpaGcmTaskChimeraService ipaGcmTaskChimeraService0 = this.a;
        if(huhz.i()) {
            long v = System.currentTimeMillis();
            SharedPreferences sharedPreferences0 = ipaGcmTaskChimeraService0.getSharedPreferences("usage_stats_manager_prefs", 0);
            long v1 = sharedPreferences0.getLong("usage_stats_timestamp", 0L);
            sharedPreferences0.edit().putLong("usage_stats_timestamp", v).commit();
            UsageStatsManager usageStatsManager0 = (UsageStatsManager)ipaGcmTaskChimeraService0.getSystemService("usagestats");
            try {
                UsageEvents usageEvents0 = usageStatsManager0.queryEvents(Math.max(v1, v - cajn.b), v);
            }
            catch(RuntimeException unused_ex) {
                ((ggtj)cajn.a.i()).x("b/62250956. Bad implementation of UsageStatsManager.queryEvents onLeEco devices");
                cakj.a().c(35);
                goto label_62;
            }
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            HashSet hashSet0 = new HashSet();
            PackageManager packageManager0 = ipaGcmTaskChimeraService0.getPackageManager();
            Intent intent0 = new Intent("android.intent.action.MAIN");
            intent0.addCategory("android.intent.category.HOME");
            Object object0 = null;
            try {
                resolveInfo0 = packageManager0.resolveActivity(intent0, 0x10000);
            }
            catch(SecurityException securityException0) {
                ((ggtj)cajt.a.j()).B("Failed to get default launcher package name. Exception: %s", securityException0.getMessage());
                s = null;
                goto label_27;
            }
            s = resolveInfo0 == null || resolveInfo0.activityInfo == null ? null : resolveInfo0.activityInfo.packageName;
        label_27:
            if(s != null) {
                hashSet0.add(s);
            }
            UsageEvents.Event usageEvents$Event0 = new UsageEvents.Event();
            while(usageEvents0.getNextEvent(usageEvents$Event0)) {
                if(usageEvents$Event0.getEventType() == 1 && !TextUtils.isEmpty(usageEvents$Event0.getPackageName()) && !usageEvents$Event0.getPackageName().equals(object0) && !hashSet0.contains(usageEvents$Event0.getPackageName())) {
                    object0 = usageEvents$Event0.getPackageName();
                    List list0 = (List)hashMap1.get(object0);
                    if(list0 == null) {
                        gged_interceptors gged0 = cajt.d(ipaGcmTaskChimeraService0.getPackageManager(), ((String)object0));
                        ArrayList arrayList1 = new ArrayList();
                        if(gged0 != null) {
                            for(int v2 = 0; v2 < ((ggna)gged0).c; ++v2) {
                                cajj cajj0 = (cajj)gged0.get(v2);
                                if(cajj0.b()) {
                                    arrayList1.add(cajj0.c.flattenToString());
                                }
                            }
                        }
                        if(arrayList1.isEmpty()) {
                            hashSet0.add(object0);
                            continue;
                        }
                        else {
                            hashMap1.put(object0, arrayList1);
                            list0 = arrayList1;
                        }
                    }
                    for(Object object1: list0) {
                        String s1 = (String)object1;
                        String s2 = (String)hashMap0.get(s1);
                        if(s2 == null) {
                            s2 = cajt.b(ComponentName.unflattenFromString(s1));
                            hashMap0.put(s1, s2);
                        }
                        long v3 = usageEvents$Event0.getTimeStamp();
                        arrayList0.add(new UsageInfo(new DocumentId("com.google.android.gms", "internal.3p:MobileApplication", s2), v3, 0, null, null, true, -1, 0, null));
                    }
                }
            }
        }
    label_62:
        if(arrayList0.isEmpty()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).b = 5;
        int v4 = arrayList0.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).g = v4;
        long v5 = SystemClock.elapsedRealtime();
        azts azts0 = new azts(ipaGcmTaskChimeraService0);
        azzc azzc0 = new azzc();
        azzc0.d = 1;
        azzc0.a = new abxs(((UsageInfo[])arrayList0.toArray(new UsageInfo[arrayList0.size()])));
        evql evql0 = azts0.iG(azzc0.a());
        evql0.b(new cajk(hftp0, arrayList0));
        evql0.A(new cajl(hftp0));
        evql0.z(new cajm(hftp0, v5));
    }
}

