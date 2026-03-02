import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ehwn extends BluetoothGattCallback {
    public static final bboh a;
    public final clht b;
    public String c;
    public BluetoothGatt d;
    public boolean e;
    public eiex f;
    public final Runnable g;
    public ehwj h;
    private final eicb i;
    private final Context j;
    private final int k;
    private final BluetoothAdapter l;
    private int m;
    private int n;
    private final List o;
    private int p;

    static {
        ehwn.a = eicd.a("FD");
    }

    public ehwn(Context context0, String s, int v) {
        this.b = new clht();
        this.e = false;
        this.f = null;
        this.m = 0;
        this.n = 0;
        this.o = new ArrayList();
        this.g = new ehwm(this);
        this.i = eicb.a(context0);
        this.j = context0;
        this.l = bahu.a(context0);
        this.c = s;
        this.k = v;
    }

    public final void a(boolean z) {
        this.b.removeCallbacksAndMessages(null);
        if(z) {
            this.i(5, 0);
        }
        BluetoothGatt bluetoothGatt0 = this.d;
        if(bluetoothGatt0 == null) {
            return;
        }
        bluetoothGatt0.close();
        this.d = null;
        ((ggtj)ehwn.a.h()).B("Closing connection to MAC \'%s\'", eice.c(this.c));
    }

    public final void b(int v) {
        if(this.p != 1) {
            this.i(3, v);
        }
        this.o.clear();
        this.a(false);
        this.c();
    }

    public final void c() {
        String s = this.c;
        if(s == null) {
            ((ggtj)ehwn.a.i()).x("MAC address is null.");
            return;
        }
        if(!BluetoothAdapter.checkBluetoothAddress(s)) {
            ((ggtj)ehwn.a.i()).B("Unsupported MAC Address: \'%s\'", eice.c(this.c));
            return;
        }
        BluetoothAdapter bluetoothAdapter0 = this.l;
        if(bluetoothAdapter0 != null) {
            try {
                String s1 = this.c;
                BluetoothDevice bluetoothDevice0 = Build.VERSION.SDK_INT < 33 ? bluetoothAdapter0.getRemoteDevice(s1) : bluetoothAdapter0.getRemoteLeDevice(s1, 1);
                if(bluetoothDevice0 == null) {
                    ((ggtj)ehwn.a.i()).x("bluetoothDevice is null");
                    return;
                }
                if(this.p != 3) {
                    this.i(1, 0);
                }
                this.d = bluetoothDevice0.connectGatt(this.j, false, this, 2);
                ((ggtj)ehwn.a.h()).B("C to MAC \'%s\'", eice.c(this.c));
            }
            catch(IllegalArgumentException unused_ex) {
                ((ggtj)ehwn.a.j()).x("Device not found with provided address. Unable to connect.");
            }
            return;
        }
        ((ggtj)ehwn.a.i()).x("bluetoothAdapter is not initialized.");
    }

    private final void d() {
        eiex eiex0 = this.f;
        if(eiex0 == null) {
            return;
        }
        eicb eicb0 = this.i;
        if(eicb0 == null) {
            ((ggtj)ehwn.a.i()).x("ClearcutLogger is null");
        }
        else {
            List list0 = this.o;
            if(!list0.isEmpty()) {
                gwoe gwoe0 = (gwoe)((ProtoLiteMessage)gwoh.a).v_newBuilder();
                String s = eice.c(this.c);
                if(!gwoe0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwoe0).ensureMutable();
                }
                gwoh gwoh0 = (gwoh)gwoe0.b_message;
                gwoh0.b |= 2;
                gwoh0.d = s;
                gwoe0.a(list0);
                int v = this.k;
                if(!gwoe0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwoe0).ensureMutable();
                }
                gwoh gwoh1 = (gwoh)gwoe0.b_message;
                gwoh1.b |= 0x40;
                gwoh1.j = v;
                Long long0 = eiex0.e;
                if(long0 != null) {
                    long v1 = (long)long0;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh2 = (gwoh)gwoe0.b_message;
                    gwoh2.b |= 1;
                    gwoh2.c = v1;
                }
                Long long1 = eiex0.c;
                if(long1 != null) {
                    long v2 = (long)long1;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh3 = (gwoh)gwoe0.b_message;
                    gwoh3.b |= 8;
                    gwoh3.g = v2;
                }
                gwog gwog0 = eiex0.i;
                if(gwog0 != null) {
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    ((gwoh)gwoe0.b_message).i = gwog0.f;
                    ((gwoh)gwoe0.b_message).b |= 0x20;
                }
                Long long2 = eiex0.g;
                if(long2 != null) {
                    long v3 = (long)long2;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh4 = (gwoh)gwoe0.b_message;
                    gwoh4.b |= 16;
                    gwoh4.h = v3;
                }
                Integer integer0 = eiex0.h;
                if(integer0 != null) {
                    int v4 = (int)integer0;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh5 = (gwoh)gwoe0.b_message;
                    gwoh5.b |= 4;
                    gwoh5.f = v4;
                }
                eicb0.f(((gwoh)((ProtoLiteBuilder)gwoe0).N_build()));
            }
        }
        this.f = null;
    }

    private final void e(BluetoothGatt bluetoothGatt0) {
        String s = ehwn.j(bluetoothGatt0);
        BluetoothGattService bluetoothGattService0 = bluetoothGatt0.getService(UUID.fromString("7DFC9000-7D1C-4951-86AA-8D9728F8D66C"));
        BluetoothGattService bluetoothGattService1 = bluetoothGatt0.getService(UUID.fromString("15190001-12F4-C226-88ED-2AC5579F2A85"));
        if(bluetoothGattService0 != null) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bluetoothGattService0.getCharacteristic(UUID.fromString("7DFC9001-7D1C-4951-86AA-8D9728F8D66C"));
            if(bluetoothGattCharacteristic0 != null) {
                bluetoothGattCharacteristic0.setValue(0xAF, 17, 0);
                this.f(gwmp.e, 0);
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic0);
                return;
            }
            ((ggtj)ehwn.a.j()).B("ATag SS found on D (%s), but characteristic not found.", eice.c(s));
            this.f(gwmp.e, 0x85);
            this.d();
            if(!this.e) {
                bluetoothGatt0.disconnect();
            }
        }
        else if(bluetoothGattService1 != null) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic1 = bluetoothGattService1.getCharacteristic(UUID.fromString("8E0C0001-1D68-FB92-BF61-48377421680E"));
            if(bluetoothGattCharacteristic1 != null) {
                bluetoothGattCharacteristic1.setValue(eilt.b());
                this.f(gwmp.e, 0);
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic1);
                return;
            }
            ((ggtj)ehwn.a.j()).B("Finder SS found on D (%s), but characteristic not found.", eice.c(s));
            this.f(gwmp.e, 0x85);
            this.d();
            if(!this.e) {
                bluetoothGatt0.disconnect();
            }
        }
        else {
            bboh bboh0 = ehwn.a;
            ((ggtj)bboh0.i()).B("The D (%s) is not of expected type.", eice.c(s));
            gwmp gwmp0 = gwmp.e;
            if(this.h(gwmp0)) {
                int v = this.m + 1;
                this.m = v;
                ((ggtj)bboh0.h()).X("Starting SDRA %d (max %d) on D %s", Integer.valueOf(v), Long.valueOf(hrtd.C()), eice.c(s));
                this.e(bluetoothGatt0);
                return;
            }
            this.f(gwmp0, 0x85);
            this.d();
            if(!this.e) {
                bluetoothGatt0.disconnect();
            }
        }
    }

    private final void f(gwmp gwmp0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmq.a).v_newBuilder();
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwmq)hftv0).b |= 1;
        ((gwmq)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwmq)hftv1).d = gwmp0.h;
        ((gwmq)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwmq gwmq0 = (gwmq)hftp0.b_message;
        gwmq0.b |= 4;
        gwmq0.e = v;
        gwmq gwmq1 = (gwmq)hftp0.N_build();
        this.o.add(gwmq1);
    }

    private final boolean g() {
        eiex eiex0 = this.f;
        if(eiex0 != null) {
            if(eiex0.e != null) {
                eiex eiex1 = this.f;
                gftb.check(eiex1);
                gftb.check(eiex1.e);
                long v = hrtd.z();
                return System.currentTimeMillis() - ((long)eiex1.e) < v;
            }
            return true;
        }
        return false;
    }

    private final boolean h(gwmp gwmp0) {
        BluetoothAdapter bluetoothAdapter0 = this.l;
        if(bluetoothAdapter0 == null) {
            ((ggtj)ehwn.a.i()).x("bluetoothAdapter is not initialized.");
            return false;
        }
        if(bluetoothAdapter0.isEnabled()) {
            switch(gwmp0.ordinal()) {
                case 1: {
                    return this.e;
                }
                case 2: {
                    return !this.e;
                }
                case 3: {
                    return this.g() ? this.n < ((int)hrtd.A()) : false;
                }
                case 4: {
                    return this.g() ? this.m < ((int)hrtd.C()) : false;
                }
                default: {
                    ((ggtj)ehwn.a.j()).B("Unsupported operation in mayRetry: %s", gwmp0);
                    return false;
                }
            }
        }
        return false;
    }

    private final void i(int v, int v1) {
        int v2;
        if(v == this.p) {
            return;
        }
        ehwj ehwj0 = this.h;
        if(ehwj0 == null) {
            v2 = v;
        }
        else {
            v2 = v;
            ehwj0.a.ii(new ehwq(v2, gfsx.m(Integer.valueOf(v1)), gfqx.a, gfqx.a, gfqx.a));
        }
        Intent intent0 = new Intent("com.google.android.personalsafety.internal.finddevice.BLUETOOTH_STATE_CHANGE_INTENT_ACTION").putExtra("BluetoothStateKey", ehwp.a(v2)).putExtra("ConnectionStatusCodeKey", v1).putExtra("TimestampKey", System.currentTimeMillis());
        LocalBroadcastReceiver.c(this.j, intent0);
        this.p = v2;
    }

    private static final String j(BluetoothGatt bluetoothGatt0) {
        return eilt.a(bluetoothGatt0.getDevice().getAddress());
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt0, BluetoothGattCharacteristic bluetoothGattCharacteristic0, int v) {
        super.onCharacteristicWrite(bluetoothGatt0, bluetoothGattCharacteristic0, v);
        UUID uUID0 = bluetoothGattCharacteristic0.getUuid();
        if(v != 0) {
        label_12:
            bboh bboh0 = ehwn.a;
            ((ggtj)bboh0.h()).B("S failed on D %s", eice.c(this.c));
            ((ggtj)bboh0.j()).H("CW failed with GSC \'%d\' on D %s", v, eice.c(this.c));
            gwmp gwmp0 = gwmp.d;
            if(this.h(gwmp0)) {
                int v1 = this.n + 1;
                this.n = v1;
                ((ggtj)bboh0.h()).X("Starting CWRA %d (max %d) for D %s", Integer.valueOf(v1), Long.valueOf(hrtd.A()), eice.c(this.c));
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic0);
                return;
            }
            this.f(gwmp0, v);
            this.d();
            eiet.b(this.j, Integer.valueOf(this.k), this.c, "com.google.android.personalsafety.internal.ringing.WRITE_CHARACTERISTIC_FAILURE", Integer.valueOf(v));
        }
        else if(!uUID0.equals(UUID.fromString("7DFC9001-7D1C-4951-86AA-8D9728F8D66C")) && !uUID0.equals(UUID.fromString("8E0C0001-1D68-FB92-BF61-48377421680E"))) {
            v = 0;
            goto label_12;
        }
        else {
            ((ggtj)ehwn.a.h()).B("S started on D %s.", eice.c(this.c));
            ((ggtj)ehwn.a.h()).H("CW success with GSC \'%d\' on D %s", 0, eice.c(this.c));
            this.f(gwmp.d, 0);
            this.d();
            eiet.b(this.j, Integer.valueOf(this.k), this.c, "com.google.android.personalsafety.internal.ringing.WRITE_CHARACTERISTIC_SUCCESSFUL", Integer.valueOf(0));
        }
        if(!this.e) {
            bluetoothGatt0.disconnect();
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt0, int v, int v1) {
        String s = ehwn.j(bluetoothGatt0);
        this.c = s;
        if(v1 == 2) {
            ((ggtj)ehwn.a.h()).P("C to D (%s). GSC = %d", eice.c(s), v);
            this.i(2, v);
            eiet.b(this.j, Integer.valueOf(this.k), s, "com.google.android.personalsafety.internal.ringing.CONNECTION_SUCCESSFUL", Integer.valueOf(v));
            this.f(gwmp.b, v);
            if(this.g()) {
                bluetoothGatt0.discoverServices();
            }
            this.g.run();
            return;
        }
        if(v1 == 0) {
            if(v == 0) {
                ((ggtj)ehwn.a.h()).P("DC from D (%s). GSC = %d", eice.c(s), 0);
            }
            else {
                ((ggtj)ehwn.a.j()).P("UTC to D (%s). GSC = %d", eice.c(s), v);
            }
            if(this.e) {
                if(v == 0x101) {
                    this.a(false);
                    this.i(3, 0x101);
                    ehwl ehwl0 = new ehwl(this);
                    this.b.postDelayed(ehwl0, 500L);
                    return;
                }
                this.b(v);
                return;
            }
            this.f(gwmp.c, v);
            this.a(true);
            if(v == 0) {
                eiet.b(this.j, Integer.valueOf(this.k), s, "com.google.android.personalsafety.internal.ringing.DISCONNECT_SUCCESSFUL", Integer.valueOf(0));
                return;
            }
            eiet.b(this.j, Integer.valueOf(this.k), s, "com.google.android.personalsafety.internal.ringing.CONNECTION_FAILURE", Integer.valueOf(v));
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt0, int v, int v1) {
        super.onReadRemoteRssi(bluetoothGatt0, v, v1);
        if(v1 == 0) {
            ehwn.j(bluetoothGatt0);
            ehwj ehwj0 = this.h;
            if(ehwj0 != null) {
                ehwj0.c(v, 1);
            }
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt0, int v) {
        String s = ehwn.j(bluetoothGatt0);
        if(v == 0) {
            ((ggtj)ehwn.a.h()).P("SD on D (%s). GSC = %d", eice.c(s), 0);
            this.e(bluetoothGatt0);
        }
        else {
            bboh bboh0 = ehwn.a;
            ((ggtj)bboh0.j()).P("SD failed on D (%s). GSC = %d", eice.c(s), v);
            gwmp gwmp0 = gwmp.e;
            if(this.h(gwmp0)) {
                int v1 = this.m + 1;
                this.m = v1;
                ((ggtj)bboh0.h()).X("Starting SDRA %d (max %d) on D %s", Integer.valueOf(v1), Long.valueOf(hrtd.C()), eice.c(s));
                bluetoothGatt0.discoverServices();
            }
            else {
                this.f(gwmp0, v);
                this.d();
                List list0 = this.o;
                if(!list0.isEmpty()) {
                    list0.remove(list0.size() - 1);
                }
                if(!this.e) {
                    bluetoothGatt0.disconnect();
                }
            }
        }
        super.onServicesDiscovered(bluetoothGatt0, v);
    }
}

