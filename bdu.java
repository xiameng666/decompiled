import android.view.Surface;

public final class bdu implements Runnable {
    public final kar a;
    public final Surface b;

    public bdu(kar kar0, Surface surface0) {
        this.a = kar0;
        this.b = surface0;
    }

    @Override
    public final void run() {
        bei bei0 = new bei(2, this.b);
        this.a.accept(bei0);
    }
}

