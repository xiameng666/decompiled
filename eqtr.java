import android.content.Context;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import java.nio.ByteBuffer;

public final class eqtr {
    public final bmbu a;
    private static final AuthenticationExtensions b;

    static {
        eqtr.b = new AuthenticationExtensions(null, null, null, new GoogleMultiAssertionExtension(true), null, null, null, null, null, null, null, null, null);
    }

    public eqtr(Context context0, byte[] arr_b) {
        bmbt bmbt0 = bmbt.b;
        String s = ghjc.e.g().o(arr_b);
        byte[] arr_b1 = bbms.n(context0, "com.google.android.gms", "SHA-256");
        if(arr_b1 == null) {
            throw new IllegalArgumentException("Failed to get package certificate hash bytes.");
        }
        this.a = new bmbu(bmbt0, s, "android:apk-key-hash:" + Base64.encodeToString(ByteBuffer.wrap(arr_b1).array(), 11), "com.google.android.gms", null);
    }

    public final blzt a() {
        bmad bmad0 = new bmad();
        bmad0.d("google.com");
        bmad0.b(this.a.b());
        bmad0.d = true;
        bmad0.b = eqtr.b;
        return bmad0.a();
    }
}

