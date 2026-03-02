import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import j..util.Map.-EL;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

public final class eiln implements eilo {
    private final Executor a;
    private final ehul b;
    private final eicb c;
    private final HashMap d;

    public eiln(ehul ehul0, Executor executor0) {
        this.d = new HashMap();
        this.b = ehul0;
        this.a = executor0;
        this.c = eicb.a(AppContextProvider.a());
    }

    static boolean a(gwhg gwhg0) {
        if(gwhg0 == null) {
            return false;
        }
        return (gwhg0.b & 16) == 0 ? eiln.b(gwhg0.d, gwhg0.e, gwhg0.f, null) : eiln.b(gwhg0.d, gwhg0.e, gwhg0.f, Boolean.valueOf(gwhg0.g));
    }

    public static boolean b(String s, String s1, String s2, Boolean boolean0) {
        return !gfta.c(s) && !gfta.c(s1) && !gfta.c(s2) && boolean0 != null;
    }

    private final void c(String s, gwni gwni0) {
        eill eill0 = new eill();
        HashMap hashMap0 = this.d;
        if(!((HashSet)Map.-EL.computeIfAbsent(hashMap0, gwni0, eill0)).contains(s)) {
            this.c.g(gwni0);
            HashSet hashSet0 = (HashSet)hashMap0.get(gwni0);
            gftb.check(hashSet0);
            hashSet0.add(s);
        }
    }

    @Override  // eilo
    public final int d(gwha gwha0) {
        gwhg gwhg0 = gwha0.i == null ? gwhg.a : gwha0.i;
        if(Objects.equals(Boolean.valueOf(gwhg0.g), Boolean.valueOf(true))) {
            this.c(gwha0.c, gwni.d);
            return 2;
        }
        if(!eiln.a(gwhg0)) {
            this.c(gwha0.c, gwni.f);
            if(hrtd.au()) {
                this.c(gwha0.c, gwni.h);
                return 3;
            }
        }
        return 1;
    }

    @Override  // eilo
    public final void e(gwhj gwhj0, eilp eilp0) {
        eice.c(gwhj0.d);
        ehul ehul0 = this.b == null ? ehul.a(AppContextProvider.a()) : this.b;
        if(ehul0 == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gwhm)hftp0.b_message).c = 3;
            ((gwhm)hftp0.b_message).b |= 1;
            eilp0.a(((gwhm)hftp0.N_build()));
            return;
        }
        gwhb gwhb0 = gwhj0.c == null ? gwhb.a : gwhj0.c;
        gmbu.t(ehul0.b(gwhj0.d, (gwhb0.b == 1 ? ((ByteString)gwhb0.c) : ByteString.b)), new eilm(this, gwhj0, eilp0), this.a);
    }

    @Override  // eilo
    public final int f(gwha gwha0, gwgx gwgx0) {
        int v = gwha0.h;
        String s = gwha0.c;
        int v1 = s.length();
        boolean z = false;
        int v2 = 0;
        while(v2 < v1) {
            int v3 = s.codePointAt(v2);
            if(Character.isWhitespace(v3)) {
                v2 += Character.charCount(v3);
                continue;
            }
            z = true;
            goto label_14;
        }
        if(!gwgx0.j.isEmpty()) {
            z = true;
        }
    label_14:
        if(v == 5 && z) {
            return eiln.a((gwha0.i == null ? gwhg.a : gwha0.i)) ? 2 : 3;
        }
        return 1;
    }
}

