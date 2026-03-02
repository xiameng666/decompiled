import com.android.volley.Request;
import j..util.Objects;

public final class spt implements Runnable {
    final String a;
    final long b;
    final Request c;

    public spt(Request request0, String s, long v) {
        this.a = s;
        this.b = v;
        Objects.requireNonNull(request0);
        this.c = request0;
        super();
    }

    @Override
    public final void run() {
        this.c.a.a(this.a, this.b);
        this.c.a.b(this.c.toString());
    }
}

