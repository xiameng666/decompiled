import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Message;
import android.os.SystemProperties;
import android.provider.Settings.System;
import android.util.Log;
import j..util.Objects;
import java.util.Locale;
import java.util.UUID;

final class feiu extends fefk {
    final feiy a;

    public feiu(feiy feiy0) {
        Objects.requireNonNull(feiy0);
        this.a = feiy0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "GattServicesConnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 6: {
                if(!this.e()) {
                    if(Log.isLoggable("IosServicesCM", 5)) {
                        Log.w("IosServicesCM", "Failed to connect to system services on service discovery.");
                    }
                    this.a.x(11);
                    return true;
                }
                break;
            }
            case 7: {
                try {
                    feiy.k("Re-discovering services due to Service Changed notification.");
                    long v2 = hzwz.b();
                    this.a.d.g(v2);
                }
                catch(feex feex1) {
                    if(Log.isLoggable("IosServicesCM", 5)) {
                        Log.w("IosServicesCM", "Failure during service discovery after Service Changed.");
                    }
                    this.a.y(11, feex1);
                }
                return true;
            }
            case 8: {
                feiy.k(("Got unhandled notification for characteristic: " + ((feis)message0.obj).a));
                return true;
            }
            case 9: {
                if(!this.e()) {
                    if(Log.isLoggable("IosServicesCM", 5)) {
                        Log.w("IosServicesCM", "Failed to connect to system services.");
                    }
                    this.a.x(11);
                    return true;
                }
                break;
            }
            case 10: {
                try {
                    this.a.e.e();
                }
                catch(feex feex2) {
                    feiy.k("Failed to update current time");
                    this.a.y(11, feex2);
                }
                return true;
            }
            case 11: {
                feex feex3 = (feex)message0.obj;
                if(feex3 == null || !this.a.f(feex3)) {
                    this.a.e.b();
                    this.a.w(this.a.k);
                    return true;
                }
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 12: {
                this.a.e.b();
                this.a.w(this.a.k);
                return true;
            }
            case 1: 
            case 4: 
            case 13: {
                feiy feiy0 = this.a;
                int v = SystemProperties.getInt("sys.cw_home_ready", 0);
                fefg fefg0 = feiy0.e;
                boolean z = v == 1 || fefg0.f();
                fefg0.f.set(z);
                if(!fefg0.f.get()) {
                    if(!fefg0.n) {
                        jwe.b(fefg0.c, fefg0.l, fefg0.m, 2);
                        fefg0.n = true;
                    }
                    if(hzxc.c() && fefg0.o == null) {
                        fefg0.o = new fefe(fefg0, new clht(fefg0.b));
                        fefg0.c.getContentResolver().registerContentObserver(Settings.System.getUriFor("setup_wizard_has_run"), false, fefg0.o);
                    }
                }
                try {
                    long v1 = hzwz.b();
                    feiy0.d.g(v1);
                }
                catch(feex feex0) {
                    feiy.k("Failed to discover services");
                    this.a.y(11, feex0);
                }
                return true;
            }
            default: {
                feiy.i(this.a, message0);
                return false;
            }
        }
        return true;
    }

    private final boolean e() {
        BluetoothGattService bluetoothGattService0;
        try {
            fefg fefg0 = this.a.e;
            boolean z = hzwz.a.c().c();
            if(!fefg0.e) {
                if(z) {
                    fefg0.e();
                }
                if(feer.a(fefg0.c.getContentResolver()) || feer.b(fefg0.c.getContentResolver())) {
                    feez feez0 = fefg0.d;
                    try {
                        bluetoothGattService0 = feez0.b(fefc.a);
                    }
                    catch(feex unused_ex) {
                        throw new feex("Couldn\'t find Current Time service", 0x100);
                    }
                    UUID uUID0 = fefc.h;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bluetoothGattService0.getCharacteristic(uUID0);
                    if(bluetoothGattCharacteristic0 == null) {
                        throw new feex(String.format(Locale.US, "Service %s is missing characteristic %s", bluetoothGattService0.getUuid(), uUID0));
                    }
                    feez0.m(bluetoothGattCharacteristic0);
                    BluetoothGattDescriptor bluetoothGattDescriptor0 = bluetoothGattCharacteristic0.getDescriptor(fefc.i);
                    if(bluetoothGattDescriptor0 == null) {
                        throw new feex("Descriptor was null: cannot subscribe to characteristic " + bluetoothGattCharacteristic0.getUuid());
                    }
                    bluetoothGattDescriptor0.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    feez0.i(bluetoothGattDescriptor0);
                    fefg0.e = true;
                    fefg0.g.b(fefh.d);
                }
            }
        }
        catch(feex feex0) {
            if(Log.isLoggable("IosServicesCM", 5)) {
                Log.w("IosServicesCM", "Failure in setting up Time Service.");
            }
            if(!feiu.f(feex0)) {
                return this.a.f(feex0);
            }
        }
        try {
            fefg fefg1 = this.a.e;
            if(fefg1.f.get()) {
                fefg1.j.a(0L, 1L, ayvf.b);
                fefg1.k.a(0L, 1L, ayvf.b);
                fefg1.g.b(fefh.b);
                fefg1.h.a(0L, 1L, ayvf.b);
                fefg1.i.a(0L, 1L, ayvf.b);
                fefg1.g.b(fefh.c);
                return true;
            }
            return true;
        }
        catch(feex feex1) {
            if(Log.isLoggable("IosServicesCM", 5)) {
                Log.w("IosServicesCM", "Failure in setting up ANCS and AMS.");
            }
            return feiu.f(feex1) ? true : this.a.f(feex1);
        }
    }

    private static final boolean f(feex feex0) {
        return feex0.a == 0x100 || feex0.a == 260;
    }
}

