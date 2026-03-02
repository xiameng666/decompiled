import java.io.PrintWriter;

public class fvwx {
    public final int e;
    public final int f;
    public final int g;
    public final Object h;
    final long i;
    final String j;
    public final int k;

    public fvwx(int v, long v1) {
        this(v, v1, null, null, -1, -1, -1);
    }

    public fvwx(int v, long v1, int v2) {
        this(v, v1, null, null, v2, -1, -1);
    }

    public fvwx(int v, long v1, int v2, int v3) {
        this(v, v1, null, null, v2, v3, -1);
    }

    public fvwx(int v, long v1, int v2, int v3, int v4) {
        this(v, v1, null, null, v2, v3, v4);
    }

    public fvwx(int v, long v1, String s, int v2) {
        this(v, v1, s, null, v2, -1, -1);
    }

    public fvwx(int v, long v1, String s, int v2, int v3) {
        this(v, v1, s, null, v2, v3, -1);
    }

    public fvwx(int v, long v1, String s, Object object0, int v2, int v3, int v4) {
        this.k = v;
        this.i = v1;
        this.h = object0;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.j = s;
    }

    protected void a(PrintWriter printWriter0) {
        String s = this.j;
        if(s != null) {
            printWriter0.print(String.format(s, (this.h == null ? "" : this.h.toString()), ((int)this.e), ((int)this.f), ((int)this.g)));
        }
    }
}

