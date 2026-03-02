import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;

final class aron implements gmbg {
    final PayloadTransferUpdate a;

    public aron(aroo aroo0, PayloadTransferUpdate payloadTransferUpdate0) {
        this.a = payloadTransferUpdate0;
        Objects.requireNonNull(aroo0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        arot.a.f("callbackThread (%s): Task for onPayloadTransferUpdate (payload %s) failed. " + throwable0, new Object[]{Thread.currentThread().getName(), ((long)this.a.a)});
    }

    @Override  // gmbg
    public final void b(Object object0) {
        arot.a.d("callbackThread (%s): Task for onPayloadTransferUpdate (payload %s) succeeded.", new Object[]{Thread.currentThread().getName(), ((long)this.a.a)});
    }
}

