import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

final class bnmo extends fgvg {
    final bnmp a;

    public bnmo(bnmp bnmp0) {
        Objects.requireNonNull(bnmp0);
        this.a = bnmp0;
        super();
    }

    @Override  // fgvg
    public final void a(fgva fgva0, int v, int v1, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        bnmp bnmp0 = this.a;
        synchronized(bnmp0.c) {
            fgve fgve0 = bnmp0.d;
            if(fgve0 == null) {
                ((ggtj)bnmp.a.j()).x("GATT server missing on characteristic read request");
                return;
            }
            if("a3c87601-0005-1000-8000-001a11000100".equals(bluetoothGattCharacteristic0.getUuid().toString())) {
                ByteString hfsf0 = bnmp0.e;
                long v3 = bnmp0.l.d().toEpochMilli();
                if(Long.compare(v3, bnmp0.h) > 0) {
                    bnmp0.h = v3;
                    bnmp0.g = 0;
                }
                byte[] arr_b = new byte[12];
                bnmp0.k.nextBytes(arr_b);
                bnmp0.f = ByteString.copyFrom(arr_b);
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
                byteBuffer0.put(0);
                byteBuffer0.put(arr_b);
                byteBuffer0.put(bnmp0.g);
                byteBuffer0.putShort(((short)(((int)((bnmp0.h - v3) / 100L)))));
                fgve0.d(fgva0, v, 0, 0, fras.e(hfsf0, ByteString.copyFrom(byteBuffer0.array())).toByteArray());
            }
            else if("a3c87602-0005-1000-8000-001a11000100".equals(bluetoothGattCharacteristic0.getUuid().toString())) {
                fgve0.d(fgva0, v, 0, 0, bnmp.b.toByteArray());
            }
            else {
                ((ggtj)bnmp.a.j()).B("Read request for an unknown characteristic %s", bluetoothGattCharacteristic0.getUuid());
                fgve0.d(fgva0, v, 0x101, 0, null);
            }
        }
    }

    @Override  // fgvg
    public final void b(fgva fgva0, int v, BluetoothGattCharacteristic bluetoothGattCharacteristic0, boolean z, boolean z1, int v1, byte[] arr_b) {
        int v3;
        bnmp bnmp0 = this.a;
        synchronized(bnmp0.c) {
            fgve fgve0 = bnmp0.d;
            if(fgve0 == null) {
                ((ggtj)bnmp.a.j()).x("GATT server missing on characteristic write request");
                return;
            }
            if(!"a3c87601-0005-1000-8000-001a11000100".equals(bluetoothGattCharacteristic0.getUuid().toString())) {
                ((ggtj)bnmp.a.j()).B("Write request for an unknown characteristic %s", bluetoothGattCharacteristic0.getUuid());
                v3 = 0x101;
            }
            else if(arr_b.length == 16) {
                ByteString hfsf0 = fras.d(bnmp0.e, ByteString.copyFrom(arr_b));
                if(hfsf0.a(0) == 1 && bnmp0.f.equals(hfsf0.j(1, 13))) {
                    byte b = hfsf0.a(13);
                    if(b <= 3 && b >= 0) {
                        int v4 = ((char)glwy.c(hfsf0.j(12, 16).toByteArray())) * 100;
                        if(v4 <= 0) {
                            b = 0;
                        }
                        bnmp0.g = b;
                        if(b != 0) {
                            bnmp0.m.a(bbdg.iW);
                            bnmp0.h = bnmp0.l.d().toEpochMilli() + ((long)v4);
                        }
                        Intent intent0 = new Intent();
                        Context context0 = bnmp0.j;
                        Intent intent1 = intent0.setClassName(context0, "com.google.android.gms.mdm.services.RingService");
                        intent1.putExtra("local_origin", "spot");
                        if(bnmp0.g == 0) {
                            intent1.setAction("stopRinging");
                        }
                        WakefulBroadcastReceiver.startWakefulService(context0, intent1);
                        v3 = 0;
                    }
                    else {
                        v3 = 0x101;
                    }
                }
                else {
                    v3 = 3;
                }
            }
            else {
                ((ggtj)bnmp.a.j()).x("Wrong ringing state value length");
                v3 = 13;
            }
            fgve0.d(fgva0, v, v3, 0, null);
        }
    }

    @Override  // fgvg
    public final void c(fgva fgva0, int v, BluetoothGattDescriptor bluetoothGattDescriptor0, boolean z, boolean z1, int v1, byte[] arr_b) {
        bnmp bnmp0 = this.a;
        synchronized(bnmp0.c) {
            fgve fgve0 = bnmp0.d;
            if(fgve0 == null) {
                ((ggtj)bnmp.a.j()).x("GATT server missing on descriptor write request");
                return;
            }
            if("00002902-0000-1000-8000-00805f9b34fb".equals(bluetoothGattDescriptor0.getUuid().toString()) && "a3c87603-0005-1000-8000-001a11000100".equals(bluetoothGattDescriptor0.getCharacteristic().getUuid().toString())) {
                if(Arrays.equals(arr_b, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)) {
                    bnmp0.i.add(fgva0);
                }
                else {
                    bnmp0.i.remove(fgva0);
                }
                fgve0.d(fgva0, v, 0, 0, null);
                return;
            }
            ggtj ggtj0 = (ggtj)bnmp.a.j();
            UUID uUID0 = bluetoothGattDescriptor0.getUuid();
            UUID uUID1 = bluetoothGattDescriptor0.getCharacteristic() == null ? "" : bluetoothGattDescriptor0.getCharacteristic().getUuid();
            ggtj0.R("Write request for an unknown descriptor %s or characteristic %s", uUID0, uUID1);
            fgve0.d(fgva0, v, 0x101, 0, null);
        }
    }
}

