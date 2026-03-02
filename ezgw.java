import android.bluetooth.BluetoothDevice;

public final class ezgw {
    public final BluetoothDevice a;
    public final String b;
    public final String c;
    private final String d;

    public ezgw(BluetoothDevice bluetoothDevice0) {
        String s = bluetoothDevice0.getAddress();
        this.d = s;
        this.a = bluetoothDevice0;
        ezka.b(bluetoothDevice0);
        this.b = "auth_trust_agent_pref_trusted_bluetooth_address" + s;
        this.c = "auth_trust_agent_pref_trusted_bluetooth_title" + s;
    }

    public final boolean a() {
        return this.a != null && this.a.getBondState() == 12;
    }

    public static final void b(ezck ezck0, String s) {
        if(ezck0.j(s)) {
            ezck0.g(s);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ezgw) ? ((ezgw)object0).d.equals(this.d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }
}

