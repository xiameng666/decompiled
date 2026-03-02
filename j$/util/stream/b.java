package j$.util.stream;

import j..desugar.sun.nio.fs.n;
import j..util.Objects;
import j..util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public abstract class b implements BaseStream {
    public final b a;
    public final b b;
    public final int c;
    public final b d;
    public int e;
    public int f;
    public Spliterator g;
    public Supplier h;
    public boolean i;
    public final boolean j;
    public Runnable k;
    public boolean l;

    public b(Spliterator spliterator0, int v, boolean z) {
        this.b = null;
        this.g = spliterator0;
        this.a = this;
        int v1 = l7.g & v;
        this.c = v1;
        this.f = ~(v1 << 1) & l7.l;
        this.e = 0;
        this.l = z;
    }

    public b(b b0, int v) {
        if(b0.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        b0.i = true;
        b0.d = this;
        this.b = b0;
        this.c = l7.h & v;
        this.f = l7.g(v, b0.f);
        b b1 = b0.a;
        this.a = b1;
        if(this.E()) {
            b1.j = true;
        }
        this.e = b0.e + 1;
    }

    public b(Supplier supplier0, int v, boolean z) {
        this.b = null;
        this.h = supplier0;
        this.a = this;
        int v1 = l7.g & v;
        this.c = v1;
        this.f = ~(v1 << 1) & l7.l;
        this.e = 0;
        this.l = z;
    }

    public abstract Spliterator A(Supplier arg1);

    public abstract b2 B(long arg1, IntFunction arg2);

    public j2 C(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator D(b b0, Spliterator spliterator0) {
        return this.C(b0, spliterator0, new n(19)).spliterator();
    }

    public abstract boolean E();

    public abstract u5 F(int arg1, u5 arg2);

    public final Spliterator G(int v) {
        int v4;
        int v3;
        b b0 = this.a;
        Spliterator spliterator0 = b0.g;
        if(spliterator0 == null) {
            Supplier supplier0 = b0.h;
            if(supplier0 == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            spliterator0 = (Spliterator)supplier0.get();
            b0.h = null;
        }
        else {
            b0.g = null;
        }
        if(b0.l && b0.j) {
            b b1 = b0.d;
            for(int v1 = 1; b0 != this; ++v1) {
                int v2 = b1.c;
                if(b1.E()) {
                    if(l7.SHORT_CIRCUIT.w(v2)) {
                        v2 &= ~l7.u;
                    }
                    spliterator0 = b1.D(b0, spliterator0);
                    if(spliterator0.hasCharacteristics(0x40)) {
                        v3 = ~l7.t & v2;
                        v4 = l7.s;
                    }
                    else {
                        v3 = ~l7.s & v2;
                        v4 = l7.t;
                    }
                    v2 = v3 | v4;
                    v1 = 0;
                }
                b1.e = v1;
                b1.f = l7.g(v2, b0.f);
                b b2 = b1;
                b1 = b1.d;
                b0 = b2;
            }
        }
        if(v != 0) {
            this.f = l7.g(v, this.f);
        }
        return spliterator0;
    }

    public final Spliterator H() {
        b b0 = this.a;
        if(this != b0) {
            throw new IllegalStateException();
        }
        if(this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        Spliterator spliterator0 = b0.g;
        if(spliterator0 != null) {
            b0.g = null;
            return spliterator0;
        }
        Supplier supplier0 = b0.h;
        if(supplier0 == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        Spliterator spliterator1 = (Spliterator)supplier0.get();
        b0.h = null;
        return spliterator1;
    }

    public abstract Spliterator I(b arg1, Supplier arg2, boolean arg3);

    public final u5 J(Spliterator spliterator0, u5 u50) {
        this.e(spliterator0, this.K(((u5)Objects.requireNonNull(u50))));
        return u50;
    }

    public final u5 K(u5 u50) {
        Objects.requireNonNull(u50);
        for(b b0 = this; true; b0 = b1) {
            b b1 = b0.b;
            if(b0.e <= 0) {
                break;
            }
            u50 = b0.F(b1.f, u50);
        }
        return u50;
    }

    public final Spliterator L(Spliterator spliterator0) {
        return this.e == 0 ? spliterator0 : this.I(this, new a(1, spliterator0), this.a.l);
    }

    @Override  // j$.util.stream.BaseStream
    public final void close() {
        this.i = true;
        this.h = null;
        this.g = null;
        b b0 = this.a;
        Runnable runnable0 = b0.k;
        if(runnable0 != null) {
            b0.k = null;
            runnable0.run();
        }
    }

    public final void e(Spliterator spliterator0, u5 u50) {
        Objects.requireNonNull(u50);
        if(!l7.SHORT_CIRCUIT.w(this.f)) {
            u50.d(spliterator0.getExactSizeIfKnown());
            spliterator0.forEachRemaining(u50);
            u50.end();
            return;
        }
        this.h(spliterator0, u50);
    }

    public final boolean h(Spliterator spliterator0, u5 u50) {
        b b0;
        for(b0 = this; b0.e > 0; b0 = b0.b) {
        }
        u50.d(spliterator0.getExactSizeIfKnown());
        boolean z = b0.y(spliterator0, u50);
        u50.end();
        return z;
    }

    @Override  // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.l;
    }

    public final j2 j(Spliterator spliterator0, boolean z, IntFunction intFunction0) {
        if(this.a.l) {
            return this.o(this, spliterator0, z, intFunction0);
        }
        b2 b20 = this.B(this.r(spliterator0), intFunction0);
        this.J(spliterator0, b20);
        return b20.build();
    }

    public final Object l(z8 z80) {
        if(this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        return this.a.l ? z80.b(this, this.G(z80.c())) : z80.a(this, this.G(z80.c()));
    }

    public final j2 m(IntFunction intFunction0) {
        if(this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        if(this.a.l) {
            b b0 = this.b;
            if(b0 != null && this.E()) {
                this.e = 0;
                return this.C(b0, b0.G(0), intFunction0);
            }
        }
        return this.j(this.G(0), true, intFunction0);
    }

    public abstract j2 o(b arg1, Spliterator arg2, boolean arg3, IntFunction arg4);

    @Override  // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable0) {
        if(this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable0);
        b b0 = this.a;
        Runnable runnable1 = b0.k;
        if(runnable1 != null) {
            runnable0 = new v8(0, runnable1, runnable0);
        }
        b0.k = runnable0;
        return this;
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.a.l = true;
        return this;
    }

    public final long r(Spliterator spliterator0) {
        return l7.SIZED.w(this.f) ? spliterator0.getExactSizeIfKnown() : -1L;
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.a.l = false;
        return this;
    }

    @Override  // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if(this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        b b0 = this.a;
        if(this == b0) {
            Spliterator spliterator0 = b0.g;
            if(spliterator0 != null) {
                b0.g = null;
                return spliterator0;
            }
            Supplier supplier0 = b0.h;
            if(supplier0 == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            b0.h = null;
            return this.A(supplier0);
        }
        return this.I(this, new a(0, this), b0.l);
    }

    public abstract boolean y(Spliterator arg1, u5 arg2);

    public abstract m7 z();
}

