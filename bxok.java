import com.google.android.gms.common.api.Status;

public final class bxok {
    public static gixr a(bxnj bxnj0, bxof bxof0, String s) {
        int v = bxof0.e.i() ? ((Status)bxof0.e.d()).i : 0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gixl)hftv0).c = bxnj0.bA;
        ((gixl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gixl)hftv1).b |= 4;
        ((gixl)hftv1).e = v;
        long v1 = bxof0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixl gixl0 = (gixl)hftp0.b_message;
        gixl0.b |= 2;
        gixl0.d = v1;
        gixl gixl1 = (gixl)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gixr)hftv2).d = 2;
        ((gixr)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        gixl1.getClass();
        ((gixr)hftv3).f = gixl1;
        ((gixr)hftv3).b |= 4;
        if(s != null) {
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp1.b_message;
            gixr0.b |= 2;
            gixr0.e = s;
        }
        return (gixr)hftp1.N_build();
    }

    public static gixr b(int v, bxoj bxoj0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gixs)hftv0).c = v - 1;
        ((gixs)hftv0).b |= 1;
        long v1 = bxoj0.c - bxoj0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gixs)hftv1).b |= 4;
        ((gixs)hftv1).e = v1;
        long v2 = bxoj0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixs gixs0 = (gixs)hftp0.b_message;
        gixs0.b |= 2;
        gixs0.d = v2;
        gixs gixs1 = (gixs)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gixr)hftv2).d = 1;
        ((gixr)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        gixs1.getClass();
        ((gixr)hftv3).g = gixs1;
        ((gixr)hftv3).b |= 8;
        if(s != null) {
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp1.b_message;
            gixr0.b |= 2;
            gixr0.e = s;
        }
        return (gixr)hftp1.N_build();
    }
}

