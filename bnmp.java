import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

@ibnh
final class bnmp implements bnmn {
    public static final bboh a;
    public static final ByteString b;
    public final Object c;
    public fgve d;
    public ByteString e;
    public ByteString f;
    public byte g;
    public long h;
    public final Set i;
    public final Context j;
    public final Random k;
    public final fgvt l;
    public final ccmg m;
    private static final BluetoothGattCharacteristic n;
    private static final BluetoothGattService o;
    private final fgvh p;

    static {
        bnmp.a = bboh.b("EsRingingSvcImpl", bbcu.eD);
        BluetoothGattCharacteristic bluetoothGattCharacteristic0 = new BluetoothGattCharacteristic(UUID.fromString("a3c87603-0005-1000-8000-001a11000100"), 16, 0);
        bluetoothGattCharacteristic0.addDescriptor(new BluetoothGattDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"), 16));
        bnmp.n = bluetoothGattCharacteristic0;
        BluetoothGattService bluetoothGattService0 = new BluetoothGattService(UUID.fromString("a3c87600-0005-1000-8000-001a11000100"), 0);
        BluetoothGattCharacteristic bluetoothGattCharacteristic1 = new BluetoothGattCharacteristic(UUID.fromString("a3c87601-0005-1000-8000-001a11000100"), 10, 17);
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(UUID.fromString("a3c87602-0005-1000-8000-001a11000100"), 2, 1);
        bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic1);
        bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic2);
        bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic0);
        bnmp.o = bluetoothGattService0;
        bnmp.b = ByteString.B("01FFFF");
    }

    public bnmp(Context context0, Random random0, fgvt fgvt0, ccmg ccmg0) {
        fgvh fgvh0;
        if(context0.getSystemService("bluetooth") == null) {
            fgvh0 = null;
        }
        else {
            BluetoothManager bluetoothManager0 = (BluetoothManager)context0.getSystemService("bluetooth");
            gftb.check(bluetoothManager0);
            fgvh0 = new fgvh(bluetoothManager0);
        }
        super();
        this.c = new Object();
        this.e = ByteString.b;
        this.f = ByteString.b;
        this.g = 0;
        this.i = new HashSet();
        this.j = context0;
        this.k = random0;
        this.l = fgvt0;
        this.p = fgvh0;
        this.m = ccmg0;
    }

    @Override  // bnmn
    public final void a() {
        synchronized(this.c) {
            fgve fgve0 = this.d;
            if(fgve0 == null) {
                ((ggtj)bnmp.a.j()).x("GATT server missing for ringing stopped notification");
                return;
            }
            int v1 = Long.compare(this.h, this.l.d().toEpochMilli()) > 0 ? 1 : 0;
            this.g = 0;
            this.h = this.l.d().toEpochMilli();
            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bnmp.n;
            bluetoothGattCharacteristic0.setValue(v1, 17, 0);
            for(Object object1: this.i) {
                fgve0.f(((fgva)object1), bluetoothGattCharacteristic0, false);
            }
        }
    }

    @Override  // bnmn
    public final void b(ByteString hfsf0) {
        synchronized(this.c) {
            this.e = fqwq.f(hfsf0);
            fgvh fgvh0 = this.p;
            if(fgvh0 == null) {
                ((ggtj)bnmp.a.j()).x("No BluetoothManager");
                return;
            }
            if(this.d != null) {
                ((ggtj)bnmp.a.j()).x("GATT Server is already open");
                return;
            }
            this.m.a(bbdg.iV);
            bnmo bnmo0 = new bnmo(this);
            fgve fgve0 = fgvh0.a(this.j, bnmo0);
            this.d = fgve0;
            if(fgve0 == null) {
                ((ggtj)bnmp.a.j()).x("openGattServer() returned null");
                return;
            }
            fgve0.e(bnmp.o);
        }
    }

    @Override  // bnmn
    public final void c() {
        synchronized(this.c) {
            fgve fgve0 = this.d;
            if(fgve0 != null) {
                for(Object object1: this.i) {
                    fgve0.b(((fgva)object1));
                }
                fgve0.c();
            }
            this.i.clear();
            this.d = null;
        }
    }
}

