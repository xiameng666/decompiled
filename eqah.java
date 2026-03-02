import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.smartdevice.d2d.data.PinFallbackPayload;
import j..util.Objects;

final class eqah extends cuwv {
    final eqam a;

    public eqah(eqam eqam0) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        baun baun0 = eqam.b;
        baun0.j("Received payload.", new Object[0]);
        eqam eqam0 = this.a;
        if(s.equals(eqam0.i)) {
            if(cuwu0.j != 1) {
                throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
            }
            byte[] arr_b = cuwu0.k;
            if(hyis.p()) {
                epxv epxv0 = eqam0.o;
                if(epxv0.f) {
                    epxu epxu0 = epxv0.a();
                    epxu0.e = false;
                    epxu0.f = true;
                    eqam0.o = epxu0.a();
                    PinFallbackPayload pinFallbackPayload0 = new PinFallbackPayload();
                    pinFallbackPayload0.b = true;
                    pinFallbackPayload0.a.add(Integer.valueOf(1));
                    eqam0.j(s, pinFallbackPayload0);
                    return;
                }
            }
            if(eqam0.o.e) {
                eqam0.l(arr_b, s);
                return;
            }
            eqmj eqmj0 = eqam0.g;
            if(eqmj0 != null) {
                eqmj0.b(arr_b);
            }
            return;
        }
        baun0.f("Connected to " + eqam0.i + ", but receiving payloads from " + s + "! Ignoring payload.", new Object[0]);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
    }
}

