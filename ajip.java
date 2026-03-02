import android.content.Context;

public final class ajip {
    public int a;
    public int b;
    private final Context c;

    public ajip(Context context0) {
        this.c = context0;
    }

    public final void a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqp.a).v_newBuilder();
        int v = this.b;
        if(v != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghqp)hftp0.b_message).c = v;
            ((ghqp)hftp0.b_message).b |= 1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.A;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghon)hftp1.b_message).e = ghom0.av;
        ((ghon)hftp1.b_message).b |= 1;
        int v1 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqp ghqp0 = (ghqp)hftp0.b_message;
        if(v1 == 0) {
            throw null;
        }
        ghqp0.d = v1;
        ghqp0.b |= 2;
        int v2 = ajiu.a(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqp ghqp1 = (ghqp)hftp0.b_message;
        ghqp1.b |= 4;
        ghqp1.e = v2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghqp ghqp2 = (ghqp)hftp0.N_build();
        ghqp2.getClass();
        ghon0.C = ghqp2;
        ghon0.b |= 0x40000000;
        ajiu.b(((ghon)hftp1.N_build()));
    }
}

