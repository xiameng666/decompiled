import j..time.Instant;

public final class rpq implements rpo {
    public final String a;
    public final String b;
    public final long d;
    public final Object e;
    public final Instant f;
    private final long g;

    public rpq(String s, String s1, long v, Object object0) {
        Instant instant0 = Instant.now();
        ibuq.f(s, "nodeName");
        ibuq.f(s1, "nodeComponent");
        ibuq.f(instant0, "timestamp");
        super();
        this.g = -1L;
        this.a = s;
        this.b = s1;
        this.d = v;
        this.e = object0;
        this.f = instant0;
        rkd.f(s);
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rqr)hftv0).b |= 1;
        ((rqr)hftv0).c = this.d;
        String s = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s.getClass();
        ((rqr)hftv1).b |= 2;
        ((rqr)hftv1).d = s;
        String s1 = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqr rqr0 = (rqr)hftp1.b_message;
        s1.getClass();
        rqr0.b |= 4;
        rqr0.e = s1;
        long v = this.f.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqr rqr1 = (rqr)hftp1.b_message;
        rqr1.b |= 0x40;
        rqr1.f = v;
        rqr rqr2 = (rqr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqr2.getClass();
        rqo0.o = rqr2;
        rqo0.b |= 0x10000;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        return (rqo)hftv2;
    }

    @Override
    public final int compareTo(Object object0) {
        return rpx.b(this, object0);
    }

    @Override  // rpy
    public final Instant d() {
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rpq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((rpq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rpq)object0).b)) {
            return false;
        }
        if(this.d != ((rpq)object0).d) {
            return false;
        }
        return ibuq.m(this.e, ((rpq)object0).e) ? ibuq.m(this.f, ((rpq)object0).f) : false;
    }

    @Override  // rpz
    public final long f() {
        return this.d;
    }

    @Override  // rof
    public final String fa() {
        return this.b;
    }

    @Override  // rpz
    public final String fb() {
        return this.a;
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    @Override  // rpy
    public final int g(Instant instant0) {
        return rpx.a(this, instant0);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.e == null ? (v * 0x1F + rpp.a(this.d)) * 0x1F * 0x1F + this.f.hashCode() : ((v * 0x1F + rpp.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override  // rpu
    public final String i() {
        return roq.a(this);
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    @Override
    public final String toString() {
        return "OnboardingTaskStartedEvent(sourceNodeId=-1, nodeName=" + this.a + ", nodeComponent=" + this.b + ", nodeId=" + this.d + ", argument=" + this.e + ", timestamp=" + this.f + ")";
    }
}

