import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import j..util.Objects;

final class cyzk extends czar {
    final OnConnectionResultParams a;
    final Status b;

    public cyzk(cyzp cyzp0, OnConnectionResultParams onConnectionResultParams0, Status status0) {
        this.a = onConnectionResultParams0;
        this.b = status0;
        Objects.requireNonNull(cyzp0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        ((cuvg)object0).c(this.a.a, new cuvl(this.b));
    }
}

