import j..time.Instant;

public final class rpg extends rpk {
    public final long a;
    public final long b;
    public final Instant d;
    private final Object e;
    private final ron f;

    public rpg(ron ron0, long v, long v1, Object object0, Instant instant0) {
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
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rql.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rql)hftv0).b |= 1;
        ((rql)hftv0).c = this.a;
        long v = this.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        rql rql0 = (rql)hftp1.b_message;
        rql0.b |= 2;
        rql0.d = v;
        String s = this.fb();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rql rql1 = (rql)hftp1.b_message;
        s.getClass();
        rql1.b |= 4;
        rql1.e = s;
        String s1 = this.fa();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rql rql2 = (rql)hftp1.b_message;
        s1.getClass();
        rql2.b |= 16;
        rql2.g = s1;
        long v1 = this.d.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rql rql3 = (rql)hftp1.b_message;
        rql3.b |= 8;
        rql3.f = v1;
        rql rql4 = (rql)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rql4.getClass();
        rqo0.j = rql4;
        rqo0.b |= 0x200;
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
        if(!(object0 instanceof rpg)) {
            return false;
        }
        if(!ibuq.m(this.f, ((rpg)object0).f)) {
            return false;
        }
        if(this.a != ((rpg)object0).a) {
            return false;
        }
        if(this.b != ((rpg)object0).b) {
            return false;
        }
        return ibuq.m(this.e, ((rpg)object0).e) ? ibuq.m(this.d, ((rpg)object0).d) : false;
    }

    @Override  // rpj
    public final long f() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = this.f.hashCode() * 0x1F;
        return this.e == null ? ((v + rpf.a(this.a)) * 0x1F + rpf.a(this.b)) * 0x1F * 0x1F + this.d.hashCode() : (((v + rpf.a(this.a)) * 0x1F + rpf.a(this.b)) * 0x1F + this.e.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityNodeStartExecuteSynchronously(nodeRef=" + this.f + ", sourceNodeId=" + this.a + ", nodeId=" + this.b + ", argument=" + this.e + ", timestamp=" + this.d + ")";
    }
}

