import j..time.Instant;

public final class rpa extends rpj {
    public final long a;
    public final Instant b;
    private final Object d;
    private final ron e;

    public rpa(ron ron0, long v, Object object0, Instant instant0) {
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
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqi.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqi rqi0 = (rqi)hftp1.b_message;
        rqi0.b |= 1;
        rqi0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqi rqi1 = (rqi)hftp1.b_message;
        s.getClass();
        rqi1.b |= 2;
        rqi1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqi rqi2 = (rqi)hftp1.b_message;
        s1.getClass();
        rqi2.b |= 8;
        rqi2.f = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqi rqi3 = (rqi)hftp1.b_message;
        rqi3.b |= 4;
        rqi3.e = v;
        rqi rqi4 = (rqi)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqi4.getClass();
        rqo0.i = rqi4;
        rqo0.b |= 0x100;
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
        if(!(object0 instanceof rpa)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rpa)object0).e)) {
            return false;
        }
        if(this.a != ((rpa)object0).a) {
            return false;
        }
        return ibuq.m(this.d, ((rpa)object0).d) ? ibuq.m(this.b, ((rpa)object0).b) : false;
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
        return "ActivityNodeResultReceived(nodeRef=" + this.e + ", nodeId=" + this.a + ", result=" + this.d + ", timestamp=" + this.b + ")";
    }
}

