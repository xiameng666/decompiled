import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

final class azwo extends epua {
    private final WeakReference a;

    public azwo(azwr azwr0) {
        this.a = new WeakReference(azwr0);
    }

    @Override  // epua
    public final void a(SignInResponse signInResponse0) {
        azwr azwr0 = (azwr)this.a.get();
        if(azwr0 == null) {
            return;
        }
        azwn azwn0 = new azwn(this, azwr0, azwr0, signInResponse0);
        azwr0.a.g(azwn0);
    }
}

