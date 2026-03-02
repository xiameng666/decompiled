import java.util.Map.Entry;

public final class azmm implements azmb {
    private final azmo a;

    public azmm(azmo azmo0) {
        this.a = azmo0;
    }

    @Override  // azmb
    public final gged_interceptors a(ggeo ggeo0) {
        long v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gemt.a).v_newBuilder();
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((azii)map$Entry0.getValue()).b == 1) {
                azii azii0 = (azii)map$Entry0.getValue();
                v = azii0.b == 1 ? ((long)(((Long)azii0.c))) : 0L;
            }
            else {
                v = 1L;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gems.a).v_newBuilder();
            glwu glwu0 = new glwu(((azki)map$Entry0.getKey()).a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gems gems0 = (gems)hftp1.b_message;
            hfuf hfuf0 = gems0.b;
            if(!hfuf0.c()) {
                gems0.b = ProtoLiteMessage.C(hfuf0);
            }
            hfrj.E(glwu0, gems0.b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gems)hftp1.b_message).c = v;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gemt gemt0 = (gemt)hftp0.b_message;
            gems gems1 = (gems)hftp1.N_build();
            gems1.getClass();
            hfuo hfuo0 = gemt0.b;
            if(!hfuo0.c()) {
                gemt0.b = ProtoLiteMessage.E(hfuo0);
            }
            gemt0.b.add(gems1);
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)azio.a).v_newBuilder();
        azmo azmo0 = this.a;
        ByteString hfsf0 = azmo0.a();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((azio)hftp2.b_message).c = hfsf0;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)genb.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        genb genb0 = (genb)hftp3.b_message;
        gemt gemt1 = (gemt)hftp0.N_build();
        gemt1.getClass();
        genb0.c = gemt1;
        genb0.b = 10;
        ByteString hfsf1 = azmo0.a();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((genb)hftp3.b_message).d = hfsf1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        azio azio0 = (azio)hftp2.b_message;
        genb genb1 = (genb)hftp3.N_build();
        genb1.getClass();
        azio0.d = genb1;
        azio0.b |= 1;
        return gged_interceptors.l(((azio)hftp2.N_build()));
    }

    @Override  // azmb
    public final gged_interceptors b() {
        return ggna.a;
    }
}

