import j..util.Objects;
import java.util.ArrayDeque;
import java.util.Queue;

final class gpjs extends iakv {
    public final Object a;
    public final Queue b;
    public iakv c;
    final iakr d;
    final gRPCMethodDescriptor e;
    final iakq f;

    public gpjs(gpjt gpjt0, iakr iakr0, gRPCMethodDescriptor iaoj0, iakq iakq0) {
        this.d = iakr0;
        this.e = iaoj0;
        this.f = iakq0;
        Objects.requireNonNull(gpjt0);
        super();
        this.a = new Object();
        this.b = new ArrayDeque();
        this.c = iakr0.a(iaoj0, iakq0);
    }

    @Override  // iakv
    public final void a(String s, Throwable throwable0) {
        synchronized(this.a) {
            gpjo gpjo0 = new gpjo(this, s, throwable0);
            this.b.add(gpjo0);
            this.f().a(s, throwable0);
        }
    }

    @Override  // iakv
    public final void b() {
        synchronized(this.a) {
            gpjm gpjm0 = new gpjm(this);
            this.b.add(gpjm0);
            this.f().b();
        }
    }

    @Override  // iakv
    public final void c(int v) {
        synchronized(this.a) {
            gpjn gpjn0 = new gpjn(this, v);
            this.b.add(gpjn0);
            this.f().c(v);
        }
    }

    @Override  // iakv
    public final void d(Object object0) {
        synchronized(this.a) {
            gpjp gpjp0 = new gpjp(this, object0);
            this.b.add(gpjp0);
            this.f().d(object0);
        }
    }

    @Override  // iakv
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        synchronized(this.a) {
            iaof_metadata iaof1 = new iaof_metadata();
            iaof1.h(iaof0);
            gpjq gpjq0 = new gpjq(this, iaku0, iaof1);
            this.b.add(gpjq0);
            this.f().e(new gpjr(this, iaku0), iaof0);
        }
    }

    public final iakv f() {
        synchronized(this.a) {
        }
        return this.c;
    }
}

