import android.util.Range;
import java.io.IOException;
import javax.crypto.SecretKey;

public final class athb {
    public final aqys a;
    public final atfv b;
    private static final Range c;

    static {
        athb.c = new Range(((int)1), ((int)2));
    }

    public athb(SecretKey secretKey0, aqys aqys0) {
        gftb.check(secretKey0);
        this.b = new atfv(secretKey0);
        gftb.check(aqys0);
        this.a = aqys0;
    }

    public final athh a(int v, arah arah0, long v1) {
        aqzz aqzz0;
        aqys aqys1;
        ByteString hfsf0;
        aran aran0;
        if((arah0.b & 0x20) != 0) {
            aqys aqys0 = this.a;
            byte[] arr_b = atha.a(this.b, arah0.h, arah0.g, aqys0);
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aran.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                aran0 = (aran)hftv0;
                hfsf0 = arah0.g;
                aqys1 = this.a;
            }
            catch(hfur hfur0) {
                aqys0.y(24);
                throw new athc("Error parsing EncryptedMetadata proto", hfur0);
            }
            try {
                hftc hftc1 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv1 = ((ProtoLiteMessage)aqzz.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc1);
                    hfwc0.g(hftv1);
                }
                catch(hfur hfur2) {
                    if(hfur2.b) {
                        hfur2 = new hfur(hfur2);
                    }
                    hfur2.a = hftv1;
                    throw hfur2;
                }
                catch(hfwr hfwr0) {
                    hfur hfur3 = hfwr0.a();
                    hfur3.a = hftv1;
                    throw hfur3;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur4 = new hfur(iOException0);
                    hfur4.a = hftv1;
                    throw hfur4;
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
                catch(hfur hfur5) {
                    hfur5.a = hftv1;
                    throw hfur5;
                }
                ProtoLiteMessage.P_makeImmutable(hftv1);
                aqzz0 = (aqzz)hftv1;
            }
            catch(hfur hfur1) {
                aqys1.y(24);
                throw new athc("Error parsing AuthenticatedMetadata proto", hfur1);
            }
            if(v == 0) {
                v = aqzz0.d;
            }
            else if(aqzz0.d != v) {
                this.a.y(37);
                throw new athc("Code level mismatch. Specified code level is " + v + ", but metadata was written with code level " + aqzz0.d);
            }
            this.b(v);
            aqys aqys2 = this.a;
            if((araj.b(aqzz0.c) == null ? araj.a : araj.b(aqzz0.c)) != araj.b) {
                aqys2.y(22);
                throw new athc("Unsupported CipherType: " + (araj.b(arah0.c) == null ? araj.a : araj.b(arah0.c)).c);
            }
            arae arae0 = aran0.e == null ? arae.a : aran0.e;
            if((arag.b(arae0.e) == null ? arag.a : arag.b(arae0.e)) != arag.b) {
                throw new athc("Unsupported ChunkOrderingType: " + (arag.b(arah0.d) == null ? arag.a : arag.b(arah0.d)).d);
            }
            araa araa0 = aran0.d == null ? araa.a : aran0.d;
            if((arac.b(araa0.c) == null ? arac.a : arac.b(araa0.c)) != arac.b) {
                aqys2.y(21);
                throw new athc("Unsupported ChecksumType: " + (arac.b(arah0.f) == null ? arac.a : arac.b(arah0.f)).c);
            }
            arak arak0 = aran0.c == null ? arak.a : aran0.c;
            aram aram0 = aram.b(arak0.c) == null ? aram.a : aram.b(arak0.c);
            if(aram0 != aram.b && aram0 != aram.c) {
                throw new athc("Unsupported CompressionMethod: " + aram0.d);
            }
            athg athg0 = new athg(null);
            athg0.c(2);
            athg0.b(atgy.a((aran0.e == null ? arae.a : aran0.e), v1));
            athg0.d((aran0.d == null ? araa.a : aran0.d).d);
            athg0.a = gfsx.m(aram0);
            return athg0.a();
        }
        this.a.y(37);
        throw new athc("Code level mismatch. Metadata was code level 1, expected 2 or higher.");
    }

    public final void b(int v) {
        Integer integer0 = v;
        if(athb.c.contains(integer0)) {
            if(!hqix.a.c().b().b.contains(integer0)) {
                return;
            }
            this.a.y(34);
            throw new athc("Unable to restore encrypted backup with disallowed code level " + v);
        }
        this.a.y(34);
        throw new athc("Unable to restore encrypted backup with unsupported code level " + v);
    }
}

