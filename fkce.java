import java.util.List;

public final class fkce implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glph.a).v_newBuilder();
        long v = 0L;
        long v1 = 0L;
        for(Object object1: ((List)object0)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glpg.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glnx.a).v_newBuilder();
            fjcl fjcl0 = ((fjce)object1).c;
            if(fjcl0 == null) {
                fjcl0 = fjcl.a;
            }
            String s = fjcl0.d;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s.getClass();
            ((glnx)hftv0).b |= 4;
            ((glnx)hftv0).e = s;
            fjcl fjcl1 = ((fjce)object1).c;
            if(fjcl1 == null) {
                fjcl1 = fjcl.a;
            }
            String s1 = fjcl1.c;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            s1.getClass();
            ((glnx)hftv1).b |= 1;
            ((glnx)hftv1).c = s1;
            int v2 = ((fjce)object1).f;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((glnx)hftv2).b |= 2;
            ((glnx)hftv2).d = v2;
            long v3 = ((fjce)object1).d;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((glnx)hftv3).b |= 0x40;
            ((glnx)hftv3).i = v3;
            String s2 = ((fjce)object1).e;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            glnx glnx0 = (glnx)hftp2.b_message;
            s2.getClass();
            glnx0.b |= 0x80;
            glnx0.j = s2;
            glnx glnx1 = (glnx)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            glnx1.getClass();
            ((glpg)hftv4).c = glnx1;
            ((glpg)hftv4).b |= 1;
            long v4 = ((fjce)object1).h;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp1.b_message;
            ((glpg)hftv5).b |= 2;
            ((glpg)hftv5).d = v4;
            long v5 = ((fjce)object1).g;
            if(!hftv5.isImmutable()) {
                hftp1.ensureMutable();
            }
            glpg glpg0 = (glpg)hftp1.b_message;
            glpg0.b |= 4;
            glpg0.e = v5;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glph glph0 = (glph)hftp0.b_message;
            glpg glpg1 = (glpg)hftp1.N_build();
            glpg1.getClass();
            hfuo hfuo0 = glph0.c;
            if(!hfuo0.c()) {
                glph0.c = ProtoLiteMessage.E(hfuo0);
            }
            glph0.c.add(glpg1);
            v += ((fjce)object1).h;
            v1 += ((fjce)object1).g;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((glph)hftv6).b |= 1;
        ((glph)hftv6).d = v;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        glph glph1 = (glph)hftp0.b_message;
        glph1.b |= 2;
        glph1.e = v1;
        return (glph)hftp0.N_build();
    }
}

