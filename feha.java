import android.bluetooth.BluetoothAdapter;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class feha implements Function {
    public final fehc a;
    public final fczq b;

    public feha(fehc fehc0, fczq fczq0) {
        this.a = fehc0;
        this.b = fczq0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        fczq fczq0 = this.b;
        Object object1 = null;
        if(!gfta.c(fczq0.c) && !gfta.c(fczq0.j)) {
            fehc fehc0 = this.a;
            BluetoothAdapter bluetoothAdapter0 = bahu.a(fehc0.a);
            if(bluetoothAdapter0 == null) {
                ffmn.f("BleOffloadClientConn", "Null BluetoothAdapter", new Object[0]);
            }
            else {
                object1 = new fegy(fczq0, bluetoothAdapter0.getRemoteDevice(gfta.b(fczq0.c)), bluetoothAdapter0, fehc0.c, fehc0.i, fehc0.d, fehc0.g, fehc0.e, fehc0.f);
            }
        }
        else {
            ffmn.f("BleOffloadClientConn", "BT address and node ID must both be defined", new Object[0]);
        }
        if(object1 == null) {
            ffmn.f("BleOffloadClientConnMgr", "The connection could not be created", new Object[0]);
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

