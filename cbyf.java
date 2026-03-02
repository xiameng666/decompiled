import android.accounts.Account;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.FIN;

public final class cbyf {
    public static final bboh a;
    private static volatile cbyf b;

    static {
        cbyf.a = bboh.b("LSStateManager", bbcu.ct);
    }

    public static cbyf a() {
        synchronized(cbyf.class) {
            if(cbyf.b == null) {
                cbyf.b = new cbyf();
            }
        }
        return cbyf.b;
    }

    public final cjpc b() {
        return cjqh.a(AppContextProvider.a(), "languageprofile", "languageprofile.service.LanguageSettings", 0);
    }

    @Deprecated
    public final fktz c(Account account0, gged_interceptors gged0) {
        fktz fktz2;
        synchronized(this) {
            if(cbyn.o(account0.name)) {
                return fktz.d();
            }
            gqhc gqhc0 = this.g(account0.name);
            int v1 = ((gqhd)gqhc0.b_message).c ^ 1;
            if(((gqhd)gqhc0.b_message).c != 0 && System.currentTimeMillis() - ((gqhd)gqhc0.b_message).d < huln.b() * 1000L) {
                return fktz.e(null);
            }
            List list0 = DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b);
            cbxh cbxh0 = cbxh.b(AppContextProvider.a());
            cbxh0.c();
            if(cbxh0.d(account0, (list0.isEmpty() || gged0.isEmpty() ? ggna.a : gged_interceptors.h(gggq.d(list0, new cbxz(gged0)))))) {
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                ((gqhd)gqhc0.b_message).c = true;
                long v2 = System.currentTimeMillis();
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                ((gqhd)gqhc0.b_message).d = v2;
                this.u(account0.name, ((gqhd)((ProtoLiteBuilder)gqhc0).N_build()));
            }
            fkty fkty0 = fktz.b(null);
            fkty0.c = v1;
            fktz2 = fkty0.a();
        }
        return fktz2;
    }

    public final fktz d(Account account0, gged_interceptors gged0) {
        fktz fktz2;
        synchronized(this) {
            if(cbyn.o(account0.name)) {
                return fktz.d();
            }
            ProtoLiteBuilder hftp0 = this.x(account0.name);
            int v1 = ((gqhf)hftp0.b_message).b ^ 1;
            ggdy ggdy0 = new ggdy();
            int v2 = gged0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                gqhv gqhv0 = ((gqhe)this.s(((String)gged0.get(v3))).b_message).c;
                if(gqhv0 == null) {
                    gqhv0 = gqhv.a;
                }
                ggdy0.i(gqhv0);
            }
            if(((gqhf)hftp0.b_message).b && System.currentTimeMillis() - ((gqhf)hftp0.b_message).c < huln.b() * 1000L) {
                return fktz.e(null);
            }
            cbxh cbxh0 = cbxh.b(AppContextProvider.a());
            boolean z = cbxh0.d(account0, ggdy0.h());
            cbxh0.c();
            if(z) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqhf)hftp0.b_message).b = true;
                long v4 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqhf)hftp0.b_message).c = v4;
                this.n(account0.name, ((gqhf)hftp0.N_build()));
            }
            fkty fkty0 = fktz.b(null);
            fkty0.c = v1;
            fktz2 = fkty0.a();
        }
        return fktz2;
    }

    public final gfsx e(Account account0, String s) {
        synchronized(this) {
            gqhc gqhc0 = this.g(account0.name);
            int v1 = gggq.a(DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b), new cbxy(s));
            if(v1 >= 0) {
                return gfsx.m(gqhc0.a(v1));
            }
        }
        return gfqx.a;
    }

    public final gfsx f(String s) {
        gfsx gfsx0;
        synchronized(this) {
            gqhv gqhv0 = ((gqhe)this.s(s).b_message).c;
            if(gqhv0 == null) {
                gqhv0 = gqhv.a;
            }
            gfsx0 = gfsx.m(gqhv0);
        }
        return gfsx0;
    }

    public final gqhc g(String s) {
        String s1 = cjpd.c(this.b(), s, null);
        if(s1 == null) {
            return (gqhc)((ProtoLiteMessage)gqhd.a).v_newBuilder();
        }
        try {
            byte[] arr_b = Base64.decode(s1, 0);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqhd.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqhd)hftv0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((gqhd)hftv0))));
            return (gqhc)hftp0;
        }
        catch(hfur unused_ex) {
            return (gqhc)((ProtoLiteMessage)gqhd.a).v_newBuilder();
        }
    }

    final List h() {
        List list0;
        synchronized(this) {
            gfsx gfsx0 = cbxc.b();
            list0 = ggia.b(cjpd.d(this.b()).keySet());
            if(!gfsx0.i()) {
                return list0;
            }
            list0.removeAll(new ggal(Arrays.asList(((Object[])gfsx0.d())), new cbya()));
        }
        return list0;
    }

    public final void i(Iterable iterable0) {
        try {
            ((glyq)gmbu.a(gggq.j(iterable0, new cbxv(this))).b(new cbxw(), gmap.a)).u();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new cjuh(14, "Scheduling a one time sync was interrupted", null, interruptedException0);
        }
        catch(ExecutionException executionException0) {
            throw new cjuh(8, "Error during scheduling a one time sync", null, executionException0);
        }
    }

    final void j(String s) {
        synchronized(this) {
            cjpa cjpa0 = this.b().c();
            cjpa0.j(s);
            cjpd.f(cjpa0);
        }
    }

    public final void k(Account account0, String s) {
        synchronized(this) {
            gqhc gqhc0 = this.g(account0.name);
            int v1 = gggq.a(DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b), new cbyc(s));
            if(v1 >= 0) {
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                gqhd gqhd0 = (gqhd)gqhc0.b_message;
                gqhd0.b();
                gqhd0.b.remove(v1);
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                ((gqhd)gqhc0.b_message).c = false;
                this.u(account0.name, ((gqhd)((ProtoLiteBuilder)gqhc0).N_build()));
            }
        }
    }

    public final void l(String s, String s1) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = this.s(s1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqhe)hftp0.b_message).c = null;
            ((gqhe)hftp0.b_message).b &= -2;
            this.o(s1, ((gqhe)hftp0.N_build()));
            this.v(s);
        }
    }

    public final void m(Account account0) {
        synchronized(this) {
            gqhc gqhc0 = this.g(account0.name);
            ArrayList arrayList0 = ggia.b(DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b));
            gggq.y(arrayList0, new cbyb());
            if(arrayList0.size() < ((gqhd)gqhc0.b_message).b.size()) {
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                ((gqhd)gqhc0.b_message).b = hfvv.a;
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                gqhd gqhd0 = (gqhd)gqhc0.b_message;
                gqhd0.b();
                hfrj.E(arrayList0, gqhd0.b);
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                ((gqhd)gqhc0.b_message).c = false;
                this.u(account0.name, ((gqhd)((ProtoLiteBuilder)gqhc0).N_build()));
            }
        }
    }

    public final void n(String s, gqhf gqhf0) {
        String s1 = Base64.encodeToString(gqhf0.toBytesArray(), 0);
        cjpa cjpa0 = this.b().c();
        cjpa0.h(s + "language_settings_storage_user_metadata", s1);
        cjpd.g(cjpa0);
    }

    public final void o(String s, gqhe gqhe0) {
        String s1 = Base64.encodeToString(gqhe0.toBytesArray(), 0);
        cjpa cjpa0 = this.b().c();
        cjpa0.h(s, s1);
        cjpd.g(cjpa0);
    }

    public final void p(Account account0, gqhv gqhv0) {
        synchronized(this) {
            gqhc gqhc0 = this.g(account0.name);
            int v1 = gggq.a(DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b), new cbxx(gqhv0));
            if(v1 >= 0) {
                if(!cbyf.w(gqhv0, gqhc0.a(v1))) {
                    if(!gqhc0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gqhc0).ensureMutable();
                    }
                    gqhd gqhd0 = (gqhd)gqhc0.b_message;
                    gqhv0.getClass();
                    gqhd0.b();
                    gqhd0.b.set(v1, gqhv0);
                    goto label_21;
                }
                return;
            }
            else {
                if(!gqhc0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gqhc0).ensureMutable();
                }
                gqhd gqhd1 = (gqhd)gqhc0.b_message;
                gqhv0.getClass();
                gqhd1.b();
                gqhd1.b.add(gqhv0);
            }
        label_21:
            if(!gqhc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gqhc0).ensureMutable();
            }
            ((gqhd)gqhc0.b_message).c = false;
            this.u(account0.name, ((gqhd)((ProtoLiteBuilder)gqhc0).N_build()));
        }
    }

    public final void q(String s, gqhv gqhv0, String s1) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = this.s(s1);
            gqhv gqhv1 = ((gqhe)hftp0.b_message).c;
            if(gqhv1 == null) {
                gqhv1 = gqhv.a;
            }
            if(!cbyf.w(gqhv0, gqhv1)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqhe gqhe0 = (gqhe)hftp0.b_message;
                gqhv0.getClass();
                gqhe0.c = gqhv0;
                gqhe0.b |= 1;
                this.o(s1, ((gqhe)hftp0.N_build()));
                this.v(s);
            }
        }
    }

    final void r() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        List list0 = this.h();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = (String)object0;
            try {
                ((ggtj)cbyf.a.h()).x("Remove language settings of deleted account.");
                this.j(s);
            }
            catch(Exception exception0) {
                arrayList0.add(exception0);
            }
        }
        if(arrayList0.isEmpty()) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw cbxg.a("Exception while wiping out data for deleted accounts", arrayList0);
    }

    public final ProtoLiteBuilder s(String s) {
        String s1 = cjpd.c(this.b(), s, null);
        if(s1 == null) {
            return ((ProtoLiteMessage)gqhe.a).v_newBuilder();
        }
        try {
            byte[] arr_b = Base64.decode(s1, 0);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqhe.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqhe)hftv0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((gqhe)hftv0))));
            return hftp0;
        }
        catch(hfur unused_ex) {
            return ((ProtoLiteMessage)gqhe.a).v_newBuilder();
        }
    }

    public final void t(Account account0) {
        synchronized(this) {
            gged_interceptors.i(DesugarCollections.unmodifiableList(((gqhd)this.g(account0.name).b_message).b));
        }
    }

    private final void u(String s, gqhd gqhd0) {
        String s1 = Base64.encodeToString(gqhd0.toBytesArray(), 0);
        cjpa cjpa0 = this.b().c();
        cjpa0.h(s, s1);
        cjpd.f(cjpa0);
    }

    private final void v(String s) {
        synchronized(this) {
            if(s != null) {
                ProtoLiteBuilder hftp0 = this.x(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqhf)hftp0.b_message).b = false;
                this.n(s, ((gqhf)hftp0.N_build()));
                return;
            }
            gfsx gfsx0 = cbxc.b();
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                for(int v1 = 0; v1 < ((Account[])object0).length; ++v1) {
                    Account account0 = ((Account[])object0)[v1];
                    ProtoLiteBuilder hftp1 = this.x(account0.name);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gqhf)hftp1.b_message).b = false;
                    this.n(account0.name, ((gqhf)hftp1.N_build()));
                }
            }
        }
    }

    private static boolean w(gqhv gqhv0, gqhv gqhv1) {
        if(gqhv0 == null && gqhv1 == null) {
            return true;
        }
        if(gqhv0 != null && gqhv1 != null) {
            if(!((ProtoLiteMessage)gqhv0).equals(gqhv1)) {
                if(gqhv0.b.size() == gqhv1.b.size()) {
                    for(int v = 0; v < gqhv0.b.size(); ++v) {
                        if(!TextUtils.equals(((String)gqhv0.b.get(v)), ((String)gqhv1.b.get(v)))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private final ProtoLiteBuilder x(String s) {
        String s1 = cjpd.c(this.b(), s + "language_settings_storage_user_metadata", null);
        if(s1 == null) {
            return ((ProtoLiteMessage)gqhf.a).v_newBuilder();
        }
        try {
            byte[] arr_b = Base64.decode(s1, 0);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqhf.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqhf)hftv0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((gqhf)hftv0))));
            return hftp0;
        }
        catch(hfur unused_ex) {
            return ((ProtoLiteMessage)gqhf.a).v_newBuilder();
        }
    }
}

