import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.google.android.gms.personalsafety.ringing.BleRingingIntentOperation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class eier extends BluetoothGattCallback {
    protected static final String a;
    private final eicb b;
    private final Context c;
    private final BluetoothAdapter d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final Map h;
    private final Map i;

    static {
        eier.a = String.format("%s GCB:", "[S]");
    }

    public eier(Context context0, Map map0) {
        this.b = eicb.a(context0);
        this.c = context0;
        this.d = bahu.a(context0);
        this.e = map0;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
    }

    private final void a(String s, gwmp gwmp0, int v) {
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
        String s1 = eilt.a(s);
        Map map0 = this.i;
        if(!map0.containsKey(s1)) {
            map0.put(s1, new ArrayList());
        }
        ((List)map0.get(s1)).add(((gwmq)hftp0.N_build()));
    }

    private final void b(BluetoothGatt bluetoothGatt0) {
        eicb eicb0 = this.b;
        if(eicb0 == null) {
            ((ggtj)eicd.a.i()).x("ClearcutLogger is null");
            return;
        }
        String s = eier.g(bluetoothGatt0);
        eiex eiex0 = (eiex)this.e.get(s);
        Map map0 = this.i;
        if(map0.containsKey(s) && eiex0 != null) {
            List list0 = (List)map0.get(s);
            if(!list0.isEmpty()) {
                gwoe gwoe0 = (gwoe)((ProtoLiteMessage)gwoh.a).v_newBuilder();
                String s1 = eice.c(s);
                if(!gwoe0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwoe0).ensureMutable();
                }
                gwoh gwoh0 = (gwoh)gwoe0.b_message;
                gwoh0.b |= 2;
                gwoh0.d = s1;
                gwoe0.a(list0);
                if(!gwoe0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwoe0).ensureMutable();
                }
                gwoh gwoh1 = (gwoh)gwoe0.b_message;
                gwoh1.b |= 0x40;
                gwoh1.j = 1;
                Long long0 = eiex0.e;
                if(long0 != null) {
                    long v = (long)long0;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh2 = (gwoh)gwoe0.b_message;
                    gwoh2.b |= 1;
                    gwoh2.c = v;
                }
                Long long1 = eiex0.c;
                if(long1 != null) {
                    long v1 = (long)long1;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh3 = (gwoh)gwoe0.b_message;
                    gwoh3.b |= 8;
                    gwoh3.g = v1;
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
                    long v2 = (long)long2;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh4 = (gwoh)gwoe0.b_message;
                    gwoh4.b |= 16;
                    gwoh4.h = v2;
                }
                Integer integer0 = eiex0.h;
                if(integer0 != null) {
                    int v3 = (int)integer0;
                    if(!gwoe0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwoe0).ensureMutable();
                    }
                    gwoh gwoh5 = (gwoh)gwoe0.b_message;
                    gwoh5.b |= 4;
                    gwoh5.f = v3;
                }
                eicb0.f(((gwoh)((ProtoLiteBuilder)gwoe0).N_build()));
            }
        }
    }

    private final void c(BluetoothGatt bluetoothGatt0) {
        String s = eier.g(bluetoothGatt0);
        BluetoothGattService bluetoothGattService0 = bluetoothGatt0.getService(UUID.fromString("7DFC9000-7D1C-4951-86AA-8D9728F8D66C"));
        BluetoothGattService bluetoothGattService1 = bluetoothGatt0.getService(UUID.fromString("15190001-12F4-C226-88ED-2AC5579F2A85"));
        if(bluetoothGattService0 != null) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bluetoothGattService0.getCharacteristic(UUID.fromString("7DFC9001-7D1C-4951-86AA-8D9728F8D66C"));
            if(bluetoothGattCharacteristic0 != null) {
                bluetoothGattCharacteristic0.setValue(0xAF, 17, 0);
                this.a(bluetoothGatt0.getDevice().getAddress(), gwmp.e, 0);
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic0);
                return;
            }
            ggtj ggtj0 = (ggtj)eicd.a.j();
            String s1 = eice.c(s);
            ggtj0.R("%s SS found on D (%s), but characteristic not found.", eier.a, s1);
            this.a(s, gwmp.e, 0x85);
            bluetoothGatt0.disconnect();
            return;
        }
        if(bluetoothGattService1 != null) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic1 = bluetoothGattService1.getCharacteristic(UUID.fromString("8E0C0001-1D68-FB92-BF61-48377421680E"));
            if(bluetoothGattCharacteristic1 != null) {
                bluetoothGattCharacteristic1.setValue(eilt.b());
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic1);
                return;
            }
            ((ggtj)eicd.a.j()).x("Dult service found, but sound characteristic not found.");
            return;
        }
        bboh bboh0 = eicd.a;
        ggtj ggtj1 = (ggtj)bboh0.i();
        String s2 = eier.a;
        ggtj1.R("%s The D (%s) is not of expected type.", s2, eice.c(s));
        gwmp gwmp0 = gwmp.e;
        if(this.e(gwmp0, s)) {
            eier.h(this.g, s);
            ((ggtj)bboh0.h()).Y("%s Starting SDRA %d (max %d) on D %s", s2, this.g.get(s), Long.valueOf(hrtd.C()), eice.c(s));
            this.c(bluetoothGatt0);
            return;
        }
        this.a(bluetoothGatt0.getDevice().getAddress(), gwmp0, 0x85);
        bluetoothGatt0.disconnect();
    }

    private final void d(String s) {
        BleRingingIntentOperation.a(this.c, this.d, s, this);
    }

    private final boolean e(gwmp gwmp0, String s) {
        long v1;
        int v;
        switch(gwmp0.ordinal()) {
            case 1: {
                v = eier.f(this.f, s);
                v1 = hrtd.B();
                break;
            }
            case 2: {
                v = eier.f(this.f, s);
                v1 = hrtd.B();
                break;
            }
            case 3: {
                v = eier.f(this.h, s);
                v1 = hrtd.A();
                break;
            }
            case 4: {
                v = eier.f(this.g, s);
                v1 = hrtd.C();
                break;
            }
            default: {
                return false;
            }
        }
        eiex eiex0 = (eiex)this.e.get(s);
        gftb.check(eiex0);
        gftb.check(eiex0.e);
        long v2 = hrtd.z();
        if(System.currentTimeMillis() - ((long)eiex0.e) < v2) {
            BluetoothAdapter bluetoothAdapter0 = this.d;
            if(bluetoothAdapter0 == null) {
                ((ggtj)eicd.a.i()).x("bluetoothAdapter is not initialized.");
                return false;
            }
            return bluetoothAdapter0.isEnabled() && v < ((int)v1);
        }
        return false;
    }

    private static final int f(Map map0, String s) {
        return map0.containsKey(s) ? ((int)(((Integer)map0.get(s)))) : 0;
    }

    private static final String g(BluetoothGatt bluetoothGatt0) {
        return eilt.a(bluetoothGatt0.getDevice().getAddress());
    }

    private static final void h(Map map0, String s) {
        map0.put(s, Integer.valueOf(eier.f(map0, s) + 1));
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt0, BluetoothGattCharacteristic bluetoothGattCharacteristic0, int v) {
        super.onCharacteristicWrite(bluetoothGatt0, bluetoothGattCharacteristic0, v);
        String s = eier.g(bluetoothGatt0);
        Integer integer0 = (int)1;
        if(v != 0) {
        label_16:
            bboh bboh0 = eicd.a;
            ggtj ggtj2 = (ggtj)bboh0.h();
            String s3 = eier.a;
            ggtj2.R("%s S failed on D %s", s3, eice.c(s));
            Integer integer2 = v;
            ((ggtj)bboh0.j()).X("%s CW failed with GSC \'%d\' on D %s", s3, integer2, eice.c(s));
            gwmp gwmp0 = gwmp.d;
            if(this.e(gwmp0, s)) {
                eier.h(this.h, s);
                ((ggtj)bboh0.h()).Y("%s Starting CWRA %d (max %d) for D %s", s3, this.h.get(s), Long.valueOf(hrtd.A()), eice.c(s));
                bluetoothGatt0.writeCharacteristic(bluetoothGattCharacteristic0);
                return;
            }
            eiet.b(this.c, integer0, s, "com.google.android.personalsafety.internal.ringing.WRITE_CHARACTERISTIC_FAILURE", integer2);
            this.a(bluetoothGatt0.getDevice().getAddress(), gwmp0, v);
        }
        else if(bluetoothGattCharacteristic0.getUuid().equals(UUID.fromString("7DFC9001-7D1C-4951-86AA-8D9728F8D66C"))) {
            ggtj ggtj0 = (ggtj)eicd.a.h();
            String s1 = eice.c(s);
            ggtj0.R("%s S started on D %s.", eier.a, s1);
            ggtj ggtj1 = (ggtj)eicd.a.h();
            Integer integer1 = (int)0;
            String s2 = eice.c(s);
            ggtj1.X("%s CW success with GSC \'%d\' on D %s", eier.a, integer1, s2);
            eiet.b(this.c, integer0, s, "com.google.android.personalsafety.internal.ringing.WRITE_CHARACTERISTIC_SUCCESSFUL", integer1);
            this.a(bluetoothGatt0.getDevice().getAddress(), gwmp.d, 0);
        }
        else {
            v = 0;
            goto label_16;
        }
        bluetoothGatt0.disconnect();
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt0, int v, int v1) {
        String s = eier.g(bluetoothGatt0);
        Integer integer0 = (int)1;
        if(v1 == 2) {
            bluetoothGatt0.discoverServices();
            ggtj ggtj0 = (ggtj)eicd.a.h();
            String s1 = eice.c(s);
            Integer integer1 = v;
            ggtj0.X("%s C to D (%s). GSC = %d", eier.a, s1, integer1);
            eiet.b(this.c, integer0, s, "com.google.android.personalsafety.internal.ringing.CONNECTION_SUCCESSFUL", integer1);
            this.a(s, gwmp.b, v);
            return;
        }
        if(v1 == 0) {
            if(v == 0) {
                bboh bboh0 = eicd.a;
                ggtj ggtj1 = (ggtj)bboh0.h();
                String s2 = eier.a;
                Integer integer2 = (int)0;
                ggtj1.X("%s DC from D (%s). GSC = %d", s2, eice.c(s), integer2);
                String s3 = eilt.a(s);
                Map map0 = this.i;
                if(!map0.containsKey(s3)) {
                    map0.put(s3, new ArrayList());
                }
                List list0 = (List)map0.get(s3);
                if(!list0.isEmpty()) {
                    gwmq gwmq0 = (gwmq)gggq.p(list0);
                    if((gwmp.b(gwmq0.d) == null ? gwmp.a : gwmp.b(gwmq0.d)) == gwmp.b && gwmq0.e == 0 && this.e(gwmp.b, s)) {
                        String s4 = eilt.a(s);
                        if(map0.containsKey(s4)) {
                            ((List)map0.get(s4)).clear();
                        }
                        eier.h(this.f, s);
                        ((ggtj)bboh0.h()).Y("%s Starting CRA %d (max %d) for D %s", s2, this.f.get(s), Long.valueOf(hrtd.B()), eice.c(s));
                        this.d(s);
                        return;
                    }
                }
                bluetoothGatt0.close();
                eiet.b(this.c, integer0, s, "com.google.android.personalsafety.internal.ringing.DISCONNECT_SUCCESSFUL", integer2);
                this.a(s, gwmp.c, 0);
                this.b(bluetoothGatt0);
                return;
            }
        }
        else if(v1 != 0) {
            return;
        }
        bboh bboh1 = eicd.a;
        ggtj ggtj2 = (ggtj)bboh1.j();
        String s5 = eier.a;
        Integer integer3 = v;
        ggtj2.X("%s UTC to D (%s). GSC = %d", s5, eice.c(s), integer3);
        gwmp gwmp0 = gwmp.b;
        if(this.e(gwmp0, s)) {
            eier.h(this.f, s);
            ((ggtj)bboh1.h()).Y("%s Starting CRA %d (max %d) for D %s", s5, this.f.get(s), Long.valueOf(hrtd.B()), eice.c(s));
            this.d(s);
            return;
        }
        bluetoothGatt0.close();
        eiet.b(this.c, integer0, s, "com.google.android.personalsafety.internal.ringing.CONNECTION_FAILURE", integer3);
        this.a(s, gwmp0, v);
        this.b(bluetoothGatt0);
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt0, int v) {
        String s = eier.g(bluetoothGatt0);
        if(v == 0) {
            ggtj ggtj0 = (ggtj)eicd.a.h();
            String s1 = eice.c(s);
            ggtj0.X("%s SD on D (%s). GSC = %d", eier.a, s1, Integer.valueOf(0));
            this.c(bluetoothGatt0);
        }
        else {
            bboh bboh0 = eicd.a;
            ggtj ggtj1 = (ggtj)bboh0.j();
            String s2 = eier.a;
            ggtj1.X("%s SD failed on D (%s). GSC = %d", s2, eice.c(s), Integer.valueOf(v));
            gwmp gwmp0 = gwmp.e;
            if(this.e(gwmp0, s)) {
                eier.h(this.g, s);
                ((ggtj)bboh0.h()).Y("%s Starting SDRA %d (max %d) on D %s", s2, this.g.get(s), Long.valueOf(hrtd.C()), eice.c(s));
                bluetoothGatt0.discoverServices();
            }
            else {
                this.a(s, gwmp0, v);
                bluetoothGatt0.disconnect();
            }
        }
        super.onServicesDiscovered(bluetoothGatt0, v);
    }
}

