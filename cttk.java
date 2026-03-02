import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

public final class cttk extends cuwv {
    final cttl a;

    public cttk(cttl cttl0) {
        this.a = cttl0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        ibuq.f(s, "endpointId");
        byte[] arr_b = cuwu0.k;
        if(arr_b != null) {
            cttl cttl0 = this.a;
            icck icck0 = cttl0.f;
            if(icck0 != null) {
                icbb.b(icck0, null, null, new cttj(cttl0, arr_b, null), 3);
            }
        }
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
        ibuq.f(s, "endpointId");
        ibuq.f(payloadTransferUpdate0, "update");
    }
}

