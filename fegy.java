import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;
import j..time.Duration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;

public final class fegy implements ffmj {
    public static final Duration a;
    public final String b;
    public final Lock c;
    public final Condition d;
    public final BluetoothDevice e;
    public final BluetoothAdapter f;
    public final gmcg g;
    public final AtomicBoolean h;
    public final fczq i;
    public final AtomicBoolean j;
    public final ferc k;
    public final fehi l;
    public final feqp m;
    public final fdpk n;
    public final AtomicReference o;
    public final AtomicInteger p;
    BluetoothSocket q;
    public boolean r;
    public final ferz s;
    private final fehy t;

    static {
        fegy.a = Duration.ofSeconds(3L);
        Duration.ofSeconds(10L);
    }

    public fegy(fczq fczq0, BluetoothDevice bluetoothDevice0, BluetoothAdapter bluetoothAdapter0, ferc ferc0, ferz ferz0, feqp feqp0, fehi fehi0, gmcg gmcg0, fehy fehy0) {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.c = reentrantLock0;
        this.d = reentrantLock0.newCondition();
        this.h = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.n = new fdpk();
        this.o = new AtomicReference();
        this.p = new AtomicInteger();
        this.i = fczq0;
        this.e = bluetoothDevice0;
        this.f = bluetoothAdapter0;
        this.s = ferz0;
        this.g = gmcg0;
        this.t = fehy0;
        this.k = ferc0;
        this.l = fehi0;
        this.m = feqp0;
        this.b = gfta.b(fczq0.j);
    }

    public final BluetoothSocket a() {
        this.c.lock();
        int v = FIN.finallyOpen$NT();
        BluetoothSocket bluetoothSocket0 = this.q;
        if(bluetoothSocket0 != null) {
            FIN.finallyCodeBegin$NT(v);
            return bluetoothSocket0;
        }
        throw new IOException("BLE client socket has not been created");
    }

    final fczq b() {
        return new fczp(this.i).a();
    }

    public final gmcd c() {
        gmcd gmcd2;
        gmcd gmcd1;
        gmcd gmcd0;
        String s = this.b;
        ffmn.a("BleOffloadClientConn", "retryConnection: %s", new Object[]{s});
        this.g(fehf.d);
        Lock lock0 = this.c;
        lock0.lock();
        try {
            BluetoothSocket bluetoothSocket0 = this.q;
            gmcd0 = (gmcd)this.o.get();
            ffmn.a("BleOffloadClientConn", "retryConnection: node: %s socket: %s future: %s", new Object[]{s, bluetoothSocket0, gmcd0});
            if(gmcd0 == null) {
                if(bluetoothSocket0 != null) {
                    fegy.j(bluetoothSocket0);
                }
                this.q = null;
                this.j.set(false);
                if(!this.h.get()) {
                    ffmn.a("BleOffloadClientConn", "retryConnection: aborted %s", new Object[]{s});
                    gmcd1 = gmbu.h(new IllegalStateException("connection aborted"));
                    goto label_26;
                }
                gmcd2 = this.d();
                goto label_18;
            }
            else {
                goto label_20;
            }
            goto label_26;
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_18:
        this.c.unlock();
        return gmcd2;
        try {
        label_20:
            ffmn.b("BleOffloadClientConn", "retryConnection: another connection in progress", new Object[0]);
            gmcd1 = glzd.f(gmcd0, new fegp(), gmap.a);
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_26:
        lock0.unlock();
        return gmcd1;
    }

    public final gmcd d() {
        ffmn.a("BleOffloadClientConn", "startConnectionLocked", new Object[0]);
        this.n.a("startConnectionLocked");
        BluetoothSocket bluetoothSocket0 = this.q;
        if(bluetoothSocket0 != null) {
            ffmn.b("BleOffloadClientConn", "startConnectionLocked: old socket is open", new Object[0]);
            fegy.j(bluetoothSocket0);
            this.q = null;
        }
        gmcd gmcd0 = glzd.g(jqy.a(new fehv(this.t, this.e)), new fegr(this), this.g);
        gmcd gmcd1 = (gmcd)this.o.getAndSet(gmcd0);
        if(gmcd1 != null) {
            gmcd1.cancel(false);
        }
        gmbu.t(gmcd0, new fegw(this, gmcd0), gmap.a);
        return glzd.f(gmcd0, new fegs(), gmap.a);
    }

    public final void f() {
        try {
            String s = this.b;
            fesf fesf0 = this.s.c;
            if(fesf0.c(s)) {
                fese fese0 = fesf0.a(s);
                int v = fese0.a.c;
                int v1 = feow.b.c;
                if(v <= v1 && (v != v1 || fese0.a.d < feow.b.d)) {
                    throw new UnsupportedOperationException();
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wtr.a).v_newBuilder();
                wts wts0 = wts.a;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wts0).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(fese0.b());
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((wts)hftp1.b_message).b = hfsf0;
                wts wts1 = (wts)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                wtr wtr0 = (wtr)hftp0.b_message;
                wts1.getClass();
                wtr0.c = wts1;
                wtr0.b = 7;
                wtr wtr1 = (wtr)hftp0.N_build();
                this.i();
                if(wtr1.b == 7) {
                    wts0 = (wts)wtr1.c;
                }
                ffmn.a("BleOffloadClientConn", "Sending the handshake: %s", new Object[]{wts0.b});
                feru.a(this.a().getOutputStream(), wtr1.toBytesArray());
                return;
            }
            ffmn.f("OffloadSetupClientMgr", "Handshake requested for an unknown server: %s", new Object[]{s});
            throw new IllegalArgumentException("Unknown node");
        }
        catch(UnsupportedOperationException unused_ex) {
            ffmn.a("BleOffloadClientConn", "Skipping the handshake since the server does not support it", new Object[0]);
        }
    }

    public final void g(fehf fehf0) {
        if(fehf0 == fehf.c) {
            fdny.a(fdnm.e);
        }
        else if(fehf0 == fehf.d) {
            fdny.a(fdnm.f);
        }
        this.n.a(fehf0.e);
        this.l.b(this.b, fehf0);
    }

    public final void h() {
        this.c.lock();
        try {
            this.r = true;
            this.h.set(false);
            this.j.set(false);
            gmcd gmcd0 = (gmcd)this.o.getAndSet(null);
            if(gmcd0 != null) {
                ffmn.a("BleOffloadClientConn", "stopConnection: cancel connectionFuture:%s", new Object[]{gmcd0});
                gmcd0.cancel(false);
            }
            BluetoothSocket bluetoothSocket0 = this.q;
            if(bluetoothSocket0 != null) {
                fegy.j(bluetoothSocket0);
            }
            this.q = null;
            this.d.signalAll();
        }
        finally {
            this.c.unlock();
        }
        this.g(fehf.d);
        this.g(fehf.b);
    }

    private final void i() {
        InputStream inputStream0 = this.a().getInputStream();
        byte[] arr_b = new byte[4];
        ffmn.e("WearIoStream", "decodeHandshake: read header...", new Object[0]);
        feru.b(inputStream0, arr_b, 4);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        ghjc ghjc0 = ghjc.f;
        ffmn.e("WearIoStream", "decodePacket.stream: header: %s", new Object[]{ghjc0.o(arr_b)});
        int v = (char)byteBuffer0.getShort();
        if(v > 4) {
            if(v <= 0x80) {
                byte[] arr_b1 = new byte[v - 4];
                feru.b(inputStream0, arr_b1, v - 4);
                if(Log.isLoggable("WearIoStream", 2)) {
                    ffmn.e("WearIoStream", "decodePacket.stream: packet: %s", new Object[]{ghjc0.o(arr_b1)});
                }
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)wtr.a), arr_b1, 0, v - 4, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    String s = this.b;
                    fesf fesf0 = this.s.c;
                    if(fesf0.c(s)) {
                        byte[] arr_b2 = fesf0.a(s).b();
                        if(((wtr)hftv0).b != 7) {
                            throw new InvalidKeyException("The handshake message proto is not present");
                        }
                        if(Arrays.equals(((wts)((wtr)hftv0).c).b.toByteArray(), arr_b2)) {
                            return;
                        }
                        throw new InvalidKeyException();
                    }
                    ffmn.f("OffloadSetupClientMgr", "Handshake requested for an unknown server: %s", new Object[]{s});
                    throw new InvalidKeyException("Unknown device");
                }
                catch(InvalidKeyException invalidKeyException0) {
                    ffmn.g("BleOffloadClientConn", invalidKeyException0, "Invalid handshake received", new Object[0]);
                    throw new IOException(invalidKeyException0);
                }
            }
            throw new IOException(a.f(v, "Header declared length (", " bytes) is invalid"));
        }
        ffmn.f("WearIoStream", "decodeSimpleWireProtocol: read %d: %s", new Object[]{v, ghjc0.o(arr_b)});
        throw new IOException("Header is too small");
    }

    private static void j(BluetoothSocket bluetoothSocket0) {
        try {
            bluetoothSocket0.close();
        }
        catch(IOException iOException0) {
            ffmn.c("BleOffloadClientConn", iOException0, "Could not close the socket", new Object[0]);
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.print("Configured for server: ");
        bbpd0.println(this.i);
        bbpd0.print("isActive=");
        bbpd0.println(this.h.get());
        bbpd0.print("isSetupComplete=");
        bbpd0.println(this.j.get());
        bbpd0.println("Activity History");
        bbpd0.b();
        bbpd0.println(this.n);
        bbpd0.a();
    }
}

