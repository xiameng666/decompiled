import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.Map;

public final class azml implements azmb {
    private final azmo a;

    public azml(azmo azmo0) {
        this.a = azmo0;
    }

    @Override  // azmb
    public final gged_interceptors a(ggeo ggeo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gemq.a).v_newBuilder();
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            azii azii0 = (azii)((Map.Entry)object0).getValue();
            Map map0 = DesugarCollections.unmodifiableMap((azii0.b == 2 ? ((azil)azii0.c) : azil.a).b);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gemp.a).v_newBuilder();
            glwu glwu0 = new glwu(((azki)((Map.Entry)object0).getKey()).a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gemp gemp0 = (gemp)hftp1.b_message;
            hfuf hfuf0 = gemp0.b;
            if(!hfuf0.c()) {
                gemp0.b = ProtoLiteMessage.C(hfuf0);
            }
            hfrj.E(glwu0, gemp0.b);
            for(Object object1: map0.entrySet()) {
                int v = (int)(((Integer)((Map.Entry)object1).getKey()));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gemp gemp1 = (gemp)hftp1.b_message;
                hfuf hfuf1 = gemp1.c;
                if(!hfuf1.c()) {
                    gemp1.c = ProtoLiteMessage.C(hfuf1);
                }
                gemp1.c.i(v);
                long v1 = (long)(((Long)((Map.Entry)object1).getValue()));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gemp gemp2 = (gemp)hftp1.b_message;
                hfui hfui0 = gemp2.d;
                if(!hfui0.c()) {
                    gemp2.d = ProtoLiteMessage.D(hfui0);
                }
                gemp2.d.g(v1);
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gemq gemq0 = (gemq)hftp0.b_message;
            gemp gemp3 = (gemp)hftp1.N_build();
            gemp3.getClass();
            hfuo hfuo0 = gemq0.b;
            if(!hfuo0.c()) {
                gemq0.b = ProtoLiteMessage.E(hfuo0);
            }
            gemq0.b.add(gemp3);
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
        gemq gemq1 = (gemq)hftp0.N_build();
        gemq1.getClass();
        genb0.c = gemq1;
        genb0.b = 11;
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

