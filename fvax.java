import android.location.Location;

public final class fvax implements Runnable {
    public final fvay a;
    public final Runnable b;
    public final Location c;
    public final Runnable d;

    public fvax(fvay fvay0, Runnable runnable0, Location location0, Runnable runnable1) {
        this.a = fvay0;
        this.b = runnable0;
        this.c = location0;
        this.d = runnable1;
    }

    @Override
    public final void run() {
        fvbb fvbb0 = this.a.d;
        if(!fvbb0.l) {
            return;
        }
        this.b.run();
        fvbb0.j = this.c;
        this.d.run();
    }
}

