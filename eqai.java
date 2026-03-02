import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;

final class eqai extends cuwp {
    final eqam a;
    private final byte[] b;

    public eqai(eqam eqam0, byte[] arr_b) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
        this.b = arr_b;
    }

    @Override  // cuwp
    public final void b(String s, cuwf cuwf0) {
        baun baun0 = eqam.b;
        baun0.d("[AutoConnectWithFastPairDiscoveryCallback] Found endpoint: %s", new Object[]{s});
        String s1 = cuwf0.b;
        eqmz eqmz0 = eqmy.a(s1);
        eqmw eqmw0 = eqmz0.a();
        byte[] arr_b = eqmw0.h();
        eqam eqam0 = this.a;
        eqam0.i(eqmz0);
        if(Arrays.equals(this.b, arr_b)) {
            eqam0.k();
            baun0.h("Requesting connection to device: %s (%s)", new Object[]{s1, s});
            eqam0.i = s;
            eqam0.m = eqmw0.d();
            Status status0 = erqf.b(eqam0.g(s, hyig.b(), eqam0.x));
            if(!status0.equals(Status.b)) {
                baun0.m("Request Connection failed: " + status0.toString(), new Object[0]);
                eqam0.i = null;
                if(eqam0.g != null) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((eqoc)hftv0).c = 1;
                    ((eqoc)hftv0).b |= 1;
                    int v = status0.i;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    eqoc eqoc0 = (eqoc)hftp0.b_message;
                    eqoc0.b |= 2;
                    eqoc0.d = v;
                    eqoc eqoc1 = (eqoc)hftp0.N_build();
                    eqam0.g.d(10584, eqoc1);
                }
            }
            return;
        }
        baun0.d("Ignoring device with fast pair code %s.", new Object[]{Arrays.toString(arr_b)});
    }

    @Override  // cuwp
    public final void c(String s) {
        eqam.b.d("Lost target endpoint: %s", new Object[]{s});
    }
}

