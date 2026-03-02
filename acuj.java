import android.os.SystemClock;

public final class acuj implements ibts {
    public final long a;

    public acuj(long v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((clcp)object0), "response");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghpb.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        clcq clcq0 = ((clcp)object0).a;
        String s = clcq0.f();
        ibuq.e(s, "getUrl(...)");
        ibuq.f(s, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghpb ghpb0 = (ghpb)hftp1.b_message;
        s.getClass();
        ghpb0.b |= 2;
        ghpb0.c = s;
        long v = SystemClock.elapsedRealtime() - this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghpb ghpb1 = (ghpb)hftp1.b_message;
        ghpb1.b |= 4;
        ghpb1.d = v;
        int v1 = clcq0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghpb ghpb2 = (ghpb)hftp1.b_message;
        ghpb2.b |= 8;
        ghpb2.e = v1;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((ghpb)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ((ghpb)hftv0).getClass();
        ghon0.i = (ghpb)hftv0;
        ghon0.b |= 0x20;
        ghom ghom0 = ghom.f;
        ibuq.f(ghom0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghon)hftp0.b_message).e = ghom0.av;
        ((ghon)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        cduy.v().c(((ProtoLiteMessage)(((ghon)hftv1)))).a();
        return (clcp)object0;
    }
}

