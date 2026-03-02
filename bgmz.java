public final class bgmz implements lpr {
    private final xnb a;

    public bgmz(xnb xnb0, du du0) {
        ibuq.f(du0, "fragment");
        super();
        this.a = xnb0;
        du0.getLifecycle().c(new bgmy(this));
    }

    public final void a(boolean z) {
        xnb xnb0 = this.a;
        if(z) {
            xnb0.getWindow().setFlags(0x2000, 0x2000);
            return;
        }
        xnb0.getWindow().clearFlags(0x2000);
    }
}

