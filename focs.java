import android.view.View;

public final class focs implements Runnable {
    public final foct a;
    public final View b;
    public final int c;
    public final Object d;

    public focs(foct foct0, View view0, int v, Object object0) {
        this.a = foct0;
        this.b = view0;
        this.c = v;
        this.d = object0;
    }

    @Override
    public final void run() {
        this.a.c.a.b(this.b, this.c, this.d);
    }
}

