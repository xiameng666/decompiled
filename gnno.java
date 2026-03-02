import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gnno implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gniv gniv0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gniv.a).x_newMutableInstance();
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
            gniv0 = (gniv)hftv0;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", hfur0);
        }
        gnlk gnlk0 = new gnlk();
        gniw gniw0 = gniv0.c == null ? gniw.a : gniv0.c;
        gnlk0.b = (gnll)gnnt.h.b((gnhl.b(gniw0.b) == null ? gnhl.g : gnhl.b(gniw0.b)));
        gniw gniw1 = gniv0.c == null ? gniw.a : gniv0.c;
        gnlk0.c = (gnll)gnnt.h.b((gnhl.b(gniw1.c) == null ? gnhl.g : gnhl.b(gniw1.c)));
        gnlk0.a = gnnt.d(gniv0.e);
        gnlk0.b(gniv0.d);
        gnlk0.c((gniv0.c == null ? gniw.a : gniv0.c).d);
        gmzu gmzu0 = gnnt.g;
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        gnlk0.d = (gnlm)gmzu0.b(gnim0);
        return gnlk0.a();
    }
}

