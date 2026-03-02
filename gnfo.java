import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gnfo implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gnhn gnhn0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gnhn.a).x_newMutableInstance();
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
            gnhn0 = (gnhn)hftv0;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: ", hfur0);
        }
        if(gnhn0.e != 0) {
            throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: unknown Version " + gnhn0.e);
        }
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        if(gnim0 != gnim.d) {
            throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted");
        }
        gnez gnez0 = new gnez();
        gnez0.b(gnhn0.d);
        gnho gnho0 = gnhn0.c == null ? gnho.a : gnhn0.c;
        gnez0.a = gnfr.a((gnhl.b(gnho0.b) == null ? gnhl.g : gnhl.b(gnho0.b)));
        gnez0.c(gnsj.b((gnhn0.c == null ? gnho.a : gnhn0.c).c.toByteArray()));
        return gnez0.a();
    }
}

