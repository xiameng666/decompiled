import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;

public final class eydc {
    public final bboh a;
    public boolean b;
    private final Context c;
    private BluetoothGatt d;

    public eydc(bboh bboh0) {
        this.a = bboh0;
        this.c = AppContextProvider.a();
    }

    public final Object a(BluetoothDevice bluetoothDevice0, ibrl ibrl0) {
        eycz eycz0;
        if((ibrl0 instanceof eycz)) {
            eycz0 = (eycz)ibrl0;
            int v = eycz0.c;
            if((v & 0x80000000) == 0) {
                eycz0 = new eycz(this, ibrl0);
            }
            else {
                eycz0.c = v - 0x80000000;
            }
        }
        else {
            eycz0 = new eycz(this, ibrl0);
        }
        Object object0 = eycz0.a;
        Object object1 = ibrx.a;
        switch(eycz0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.b) {
                    ((ggtj)this.a.h()).x("GATT for Channel Sounding is already connected, do not try to establish GATT connection.");
                    return Boolean.valueOf(true);
                }
                eycz0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(eycz0), 1);
                icbk0.z();
                ((ggtj)this.a.h()).x("GattConnector is trying to establish GATT connection.");
                eydb eydb0 = new eydb(this, icbk0);
                this.d = bluetoothDevice0.connectGatt(this.c, false, eydb0, 2);
                icbk0.d(new eyda(this));
                Object object2 = icbk0.k();
                if(object2 == object1) {
                    ibsi.b(eycz0);
                }
                return object2 == object1 ? object1 : Boolean.valueOf(this.b);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(this.b);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void b() {
        this.b = false;
        BluetoothGatt bluetoothGatt0 = this.d;
        this.d = null;
        bboh bboh0 = this.a;
        if(bluetoothGatt0 == null) {
            ((ggtj)bboh0.j()).x("Couldn\'t find a GATT instance to disconnect.");
            return;
        }
        ((ggtj)bboh0.h()).x("GattConnector is trying to disconnect GATT connection.");
        bluetoothGatt0.disconnect();
        bluetoothGatt0.close();
    }
}

