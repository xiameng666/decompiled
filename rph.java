import j..time.Instant;

public final class rph extends rpj {
    public final long a;
    public final Instant b;
    private final rpi d;
    private final ron e;

    public rph(ron ron0, long v, rpi rpi0, Instant instant0) {
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
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqm rqm0 = (rqm)hftp1.b_message;
        rqm0.b |= 1;
        rqm0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqm rqm1 = (rqm)hftp1.b_message;
        s.getClass();
        rqm1.b |= 2;
        rqm1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqm rqm2 = (rqm)hftp1.b_message;
        s1.getClass();
        rqm2.b |= 8;
        rqm2.f = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqm rqm3 = (rqm)hftp1.b_message;
        rqm3.b |= 4;
        rqm3.e = v;
        rqm rqm4 = (rqm)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqm4.getClass();
        rqo0.d = rqm4;
        rqo0.b |= 4;
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
        if(!(object0 instanceof rph)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rph)object0).e)) {
            return false;
        }
        if(this.a != ((rph)object0).a) {
            return false;
        }
        return ibuq.m(this.d, ((rph)object0).d) ? ibuq.m(this.b, ((rph)object0).b) : false;
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
        return "ActivityNodeValidating(nodeRef=" + this.e + ", nodeId=" + this.a + ", intent=" + this.d + ", timestamp=" + this.b + ")";
    }
}

