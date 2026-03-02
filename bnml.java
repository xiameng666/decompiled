import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertisingSetParameters.Builder;
import android.bluetooth.le.AdvertisingSetParameters;
import android.content.Context;

@ibnh
public final class bnml implements bnmc {
    public static final bboh a;
    private final Context b;
    private final Object c;
    private bnmk d;

    static {
        bnml.a = bboh.b("BleAdvertiser", bbcu.eD);
    }

    public bnml(Context context0) {
        this.c = new Object();
        this.b = context0;
    }

    @Override  // bnmc
    public final void a(ByteString hfsf0) {
        bnmk bnmk0;
        bboh bboh0 = bnml.a;
        ((ggtj)bboh0.h()).x("Start advertising");
        AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder();
        byte[] arr_b = hfsf0.toByteArray();
        AdvertiseData advertiseData0 = advertiseData$Builder0.addServiceData(fqog.a, arr_b).setIncludeTxPowerLevel(false).setIncludeDeviceName(false).build();
        synchronized(this.c) {
            if(this.d == null) {
                cupu cupu0 = cupu.b(this.b, "EddystoneBleAdvertiser");
                if(cupu0 == null) {
                    ((ggtj)bboh0.h()).x("Can\'t get bluetooth le advertiser");
                    bnmk0 = null;
                }
                else {
                    bnmk0 = new bnmk(cupu0);
                }
                if(bnmk0 == null) {
                    ((ggtj)bboh0.i()).x("Start advertising failed due to no advertiser");
                    return;
                }
                this.d = bnmk0;
            }
            bnmk bnmk1 = this.d;
            bnmk1.a();
            bnmj bnmj0 = new bnmj(bnmk1);
            AdvertisingSetParameters advertisingSetParameters0 = new AdvertisingSetParameters.Builder().setLegacyMode(true).setInterval(((int)(((double)hsxv.a.y().p()) * 1.6))).setTxPowerLevel(((int)hsxv.a.y().q())).setConnectable(true).setScannable(true).build();
            bnmk1.a.e(advertisingSetParameters0, advertiseData0, null, bnmj0);
            bnmk1.b = bnmj0;
        }
    }

    @Override  // bnmc
    public final void b() {
        synchronized(this.c) {
            if(this.d != null) {
                ((ggtj)bnml.a.h()).x("stopAdvertising");
                this.d.a();
            }
        }
    }
}

