import android.bluetooth.le.AdvertisingSetParameters.Builder;
import android.bluetooth.le.AdvertisingSetParameters;
import java.util.Locale;

public final class czqj {
    public final boolean a;
    private final int b;
    private final boolean c;

    public czqj() {
        throw null;
    }

    public czqj(int v, boolean z, boolean z1) {
        this.b = v;
        this.c = z;
        this.a = z1;
    }

    static int a(int v) {
        int v1;
        switch(v) {
            case -1: {
                v1 = (int)hvog.a.bk().ac();
                break;
            }
            case 1: {
                v1 = (int)hvog.a.bk().U();
                break;
            }
            case 2: {
                v1 = 1;
                break;
            }
            default: {
                if(v != 3) {
                    throw new IllegalArgumentException("Unknown power level " + v);
                }
                v1 = 2;
                break;
            }
        }
        switch(v1) {
            case 0: {
                return 1600;
            }
            case 1: {
                return 400;
            }
            case 2: {
                return (int)hvog.a.bk().aW();
            }
            default: {
                throw new IllegalArgumentException("Unknown legacy advertise settings " + v1);
            }
        }
    }

    static int b(int v) {
        long v1;
        switch(v) {
            case -1: {
                v1 = hvog.a.bk().C();
                break;
            }
            case 1: {
                v1 = hvog.a.bk().A();
                break;
            }
            case 2: {
                v1 = hvog.a.bk().B();
                break;
            }
            case 3: {
                v1 = hvog.a.bk().z();
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown power level " + v);
            }
        }
        switch(((int)v1)) {
            case 0: {
                return (int)hvog.a.bk().u();
            }
            case 1: {
                return (int)hvog.a.bk().s();
            }
            case 2: {
                return (int)hvog.a.bk().t();
            }
            case 3: {
                return (int)hvog.a.bk().r();
            }
            default: {
                throw new IllegalArgumentException("Unknown legacy power level " + ((int)v1));
            }
        }
    }

    public final AdvertisingSetParameters c() {
        AdvertisingSetParameters.Builder advertisingSetParameters$Builder0 = new AdvertisingSetParameters.Builder().setInterval(czqj.a(this.b)).setTxPowerLevel(czqj.b(this.b)).setConnectable(this.c);
        if(this.a && bbqa.d()) {
            advertisingSetParameters$Builder0.setOwnAddressType(2);
        }
        return advertisingSetParameters$Builder0.build();
    }

    public final AdvertisingSetParameters d(boolean z) {
        boolean z1 = z || this.c || this.c || hvol.u() ? z || this.c : true;
        AdvertisingSetParameters.Builder advertisingSetParameters$Builder0 = new AdvertisingSetParameters.Builder().setInterval(czqj.a(this.b)).setTxPowerLevel(czqj.b(this.b)).setConnectable(this.c).setScannable(z1).setLegacyMode(true);
        if(this.a && bbqa.d()) {
            advertisingSetParameters$Builder0.setOwnAddressType(2);
        }
        return advertisingSetParameters$Builder0.build();
    }

    public static czqi e() {
        czqi czqi0 = new czqi();
        czqi0.c(false);
        czqi0.b(true);
        return czqi0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof czqj) && this.b == ((czqj)object0).b && this.c == ((czqj)object0).c && this.a == ((czqj)object0).a;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.c ? 0x4CF : 0x4D5;
        int v2 = this.b;
        if(this.a) {
            v = 0x4CF;
        }
        return (v1 ^ (v2 ^ 1000003) * 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        int v = this.b;
        switch(v) {
            case -1: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", "ULTRA_LOW_POWER", Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
            case 0: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", "UNSPECIFIED", Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
            case 1: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", "LOW_POWER", Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
            case 2: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", "BALANCED_POWER", Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
            case 3: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", "HIGH_POWER", Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
            default: {
                return String.format("BleAdvertisingSetting{powerLevel= %s, isConnectable= %s, isPrivateGatt= %s}", String.format(Locale.US, "Unknown Power Level : %d", v), Boolean.valueOf(this.c), Boolean.valueOf(this.a));
            }
        }
    }
}

