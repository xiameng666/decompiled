import android.window.OnBackInvokedDispatcher;

public final class abc {
    public final Runnable a;
    private final ibnn b;
    private final ibnn c;

    public abc() {
        this(null);
    }

    public abc(Runnable runnable0) {
        this.a = runnable0;
        this.b = new ibnz(new aax(this));
        this.c = new ibnz(new aay(this));
    }

    public final nzc a() {
        return (nzc)this.b.a();
    }

    public final void b(aaw aaw0) {
        nzc.b(this.a(), aaw0.e());
    }

    public final void c(lps lps0, aaw aaw0) {
        ibuq.f(lps0, "owner");
        ibuq.f(aaw0, "onBackPressedCallback");
        lpg lpg0 = lps0.getLifecycle();
        if(lpg0.a() == lpf.a) {
            return;
        }
        abb abb0 = new abb(aaw0, this, lpg0);
        lpg0.c(abb0);
        aaw0.c.add(abb0);
    }

    public final void d() {
        ((nzg)this.c.a()).a();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        ibuq.f(onBackInvokedDispatcher0, "invoker");
        nzp nzp0 = new nzp(onBackInvokedDispatcher0);
        this.a().a(nzp0);
    }
}

