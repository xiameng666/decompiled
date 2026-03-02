import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

public final class epva extends bxoi {
    public final epvc a;
    public final epub b;
    private final SignInRequest c;
    private final epuy d;

    public epva(epvc epvc0, epub epub0, SignInRequest signInRequest0, epuy epuy0) {
        super(44, "SignIn");
        this.a = epvc0;
        this.b = epub0;
        this.c = signInRequest0;
        this.d = epuy0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        basp basp0 = new basp(this, context0);
        new epuu(this.a, this.c.b, basp0, this.d).f(context0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        SignInResponse signInResponse0 = new SignInResponse();
        this.b.a(signInResponse0);
    }
}

