import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.libraries.bluetooth.BluetoothException;
import j..util.Objects;

final class czqe extends czvg {
    private final Context a;
    private final BluetoothManager b;
    private final fgum c;
    private final String d;
    private fgux e;

    public czqe(Context context0, BluetoothManager bluetoothManager0, fgum fgum0, String s) {
        super(34);
        this.a = context0;
        this.b = bluetoothManager0;
        this.c = fgum0;
        this.d = s;
    }

    @Override  // czvg
    public final czvf a() {
        fgvh fgvh0 = new fgvh(this.b);
        boolean z = true;
        Context context0 = this.a;
        gftb.check(context0);
        fgux fgux0 = new fgux(context0, fgvh0, ((boolean)(bbqa.c() ^ 1)));
        try {
            czri.n();
            if(bbqa.d()) {
                cupt cupt0 = cupt.b();
                cupt0.f(context0, fgux0.e.c);
                fgve fgve0 = fgve.a(cupt0.a());
                if(fgve0 == null) {
                    throw new BluetoothException("Failed to open the GATT server, openGattServer returned null.");
                }
                fgum fgum0 = this.c;
                cupt cupt1 = cupt.b();
                for(Object object0: fgum0.a()) {
                    BluetoothGattService bluetoothGattService0 = (BluetoothGattService)object0;
                    if(bluetoothGattService0 != null) {
                        czri.n();
                        cupt1.c(bluetoothGattService0);
                    }
                }
                synchronized(fgux0.d) {
                    if(fgux0.j != null) {
                        z = false;
                    }
                    gftb.r(z, "Gatt server is already open.");
                    fgux0.j = fgve0;
                    fgux0.i = fgum0;
                }
                this.e = fgux0;
                return czvf.b;
            }
            else {
                fgum fgum1 = this.c;
                synchronized(fgux0.d) {
                    if(fgux0.j != null) {
                        z = false;
                    }
                    gftb.r(z, "Gatt server is already open.");
                    fgve fgve1 = fgux0.h.a(fgux0.g, fgux0.e);
                    if(fgve1 == null) {
                        throw new BluetoothException("Failed to open the GATT server, openGattServer returned null.");
                    }
                    try {
                        for(Object object3: fgum1.a()) {
                            BluetoothGattService bluetoothGattService1 = (BluetoothGattService)object3;
                            if(bluetoothGattService1 != null) {
                                fgut fgut0 = new fgut(fgux0, new Object[]{fguw.a, bluetoothGattService1}, fgve1, bluetoothGattService1);
                                fgux0.f.i(fgut0, fgux.b);
                            }
                        }
                        fgux0.j = fgve1;
                        fgux0.i = fgum1;
                    }
                    catch(BluetoothException bluetoothException1) {
                        fgve1.c();
                        throw bluetoothException1;
                    }
                }
            }
            this.e = fgux0;
            return czvf.b;
        }
        catch(BluetoothException bluetoothException0) {
            czke.h(this.d, 2, gymp.d);
            czkq.a.e().f(bluetoothException0).h("Unable to start an advertisement GATT server due to a Bluetooth exception, %s", gxyf.b(gxye.k, this.d));
            return czvf.d;
        }
        catch(SecurityException securityException0) {
            czke.h(this.d, 2, gymp.d);
            czkq.a.e().f(securityException0).h("Unable to start an advertisement GATT server due to a security exception, %s", gxyf.b(gxye.k, this.d));
            return czvf.d;
        }
    }

    @Override  // czvg
    public final void g() {
        czri.n();
        fgux fgux0 = this.e;
        if(fgux0 != null) {
            try {
                if(!bbqa.d()) {
                    Object object0 = fgux0.d;
                    synchronized(object0) {
                        fgve fgve0 = fgux0.j;
                        if(fgve0 != null) {
                            fgve0.c();
                            fgux0.j = null;
                        }
                    }
                    this.e = null;
                    return;
                }
                cupt cupt0 = cupt.b();
                cupt0.g(this.e.e.c);
                BluetoothGattServer bluetoothGattServer0 = cupt0.a();
                if(bluetoothGattServer0 == null) {
                    this.e = null;
                    return;
                }
                ggqk ggqk0 = gged_interceptors.i(bluetoothGattServer0.getServices()).E();
                while(ggqk0.hasNext()) {
                    Object object1 = ggqk0.next();
                    BluetoothGattService bluetoothGattService0 = (BluetoothGattService)object1;
                    if(Objects.equals((cumz.j(this.a) ? czup.b : czup.a), bluetoothGattService0.getUuid()) && ((long)bluetoothGattService0.getCharacteristics().size()) == hvog.n()) {
                        czri.n();
                        cupt.b().d(bluetoothGattService0);
                    }
                }
            }
            catch(SecurityException securityException0) {
                czkq.a.e().f(securityException0).h("Unable to stop an advertisement GATT server due to a security exception, %s", gxyf.b(gxye.k, this.d));
            }
            this.e = null;
            return;
        }
        czkq.a.d().p("Cannot stop advertisement GATT server because advertisementGattServerHelper is null", new Object[0]);
    }
}

