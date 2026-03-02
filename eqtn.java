import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.os.SystemProperties;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.UUID;

public final class eqtn {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    public static final Charset d;
    public static final baun e;
    public static final ggeo f;
    public final BluetoothManager g;
    public final Context h;
    public BluetoothGattServer i;
    public AdvertiseCallback j;
    public final BluetoothGattServerCallback k;
    private BluetoothLeAdvertiser l;

    static {
        eqtn.a = UUID.fromString("d2c86762-1035-4d49-948b-f9447afdf495");
        eqtn.b = UUID.fromString("f25241e6-6622-497a-b333-a68e37443243");
        eqtn.c = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        eqtn.d = Charset.forName("UTF-8");
        eqtn.e = new erqc(new String[]{"FastPair", "BleAdvertiser"});
        ggek ggek0 = new ggek();
        ggek0.i("SM-S911", "389936");
        ggek0.i("SM-S916", "4A04FE");
        ggek0.i("SM-S918", "0577B1");
        ggek0.i("SM-M546", "2F81FF");
        ggek0.i("SM-E146", "31F307");
        ggek0.i("SM-A146", "362AC3");
        ggek0.i("SM-A245", "38CCD5");
        ggek0.i("SM-A546", "39A19C");
        ggek0.i("SM-S146", "6A21E8");
        ggek0.i("SM-S546", "6A244E");
        ggek0.i("SM-A346", "8018AF");
        ggek0.i("SM-A236", "89BAD5");
        ggek0.i("SM-M146", "8D16EA");
        ggek0.i("SM-A145", "915CFA");
        ggek0.i("SM-E045", "A8CAAD");
        ggek0.i("SM-A246", "6093A4");
        ggek0.i("SM-S246", "8E1996");
        ggek0.i("SM-M346", "6A239B");
        ggek0.i("SM-E346", "56488E");
        ggek0.i("SM-S901", "48C438");
        ggek0.i("SM-S906", "7DFE61");
        ggek0.i("SM-S908", "99F098");
        ggek0.i("SM-G991", "06AE20");
        ggek0.i("SM-G996", "B03C3D");
        ggek0.i("SM-G998", "FB5DB0");
        ggek0.i("SM-G980", "9D7D42");
        ggek0.i("SM-G981", "E4E457");
        ggek0.i("SM-G985", "05A9BC");
        ggek0.i("SM-G986", "7785C4");
        ggek0.i("SM-G988", "7C1A08");
        ggek0.i("SM-N980", "1E3035");
        ggek0.i("SM-N981", "B231B5");
        ggek0.i("SM-N985", "BE35D3");
        ggek0.i("SM-N986", "61AB17");
        eqtn.f = ggek0.b();
    }

    public eqtn(Context context0) {
        this.k = new eqtm(this);
        this.g = (BluetoothManager)context0.getSystemService("bluetooth");
        this.h = context0;
    }

    public final void a() {
        BluetoothLeAdvertiser bluetoothLeAdvertiser0 = this.l;
        if(bluetoothLeAdvertiser0 != null) {
            AdvertiseCallback advertiseCallback0 = this.j;
            if(advertiseCallback0 != null) {
                bluetoothLeAdvertiser0.stopAdvertising(advertiseCallback0);
                this.j = null;
                eqtn.e.d("stopped advertising.", new Object[0]);
            }
        }
    }

    public final boolean b(byte[] arr_b, byte[] arr_b1) {
        if(this.j == null) {
            if(this.l == null) {
                BluetoothAdapter bluetoothAdapter0 = bahu.a(this.h);
                if(bluetoothAdapter0 != null) {
                    this.l = bluetoothAdapter0.getBluetoothLeAdvertiser();
                }
            }
            BluetoothLeAdvertiser bluetoothLeAdvertiser0 = this.l;
            if(bluetoothLeAdvertiser0 == null) {
                eqtn.e.m("BLE advertising is not supported.", new Object[0]);
                return false;
            }
            eqtl eqtl0 = new eqtl(this);
            int v = 3;
            switch(hyhm.a.b().b()) {
                case "HIGH": {
                    break;
                }
                case "LOW": {
                    v = 1;
                    break;
                }
                case "MEDIUM": {
                    v = 2;
                    break;
                }
                case "ULTRA_LOW": {
                    v = 0;
                    break;
                }
                default: {
                    eqtn.e.m("Invalid tx power, using TX_POWER_HIGH as default.", new Object[0]);
                }
            }
            AdvertiseSettings.Builder advertiseSettings$Builder0 = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(v);
            advertiseSettings$Builder0.setConnectable(true);
            AdvertiseSettings advertiseSettings0 = advertiseSettings$Builder0.build();
            if(arr_b1 != null) {
                AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder().setIncludeTxPowerLevel(true);
                gyne.a(advertiseData$Builder0, arr_b1);
                if(arr_b != null) {
                    advertiseData$Builder0.addManufacturerData(0xE0, arr_b);
                }
                bluetoothLeAdvertiser0.startAdvertising(advertiseSettings0, advertiseData$Builder0.build(), eqtl0);
                this.j = eqtl0;
                return true;
            }
        }
        return false;
    }

    public static byte[] c(String s) {
        byte[] arr_b = new byte[0];
        if(s.length() != 6 && s.length() != 16) {
            return arr_b;
        }
        try {
            return bboy.d(s);
        }
        catch(NumberFormatException numberFormatException0) {
            eqtn.e.l(numberFormatException0);
            return arr_b;
        }
    }

    public static final byte[] d() {
        String s = SystemProperties.get("gms.smartdevice.model_id", "");
        if(TextUtils.isEmpty(s)) {
            s = hyhm.a.b().a();
        }
        byte[] arr_b = eqtn.c(s);
        if(arr_b.length == 3) {
            return arr_b;
        }
        eqtn.e.m("Model ID %s is not valid", new Object[]{s});
        return null;
    }
}

