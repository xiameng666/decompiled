import j..time.Instant;

public final class ror extends rpj {
    public final long a;
    public final Instant b;
    private final Object d;
    private final ron e;

    public ror(ron ron0, long v, Object object0, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.e = ron0;
        this.a = v;
        this.d = object0;
        this.b = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqc rqc0 = (rqc)hftp1.b_message;
        rqc0.b |= 1;
        rqc0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqc rqc1 = (rqc)hftp1.b_message;
        s.getClass();
        rqc1.b |= 2;
        rqc1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqc rqc2 = (rqc)hftp1.b_message;
        s1.getClass();
        rqc2.b |= 8;
        rqc2.f = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqc rqc3 = (rqc)hftp1.b_message;
        rqc3.b |= 4;
        rqc3.e = v;
        rqc rqc4 = (rqc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqc4.getClass();
        rqo0.g = rqc4;
        rqo0.b |= 0x20;
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
        if(!(object0 instanceof ror)) {
            return false;
        }
        if(!ibuq.m(this.e, ((ror)object0).e)) {
            return false;
        }
        if(this.a != ((ror)object0).a) {
            return false;
        }
        return ibuq.m(this.d, ((ror)object0).d) ? ibuq.m(this.b, ((ror)object0).b) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.e.hashCode() * 0x1F;
        return this.d == null ? (v + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F * 0x1F + this.b.hashCode() : ((v + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + this.d.hashCode()) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeArgumentExtracted(nodeRef=" + this.e + ", nodeId=" + this.a + ", argument=" + this.d + ", timestamp=" + this.b + ")";
    }
}

