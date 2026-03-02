import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.data.PinFallbackPayload;
import j..util.Objects;

final class eqyz extends cuwv {
    final eqza a;

    public eqyz(eqza eqza0) {
        Objects.requireNonNull(eqza0);
        this.a = eqza0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        baun baun0 = eqza.a;
        baun0.j("Received payload.", new Object[0]);
        eqza eqza0 = this.a;
        if(s.equals(eqza0.m)) {
            if(cuwu0.j != 1) {
                throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
            }
            byte[] arr_b = cuwu0.k;
            if(eqza0.h) {
                eqza0.h = false;
                eqza0.b(arr_b, s);
                return;
            }
            if(eqza0.k) {
                eqza.c(eqza0);
                baun0.d("continueWithPinConfirmed()", new Object[0]);
                PinFallbackPayload pinFallbackPayload0 = new PinFallbackPayload();
                try {
                    pinFallbackPayload0.aw(arr_b);
                }
                catch(erpd erpd0) {
                    eqza.a.g("Failed to parse pin fallback payload", erpd0, new Object[0]);
                    eqza0.a(s);
                    return;
                }
                if(!pinFallbackPayload0.c) {
                    eqza.a.d("Unexpected pin fallback payload: %s", new Object[]{pinFallbackPayload0});
                    eqza0.a(s);
                    return;
                }
                if(eqza0.b != null) {
                    if(hyis.v()) {
                        eqza0.i = true;
                    }
                    eqza0.b.a(new eqgo(eqza0.g, s), new TargetConnectionArgs());
                    return;
                }
            }
            else {
                eqzj eqzj0 = this.a.b;
                if(eqzj0 != null) {
                    eqzj0.b(arr_b);
                }
            }
            return;
        }
        eqza.a.f("Connected to " + this.a.m + ", but receiving payloads from " + s + "! Ignoring payload.", new Object[0]);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
    }
}

