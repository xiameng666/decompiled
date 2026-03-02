import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class ctuk extends cuwv {
    final PresenceDevice a;
    final ichm b;

    public ctuk(PresenceDevice presenceDevice0, ichm ichm0) {
        this.a = presenceDevice0;
        this.b = ichm0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        ibuq.f(s, "endpointId");
        byte[] arr_b = cuwu0.k;
        if(arr_b == null) {
            return;
        }
        ctuj ctuj0 = new ctuj(this.b, s, arr_b, null);
        icbb.b(this.b, null, null, ctuj0, 3);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
        ibuq.f(s, "endpointId");
        ibuq.f(payloadTransferUpdate0, "update");
    }
}

