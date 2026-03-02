import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import j..util.Objects;

final class eptu extends epua {
    final evqp a;

    public eptu(eptv eptv0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(eptv0);
        super();
    }

    @Override  // epua
    public final void f(ConnectionResult connectionResult0, AuthAccountResult authAccountResult0) {
        azzf.b(Status.b, authAccountResult0, this.a);
    }
}

