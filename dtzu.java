import android.text.TextUtils;

public final class dtzu {
    public static guez a(String s) {
        if(TextUtils.isEmpty(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guez.a).v_newBuilder();
            guex guex0 = (guex)((ProtoLiteMessage)guey.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gufc.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gufc)hftp1.b_message).d = 4;
            ((gufc)hftp1.b_message).e = (int)0x7F0809DD;  // drawable:pay_id_card
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gufc)hftp1.b_message).f = 0xFF;
            guex0.l(hftp1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guez guez0 = (guez)hftp0.b_message;
            guey guey0 = (guey)((ProtoLiteBuilder)guex0).N_build();
            guey0.getClass();
            guez0.c = guey0;
            guez0.b |= 1;
            return (guez)hftp0.N_build();
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)guez.a).v_newBuilder();
        guex guex1 = (guex)((ProtoLiteMessage)guey.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gufg.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s.getClass();
        ((gufg)hftv0).c = 3;
        ((gufg)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gufg)hftp3.b_message).e = 0xFF;
        guex1.k(((gufg)hftp3.N_build()));
        guey guey1 = (guey)((ProtoLiteBuilder)guex1).N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        guez guez1 = (guez)hftp2.b_message;
        guey1.getClass();
        guez1.c = guey1;
        guez1.b |= 1;
        return (guez)hftp2.N_build();
    }
}

