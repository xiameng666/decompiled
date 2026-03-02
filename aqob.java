import android.accounts.Account;
import android.content.Context;
import j..util.Objects;

public final class aqob implements aqox {
    public static final baun a;
    public final aqpk b;
    public final aqpa c;
    public final aqnm d;
    private static final ggfp e;
    private final aqee f;

    static {
        aqob.e = ggfp.M(iapk.f, iapk.q, iapk.p, iapk.d);
        aqob.a = aqql.a("GoogleOneBackupGrpcService");
    }

    public aqob(Context context0) {
        this.d = new aqnm(hqje.a.m().u());
        this.f = new aqee(context0);
        if(aqoy.a == null) {
            aqoy.a = new aqpk(new bbfe_BaseGrpcServer(context0, hqje.o(), 443, context0.getApplicationInfo().uid, 1040));
        }
        this.b = aqoy.a;
        aqoz aqoz0 = new aqoz();
        aqoz0.c(hqje.d());
        aqoz0.b(hqje.c());
        aqoz0.d(hqje.b());
        aqoz0.a = new aqnn();
        aqoz0.e(aqob.e);
        this.c = aqoz0.a();
    }

    public final Account a() {
        Account account0 = this.f.a();
        if(account0 != null) {
            return account0;
        }
        throw new aqyb();
    }

    @Override  // aqox
    public final hisf b(hisk hisk0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#createBackup grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckan.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqnw aqnw0 = new aqnw(aqpk0);
        return (hisf)this.c.a(baqr0, hisk0, aqnw0);
    }

    @Override  // aqox
    public final hisf c(hisq hisq0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#getBackup grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckas.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqnz aqnz0 = new aqnz(aqpk0);
        return (hisf)this.c.a(baqr0, hisq0, aqnz0);
    }

    @Override  // aqox
    public final hisu d(hiss hiss0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#listBackups grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckau.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqoa aqoa0 = new aqoa(aqpk0);
        return (hisu)this.c.a(baqr0, hiss0, aqoa0);
    }

    @Override  // aqox
    public final hisw e(hisv hisv0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#listFiles grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckav.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqnu aqnu0 = new aqnu(aqpk0);
        return (hisw)this.c.a(baqr0, hisv0, aqnu0);
    }

    @Override  // aqox
    public final hisy f(hisx hisx0) {
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(this.b);
        aqnt aqnt0 = new aqnt(this.b);
        return (hisy)this.c.a(baqr0, hisx0, aqnt0);
    }

    @Override  // aqox
    public final void g(hisi hisi0) {
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(this.b);
        aqnr aqnr0 = new aqnr(this.b);
        this.c.a(baqr0, hisi0, aqnr0);
    }

    @Override  // aqox
    public final void h(hism hism0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#deleteBackup grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckao.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqns aqns0 = new aqns(aqpk0);
        this.c.a(baqr0, hism0, aqns0);
    }

    @Override  // aqox
    public final void i(hisn hisn0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#deleteFile grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckaq.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqnq aqnq0 = new aqnq(aqpk0);
        this.c.a(baqr0, hisn0, aqnq0);
    }

    @Override  // aqox
    public final void j(hiso hiso0) {
        aqob.a.h("Calling GoogleOneBackupServiceGrpc#deleteFiles grpc withOption", new Object[0]);
        aqpk aqpk0 = new aqpk(this.b, cmlp.a, ckar.b);
        Account account0 = this.a();
        baqr baqr0 = this.d.a(account0);
        Objects.requireNonNull(aqpk0);
        aqny aqny0 = new aqny(aqpk0);
        this.c.a(baqr0, hiso0, aqny0);
    }
}

