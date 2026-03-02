import android.content.Context;
import android.net.L2capNetworkSpecifier.Builder;
import android.net.L2capNetworkSpecifier;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.os.Looper;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.mediums.bluetooth.lowenergy.BleL2capOverIpv6.1;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czso extends czvg {
    public final String a;
    public final byte[] b;
    public final czsh c;
    public int d;
    public gyxo e;
    public final czts f;

    public czso(String s, byte[] arr_b, Context context0, czts czts0) {
        super(33);
        this.e = gyxo.b;
        this.a = s;
        this.b = arr_b;
        this.c = new czsh(context0);
        this.d = 0;
        this.f = czts0;
    }

    @Override  // czvg
    public final czvf a() {
        czle czle0;
        gmcu gmcu0 = new gmcu();
        czsn czsn0 = new czsn(this, gmcu0);
        cunf cunf0 = czkq.a;
        Boolean boolean0 = Boolean.valueOf(false);
        cunf0.d().p("[BleL2capOverIpv6] startBleServerOverIpv6.", new Object[0]);
        czsh czsh0 = this.c;
        Boolean boolean1 = Boolean.valueOf(true);
        if(!czsh.e()) {
            czle0 = new czle(boolean0, gyxo.cK);
        }
        else if(czsh0.d == 0) {
            L2capNetworkSpecifier l2capNetworkSpecifier0 = new L2capNetworkSpecifier.Builder().setRole(2).setHeaderCompression(2).build();
            NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(2).setNetworkSpecifier(((NetworkSpecifier)l2capNetworkSpecifier0)).removeCapability(14).removeCapability(13).removeCapability(37).build();
            czsh0.b = new BleL2capOverIpv6.1(czsh0, czsn0);
            clht clht0 = new clht(Looper.getMainLooper());
            NetworkCallbackWrapper networkCallbackWrapper0 = czsh0.b;
            batl.s(networkCallbackWrapper0);
            czsh0.a.reserveNetwork(networkRequest0, clht0, networkCallbackWrapper0);
            czsh0.d = 1;
            cunf0.b().p("[BleL2capOverIpv6] successfully startBleServerOverIpv6.", new Object[0]);
            czle0 = new czle(boolean1, gyxo.b);
        }
        else {
            cunf0.e().p("[BleL2capOverIpv6] BleL2capOverIpv6 server already registered.", new Object[0]);
            czle0 = new czle(boolean0, gyxo.aV);
        }
        if(Objects.equals(czle0.a.d(), boolean1)) {
            try {
                int v = (int)(((Integer)gmcu0.v(hvol.a.r().c(), TimeUnit.MILLISECONDS)));
                this.d = v;
                if(v == 0) {
                    this.e = gyxo.gl;
                    czsh0.b();
                    cunf0.e().h("[BleL2capOverIpv6Operation] BLE L2CAP over IPv6 server failed to reserve PSM, %s", this.a);
                    return czvf.c;
                }
                this.e = gyxo.b;
                cunf0.b().h("[BleL2capOverIpv6Operation] BLE L2CAP over IPv6 server started successfully, %s", this.a);
                return czvf.b;
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                this.e = czle0.b;
                this.c.b();
                this.c();
                czkq.a.b().i("[BleL2capOverIpv6Operation] BLE L2CAP over IPv6 server failed to start due to exception %s, %s", exception0.getMessage(), this.a);
                return czvf.c;
            }
        }
        czkq.a.b().h("[BleL2capOverIpv6Operation] BLE L2CAP over IPv6 server failed to start due to other reason, %s", this.a);
        return czvf.c;
    }

    public final void c() {
        this.d = 0;
    }

    @Override  // czvg
    public final void g() {
        this.c.b();
        this.c();
        czkq.a.b().h("Close BLE L2CAP over IPv6 server, %s", this.a);
    }
}

