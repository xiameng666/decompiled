import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import j..util.Objects;
import java.util.ArrayList;

public final class cyod implements gxxt {
    final cyoi a;

    public cyod(cyoi cyoi0) {
        Objects.requireNonNull(cyoi0);
        this.a = cyoi0;
        super();
    }

    @Override  // gxxt
    public final void a(int v, int v1, int v2, BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void b(BluetoothDevice bluetoothDevice0) {
        if(bluetoothDevice0 != null) {
            cyoi cyoi0 = this.a;
            BluetoothDevice bluetoothDevice1 = cyoi0.c.a;
            if(bluetoothDevice0.equals(bluetoothDevice1)) {
                cyom cyom0 = cyoi0.f;
                ArrayList arrayList0 = cyom0.a;
                if(!arrayList0.isEmpty()) {
                    cync cync0 = (cync)gggq.p(arrayList0);
                    long v = cyom0.b.a();
                    if(cync0.g == 0L) {
                        cync0.g = v - cync0.a;
                    }
                }
                ggtj ggtj0 = (ggtj)cyoi0.o.d().ar(0x1EFF);
                String s = fgjo.c(bluetoothDevice1);
                ggtj0.B("SassDeviceConnectionHelper: %s ACL connected", gxyf.b(gxye.a, s));
                cyoc cyoc0 = new cyoc(this);
                cyoi0.m.execute(cyoc0);
            }
        }
    }

    @Override  // gxxt
    public final void c(BluetoothDevice bluetoothDevice0, int v) {
        if(bluetoothDevice0 != null) {
            cyoi cyoi0 = this.a;
            BluetoothDevice bluetoothDevice1 = cyoi0.c.a;
            if(bluetoothDevice0.equals(bluetoothDevice1)) {
                if(cyoi0.u()) {
                    ArrayList arrayList0 = cyoi0.f.a;
                    if(!arrayList0.isEmpty()) {
                        cync cync0 = (cync)gggq.p(arrayList0);
                        if(cync0.h == -1) {
                            cync0.h = v;
                        }
                    }
                }
                ggtj ggtj0 = (ggtj)cyoi0.o.d().ar(0x1F00);
                String s = fgjo.c(bluetoothDevice1);
                ggtj0.R("SassDeviceConnectionHelper: %s ACL disconnected, reason=%s", gxyf.b(gxye.a, s), gxxu.f(v));
                cyob cyob0 = new cyob(this);
                cyoi0.m.execute(cyob0);
            }
        }
    }

    @Override  // gxxt
    public final void d(int v, BluetoothProfile bluetoothProfile0) {
    }

    @Override  // gxxt
    public final void jl() {
    }
}

