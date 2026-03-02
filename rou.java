import j..time.Instant;

public final class rou extends rpj {
    public final long a;
    public final long b;
    public final Instant d;
    private final Object e;
    private final ron f;

    public rou(ron ron0, long v, long v1, Object object0, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.f = ron0;
        this.a = v;
        this.b = v1;
        this.e = object0;
        this.d = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rqd)hftv0).b |= 1;
        ((rqd)hftv0).c = this.a;
        long v = this.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqd rqd0 = (rqd)hftp1.b_message;
        rqd0.b |= 2;
        rqd0.d = v;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqd rqd1 = (rqd)hftp1.b_message;
        s.getClass();
        rqd1.b |= 4;
        rqd1.e = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqd rqd2 = (rqd)hftp1.b_message;
        s1.getClass();
        rqd2.b |= 16;
        rqd2.g = s1;
        long v1 = this.d.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqd rqd3 = (rqd)hftp1.b_message;
        rqd3.b |= 8;
        rqd3.f = v1;
        rqd rqd4 = (rqd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqd4.getClass();
        rqo0.c = rqd4;
        rqo0.b |= 2;
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
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rou)) {
            return false;
        }
        if(!ibuq.m(this.f, ((rou)object0).f)) {
            return false;
        }
        if(this.a != ((rou)object0).a) {
            return false;
        }
        if(this.b != ((rou)object0).b) {
            return false;
        }
        return ibuq.m(this.e, ((rou)object0).e) ? ibuq.m(this.d, ((rou)object0).d) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = this.f.hashCode() * 0x1F;
        return this.e == null ? ((v + rot.a(this.a)) * 0x1F + rot.a(this.b)) * 0x1F * 0x1F + this.d.hashCode() : (((v + rot.a(this.a)) * 0x1F + rot.a(this.b)) * 0x1F + this.e.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeExecutedForResult(nodeRef=" + this.f + ", sourceNodeId=" + this.a + ", nodeId=" + this.b + ", argument=" + this.e + ", timestamp=" + this.d + ")";
    }
}

