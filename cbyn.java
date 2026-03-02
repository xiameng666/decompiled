import android.accounts.Account;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.languageprofile.service.AccountsChangedIntentOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class cbyn {
    public static final bboh a;
    private static volatile cbyn b;

    static {
        cbyn.a = bboh.b("StateManager", bbcu.ct);
    }

    public static cbyn a() {
        synchronized(cbyn.class) {
            if(cbyn.b == null) {
                cbyn.b = new cbyn();
            }
        }
        return cbyn.b;
    }

    public final gged_interceptors b() {
        gged_interceptors gged0;
        synchronized(this) {
            gfsx gfsx0 = cbxc.b();
            if(!gfsx0.i()) {
                return ggna.a;
            }
            ggdy ggdy0 = new ggdy();
            Object object0 = gfsx0.d();
            for(int v1 = 0; v1 < ((Account[])object0).length; ++v1) {
                Account account0 = ((Account[])object0)[v1];
                if(!((gqhg)cbyn.q(account0.name).b_message).f) {
                    ggdy0.i(account0.name);
                }
            }
            gged0 = ggdy0.h();
        }
        return gged0;
    }

    final gged_interceptors c(String s) {
        gged_interceptors gged0;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            gfsx gfsx0 = cbxc.a(s);
            if(gfsx0.i()) {
                ProtoLiteBuilder hftp0 = cbyn.q(((Account)gfsx0.d()).name);
                gqhg gqhg0 = (gqhg)hftp0.b_message;
                if((gqhg0.b & 1) != 0 && ((gqhg0.c == null ? gqif.a : gqhg0.c).b & 1) != 0) {
                    gqif gqif0 = ((gqhg)hftp0.b_message).c;
                    if(gqif0 == null) {
                        gqif0 = gqif.a;
                    }
                    arrayList0.addAll((gqif0.e == null ? gqie.a : gqif0.e).e);
                }
            }
            if(huln.a.c().j()) {
                arrayList0.add(huln.d());
            }
            gged0 = gged_interceptors.i(arrayList0);
        }
        return gged0;
    }

    public final gqhg d(Account account0) {
        Throwable throwable2;
        gqhg gqhg2;
        gqhg gqhg1;
        gqhg gqhg0;
        cbyn cbyn0;
        cmar cmar0;
        long v;
        ProtoLiteBuilder hftp0;
        __monitor_enter(this);
        try {
            hftp0 = cbyn.q(account0.name);
            v = System.currentTimeMillis();
            if(v > ((gqhg)hftp0.b_message).d) {
                if(huli.i()) {
                    cmar0 = cbwx.c().m(cbwh.c, account0);
                    cbyn0 = this;
                    goto label_11;
                }
                goto label_20;
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            cbyn0 = this;
            throwable2 = throwable0;
            goto label_30;
        }
        try {
            try {
            label_11:
                gqhg0 = (gqhg)((glyq)cmar0.b(new cbyg(cbyn0, account0, hftp0, v), 1, cbwx.b())).u();
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new cjuh(14, "Download thread interrupted", null, interruptedException0);
            }
            catch(ExecutionException executionException0) {
                throw new cjuh(8, "Downloading and storing settings failed", null, executionException0);
            }
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_30;
        }
        __monitor_exit(cbyn0);
        return gqhg0;
        try {
        label_20:
            cbyn0 = this;
            gqhg1 = cbyn0.p(account0, hftp0, v);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_30;
        }
        __monitor_exit(cbyn0);
        return gqhg1;
        try {
        label_24:
            gqhg2 = (gqhg)hftp0.N_build();
            cbyn.s(account0.name, gqhg2);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            cbyn0 = this;
            while(true) {
                try {
                label_30:
                    __monitor_exit(cbyn0);
                    throw throwable2;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            throwable2 = throwable0;
            goto label_30;
        }
        __monitor_exit(this);
        return gqhg2;
    }

    public static gqif e(gqhh gqhh0) {
        if((((gqhg)gqhh0).b & 1) != 0) {
            gqif gqif0 = ((gqhg)gqhh0).c;
            if(gqif0 == null) {
                gqif0 = gqif.a;
            }
            boolean z = cbyn.n(gqif0);
            gqif gqif1 = ((gqhg)gqhh0).c;
            if(!z) {
                return gqif1 == null ? gqif.a : gqif1;
            }
            if(gqif1 == null) {
                gqif1 = gqif.a;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gqif1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gqif1));
            if(!((gqia)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gqia)hftp0))).ensureMutable();
            }
            ((gqif)((gqia)hftp0).b_message).c = hfvv.a;
            return (gqif)((ProtoLiteBuilder)(((gqia)hftp0))).N_build();
        }
        return gqif.a;
    }

    public final gqif f(String s) {
        gfsx gfsx0 = cbxc.a(s);
        if(!gfsx0.i()) {
            throw new cjuh(5, "Account is not available: " + s);
        }
        gqhg gqhg0 = this.d(((Account)gfsx0.d()));
        if(!gqhg0.f) {
            cbyn.i();
        }
        return cbyn.e(gqhg0);
    }

    public final List g() {
        List list0;
        synchronized(this) {
            gfsx gfsx0 = cbxc.b();
            list0 = ggia.b(cjpd.d(cbyn.r()).keySet());
            if(!gfsx0.i()) {
                return list0;
            }
            list0.removeAll(new ggal(Arrays.asList(((Object[])gfsx0.d())), new cbyk()));
        }
        return list0;
    }

    public final void h(String s) {
        synchronized(this) {
            gfsx gfsx0 = cbxc.a(s);
            if(!gfsx0.i()) {
                return;
            }
            ProtoLiteBuilder hftp0 = cbyn.q(((Account)gfsx0.d()).name);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).f = true;
            cbyn.s(((Account)gfsx0.d()).name, ((gqhg)hftp0.N_build()));
        }
    }

    public static void i() {
        if(huli.a.e().B()) {
            gfsx gfsx0 = AccountsChangedIntentOperation.a(AppContextProvider.a());
            if(gfsx0.i()) {
                AppContextProvider.a().startService(((Intent)gfsx0.d()));
                return;
            }
            ((ggtj)cbyn.a.i()).x("AccountsChangedIntentOperation could not be fired due to null intent.");
        }
    }

    public final void j(String s) {
        synchronized(this) {
            gfsx gfsx0 = cbxc.a(s);
            if(!gfsx0.i()) {
                return;
            }
            if(huli.i()) {
                try {
                    cmbm cmbm0 = cbwx.c();
                    Account account0 = (Account)gfsx0.d();
                    gmcd gmcd0 = glzd.g(gmbt.h(cmbm0.d(cbwh.c, account0)), new cbyh(), gmap.a);
                    cbyi cbyi0 = new cbyi();
                    ((glyq)glzd.g(glyi.f(gmcd0, IOException.class, cbyi0, gmap.a), new cbyj(), gmap.a)).u();
                    return;
                }
                catch(ExecutionException | InterruptedException exception0) {
                    if((exception0 instanceof InterruptedException)) {
                        Thread.currentThread().interrupt();
                    }
                    throw new RuntimeException(exception0);
                }
            }
            ProtoLiteBuilder hftp0 = cbyn.q(((Account)gfsx0.d()).name);
            this.p(((Account)gfsx0.d()), hftp0, System.currentTimeMillis());
        }
    }

    public final void k(String s) {
        synchronized(this) {
            cjpa cjpa0 = cbyn.r().c();
            cjpa0.j(s);
            cjpd.f(cjpa0);
        }
    }

    public final void l() {
        synchronized(this) {
            gfsx gfsx0 = cbxc.b();
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                for(int v1 = 0; v1 < ((Account[])object0).length; ++v1) {
                    Account account0 = ((Account[])object0)[v1];
                    ProtoLiteBuilder hftp0 = cbyn.q(account0.name);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqhg)hftp0.b_message).f = false;
                    cbyn.s(account0.name, ((gqhg)hftp0.N_build()));
                }
            }
        }
    }

    public final void m(String s, gqif gqif0) {
        synchronized(this) {
            gfsx gfsx0 = cbxc.a(s);
            if(!gfsx0.i()) {
                return;
            }
            ProtoLiteBuilder hftp0 = cbyn.q(((Account)gfsx0.d()).name);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).c = gqif0;
            ((gqhg)hftp0.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).e = 0;
            cbyn.t(((Account)gfsx0.d()), hftp0, System.currentTimeMillis());
        }
    }

    public static boolean n(gqif gqif0) {
        int v = 2;
        switch(gqif0.g) {
            case 0: {
                return v == 4;
            }
            case 1: {
                v = 3;
                return v == 4;
            }
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean o(String s) {
        try {
            return cbyn.n(cbyn.a().f(s));
        }
        catch(cjuh unused_ex) {
            return false;
        }
    }

    public final gqhg p(Account account0, ProtoLiteBuilder hftp0, long v) {
        gfsx gfsx0;
        cbxh cbxh0 = cbxh.b(AppContextProvider.a());
        if(cbxa.a()) {
            try {
                baqr baqr0 = cbxh0.a(account0);
                cbxi cbxi0 = new cbxi(cbxh0.b, cmlp.a, ckif.b);
                gqgj gqgj0 = gqgj.a;
                if(cbxi.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gqgj0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gqgk.a));
                    cbxi.b = new gRPCMethodDescriptor(gRPCMethodType.a, "i18n.language_profile.mobile.MobileUlpService/GetUserLanguageProfile", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gqif gqif0 = ((gqgk)cbxi0.d.callUnaryWithAuth(cbxi.b, baqr0, gqgj0, ((long)cbxi.a), TimeUnit.MILLISECONDS, cbxi0.e)).b;
                if(gqif0 == null) {
                    gqif0 = gqif.a;
                }
                gfsx0 = gfsx.m(gqif0);
                goto label_22;
            }
            catch(acse | IOException exception1) {
                a.ae(cbxh.a.i(), "Authentication failure.", exception1);
            }
            catch(iapl | iapn exception0) {
                a.ae(cbxh.a.i(), "Request failure.", exception0);
            }
            gfsx0 = gfqx.a;
        }
        else {
            gfsx0 = gfsx.m(gqif.a);
        }
    label_22:
        cbxh0.c();
        if(!cbxa.a()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).e = 0;
            gqhg gqhg0 = (gqhg)hftp0.N_build();
            cbyn.s(account0.name, gqhg0);
            return gqhg0;
        }
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqhg gqhg1 = (gqhg)hftp0.b_message;
            gqhg1.c = (gqif)object0;
            gqhg1.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).e = 0;
            return cbyn.t(account0, hftp0, v);
        }
        int v1 = Math.min(((gqhg)hftp0.b_message).e + 1, ((int)huli.c()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqhg)hftp0.b_message).e = v1;
        return cbyn.t(account0, hftp0, v);
    }

    public static final ProtoLiteBuilder q(String s) {
        gqhg gqhg0;
        String s1 = cjpd.c(cbyn.r(), s, null);
        if(s1 == null) {
            return ((ProtoLiteMessage)gqhg.a).v_newBuilder();
        }
        try {
            byte[] arr_b = Base64.decode(s1, 0);
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqhg.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gqhg0 = (gqhg)hftv0;
        }
        catch(hfur | NoSuchFieldError | IllegalArgumentException unused_ex) {
            gqhg0 = gqhg.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gqhg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gqhg0));
        gqhg gqhg1 = (gqhg)hftp0.b_message;
        if((gqhg1.b & 1) != 0) {
            gqif gqif0 = gqhg1.c == null ? gqif.a : gqhg1.c;
            if(gqif0.f > 0L && gqif0.f < System.currentTimeMillis() - huli.a.e().o() * 1000L) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqhg)hftp0.b_message).c = null;
                ((gqhg)hftp0.b_message).b &= -2;
            }
        }
        return hftp0;
    }

    private static final cjpc r() {
        return cjqh.a(AppContextProvider.a(), "languageprofile", "languageprofile.service.UserLanguageProfile", 0);
    }

    private static final void s(String s, gqhg gqhg0) {
        String s1 = Base64.encodeToString(gqhg0.toBytesArray(), 0);
        cjpa cjpa0 = cbyn.r().c();
        cjpa0.h(s, s1);
        cjpd.f(cjpa0);
    }

    private static final gqhg t(Account account0, ProtoLiteBuilder hftp0, long v) {
        int v1 = ((gqhg)hftp0.b_message).e;
        if(v1 > 0 && ((long)v1) < huli.c()) {
            double f = huli.a.e().f();
            double f1 = huli.a.e().g();
            if(v1 != 1) {
                v = ((gqhg)hftp0.b_message).d;
            }
            double f2 = f * Math.pow(((gqhg)hftp0.b_message).e, f1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).d = v + ((long)f2);
        }
        else {
            int v2 = (int)huli.a.e().n();
            int v3 = (int)huli.a.e().m();
            long v4 = v + (((long)v2) + ((long)(gftq.a.nextInt(v3 + v3) - v3))) * 1000L;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhg)hftp0.b_message).d = v4;
        }
        gqhg gqhg0 = (gqhg)hftp0.N_build();
        cbyn.s(account0.name, gqhg0);
        return gqhg0;
    }
}

