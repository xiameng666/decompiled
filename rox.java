import j..time.Instant;

public final class rox extends rpj {
    public final long a;
    public final Instant b;
    private final String d;
    private final ron e;

    public rox(long v, String s, Instant instant0) {
        ibuq.f(instant0, "timestamp");
        super();
        this.a = v;
        this.d = s;
        this.b = instant0;
        this.e = rom.f(rod.f(a.D(v, "UnknownComponent(nodeId=", ")")), "Unknown(id=" + v + ")");
        rkd.f(this.fb());
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rqf)hftv0).b |= 1;
        ((rqf)hftv0).c = this.a;
        String s = this.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        if(s == null) {
            s = "";
        }
        rqf rqf0 = (rqf)hftp1.b_message;
        rqf0.b |= 2;
        rqf0.d = s;
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqf rqf1 = (rqf)hftp1.b_message;
        rqf1.b |= 4;
        rqf1.e = v;
        rqf rqf2 = (rqf)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqf2.getClass();
        rqo0.h = rqf2;
        rqo0.b |= 0x80;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (rqo)hftv1;
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
        if(!(object0 instanceof rox)) {
            return false;
        }
        if(this.a != ((rox)object0).a) {
            return false;
        }
        return ibuq.m(this.d, ((rox)object0).d) ? ibuq.m(this.b, ((rox)object0).b) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.d == null ? ((int)(this.a ^ this.a >>> 0x20)) * 0x1F * 0x1F + this.b.hashCode() : (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.d.hashCode()) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeFail(nodeId=" + this.a + ", reason=" + this.d + ", timestamp=" + this.b + ")";
    }
}

