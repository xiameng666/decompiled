final class hfsr {
    public final CodedOutputStream a;

    public hfsr(CodedOutputStream hfsq0) {
        hfup.e(hfsq0, "output");
        this.a = hfsq0;
        hfsq0.f = this;
    }

    public final void a(int v, boolean z) {
        this.a.writeBool(v, z);
    }

    public final void b(int v, ByteString hfsf0) {
        this.a.writeBytes(v, hfsf0);
    }

    public final void c(int v, double f) {
        this.a.ah(v, f);
    }

    public final void d(int v, int v1) {
        this.a.writeInt32(v, v1);
    }

    public final void e(int v, int v1) {
        this.a.p(v, v1);
    }

    public final void f(int v, long v1) {
        this.a.r(v, v1);
    }

    public final void g(int v, float f) {
        this.a.aj(v, f);
    }

    public final void h(int v, Object object0, hfwc hfwc0) {
        this.a.A(v, 3);
        hfwc0.m(((hfrk)object0), this);
        this.a.A(v, 4);
    }

    public final void i(int v, int v1) {
        this.a.writeInt32(v, v1);
    }

    public final void j(int v, long v1) {
        this.a.D(v, v1);
    }

    public final void k(int v, Object object0, hfwc hfwc0) {
        hfrk hfrk0 = (hfrk)object0;
        this.a.A(v, 2);
        int v1 = hfrk0.ox(hfwc0);
        this.a.writeRawVarint32(v1);
        hfwc0.m(hfrk0, this);
    }

    public final void l(int v, Object object0) {
        CodedOutputStream hfsq0 = this.a;
        if((object0 instanceof ByteString)) {
            hfsq0.x(v, ((ByteString)object0));
            return;
        }
        hfsq0.writeMessage(v, ((MessageLite)object0));
    }

    public final void m(int v, int v1) {
        this.a.p(v, v1);
    }

    public final void n(int v, long v1) {
        this.a.r(v, v1);
    }

    public final void o(int v, int v1) {
        this.a.an(v, v1);
    }

    public final void p(int v, long v1) {
        this.a.ap(v, v1);
    }

    public final void q(int v, String s) {
        this.a.writeString(v, s);
    }

    public final void r(int v, int v1) {
        this.a.B(v, v1);
    }

    public final void s(int v, long v1) {
        this.a.D(v, v1);
    }
}

