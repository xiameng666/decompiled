import com.google.firebase.auth.internal.FederatedSignInActivity;
import j..util.Objects;

public final class gozn implements Runnable {
    final FederatedSignInActivity a;

    public gozn(FederatedSignInActivity federatedSignInActivity0) {
        Objects.requireNonNull(federatedSignInActivity0);
        this.a = federatedSignInActivity0;
        super();
    }

    @Override
    public final void run() {
        this.a.c();
        FederatedSignInActivity.k = null;
    }
}

