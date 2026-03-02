import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gnem implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gnhq gnhq0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gnhq.a).x_newMutableInstance();
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
            gnhq0 = (gnhq)hftv0;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", hfur0);
        }
        if(gnhq0.e != 0) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + gnhq0.e);
        }
        gndl gndl0 = new gndl();
        gndl0.b(gnhq0.d);
        gndl0.c((gnhq0.c == null ? gnhr.a : gnhq0.c).c);
        gnhr gnhr0 = gnhq0.c == null ? gnhr.a : gnhq0.c;
        gndl0.a = (gndm)gnep.b.b((gnhl.b(gnhr0.b) == null ? gnhl.g : gnhl.b(gnhr0.b)));
        gmzu gmzu0 = gnep.a;
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        gndl0.b = (gndn)gmzu0.b(gnim0);
        return gndl0.a();
    }
}

