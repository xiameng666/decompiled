import java.util.concurrent.atomic.AtomicBoolean;

public final class dtxp implements duak {
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final int c;
    public final AtomicBoolean d;
    public final String e;
    public final hkaa f;
    public final ByteString g;
    public final gtxc h;
    public final gtwu i;

    public dtxp(AtomicBoolean atomicBoolean0, AtomicBoolean atomicBoolean1, int v, AtomicBoolean atomicBoolean2, String s, hkaa hkaa0, ByteString hfsf0, gtxc gtxc0, gtwu gtwu0) {
        this.a = atomicBoolean0;
        this.b = atomicBoolean1;
        this.c = v;
        this.d = atomicBoolean2;
        this.e = s;
        this.f = hkaa0;
        this.g = hfsf0;
        this.h = gtxc0;
        this.i = gtwu0;
    }

    @Override  // duak
    public final void a(ProtoLiteBuilder hftp0) {
        ibuq.f(hftp0, "it");
        gtxb gtxb0 = gtxb.b(((gtxd)hftp0.b_message).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        String s = this.e;
        AtomicBoolean atomicBoolean0 = this.d;
        int v = this.c;
        AtomicBoolean atomicBoolean1 = this.b;
        gtxb gtxb1 = gtxb.f;
        boolean z = false;
        this.a.set(gtxb0 != gtxb1);
        if(((gtxd)hftp0.b_message).j != v) {
            z = true;
        }
        atomicBoolean1.set(z);
        atomicBoolean0.set(((boolean)(ibuq.m(((gtxd)hftp0.b_message).d, s) ^ 1)));
        gtyb gtyb0 = gtya.a(((ProtoLiteMessage)gtxd.a).v_newBuilder());
        gtyb0.b(gtxb1);
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp1 = gtyb0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtxd gtxd0 = (gtxd)hftp1.b_message;
        s.getClass();
        gtxd0.b |= 1;
        gtxd0.d = s;
        String s1 = (this.f.h == null ? hkau.a : this.f.h).b;
        if(s1 == null) {
            s1 = ((gtxd)hftp1.b_message).g;
            ibuq.e(s1, "getIssuerId(...)");
        }
        ibuq.f(s1, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ByteString hfsf0 = this.g;
        gtxd gtxd1 = (gtxd)hftp1.b_message;
        s1.getClass();
        gtxd1.b |= 4;
        gtxd1.g = s1;
        ibuq.f(hfsf0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtxc gtxc0 = this.h;
        gtxd gtxd2 = (gtxd)hftp1.b_message;
        hfsf0.getClass();
        gtxd2.b |= 8;
        gtxd2.h = hfsf0;
        ibuq.f(gtxc0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtwu gtwu0 = this.i;
        gtxd gtxd3 = (gtxd)hftp1.b_message;
        gtxc0.getClass();
        gtxd3.n = gtxc0;
        gtxd3.b |= 0x800;
        ibuq.c(gtwu0);
        ibuq.f(gtwu0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gtwu0.getClass();
        ((gtxd)hftv0).f = gtwu0;
        ((gtxd)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtxd gtxd4 = (gtxd)hftp1.b_message;
        gtxd4.b |= 16;
        gtxd4.j = v;
        hftp0.X(((ProtoLiteMessage)gtyb0.a()));
    }
}

