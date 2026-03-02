import android.content.Context;
import android.provider.Settings.Global;

public final class epeb extends epeg {
    public final epfc a;
    public final boolean b;

    public epeb(Context context0, epfc epfc0, boolean z) {
        super(context0);
        this.a = epfc0;
        this.b = z;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        ccmp ccmp0 = new ccmp();
        Context context0 = this.d;
        ccmp0.a((z ? bbdg.dN : bbdg.dO));
        Settings.Global.putInt(context0.getContentResolver(), "wifi_scan_always_enabled", ((int)z));
        Settings.Global.putInt(context0.getContentResolver(), "ble_scan_always_enabled", ((int)z));
    }
}

