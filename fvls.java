import android.os.Handler;

public final class fvls extends clht {
    public final fvnn a;
    public boolean c;
    final Runnable d;

    public fvls(fvnn fvnn0, Handler handler0) {
        this.c = false;
        this.a = fvnn0;
        this.d = new fvlo(this, fvnn0, handler0);
    }

    final void b() {
        this.post(this.d);
    }
}

