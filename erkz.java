import android.content.Intent;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import java.util.Locale;

public final class erkz {
    public static final baun a;
    public final ConnectionRequest b;
    public final int c;
    public final epyh d;

    static {
        erkz.a = new erqc(new String[]{"DiscoveryChimeraActivity", "EntryPointInfo"});
    }

    public erkz(int v, ConnectionRequest connectionRequest0, epyh epyh0) {
        this.b = connectionRequest0;
        this.c = v;
        this.d = epyh0;
    }

    public final boolean a() {
        return this.b != null;
    }

    public static byte[] b(Intent intent0) {
        byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES");
        if(arr_b != null) {
            daks daks0 = daks.a(arr_b);
            return daks0 == null ? null : daks0.b(0xE0);
        }
        return null;
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "connectionRequest: %s, bootstrapTriggerType: %d, targetDeviceType: %s", this.b, ((int)this.c), this.d);
    }
}

