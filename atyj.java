import j..util.Collection.-EL;
import java.util.HashMap;
import java.util.Map;

public final class atyj {
    private final atyc a;

    public atyj(atyc atyc0) {
        this.a = atyc0;
    }

    public final void a(String s, gkey gkey0, String s1, int v, String s2) {
        this.b(1, s, new HashMap(), gkey0, 1, s1, v, s2);
    }

    public final void b(int v, String s, Map map0, gkey gkey0, int v1, String s1, int v2, String s2) {
        int v3;
        gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(map0.entrySet()).map(new atyi()).collect(ggaf.a);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glaw.a).v_newBuilder();
        switch(v - 1) {
            case 0: {
                v3 = 1;
                break;
            }
            case 1: {
                v3 = 2;
                break;
            }
            default: {
                v3 = 3;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glaw)hftv0).e = v3 - 1;
        ((glaw)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((glaw)hftv1).b |= 2;
        ((glaw)hftv1).f = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        glaw glaw0 = (glaw)hftp0.b_message;
        hfuo hfuo0 = glaw0.g;
        if(!hfuo0.c()) {
            glaw0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, glaw0.g);
        if(s1 == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glcm.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((glcm)hftp1.b_message).c = v1 - 1;
            ((glcm)hftp1.b_message).b |= 1;
            glcm glcm0 = (glcm)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glaw glaw1 = (glaw)hftp0.b_message;
            glcm0.getClass();
            glaw1.d = glcm0;
            glaw1.c = 5;
        }
        else {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glcn.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            glcn glcn0 = (glcn)hftp2.b_message;
            glcn0.b |= 1;
            glcn0.c = s1;
            glcn glcn1 = (glcn)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glaw glaw2 = (glaw)hftp0.b_message;
            glcn1.getClass();
            glaw2.d = glcn1;
            glaw2.c = 4;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glax.a).v_newBuilder();
        glaw glaw3 = (glaw)hftp0.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        glaw3.getClass();
        ((glax)hftv2).c = glaw3;
        ((glax)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        ((glax)hftv3).d = v2 - 1;
        ((glax)hftv3).b |= 2;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        glax glax0 = (glax)hftp3.b_message;
        s2.getClass();
        glax0.b |= 4;
        glax0.e = s2;
        glax glax1 = (glax)hftp3.N_build();
        atyc atyc0 = this.a;
        glah glah0 = atyc0.b();
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai0 = (glai)glah0.b_message;
        glax1.getClass();
        glai0.af = glax1;
        glai0.c |= 0x40000000;
        atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey0);
    }

    public final void c(String s, Map map0, gkey gkey0, int v) {
        this.b(2, s, map0, gkey0, v, "", 1, "");
    }
}

