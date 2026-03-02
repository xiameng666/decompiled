import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;

public final class gbhz implements gbhm {
    private final Context a;
    private final String b;

    public gbhz(Context context0, String s) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.b = s;
    }

    @Override  // gbhm
    public final int a() {
        return 7;
    }

    @Override  // gbhm
    public final long b() {
        return 0L;
    }

    @Override  // gbhm
    public final Object c() {
        hcit hcit2;
        gbhy gbhy0;
        PackageInfo packageInfo0 = gbhl.a(this.a, "com.google.android.gms");
        PackageInfo packageInfo1 = this.b == null ? null : gbhl.a(this.a, this.b);
        PackageInfo packageInfo2 = gbhl.a(this.a, "com.google.android.gms");
        PackageManager packageManager0 = this.a.getPackageManager();
        List list0 = ibpo.i(new gbhx[]{new gbhx("com.google.android.payments.standard.AUTHENTICATE_V1", hciq.b, false, null, 12), new gbhx("com.google.android.payments.standard.REDIRECT_CAPTURE_V1", hciq.d, false, null, 12), new gbhx("com.google.android.wallet.carrierbilling.operatorproperties.BIND", hciq.c, true, null, 8)});
        gaxl.a();
        if(hzlj.c()) {
            Uri uri0 = Uri.parse("upi://pay");
            list0.add(new gbhx("android.intent.action.VIEW", hciq.e, false, uri0, 4));
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            gbhx gbhx0 = (gbhx)object0;
            Intent intent0 = new Intent(gbhx0.a);
            Uri uri1 = gbhx0.d;
            if(uri1 != null) {
                intent0.setData(uri1);
            }
            List list1 = gbhx0.c ? packageManager0.queryIntentServices(intent0, 0) : packageManager0.queryIntentActivities(intent0, 0);
            ibuq.c(list1);
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list1) {
                ActivityInfo activityInfo0 = ((ResolveInfo)object1).activityInfo;
                if(activityInfo0 != null) {
                    String s = activityInfo0.packageName;
                    if(s != null) {
                        gbhy0 = new gbhy(s, gbhx0.b);
                        goto label_31;
                    }
                }
                gbhy0 = null;
            label_31:
                if(gbhy0 != null) {
                    arrayList1.add(gbhy0);
                }
            }
            ibpo.D(arrayList0, arrayList1);
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object2: arrayList0) {
            String s1 = ((gbhy)object2).a;
            Object object3 = linkedHashMap0.get(s1);
            if(object3 == null) {
                object3 = new ArrayList();
                linkedHashMap0.put(s1, object3);
            }
            ((List)object3).add(((gbhy)object2).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: linkedHashMap0.entrySet()) {
            String s2 = (String)((Map.Entry)object4).getKey();
            List list2 = (List)((Map.Entry)object4).getValue();
            try {
                PackageInfo packageInfo3 = packageManager0.getPackageInfo(s2, 0);
                ArrayList arrayList3 = new ArrayList(ibpo.q(list2, 10));
                for(Object object5: list2) {
                    hciq hciq0 = (hciq)object5;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcir.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((hcir)hftv0).c = hciq0.f;
                    ((hcir)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcir.b(((hcir)hftp0.b_message));
                    arrayList3.add(((hcir)hftp0.N_build()));
                }
                hcis hcis0 = (hcis)((ProtoLiteMessage)hcit.a).v_newBuilder();
                if(!hcis0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hcis0).ensureMutable();
                }
                hcit hcit0 = (hcit)hcis0.b_message;
                s2.getClass();
                hcit0.b |= 1;
                hcit0.c = s2;
                String s3 = String.valueOf(packageInfo3.getLongVersionCode());
                if(!hcis0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hcis0).ensureMutable();
                }
                hcit hcit1 = (hcit)hcis0.b_message;
                s3.getClass();
                hcit1.b |= 2;
                hcit1.d = s3;
                hcis0.a(arrayList3);
                hcit2 = (hcit)((ProtoLiteBuilder)hcis0).N_build();
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                hcit2 = null;
            }
            if(hcit2 != null) {
                arrayList2.add(hcit2);
            }
        }
        return new gbhw(packageInfo0, packageInfo1, packageInfo2, arrayList2);
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        PackageInfo packageInfo0 = ((gbhw)object1).a;
        String s = null;
        Long long0 = packageInfo0 == null ? null : ((long)packageInfo0.versionCode);
        PackageInfo packageInfo1 = ((gbhw)object1).b;
        if(packageInfo1 != null && this.e()) {
            long0 = (long)packageInfo1.versionCode;
        }
        if(long0 != null) {
            ((gbia)object0).K(long0.longValue());
        }
        if(packageInfo0 != null) {
            s = packageInfo0.versionName;
        }
        if(packageInfo1 != null && this.e()) {
            s = packageInfo1.versionName;
        }
        if(s != null) {
            ((gbia)object0).L(s);
        }
        PackageInfo packageInfo2 = ((gbhw)object1).c;
        if(packageInfo2 != null) {
            ((gbia)object0).p(packageInfo2.getLongVersionCode());
            linkedHashSet0.add(gbhz.f(packageInfo2));
        }
        if(packageInfo1 != null) {
            String s1 = packageInfo1.packageName;
            ibuq.e(s1, "packageName");
            ((gbia)object0).s(s1);
            ((gbia)object0).t(((long)packageInfo1.versionCode));
            linkedHashSet0.add(gbhz.f(packageInfo1));
        }
        if(packageInfo0 != null) {
            linkedHashSet0.add(gbhz.f(packageInfo0));
        }
        ((gbia)object0).i(((gbhw)object1).d);
        ibuq.e("com.google.android.gms", "getPackageName(...)");
        ((gbia)object0).J("com.google.android.gms");
        ((gbia)object0).f(ibpo.ar(linkedHashSet0));
    }

    private final boolean e() {
        return ibuq.m(this.b, "com.android.vending");
    }

    private static final hhde f(PackageInfo packageInfo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhde.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        String s = packageInfo0.packageName;
        ibuq.e(s, "packageName");
        if(s.length() > 0) {
            String s1 = packageInfo0.packageName;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhde hhde0 = (hhde)hftp0.b_message;
            s1.getClass();
            hhde0.b |= 1;
            hhde0.c = s1;
        }
        String s2 = String.valueOf(packageInfo0.versionCode);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde1 = (hhde)hftp0.b_message;
        s2.getClass();
        hhde1.b |= 2;
        hhde1.d = s2;
        long v = packageInfo0.firstInstallTime;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde2 = (hhde)hftp0.b_message;
        hhde2.b |= 8;
        hhde2.f = v;
        long v1 = packageInfo0.lastUpdateTime;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde3 = (hhde)hftp0.b_message;
        hhde3.b |= 4;
        hhde3.e = v1;
        String s3 = packageInfo0.applicationInfo == null ? null : packageInfo0.applicationInfo.sourceDir;
        if(s3 != null && s3.length() != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhde hhde4 = (hhde)hftp0.b_message;
            hhde4.b |= 16;
            hhde4.g = s3;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hhde)hftv0;
    }
}

