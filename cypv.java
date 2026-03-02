import android.bluetooth.BluetoothDevice;

public final class cypv implements Runnable {
    public final cyqk a;
    public final BluetoothDevice b;
    public final hfub c;
    public final byte[] d;
    public final jqt e;
    public final int f;
    public final int g;
    public final int h;

    public cypv(cyqk cyqk0, BluetoothDevice bluetoothDevice0, hfub hfub0, byte[] arr_b, jqt jqt0, int v, int v1, int v2) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
        this.c = hfub0;
        this.d = arr_b;
        this.e = jqt0;
        this.f = v;
        this.g = v1;
        this.h = v2;
    }

    @Override
    public final void run() {
        cyqi cyqi0;
        cyqk cyqk0 = this.a;
        BluetoothDevice bluetoothDevice0 = this.b;
        hfub hfub0 = this.c;
        cyqb cyqb0 = new cyqb(cyqk0, bluetoothDevice0, hfub0, this.d);
        jqt jqt0 = this.e;
        switch(((fgmh)hfub0).p) {
            case 49: {
                cyqi0 = new cyqp(bluetoothDevice0, cyqb0, jqt0, ((cyqq)cyqk0).a, ((cyqq)cyqk0).f, ((cyqq)cyqk0).b, hfub0, ((cyqq)cyqk0).g);
                break;
            }
            case 17: 
            case 18: 
            case 0x20: 
            case 33: 
            case 0x30: 
            case 0x40: 
            case 65: {
                cyqi0 = new cyqi(bluetoothDevice0, cyqb0, jqt0, ((cyqq)cyqk0).a, ((cyqq)cyqk0).b, hfub0);
                break;
            }
            case 66: {
                cyqi0 = new cyqj(bluetoothDevice0, cyqb0, jqt0, ((cyqq)cyqk0).a, ((cyqq)cyqk0).b, hfub0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Not supported event " + ((Enum)hfub0).name());
            }
        }
        cyqk0.d.put(Integer.valueOf(this.f), cyqi0);
        int v = this.g;
        cyqi0.g = v;
        if(cyqi0.h < 0) {
            cyqi0.h = v;
        }
        cyqi0.f = this.h;
        cyqi0.g();
    }
}

