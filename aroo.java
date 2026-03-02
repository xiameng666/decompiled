import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;

public final class aroo extends cuwv {
    final arot a;

    protected aroo(arot arot0) {
        Objects.requireNonNull(arot0);
        this.a = arot0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        arot.a.d("onPayloadReceived(type=%d, id=%s)", new Object[]{((int)cuwu0.j), ((long)cuwu0.i)});
        if(hqnd.e()) {
            aroi aroi0 = new aroi(this, cuwu0);
            gmbu.t(this.a.c.d(aroi0), new arom(this, cuwu0), this.a.c);
            return;
        }
        aroj aroj0 = new aroj(this, cuwu0);
        this.a.c.execute(aroj0);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
        arot.a.d("onPayloadTransferUpdate(status=%d, id=%d)", new Object[]{((int)payloadTransferUpdate0.b), ((long)payloadTransferUpdate0.a)});
        if(hqnd.e()) {
            arok arok0 = new arok(this, payloadTransferUpdate0);
            gmbu.t(this.a.c.d(arok0), new aron(this, payloadTransferUpdate0), this.a.c);
            return;
        }
        arol arol0 = new arol(this, payloadTransferUpdate0);
        this.a.c.execute(arol0);
    }
}

