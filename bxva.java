import android.content.Intent;
import com.google.android.gms.identitycredentials.GetCredentialResponse;

public final class bxva {
    public static final void a(Intent intent0, String s, String s1) {
        ibuq.f(s, "errorType");
        intent0.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE", s);
        intent0.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE", s1);
    }

    public static final void b(Intent intent0, GetCredentialResponse getCredentialResponse0) {
        intent0.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE", getCredentialResponse0.a.a);
        intent0.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA", getCredentialResponse0.a.b);
    }
}

