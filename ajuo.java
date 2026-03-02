import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ajuo extends ajtb {
    final evqp a;

    public ajuo(ajup ajup0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajup0);
        super();
    }

    @Override  // ajtc
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        azzf.c((status0.d() ? Status.b : status0), status0.k, this.a);
    }
}

