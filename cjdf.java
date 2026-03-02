import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class cjdf {
    public final Object a;
    public boolean b;
    public boolean c;
    public Object d;
    private final Executor e;

    public cjdf(Executor executor0, Object object0) {
        this.a = new Object();
        this.e = executor0;
        this.b = false;
        this.d = object0;
    }

    protected void b() {
    }

    protected void c() {
    }

    protected void d(Exception exception0) {
        throw new AssertionError(exception0);
    }

    protected void e(Object object0) {
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0;
    }

    protected void f() {
    }

    public final boolean g() {
        boolean z = false;
        synchronized(this.a) {
            if(this.c && this.d != null) {
                z = true;
            }
        }
        return z;
    }

    public final void ir(cjde cjde0) {
        if(cjde0 == null) {
            return;
        }
        synchronized(this.a) {
            if(this.d == null) {
                return;
            }
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            cjdd cjdd0 = new cjdd(this, cjde0, atomicBoolean0);
            this.e.execute(cjdd0);
            cjde0.b(atomicBoolean0.get());
        }
    }
}

