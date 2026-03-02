import j..time.Instant;

public final class roz extends rpj {
    public final long a;
    public final Instant b;
    private final ron d;

    public roz(ron ron0, long v, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.d = ron0;
        this.a = v;
        this.b = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqh.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqh rqh0 = (rqh)hftp1.b_message;
        rqh0.b |= 1;
        rqh0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqh rqh1 = (rqh)hftp1.b_message;
        s.getClass();
        rqh1.b |= 2;
        rqh1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqh rqh2 = (rqh)hftp1.b_message;
        s1.getClass();
        rqh2.b |= 8;
        rqh2.f = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqh rqh3 = (rqh)hftp1.b_message;
        rqh3.b |= 4;
        rqh3.e = v;
        rqh rqh4 = (rqh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqh4.getClass();
        rqo0.k = rqh4;
        rqo0.b |= 0x800;
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
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof roz)) {
            return false;
        }
        if(!ibuq.m(this.d, ((roz)object0).d)) {
            return false;
        }
        return this.a == ((roz)object0).a ? ibuq.m(this.b, ((roz)object0).b) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return (this.d.hashCode() * 0x1F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeFinished(nodeRef=" + this.d + ", nodeId=" + this.a + ", timestamp=" + this.b + ")";
    }
}

