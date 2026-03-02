import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;

public final class agrv implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        return Patterns.EMAIL_ADDRESS.matcher(((Credential)object0).a).matches();
    }
}

