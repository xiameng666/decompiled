import android.bluetooth.BluetoothGattServer;

public final class dojw implements evqc {
    public final dojx a;
    public final byte[] b;
    public final doju c;

    public dojw(dojx dojx0, byte[] arr_b, doju doju0) {
        this.a = dojx0;
        this.b = arr_b;
        this.c = doju0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.a = gfsx.m(bboy.c(new byte[]{2, this.b[1], 1}));
        BluetoothGattServer bluetoothGattServer0 = this.a.b.c;
        if(bluetoothGattServer0 != null) {
            doju doju0 = this.c;
            if(doju0.c) {
                bluetoothGattServer0.sendResponse(doju0.a, doju0.b, 0, doju0.d, doju0.e);
            }
        }
    }
}

