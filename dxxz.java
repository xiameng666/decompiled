public final class dxxz implements gfsi {
    public final String a;
    public final String b;
    public final long c;
    public final fsym d;

    public dxxz(String s, String s1, long v, fsym fsym0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = fsym0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        esdz esdz0 = (esdz)((ProtoLiteMessage)esea.a).v_newBuilder();
        String s = this.a;
        String s1 = this.b;
        long v = this.c;
        esdz0.a(gggq.d(((esea)object0).b, new dxxv(s, s1, v)));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)esdy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((esdy)hftv0).b |= 1;
        ((esdy)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((esdy)hftv1).b |= 2;
        ((esdy)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((esdy)hftv2).b |= 8;
        ((esdy)hftv2).f = v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        esdy esdy0 = (esdy)hftp0.b_message;
        this.d.getClass();
        esdy0.e = this.d;
        esdy0.b |= 4;
        if(!esdz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)esdz0).ensureMutable();
        }
        esea esea0 = (esea)esdz0.b_message;
        esdy esdy1 = (esdy)hftp0.N_build();
        esdy1.getClass();
        esea0.b();
        esea0.b.add(esdy1);
        return (esea)((ProtoLiteBuilder)esdz0).N_build();
    }
}

