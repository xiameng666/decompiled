import j..time.Instant;

public final class rpt extends rpj {
    private final long a;
    private final Object b;
    private final Instant d;
    private final ron e;

    public rpt(ron ron0, long v, Object object0, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.e = ron0;
        this.a = v;
        this.b = object0;
        this.d = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqv rqv0 = (rqv)hftp1.b_message;
        rqv0.b |= 1;
        rqv0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqv rqv1 = (rqv)hftp1.b_message;
        s.getClass();
        rqv1.b |= 2;
        rqv1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqv rqv2 = (rqv)hftp1.b_message;
        s1.getClass();
        rqv2.b |= 4;
        rqv2.e = s1;
        long v = this.d.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqv rqv3 = (rqv)hftp1.b_message;
        rqv3.b |= 8;
        rqv3.f = v;
        rqv rqv4 = (rqv)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqv4.getClass();
        rqo0.q = rqv4;
        rqo0.b |= 0x40000;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (rqo)hftv0;
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
        if(!(object0 instanceof rpt)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rpt)object0).e)) {
            return false;
        }
        if(this.a != ((rpt)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((rpt)object0).b) ? ibuq.m(this.d, ((rpt)object0).d) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.e.hashCode() * 0x1F;
        return this.b == null ? (v + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F * 0x1F + this.d.hashCode() : ((v + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + this.b.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "PendingContractPreparedForTask(nodeRef=" + this.e + ", nodeId=" + this.a + ", argument=" + this.b + ", timestamp=" + this.d + ")";
    }
}

