import android.bluetooth.BluetoothAdapter;
import com.google.android.gms.fido.common.Transport;
import java.util.HashSet;
import java.util.Set;

public final class bndx {
    private final BluetoothAdapter a;
    private final Set b;
    private final boolean c;
    private final blyw d;

    static {
        bnaa.d("EnabledTransportsProvider");
    }

    public bndx(BluetoothAdapter bluetoothAdapter0, blyw blyw0, boolean z, Set set0) {
        this.a = bluetoothAdapter0;
        this.d = blyw0;
        this.c = z;
        gftb.check(set0);
        this.b = set0;
        hsub.a.b().p();
    }

    public final Set a() {
        HashSet hashSet0 = new HashSet();
        if(this.a != null) {
            hashSet0.add(Transport.g);
        }
        if(this.d != null) {
            hashSet0.add(Transport.c);
        }
        if(this.c) {
            hashSet0.add(Transport.d);
        }
        return ggog.e(hashSet0, this.b);
    }
}

