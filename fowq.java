import android.app.Activity;

public final class fowq implements Runnable {
    public final fowr a;
    public final gfsx b;

    public fowq(fowr fowr0, gfsx gfsx0) {
        this.a = fowr0;
        this.b = gfsx0;
    }

    @Override
    public final void run() {
        if(this.b.i() && !((Boolean)((ibnf)this.b.d()).get()).booleanValue()) {
            return;
        }
        fowr fowr0 = this.a;
        synchronized(fowr0) {
            fowr0.a = true;
            Activity activity0 = fowr0.b;
            if(activity0 != null) {
                fowr0.c(activity0);
            }
            fowr0.b = null;
        }
    }
}

