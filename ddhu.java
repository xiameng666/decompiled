import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import java.security.SecureRandom;
import java.util.Collection;

public final class ddhu {
    public static final QrCodeMetadata a(Uri uri0, boolean z) {
        byte[] arr_b = null;
        if(uri0 != null && hvqz.F()) {
            String s = hvqs.bc();
            hfuo hfuo0 = hvqs.aR().b;
            ibuq.e(hfuo0, "getElementList(...)");
            if(TextUtils.equals(uri0.getAuthority(), s) && TextUtils.equals(uri0.getPath(), "/qrcode")) {
                String s1 = uri0.buildUpon().encodedQuery(uri0.getEncodedFragment()).build().getQueryParameter("key");
                if(s1 != null) {
                    goto label_10;
                }
                s1 = uri0.getQueryParameter("key");
                if(s1 != null) {
                label_10:
                    byte[] arr_b1 = Base64.decode(s1, 11);
                    dckd dckd0 = new dckd();
                    dckd0.a = arr_b1;
                    dckd0.b = 1;
                    return dckd0.a();
                }
            }
            else if(hvqz.H() && z) {
                for(Object object0: hfuo0) {
                    if(TextUtils.equals(uri0.getAuthority(), ((String)object0))) {
                        String s2 = uri0.getLastPathSegment();
                        if(s2 != null) {
                            arr_b = s2.getBytes(ibyo.a);
                            ibuq.e(arr_b, "getBytes(...)");
                        }
                        dckd dckd1 = new dckd();
                        dckd1.a = arr_b;
                        dckd1.b = 2;
                        return dckd1.a();
                    }
                }
            }
        }
        return null;
    }

    public static final String b(QrCodeMetadata qrCodeMetadata0) {
        String s = Base64.encodeToString(qrCodeMetadata0.a, 11);
        String s1 = hvqs.bc();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority(s1).appendPath("qrcode").encodedFragment(Uri.encode("key") + "=" + Uri.encode(s));
        if(hvqz.a.b().ah()) {
            SecureRandom secureRandom0 = new SecureRandom();
            byte[] arr_b = new byte[3];
            secureRandom0.nextBytes(arr_b);
            uri$Builder0.appendQueryParameter("r", Base64.encodeToString(arr_b, 11));
        }
        String s2 = uri$Builder0.build().toString();
        ibuq.e(s2, "toString(...)");
        return s2;
    }

    public static final boolean c(Uri uri0) {
        if(uri0 != null && hvqz.F()) {
            hfuo hfuo0 = hvqs.aR().b;
            ibuq.e(hfuo0, "getElementList(...)");
            if(hvqz.H()) {
                if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
                    return false;
                }
                for(Object object0: hfuo0) {
                    if(TextUtils.equals(uri0.getAuthority(), ((String)object0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static QrCodeMetadata d(Uri uri0) {
        return ddhu.a(uri0, true);
    }
}

