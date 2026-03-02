import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gnml implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gngw gngw0;
        gngv gngv0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gngv.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur1) {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
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
            gngv0 = (gngv)hftv0;
            gngw0 = gngv0.c;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", hfur0);
        }
        if(gngw0 == null) {
            gngw0 = gngw.a;
        }
        gnjg gnjg0 = gnmq.f((gnhl.b(gngw0.b) == null ? gnhl.g : gnhl.b(gngw0.b)));
        gngw gngw1 = gngv0.c == null ? gngw.a : gngv0.c;
        gnjh gnjh0 = gnmq.h((gngz.b(gngw1.d) == 0 ? 1 : gngz.b(gngw1.d)));
        gngw gngw2 = gngv0.c == null ? gngw.a : gngv0.c;
        gnjf gnjf0 = gnmq.e((gnhj.b(gngw2.c) == null ? gnhj.f : gnhj.b(gngw2.c)));
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        return gnje.a(gnjh0, gnjf0, gnjg0, gnmq.g(gnim0));
    }
}

