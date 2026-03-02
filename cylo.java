import android.bluetooth.BluetoothDevice;
import j..util.Objects;

final class cylo implements cygd {
    final cylw a;

    public cylo(cylw cylw0) {
        Objects.requireNonNull(cylw0);
        this.a = cylw0;
        super();
    }

    @Override  // cygd
    public final void jh(BluetoothDevice bluetoothDevice0, int v, byte[] arr_b) {
        try {
            cylw cylw0 = this.a;
            if(v == 16) {
                fgtc fgtc0 = new fgtc(null);
                fgsu.b(((short)0x101), fgtc0);
                fgsu.a(((boolean)(cylw0.C(bluetoothDevice0.getAddress()) ^ 1)), fgtc0);
                byte[] arr_b1 = fgtc0.p();
                cyqk.a(cylw0.h.c(bluetoothDevice0, fgmh.c, arr_b1), new cykk(cylw0), cylw0.d);
                return;
            }
            if(cylw0.B(bluetoothDevice0.getAddress())) {
                cylw0.E(bluetoothDevice0.getAddress(), new cykl(cylw0, v, arr_b));
                return;
            }
            if(v == 17) {
                if(fgtc.L(arr_b).G() > 0) {
                    cylw0.E(bluetoothDevice0.getAddress(), new cykm(cylw0, arr_b, bluetoothDevice0));
                    return;
                }
                ((ggtj)cylw0.n.d().ar(7863)).R("NearbyDeviceManager: device %s doesn\'t has SASS capability, response data=%s", fgjo.c(bluetoothDevice0), cyne.b(arr_b));
                return;
            }
            ((ggtj)cylw0.n.g().ar(7862)).X("NearbyDeviceManager: receives SASS eventGroup message with eventCode %d, additionalData %s, but device %s is not supported", Integer.valueOf(v), cyne.b(arr_b), fgjo.c(bluetoothDevice0));
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            ((ggtj)((ggtj)this.a.n.g().s(illegalArgumentException0)).ar(7810)).X("NearbyDeviceManager: Failed to process event! device=%s, eventCode=%d, data=%s", fgjo.c(bluetoothDevice0), Integer.valueOf(v), cyne.b(arr_b));
        }
    }

    @Override  // cygd
    public final void ji(BluetoothDevice bluetoothDevice0, boolean z, int v, byte[] arr_b) {
        if(hvpg.bn()) {
            cylw cylw0 = this.a;
            cxtn cxtn0 = cylw0.q;
            if(cxtn0 != null) {
                ggqj ggqj0 = cxtn0.a(bluetoothDevice0).om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    ggtj ggtj0 = (ggtj)cylw0.n.d().ar(7812);
                    String s = ((BluetoothDevice)object0).getAddress();
                    ggtj0.B("NearbyDeviceManager: Call onEventStreamResponse for CsipGroupDevice with %s", gxyf.b(gxye.a, s));
                    cylw0.h.b(((BluetoothDevice)object0), z, v, arr_b);
                }
                return;
            }
        }
        ggtj ggtj1 = (ggtj)this.a.n.d().ar(7811);
        String s1 = bluetoothDevice0.getAddress();
        ggtj1.B("NearbyDeviceManager: Call onEventStreamResponse for BluetoothDevice with %s", gxyf.b(gxye.a, s1));
        this.a.h.b(bluetoothDevice0, z, v, arr_b);
    }

    @Override  // cygd
    public final void jj(BluetoothDevice bluetoothDevice0) {
        this.a.u(bluetoothDevice0);
        cyqn cyqn0 = new cyqn(this.a.h, bluetoothDevice0);
        this.a.h.a.execute(cyqn0);
    }
}

