import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Message;
import android.util.Log;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class fefz extends fefk {
    final fegb a;

    public fefz(fegb fegb0) {
        Objects.requireNonNull(fegb0);
        this.a = fegb0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "GattConnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        gmcd gmcd0;
        BluetoothGattService bluetoothGattService0;
        int v = message0.what;
        if(v == 0) {
            this.a.w(this.a.f);
        }
        else {
            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = null;
            switch(v) {
                case 2: {
                    goto label_6;
                }
                case 3: {
                    goto label_16;
                }
                case 4: {
                    goto label_59;
                }
                case 5: {
                    goto label_66;
                }
                case 6: {
                    goto label_106;
                }
                case 7: {
                    this.a.j.disconnect();
                    return true;
                }
            }
            fegb.g(this.a, message0);
            return false;
        label_6:
            fegb fegb0 = this.a;
            gmcu gmcu0 = new gmcu();
            fegb0.n = gmcu0;
            boolean z = fegb0.j.requestMtu(0x205);
            ffmn.a("BleClientConnection", "bluetoothGatt.requestMtu() success: %b", new Object[]{Boolean.valueOf(z)});
            if(!z) {
                gmcu0.q(Integer.valueOf(0x101));
                fegb0.n = null;
            }
            gmcu0.hB(new fefx(this), gmap.a);
            return true;
        label_16:
            Log.d("BleClientConnection", "bluetoothGatt.discoverServicesSuccess() completed");
            fegb fegb1 = this.a;
            for(Object object0: fegb1.j.getServices()) {
                bluetoothGattService0 = (BluetoothGattService)object0;
                if(!bluetoothGattService0.getUuid().equals(fegb.a)) {
                    continue;
                }
                goto label_25;
            }
            bluetoothGattService0 = null;
        label_25:
            if(bluetoothGattService0 == null) {
                bluetoothGattService0 = fegb1.j.getService(fegb.a);
                if(bluetoothGattService0 == null) {
                    Log.w("BleClientConnection", "Service discovery is completed, but no psmService is found.");
                    return true;
                }
            }
            for(Object object1: bluetoothGattService0.getCharacteristics()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic1 = (BluetoothGattCharacteristic)object1;
                Log.d("BleClientConnection", "Discovered characteristic: " + bluetoothGattCharacteristic1.getUuid());
                if(bluetoothGattCharacteristic1.getUuid().equals(fegb.b)) {
                    bluetoothGattCharacteristic0 = bluetoothGattCharacteristic1;
                    break;
                }
            }
            if(bluetoothGattCharacteristic0 == null) {
                bluetoothGattCharacteristic0 = bluetoothGattService0.getCharacteristic(fegb.b);
                if(bluetoothGattCharacteristic0 == null) {
                    Log.w("BleClientConnection", "Service discovery is completed, but no psmCharacteristic is found.");
                    return true;
                }
            }
            if(fegb1.j.setCharacteristicNotification(bluetoothGattCharacteristic0, true)) {
                BluetoothGattDescriptor bluetoothGattDescriptor0 = bluetoothGattCharacteristic0.getDescriptor(fefc.i);
                if(bluetoothGattDescriptor0 == null) {
                    ffmn.f("BleClientConnection", "Failed to find CCCD", new Object[0]);
                    gmcd0 = gmbu.i(Integer.valueOf(0x101));
                }
                else {
                    gmcu gmcu1 = new gmcu();
                    fegb1.m = gmcu1;
                    ffmn.a("BleClientConnection", "writeDescriptor result: %d", new Object[]{fegb1.j.writeDescriptor(bluetoothGattDescriptor0, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)});
                    gmcd0 = gmcu1;
                }
            }
            else {
                ffmn.f("BleClientConnection", "Failed to set characteristic notification.", new Object[0]);
                gmcd0 = gmbu.i(Integer.valueOf(0x101));
            }
            gmcd0.hB(new fefy(this, bluetoothGattCharacteristic0), gmap.a);
            return true;
        label_59:
            fegb fegb2 = this.a;
            fegb2.v(4);
            fegc fegc0 = fegb2.k;
            if(fegc0 != null) {
                fegc0.a();
            }
            Log.d("BleClientConnection", "bluetoothGatt.discoverServicesSuccess() success: " + fegb2.j.discoverServices());
            return true;
        label_66:
            fefu fefu0 = (fefu)message0.obj;
            fegb fegb3 = this.a;
            if(fefu0.a.equals(fegb.b)) {
                String s = Arrays.toString(fefu0.b);
                ffmn.a("BleClientConnection", "Handle notification for PSM, bytes length: %d, content: %s", new Object[]{((int)fefu0.b.length), s});
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(fefu0.b.length);
                byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer0.put(fefu0.b);
                byteBuffer0.rewind();
                int v1 = byteBuffer0.getShort();
                Integer integer0 = v1;
                ffmn.a("BleClientConnection", "Read PSM notification, new psm: %d", new Object[]{integer0});
                fegc fegc1 = fegb3.k;
                if(fegc1 != null) {
                    synchronized(fegc1.d) {
                        if(fegc1.b) {
                        }
                        else if(fegc1.a == v1) {
                            fegc1.c = true;
                            ffmn.a("BleClientConnection", "Reusing existing bleClientThread with psm: %d", new Object[]{integer0});
                            return true;
                        }
                    }
                }
                fegc fegc2 = fegb3.k;
                if(fegc2 != null) {
                    ffmn.a("BleClientConnection", "Closing old bleClientThread with old psm: %d", new Object[]{((int)fegc2.a)});
                    fegb3.k.close();
                    fegb3.k = null;
                }
                if(v1 == 0) {
                    Log.w("BleClientConnection", "PSM is 0, stop retrying and wait for valid PSM.");
                    return true;
                }
                ffmn.a("BleClientConnection", "Creating new bleClientThread for psm: %d", new Object[]{integer0});
                fczq fczq0 = (fczq)fegb3.d.get();
                fegb3.k = new fegc(fegb3.e, fczq0, fegb3.i, v1);
                fegb3.k.start();
                return true;
            }
            ffmn.a("BleClientConnection", "Got unhandled notification for characteristic: %s", new Object[]{fefu0.a});
            return true;
        label_106:
            fefw fefw0 = (fefw)message0.obj;
            fczq fczq1 = (fczq)this.a.d.get();
            int v2 = fefw0.a;
            if(fczq1.l != v2) {
                fczq1.l = v2;
                return true;
            }
        }
        return true;
    }
}

