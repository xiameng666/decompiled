import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;

public final class ehek implements ehdm {
    private final efyu a;
    private final Account b;
    private final efur c;
    private gjgi d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ehek(Context context0, Account account0, efur efur0) {
        this.d = gjgi.a;
        this.i = 2;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        efol efol0 = new efol();
        efol0.a = 80;
        this.a = new egbh(context0, efol0.a());
        this.b = account0;
        this.c = efur0;
    }

    @Override  // ehdm
    public final void a(boolean z) {
        ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus((z ? 1 : 2), (z ? "Sync succeeded." : "Sync completed with error."), 0L, -1, 0, 0, 2, -1, -1);
        this.a.b(extendedSyncStatus0, this.b);
        this.c.J(this.b.name, extendedSyncStatus0);
    }

    @Override  // ehdm
    public final void b() {
        gjgi gjgi0 = this.d;
        if(gjgi0 == gjgi.b) {
            this.h = this.f;
            this.g = this.e;
        }
        if(ehek.i(this.i, gjgi0) && (!hxdl.d() || this.e > 0)) {
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(7, "Sync is active. One stage completed.", 0L, this.f, ehek.g(this.i), ehek.f(this.d), 2, this.f, this.e);
            this.a.b(extendedSyncStatus0, this.b);
            this.c.J(this.b.name, extendedSyncStatus0);
        }
        this.e = -1;
        this.f = -1;
    }

    @Override  // ehdm
    public final void c(int v, boolean z) {
        if(z) {
            this.f = v;
        }
        else {
            this.f += v;
        }
        if(ehek.i(this.i, this.d) && hxdl.a.b().h() && this.d == gjgi.b) {
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(8, "Sync is active. One stage progressed.", 0L, this.f, ehek.g(this.i), ehek.f(this.d), 2, this.f, this.e);
            this.a.b(extendedSyncStatus0, this.b);
            this.c.J(this.b.name, extendedSyncStatus0);
        }
    }

    @Override  // ehdm
    public final void d(int v, boolean z) {
        if(v == 3 && hxdl.f() || v == 1 && hxdl.c()) {
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus((z ? 1 : 2), (z ? "Sync succeeded." : "Sync completed with error."), 0L, -1, ehek.g(v), 0, 2, this.h, this.g);
            this.a.b(extendedSyncStatus0, this.b);
            this.c.J(this.b.name, extendedSyncStatus0);
        }
    }

    @Override  // ehdm
    public final void e(int v, gjgi gjgi0, int v1) {
        this.i = v;
        this.d = gjgi0;
        this.e = v1;
        this.f = 0;
        if(gjgi0 != gjgi.b) {
            v1 = 0;
        }
        this.g = v1;
        this.h = 0;
        if(ehek.i(v, gjgi0) && (!hxdl.d() || this.e > 0)) {
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(3, "Sync is active.", 0L, this.e, ehek.g(v), ehek.f(gjgi0), 2, 0, this.e);
            this.a.b(extendedSyncStatus0, this.b);
            this.c.J(this.b.name, extendedSyncStatus0);
        }
    }

    private static int f(gjgi gjgi0) {
        int v = gjgi0.ordinal();
        return v == 1 || v == 2 || v == 3 ? 1 : 0;
    }

    private static int g(int v) {
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return 2;
                }
                case 1: {
                    return 3;
                }
                default: {
                    return 1;
                }
            }
        }
        throw null;
    }

    private static boolean h(int v, gjgi gjgi0) {
        switch(gjgi0.ordinal()) {
            case 1: {
                return hxdl.a.b().b();
            }
            case 2: {
                return false;
            }
            case 3: {
                return v == 1 ? hxdl.a.b().e() : v == 3 && hxdl.a.b().l();
            }
            default: {
                return false;
            }
        }
    }

    private static boolean i(int v, gjgi gjgi0) {
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return hxdl.c() && ehek.h(1, gjgi0);
                }
                case 1: {
                    return false;
                }
                default: {
                    return hxdl.f() && ehek.h(v, gjgi0);
                }
            }
        }
        throw null;
    }
}

