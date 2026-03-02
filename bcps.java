import android.content.Context;
import java.io.IOException;

public final class bcps {
    public static final int a;
    private static final baun b;

    static {
        bcps.b = bcrh.a("audit_recorder");
    }

    public static byte[] a(Context context0, hobg hobg0, int v, grke grke0, hodo hodo0, evpz evpz0) {
        String s = Long.toHexString(bapf.h(context0));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp1.b_message;
        s.getClass();
        grkn0.b |= 1;
        grkn0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp0.b_message;
        grkn grkn1 = (grkn)hftp1.N_build();
        grkn1.getClass();
        grkr0.d = grkn1;
        grkr0.b |= 4;
        return bcps.b(context0, hobg0, v, grke0, hodo0, ((grkr)hftp0.N_build()), evpz0);
    }

    public static byte[] b(Context context0, hobg hobg0, int v, grke grke0, hodo hodo0, grkr grkr0, evpz evpz0) {
        gqtz gqtz0;
        gqts gqts1;
        int v3;
        int v2;
        int v1 = 2;
        switch(hobg0.ordinal()) {
            case 1: {
                v2 = gqtt.x.eR;
                break;
            }
            case 2: {
                v2 = gqtt.z.eR;
                break;
            }
            default: {
                v2 = gqtt.a.eR;
            }
        }
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqts.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(acqi.a());
            hftc hftc0 = hftc.a();
            hfsl hfsl0 = hfsf0.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gquc.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur0) {
                hfur hfur1 = hfur0.b ? new hfur(hfur0) : hfur0;
                hfur1.a = hftv0;
                throw hfur1;
            }
            catch(hfwr hfwr0) {
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur3 = new hfur(iOException0);
                hfur3.a = hftv0;
                throw hfur3;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            try {
                hfsl0.z(0);
            }
            catch(hfur hfur4) {
                hfur4.a = hftv0;
                throw hfur4;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            v3 = 3;
            gqts gqts0 = (gqts)hftp0.b_message;
            ((gquc)hftv0).getClass();
            gqts0.c = (gquc)hftv0;
            gqts0.b |= 1;
            gqts1 = (gqts)hftp0.N_build();
            switch(v) {
                case 1: {
                    gqtz0 = gqtz.ao;
                    goto label_59;
                }
                case 2: {
                    gqtz0 = gqtz.ap;
                    goto label_59;
                }
                case 3: {
                    goto label_58;
                }
            }
        }
        catch(hfur unused_ex) {
            bcps.b.f("failed to generate audit token", new Object[0]);
            return null;
        }
        gqtz0 = gqtz.a;
        goto label_59;
    label_58:
        gqtz0 = gqtz.al;
    label_59:
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grns grns0 = (grns)hftp1.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp2.b_message;
        grke0.getClass();
        grnk0.k = grke0;
        grnk0.b |= 0x800;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grns grns1 = (grns)hftp1.b_message;
        grnk grnk1 = (grnk)hftp2.N_build();
        grnk1.getClass();
        grns1.f = grnk1;
        grns1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grns grns2 = (grns)hftp1.N_build();
        grns2.getClass();
        grkg0.g = grns2;
        grkg0.b |= 8;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.D;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((grku)hftp3.b_message).c = gqub0.mk;
        ((grku)hftp3.b_message).b |= 1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grkc.a).v_newBuilder();
        switch(hodo0.ordinal()) {
            case 1: {
                v3 = 2;
                break;
            }
            case 2: {
                break;
            }
            default: {
                v3 = 1;
            }
        }
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((grkc)hftp5.b_message).c = v3 - 1;
        ((grkc)hftp5.b_message).b |= 1;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp4.b_message;
        grkc grkc0 = (grkc)hftp5.N_build();
        grkc0.getClass();
        grkv0.k = grkc0;
        grkv0.b |= 0x40;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grku grku0 = (grku)hftp3.b_message;
        grkv grkv1 = (grkv)hftp4.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grku grku1 = (grku)hftp3.N_build();
        grku1.getClass();
        grkg1.f = grku1;
        grkg1.b |= 4;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        grkr0.getClass();
        grkg2.d = grkr0;
        grkg2.b |= 1;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg3 = (grkg)grkf0.b_message;
        grkr0.getClass();
        grkg3.e = grkr0;
        grkg3.b |= 2;
        byte[] arr_b = ((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray();
        acqo acqo0 = new acqo();
        acqo0.b = v2;
        acqo0.d = gqts1.toBytesArray();
        if(!hrcv.f()) {
            if(hobg0.ordinal() != 2) {
                v1 = 1;
            }
            else if(!hrcv.a.b().b()) {
                v1 = 1;
            }
        }
        acqo0.a = v1;
        acqo0.b(arr_b);
        new acqn(context0).b(acqo0.a()).z(evpz0);
        return gqts1.toBytesArray();
    }

    public static int c(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 1;
            }
        }
    }
}

