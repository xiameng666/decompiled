import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;
import j..util.Objects;

public final class epuz extends epua {
    final ResolveAccountResponse a;
    final basp b;

    public epuz(basp basp0, ResolveAccountResponse resolveAccountResponse0) {
        this.a = resolveAccountResponse0;
        Objects.requireNonNull(basp0);
        this.b = basp0;
        super();
    }

    @Override  // epua
    public final void f(ConnectionResult connectionResult0, AuthAccountResult authAccountResult0) {
        SignInResponse signInResponse0 = new SignInResponse(connectionResult0, this.a);
        this.b.b.b.a(signInResponse0);
    }
}

