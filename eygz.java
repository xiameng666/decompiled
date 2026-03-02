import android.content.Context;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;

public final class eygz {
    public static final int a;
    private static final Charset b;

    static {
        bboh.b("ActiveUnlock", bbcu.fr);
        Charset charset0 = Charset.forName("UTF-8");
        ibuq.e(charset0, "forName(...)");
        eygz.b = charset0;
    }

    public static final boolean a(String s, Context context0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        hfuo hfuo0 = hzzm.b().b;
        ibuq.e(hfuo0, "getOemCompanionsList(...)");
        ibuq.f(s, "packageName");
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        byte[] arr_b = s.getBytes(eygz.b);
        ibuq.e(arr_b, "getBytes(...)");
        byte[] arr_b1 = messageDigest0.digest(arr_b);
        ibuq.e(arr_b1, "digest(...)");
        String s1 = bboy.c(arr_b1);
        for(Object object0: hfuo0) {
            if(!ibuq.m(((hgih)object0).b, s1)) {
                continue;
            }
            goto label_17;
        }
        object0 = null;
    label_17:
        if(((hgih)object0) == null) {
            return false;
        }
        hfuo hfuo1 = ((hgih)object0).c;
        ibuq.e(hfuo1, "getSignatureDigestsList(...)");
        gged_interceptors gged0 = bbms.d(context0, s, "SHA1");
        ibuq.e(gged0, "getPackageCertificateHistoryHashBytes(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object1 = ggqk0.next();
            arrayList0.add(bboy.c(((byte[])object1)));
        }
        return !ibpo.av(arrayList0, hfuo1).isEmpty();
    }
}

