import android.database.Cursor;
import android.provider.Telephony.ServiceStateTable;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import jeb.synthetic.TWR;

public final class bcrl extends bcrm {
    private static final gged_interceptors e;
    private static final baun f;

    static {
        bcrl.e = gged_interceptors.n(hofm.b, hofm.c, hofm.d);
        bcrl.f = bcrh.a("telephony_info_provider");
    }

    public bcrl(bcrd bcrd0, TelephonyManager telephonyManager0) {
        super(bcrd0, telephonyManager0, null);
    }

    public bcrl(bcrd bcrd0, TelephonyManager telephonyManager0, SubscriptionInfo subscriptionInfo0) {
        super(bcrd0, telephonyManager0, subscriptionInfo0);
    }

    @Override  // bcrm
    public final int a() {
        return SubscriptionManager.from(AppContextProvider.a()).getActiveSubscriptionInfoCountMax();
    }

    @Override  // bcrm
    public final int b() {
        return this.c.getPhoneType();
    }

    @Override  // bcrm
    public final int c() {
        return this.c.getSimCarrierId();
    }

    @Override  // bcrm
    public final int d() {
        return this.d == null ? -1 : this.d.getSimSlotIndex();
    }

    @Override  // bcrm
    public final int e() {
        return this.c.getSimState();
    }

    @Override  // bcrm
    public final int f() {
        return AppContextProvider.a().getPackageManager().hasSystemFeature("android.hardware.telephony.subscription") ? SubscriptionManager.from(AppContextProvider.a()).getActiveSubscriptionInfoCount() : 0;
    }

    @Override  // bcrm
    public final gged_interceptors g() {
        ArrayList arrayList0 = new ArrayList();
        hrff hrff0 = hrff.a;
        if(hrff0.b().e() && bbqa.c() || hrff0.b().d() || hrff0.b().c()) {
            SubscriptionInfo subscriptionInfo0 = this.d;
            if(subscriptionInfo0 == null) {
                return ggna.a;
            }
            try {
                ggqk ggqk0 = bcrl.e.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    hofm hofm0 = (hofm)object0;
                    String s = SubscriptionManager.from(AppContextProvider.a()).getPhoneNumber(subscriptionInfo0.getSubscriptionId(), hofm0.a());
                    if(!gfta.c(s)) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hofn.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s.getClass();
                        ((hofn)hftv0).b = s;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hofn hofn0 = (hofn)hftp0.b_message;
                        hofn0.c = hofm0.a();
                        arrayList0.add(((hofn)hftp0.N_build()));
                    }
                }
                bcqx bcqx0 = bcqx.a(AppContextProvider.a());
                bcrd bcrd0 = this.b;
                String s1 = this.k();
                bcqx0.x(bcrd0, gmfz.bx, s1);
                if(hrff0.b().b()) {
                    try {
                        Object object1 = cliw.b(TelephonyManager.class, "isVolteAvailable", this.c, new cliv[0]);
                        if(object1 == null) {
                            bcqx.a(AppContextProvider.a()).s(bcrd0, gmfz.bA);
                        }
                        else if(((Boolean)object1).booleanValue()) {
                            bcqx bcqx1 = bcqx.a(AppContextProvider.a());
                            String s2 = this.k();
                            bcqx1.x(bcrd0, gmfz.by, s2);
                        }
                        else {
                            bcqx bcqx2 = bcqx.a(AppContextProvider.a());
                            String s3 = this.k();
                            bcqx2.x(bcrd0, gmfz.bz, s3);
                        }
                    }
                    catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                        bcqx.a(AppContextProvider.a()).s(this.b, gmfz.bA);
                    }
                }
                try {
                    Object object2 = cliw.b(TelephonyManager.class, "isImsRegistered", this.c, new cliv[0]);
                    if(object2 == null) {
                        bcqx.a(AppContextProvider.a()).s(this.b, gmfz.bD);
                    }
                    else if(((Boolean)object2).booleanValue()) {
                        bcqx bcqx3 = bcqx.a(AppContextProvider.a());
                        bcrd bcrd1 = this.b;
                        String s4 = this.k();
                        bcqx3.x(bcrd1, gmfz.bB, s4);
                    }
                    else {
                        bcqx bcqx4 = bcqx.a(AppContextProvider.a());
                        bcrd bcrd2 = this.b;
                        String s5 = this.k();
                        bcqx4.x(bcrd2, gmfz.bC, s5);
                    }
                }
                catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                    bcqx.a(AppContextProvider.a()).s(this.b, gmfz.bD);
                }
                if(hrff.a.b().f()) {
                    try {
                        Object object3 = cliw.b(TelephonyManager.class, "isWifiCallingAvailable", this.c, new cliv[0]);
                        if(object3 != null) {
                            if(((Boolean)object3).booleanValue()) {
                                bcqx bcqx5 = bcqx.a(AppContextProvider.a());
                                bcrd bcrd3 = this.b;
                                String s6 = this.k();
                                bcqx5.x(bcrd3, gmfz.bE, s6);
                                return gged_interceptors.i(arrayList0);
                            }
                            bcqx bcqx6 = bcqx.a(AppContextProvider.a());
                            bcrd bcrd4 = this.b;
                            String s7 = this.k();
                            bcqx6.x(bcrd4, gmfz.bF, s7);
                            return gged_interceptors.i(arrayList0);
                        }
                        bcqx.a(AppContextProvider.a()).s(this.b, gmfz.bG);
                        return gged_interceptors.i(arrayList0);
                    }
                    catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                    }
                    bcqx.a(AppContextProvider.a()).s(this.b, gmfz.bG);
                    return gged_interceptors.i(arrayList0);
                }
                return gged_interceptors.i(arrayList0);
            }
            catch(IllegalStateException illegalStateException0) {
                bcrl.f.g("Error getting phone number.", illegalStateException0, new Object[0]);
                bcqx.a(AppContextProvider.a()).s(this.b, gmfz.O);
                return ggna.a;
            }
            catch(NoSuchMethodError unused_ex) {
                bcqx.a(AppContextProvider.a()).s(this.b, gmfz.N);
                return ggna.a;
            }
            return gged_interceptors.i(arrayList0);
        }
        return gged_interceptors.i(arrayList0);
    }

    @Override  // bcrm
    public final hogh h() {
        hogh hogh0;
        if(bbqa.c()) {
            ServiceState serviceState0 = this.c.getServiceState(0);
            return serviceState0 == null ? hogh.a : ((hogh)bcrl.a.getOrDefault(Integer.valueOf(serviceState0.getState()), hogh.a));
        }
        if(!hrff.d() && !hrff.c()) {
            ServiceState serviceState1 = this.c.getServiceState();
            return serviceState1 == null ? hogh.a : ((hogh)bcrl.a.getOrDefault(Integer.valueOf(serviceState1.getState()), hogh.a));
        }
        Cursor cursor0 = AppContextProvider.a().getContentResolver().query(Telephony.ServiceStateTable.CONTENT_URI, new String[]{"voice_reg_state"}, null, null, null);
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    hogh0 = (hogh)bcrl.a.getOrDefault(Integer.valueOf(cursor0.getInt(0)), hogh.a);
                    goto label_14;
                }
                goto label_16;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_14:
            cursor0.close();
            return hogh0;
        }
    label_16:
        if(cursor0 != null) {
            cursor0.close();
        }
        return hogh.a;
    }

    @Override  // bcrm
    public final String i() {
        return (String)MoreObjects.firstNonNull(this.c.getGroupIdLevel1(), "");
    }

    @Override  // bcrm
    public final String j() {
        switch(this.b()) {
            case 1: {
                return (String)MoreObjects.firstNonNull(this.c.getImei(), "");
            }
            case 2: {
                return (String)MoreObjects.firstNonNull(this.c.getMeid(), "");
            }
            default: {
                return "";
            }
        }
    }

    @Override  // bcrm
    public final String k() {
        return (String)MoreObjects.firstNonNull(this.c.getSubscriberId(), "");
    }

    @Override  // bcrm
    public final String l() {
        return (String)MoreObjects.firstNonNull(this.c.getNetworkCountryIso(), "");
    }

    @Override  // bcrm
    public final String m() {
        return (String)MoreObjects.firstNonNull(this.c.getNetworkOperator(), "");
    }

    @Override  // bcrm
    public final String n() {
        return (String)MoreObjects.firstNonNull(this.c.getNetworkOperatorName(), "");
    }

    @Override  // bcrm
    public final String o() {
        return (String)MoreObjects.firstNonNull(this.c.getSimCountryIso(), "");
    }

    @Override  // bcrm
    public final String p() {
        return (String)MoreObjects.firstNonNull(this.c.getSimOperator(), "");
    }

    @Override  // bcrm
    public final String q() {
        return (String)MoreObjects.firstNonNull(this.c.getSimOperatorName(), "");
    }

    @Override  // bcrm
    public final boolean r() {
        return this.c.isNetworkRoaming();
    }
}

