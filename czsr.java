import android.bluetooth.BluetoothSocket;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class czsr implements Runnable {
    public final czsw a;
    public final String b;
    public final BluetoothSocket c;

    public czsr(czsw czsw0, String s, BluetoothSocket bluetoothSocket0) {
        this.a = czsw0;
        this.b = s;
        this.c = bluetoothSocket0;
    }

    @Override
    public final void run() {
        Iterator iterator0;
        byte[] arr_b3;
        IOException iOException1;
        DataOutputStream dataOutputStream1;
        DataInputStream dataInputStream0;
        BluetoothSocket bluetoothSocket0 = this.c;
        String s = bluetoothSocket0.getRemoteDevice().getAddress();
        cunf cunf0 = czkq.a;
        czss czss0 = new czss(bluetoothSocket0);
        czsw czsw0 = this.a;
        cumn cumn0 = cumn.d(cunf0, czss0, hvog.k(), czsw0.c);
        String s1 = this.b;
        DataOutputStream dataOutputStream0 = null;
        try {
            dataInputStream0 = new DataInputStream(new BufferedInputStream(bluetoothSocket0.getInputStream()));
            dataOutputStream1 = new DataOutputStream(new BufferedOutputStream(bluetoothSocket0.getOutputStream()));
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_79;
        }
        finally {
            cumn0.b();
        }
        try {
        alab1:
            while(true) {
                int v1 = dataInputStream0.readInt();
                if(!czsq.b(v1)) {
                    throw new IOException("Got invalid length of BleL2capPacket from client!");
                }
                byte[] arr_b = new byte[v1];
                dataInputStream0.readFully(arr_b);
                czsq czsq0 = czsq.a(arr_b);
                if(czsq0 == null) {
                    throw new IOException("Got invalid BleL2capPacket bytes from server! raw data : " + czmk.g(arr_b));
                }
                int v2 = czsq0.a;
                if(v2 == 1) {
                    byte[] arr_b1 = czsq0.b;
                    if(arr_b1 == null) {
                    label_29:
                        czqf czqf0 = null;
                        goto label_34;
                    label_31:
                        Object object0 = iterator0.next();
                        czqf0 = (czqf)object0;
                        if(!Arrays.equals(arr_b1, czsq.c(czqf0.a))) {
                            goto label_28;
                        }
                    label_34:
                        if(czqf0 == null) {
                            czsw.d(dataOutputStream1, czsq.f());
                        }
                        else {
                            byte[] arr_b2 = czqf0.b;
                            int v3 = arr_b2.length;
                            if(v3 < 8) {
                                cunf0.b().i("Cannot serialize BleL2capPacket for RESPONSE_ADVERTISEMENT : expected min %d advertisement raw bytes, but got %d", Integer.valueOf(8), Integer.valueOf(v3));
                                arr_b3 = null;
                            }
                            else {
                                arr_b3 = czsq.d(21, arr_b2);
                            }
                            if(arr_b3 == null) {
                                cunf0.c().h("The cached advertisement with invalid format! raw data : %s", czmk.g(arr_b2));
                                czsw.d(dataOutputStream1, czsq.f());
                            }
                            else {
                                czsw.d(dataOutputStream1, arr_b3);
                            }
                        }
                        continue;
                    }
                    else {
                        iterator0 = czsw0.g.values().iterator();
                        while(true) {
                        label_28:
                            if(!iterator0.hasNext()) {
                                goto label_29;
                            }
                            goto label_31;
                        }
                    }
                }
                switch(v2) {
                    case 2: {
                        break alab1;
                    }
                    case 3: {
                        goto label_54;
                    }
                }
            }
            bbpb.b(bluetoothSocket0);
            return;
        label_54:
            Map map0 = czsw0.e;
            if(map0.containsKey(s)) {
                cunf0.c().h("Receive duplicate data connection request from remote MAC address %s", s);
                czsw.d(dataOutputStream1, czsq.e());
                czsw.c(bluetoothSocket0);
            }
            else {
                czuc czuc0 = new czuc(s1, s, null, bluetoothSocket0, new czst(czsw0, s), czsw0.h);
                if(!czuc0.k(s1)) {
                    cunf0.e().p("MultiplexBleSocketImpl failed to init on L2CAP.", new Object[0]);
                    if(hvol.O()) {
                        czuc0.e();
                    }
                    else {
                        czuc0.c();
                    }
                    czuc0 = null;
                }
                if(czuc0 == null) {
                    cunf0.c().h("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", s);
                    czsw.d(dataOutputStream1, czsq.e());
                    czsw.c(bluetoothSocket0);
                }
                else {
                    czsw.d(dataOutputStream1, czsq.d(23, null));
                    map0.put(s, czuc0);
                }
            }
            return;
        }
        catch(IOException iOException2) {
            iOException1 = iOException2;
            dataOutputStream0 = dataOutputStream1;
        }
    label_79:
        czkq.a.c().f(iOException1).p("Failed to read/write data from incoming L2CAP socket.", new Object[0]);
        bbpb.b(bluetoothSocket0);
        bbpb.b(dataOutputStream0);
    }
}

