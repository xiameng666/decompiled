import android.bluetooth.BluetoothGattServer;

public final class dojv implements evqf {
    public final dojx a;
    public final doju b;

    public dojv(dojx dojx0, doju doju0) {
        this.a = dojx0;
        this.b = doju0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.a = gfsx.m(bboy.c((((fszd)object0).b == 4 ? ((ftdz)((fszd)object0).c) : ftdz.a).b.toByteArray()));
        BluetoothGattServer bluetoothGattServer0 = this.a.b.c;
        if(bluetoothGattServer0 != null) {
            doju doju0 = this.b;
            if(doju0.c) {
                bluetoothGattServer0.sendResponse(doju0.a, doju0.b, 0, doju0.d, doju0.e);
            }
        }
    }
}

