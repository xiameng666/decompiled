public final class hftr extends ProtoLiteBuilder implements fhwe, hftt {
    public hftr() {
        throw null;
    }

    public hftr(hfts hfts0) {
        super(hfts0);
    }

    @Override  // ProtoLiteBuilder
    public final ProtoLiteMessage O_buildPartial() {
        return this.a();
    }

    @Override  // ProtoLiteBuilder
    public final MessageLite buildPartial() {
        return this.a();
    }

    @Override  // ProtoLiteBuilder
    public final void ensureMutable() {
        super.ensureMutable();
        if(((hfts)this.b_message).s != hfth.a) {
            hfts hfts0 = (hfts)this.b_message;
            hfts0.s = hfts0.s.c();
        }
    }

    public final hfts a() {
        if(!((hfts)this.b_message).isImmutable()) {
            return (hfts)this.b_message;
        }
        ((hfts)this.b_message).s.e();
        return (hfts)super.O_buildPartial();
    }

    public final void dl(long v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcsi hcsi0 = (hcsi)this.b_message;
        hcsi0.b();
        hcsi0.c.g(v);
    }

    public final void dm(hdru hdru0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hdrw hdrw0 = (hdrw)this.b_message;
        hdrv hdrv0 = (hdrv)hdru0.N_build();
        hdrv0.getClass();
        hdrw0.b();
        hdrw0.d.add(hdrv0);
    }

    public final void dn(hdrv hdrv0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hdrw hdrw0 = (hdrw)this.b_message;
        hdrv0.getClass();
        hdrw0.b();
        hdrw0.d.add(hdrv0);
    }

    public final void do(hfoa hfoa0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hfni hfni0 = (hfni)this.b_message;
        hfoa0.getClass();
        hfuo hfuo0 = hfni0.b;
        if(!hfuo0.c()) {
            hfni0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfni0.b.add(hfoa0);
    }

    public final void dp(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        higc higc0 = (higc)this.b_message;
        higc0.b();
        hfrj.E(iterable0, higc0.c);
    }

    public final void dq(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        higc higc0 = (higc)this.b_message;
        s.getClass();
        higc0.b();
        higc0.c.add(s);
    }

    public final void dr(hlpq hlpq0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hlpp hlpp0 = (hlpp)this.b_message;
        hlpq0.getClass();
        hfuo hfuo0 = hlpp0.i;
        if(!hfuo0.c()) {
            hlpp0.i = ProtoLiteMessage.E(hfuo0);
        }
        hlpp0.i.add(hlpq0);
    }

    public final void ds(ByteString hfsf0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hlps hlps0 = (hlps)this.b_message;
        hfsf0.getClass();
        hfuo hfuo0 = hlps0.j;
        if(!hfuo0.c()) {
            hlps0.j = ProtoLiteMessage.E(hfuo0);
        }
        hlps0.j.add(hfsf0);
    }

    public final void dt(hftr hftr0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcnu hcnu0 = (hcnu)this.b_message;
        hcrz hcrz0 = (hcrz)hftr0.N_build();
        hcrz0.getClass();
        hcnu0.c();
        hcnu0.h.add(hcrz0);
    }

    public final void du(hftr hftr0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcnu hcnu0 = (hcnu)this.b_message;
        hcsi hcsi0 = (hcsi)hftr0.N_build();
        hcsi0.getClass();
        hcnu0.d();
        hcnu0.f.add(hcsi0);
    }

    private final hfth dv() {
        hfth hfth0 = ((hfts)this.b_message).s;
        if(hfth0.c) {
            hfth0 = hfth0.c();
            ((hfts)this.b_message).s = hfth0;
        }
        return hfth0;
    }

    private final void dw(hfta hfta0) {
        if(hfta0.a == this.a_defaultInstance) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override  // hftt
    public final Object k(hfta hfta0) {
        hfts hfts0 = (hfts)this.b_message;
        hfts0.f(hfta0);
        Object object0 = hfts0.s.k(hfta0.d);
        return object0 == null ? hfta0.b : hfta0.d(object0);
    }

    @Override  // hftt
    public final boolean l(hfta hfta0) {
        hfts hfts0 = (hfts)this.b_message;
        hfts0.f(hfta0);
        return hfts0.s.m(hfta0.d);
    }

    public final void m(hfta hfta0) {
        this.dw(hfta0);
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hfth hfth0 = this.dv();
        hfth0.b.remove(hfta0.d);
        if(hfth0.b.isEmpty()) {
            hfth0.d = false;
        }
    }

    public final void n(hfta hfta0, Object object0) {
        this.dw(hfta0);
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hfth hfth0 = this.dv();
        hftu hftu0 = hfta0.d;
        if(hftu0.a() == hfxf.h) {
            object0 = ((hfub)object0).a();
        }
        hfth0.l(hftu0, object0);
    }

    public final void o(gzpk gzpk0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        gzro gzro0 = (gzro)this.b_message;
        gzpk0.getClass();
        hfuo hfuo0 = gzro0.c;
        if(!hfuo0.c()) {
            gzro0.c = ProtoLiteMessage.E(hfuo0);
        }
        gzro0.c.add(gzpk0);
    }

    public final void p(hcqv hcqv0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcnu hcnu0 = (hcnu)this.b_message;
        hcqv0.getClass();
        hcnu0.b();
        hcnu0.g.add(hcqv0);
    }

    public final void q(hcrz hcrz0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcnu hcnu0 = (hcnu)this.b_message;
        hcrz0.getClass();
        hcnu0.c();
        hcnu0.h.add(hcrz0);
    }

    public final void r(long v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcqv hcqv0 = (hcqv)this.b_message;
        hcqv0.b();
        hcqv0.c.g(v);
    }

    public final void s(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcrz hcrz0 = (hcrz)this.b_message;
        hcrz0.b();
        hfrj.E(iterable0, hcrz0.c);
    }

    public final void t(long v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcrz hcrz0 = (hcrz)this.b_message;
        hcrz0.b();
        hcrz0.c.g(v);
    }

    public final void u(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        hcsi hcsi0 = (hcsi)this.b_message;
        hcsi0.b();
        hfrj.E(iterable0, hcsi0.c);
    }
}

