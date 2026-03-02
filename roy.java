import j..time.Instant;

public final class roy extends rpj {
    public final long a;
    public final Instant b;
    private final Throwable d;
    private final rpi e;
    private final ron f;

    public roy(ron ron0, long v, Throwable throwable0, rpi rpi0, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.f = ron0;
        this.a = v;
        this.d = throwable0;
        this.e = rpi0;
        this.b = instant0;
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqg rqg0 = (rqg)hftp1.b_message;
        rqg0.b |= 1;
        rqg0.c = this.a;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqg rqg1 = (rqg)hftp1.b_message;
        s.getClass();
        rqg1.b |= 2;
        rqg1.d = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqg rqg2 = (rqg)hftp1.b_message;
        s1.getClass();
        rqg2.b |= 16;
        rqg2.f = s1;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqg rqg3 = (rqg)hftp1.b_message;
        rqg3.b |= 8;
        rqg3.e = v;
        rqg rqg4 = (rqg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqg4.getClass();
        rqo0.e = rqg4;
        rqo0.b |= 8;
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
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof roy)) {
            return false;
        }
        if(!ibuq.m(this.f, ((roy)object0).f)) {
            return false;
        }
        if(this.a != ((roy)object0).a) {
            return false;
        }
        if(!ibuq.m(this.d, ((roy)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((roy)object0).e) ? ibuq.m(this.b, ((roy)object0).b) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return (((this.f.hashCode() * 0x1F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeFailedValidation(nodeRef=" + this.f + ", nodeId=" + this.a + ", exception=" + this.d + ", intent=" + this.e + ", timestamp=" + this.b + ")";
    }
}

