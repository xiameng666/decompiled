import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import j..util.Objects;

final class cyys extends czar {
    final OnConnectionResultParams a;
    final Status b;

    public cyys(cyyy cyyy0, OnConnectionResultParams onConnectionResultParams0, Status status0) {
        this.a = onConnectionResultParams0;
        this.b = status0;
        Objects.requireNonNull(cyyy0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        ((cuus)object0).c(this.a.a, new cuvl(this.b));
    }
}

