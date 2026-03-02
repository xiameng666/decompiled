import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public final class eprx implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;
    public final RecordConsentRequest b;

    public eprx(SignInChimeraActivity signInChimeraActivity0, RecordConsentRequest recordConsentRequest0) {
        this.a = signInChimeraActivity0;
        this.b = recordConsentRequest0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        eptv eptv0 = this.a.w;
        azzc azzc0 = new azzc();
        azzc0.a = new eptn(eptv0, this.b);
        azzc0.d = 6305;
        return fhra.b(eptv0.jn(azzc0.a()));
    }
}

