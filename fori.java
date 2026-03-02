import android.app.Activity;
import android.os.Handler;
import j..util.Objects;

final class fori extends forj {
    final fork a;

    public fori(fork fork0) {
        Objects.requireNonNull(fork0);
        this.a = fork0;
        super();
    }

    @Override  // forj
    public final void onActivityPaused(Activity activity0) {
        fork fork0 = this.a;
        int v = fork0.b - 1;
        fork0.b = v;
        if(v == 0) {
            fork0.h = fokg.b(activity0.getClass());
            Handler handler0 = fork0.e;
            gfuy.e(handler0);
            gfuy.e(fork0.f);
            handler0.postDelayed(fork0.f, 700L);
        }
    }

    @Override  // forj
    public final void onActivityResumed(Activity activity0) {
        fork fork0 = this.a;
        int v = fork0.b + 1;
        fork0.b = v;
        if(v == 1) {
            if(fork0.c) {
                for(Object object0: fork0.g) {
                    ((foql)object0).l(fokg.b(activity0.getClass()));
                }
                fork0.c = false;
                return;
            }
            Handler handler0 = fork0.e;
            gfuy.e(handler0);
            gfuy.e(fork0.f);
            handler0.removeCallbacks(fork0.f);
        }
    }

    @Override  // forj
    public final void onActivityStarted(Activity activity0) {
        fork fork0 = this.a;
        int v = fork0.a + 1;
        fork0.a = v;
        if(v == 1 && fork0.d) {
            for(Object object0: fork0.g) {
                foql foql0 = (foql)object0;
                fokg.b(activity0.getClass());
            }
            fork0.d = false;
        }
    }

    @Override  // forj
    public final void onActivityStopped(Activity activity0) {
        --this.a.a;
        fokg.b(activity0.getClass());
        this.a.a();
    }
}

