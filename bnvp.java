import android.accounts.Account;
import com.google.android.gms.common.Feature;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

final class bnvp implements bnvk {
    public static final bboh a;
    private final Object b;
    private gmcd c;
    private final String d;
    private final bnxi e;
    private final Account f;
    private final gmch g;
    private final azts h;

    static {
        bnvp.a = bboh.b("KeychainClient", bbcu.eD);
    }

    public bnvp(String s, bnxi bnxi0, azts azts0, Account account0, gmch gmch0) {
        this.b = new Object();
        this.d = s;
        this.e = bnxi0;
        this.h = azts0;
        this.f = account0;
        this.g = gmch0;
    }

    @Override  // bnvk
    public final bnxi a() {
        return this.e;
    }

    @Override  // bnvk
    public final gmcd b() {
        String s = this.f.name;
        azzc azzc0 = new azzc();
        azzc0.a = new ajud(this.h, s);
        azzc0.c = new Feature[]{amjz.h};
        azzc0.d = 0x68F;
        azzd azzd0 = azzc0.a();
        return this.o(this.h.iG(azzd0), "addGaiaPasswordMember");
    }

    @Override  // bnvk
    public final gmcd c() {
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        gmcd gmcd0 = this.c;
        if(gmcd0 == null) {
            FIN.finallyCodeBegin$NT(v);
            return this.n();
        }
        if(!gmcd0.isDone()) {
            FIN.finallyExec$NT(v);
            return this.c;
        }
        try {
            gmcd gmcd1 = gmbu.i(((Boolean)gmbu.r(this.c)));
            FIN.finallyExec$NT(v);
            return gmcd1;
        }
        catch(ExecutionException unused_ex) {
            FIN.finallyExec$NT(v);
            return this.n();
        }
    }

    @Override  // bnvk
    public final gmcd d() {
        return this.o(this.h.jw(this.f.name), "getConsent");
    }

    @Override  // bnvk
    public final gmcd e() {
        String s = this.f.name;
        azzc azzc0 = new azzc();
        azzc0.a = new ajuu(this.h, s);
        azzc0.c = new Feature[]{amjz.f};
        azzc0.d = 0x67D;
        azzd azzd0 = azzc0.a();
        return gdta.g(this.o(this.h.iG(azzd0), "getDomainMembersStatus")).h(new bnvn(), gmap.a);
    }

    @Override  // bnvk
    public final gmcd f() {
        return this.o(this.h.jx(this.f.name), "getKeyMaterial");
    }

    @Override  // bnvk
    public final gmcd g() {
        return gdta.g(this.o(this.h.jy(this.f.name), "getSyncStatus")).h(new bnvo(), gmap.a);
    }

    @Override  // bnvk
    public final gmcd h() {
        return this.o(this.h.jA(this.f.name), "markLocalKeysAsStale");
    }

    @Override  // bnvk
    public final gmcd i() {
        String s = this.f.name;
        azzc azzc0 = new azzc();
        azzc0.a = new ajut(this.h, s);
        azzc0.c = new Feature[]{amjz.f};
        azzc0.d = 0x67A;
        azzd azzd0 = azzc0.a();
        return this.o(this.h.iG(azzd0), "resetDomain");
    }

    @Override  // bnvk
    public final gmcd j(boolean z) {
        return this.o(this.h.jC(this.f.name, z), "setConsent");
    }

    @Override  // bnvk
    public final gmcd k() {
        gftb.q(this.e.equals(bnxi.a));
        return this.o(this.h.jE(this.f.name, 4), "startEnrollmentFlow");
    }

    @Override  // bnvk
    public final String l() {
        return this.d;
    }

    @Override  // bnvk
    public final boolean m() {
        return bnvh.a(this);
    }

    private final gmcd n() {
        gmcd gmcd0;
        synchronized(this.b) {
            String s = this.f.name;
            azzc azzc0 = new azzc();
            azzc0.a = new ajue(this.h, s);
            azzc0.c = new Feature[]{amjz.h};
            azzc0.d = 0x68E;
            azzd azzd0 = azzc0.a();
            gmcd0 = this.o(this.h.iG(azzd0), "canSilentlyAddGaiaPassword");
            this.c = gmcd0;
        }
        return gmcd0;
    }

    private final gmcd o(evql evql0, String s) {
        Class class0 = this.getClass();
        gmcd gmcd0 = fhra.b(evql0);
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        return gmbu.q(new ghlu(gmcd0, class0.getSimpleName() + "." + s), 60L, timeUnit0, this.g);
    }
}

