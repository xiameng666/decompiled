import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import j..util.Objects;

final class czam extends czar {
    final OnEndpointFoundParams a;

    public czam(czap czap0, OnEndpointFoundParams onEndpointFoundParams0) {
        this.a = onEndpointFoundParams0;
        Objects.requireNonNull(czap0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        OnEndpointFoundParams onEndpointFoundParams0 = this.a;
        if(czap.g(onEndpointFoundParams0)) {
            ((cuwp)object0).b("__UNRECOGNIZED_BLUETOOTH_DEVICE__", new cuwf(onEndpointFoundParams0.b, "__UNRECOGNIZED_BLUETOOTH_DEVICE__", "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes()));
            return;
        }
        ((cuwp)object0).b(onEndpointFoundParams0.a, new cuwf(onEndpointFoundParams0.b, onEndpointFoundParams0.c, onEndpointFoundParams0.e));
    }
}

