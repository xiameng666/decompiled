import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gmss implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gngp gngp0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gngp.a).x_newMutableInstance();
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
            gngp0 = (gngp)hftv0;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", hfur0);
        }
        if(gngp0.c != 0) {
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        }
        gmpt gmpt0 = new gmpt();
        gmpt0.b(gngp0.b);
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        gmpt0.a = gmsv.a(gnim0);
        return gmpt0.a();
    }
}

