import android.view.Surface;

public final class bdv implements Runnable {
    public final kar a;
    public final Surface b;

    public bdv(kar kar0, Surface surface0) {
        this.a = kar0;
        this.b = surface0;
    }

    @Override
    public final void run() {
        bei bei0 = new bei(3, this.b);
        this.a.accept(bei0);
    }
}

