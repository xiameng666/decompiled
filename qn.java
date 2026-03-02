public final class qn {
    long a;
    qn b;

    public qn() {
        this.a = 0L;
    }

    final int a(int v) {
        qn qn0 = this.b;
        if(qn0 == null) {
            return v < 0x40 ? Long.bitCount((1L << v) - 1L & this.a) : Long.bitCount(this.a);
        }
        return v >= 0x40 ? qn0.a(v - 0x40) + Long.bitCount(this.a) : Long.bitCount((1L << v) - 1L & this.a);
    }

    final void b(int v) {
        if(v >= 0x40) {
            qn qn0 = this.b;
            if(qn0 != null) {
                qn0.b(v - 0x40);
            }
            return;
        }
        this.a &= ~(1L << v);
    }

    final void c(int v, boolean z) {
        if(v >= 0x40) {
            this.h();
            this.b.c(v - 0x40, z);
            return;
        }
        boolean z1 = Long.compare(0x8000000000000000L & this.a, 0L) != 0;
        long v1 = (1L << v) - 1L;
        long v2 = this.a & ~v1;
        this.a = v2 + v2 | this.a & v1;
        if(z) {
            this.e(v);
        }
        else {
            this.b(v);
        }
        if(!z1 && this.b == null) {
            return;
        }
        this.h();
        this.b.c(0, z1);
    }

    public final void d() {
        this.a = 0L;
        qn qn0 = this.b;
        if(qn0 != null) {
            qn0.d();
        }
    }

    public final void e(int v) {
        if(v >= 0x40) {
            this.h();
            this.b.e(v - 0x40);
            return;
        }
        this.a |= 1L << v;
    }

    final boolean f(int v) {
        if(v >= 0x40) {
            this.h();
            return this.b.f(v - 0x40);
        }
        return (1L << v & this.a) != 0L;
    }

    final boolean g(int v) {
        if(v >= 0x40) {
            this.h();
            return this.b.g(v - 0x40);
        }
        boolean z = Long.compare(this.a & 1L << v, 0L) != 0;
        long v1 = this.a & ~(1L << v);
        this.a = v1;
        long v2 = (1L << v) - 1L;
        this.a = v2 & v1 | Long.rotateRight(~v2 & v1, 1);
        qn qn0 = this.b;
        if(qn0 != null) {
            if(qn0.f(0)) {
                this.e(0x3F);
            }
            this.b.g(0);
        }
        return z;
    }

    private final void h() {
        if(this.b == null) {
            this.b = new qn();
        }
    }

    @Override
    public final String toString() {
        return this.b == null ? Long.toBinaryString(this.a) : this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}

