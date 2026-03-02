import android.bluetooth.BluetoothDevice;

public final class cypw implements jqv {
    public final cyqk a;
    public final BluetoothDevice b;
    public final hfub c;
    public final byte[] d;
    public final int e;
    public final int f;
    public final int g;

    public cypw(cyqk cyqk0, BluetoothDevice bluetoothDevice0, hfub hfub0, byte[] arr_b, int v, int v1, int v2) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
        this.c = hfub0;
        this.d = arr_b;
        this.e = v;
        this.f = v1;
        this.g = v2;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        cypv cypv0 = new cypv(this.a, this.b, this.c, this.d, jqt0, this.e, this.f, this.g);
        this.a.a.execute(cypv0);
        return "EventStreamHandler.sendMessageAndGetResponse";
    }
}

