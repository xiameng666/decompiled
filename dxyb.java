import j..util.Objects;

public final class dxyb implements gfsi {
    public final String a;
    public final String b;
    public final long c;
    public final gfsi d;

    public dxyb(String s, String s1, long v, gfsi gfsi0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = gfsi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = this.a;
        String s1 = this.b;
        long v = this.c;
        dxya dxya0 = new dxya(s, s1, v);
        hfuo hfuo0 = ((esea)object0).b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)esdy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((esdy)hftv0).b |= 2;
        ((esdy)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((esdy)hftv1).b |= 1;
        ((esdy)hftv1).c = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        esdy esdy0 = (esdy)hftp0.b_message;
        esdy0.b |= 8;
        esdy0.f = v;
        esdy esdy1 = (esdy)Objects.requireNonNull(((esdy)gggq.l(hfuo0, dxya0, ((esdy)hftp0.N_build()))));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)esdy1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)esdy1));
        fsym fsym0 = (fsym)this.d.apply((esdy1.e == null ? fsym.a : esdy1.e));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        esdy esdy2 = (esdy)hftp1.b_message;
        fsym0.getClass();
        esdy2.e = fsym0;
        esdy2.b |= 4;
        esdy esdy3 = (esdy)hftp1.N_build();
        esdz esdz0 = (esdz)((ProtoLiteMessage)esea.a).v_newBuilder();
        esdz0.a(gggq.d(((esea)object0).b, new gfti(dxya0)));
        if(!esdz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)esdz0).ensureMutable();
        }
        esea esea0 = (esea)esdz0.b_message;
        esdy3.getClass();
        esea0.b();
        esea0.b.add(esdy3);
        return (esea)((ProtoLiteBuilder)esdz0).N_build();
    }
}

