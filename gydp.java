import android.bluetooth.BluetoothDevice;
import j..util.Objects;

final class gydp extends gxum {
    final BluetoothDevice a;
    final byte[] b;
    final int c;
    final gydq d;
    final int e;
    final int f;

    public gydp(gydq gydq0, BluetoothDevice bluetoothDevice0, byte[] arr_b, int v, int v1, int v2) {
        this.a = bluetoothDevice0;
        this.b = arr_b;
        this.e = v;
        this.c = v1;
        this.f = v2;
        Objects.requireNonNull(gydq0);
        this.d = gydq0;
        super("BLEInformStatusListener");
    }

    @Override
    public final void run() {
        String s = this.a.getAddress();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhk.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyhk gyhk0 = (gyhk)hftp0.b_message;
        gyhk0.b |= 1;
        gyhk0.c = hfsf0;
        gyhk gyhk1 = (gyhk)hftp0.N_build();
        int v = this.e;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyho.a).v_newBuilder();
        ByteString hfsf1 = ByteString.copyFrom(gyin.b(s));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyho gyho0 = (gyho)hftp1.b_message;
        gyho0.b |= 1;
        gyho0.c = hfsf1;
        gyho gyho1 = (gyho)hftp1.N_build();
        int v1 = this.c;
        int v2 = this.f;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gyhy.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gyhy)hftr0.b_message).c = 4;
        ((gyhy)hftr0.b_message).b |= 1;
        hftr hftr1 = (hftr)((ProtoLiteMessage)gygr.a).v_newBuilder();
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        ((gygr)hftr1.b_message).g = 1;
        ((gygr)hftr1.b_message).b |= 16;
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        gygr gygr0 = (gygr)hftr1.b_message;
        gyhk1.getClass();
        gygr0.c = gyhk1;
        gygr0.b |= 1;
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        ((gygr)hftr1.b_message).e = v - 1;
        ((gygr)hftr1.b_message).b |= 4;
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        gygr gygr1 = (gygr)hftr1.b_message;
        gyho1.getClass();
        gygr1.d = gyho1;
        gygr1.b |= 2;
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        gygr gygr2 = (gygr)hftr1.b_message;
        if(v2 == 0) {
            throw null;
        }
        gygr2.h = v2 - 1;
        gygr2.b |= 0x20;
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        gygr gygr3 = (gygr)hftr1.b_message;
        gygr3.b |= 8;
        gygr3.f = v1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gyhy gyhy0 = (gyhy)hftr0.b_message;
        gygr gygr4 = (gygr)((ProtoLiteBuilder)hftr1).N_build();
        gygr4.getClass();
        gyhy0.e = gygr4;
        gyhy0.b |= 4;
        gyhy gyhy1 = (gyhy)((ProtoLiteBuilder)hftr0).N_build();
        gyim gyim0 = this.d.e;
        if(gyim0 != null) {
            gyim0.a(((MessageLite)gydq.d(gyhy1)));
        }
    }
}

