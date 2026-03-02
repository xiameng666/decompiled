import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings.Secure;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class bwfr implements bwey {
    public static final bboh a;
    public final bvrf b;
    public final bvtb c;
    public final Context d;
    public final bwfc e;
    private final bvso f;
    private final bwep g;
    private final bvsf h;
    private final bvqm i;

    static {
        bwfr.a = bboh.e(bbcu.ci);
    }

    public bwfr(bvrf bvrf0, bvtb bvtb0, bvso bvso0, Context context0, bwfc bwfc0, bwep bwep0, bvsf bvsf0, bvqm bvqm0) {
        this.b = bvrf0;
        this.c = bvtb0;
        this.f = bvso0;
        this.d = context0;
        this.e = bwfc0;
        this.g = bwep0;
        this.h = bvsf0;
        this.i = bvqm0;
    }

    @Override  // bwey
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        gqpz gqpz0 = null;
        switch(s.hashCode()) {
            case 0x7821648: {
                if(s.equals("RESURFACE_GDG_FALLBACK_TASK")) {
                    Bundle bundle0 = cllr0.b;
                    if(bundle0 != null) {
                        gqpz0 = (gqpz)bwer.a(bundle0.getString("resurface_gdg_fallback_session_b64"), ((Parser)((ProtoLiteMessage)gqpz.a).jf(7, null)));
                    }
                    if(gqpz0 == null) {
                        ((ggtj)bwfr.a.j()).x("Failed to parse session from task in onGdgFallback.");
                        return 2;
                    }
                    try {
                        bvqm bvqm0 = this.i;
                        Account account0 = new Account(gqpz0.d, "com.google");
                        baqr baqr0 = new baqr();
                        baqr0.d = "com.google.android.gms";
                        baqr0.e = "com.google.android.gms";
                        baqr0.a = bbmq.b;
                        baqr0.c = account0;
                        baqr0.b = account0;
                        baqr0.l("https://www.googleapis.com/auth/mobile_user_preferences");
                        hgoa hgoa0 = hgoa.a;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgoa0).v_newBuilder();
                        int v = gqpz0.e;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hgoa)hftp0.b_message).c = v;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgnz.a).v_newBuilder();
                        Context context0 = this.d;
                        long v1 = bbmq.d(context0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((hgnz)hftp1.b_message).c = v1;
                        boolean z = bwex.d(context0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((hgnz)hftp1.b_message).f = z;
                        String s1 = bwex.c(context0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz0 = (hgnz)hftp1.b_message;
                        s1.getClass();
                        hgnz0.j = s1;
                        String s2 = bwex.b(context0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz1 = (hgnz)hftp1.b_message;
                        s2.getClass();
                        hgnz1.b |= 4;
                        hgnz1.k = s2;
                        String s3 = Build.VERSION.RELEASE;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz2 = (hgnz)hftp1.b_message;
                        s3.getClass();
                        hgnz2.e = s3;
                        int v2 = Build.VERSION.SDK_INT;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((hgnz)hftp1.b_message).d = v2;
                        int v3 = (int)bwex.a(context0);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((hgnz)hftp1.b_message).g = v3;
                        String s4 = Build.BRAND;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz3 = (hgnz)hftp1.b_message;
                        s4.getClass();
                        hgnz3.b |= 1;
                        hgnz3.h = s4;
                        String s5 = Build.MODEL;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz4 = (hgnz)hftp1.b_message;
                        s5.getClass();
                        hgnz4.b |= 2;
                        hgnz4.i = s5;
                        String s6 = TimeZone.getDefault().getID();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgnz hgnz5 = (hgnz)hftp1.b_message;
                        s6.getClass();
                        hgnz5.l = s6;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hgoa hgoa1 = (hgoa)hftp0.b_message;
                        hgnz hgnz6 = (hgnz)hftp1.N_build();
                        hgnz6.getClass();
                        hgoa1.d = hgnz6;
                        hgoa1.b |= 1;
                        hgoa hgoa2 = (hgoa)hftp0.N_build();
                        bvqo bvqo0 = new bvqo(bvqm0.a, cmlp.a, ckht.b);
                        if(bvqo.b == null) {
                            ibjh ibjh0 = new ibjh(((MessageLite)hgoa0));
                            ibjh ibjh1 = new ibjh(((MessageLite)hgob.a));
                            bvqo.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/ResurfaceGdgFallbackNotification", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                        }
                        hgob hgob0 = (hgob)bvqo0.c.callUnaryWithAuth(bvqo.b, baqr0, hgoa2, ((long)bvqo.a), TimeUnit.MILLISECONDS, bvqo0.d);
                        return 0;
                    }
                    catch(iapl | acse exception0) {
                        a.ae(bwfr.a.j(), "Failed while calling growthApiClient resurfaceGdgFallbackNotification", exception0);
                        return 1;
                    }
                }
                return 0;
            }
            case 0x127BFA70: {
                if(s.equals("DEFAULT_INPUT_METHOD_TASK")) {
                    gmbu.t(glzd.g(gmbt.h(glzd.f(gmbt.h(this.c.a.a()), new bvsx(), gmap.a)), new bwfp(this), gmap.a), new bvmt(new bwfq()), gmap.a);
                    return 0;
                }
                return 0;
            }
            case 980957587: {
                if(s.equals("DSUW_TASK")) {
                    gmbu.t(glzd.g(gmbt.h(this.g.b.a()), new bwel(this.g, this.d, this.b), gmap.a), new bvmt(new bwem()), gmap.a);
                    return 0;
                }
                return 0;
            }
            case 0x49F4CBD1: {
                if(s.equals("DSUW_TIMEOUT_TASK")) {
                    gmbu.t(glzd.g(gmbt.h(this.g.b.a()), new bwen(this.g, this.d, this.b), gmap.a), new bvmt(new bweo()), gmap.a);
                    return 0;
                }
                return 0;
            }
            case 0x50B296C5: {
                if(s.equals("REMIND_ME_LATER_TASK")) {
                    Bundle bundle1 = cllr0.b;
                    if(bundle1 != null) {
                        gqpz0 = (gqpz)bwer.a(bundle1.getString("remind_me_later_session_b64"), ((Parser)((ProtoLiteMessage)gqpz.a).jf(7, null)));
                    }
                    if(gqpz0 == null) {
                        ((ggtj)bwfr.a.j()).x("Failed to parse session from task in onRemindMeLater");
                        return 2;
                    }
                    bvrf bvrf0 = this.b;
                    String s7 = gqpz0.d;
                    int v4 = gqpz0.e;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gqyb)hftp2.b_message).d = 21;
                    ((gqyb)hftp2.b_message).b |= 2;
                    bvrf0.b(s7, v4, hftp2);
                    try {
                        bvsf bvsf0 = this.h;
                        Account account1 = new Account(gqpz0.d, "com.google");
                        baqr baqr1 = new baqr();
                        baqr1.d = "com.google.android.gms";
                        baqr1.e = "com.google.android.gms";
                        baqr1.a = bbmq.b;
                        baqr1.c = account1;
                        baqr1.b = account1;
                        baqr1.l("https://www.googleapis.com/auth/mobile_user_preferences");
                        gqqh gqqh0 = gqqh.a;
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqqh0).v_newBuilder();
                        int v5 = gqpz0.e;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gqqh)hftp3.b_message).e = v5;
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
                        long v6 = gqpz0.c;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ((hfwn)hftp4.b_message).b = v6;
                        hfwn hfwn0 = (hfwn)hftp4.N_build();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp3.b_message;
                        hfwn0.getClass();
                        ((gqqh)hftv0).d = hfwn0;
                        ((gqqh)hftv0).b |= 2;
                        String s8 = gqpz0.f;
                        if(!hftv0.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gqqh gqqh1 = (gqqh)hftp3.b_message;
                        s8.getClass();
                        gqqh1.f = s8;
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gqqg.a).v_newBuilder();
                        Context context1 = this.d;
                        long v7 = bbmq.d(context1);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gqqg)hftp5.b_message).b = v7;
                        boolean z1 = bwex.d(context1);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gqqg)hftp5.b_message).f = z1;
                        String s9 = bwex.c(context1);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gqqg gqqg0 = (gqqg)hftp5.b_message;
                        s9.getClass();
                        gqqg0.h = s9;
                        String s10 = Build.VERSION.RELEASE;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gqqg gqqg1 = (gqqg)hftp5.b_message;
                        s10.getClass();
                        gqqg1.d = s10;
                        int v8 = Build.VERSION.SDK_INT;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gqqg)hftp5.b_message).c = v8;
                        int v9 = (int)bwex.a(context1);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gqqg)hftp5.b_message).g = v9;
                        String s11 = String.valueOf(bbrc.f());
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gqqg gqqg2 = (gqqg)hftp5.b_message;
                        s11.getClass();
                        gqqg2.e = s11;
                        String s12 = TimeZone.getDefault().getID();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gqqg gqqg3 = (gqqg)hftp5.b_message;
                        s12.getClass();
                        gqqg3.i = s12;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gqqh gqqh2 = (gqqh)hftp3.b_message;
                        gqqg gqqg4 = (gqqg)hftp5.N_build();
                        gqqg4.getClass();
                        gqqh2.c = gqqg4;
                        gqqh2.b |= 1;
                        gqqh gqqh3 = (gqqh)hftp3.N_build();
                        bvsi bvsi0 = new bvsi(bvsf0.a, cmlp.a, ckhu.b);
                        if(bvsi.b == null) {
                            ibjh ibjh2 = new ibjh(((MessageLite)gqqh0));
                            ibjh ibjh3 = new ibjh(((MessageLite)gqqi.a));
                            bvsi.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.growth.v1.GrowthApiService/ScheduleRemindMeLaterNotification", ((gRPCMarshaller)ibjh2), ((gRPCMarshaller)ibjh3), false);
                        }
                        gqqi gqqi0 = (gqqi)bvsi0.c.callUnaryWithAuth(bvsi.b, baqr1, gqqh3, ((long)bvsi.a), TimeUnit.MILLISECONDS, bvsi0.d);
                        return 0;
                    }
                    catch(iapl | acse exception1) {
                        a.ae(bwfr.a.j(), "Failed while calling growthApiClient.scheduleRemindMeLaterNotification", exception1);
                        return 1;
                    }
                }
                return 0;
            }
            case 0x6B1A7CB4: {
                return 0;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // bwey
    public final void b(String s) {
        gmbu.t(glzd.g(gmbt.h(glzd.f(gmbt.h(this.c.a.a()), new bvst(s), gmap.a)), new bwfi(this, s), gmap.a), new bvmt(new bwfj(s)), gmap.a);
    }

    @Override  // bwey
    public final void c() {
        gmbu.t(glzd.g(gmbt.h(glzd.f(gmbt.h(this.c.a.a()), new bvsw(), gmap.a)), new bwfg(this), gmap.a), new bvmt(new bwfh()), gmap.a);
    }

    @Override  // bwey
    public final void d(Intent intent0) {
        byte[] arr_b;
        try {
            arr_b = (byte[])((glyq)this.f.a()).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(bwfr.a.j(), "Storage failure during scheduleDsuwTask", exception0);
            arr_b = null;
        }
        if(arr_b == null) {
            Parcel parcel0 = Parcel.obtain();
            intent0.writeToParcel(parcel0, 0);
            byte[] arr_b1 = parcel0.marshall();
            byte[] arr_b2 = Arrays.copyOf(arr_b1, arr_b1.length);
            parcel0.recycle();
            bvsl bvsl0 = new bvsl(arr_b2);
            gmbu.t(gmbt.h(this.f.a.b(bvsl0, gmap.a)), new bvmu(new bwfk(this), new bwfl()), gmap.a);
            return;
        }
        clja clja0 = new clja();
        clja0.t("DSUW_TASK");
        clja0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clja0.v(1);
        clja0.p = true;
        clja0.y(0, 1);
        clja0.c(new cliz(Settings.Secure.getUriFor("user_setup_personalization_state"), 0));
        cljb cljb0 = clja0.a();
        this.e.a(cljb0);
    }

    @Override  // bwey
    public final void e(ProtoLiteBuilder hftp0) {
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        gqpz0.b |= 1;
        gqpz0.c = v;
        gqpz gqpz1 = (gqpz)hftp0.N_build();
        boolean z = htwz.a.b().f();
        Bundle bundle0 = new Bundle();
        bundle0.putString("remind_me_later_session_b64", bwer.b(((MessageLite)gqpz1)));
        clkn clkn0 = new clkn();
        clkn0.t("REMIND_ME_LATER_TASK");
        clkn0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clkn0.v(1);
        clkn0.p = true;
        clkn0.y(0, ((int)z));
        clkn0.e(htwz.a.b().c(), htwz.a.b().b());
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        this.e.a(clko0);
    }

    @Override  // bwey
    public final void f(ProtoLiteBuilder hftp0) {
        if(hftp0 == null) {
            ((ggtj)bwfr.a.j()).x("Failed to parse session from task in ResurfaceGdgFallbackNotification");
            return;
        }
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        gqpz0.b |= 1;
        gqpz0.c = v;
        gqpz gqpz1 = (gqpz)hftp0.N_build();
        Bundle bundle0 = new Bundle();
        bundle0.putString("resurface_gdg_fallback_session_b64", bwer.b(((MessageLite)gqpz1)));
        clkn clkn0 = new clkn();
        clkn0.t("RESURFACE_GDG_FALLBACK_TASK");
        clkn0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clkn0.v(1);
        clkn0.p = true;
        clkn0.y(0, 1);
        clkn0.u = bundle0;
        clkn0.e(htwv.a.b().d(), htwv.a.b().c());
        clko clko0 = clkn0.a();
        this.e.a(clko0);
    }

    @Override  // bwey
    public final void g(String s, ProtoLiteBuilder hftp0) {
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        gqpz0.b |= 1;
        gqpz0.c = v;
        bvsu bvsu0 = new bvsu(s, ((gqpz)hftp0.N_build()));
        gmbu.t(gmbt.h(this.c.a.b(bvsu0, gmap.a)), new bvmt(new bwfo(s)), gmap.a);
    }

    @Override  // bwey
    public final void h(ProtoLiteBuilder hftp0) {
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        gqpz0.b |= 1;
        gqpz0.c = v;
        bvsy bvsy0 = new bvsy(((gqpz)hftp0.N_build()));
        gmbu.t(gmbt.h(this.c.a.b(bvsy0, gmap.a)), new bvmu(new bwfm(this), new bwfn()), gmap.a);
    }

    @Override  // bwey
    public final void i(ProtoLiteBuilder hftp0) {
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        gqpz0.b |= 1;
        gqpz0.c = v;
        bvsz bvsz0 = new bvsz(((gqpz)hftp0.N_build()));
        gmbu.t(gmbt.h(this.c.a.b(bvsz0, gmap.a)), new bvmt(new bwff()), gmap.a);
    }

    public final void j() {
        clja clja0 = new clja();
        clja0.t("DEFAULT_INPUT_METHOD_TASK");
        clja0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clja0.v(1);
        clja0.p = true;
        clja0.y(0, 1);
        clja0.c(new cliz(Settings.Secure.getUriFor("default_input_method"), 0));
        cljb cljb0 = clja0.a();
        this.e.a(cljb0);
    }

    public static final boolean k(gqpz gqpz0, long v) {
        return gqpz0 == null ? false : TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - gqpz0.c < v;
    }
}

