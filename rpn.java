import j..time.Instant;
import java.util.List;

public final class rpn implements rpo {
    public final String a;
    public final String b;
    public final long d;
    public final scj e;
    public final List f;
    public final Instant g;

    public rpn(String s, String s1, long v, scj scj0, List list0, int v1) {
        if((v1 & 16) != 0) {
            list0 = ibps.a;
        }
        Instant instant0 = Instant.now();
        ibuq.f(s, "nodeName");
        ibuq.f(s1, "nodeComponent");
        ibuq.f(scj0, "result");
        ibuq.f(list0, "metadata");
        ibuq.f(instant0, "timestamp");
        super();
        this.a = s;
        this.b = s1;
        this.d = v;
        this.e = scj0;
        this.f = list0;
        this.g = instant0;
        rkd.f(s);
    }

    @Override  // rpu
    public final rqo a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)rqo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)rqq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((rqq)hftv0).b |= 1;
        ((rqq)hftv0).c = this.d;
        String s = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s.getClass();
        ((rqq)hftv1).b |= 2;
        ((rqq)hftv1).d = s;
        String s1 = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        s1.getClass();
        ((rqq)hftv2).b |= 4;
        ((rqq)hftv2).e = s1;
        scj scj0 = this.e;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqq rqq0 = (rqq)hftp1.b_message;
        rqq0.b |= 0x20;
        rqq0.f = scj0 instanceof sci;
        long v = this.g.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        rqq rqq1 = (rqq)hftp1.b_message;
        rqq1.b |= 0x40;
        rqq1.g = v;
        rqq rqq2 = (rqq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rqo rqo0 = (rqo)hftp0.b_message;
        rqq2.getClass();
        rqo0.p = rqq2;
        rqo0.b |= 0x20000;
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        return (rqo)hftv3;
    }

    @Override
    public final int compareTo(Object object0) {
        return rpx.b(this, object0);
    }

    @Override  // rpy
    public final Instant d() {
        return this.g;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rpn)) {
            return false;
        }
        if(!ibuq.m(this.a, ((rpn)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rpn)object0).b)) {
            return false;
        }
        if(this.d != ((rpn)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((rpn)object0).e)) {
            return false;
        }
        return ibuq.m(this.f, ((rpn)object0).f) ? ibuq.m(this.g, ((rpn)object0).g) : false;
    }

    @Override  // rpz
    public final long f() {
        return this.d;
    }

    @Override  // rof
    public final String fa() {
        return this.b;
    }

    @Override  // rpz
    public final String fb() {
        return this.a;
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    @Override  // rpy
    public final int g(Instant instant0) {
        return rpx.a(this, instant0);
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode();
    }

    @Override  // rpu
    public final String i() {
        return roq.a(this);
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    @Override
    public final String toString() {
        return "OnboardingTaskCompleteEvent(nodeName=" + this.a + ", nodeComponent=" + this.b + ", nodeId=" + this.d + ", result=" + this.e + ", metadata=" + this.f + ", timestamp=" + this.g + ")";
    }
}

