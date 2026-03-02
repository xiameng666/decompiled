import android.os.Handler;

public final class fvlo implements Runnable {
    public final fvls a;
    public final fvnn b;
    public final Handler c;

    public fvlo(fvls fvls0, fvnn fvnn0, Handler handler0) {
        this.a = fvls0;
        this.b = fvnn0;
        this.c = handler0;
    }

    @Override
    public final void run() {
        fvls fvls0 = this.a;
        if(!fvls0.c) {
            this.b.y();
            this.c.sendEmptyMessage(2);
            fvls0.c = true;
        }
    }
}

