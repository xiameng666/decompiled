import android.view.MenuItem;

public final class mr implements Runnable {
    final mt a;
    final MenuItem b;
    final na c;
    final ms d;

    public mr(ms ms0, mt mt0, MenuItem menuItem0, na na0) {
        this.d = ms0;
        this.a = mt0;
        this.b = menuItem0;
        this.c = na0;
        super();
    }

    @Override
    public final void run() {
        mt mt0 = this.a;
        if(mt0 != null) {
            this.d.a.f = true;
            mt0.b.i(false);
            this.d.a.f = false;
        }
        MenuItem menuItem0 = this.b;
        if(menuItem0.isEnabled() && menuItem0.hasSubMenu()) {
            this.c.B(menuItem0, 4);
        }
    }
}

