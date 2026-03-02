import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gmsa implements gnay {
    @Override  // gnay
    public final gmni a(gnbs gnbs0) {
        gnhq gnhq0;
        gnfz gnfz0;
        gnic gnic0 = ((gnbo)gnbs0).b;
        if(!gnic0.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + ((gnbo)gnbs0).b.b);
        }
        try {
            hfsl hfsl0 = gnic0.c.k();
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gnfz.a).x_newMutableInstance();
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
            gnfz0 = (gnfz)hftv0;
            gnhq0 = gnfz0.d;
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", hfur0);
        }
        if(gnhq0 == null) {
            gnhq0 = gnhq.a;
        }
        if(gnhq0.e != 0) {
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        }
        gmon gmon0 = new gmon();
        gmon0.b((gnfz0.c == null ? gnge.a : gnfz0.c).d);
        gmon0.c((gnfz0.d == null ? gnhq.a : gnfz0.d).d);
        gnge gnge0 = gnfz0.c == null ? gnge.a : gnfz0.c;
        gmon0.d((gnge0.c == null ? gngf.a : gnge0.c).b);
        gnhq gnhq1 = gnfz0.d == null ? gnhq.a : gnfz0.d;
        gmon0.e((gnhq1.c == null ? gnhr.a : gnhq1.c).c);
        gnhq gnhq2 = gnfz0.d == null ? gnhq.a : gnfz0.d;
        gnhr gnhr0 = gnhq2.c == null ? gnhr.a : gnhq2.c;
        gmon0.a = gmsd.a((gnhl.b(gnhr0.b) == null ? gnhl.g : gnhl.b(gnhr0.b)));
        gnim gnim0 = gnim.b(((gnbo)gnbs0).b.d);
        if(gnim0 == null) {
            gnim0 = gnim.g;
        }
        gmon0.b = gmsd.b(gnim0);
        return gmon0.a();
    }
}

