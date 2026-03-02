import java.util.Set;

public final class ekdm {
    static ProtoLiteBuilder a(Set set0, boolean z) {
        if(set0 != null && !set0.isEmpty()) {
            gged_interceptors gged0 = gged_interceptors.C(set0);
            String s = String.valueOf(gged0.get(0));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdmt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gdmt)hftv0).d = 13;
            ((gdmt)hftv0).b |= 4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s.getClass();
            ((gdmt)hftv1).b |= 16;
            ((gdmt)hftv1).e = s;
            if(z) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdmt gdmt0 = (gdmt)hftp0.b_message;
                gdmt0.b |= 0x20;
                gdmt0.f = true;
            }
            for(int v = 1; v < ((ggna)gged0).c; ++v) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdlm.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gdlm)hftp1.b_message).c = 13;
                ((gdlm)hftp1.b_message).b |= 1;
                String s1 = String.valueOf(gged0.get(v));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gdlm gdlm0 = (gdlm)hftp1.b_message;
                s1.getClass();
                gdlm0.b |= 2;
                gdlm0.d = s1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdmt gdmt1 = (gdmt)hftp0.b_message;
                gdlm gdlm1 = (gdlm)hftp1.N_build();
                gdlm1.getClass();
                hfuo hfuo0 = gdmt1.i;
                if(!hfuo0.c()) {
                    gdmt1.i = ProtoLiteMessage.E(hfuo0);
                }
                gdmt1.i.add(gdlm1);
            }
            return hftp0;
        }
        return ((ProtoLiteMessage)gdmt.a).v_newBuilder();
    }
}

