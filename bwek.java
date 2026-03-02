import j..time.Instant;

public final class bwek implements gfsi {
    public final String a;
    public final Instant b;

    public bwek(String s, Instant instant0) {
        this.a = s;
        this.b = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqqb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqb gqqb0 = (gqqb)hftp0.b_message;
        this.a.getClass();
        gqqb0.b |= 1;
        gqqb0.c = this.a;
        hfwn hfwn0 = hfyg.b(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqb gqqb1 = (gqqb)hftp0.b_message;
        hfwn0.getClass();
        gqqb1.d = hfwn0;
        gqqb1.b |= 2;
        gqqb gqqb2 = (gqqb)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqc)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((gqqc)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqqc gqqc0 = (gqqc)hftp1.b_message;
        gqqb2.getClass();
        hfuo hfuo0 = gqqc0.d;
        if(!hfuo0.c()) {
            gqqc0.d = ProtoLiteMessage.E(hfuo0);
        }
        gqqc0.d.add(gqqb2);
        return (gqqc)hftp1.N_build();
    }
}

