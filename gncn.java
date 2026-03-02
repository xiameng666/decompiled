import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gncn implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gnip gnip0;
        gnio gnio0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.PrfBasedDeriverKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to PrfBasedKeyDerivationKeyProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gnio.a).x_newMutableInstance();
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
            gnio0 = (gnio)hftv0;
            gnip0 = gnio0.d;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing PrfBasedDeriverKeyFormat failed: ", hfur0);
        }
        if(gnip0 == null) {
            gnip0 = gnip.a;
        }
        gmni gmni0 = gmnp.a((gnip0.c == null ? gnic.a : gnip0.c).toBytesArray());
        gmni gmni1 = gmnp.a((gnio0.c == null ? gnic.a : gnio0.c).toBytesArray());
        if(!(gmni1 instanceof gnfm)) {
            throw new GeneralSecurityException("Non-PRF parameters stored in the field prf_key_template");
        }
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        gnip gnip1 = gnio0.d == null ? gnip.a : gnio0.d;
        gnic gnic1 = gnip1.c == null ? gnic.a : gnip1.c;
        if(gnim0 == (gnim.b(gnic1.d) == null ? gnim.g : gnim.b(gnic1.d))) {
            return new gnce(((gnfm)gmni1), gmni0);
        }
        throw new GeneralSecurityException("Output-Prefix mismatch in parameters while parsing " + gnio0);
    }
}

