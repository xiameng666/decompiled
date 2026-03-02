import android.bluetooth.BluetoothGattServer;
import android.content.Context;
import android.os.Handler;

public final class eqed implements eqea {
    public static final baun a;
    public final Context b;
    public final eqme c;
    public final cuvm d;
    public final eqtn e;
    public String f;
    public eqmz g;
    public eqnf h;
    public String i;
    public eqmj j;
    public boolean k;
    public String l;
    public byte[] m;
    public byte[] n;
    public epwf o;
    public final Handler p;
    public final cuvg q;
    public final cuwv r;

    static {
        eqed.a = new erqc(new String[]{"D2D", "TargetDeviceConnectorNearbyConnections"});
    }

    public eqed(epzg epzg0) {
        cuvm cuvm0 = eqrn.a(epzg0.a, "smartdevice");
        super();
        this.k = false;
        this.q = new eqeb(this);
        this.r = new eqec(this);
        this.b = epzg0.a;
        this.d = cuvm0;
        this.p = epzg0.b;
        this.c = (eqme)epzg0.c;
        this.e = new eqtn(epzg0.a);
    }

    @Override  // eqea
    public final evql a() {
        if(this.j != null) {
            eqed.a.d("Stopping advertising.", new Object[0]);
            this.d.s();
        }
        eqtn eqtn0 = this.e;
        if(eqtn0 != null) {
            eqtn0.a();
            eqtn.e.h("Stop gatt server.", new Object[0]);
            BluetoothGattServer bluetoothGattServer0 = eqtn0.i;
            if(bluetoothGattServer0 != null) {
                bluetoothGattServer0.close();
                eqtn0.i = null;
            }
        }
        this.j = null;
        String s = this.f;
        if(s == null) {
            return evrg.d(null);
        }
        eqed.a.d("Disconnecting from %s", new Object[]{s});
        this.d.r(s);
        this.f = null;
        return evrg.d(null);
    }
}

