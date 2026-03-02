import java.security.GeneralSecurityException;

public final class gncm implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        gnce gnce0 = (gnce)gmni0;
        try {
            byte[] arr_b = gmnp.b(gnce0.a);
            gnic gnic0 = gnic.a;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnic0), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = gmnp.b(gnce0.b);
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnic0), arr_b1, 0, arr_b1.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnio.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gnio gnio0 = (gnio)hftp0.b_message;
            ((gnic)hftv0).getClass();
            gnio0.c = (gnic)hftv0;
            gnio0.b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnip.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gnip gnip0 = (gnip)hftp1.b_message;
            ((gnic)hftv1).getClass();
            gnip0.c = (gnic)hftv1;
            gnip0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gnio gnio1 = (gnio)hftp0.b_message;
            gnip gnip1 = (gnip)hftp1.N_build();
            gnip1.getClass();
            gnio1.d = gnip1;
            gnio1.b |= 2;
            gnio gnio2 = (gnio)hftp0.N_build();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gnic0).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gnic)hftp2.b_message).b = "type.googleapis.com/google.crypto.tink.PrfBasedDeriverKey";
            ByteString hfsf0 = gnio2.getDefaultInstanceForType();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((gnic)hftv2).c = hfsf0;
            gnim gnim0 = gnim.b(((gnic)hftv1).d);
            if(gnim0 == null) {
                gnim0 = gnim.g;
            }
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gnic gnic1 = (gnic)hftp2.b_message;
            gnic1.d = gnim0.a();
            return gnbo.b(((gnic)hftp2.N_build()));
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Serializing PrfBasedKeyDerivationParameters failed: ", hfur0);
        }
    }
}

