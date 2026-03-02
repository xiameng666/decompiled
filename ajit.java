import android.content.Context;

public final class ajit {
    public long a;
    public int b;
    public long c;
    public int d;
    private final Context e;
    private final int f;
    private final int g;

    public ajit(Context context0, int v, int v1) {
        this.d = 1;
        this.e = context0;
        this.f = v;
        this.g = v1;
    }

    public final void a(int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqm.a).v_newBuilder();
        int v2 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghqm)hftv0).b |= 8;
        ((ghqm)hftv0).g = v2;
        int v3 = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if(v3 == 0) {
            throw null;
        }
        ((ghqm)hftv1).i = v3;
        ((ghqm)hftv1).b |= 0x20;
        int v4 = this.g;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghqm)hftp0.b_message).h = v4;
        ((ghqm)hftp0.b_message).b |= 16;
        int v5 = ajiu.a(this.e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((ghqm)hftv2).b |= 4;
        ((ghqm)hftv2).f = v5;
        int v6 = this.f;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((ghqm)hftv3).b |= 2;
        ((ghqm)hftv3).e = v6;
        long v7 = this.a;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqm ghqm0 = (ghqm)hftp0.b_message;
        ghqm0.b |= 1;
        ghqm0.c = v7;
        if(hptj.a.b().a() && v1 > 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghqm ghqm1 = (ghqm)hftp0.b_message;
            ghqm1.b |= 0x40;
            ghqm1.j = v1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghqr.a).v_newBuilder();
        long v8 = this.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((ghqr)hftv4).b |= 2;
        ((ghqr)hftv4).d = v8;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghqr)hftp1.b_message).c = v - 1;
        ((ghqr)hftp1.b_message).b |= 1;
        long v9 = System.currentTimeMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghqr ghqr0 = (ghqr)hftp1.b_message;
        ghqr0.b |= 4;
        ghqr0.e = v9;
        ghqr ghqr1 = (ghqr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqm ghqm2 = (ghqm)hftp0.b_message;
        ghqr1.getClass();
        hfuo hfuo0 = ghqm2.d;
        if(!hfuo0.c()) {
            ghqm2.d = ProtoLiteMessage.E(hfuo0);
        }
        ghqm2.d.add(ghqr1);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.z;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((ghon)hftp2.b_message).e = ghom0.av;
        ((ghon)hftp2.b_message).b |= 1;
        ghqm ghqm3 = (ghqm)hftp0.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp2.b_message;
        ghqm3.getClass();
        ghon0.B = ghqm3;
        ghon0.b |= 0x20000000;
        ajiu.b(((ghon)hftp2.N_build()));
    }

    public static final void b(ghqs ghqs0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.as;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghon)hftv0).e = ghom0.av;
        ((ghon)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghqs0.getClass();
        ghon0.ao = ghqs0;
        ghon0.d |= 0x200;
        ajiu.b(((ghon)hftp0.N_build()));
    }
}

