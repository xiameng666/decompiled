import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;

final class czaz extends czar {
    final cuwd a;
    final PayloadTransferUpdate b;

    public czaz(czbb czbb0, cuwd cuwd0, PayloadTransferUpdate payloadTransferUpdate0) {
        this.a = cuwd0;
        this.b = payloadTransferUpdate0;
        Objects.requireNonNull(czbb0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        PayloadTransferUpdate payloadTransferUpdate0 = new PayloadTransferUpdate();
        payloadTransferUpdate0.a = this.b.a;
        payloadTransferUpdate0.b = this.b.b;
        payloadTransferUpdate0.c = this.b.c;
        payloadTransferUpdate0.d = this.b.d;
        payloadTransferUpdate0.b = 2;
        ((cvxf)object0).b(this.a, payloadTransferUpdate0);
    }
}

