import j..time.Instant;

public final class rpb extends rpj {
    private final long a;
    private final Instant b;
    private final ron d;

    public rpb(ron ron0, long v, Instant instant0) {
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
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqk rqk0 = (rqk)hftp1.b_message;
        rqk0.b |= 1;
        rqk0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqk rqk1 = (rqk)hftp1.b_message;
        s.getClass();
        rqk1.b |= 2;
        rqk1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqk rqk2 = (rqk)hftp1.b_message;
        s1.getClass();
        rqk2.b |= 4;
        rqk2.e = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqk rqk3 = (rqk)hftp1.b_message;
        rqk3.b |= 8;
        rqk3.f = v;
        rqk rqk4 = (rqk)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqk4.getClass();
        rqo0.m = rqk4;
        rqo0.b |= 0x2000;
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
        if(!(object0 instanceof rpb)) {
            return false;
        }
        if(!ibuq.m(this.d, ((rpb)object0).d)) {
            return false;
        }
        return this.a == ((rpb)object0).a ? ibuq.m(this.b, ((rpb)object0).b) : false;
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
        return "ActivityNodeResumed(nodeRef=" + this.d + ", nodeId=" + this.a + ", timestamp=" + this.b + ")";
    }
}

