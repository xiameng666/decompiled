import j..util.Objects;

public final class fvxj {
    public final fvxn_FusionEngine a;

    public fvxj(fvxn_FusionEngine fvxn0) {
        Objects.requireNonNull(fvxn0);
        this.a = fvxn0;
        super();
    }

    public final void a(TimeRange ggmr0) {
        this.a.n_deepblueHandler.f_timeRange = ggmr0;
    }

    public final void b(long v, gptu_Position gptu0) {
        fvxn_FusionEngine fvxn0 = this.a;
        switch(fvxn0.A) {
            case 0: {
                throw null;
            }
            case 2: {
                fvxn0.n_deepblueHandler.d(v, gptu0);
            }
        }
    }
}

