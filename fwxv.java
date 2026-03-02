import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;

public final class fwxv extends fvte {
    protected final BluetoothDevice b;

    public fwxv(BluetoothDevice bluetoothDevice0) {
        super(gxtu.d(bluetoothDevice0.getAddress()));
        this.b = bluetoothDevice0;
    }

    @Override  // fvte
    public final int a() {
        return this.b.getBondState();
    }

    @Override  // fvte
    public final int b() {
        BluetoothClass bluetoothClass0 = this.i();
        return bluetoothClass0 == null ? 0 : bluetoothClass0.getDeviceClass();
    }

    @Override  // fvte
    public final int c() {
        BluetoothClass bluetoothClass0 = this.i();
        return bluetoothClass0 == null ? 0 : bluetoothClass0.getMajorDeviceClass();
    }

    @Override  // fvte
    public final int d() {
        return this.b.getType();
    }

    @Override  // fvte
    public final String e() {
        return this.b.getAddress();
    }

    @Override  // fvte
    public final boolean equals(Object object0) {
        return (object0 instanceof fwxv) ? this.b.equals(((fwxv)object0).b) : false;
    }

    @Override  // fvte
    public final String f() {
        try {
            BluetoothDevice bluetoothDevice0 = this.b;
            Method method0 = bluetoothDevice0.getClass().getMethod("getAlias", null);
            if(method0 != null) {
                String s = (String)method0.invoke(bluetoothDevice0, null);
                this.g();
                return s;
            }
        }
        catch(NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return null;
    }

    @Override  // fvte
    public final String g() {
        return this.b.getName();
    }

    @Override  // fvte
    public final String[] h() {
        ParcelUuid[] arr_parcelUuid = this.b.getUuids();
        if(arr_parcelUuid == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_parcelUuid.length; ++v) {
            ParcelUuid parcelUuid0 = arr_parcelUuid[v];
            if(parcelUuid0 != null) {
                UUID uUID0 = parcelUuid0.getUuid();
                if(uUID0 != null) {
                    arrayList0.add(uUID0.toString());
                }
            }
        }
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }

    @Override  // fvte
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final BluetoothClass i() {
        return this.b.getBluetoothClass();
    }
}

