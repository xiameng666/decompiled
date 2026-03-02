import java.io.PrintWriter;
import java.text.Format;
import java.util.Date;
import java.util.Queue;

public class fvwz {
    private final Queue a;
    protected final fvxb b;
    private final fvwx[] c;

    public fvwz(fvxb fvxb0, int v) {
        this.c = new fvwx[0x98];
        this.b = fvxb0;
        this.a = new ggca(v);
    }

    public void a(fvwx fvwx0) {
        synchronized(this) {
            this.c[fvwx0.k - 1] = fvwx0;
            this.a.add(fvwx0);
        }
    }

    public void c(Format format0, long v, PrintWriter printWriter0) {
        long v1 = this.b.a();
        printWriter0.println(a.u(v1, "elapsedRealtime "));
        printWriter0.flush();
        Date date0 = new Date(0L);
        synchronized(this) {
            for(Object object0: this.a) {
                fvwx fvwx0 = (fvwx)object0;
                long v3 = fvwx0.i;
                if(v3 >= v1 - 600000L) {
                    date0.setTime(v);
                    date0.setTime(date0.getTime() + v3);
                    printWriter0.print(format0.format(date0));
                    printWriter0.print(' ');
                    printWriter0.print('@');
                    printWriter0.print(v3);
                    printWriter0.print(' ');
                    printWriter0.print(fvxa.a(fvwx0.k));
                    printWriter0.print(' ');
                    fvwx0.a(printWriter0);
                    printWriter0.print('\n');
                }
            }
        }
        printWriter0.flush();
    }

    public final long f() {
        return this.b.a();
    }

    public final void g(int v) {
        this.a(new fvwx(v, this.b.a()));
    }

    public final void h(int v, int v1) {
        this.a(new fvwx(v, this.b.a(), v1));
    }

    public final void i(int v, int v1, int v2) {
        this.a(new fvwx(v, this.b.a(), v1, v2));
    }

    public final void j(int v, String s, int v1) {
        this.a(new fvwx(v, this.b.a(), s, v1));
    }

    public final void k(int v, int v1, int v2, int v3) {
        this.a(new fvwx(v, this.b.a(), null, null, v1, v2, v3));
    }

    public final void l(String s, int v) {
        this.a(new fvwx(3, this.b.a(), null, s, v, -1, -1));
    }
}

