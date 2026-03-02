import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;

final class czau extends czar {
    final String a;
    final PayloadTransferUpdate b;

    public czau(czaw czaw0, String s, PayloadTransferUpdate payloadTransferUpdate0) {
        this.a = s;
        this.b = payloadTransferUpdate0;
        Objects.requireNonNull(czaw0);
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
        ((cuwv)object0).b(this.a, payloadTransferUpdate0);
    }
}

