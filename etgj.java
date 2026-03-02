import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import j..util.Objects;

final class etgj extends eszx {
    final evqp a;

    public etgj(etgl etgl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(etgl0);
        super();
    }

    @Override  // eszx
    public final void b(Status status0, GetActiveAccountResponse getActiveAccountResponse0) {
        azzf.c(status0, getActiveAccountResponse0.a, this.a);
    }
}

