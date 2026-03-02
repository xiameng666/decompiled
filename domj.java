import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import java.util.UUID;

@ibnh
public final class domj {
    public final ContentResolver a;

    public domj(Context context0) {
        domj.b();
        this.a = context0.getContentResolver();
    }

    public final String a() {
        return this.e("pay_session_id");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public final String c() {
        return this.e("tokenization_session_id");
    }

    public final void d() {
        String s = domj.b();
        Settings.Secure.putString(this.a, "pay_session_id", s);
        String s1 = domj.b();
        Settings.Secure.putString(this.a, "tokenization_session_id", s1);
    }

    private final String e(String s) {
        ContentResolver contentResolver0 = this.a;
        String s1 = Settings.Secure.getString(contentResolver0, s);
        if(s1 == null) {
            s1 = domj.b();
            Settings.Secure.putString(contentResolver0, s, s1);
        }
        return s1;
    }
}

