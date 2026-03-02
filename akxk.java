import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import j..util.Objects;
import java.io.IOException;

final class akxk extends cuwv {
    final akxl a;

    public akxk(akxl akxl0) {
        Objects.requireNonNull(akxl0);
        this.a = akxl0;
        super();
    }

    @Override  // cuwv
    public final void a(String s, cuwu cuwu0) {
        alaa alaa0;
        int v = cuwu0.j;
        if(v != 1) {
            akxl.a.m("Unknown payload type: " + v, new Object[0]);
            return;
        }
        if(!hpzm.T()) {
            try {
                alaa0 = alac.a(cuwu0.k);
            }
            catch(IOException iOException0) {
                akxl.a.n("Unable to parse received message.", iOException0, new Object[0]);
                return;
            }
            akxl akxl0 = this.a;
            akyk akyk0 = (akyk)akxl0.a().get(s);
            if(akyk0 == null) {
                akxl.a.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
                return;
            }
            akxj akxj0 = new akxj(akyk0, alaa0);
            akxl0.b.execute(akxj0);
            return;
        }
        akxi akxi0 = new akxi(s, cuwu0);
        this.a.b.execute(akxi0);
    }

    @Override  // cuwv
    public final void b(String s, PayloadTransferUpdate payloadTransferUpdate0) {
    }
}

