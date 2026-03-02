import com.google.android.gms.common.api.Scope;

public final class bxtq {
    public static gixr a(String s, Scope[] arr_scope, eppt eppt0) {
        return bxtq.b(s, arr_scope, eppt0.g, eppt0.c, eppt0.e, eppt0.b);
    }

    public static gixr b(String s, Scope[] arr_scope, String s1, boolean z, boolean z1, boolean z2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gixn)hftv0).b |= 8;
        ((gixn)hftv0).f = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gixn)hftv1).b |= 0x20;
        ((gixn)hftv1).h = z1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixn gixn0 = (gixn)hftp0.b_message;
        gixn0.b |= 16;
        gixn0.g = z2;
        if(arr_scope != null) {
            ggfp ggfp0 = ggch.k(arr_scope).l(new bxtp()).p();
            boolean z3 = ggfp0.contains("email");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixn gixn1 = (gixn)hftp0.b_message;
            gixn1.b |= 2;
            gixn1.d = z3;
            boolean z4 = ggfp0.contains("profile");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixn gixn2 = (gixn)hftp0.b_message;
            gixn2.b |= 4;
            gixn2.e = z4;
            boolean z5 = ggfp0.contains("openid");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixn gixn3 = (gixn)hftp0.b_message;
            gixn3.b |= 1;
            gixn3.c = z5;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixo.a).v_newBuilder();
        gixn gixn4 = (gixn)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        gixn4.getClass();
        ((gixo)hftv2).c = gixn4;
        ((gixo)hftv2).b |= 1;
        if(s != null) {
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixo gixo0 = (gixo)hftp1.b_message;
            gixo0.b |= 2;
            gixo0.d = s;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(s1 != null) {
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp2.b_message;
            gixr0.b |= 2;
            gixr0.e = s1;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gixr)hftp2.b_message).d = 4;
        ((gixr)hftp2.b_message).b |= 1;
        gixo gixo1 = (gixo)hftp1.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gixr gixr1 = (gixr)hftp2.b_message;
        gixo1.getClass();
        gixr1.h = gixo1;
        gixr1.b |= 16;
        return (gixr)hftp2.N_build();
    }
}

