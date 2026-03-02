import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

public final class dghj extends cuwv {
    final dghl a;
    final ichm b;

    public dghj(dghl dghl0, ichm ichm0) {
        this.a = dghl0;
        this.b = ichm0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        ibuq.f(s, "endpointId");
        if(!ibuq.m(s, this.a.c)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        dggt dggt0 = new dggt(cuwu0);
        dghg.a(this.b, dggt0);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
        ibuq.f(s, "endpointId");
        ibuq.f(payloadTransferUpdate0, "update");
        if(ibuq.m(s, this.a.c)) {
            long v = payloadTransferUpdate0.a;
            switch(payloadTransferUpdate0.b) {
                case 1: {
                    dggv dggv0 = new dggv(v);
                    dghg.a(this.b, dggv0);
                    return;
                }
                case 2: {
                    dggw dggw0 = new dggw(v);
                    dghg.a(this.b, dggw0);
                    return;
                }
                case 3: {
                    dggy dggy0 = new dggy(v, payloadTransferUpdate0.d, payloadTransferUpdate0.c);
                    dghg.a(this.b, dggy0);
                    return;
                }
                case 4: {
                    dggu dggu0 = new dggu(v);
                    dghg.a(this.b, dggu0);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

