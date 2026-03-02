import java.util.Arrays;

public abstract class ezyj {
    public final String a;
    public final Object b;
    public final brzr c;
    public gfsx d;
    public fagj e;
    public boolean f;

    protected ezyj(String s, fagj fagj0) {
        batl.q(s);
        this.a = s;
        this.c = new brzr(this.getClass(), 16, s, "ota_base");
        this.d = gfqx.a;
        this.e = fagj0;
        this.b = new Object();
    }

    public abstract ezyi a();

    public final fagj b() {
        synchronized(this.b) {
        }
        return this.e;
    }

    public final Object c(fagn fagn0) {
        synchronized(this.b) {
        }
        return this.e.c(fagn0);
    }

    public void d() {
        this.f = true;
    }

    public abstract boolean e(int arg1);

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ezyj) ? this.a.equals(((ezyj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

