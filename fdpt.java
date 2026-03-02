import android.util.Log;

public final class fdpt implements Runnable {
    public final fdpq a;
    public final ffau b;

    public fdpt(fdpq fdpq0, ffau ffau0) {
        this.a = fdpq0;
        this.b = ffau0;
    }

    @Override
    public final void run() {
        String s = (this.b.d == null ? fexa.a : this.b.d).c;
        if(Log.isLoggable("assets", 2)) {
            Log.v("assets", "acked asset, digest=" + s);
        }
        this.a.a.remove(s);
        fdpy.k(3, ggnj.a, null);
    }
}

