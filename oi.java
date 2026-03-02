import android.view.View;

final class oi implements Runnable {
    final oo a;
    private final ol b;

    public oi(oo oo0, ol ol0) {
        this.a = oo0;
        super();
        this.b = ol0;
    }

    @Override
    public final void run() {
        oo oo0 = this.a;
        na na0 = oo0.c;
        if(na0 != null) {
            my my0 = na0.b;
            if(my0 != null) {
                my0.Q(na0);
            }
        }
        View view0 = (View)oo0.f;
        if(view0 != null && view0.getWindowToken() != null) {
            ol ol0 = this.b;
            if(ol0.i()) {
                oo0.l = ol0;
            }
        }
        oo0.n = null;
    }
}

