import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.auth.folsom.SharedKey;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.List;

public final class blpn implements glzn {
    public final blpq a;
    public final boolean b;

    public blpn(blpq blpq0, boolean z) {
        this.a = blpq0;
        this.b = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        hery hery0 = (hery)((List)((Pair)object0).first).get(0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hery0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hery0));
        long v = ((bxos)bxos.a.b()).d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        blpq blpq0 = this.a;
        hery hery1 = (hery)hftp0.b_message;
        hery1.b |= 0x100;
        hery1.n = v;
        if(hsvs.k() && blpq0.f && blpq0.g != null && blpq0.a != null) {
            if(hsvs.l()) {
                SharedKey sharedKey0 = blpq0.g;
                gftb.check(sharedKey0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hery hery2 = (hery)hftp0.b_message;
                hery2.b |= 0x200;
                hery2.o = sharedKey0.a;
            }
            SharedKey sharedKey1 = blpq0.g;
            gftb.check(sharedKey1);
            byte[] arr_b = blpr.d(sharedKey1.b);
            SecureRandom secureRandom0 = new SecureRandom();
            PrivateKey privateKey0 = blpq0.a;
            gftb.check(privateKey0);
            byte[] arr_b1 = privateKey0.getEncoded();
            if(arr_b1 != null) {
                if(blpq0.d != null) {
                    ByteString hfsf0 = ByteString.copyFrom(blpr.e(arr_b, arr_b1, blpr.a, secureRandom0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hery)hftp0.b_message).c = 9;
                    ((hery)hftp0.b_message).d = hfsf0;
                }
                else if(blpq0.e != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)herx.a).v_newBuilder();
                    ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    herx herx0 = (herx)hftp1.b_message;
                    herx0.b |= 1;
                    herx0.c = hfsf1;
                    ByteString hfsf2 = blpq0.e;
                    gftb.check(hfsf2);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    herx herx1 = (herx)hftp1.b_message;
                    herx1.b |= 2;
                    herx1.d = hfsf2;
                    ByteString hfsf3 = ByteString.copyFrom(blpr.e(arr_b, ((herx)hftp1.N_build()).toBytesArray(), blpr.b, secureRandom0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hery)hftp0.b_message).c = 12;
                    ((hery)hftp0.b_message).d = hfsf3;
                }
            }
        }
        if(this.b) {
            gmcd gmcd0 = fhra.b(((blpe)blpe.b.b()).b(((Account)((gftm)blpq0.e()).a), ((hery)hftp0.N_build())));
            gmbu.t(gmcd0, new blpp(blpq0), gmap.a);
            return gmcd0;
        }
        return gmbx.a;
    }
}

