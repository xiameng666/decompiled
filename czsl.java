import android.content.Context;
import android.net.L2capNetworkSpecifier.Builder;
import android.net.L2capNetworkSpecifier;
import android.net.MacAddress;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.os.Looper;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.mediums.bluetooth.lowenergy.BleL2capOverIpv6.2;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czsl extends czvg {
    public final String a;
    public final byte[] b;
    public final czsh c;
    public gyxo d;
    public czsp e;
    private final String f;
    private final czql g;
    private final cump h;

    public czsl(Context context0, String s, byte[] arr_b, String s1, czql czql0, cump cump0) {
        super(37, cump0);
        this.d = gyxo.b;
        this.a = s;
        this.b = arr_b;
        this.f = s1;
        this.g = czql0;
        this.h = cump0;
        this.c = new czsh(context0);
    }

    @Override  // czvg
    public final czvf a() {
        Boolean boolean0 = (Boolean)gxyl.a(() -> {
            czle czle0;
            gmcu gmcu0 = new gmcu();
            czsk czsk0 = new czsk(this, gmcu0);
            Boolean boolean0 = Boolean.valueOf(true);
            Boolean boolean1 = Boolean.valueOf(false);
            if(czsh.e()) {
                czsh czsh0 = this.c;
                cunf cunf0 = czkq.a;
                cunf0.d().p("[BleL2capOverIpv6] startBleClientOverIpv6.", new Object[0]);
                if(czsh0.e == 0) {
                    L2capNetworkSpecifier l2capNetworkSpecifier0 = new L2capNetworkSpecifier.Builder().setRole(1).setRemoteAddress(MacAddress.fromString(this.f)).setPsm(this.g.b.d).setHeaderCompression(2).build();
                    NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(2).setNetworkSpecifier(((NetworkSpecifier)l2capNetworkSpecifier0)).removeCapability(14).removeCapability(13).removeCapability(37).build();
                    czsh0.c = new BleL2capOverIpv6.2(czsh0, czsk0);
                    NetworkCallbackWrapper networkCallbackWrapper0 = czsh0.c;
                    batl.s(networkCallbackWrapper0);
                    clht clht0 = new clht(Looper.getMainLooper());
                    int v = (int)hvol.c();
                    czsh0.a.requestNetwork(networkRequest0, networkCallbackWrapper0, clht0, v);
                    czsh0.e = 1;
                    cunf0.b().p("[BleL2capOverIpv6] successfully startBleClientOverIpv6.", new Object[0]);
                    czle0 = new czle(boolean0, gyxo.b);
                }
                else {
                    cunf0.e().p("[BleL2capOverIpv6] client already registered.", new Object[0]);
                    czle0 = new czle(boolean1, gyxo.bh);
                }
            }
            else {
                czle0 = new czle(boolean1, gyxo.bZ);
            }
            if(Objects.equals(czle0.a.d(), boolean0)) {
                try {
                    gmcu0.v(hvol.c(), TimeUnit.MILLISECONDS);
                    this.d = gyxo.b;
                    return boolean0;
                }
                catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                    this.d = czle0.b;
                    this.c.a();
                    czkq.a.b().i("[BleL2capOverIpv6Operation] BLE L2CAP over IPv6 client failed to start due to exception %s, %s", exception0.getMessage(), this.a);
                }
            }
            return boolean1;
        }, "ConnectBleL2capOverIpv6", new gxyk(new gxyj(hvog.o()), this.h.a, 3));
        if(boolean0 != null && boolean0.booleanValue()) {
            return czvf.b;
        }
        this.d = gyxo.gm;
        return czvf.c;
    }

    @Override  // czvg
    public final void g() {
        this.c.a();
        czkq.a.b().h("Close BLE L2CAP over IPv6 client, %s", this.a);
    }
}

