import java.util.concurrent.atomic.AtomicBoolean;

public final class feal implements febm {
    public final febn a;
    private final AtomicBoolean b;
    private final fdzm c;

    public feal(febn febn0, fdzm fdzm0) {
        this.b = new AtomicBoolean(false);
        this.a = febn0;
        this.c = fdzm0;
    }

    public final void a() {
        ffmn.d("AsyncAcctMatchCtr", "cancelMatching()", new Object[0]);
        if(!this.b.compareAndSet(false, true)) {
            ffmn.d("AsyncAcctMatchCtr", "cannot cancel, matching was already completed", new Object[0]);
            return;
        }
        this.a.c();
    }

    @Override  // febm
    public final void b(fean fean0) {
        fean fean1 = fean0 == null ? "null" : fean0;
        ffmn.d("AsyncAcctMatchCtr", "onAccountMatchAbort(%s)", new Object[]{fean1});
        if(!this.b.compareAndSet(false, true)) {
            ffmn.f("AsyncAcctMatchCtr", "Ignoring service onAccountMatchAbort(), matching was already completed", new Object[0]);
            return;
        }
        ffmn.g("Wear_Transport", fean0, "Account match failed", new Object[0]);
        this.c.d.w.b(-2, this.c.a.c);
        this.c.d.a(this.c.a, true);
        this.c.c.set(false);
    }

    @Override  // febm
    public final void c() {
        ffmn.d("AsyncAcctMatchCtr", "onAccountMatchComplete()", new Object[0]);
        if(!this.b.compareAndSet(false, true)) {
            ffmn.f("AsyncAcctMatchCtr", "Ignoring service onAccountMatchComplete(), matching was already completed", new Object[0]);
            return;
        }
        fdzm fdzm0 = this.c;
        ffmn.a("Wear_Transport", "onAccountMatchComplete()", new Object[0]);
        fdzv fdzv0 = fdzm0.d;
        if(fdzv0.c) {
            fdzv0.s.a(0L, 1L, ayvf.b);
        }
        else {
            fdzv0.t.a(0L, 1L, ayvf.b);
        }
        try {
            fdzv0.h("async account matching");
        }
        catch(fdzq fdzq0) {
            ffmn.g("Wear_Transport", fdzq0, "Connection was cancelled during account match, despite match completing OK.", new Object[0]);
            return;
        }
        fdzv fdzv1 = fdzm0.d;
        fczq fczq0 = fdzm0.a;
        fczt fczt0 = fdzv1.w;
        fczt0.b(5, fczq0.c);
        if(fdzv1.c) {
            fdvl fdvl0 = fdvl.m();
            gftb.check(fdvl0);
            if(!fdvl0.Y(ffem.c(fdzv1.i), fczq0.j)) {
                ffmn.b("Wear_Transport", "Couldn\'t prepare watch to migrate! Aborting.", new Object[0]);
                fdzv1.f(fczq0, true);
            }
        }
        ffmn.a("Wear_Transport", "Attempting to complete migration for %s", new Object[]{fczq0});
        fdzv1.k(fczq0, fdzm0.b);
        fczt0.b(0, fczq0.c);
        fdzv1.j(fczq0.j);
        fdzm0.c.set(false);
    }

    @Override  // febm
    public final void d() {
        ffmn.a("AsyncAcctMatchCtr", "onAccountMatchStart()", new Object[0]);
    }

    public final boolean e() {
        return this.b.get();
    }
}

