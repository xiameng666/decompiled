import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Base64;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper.NearbyAlertReceiver;
import com.google.android.location.reporting.collectors.PowerModeReceiver;
import com.google.android.location.reporting.service.LocationReportingController.WifiStatusReceiver;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;

public final class fxsw {
    public final Context a;
    public final fxqn b;
    public final fxtr c;
    public final fxts d;
    public final cmnh e;
    public final fxpw f;
    public final fxqk g;
    public int h;
    public final fxsv i;
    private final fxtt j;
    private final fxsk k;
    private final fxpz l;
    private final fxqd m;
    private final fxtp n;
    private final fxuh o;
    private final cmmn p;
    private final fxqj q;
    private final fyad r;
    private PowerModeReceiver s;
    private LocationReportingController.WifiStatusReceiver t;
    private final fxtu u;

    public fxsw(Context context0, fxqn fxqn0, fxtt fxtt0, fxtr fxtr0, fxts fxts0, cmnh cmnh0, fxpz fxpz0, fxqd fxqd0, fxsk fxsk0, fxtp fxtp0, fxuh fxuh0, fxpw fxpw0, fxqk fxqk0, cmmn cmmn0, fxqj fxqj0) {
        this.h = 2;
        this.a = context0;
        this.b = fxqn0;
        this.j = fxtt0;
        this.c = fxtr0;
        this.d = fxts0;
        this.e = cmnh0;
        this.k = fxsk0;
        this.l = fxpz0;
        this.m = fxqd0;
        this.n = fxtp0;
        this.o = fxuh0;
        this.f = fxpw0;
        this.i = this.i == null ? new fxsv(this) : this.i;
        this.p = cmmn0;
        this.g = fxqk0;
        this.q = fxqj0;
        this.r = fyad.a(context0);
        this.u = fxtu.a(context0);
    }

    public static PendingIntent a(Context context0, Intent intent0) {
        return PendingIntent.getService(context0, 0, intent0, 0xA000000);
    }

    final gzuh b(long v) {
        if(!hzek.n() && !hzek.o()) {
            return this.d.f ? fxvc.b(v) : fxvc.a(v);
        }
        int v1 = this.h;
        switch(v1) {
            case 3: {
                return fxvc.b(v);
            }
            case 4: {
                return fxvc.c(hzek.a.i().p(), 13, v);
            }
            case 5: {
                return fxvc.c(hzek.a.i().o(), 14, v);
            }
            case 6: {
                return fxvc.c(hzek.a.i().u(), 15, v);
            }
            case 7: {
                return fxvc.c(hzek.a.i().t(), 16, v);
            }
            case 8: 
            case 9: {
                switch(v1) {
                    case 8: {
                        return fxvc.c(hzek.d(), 19, v);
                    }
                    case 9: {
                        return fxvc.c(hzek.d(), 20, v);
                    }
                    default: {
                        return fxvc.c(hzek.d(), 1, v);
                    }
                }
            }
            default: {
                return fxvc.a(v);
            }
        }
    }

    final void c() {
        synchronized(this) {
            if(this.t != null) {
                return;
            }
            LocationReportingController.WifiStatusReceiver locationReportingController$WifiStatusReceiver0 = new LocationReportingController.WifiStatusReceiver(this);
            this.t = locationReportingController$WifiStatusReceiver0;
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.net.wifi.STATE_CHANGE");
            jwe.b(this.a, locationReportingController$WifiStatusReceiver0, intentFilter0, 2);
            fxqw.c("GCoreUlr", "Registered for wifi state change updates");
        }
    }

    public final void d(int v) {
        String s;
        switch(v) {
            case 1: {
                s = "PowerModeReceiver";
                break;
            }
            case 2: {
                s = "Moving";
                break;
            }
            case 3: {
                s = "Still";
                break;
            }
            case 4: {
                s = "AtHomeWithWifi";
                break;
            }
            case 5: {
                s = "AtHomeWithoutWifi";
                break;
            }
            case 6: {
                s = "AtWorkWithWifi";
                break;
            }
            case 7: {
                s = "AtWorkWithoutWifi";
                break;
            }
            case 8: {
                s = "HomeDeparture";
                break;
            }
            case 9: {
                s = "WorkDeparture";
                break;
            }
            default: {
                fxqw.m(21, "Unknown sampling state: " + v);
                s = "Unknown";
            }
        }
        fxra.k("UlrSamplingRateUpdateRequest", v);
        fxtk.e(this.a, s);
    }

    public final void e() {
        this.l.a();
        this.m.e();
        PowerModeReceiver powerModeReceiver0 = this.s;
        if(powerModeReceiver0 != null) {
            this.a.unregisterReceiver(powerModeReceiver0);
            this.s = null;
        }
        PendingIntent pendingIntent0 = this.k("com.google.android.location.reporting.ACTION_LOCATION");
        this.e.e(pendingIntent0);
        pendingIntent0.cancel();
        PendingIntent pendingIntent1 = this.k("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
        pendingIntent1.cancel();
        PendingIntent pendingIntent2 = this.k("com.google.android.location.reporting.ACTION_ACTIVITY");
        this.p.d(pendingIntent2);
        pendingIntent1.cancel();
        this.d.p(null);
        this.l();
        this.f.a();
        this.g.b();
        fxqw.c("GCoreUlr", "Unbound from all signal providers.");
    }

    public final void f(ReportingConfig reportingConfig0, String s) {
        this.g(reportingConfig0, s, false);
    }

    public final void g(ReportingConfig reportingConfig0, String s, boolean z) {
        ReportingConfig reportingConfig1;
        bzs bzs1;
        bzs bzs0;
        int v17;
        boolean z4;
        boolean z3;
        ClientIdentity clientIdentity1;
        ClientIdentity clientIdentity0;
        batl.k(null);
        long v = System.currentTimeMillis();
        synchronized(fxtr.b) {
            reportingConfig1 = this.c.d.b();
        }
        if(!hyac.G()) {
            boolean z1 = reportingConfig0.e();
            this.r.e(z1);
        }
        fxuh fxuh0 = this.o;
        if(reportingConfig1 == null) {
        label_36:
            fxtp fxtp0 = this.n;
            if(hzeq.a.b().f()) {
                String[] arr_s = fxtp.a;
                for(int v8 = 0; v8 < 6; ++v8) {
                    String s1 = arr_s[v8];
                    try {
                        bbsr.b(fxtp0.b).d(s1, 0x80);
                        Intent intent0 = new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED").setPackage(s1);
                        fxtp0.b.sendBroadcast(intent0);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
            }
            else {
                Intent intent1 = new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED").setPackage("com.google.android.googlequicksearchbox");
                fxtp0.b.sendBroadcast(intent1);
                Intent intent2 = new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED").setPackage("com.google.android.apps.maps");
                fxtp0.b.sendBroadcast(intent2);
            }
            Intent intent3 = bbmq.j(new Intent("com.google.android.gms.location.reporting.SETTINGS_CHANGED"));
            fxtp0.b.sendBroadcast(intent3);
            Intent intent4 = new Intent("android.location.InjectedSettingChanged");
            fxtp0.b.sendBroadcast(intent4);
        }
        else {
            bxf bxf0 = new bxf();
            bxf0.addAll(reportingConfig1.d());
            bxf0.addAll(reportingConfig0.d());
            int v2 = 0;
            int v3 = 0;
            bxe bxe0 = new bxe(bxf0);
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                AccountConfig accountConfig0 = reportingConfig1.a(((Account)object0));
                AccountConfig accountConfig1 = reportingConfig0.a(((Account)object0));
                if(accountConfig0 == null || accountConfig1 == null) {
                    goto label_36;
                }
                int v4 = fxuh0.a(accountConfig0, "com.google.android.googlequicksearchbox");
                int v5 = fxuh0.b(accountConfig0, "com.google.android.googlequicksearchbox");
                int v6 = fxuh0.a(accountConfig1, "com.google.android.googlequicksearchbox");
                int v7 = fxuh0.b(accountConfig1, "com.google.android.googlequicksearchbox");
                ReportingState reportingState0 = accountConfig0.c(v4, v5, true, true);
                ReportingState reportingState1 = accountConfig1.c(v6, v7, true, true);
                v2 |= reportingState1.equals(reportingState0) ^ 1;
                v3 |= (reportingState1.b != reportingState0.b || reportingState1.e() != reportingState0.e() ? 1 : 0);
            }
            fxra.f("UlrSettingsChange", ((boolean)v2));
            fxra.f("UlrCoarseSettingsChange", ((boolean)v3));
            if(v2) {
                goto label_36;
            }
        }
        if(fxra.p() && reportingConfig1 != null) {
            bxf bxf1 = new bxf();
            bxf1.addAll(reportingConfig1.c());
            bxf1.addAll(reportingConfig0.c());
            bxe bxe1 = new bxe(bxf1);
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                AccountConfig accountConfig2 = reportingConfig1.a(((Account)object1));
                AccountConfig accountConfig3 = reportingConfig0.a(((Account)object1));
                if(accountConfig2 == null) {
                    fxra.g("UlrActivationOnAccountAdded");
                }
                else if(accountConfig3 == null) {
                    fxra.g("UlrActivationOffAccountRemoved");
                }
                else if(!accountConfig2.j() && accountConfig3.j()) {
                    fxra.k("UlrActivationOn", fxra.a(fxra.d(accountConfig2)));
                }
                else {
                    if(!accountConfig2.j() || accountConfig3.j()) {
                        continue;
                    }
                    fxra.k("UlrActivationOff", fxra.a(fxra.d(accountConfig3)));
                }
            }
        }
        fxsk fxsk0 = this.k;
        fxsk0.a.h = fxsk0.b.e().isEmpty() ^ 1;
        List list0 = reportingConfig0.c();
        if(hzew.c()) {
            boolean z2 = this.u.k();
            if(!list0.isEmpty() && this.m() && z2) {
                fxqw.c("GCoreUlr", "Disable ULR due to private mode!");
            }
            if(!list0.isEmpty() && this.m() && !z2) {
                goto label_87;
            }
            else {
                goto label_309;
            }
        }
        else if(!list0.isEmpty() && this.m()) {
        label_87:
            this.b.a(reportingConfig0);
            fxug fxug0 = fxsk0.a();
            fxqw.c("GCoreUlr", s + ": Ensuring that reporting is active for " + cnug.b(list0));
            if(z) {
                PendingIntent pendingIntent0 = this.k("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
                LocationRequest locationRequest0 = new LocationRequest();
                locationRequest0.h(0L);
                locationRequest0.k(102);
                locationRequest0.g(0L);
                locationRequest0.i_max_wait_time(0L);
                locationRequest0.j(1);
                locationRequest0.f(hzek.a.i().l());
                LocationRequestInternal locationRequestInternal0 = new LocationRequestInternal(locationRequest0, null, false, false, false, false, 0x7FFFFFFFFFFFFFFFL);
                locationRequestInternal0.b(true);
                locationRequestInternal0.a(Collections.singletonList(fxzz.a(this.a)));
                this.e.i(locationRequestInternal0, pendingIntent0);
            }
            else {
                if(this.s == null) {
                    PowerModeReceiver powerModeReceiver0 = new PowerModeReceiver(this.j, this.d);
                    this.s = powerModeReceiver0;
                    powerModeReceiver0.a = this;
                    IntentFilter intentFilter0 = new IntentFilter();
                    intentFilter0.addAction("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                    intentFilter0.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                    intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                    intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                    jwe.b(this.a, powerModeReceiver0, intentFilter0, 2);
                }
                this.c();
                gzuh gzuh0 = this.b(v);
                fxts fxts0 = this.d;
                long v9 = fxug0.c(true);
                long v10 = fxpy.a(fxts0);
                long v11 = gzuh0.d;
                long v12 = !hzek.a.i().aA() || !fxts0.i && !fxts0.j ? hzek.a.i().c() : hzek.a.i().m();
                long v13 = Math.max(v11, v9);
                Context context0 = this.a;
                String s2 = fxug0.b();
                if(s2 != null) {
                    for(Object object2: context0.getPackageManager().getInstalledApplications(0x80)) {
                        ApplicationInfo applicationInfo0 = (ApplicationInfo)object2;
                        if(!applicationInfo0.packageName.equals(s2)) {
                            continue;
                        }
                        clientIdentity1 = new ClientIdentity(applicationInfo0.uid, s2);
                        goto label_136;
                    }
                }
                clientIdentity0 = fxzz.a(context0);
                clientIdentity1 = clientIdentity0;
            label_136:
                fxtn fxtn0 = new fxtn(v11, v10, v12, v13, clientIdentity1);
                if(this.n()) {
                    fxtn fxtn1 = fxts0.c;
                    z3 = fxtn1 == null ? false : fxtn0.b(fxtn1);
                }
                else {
                    z3 = false;
                }
                if(this.n()) {
                    fxtn fxtn2 = fxts0.c;
                    z4 = fxtn2 == null ? false : fxtn0.a(fxtn2);
                }
                else {
                    z4 = false;
                }
                if(!z3 || !z4) {
                    if(!z3) {
                        PendingIntent pendingIntent1 = this.k("com.google.android.location.reporting.ACTION_LOCATION");
                        LocationRequest locationRequest1 = new LocationRequest();
                        locationRequest1.h(fxtn0.a);
                        locationRequest1.k(102);
                        locationRequest1.g(fxtn0.b);
                        locationRequest1.i_max_wait_time(fxtn0.d);
                        LocationRequestInternal locationRequestInternal1 = new LocationRequestInternal(locationRequest1, null, false, false, false, false, 0x7FFFFFFFFFFFFFFFL);
                        locationRequestInternal1.b(true);
                        locationRequestInternal1.a(Collections.singletonList(fxtn0.e));
                        this.e.i(locationRequestInternal1, pendingIntent1);
                        fxts0.o(gzuh0, fxtn0, SystemClock.elapsedRealtime());
                        this.o(reportingConfig0, gzuh0);
                        fxqw.c("GCoreUlr", "GMS FLP location updates requested: " + gzuh0);
                    }
                    if(!z4) {
                        PendingIntent pendingIntent2 = this.k("com.google.android.location.reporting.ACTION_ACTIVITY");
                        WorkSource workSource0 = bbrd.b(context0, fxtn0.e.b);
                        cmmo cmmo0 = new cmmo();
                        cmmo0.c(fxtn0.c);
                        cmmo0.c = false;
                        cmmo0.e = "UlrSampleSpec";
                        cmmo0.d = workSource0;
                        ActivityRecognitionRequest activityRecognitionRequest0 = cmmo0.a();
                        evql evql0 = this.p.f(activityRecognitionRequest0, pendingIntent2);
                        evql0.b(new fxtl(fxtn0));
                        evql0.A(new fxtm(fxtn0));
                        fxts0.p(fxtn0);
                        fxqw.c("GCoreUlr", "GMS AR updates requested: " + fxtn0.toString());
                    }
                    PendingIntent pendingIntent3 = PendingIntent.getService(context0, 0, fxto.a(context0), 0x2000000);
                    bbib bbib0 = new bbib(context0);
                    bbib0.a(pendingIntent3);
                    bbib0.k("GCoreUlrWorldUpdater", 3, SystemClock.elapsedRealtime() + 3600000L, 3600000L, pendingIntent3, "com.google.android.gms");
                }
                else if(fxts0.i() != null && (gzuh0.b & 4) != 0) {
                    int v14 = gzue.a(gzuh0.e) == 0 ? 1 : gzue.a(gzuh0.e);
                    int v15 = gzue.a(fxts0.i().e);
                    if(v15 == 0) {
                        v15 = 1;
                    }
                    if(v14 != v15) {
                        fxts0.n(gzuh0);
                        this.o(reportingConfig0, gzuh0);
                    }
                }
            }
            fxpw fxpw0 = this.f;
            if(fxpw.c()) {
                fxtt fxtt0 = this.j;
                if(fxpw0.b(list0, fxtt0)) {
                    fxsv fxsv0 = this.i;
                    String s3 = fxtt0.c();
                    String s4 = fxtt0.d();
                    if(fxsv0 != null && (hzek.n() && s3 != null && !s3.isEmpty() || hzek.o() && s4 != null && !s4.isEmpty())) {
                        HashSet hashSet0 = new HashSet(2);
                        if(s3 != null && hzek.n()) {
                            fxpw0.d = s3;
                            hashSet0.add(fxpw0.d);
                        }
                        if(s4 != null && hzek.o()) {
                            fxpw0.e = s4;
                            hashSet0.add(fxpw0.e);
                        }
                        fxpw0.h = fxsv0;
                        if(fxpw0.f == null) {
                            fxpw0.f = new HomeWorkNearbyAlertsHelper.NearbyAlertReceiver(fxpw0);
                            HomeWorkNearbyAlertsHelper.NearbyAlertReceiver homeWorkNearbyAlertsHelper$NearbyAlertReceiver0 = fxpw0.f;
                            IntentFilter intentFilter1 = new IntentFilter("com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE");
                            jwe.b(fxpw0.c, homeWorkNearbyAlertsHelper$NearbyAlertReceiver0, intentFilter1, 2);
                        }
                        NearbyAlertFilter nearbyAlertFilter0 = NearbyAlertFilter.b(hashSet0);
                        int v16 = ((int)hzek.a.i().J()) == 0 ? 0 : 2;
                        switch(((int)hzek.a.i().I())) {
                            case 100: {
                                v17 = 100;
                                break;
                            }
                            case 110: {
                                v17 = 110;
                                break;
                            }
                            default: {
                                v17 = -1;
                            }
                        }
                        NearbyAlertRequest nearbyAlertRequest0 = new NearbyAlertRequest(3, -1, null, nearbyAlertFilter0, false, v16, v17);
                        PendingIntent pendingIntent4 = fxva.b(fxpw0.c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE");
                        fxrg fxrg0 = new fxrg(fxpw0.b, pendingIntent4, nearbyAlertRequest0);
                        fxpw0.b.a.execute(fxrg0);
                        fxpw0.g = true;
                    }
                }
            }
            else {
                fxpw0.a();
            }
            if(hzek.a.i().aq() && (!hzek.a.i().ad() || !this.d.i && !this.d.j)) {
                this.g.a(this.q);
            }
            else {
                this.g.b();
            }
            if(!hzdv.e() && !hzdv.d()) {
                this.l.a();
            }
            else {
                fxpz fxpz0 = this.l;
                if(!hzdv.e()) {
                    fxpz0.b();
                }
                else if(fxpz0.b == null) {
                    fxpz0.b = fxqc.a(fxpz0.a, null);
                    fxpz0.b.b();
                }
                if(hzdv.d()) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v18 = 0; true; ++v18) {
                        bzs0 = fxpz0.c;
                        if(v18 >= bzs0.d_num) {
                            break;
                        }
                        Account account0 = (Account)bzs0.f(v18);
                        if(!list0.contains(account0)) {
                            ((fxqc)bzs0.i(v18)).c();
                        }
                        arrayList0.add(account0);
                    }
                    for(int v19 = 0; v19 < arrayList0.size(); ++v19) {
                        bzs0.remove(((Account)arrayList0.get(v19)));
                    }
                    for(int v20 = 0; v20 < list0.size(); ++v20) {
                        Account account1 = (Account)list0.get(v20);
                        if(!bzs0.containsKey(account1)) {
                            fxqc fxqc0 = fxqc.a(fxpz0.a, account1);
                            bzs0.put(account1, fxqc0);
                            fxqc0.b();
                        }
                    }
                }
                else {
                    fxpz0.c();
                }
            }
            if(fxqd.f()) {
                fxqd fxqd0 = this.m;
                if(hyac.R() && hzdy.c()) {
                    ArrayList arrayList1 = new ArrayList();
                    for(int v21 = 0; true; ++v21) {
                        bzs1 = fxqd0.b;
                        if(v21 >= bzs1.d_num) {
                            break;
                        }
                        Account account2 = (Account)bzs1.f(v21);
                        if(!list0.contains(account2)) {
                            ((fxqg)bzs1.i(v21)).b();
                            arrayList1.add(account2);
                        }
                    }
                    for(int v22 = 0; v22 < arrayList1.size(); ++v22) {
                        bzs1.remove(((Account)arrayList1.get(v22)));
                    }
                    for(int v23 = 0; v23 < list0.size(); ++v23) {
                        Account account3 = (Account)list0.get(v23);
                        if(!bzs1.containsKey(account3)) {
                            Intent intent5 = fxtk.a(fxqd0.a, "com.google.android.location.reporting.ACTION_SEMANTIC_LOCATION_INFERENCE");
                            intent5.setData(Uri.fromParts("mailto:", account3.name, account3.type));
                            PendingIntent pendingIntent5 = PendingIntent.getService(fxqd0.a, 0, intent5, 0xA000000);
                            fxqg fxqg0 = new fxqg(fxqd0.a, pendingIntent5, account3);
                            bzs1.put(account3, fxqg0);
                            if(!fxqg0.d) {
                                elwh elwh0 = fxqg0.a();
                                new emhd(fxqg0.a, elwh0).b(new elwk().a(), fxqg0.b).z(new fxqe(fxqg0));
                            }
                        }
                    }
                }
                else {
                    fxqd0.e();
                }
            }
            else {
                this.m.e();
            }
        }
        else {
        label_309:
            reportingConfig0.f();
            this.e();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.j.c.edit();
            sharedPreferences$Editor0.clear();
            sharedPreferences$Editor0.putInt("apiLevel", 3);
            sharedPreferences$Editor0.apply();
            fxqn fxqn0 = this.b;
            synchronized(fxqn0.c) {
                LevelDb levelDb0 = fxqn0.d;
                if(levelDb0 != null) {
                    try {
                        levelDb0.deleteRange(null, null);
                    }
                    catch(LevelDbCorruptionException | IllegalStateException exception0) {
                        fxqn0.b(exception0);
                    }
                    catch(LevelDbException levelDbException0) {
                        fxqw.k("Error removing all entries", levelDbException0);
                    }
                    SecretKeySpec secretKeySpec0 = fxtt.a(fxqn0.b).f();
                    fxqn0.a.a(secretKeySpec0);
                }
            }
            this.d.k();
            fxra.o();
        }
        this.d.w(reportingConfig0);
        this.c.f();
        synchronized(fxtr.b) {
            fxtu fxtu0 = this.c.d;
            List list1 = reportingConfig0.a;
            int v26 = list1.size();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxrz.a).v_newBuilder();
            int v27 = 0;
            while(v27 < v26) {
                AccountConfig accountConfig4 = (AccountConfig)list1.get(v27);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fxrl.a).v_newBuilder();
                boolean z5 = accountConfig4.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((fxrl)hftv0).b |= 4;
                ((fxrl)hftv0).e = z5;
                long v28 = accountConfig4.c;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((fxrl)hftv1).b |= 8;
                ((fxrl)hftv1).f = v28;
                boolean z6 = accountConfig4.d;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((fxrl)hftv2).b |= 16;
                ((fxrl)hftv2).g = z6;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((fxrl)hftv3).b |= 0x20;
                ((fxrl)hftv3).h = false;
                boolean z7 = accountConfig4.e;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((fxrl)hftv4).b |= 0x40;
                ((fxrl)hftv4).i = z7;
                boolean z8 = accountConfig4.g;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp1.b_message;
                ((fxrl)hftv5).b |= 0x80;
                ((fxrl)hftv5).j = z8;
                long v29 = accountConfig4.i;
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp1.b_message;
                ((fxrl)hftv6).b |= 0x100;
                ((fxrl)hftv6).k = v29;
                int v30 = accountConfig4.j;
                if(!hftv6.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp1.b_message;
                ((fxrl)hftv7).b |= 0x200;
                ((fxrl)hftv7).l = v30;
                boolean z9 = accountConfig4.k;
                if(!hftv7.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv8 = hftp1.b_message;
                ((fxrl)hftv8).b |= 0x400;
                ((fxrl)hftv8).m = z9;
                boolean z10 = accountConfig4.l;
                if(!hftv8.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fxrl fxrl0 = (fxrl)hftp1.b_message;
                fxrl0.b |= 0x800;
                fxrl0.n = z10;
                fxrp fxrp0 = accountConfig4.m.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv9 = hftp1.b_message;
                fxrp0.getClass();
                ((fxrl)hftv9).o = fxrp0;
                ((fxrl)hftv9).b |= 0x1000;
                int v31 = accountConfig4.n;
                if(!hftv9.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv10 = hftp1.b_message;
                ((fxrl)hftv10).b |= 0x2000;
                ((fxrl)hftv10).p = v31;
                if(!hftv10.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv11 = hftp1.b_message;
                ((fxrl)hftv11).b |= 0x4000;
                ((fxrl)hftv11).q = z5;
                boolean z11 = accountConfig4.r;
                if(!hftv11.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv12 = hftp1.b_message;
                ((fxrl)hftv12).b |= 0x200000;
                ((fxrl)hftv12).w = z11;
                int v32 = accountConfig4.s;
                if(!hftv12.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv13 = hftp1.b_message;
                ((fxrl)hftv13).b |= 0x400000;
                ((fxrl)hftv13).x = v32;
                boolean z12 = accountConfig4.t;
                if(!hftv13.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv14 = hftp1.b_message;
                ((fxrl)hftv14).b |= 0x1000000;
                ((fxrl)hftv14).y = z12;
                boolean z13 = accountConfig4.u;
                if(!hftv14.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fxrl fxrl1 = (fxrl)hftp1.b_message;
                fxrl1.b |= 0x2000000;
                fxrl1.z = z13;
                Account account4 = accountConfig4.a;
                if(account4.name != null) {
                    String s5 = account4.name;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl2 = (fxrl)hftp1.b_message;
                    s5.getClass();
                    fxrl2.b |= 1;
                    fxrl2.c = s5;
                }
                if(account4.type != null) {
                    String s6 = account4.type;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl3 = (fxrl)hftp1.b_message;
                    s6.getClass();
                    fxrl3.b |= 2;
                    fxrl3.d = s6;
                }
                String s7 = accountConfig4.f;
                if(s7 != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl4 = (fxrl)hftp1.b_message;
                    fxrl4.b |= 0x40000;
                    fxrl4.t = s7;
                }
                String s8 = accountConfig4.h;
                if(s8 != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl5 = (fxrl)hftp1.b_message;
                    fxrl5.b |= 0x80000;
                    fxrl5.u = s8;
                }
                Long long0 = accountConfig4.p;
                if(long0 != null) {
                    long v33 = (long)long0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl6 = (fxrl)hftp1.b_message;
                    fxrl6.b |= 0x10000;
                    fxrl6.s = v33;
                }
                String s9 = accountConfig4.o;
                if(s9 != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl7 = (fxrl)hftp1.b_message;
                    fxrl7.b |= 0x8000;
                    fxrl7.r = s9;
                }
                Long long1 = accountConfig4.q;
                if(long1 != null) {
                    long v34 = (long)long1;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fxrl fxrl8 = (fxrl)hftp1.b_message;
                    fxrl8.b |= 0x100000;
                    fxrl8.v = v34;
                }
                fxrl fxrl9 = (fxrl)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fxrz fxrz0 = (fxrz)hftp0.b_message;
                fxrl9.getClass();
                hfuo hfuo0 = fxrz0.c;
                if(!hfuo0.c()) {
                    fxrz0.c = ProtoLiteMessage.E(hfuo0);
                }
                fxrz0.c.add(fxrl9);
                ++v27;
                v26 = v26;
                list1 = list1;
            }
            fxrp fxrp1 = reportingConfig0.b.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fxrz fxrz1 = (fxrz)hftp0.b_message;
            fxrp1.getClass();
            fxrz1.d = fxrp1;
            fxrz1.b |= 2;
            String s10 = Base64.encodeToString(((fxrz)hftp0.N_build()).toBytesArray(), 2);
            SharedPreferences sharedPreferences0 = fxtu0.a;
            SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences0.edit().putString("reportingConfig", s10);
            ArrayList arrayList2 = new ArrayList();
            for(Object object5: list1) {
                AccountConfig accountConfig5 = (AccountConfig)object5;
                String s11 = fxtu.i(accountConfig5.a);
                String s12 = fxtu.i(accountConfig5.a);
                Long long2 = sharedPreferences0.contains(s12) ? sharedPreferences0.getLong(s12, 0L) : null;
                if(accountConfig5.j()) {
                    if(long2 != null) {
                        arrayList2.add(new fxua(accountConfig5, 1, ((long)long2)));
                        arrayList2.add(new fxua(accountConfig5, 2, v));
                    }
                    sharedPreferences$Editor1.remove(s11);
                }
                else {
                    if(long2 != null) {
                        continue;
                    }
                    sharedPreferences$Editor1.putLong(s11, v);
                }
            }
            sharedPreferences$Editor1.apply();
        }
        for(Object object6: arrayList2) {
            fxua fxua0 = (fxua)object6;
            AccountConfig accountConfig6 = fxua0.a;
            if(accountConfig6.j()) {
                int v35 = fxua0.c;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzsl.a).v_newBuilder();
                if(fxua0 != null) {
                    int v36 = gzsk.a(v35 - 1);
                    if(v36 != 0) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gzsl)hftp2.b_message).c = v36 - 1;
                        ((gzsl)hftp2.b_message).b |= 1;
                    }
                }
                gzsl gzsl0 = (gzsl)hftp2.N_build();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv15 = hftp3.b_message;
                gzsl0.getClass();
                ((gzty)hftv15).g = gzsl0;
                ((gzty)hftv15).b |= 0x20;
                long v37 = fxua0.b;
                if(!hftv15.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gzty gzty0 = (gzty)hftp3.b_message;
                gzty0.b |= 1;
                gzty0.c = v37;
                if(v35 == 2) {
                    gztx gztx0 = fxvb.a(false);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gzty gzty1 = (gzty)hftp3.b_message;
                    gztx0.getClass();
                    gzty1.f = gztx0;
                    gzty1.b |= 16;
                }
                gzty gzty2 = (gzty)hftp3.N_build();
                this.b.l(accountConfig6.a, gzty2, "ApiActivationChange");
            }
        }
    }

    public final void h(int v) {
        fxsv fxsv0 = this.i;
        if(fxsv0 == null) {
            return;
        }
        fxsv0.a(v);
    }

    public final void i(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gztr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gztr gztr0 = (gztr)hftp0.b_message;
        gztr0.b |= 1;
        gztr0.c = v;
        gztr gztr1 = (gztr)hftp0.N_build();
        long v1 = System.currentTimeMillis();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
        if(gztr1 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gzty)hftp1.b_message).l = gztr1;
            ((gzty)hftp1.b_message).b |= 0x1000;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzty gzty0 = (gzty)hftp1.b_message;
        gzty0.b |= 1;
        gzty0.c = v1;
        gzty gzty1 = (gzty)hftp1.N_build();
        List list0 = this.c.d().c();
        this.b.n(list0, gzty1, "ApiInternalState");
    }

    public final boolean j() {
        return this.t != null && this.t.a;
    }

    private final PendingIntent k(String s) {
        Intent intent0 = fxtk.a(this.a, s);
        return fxsw.a(this.a, intent0);
    }

    private final void l() {
        synchronized(this) {
            LocationReportingController.WifiStatusReceiver locationReportingController$WifiStatusReceiver0 = this.t;
            if(locationReportingController$WifiStatusReceiver0 != null) {
                try {
                    this.a.unregisterReceiver(locationReportingController$WifiStatusReceiver0);
                    this.t = null;
                }
                catch(IllegalArgumentException unused_ex) {
                    fxqw.f("Try to unregister a  wifi status receiver before register it!");
                }
            }
        }
    }

    private final boolean m() {
        return this.c.d.a.getInt("location_enabled_key", 3) != 0;
    }

    private final boolean n() {
        ReportingConfig reportingConfig0 = this.d.h();
        return reportingConfig0 == null ? false : reportingConfig0.e();
    }

    private final void o(ReportingConfig reportingConfig0, gzuh gzuh0) {
        gzty gzty0 = fxvb.c(gzuh0);
        List list0 = reportingConfig0.c();
        this.b.n(list0, gzty0, "ApiRate");
    }
}

