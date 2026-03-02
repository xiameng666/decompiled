import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public abstract class czlg implements Closeable {
    public final String a;
    public int b;
    public final int c;
    public final Set d;
    public final Set e;
    public int f;
    public int g;
    private final Set h;

    public czlg(String s) {
        this(s, 0);
    }

    public czlg(String s, int v) {
        this(s, 1, 1, 0, v);
    }

    public czlg(String s, int v, int v1, int v2, int v3) {
        this.d = new bxf();
        this.h = new bxf();
        this.e = new bxf();
        this.a = s;
        this.f = v;
        this.g = v1;
        this.b = v2;
        this.c = v3;
    }

    public abstract int a();

    public int b() {
        return -1;
    }

    public int c() {
        return -1;
    }

    @Override
    public final void close() {
        try {
            bxe bxe0 = new bxe(((bxf)this.d));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                cunf cunf0 = czkq.a;
                cunf0.b().p("Attempting to exit accessory mode", new Object[0]);
                if(czxj.l(((czxd)object0).a, "", "")) {
                    cunf0.b().p("Successfully exited accessory mode", new Object[0]);
                }
                else {
                    cunf0.b().p("Failed to exit accessory mode", new Object[0]);
                }
            }
            this.h();
        }
        finally {
            bxe bxe1 = new bxe(((bxf)this.h));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                ((czlf)object1).a();
            }
        }
    }

    public czlg d(OutputStream outputStream0) {
        return this;
    }

    public abstract InputStream e();

    public abstract OutputStream f();

    public final void g(czlf czlf0) {
        synchronized(this) {
            this.h.add(czlf0);
        }
    }

    protected abstract void h();

    public void i(byte[] arr_b) {
    }

    public boolean j() {
        return false;
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

