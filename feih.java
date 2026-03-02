import android.bluetooth.BluetoothServerSocket;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.peripheral.BleL2capConnectionManager.GattDisconnected.1;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;

public final class feih extends fefk {
    public final feil a;

    public feih(feil feil0) {
        Objects.requireNonNull(feil0);
        this.a = feil0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "DisconnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        boolean z = false;
        switch(message0.what) {
            case 2: 
            case 4: {
                feil feil0 = this.a;
                fekd fekd0 = feil0.l;
                if(fekd0 == null) {
                    feil0.g.b();
                }
                else {
                    fekd0.c(feil0.m, false);
                    fekd0.a(feil0.m, false);
                }
                if(!hzww.c()) {
                    feil0.e.c();
                }
                feio feio1 = feil0.d;
                feio.a("Closing socket server");
                BluetoothServerSocket bluetoothServerSocket0 = feio1.b;
                if(bluetoothServerSocket0 != null) {
                    try {
                        bluetoothServerSocket0.close();
                    }
                    catch(IOException iOException1) {
                        Log.w("IosL2capSocketServer", "Error while closing the server.", iOException1);
                    }
                }
                fein fein1 = feio1.c;
                if(fein1 != null) {
                    try {
                        fein1.b.set(true);
                        fein1.a.close();
                    }
                    catch(IOException iOException2) {
                        Log.w("IosL2capSocketServer", "Error while cancelling the server thread.", iOException2);
                    }
                }
                feio1.c = null;
                feio1.b = null;
                this.g();
                this.a.v(9);
                this.a.w(this.a.t);
                return true;
            }
            case 5: {
                this.g();
                this.a.w(this.a.v);
                return true;
            }
            case 1: 
            case 3: 
            case 6: {
                if(hzww.d()) {
                    PowerManager powerManager0 = (PowerManager)this.a.a.getSystemService("power");
                    if(powerManager0 != null && powerManager0.isInteractive()) {
                        this.h();
                    }
                    else {
                        this.i();
                        this.e(true);
                    }
                }
                else {
                    this.i();
                }
                if(message0.what != 6 && hzww.c()) {
                    this.a.e.c();
                }
                this.f();
                feio feio0 = this.a.d;
                if(feio0.d != null) {
                    z = true;
                }
                gftb.r(z, "The listener needs to be set before opening the server.");
                if(feio0.c == null && feio0.b == null) {
                    try {
                        feio0.b = feio0.a.listenUsingL2capChannel();
                    }
                    catch(IOException iOException0) {
                        Log.e("IosL2capSocketServer", "Error opening the server socket.", iOException0);
                        return true;
                    }
                    fein fein0 = new fein(feio0.b, new feim(feio0));
                    feio0.c = fein0;
                    feio.a("Starting socket server");
                    fein0.start();
                    return true;
                }
                return true;
            }
            case 8: {
                this.i();
                return true;
            }
            case 9: {
                this.f();
                return true;
            }
            case 10: {
                this.h();
                return true;
            }
            default: {
                feil.c(this.a, message0);
                return false;
            }
        }
    }

    public final void e(boolean z) {
        if(z) {
            feil feil0 = this.a;
            if(feil0.o == null) {
                BleL2capConnectionManager.GattDisconnected.1 bleL2capConnectionManager$GattDisconnected$10 = new BleL2capConnectionManager.GattDisconnected.1(this, SystemClock.elapsedRealtime());
                IntentFilter intentFilter0 = new IntentFilter("android.intent.action.SCREEN_ON");
                clht clht0 = new clht(feil0.i);
                feil0.a.registerReceiver(bleL2capConnectionManager$GattDisconnected$10, intentFilter0, null, clht0);
                feil0.o = bleL2capConnectionManager$GattDisconnected$10;
            }
        }
        else {
            feil feil1 = this.a;
            BroadcastReceiver broadcastReceiver0 = feil1.o;
            if(broadcastReceiver0 != null) {
                feil1.a.unregisterReceiver(broadcastReceiver0);
                feil1.o = null;
            }
        }
    }

    private final void f() {
        feil feil0 = this.a;
        feil0.v(9);
        if(hzww.a.b().e()) {
            String s = fefq.a(feil0.a.getContentResolver());
            if(s == null) {
                Log.e("IosL2capCM", "No companion address found");
                feil0.z(9, 1000L);
                return;
            }
            feil0.f.i = feil0.b.getRemoteDevice(s);
        }
        else {
            feil0.f.i = null;
        }
        fegm fegm0 = feil0.e;
        ffmn.a("GattServiceServer", "Opening service server ", new Object[0]);
        if(fegm0.i != null) {
            ffmn.a("GattServiceServer", "Service server is already open", new Object[0]);
            return;
        }
        fegm0.h = new fegk(fegm0);
        fegm0.i = fegm0.c.openGattServer(fegm0.d, fegm0.h);
        if(fegm0.i == null) {
            ffmn.a("GattServiceServer", "Failed to open service server", new Object[0]);
        }
        fegm0.j = new ArrayDeque(fegm0.b);
        fegm0.b();
        ffmn.a("GattServiceServer", "Service server opened.", new Object[0]);
    }

    private final void g() {
        feil feil0 = this.a;
        feil0.v(8);
        if(hzww.d()) {
            feil0.v(10);
            this.e(false);
        }
    }

    private final void h() {
        feil feil0 = this.a;
        feil0.v(8);
        feil0.v(10);
        fekd fekd0 = feil0.l;
        if(fekd0 != null) {
            fekd0.a(feil0.m, true);
            return;
        }
        hzww hzww0 = hzww.a;
        int v = (int)hzww0.b().a();
        int v1 = (int)hzww0.b().c();
        if(feil0.g.d(3000L, v, v1)) {
            feil0.z(8, hzww0.b().b());
            this.e(false);
            return;
        }
        feil0.z(10, 1000L);
    }

    private final void i() {
        feil feil0 = this.a;
        feil0.v(8);
        fekd fekd0 = feil0.l;
        if(fekd0 != null) {
            fekd0.a(feil0.m, true);
            return;
        }
        if(!feil0.g.c(3000L, 1)) {
            feil0.z(8, 1000L);
        }
    }
}

