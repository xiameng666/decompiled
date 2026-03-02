import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Locale;

public final class ahjd {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public ahjd(ahjc ahjc0) {
        this.a = ahjc0.a;
        this.c = ahjc0.b;
        this.d = ahjc0.d;
        this.e = ahjc0.e;
        this.b = ahjc0.c;
    }

    public static ahjd a(Credential credential0) {
        int v;
        ahjc ahjc0 = new ahjc();
        String s = credential0.a;
        if(Patterns.EMAIL_ADDRESS.matcher(s).matches()) {
            v = 2;
        }
        else {
            v = Patterns.PHONE.matcher(s).matches() ? 1 : 3;
        }
        String s1 = credential0.b;
        if(TextUtils.isEmpty(s1)) {
            ahjc0.d = ahjd.b(s, v);
        }
        else {
            ahjc0.d = s1;
            ahjc0.e = ahjd.b(s, v);
        }
        ahjc0.b(v);
        Uri uri0 = credential0.c;
        if(uri0 != null) {
            ahjc0.b = uri0.toString();
        }
        return new ahjd(ahjc0);
    }

    private static String b(String s, int v) {
        if(v == 1) {
            String s1 = ((aeoc)aeoc.a.b()).c(s);
            return kaj.b(Locale.getDefault()).c(s1);
        }
        return s;
    }
}

