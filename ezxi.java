import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.SystemProperties;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class ezxi {
    public static final fagn a;
    public static final fage b;
    public final fagt c;
    private static final baun d;
    private static final fago e;
    private static final fagn f;
    private static final fagn g;
    private final gmcg h;
    private final ezxn i;
    private final Context j;
    private final ezyh k;
    private final avqo l;
    private final ezxe m;
    private final fabj n;

    static {
        ezxi.d = fabk.d("ConfigUpdateControl");
        ezxi.e = new fago("control.config_update.last_get_config_request", ((MessageLite)hnnz.a));
        ezxi.a = new fagp("control.config_update.last_config_update_timestamp", ((long)0L));
        Long long0 = (long)-1L;
        ezxi.f = new fagp("control.config_update.config_update_check_period", long0);
        ezxi.g = new fagp("control.config_update.config_update_check_flex", long0);
        ezxi.b = new ezxh();
    }

    public ezxi(Context context0) {
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        ezyh ezyh0 = new ezyh(context0);
        avrl avrl0 = new avrl(context0);
        ezxe ezxe0 = new ezxe(context0);
        fabj fabj0 = new fabj(context0);
        super();
        this.h = bblp0;
        this.i = (ezxn)ezxn.b.b();
        this.c = (fagt)fagt.a.b();
        this.j = context0;
        this.k = ezyh0;
        this.l = avrl0;
        this.m = ezxe0;
        this.n = fabj0;
    }

    static gfsx a(Context context0) {
        bbst bbst0 = bbst.c();
        String s = bbst0.e(context0);
        if(s != null) {
            return gfsx.m(ezxi.f(s));
        }
        String s1 = bbst0.f(context0);
        return s1 != null ? gfsx.m(ezxi.f(s1)) : gfqx.a;
    }

    public final iapk b(boolean z) {
        gfsx gfsx2;
        String s13;
        hnnu hnnu0;
        hnoc hnoc0;
        hnnv hnnv0;
        Iterator iterator0;
        hnof hnof0;
        TelephonyManager telephonyManager0;
        hnoe hnoe0;
        String s = "";
        iapk iapk0 = iaph.c.a();
        Context context0 = this.j;
        ezvz ezvz0 = ezvz.a(context0);
        try {
            hnnw hnnw0 = (hnnw)((ProtoLiteMessage)hnnx.a).v_newBuilder();
            long v = Long.parseLong(((String)evrg.n(this.l.b())));
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            ((hnnx)hnnw0.b_message).c = v;
            String s1 = Build.BOOTLOADER;
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            hnnx hnnx0 = (hnnx)hnnw0.b_message;
            s1.getClass();
            hnnx0.e = s1;
            String s2 = gfta.b(Build.getRadioVersion());
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            ((hnnx)hnnw0.b_message).f = s2;
            int v1 = Build.VERSION.SDK_INT;
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            ((hnnx)hnnw0.b_message).g = v1;
            String s3 = Locale.getDefault().toLanguageTag();
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            hnnx hnnx1 = (hnnx)hnnw0.b_message;
            s3.getClass();
            hnnx1.h = s3;
            String s4 = SystemProperties.get("ro.oem.key1", "");
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            hnnx hnnx2 = (hnnx)hnnw0.b_message;
            s4.getClass();
            hnnx2.i = s4;
            hnob hnob0 = (hnob)ezxi.a(context0).f(hnob.a);
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            ((hnnx)hnnw0.b_message).j = hnob0;
            ((hnnx)hnnw0.b_message).b |= 1;
            long v2 = TimeUnit.MILLISECONDS.toSeconds(Build.TIME);
            if(!hnnw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hnnw0).ensureMutable();
            }
            ((hnnx)hnnw0.b_message).n = v2;
            ezyh ezyh0 = this.k;
            hnoe0 = (hnoe)((ProtoLiteMessage)hnof.a).v_newBuilder();
            telephonyManager0 = ezyh0.b;
            if(telephonyManager0 == null) {
                ezyh.a.m("No TelephonyManager available.", new Object[0]);
                hnof0 = (hnof)((ProtoLiteBuilder)hnoe0).N_build();
                goto label_64;
            }
            else {
                SubscriptionManager subscriptionManager0 = (SubscriptionManager)ezyh0.c.getSystemService("telephony_subscription_service");
                if(subscriptionManager0 == null) {
                    ezyh.a.j("No Subscription manager found on the device", new Object[0]);
                    hnof0 = ezyh0.a();
                    goto label_64;
                }
                else {
                    List list0 = subscriptionManager0.getActiveSubscriptionInfoList();
                    if(list0 == null || list0.isEmpty()) {
                        ezyh.a.j("No Subscription records found on the device", new Object[0]);
                        hnof0 = ezyh0.a();
                        goto label_64;
                    }
                    else {
                        iterator0 = list0.iterator();
                        while(true) {
                        label_62:
                            if(!iterator0.hasNext()) {
                                hnof0 = (hnof)((ProtoLiteBuilder)hnoe0).N_build();
                            label_64:
                                if(!hnnw0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                }
                                hnnx hnnx3 = (hnnx)hnnw0.b_message;
                                hnof0.getClass();
                                hnnx3.l = hnof0;
                                hnnx3.b |= 2;
                                String s5 = this.m.a();
                                if(!hnnw0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                }
                                hnnx hnnx4 = (hnnx)hnnw0.b_message;
                                s5.getClass();
                                hnnx4.m = s5;
                                String s6 = Build.VERSION.SECURITY_PATCH;
                                if(!hnnw0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                }
                                hnnx hnnx5 = (hnnx)hnnw0.b_message;
                                s6.getClass();
                                hnnx5.o = s6;
                                String s7 = Build.FINGERPRINT;
                                if(!hnnw0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                }
                                hnnx hnnx6 = (hnnx)hnnw0.b_message;
                                s7.getClass();
                                hnnx6.p = s7;
                                String s8 = Build.DEVICE;
                                if(!hnnw0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                }
                                hnnx hnnx7 = (hnnx)hnnw0.b_message;
                                s8.getClass();
                                hnnx7.q = s8;
                                hnnw0.a(ezxi.g("system"));
                                hnnw0.a(ezxi.g("vendor"));
                                if(((String)((ezxl)ezxl.h.b()).j.b(ezxl.f)).equals(Build.FINGERPRINT)) {
                                    ezxi.d.m("Current build is corrupted. Requesting full package only.", new Object[0]);
                                    if(!hnnw0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                    }
                                    ((hnnx)hnnw0.b_message).r = true;
                                }
                                fagt fagt0 = this.c;
                                fago fago0 = ezxi.e;
                                gfsx gfsx0 = (gfsx)fagt0.b(fago0);
                                if(z) {
                                label_115:
                                    if(!hnnw0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)hnnw0).ensureMutable();
                                    }
                                    ((hnnx)hnnw0.b_message).k = true;
                                }
                                else if(gfsx0.i()) {
                                    hnnx hnnx8 = ((hnnz)gfsx0.d()).c;
                                    if(hnnx8 == null) {
                                        hnnx8 = hnnx.a;
                                    }
                                    if(hnnx8.k) {
                                        hnnx hnnx9 = (hnnx)((ProtoLiteBuilder)hnnw0).N_build();
                                        hnnx hnnx10 = ((hnnz)gfsx0.d()).c;
                                        if(hnnx10 == null) {
                                            hnnx10 = hnnx.a;
                                        }
                                        if(hnnx9.p.equals(hnnx10.p)) {
                                            goto label_115;
                                        }
                                    }
                                }
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnnz.a).v_newBuilder();
                                hnnx hnnx11 = (hnnx)((ProtoLiteBuilder)hnnw0).N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                hnnz hnnz0 = (hnnz)hftp0.b_message;
                                hnnx11.getClass();
                                hnnz0.c = hnnx11;
                                hnnz0.b |= 1;
                                hnnz hnnz1 = (hnnz)hftp0.N_build();
                                fagt0.e(new fagh[]{new fagh(fago0, gfsx.m(hnnz1))});
                                hnoa hnoa0 = ezvz0.b(hnnz1);
                                if((hnoa0.b & 1) == 0) {
                                    hnnv0 = hnnv.a;
                                }
                                else {
                                    hnnv0 = hnoa0.c;
                                    if(hnnv0 == null) {
                                        hnnv0 = hnnv.a;
                                    }
                                }
                                fagt0.e(new fagh[]{new fagh(ezwu.j.a, hnnv0.b)});
                                if((hnoa0.b & 2) == 0) {
                                    hnoc0 = hnoc.a;
                                }
                                else {
                                    hnoc0 = hnoa0.d;
                                    if(hnoc0 == null) {
                                        hnoc0 = hnoc.a;
                                    }
                                }
                                fagt0.e(new fagh[]{new fagh(ezwu.d.a, hnoc0.b)});
                                fagt0.e(new fagh[]{new fagh(ezwu.b.a, ((long)hnoc0.c))});
                                fagt0.e(new fagh[]{new fagh(ezwd.a.a, ((long)hnoc0.d))});
                                fagt0.e(new fagh[]{new fagh(ezwu.k.a, hnoc0.e)});
                                fagt0.e(new fagh[]{new fagh(ezwu.i.a, hnoc0.f)});
                                fagt0.e(new fagh[]{new fagh(ezwd.e.a, hnoc0.g)});
                                if((hnoa0.b & 4) == 0) {
                                    hnnu0 = hnnu.a;
                                }
                                else {
                                    hnnu0 = hnoa0.e;
                                    if(hnnu0 == null) {
                                        hnnu0 = hnnu.a;
                                    }
                                }
                                fagt0.e(new fagh[]{new fagh(ezwu.a.a, hnnu0.b)});
                                fagt0.e(new fagh[]{new fagh(ezwu.c.a, hnnu0.c)});
                                fagt0.e(new fagh[]{new fagh(ezwu.e.a, hnnu0.d)});
                                fagt0.e(new fagh[]{new fagh(ezwu.f.a, hnnu0.e)});
                                fagt0.e(new fagh[]{new fagh(ezwy.e.a, ((long)hnnu0.f))});
                                fagh[] arr_fagh = new fagh[1];
                                fagn fagn0 = ezwu.g.a;
                                if(hnnu0.g) {
                                    s = "yes";
                                }
                                arr_fagh[0] = new fagh(fagn0, s);
                                fagt0.e(arr_fagh);
                                fagt0.e(new fagh[]{new fagh(ezwu.h.a, Boolean.valueOf(hnnu0.h))});
                                fagt0.e(new fagh[]{new fagh(ezwq.e.a, ((long)hnnu0.i))});
                                fagt0.e(new fagh[]{new fagh(ezwd.c.a, hfyf.c((hnnu0.j == null ? hfst.a : hnnu0.j)))});
                                fagt0.e(new fagh[]{new fagh(ezwd.d.a, Boolean.valueOf(hnnu0.k))});
                                fagt0.e(new fagh[]{new fagh(ezwd.b.a, hnnu0.l)});
                                fagt0.e(new fagh[]{new fagh(ezwq.c.a, ((long)hnnu0.m))});
                                fagt0.e(new fagh[]{new fagh(ezwq.d.a, ((long)hnnu0.n))});
                                fagt0.e(new fagh[]{new fagh(ezwd.f.a, ((long)hnnu0.o))});
                                fagt0.e(new fagh[]{new fagh(ezwq.b.a, hnnu0.p)});
                                fagt0.e(new fagh[]{new fagh(ezwy.g.a, hfyf.c((hnnu0.q == null ? hfst.a : hnnu0.q)))});
                                fagt0.e(new fagh[]{new fagh(ezwu.l.a, String.valueOf(hnnu0.r))});
                                if(hnnu0.s.size() == 0) {
                                    fagt0.c(new fagn[]{ezwq.f.a});
                                }
                                else {
                                    fagh[] arr_fagh1 = new fagh[1];
                                    String s9 = gfss.d(',').b(hnnu0.s);
                                    arr_fagh1[0] = new fagh(ezwq.f.a, s9);
                                    fagt0.e(arr_fagh1);
                                }
                                fagh[] arr_fagh2 = new fagh[1];
                                String s10 = gfss.d(',').b(hnnu0.t);
                                arr_fagh2[0] = new fagh(ezwu.m.a, s10);
                                fagt0.e(arr_fagh2);
                                fagh[] arr_fagh3 = new fagh[1];
                                String s11 = gfss.d(',').b(hnnu0.t);
                                arr_fagh3[0] = new fagh(ezwu.m.a, s11);
                                fagt0.e(arr_fagh3);
                                fagh[] arr_fagh4 = new fagh[1];
                                String s12 = gfss.d(',').b(hnnu0.u);
                                arr_fagh4[0] = new fagh(ezwu.n.a, s12);
                                fagt0.e(arr_fagh4);
                                fagh[] arr_fagh5 = new fagh[1];
                                hnny hnny0 = hnoa0.f == null ? hnny.a : hnoa0.f;
                                arr_fagh5[0] = new fagh(ezwu.o.a, hfyf.g((hnny0.b == null ? hfst.a : hnny0.b)));
                                fagt0.e(arr_fagh5);
                                fagh[] arr_fagh6 = new fagh[1];
                                hnny hnny1 = hnoa0.f == null ? hnny.a : hnoa0.f;
                                arr_fagh6[0] = new fagh(ezwu.p.a, hfyf.g((hnny1.c == null ? hfst.a : hnny1.c)));
                                fagt0.e(arr_fagh6);
                                this.i.a(10);
                                iapk0 = iaph.a.a();
                                fagt0.e(new fagh[]{new fagh(ezxi.a, System.currentTimeMillis())});
                                this.d();
                                goto label_207;
                            }
                            goto label_214;
                        }
                    }
                }
            }
            goto label_265;
        }
        catch(ExecutionException | InterruptedException exception0) {
            goto label_236;
        }
        catch(iapl iapl0) {
            goto label_246;
        }
        catch(acse acse0) {
            goto label_256;
        }
        catch(Throwable throwable0) {
            goto label_272;
        }
    label_207:
        ezvz0.c();
        fabj fabj0 = this.n;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gihc.a).v_newBuilder();
        int v3 = iapk0.t.r;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
            goto label_265;
            try {
                try {
                label_214:
                    Object object0 = iterator0.next();
                    gfsx gfsx1 = gfsx.l(telephonyManager0.createForSubscriptionId(((SubscriptionInfo)object0).getSubscriptionId()));
                    int v4 = ((SubscriptionInfo)object0).getSubscriptionId();
                    if(gfsx1.i()) {
                        s13 = gfta.b(((TelephonyManager)gfsx1.d()).getSimOperator());
                    }
                    else {
                        try {
                            gfsx2 = gfsx.l(((String)TelephonyManager.class.getDeclaredMethod("getSimOperator", Integer.TYPE).invoke(telephonyManager0, v4)));
                            goto label_231;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            ezyh.a.n("Cannot call method %s on object %s.", noSuchMethodException0, new Object[]{"getSimOperator", TelephonyManager.class.getName()});
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            ezyh.a.n("Cannot call method %s on object %s.", illegalAccessException0, new Object[]{"getSimOperator", TelephonyManager.class.getName()});
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            ezyh.a.n("Cannot call method %s on object %s.", invocationTargetException0, new Object[]{"getSimOperator", TelephonyManager.class.getName()});
                        }
                        gfsx2 = gfqx.a;
                    label_231:
                        s13 = (String)gfsx2.f("");
                    }
                    hnoe0.k(s13);
                    hnoe0.a((gfsx1.i() ? ((long)((TelephonyManager)gfsx1.d()).getSimCarrierId()) : -1L));
                    goto label_62;
                }
                catch(ExecutionException | InterruptedException exception0) {
                }
                catch(iapl iapl0) {
                    goto label_246;
                }
                catch(acse acse0) {
                    goto label_256;
                }
            label_236:
                ezxi.d.i("Unable to get AndroidId", exception0, new Object[0]);
                iapk0 = iaph.k.a();
            }
            catch(Throwable throwable0) {
                goto label_272;
            }
            ezvz0.c();
            fabj0 = this.n;
            hftp1 = ((ProtoLiteMessage)gihc.a).v_newBuilder();
            v3 = iapk0.t.r;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
                goto label_265;
                try {
                label_246:
                    ezxi.d.g("Status exception when retrieving config.", iapl0, new Object[0]);
                    iapk0 = iapl0.a;
                }
                catch(Throwable throwable0) {
                    goto label_272;
                }
                ezvz0.c();
                fabj0 = this.n;
                hftp1 = ((ProtoLiteMessage)gihc.a).v_newBuilder();
                v3 = iapk0.t.r;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                    goto label_265;
                    try {
                    label_256:
                        ezxi.d.g("Auth exception when retrieving config.", acse0, new Object[0]);
                        iapk0 = iaph.q.a().b(gfta.b(acse0.getMessage()));
                    }
                    catch(Throwable throwable0) {
                        goto label_272;
                    }
                    ezvz0.c();
                    fabj0 = this.n;
                    hftp1 = ((ProtoLiteMessage)gihc.a).v_newBuilder();
                    iaph iaph0 = iapk0.t;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    v3 = iaph0.r;
                }
            }
        }
    label_265:
        gihc gihc0 = (gihc)hftp1.b_message;
        gihc0.b |= 1;
        gihc0.c = v3;
        fabj0.c(((gihc)hftp1.N_build()));
        ezxi.d.h("Update config retrieval finished with status: %s.", new Object[]{iapk0});
        return iapk0;
    label_272:
        ezvz0.c();
        fabj fabj1 = this.n;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gihc.a).v_newBuilder();
        int v5 = iapk0.t.r;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gihc gihc1 = (gihc)hftp2.b_message;
        gihc1.b |= 1;
        gihc1.c = v5;
        fabj1.c(((gihc)hftp2.N_build()));
        throw throwable0;
    }

    // Detected as a lambda impl.
    public final iapk c() {
        return this.b(false);
    }

    public final void d() {
        long v = (long)(((Long)ezwu.o.a()));
        if(v <= 0L) {
            v = hvzw.a.c().c();
        }
        long v1 = (long)(((Long)ezwu.p.a()));
        if(v1 <= 0L) {
            v1 = hvzw.a.c().b();
        }
        fagt fagt0 = this.c;
        fagn fagn0 = ezxi.f;
        if(v == ((long)(((Long)fagt0.b(fagn0)))) && v1 == ((long)(((Long)fagt0.b(ezxi.g))))) {
            return;
        }
        Long long0 = v;
        Long long1 = v1;
        ezxi.d.d("Scheduling config update check task with %d seconds period and %d seconds flex.", new Object[]{long0, long1});
        ChimeraGcmTaskService.a.h("Scheduling task: %s.", new Object[]{"CheckConfigUpdate"});
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        clkq0.t("CheckConfigUpdate");
        clkq0.a = v;
        clkq0.b = v1;
        clkq0.p = true;
        clkq0.y(2, 2);
        clkq0.x(0, 1);
        clkq0.v(1);
        cljp.a(this.j).f(clkq0.a());
        fagt0.e(new fagh[]{new fagh(fagn0, long0)});
        fagt0.e(new fagh[]{new fagh(ezxi.g, long1)});
    }

    final void e() {
        ezxg ezxg0 = () -> this.b(false);
        this.h.execute(ezxg0);
    }

    private static hnob f(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnob.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnob)hftp0.b_message).b = s;
        return (hnob)hftp0.N_build();
    }

    private static final hnod g(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnod.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnod)hftp0.b_message).b = s;
        gfsx gfsx0 = gfsx.l(gfta.a(SystemProperties.get(String.format("ro.%s.build.fingerprint", s))));
        if(gfsx0.i()) {
            String s1 = (String)gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnod)hftp0.b_message).d = s1;
        }
        String s2 = SystemProperties.get(String.format("ro.%s.build.date.utc", s));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnod hnod0 = (hnod)hftp0.b_message;
        s2.getClass();
        hnod0.e = s2;
        String s3 = Build.DEVICE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnod hnod1 = (hnod)hftp0.b_message;
        s3.getClass();
        hnod1.c = s3;
        return (hnod)hftp0.N_build();
    }
}

