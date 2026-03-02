import java.io.InputStream;

public final class arpm implements Runnable {
    public final arpn a;
    public final InputStream b;
    public final long c;
    public final arli d;

    public arpm(arpn arpn0, InputStream inputStream0, long v, arli arli0) {
        this.a = arpn0;
        this.b = inputStream0;
        this.c = v;
        this.d = arli0;
    }

    @Override
    public final void run() {
        this.a.e.j(this.b, this.c, this.d);
    }
}

