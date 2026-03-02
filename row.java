import j..time.Instant;

public final class row extends rpj {
    public final long a;
    public final Instant b;
    private final rpi d;
    private final ron e;

    public row(ron ron0, long v, rpi rpi0, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.e = ron0;
        this.a = v;
        this.d = rpi0;
        this.b = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqe.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqe rqe0 = (rqe)hftp1.b_message;
        rqe0.b |= 1;
        rqe0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqe rqe1 = (rqe)hftp1.b_message;
        s.getClass();
        rqe1.b |= 2;
        rqe1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqe rqe2 = (rqe)hftp1.b_message;
        s1.getClass();
        rqe2.b |= 16;
        rqe2.g = s1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)rqn.a).v_newBuilder();
        rpi rpi0 = this.d;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        String s2 = rpi0.a;
        rqn rqn0 = (rqn)hftp2.b_message;
        rqn0.b |= 1;
        if(s2 == null) {
            s2 = "";
        }
        rqn0.c = s2;
        rqn rqn1 = (rqn)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqe rqe3 = (rqe)hftp1.b_message;
        rqn1.getClass();
        rqe3.e = rqn1;
        rqe3.b |= 4;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqe rqe4 = (rqe)hftp1.b_message;
        rqe4.b |= 8;
        rqe4.f = v;
        rqe rqe5 = (rqe)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqe5.getClass();
        rqo0.f = rqe5;
        rqo0.b |= 16;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (rqo)hftv0;
    }

    @Override  // rpj
    public final Instant d() {
        return this.b;
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
        if(!(object0 instanceof row)) {
            return false;
        }
        if(!ibuq.m(this.e, ((row)object0).e)) {
            return false;
        }
        if(this.a != ((row)object0).a) {
            return false;
        }
        return ibuq.m(this.d, ((row)object0).d) ? ibuq.m(this.b, ((row)object0).b) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ((this.e.hashCode() * 0x1F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + this.d.hashCode()) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeExtractArgument(nodeRef=" + this.e + ", nodeId=" + this.a + ", intent=" + this.d + ", timestamp=" + this.b + ")";
    }
}

