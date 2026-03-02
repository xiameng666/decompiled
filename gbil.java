import android.content.Context;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class gbil implements gbhm {
    public final Context a;
    private final gaym b;
    private final int c;
    private final long d;

    public gbil(Context context0, gaym gaym0, boolean z) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.b = gaym0;
        this.c = z ? 9 : 3;
        gaxl.a();
        this.d = gaxm.u();
    }

    @Override  // gbhm
    public final int a() {
        return this.c;
    }

    @Override  // gbhm
    public final long b() {
        return this.d;
    }

    @Override  // gbhm
    public final Object c() {
        heal heal3;
        heal heal2;
        gged_interceptors gged0;
        List list0;
        heal heal1;
        boolean z = gcvj.f(this.a, "android.permission.READ_PHONE_STATE");
        String s = null;
        TelephonyManager telephonyManager0 = this.a.getPackageManager().hasSystemFeature("android.hardware.telephony") ? ((TelephonyManager)this.a.getSystemService(TelephonyManager.class)) : null;
        gmcd gmcd0 = this.e(telephonyManager0);
        SubscriptionManager subscriptionManager0 = !z || !this.a.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription") ? null : ((SubscriptionManager)this.a.getSystemService(SubscriptionManager.class));
        int v = 0;
        boolean z1 = telephonyManager0 != null && telephonyManager0.isSmsCapable();
        gaxl.a();
        if(hzmb.h()) {
            try {
                helx helx0 = gmcd0 == null ? null : ((helx)gmcd0.get());
                if(helx0 == null) {
                    heal1 = null;
                }
                else {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heal.a).v_newBuilder();
                    ByteString hfsf0 = helx0.getDefaultInstanceForType();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    heal heal0 = (heal)hftp0.b_message;
                    heal0.b = 1;
                    heal0.c = hfsf0;
                    heal1 = (heal)hftp0.N_build();
                }
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                heal1 = null;
            }
        }
        else {
            heal1 = null;
        }
        int v1 = subscriptionManager0 == null || !z ? -1 : subscriptionManager0.getActiveSubscriptionInfoCount();
        Context context0 = this.a;
        boolean z2 = gcvj.f(context0, "android.permission.CAMERA");
        gaxl.a();
        String s1 = gaxm.q();
        String s2 = s1 == null ? null : ibzk.s(s1).toString();
        if(s2 == null) {
            list0 = ibps.a;
        }
        else {
            if(s2.length() > 0) {
                s = s2;
            }
            if(s == null) {
                list0 = ibps.a;
            }
            else {
                list0 = gfud.h("\\s*,\\s*").n(s);
                if(list0 == null) {
                    list0 = ibps.a;
                }
            }
        }
        if(!list0.isEmpty()) {
            new clht(Looper.getMainLooper()).post(new gbik(this, s2));
        }
        ggdy ggdy0 = new ggdy();
        int v2 = list0.size();
        if(telephonyManager0 == null) {
            if(v2 > 0) {
                while(v < v2) {
                    gcvp gcvp0 = new gcvp();
                    gcvp0.e = (String)list0.get(v);
                    ggdy0.i(gcvp0);
                    ++v;
                }
            }
            gged0 = ggdy0.h();
            ibuq.e(gged0, "build(...)");
            return new gbin(v1, heal1, z2, z, gged0, z1);
        }
        if(z && subscriptionManager0 != null) {
            List list1 = subscriptionManager0.getActiveSubscriptionInfoList();
            if(list1 == null) {
                list1 = ibps.a;
            }
            Iterator iterator0 = list1.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object0;
                ibuq.c(subscriptionInfo0);
                if(subscriptionInfo0.getSimSlotIndex() == -1) {
                    heal2 = heal1;
                }
                else {
                    int v3 = telephonyManager0.getSimState(subscriptionInfo0.getSimSlotIndex());
                    if(v3 == 5) {
                        int v4 = subscriptionInfo0.getSubscriptionId();
                        TelephonyManager telephonyManager1 = telephonyManager0.createForSubscriptionId(v4);
                        heal2 = heal1;
                        int v5 = SubscriptionManager.getDefaultSubscriptionId();
                        if(telephonyManager1 != null) {
                            gcvp gcvp1 = gcvn.c(context0, telephonyManager1, v4, v5, subscriptionInfo0.getSimSlotIndex());
                            if(v < v2) {
                                gcvp1.e = (String)list0.get(v);
                            }
                            ggdy0.i(gcvp1);
                            ++v;
                        }
                    }
                    else {
                        heal2 = heal1;
                        gbig gbig0 = new gbig(subscriptionInfo0, v3);
                        gavv.b("BW_SCDL_05", this.b, gbig0, 4);
                    }
                }
                iterator0 = iterator0;
                heal1 = heal2;
            }
            heal3 = heal1;
            if(v2 > v) {
                while(v < v2) {
                    gcvp gcvp2 = new gcvp();
                    gcvp2.e = (String)list0.get(v);
                    ggdy0.i(gcvp2);
                    ++v;
                }
            }
        }
        else {
            heal3 = heal1;
            int v6 = gcvn.a(telephonyManager0, subscriptionManager0);
            gcvp gcvp3 = gcvn.c(context0, telephonyManager0, v6, v6, -1);
            if(v2 > 0) {
                gcvp3.e = (String)list0.get(0);
            }
            ggdy0.i(gcvp3);
        }
        gged0 = ggdy0.h();
        ibuq.e(gged0, "build(...)");
        return new gbin(v1, heal3, z2, z, gged0, z1);
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        ggqk ggqk0 = ((gged_interceptors)((gbin)object1).e).E();
        while(ggqk0.hasNext()) {
            Object object2 = ggqk0.next();
            ((gbio)object0).d(((gcvp)object2));
        }
        ((gbio)object0).h(((gbin)object1).b);
        ((gbio)object0).q(((gbin)object1).c);
        ((gbio)object0).M(((gbin)object1).d);
        ((gbio)object0).R(((gbin)object1).a);
        ((gbio)object0).V(((gbin)object1).f);
    }

    private final gmcd e(TelephonyManager telephonyManager0) {
        gaxl.a();
        gaxl.a();
        if(hzmb.h() && telephonyManager0 != null) {
            try {
                gaxl.a();
                return gcun.a(telephonyManager0, hzks.e());
            }
            catch(SecurityException securityException0) {
                gbih gbih0 = new gbih(securityException0);
                gavv.b("BW_SCDL_01", this.b, gbih0, 4);
                return null;
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                gbii gbii0 = new gbii(unsupportedOperationException0);
                gavv.b("BW_SCDL_02", this.b, gbii0, 4);
                return null;
            }
            catch(Exception exception0) {
                gbij gbij0 = new gbij(exception0);
                gavv.b("BW_SCDL_03", this.b, gbij0, 4);
                return null;
            }
        }
        return null;
    }
}

