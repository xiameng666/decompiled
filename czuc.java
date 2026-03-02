import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.SystemClock;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class czuc extends czun {
    private final Map q;
    private czts r;
    private boolean s;

    private czuc(String s, Context context0, String s1, czuo czuo0, int v, int v1) {
        super(s, context0, s1, null, null, czuo0, v, v1);
        this.q = DesugarCollections.synchronizedMap(new bxd());
    }

    public czuc(String s, String s1, gelz gelz0, BluetoothSocket bluetoothSocket0, czuo czuo0, czts czts0) {
        super(s, null, s1, gelz0, bluetoothSocket0, czuo0, 0, 0);
        this.q = DesugarCollections.synchronizedMap(new bxd());
        this.r = czts0;
    }

    public static czle a(Context context0, czql czql0, String s, czuo czuo0, int v) {
        czle czle3;
        czle czle2;
        boolean z;
        czle czle1;
        czle czle0;
        String s1 = czql0.a;
        czuc czuc0 = new czuc(s1, context0, s, czuo0, czql0.b.d, v);
        Boolean boolean0 = Boolean.valueOf(true);
        Boolean boolean1 = Boolean.valueOf(false);
        if(!hvol.aF() || czql0.c) {
            czuc0.a = false;
            int v1 = czuc0.o;
            if(v1 > 0) {
                String s2 = czuc0.b;
                BluetoothDevice bluetoothDevice0 = (BluetoothDevice)czup.a(context0, s1, s2, true).a.g();
                if(bluetoothDevice0 == null) {
                    czkq.a.c().h("Can\'t find remote BluetoothDevice with address %s", s2);
                    czle0 = new czle(gyxo.bX);
                }
                else {
                    try {
                        czle0 = new czle(new czsg(bluetoothDevice0, v1), gyxo.b);
                    }
                    catch(IOException iOException0) {
                        String s3 = String.format(Locale.US, "MAC address : %s, PSM : %d, Exception : %s", bluetoothDevice0.getAddress(), v1, iOException0.getMessage());
                        czke.j(s1, 8, gylz.d, gymd.aa, s3);
                        czle0 = new czle(gyxo.cv);
                    }
                }
                czsg czsg0 = (czsg)czle0.a.g();
                if(czsg0 == null) {
                    czle1 = new czle(boolean1, czle0.b);
                }
                else {
                    czsf czsf0 = czsg0.f(s1, 8);
                    if(czsf0.a) {
                        long v2 = SystemClock.elapsedRealtime();
                        cumn cumn0 = czsg0.a();
                        try {
                            DataInputStream dataInputStream0 = new DataInputStream(new BufferedInputStream(czsg0.c.getInputStream()));
                            DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(czsg0.c.getOutputStream()));
                            byte[] arr_b = czsq.d(3, null);
                            if(arr_b != null) {
                                czsg.e(dataOutputStream0, arr_b);
                            }
                            z = czsg.b(dataInputStream0).a == 23;
                            czkq.a.b().i("BleL2capClient data connection to device %s was successful? %b", czsg0.a, Boolean.valueOf(z));
                        }
                        catch(IOException iOException1) {
                            if(iOException1.getMessage() == null) {
                                czke.h(s1, 8, gymb.h);
                            }
                            else if(iOException1.getMessage().contains("Got invalid length of BleL2capPacket from server")) {
                                czke.j(s1, 8, gymb.h, gymd.ah, iOException1.getMessage());
                            }
                            else if(iOException1.getMessage().contains("Got invalid BleL2capPacket bytes from server")) {
                                czke.j(s1, 8, gymb.h, gymd.ai, iOException1.getMessage());
                            }
                            else if((iOException1 instanceof EOFException)) {
                                czke.j(s1, 8, gymb.h, gymd.aj, iOException1.getMessage());
                            }
                            else if(iOException1.getMessage().contains("read failed, socket might closed or timeout")) {
                                czke.i(s1, 8, gymb.h, gymd.ak);
                            }
                            else {
                                czke.j(s1, 8, gymb.h, gymd.a, iOException1.getMessage());
                            }
                            z = false;
                        }
                        finally {
                            cumn0.b();
                        }
                        if(hvol.aa()) {
                            czkq.a.b().h("[PERFORMANCE] Connection : requestDataConnection for L2cap took %d ms.", Long.valueOf(SystemClock.elapsedRealtime() - v2));
                        }
                        czle2 = new czle(Boolean.valueOf(z), (z ? gyxo.b : gyxo.cw));
                    }
                    else {
                        czle2 = (czsf0.b instanceof TimeoutException) ? new czle(boolean1, gyxo.da) : new czle(boolean1, gyxo.bZ);
                    }
                    if(((Boolean)czle2.a.d()).equals(boolean0)) {
                        try {
                            czuc0.super.o(s1, 8, czsg0.c.getInputStream());
                            czuc0.m = czsg0;
                            czle1 = new czle(boolean0, gyxo.b);
                        }
                        catch(IOException unused_ex) {
                            czsg0.c();
                            czle1 = new czle(boolean1, czle2.b);
                        }
                    }
                    else {
                        czle1 = new czle(boolean1, czle2.b);
                    }
                }
            }
            else {
                czle1 = new czle(boolean1, gyxo.fn);
            }
            if(Objects.equals(czle1.a.d(), boolean0)) {
                czug czug0 = new czug(czuc0, context0, czql0);
                czuc0.h.execute(czug0);
                czle3 = new czle(boolean0, gyxo.b);
            }
            else {
                if(czql0.c && czuc0.m == null) {
                    czle3 = new czle(boolean1, czle1.b);
                    goto label_95;
                }
                goto label_83;
            }
        }
        else {
        label_83:
            long v4 = SystemClock.elapsedRealtime();
            gekx gekx0 = czuc0.super.i(czql0);
            if(hvol.aa()) {
                czkq.a.b().i("[PERFORMANCE] Connection : create Gatt connection took %d ms, success = %s.", Long.valueOf(SystemClock.elapsedRealtime() - v4), Boolean.valueOf(gekx0 != null));
            }
            czuc0.i = gekx0;
            if(gekx0 == null) {
                czle3 = new czle(boolean1, gyxo.cj);
            }
            else {
                czuc0.l = new czum(czuc0, czql0.a, 8);
                czuc0.k = new gemf(gekx0, czuc0.l);
                czuc0.k.n();
                czle3 = czuc0.super.p(czql0.a, 8) ? new czle(boolean0, gyxo.b) : new czle(boolean1, gyxo.bY);
            }
        }
    label_95:
        if(Objects.equals(czle3.a.d(), boolean0)) {
            return new czle(czuc0, gyxo.b);
        }
        czkq.a.e().h("MultiplexBleSocketImpl failed to connect to server %s.", s);
        if(hvol.O()) {
            czuc0.e();
            return new czle(czle3.b);
        }
        czuc0.c();
        return new czle(czle3.b);
    }

    public final czti b(czql czql0, int v) {
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        String s = czup.c();
        String s1 = czql0.a;
        byte[] arr_b = czup.h(s1, (this.s ? s : ""));
        if(hvol.U()) {
            czkq.a.b().l("MultiplexBleSocketImpl request a new outgoing BleSocket to serivice ID %s service ID hash salt %s service ID hash %s salted service ID hash %s receiverSupportSaltedHash %s", s1, s, czup.g(s1), czup.h(s1, s), Boolean.valueOf(this.s));
        }
        czti czti0 = this.h(arr_b, s, czql0.c);
        if(czti0 == null) {
            czkq.a.e().h("MultiplexBleSocketImpl failed to create a new outgoing BLE socket for service ID %s because the BLE socket failed to initialize.", s1);
            FIN.finallyExec$NT(v1);
            return null;
        }
        czti0.j = s1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gytk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gytk)hftp0.b_message).c = 1;
        ((gytk)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gytg.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(czti0.h);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gytg)hftv0).b |= 1;
        ((gytg)hftv0).c = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gytg)hftv1).d = 2;
        ((gytg)hftv1).b |= 2;
        String s2 = czti0.i;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gytg gytg0 = (gytg)hftp1.b_message;
        s2.getClass();
        gytg0.b |= 4;
        gytg0.e = s2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gytk gytk0 = (gytk)hftp0.b_message;
        gytg gytg1 = (gytg)hftp1.N_build();
        gytg1.getClass();
        gytk0.d = gytg1;
        gytk0.b |= 2;
        byte[] arr_b1 = ((gytk)hftp0.N_build()).toBytesArray();
        try {
            long v2 = SystemClock.elapsedRealtime();
            czti0.s(arr_b1);
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] Connection : wrote BLE introduction frame took %d ms.", Long.valueOf(SystemClock.elapsedRealtime() - v2));
            }
            FIN.finallyExec$NT(v1);
            return czti0;
        }
        catch(IOException iOException0) {
            czkq.a.c().f(iOException0).h("BleSocketImpl failed to send a introduction packet to connect for service ID hash %s.", czmk.g(czti0.h));
            czkq.a.e().i("MultiplexBleSocketImpl failed to request a new outgoing BleSocket to %s for service ID %s", this.b, czql0.a);
            bbpb.b(czti0);
            FIN.finallyCodeBegin$NT(v1);
            return null;
        }
    }

    public final void c() {
        if(hvol.U()) {
            czkq.a.b().h("MultiplexBleSocketImpl close() closeStreams for all BLE sockets %s", this.q);
        }
        Map map0 = this.q;
        for(Object object0: map0.values()) {
            ((czti)object0).r();
        }
        map0.clear();
        this.a = true;
        gelh gelh0 = this.k;
        if(gelh0 != null) {
            gelh0.a();
            if(hvol.bf()) {
                cunf cunf0 = czkq.a;
                cunf0.b().h("Waiting for weave socket onDisconnected callback to be called, timeout = %s ms.", Long.valueOf(hvog.aC()));
                try {
                    long v = hvog.aC();
                    if(!this.d.await(v, TimeUnit.MILLISECONDS)) {
                        cunf0.b().h("Timed out after waiting %s ms for weave socket onDisconnected callback to be called, continue the following socket closure process.", Long.valueOf(hvog.aC()));
                    }
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    czkq.a.e().f(interruptedException0).h("Interrupted while waiting %s ms for weave socket onDisconnected callback to be called.", Long.valueOf(hvog.aC()));
                }
            }
        }
        gekx gekx0 = this.i;
        if(gekx0 != null) {
            gekx0.b();
        }
        fgvb fgvb0 = this.j;
        if(fgvb0 != null) {
            fgvb0.d();
        }
        czsg czsg0 = this.m;
        if(czsg0 != null) {
            czsg0.c();
        }
        bbpb.b(this.n);
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        this.j(new czuh(this, countDownLatch0));
        cuui.h(this.h, "PhysicalBleSocket.requestMtuThread");
        cuui.h(this.g, "PhysicalBleSocket.l2capReaderThread");
        try {
            countDownLatch0.await(hvog.a.bk().bJ(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            czkq.a.e().p("Failed to clean multiplex info due to timeout.", new Object[0]);
        }
        cuui.h(this.f, "PhysicalBleSocket.gattThreadOffloader");
    }

    // Detected as a lambda impl.
    public final void d(byte[] arr_b) {
        synchronized(this) {
            if(hvol.U()) {
                czkq.a.d().i("MultiplexBleSocketImpl-processBleSocketClosure for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), this.q);
            }
            czti czti0 = this.q(arr_b);
            if(czti0 != null) {
                String s = bbmu.c(czti0.h);
                czti0 = (czti)this.q.remove(s);
            }
            if(czti0 != null) {
                czti0.r();
                if(this.q.isEmpty()) {
                    this.e();
                }
            }
        }
    }

    @Override  // czun
    public final void e() {
        synchronized(this) {
            this.c();
        }
    }

    @Override  // czun
    protected final void f(czsx czsx0, boolean z) {
        String s;
        int v;
        gytk gytk0;
        if(czsx0.b()) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gytk.a), czsx0.c, 0, czsx0.c.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gytk0 = (gytk)hftv0;
                v = gytj.a(gytk0.c);
            }
            catch(hfur hfur0) {
                czkq.a.e().f(hfur0).h("MultiplexBleSocketImpl connected to %s was unable to parse control frame.", this.b);
                return;
            }
            if(v == 0) {
                v = 1;
            }
            switch(v - 1) {
                case 1: {
                    byte[] arr_b = (gytk0.d == null ? gytg.a : gytk0.d).c.toByteArray();
                    gytg gytg0 = gytk0.d;
                    if(((gytg0 == null ? gytg.a : gytg0).b & 4) == 0) {
                        s = "";
                    }
                    else {
                        if(gytg0 == null) {
                            gytg0 = gytg.a;
                        }
                        s = gytg0.e;
                    }
                    if(this.r == null) {
                        czkq.a.c().h("MultiplexBleSocketImpl connected to %s received an unexpected intro packet as a client socket.", this.b);
                        return;
                    }
                    czti czti0 = this.h(arr_b, s, false);
                    if(czti0 != null) {
                        this.r.a(czti0);
                    }
                    return;
                }
                case 2: {
                    this.d((gytk0.e == null ? gytf.a : gytk0.e).c.toByteArray());
                    return;
                }
                case 3: {
                    this.s((gytk0.f == null ? gyth.a : gytk0.f).c.toByteArray(), (gytk0.f == null ? gyth.a : gytk0.f).d);
                    return;
                }
                default: {
                    czkq.a.e().h("MultiplexBleSocketImpl connected to %s received a control frame of an unknown type.", this.b);
                    return;
                }
            }
        }
        if(hvol.O()) {
            this.t(czsx0.b, czsx0.c, czsx0.a(), z);
            return;
        }
        this.r(czsx0.b, czsx0.c, czsx0.a(), z);
    }

    @Override  // czun
    protected final boolean g(czsx czsx0) {
        if(hvol.O()) {
            return true;
        }
        if(!czsx0.b()) {
            byte[] arr_b = czsx0.b;
            Map map0 = this.q;
            String s = bbmu.c(arr_b);
            if(map0.containsKey(s)) {
                return true;
            }
            if(hvol.U()) {
                czkq.a.b().j("MultiplexBleSocketImpl-isValidBlePacket bleSockets %s does not contain serviceIdHashKey= %s for serviceIdHash = %s.", map0, s, czmk.g(arr_b));
            }
            if(hvol.U()) {
                czkq.a.d().i("MultiplexBleSocketImpl-isServiceIdHashVirtuallyInBleSocketsMapKeyWithSalt for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), map0);
            }
            gged_interceptors gged0 = gged_interceptors.i(map0.values());
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                czti czti0 = (czti)gged0.get(v1);
                byte[] arr_b1 = czup.h(czti0.j, czti0.i);
                cunf cunf0 = czkq.a;
                cunf0.b().j("MultiplexBleSocketImpl-isServiceIdHashVirtuallyInBleSocketsMapKeyWithSalt socket %s, packet.serviceIdHash = %s, serviceIdHashWithSalt = %s", czti0, czmk.g(arr_b), czmk.g(arr_b1));
                if(Arrays.equals(arr_b, arr_b1)) {
                    return true;
                }
                cunf0.b().i("MultiplexBleSocketImpl-isServiceIdHashVirtuallyInBleSocketsMapKeyWithSalt bleSockets[] does not match saltedServiceIdHash = %s, saltedServiceIdHashKey=%s", czmk.g(arr_b), bbmu.c(arr_b1));
            }
            return false;
        }
        return true;
    }

    final czti h(byte[] arr_b, String s, boolean z) {
        czti czti0;
        byte[] arr_b1;
        int v2;
        OutputStream outputStream1;
        OutputStream outputStream0;
        BluetoothSocket bluetoothSocket0;
        czsg czsg0;
        synchronized(this) {
            String s1 = bbmu.c(arr_b);
            if(this.q.containsKey(s1)) {
                czkq.a.c().i("MultiplexBleSocketImpl failed to create a new %s socket for service ID hash %s because there is already an active BLE socket under the same service ID.", (z ? "BLE_L2CAP" : "BLE or BLE_L2CAP"), czmk.g(arr_b));
                return null;
            }
            czub czub0 = () -> synchronized(this) {
                if(hvol.U()) {
                    czkq.a.d().i("MultiplexBleSocketImpl-processBleSocketClosure for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), this.q);
                }
                czti czti0 = this.q(arr_b);
                if(czti0 != null) {
                    String s = bbmu.c(czti0.h);
                    czti0 = (czti)this.q.remove(s);
                }
                if(czti0 != null) {
                    czti0.r();
                    if(this.q.isEmpty()) {
                        this.e();
                    }
                }
            };
            int v1 = 0;
            try {
                czsg0 = this.m;
                if(czsg0 == null) {
                    bluetoothSocket0 = this.n;
                    if(bluetoothSocket0 == null) {
                        v2 = 0;
                        outputStream1 = null;
                    }
                    else {
                        outputStream0 = bluetoothSocket0.getOutputStream();
                        outputStream1 = outputStream0;
                        v2 = bluetoothSocket0.getMaxTransmitPacketSize();
                        outputStream1 = outputStream0;
                    }
                }
                else {
                    goto label_21;
                }
                goto label_27;
            }
            catch(IOException unused_ex) {
                outputStream1 = null;
                goto label_26;
            }
            try {
                outputStream1 = outputStream0;
                v2 = bluetoothSocket0.getMaxTransmitPacketSize();
                outputStream1 = outputStream0;
                goto label_27;
            }
            catch(IOException unused_ex) {
                goto label_26;
            }
            try {
                v2 = 0;
                outputStream1 = null;
                goto label_27;
            label_21:
                outputStream1 = czsg0.c.getOutputStream();
            }
            catch(IOException unused_ex) {
                outputStream1 = null;
                goto label_26;
            }
            try {
                v1 = this.m.c.getMaxTransmitPacketSize();
            }
            catch(IOException unused_ex) {
            }
        label_26:
            v2 = v1;
        label_27:
            if(z && outputStream1 == null) {
                arr_b1 = arr_b;
                czti0 = null;
            }
            else if(outputStream1 == null) {
                arr_b1 = arr_b;
                gelh gelh0 = this.k;
                if(gelh0 == null) {
                    czti0 = null;
                }
                else {
                    gekx gekx0 = this.i;
                    if(gekx0 == null) {
                        czti0 = null;
                    }
                    else {
                        int v3 = gekx0.a();
                        czti0 = czti.t(arr_b1, s, czub0, new cztl(arr_b1, gelh0, null), v3, false, this.p);
                    }
                }
            }
            else {
                arr_b1 = arr_b;
                czti0 = czti.t(arr_b1, s, czub0, new cztl(arr_b, null, outputStream1), v2, true, this.p);
            }
            if(czti0 == null) {
                czkq.a.c().i("MultiplexBleSocketImpl failed to create a new %s socket for service ID hash %s because without a physical connection.", (z ? "BLE_L2CAP" : "BLE or BLE_L2CAP"), czmk.g(arr_b1));
                return null;
            }
            if(hvol.U()) {
                czkq.a.b().i("MultiplexBleSocketImpl put bleSocket(serviceIdHashKey=%s, serviceIdHash=%s) into map.", s1, czmk.g(arr_b1));
            }
            this.q.put(s1, czti0);
        }
        return czti0;
    }

    private final czti q(byte[] arr_b) {
        czti czti1;
        Map map0 = this.q;
        czti czti0 = (czti)map0.get(bbmu.c(arr_b));
        if(czti0 == null) {
            if(hvol.U()) {
                czkq.a.d().i("MultiplexBleSocketImpl-reMapBleSockets for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), map0);
            }
            gged_interceptors gged0 = gged_interceptors.i(map0.values());
            int v = gged0.size();
            for(int v1 = 0; true; ++v1) {
                czti1 = null;
                if(v1 >= v) {
                    break;
                }
                czti1 = (czti)gged0.get(v1);
                String s = czti1.j;
                if(s == null) {
                    czkq.a.e().j("MultiplexBleSocketImpl reMapBleSockets but socket is invalid. The serviceId of socket = %s, the serviceIdHashSalt = %s, bleSocket size = %d", czti1.j, czti1.i, Integer.valueOf(map0.size()));
                }
                else {
                    String s1 = czti1.i;
                    if(s1 == null) {
                        czkq.a.e().j("MultiplexBleSocketImpl reMapBleSockets but socket is invalid. The serviceId of socket = %s, the serviceIdHashSalt = %s, bleSocket size = %d", czti1.j, czti1.i, Integer.valueOf(map0.size()));
                    }
                    else {
                        byte[] arr_b1 = czup.h(s, s1);
                        if(Arrays.equals(arr_b, arr_b1)) {
                            String s2 = bbmu.c(czup.g(czti1.j));
                            czth czth0 = (czth)map0.remove(s2);
                            byte[] arr_b2 = czup.g((czth0 == null ? "" : czth0.k()));
                            czti1.n(arr_b1);
                            czti1.m = () -> synchronized(this) {
                                if(hvol.U()) {
                                    czkq.a.d().i("MultiplexBleSocketImpl-processBleSocketClosure for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b1), this.q);
                                }
                                czti czti0 = this.q(arr_b1);
                                if(czti0 != null) {
                                    String s = bbmu.c(czti0.h);
                                    czti0 = (czti)this.q.remove(s);
                                }
                                if(czti0 != null) {
                                    czti0.r();
                                    if(this.q.isEmpty()) {
                                        this.e();
                                    }
                                }
                            };
                            String s3 = bbmu.c(arr_b1);
                            map0.put(s3, czti1);
                            if(!hvol.U()) {
                                break;
                            }
                            czkq.a.b().k("MultiplexBleSocketImpl reMap before oldSocketServiceIdHash = %s(key=%s) after newSocketServiceIdHash = %s(key=%s).", czmk.g(arr_b2), s2, czmk.g(arr_b1), s3);
                            break;
                        }
                    }
                }
            }
            if(czti1 != null) {
                this.s = true;
            }
            return czti1;
        }
        return czti0;
    }

    private final void r(byte[] arr_b, byte[] arr_b1, int v, boolean z) {
        if(hvol.U()) {
            czkq.a.d().i("MultiplexBleSocketImpl-handleDataPacket for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), this.q);
        }
        try {
            czti czti0 = this.q(arr_b);
            if(czti0 == null) {
                czkq.a.c().j("MultiplexBleSocketImpl connected to %s and seems APP stop listening service ID hash %s but still have enqueued data(or still receive incoming data) %s.", this.b, czmk.g(arr_b), czmk.g(arr_b1));
                return;
            }
            if(z && hvol.ax()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gytk.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gytk)hftp0.b_message).c = 3;
                ((gytk)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyth.a).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(czti0.h);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gyth)hftv0).b |= 1;
                ((gyth)hftv0).c = hfsf0;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gyth gyth0 = (gyth)hftp1.b_message;
                gyth0.b |= 2;
                gyth0.d = v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gytk gytk0 = (gytk)hftp0.b_message;
                gyth gyth1 = (gyth)hftp1.N_build();
                gyth1.getClass();
                gytk0.f = gyth1;
                gytk0.b |= 8;
                byte[] arr_b2 = ((gytk)hftp0.N_build()).toBytesArray();
                try {
                    czti0.s(arr_b2);
                }
                catch(IOException iOException1) {
                    czkq.a.c().f(iOException1).h("BleSocketImpl failed to send a PacketAcknowledgement packet for service ID hash %s.", czmk.g(czti0.h));
                }
            }
            czti0.l.a(arr_b1);
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("MultiplexBleSocketImpl connected to %s encountered an error while receiving incoming data for service ID hash %s.", this.b, czmk.g(arr_b));
        }
    }

    private final void s(byte[] arr_b, int v) {
        synchronized(this) {
            if(hvol.U()) {
                czkq.a.d().i("MultiplexBleSocketImpl-processPacketAcknowledgement for serviceIdHash = %s. bleSockets %s.", czmk.g(arr_b), this.q);
            }
            czti czti0 = this.q(arr_b);
            if(czti0 == null) {
                czkq.a.e().h("MultiplexBleSocketImpl received acknowledge for %s but socket not exist.", czmk.g(arr_b));
                return;
            }
            if(hvol.ax()) {
                czti0.k.d = Boolean.valueOf(true);
                AtomicInteger atomicInteger0 = cztl.a;
                atomicInteger0.addAndGet(-v);
                if(((long)atomicInteger0.get()) <= hvog.V()) {
                    synchronized(atomicInteger0) {
                        atomicInteger0.notifyAll();
                    }
                }
            }
        }
    }

    private final void t(byte[] arr_b, byte[] arr_b1, int v, boolean z) {
        synchronized(this) {
            this.r(arr_b, arr_b1, v, z);
        }
    }
}

