import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;

final class eqec extends cuwv {
    final eqed a;

    public eqec(eqed eqed0) {
        Objects.requireNonNull(eqed0);
        this.a = eqed0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        baun baun0 = eqed.a;
        baun0.j("Received payload.", new Object[0]);
        eqed eqed0 = this.a;
        if(s.equals(eqed0.f)) {
            if(cuwu0.j != 1) {
                throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
            }
            byte[] arr_b = cuwu0.k;
            if(eqed0.k) {
                eqed0.k = false;
                epwf epwf0 = eqed0.o;
                if(epwf0 != null) {
                    epwf0.a(arr_b, s);
                    return;
                }
            }
            else {
                eqmj eqmj0 = eqed0.j;
                if(eqmj0 != null) {
                    eqmj0.b(arr_b);
                }
            }
            return;
        }
        baun0.f("Connected to " + eqed0.f + ", but receiving payloads from " + s + "! Ignoring payload.", new Object[0]);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
    }
}

