import j..time.Instant;

public final class rpd extends rpj {
    public final long a;
    public final long b;
    public final Instant d;
    private final ron e;

    public rpd(ron ron0, long v, long v1, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.e = ron0;
        this.a = v;
        this.b = v1;
        this.d = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rqj)hftv0).b |= 1;
        ((rqj)hftv0).c = this.a;
        long v = this.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqj rqj0 = (rqj)hftp1.b_message;
        rqj0.b |= 2;
        rqj0.d = v;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqj rqj1 = (rqj)hftp1.b_message;
        s.getClass();
        rqj1.b |= 4;
        rqj1.e = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqj rqj2 = (rqj)hftp1.b_message;
        s1.getClass();
        rqj2.b |= 16;
        rqj2.g = s1;
        long v1 = this.d.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqj rqj3 = (rqj)hftp1.b_message;
        rqj3.b |= 8;
        rqj3.f = v1;
        rqj rqj4 = (rqj)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqj4.getClass();
        rqo0.l = rqj4;
        rqo0.b |= 0x1000;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (rqo)hftv1;
    }

    @Override  // rpj
    public final Instant d() {
        return this.d;
    }

    @Override  // rpj
    protected final ron e() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rpd)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rpd)object0).e)) {
            return false;
        }
        if(this.a != ((rpd)object0).a) {
            return false;
        }
        return this.b == ((rpd)object0).b ? ibuq.m(this.d, ((rpd)object0).d) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return ((this.e.hashCode() * 0x1F + rpc.a(this.a)) * 0x1F + rpc.a(this.b)) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeResumedAfterLaunch(nodeRef=" + this.e + ", sourceNodeId=" + this.a + ", nodeId=" + this.b + ", timestamp=" + this.d + ")";
    }
}

