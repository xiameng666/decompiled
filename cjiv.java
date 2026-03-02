import java.util.Random;

public final class cjiv implements fkmk {
    private final ggtn a;
    private final cftz b;
    private final long c;
    private final Random d;

    public cjiv(long v) {
        this.a = ggtn.d();
        this.b = cftz.v();
        this.c = v;
        this.d = gftq.b;
    }

    @Override  // fkmk
    public final void a(glom glom0, long v, String s, String s1) {
        long v1 = this.c;
        int v2 = Long.compare(v1, 0L);
        if(v2 != 0) {
            if(v2 < 0) {
                ((ggtj)((ggtj)this.a.i()).ar(0x17E0)).A("Bad sample interval (negative number): %d", v1);
                return;
            }
            if(this.d.nextLong() % v1 == 0L) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnx.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((glnx)hftv0).b |= 0x40;
                ((glnx)hftv0).i = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s.getClass();
                ((glnx)hftv1).b |= 0x80;
                ((glnx)hftv1).j = s;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glnx glnx0 = (glnx)hftp0.b_message;
                s1.getClass();
                glnx0.b |= 1;
                glnx0.c = s1;
                glnx glnx1 = (glnx)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((glnz)hftv2).b |= 0x80000;
                ((glnz)hftv2).s = v1;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                glnx1.getClass();
                ((glnz)hftv3).m = glnx1;
                ((glnz)hftv3).b |= 0x100;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glnz glnz0 = (glnz)hftp1.b_message;
                glom0.getClass();
                glnz0.U = glom0;
                glnz0.d |= 0x400;
                glnz glnz1 = (glnz)hftp1.N_build();
                cczb cczb0 = this.b.c(((ProtoLiteMessage)glnz1));
                cczb0.c = (int)20000;
                cczb0.a();
            }
        }
    }
}

