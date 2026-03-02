import android.bluetooth.BluetoothDevice;

public final class cylb implements bbqb {
    public final cylw a;

    public cylb(cylw cylw0) {
        this.a = cylw0;
    }

    @Override  // bbqb
    public final boolean a(Object object0) {
        if(((BluetoothDevice)object0) != null) {
            String s = ((BluetoothDevice)object0).getAddress();
            cyna cyna0 = this.a.n(s);
            return cyna0 != null && cyna0.f(cyfb.c).a == null;
        }
        return false;
    }
}

