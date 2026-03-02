import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.provider.Settings.System;
import com.google.android.chimera.config.ModuleManager;

public final class fwvx implements fwzx {
    public final Context a;
    public final fvwz b;
    public final fwwt c;
    public final fwwn d;
    public final fwyb e;
    public final fwyj f;
    public fwva g;
    public final fwtu h;
    private final WifiManager i;

    public fwvx(Context context0, fvwz fvwz0, WifiManager wifiManager0, fwwt fwwt0, fwtu fwtu0, fwwn fwwn0, fwyb fwyb0, fwyj fwyj0) {
        this.a = ModuleManager.requireSubmoduleContext(context0, "network_location_provider");
        this.b = fvwz0;
        this.i = wifiManager0;
        this.c = fwwt0;
        this.h = fwtu0;
        this.d = fwwn0;
        this.e = fwyb0;
        this.f = fwyj0;
    }

    @Override  // fwzx
    public final boolean a() {
        return fwvx.d(this.i, this.a);
    }

    @Override  // fwzx
    public final void b() {
        WifiManager wifiManager0 = this.i;
        if(wifiManager0 == null) {
            return;
        }
        wifiManager0.reconnect();
    }

    @Override  // fwzx
    public final gmcd c() {
        return gmbu.i(new hecl(3, SystemClock.elapsedRealtime()));
    }

    public static boolean d(WifiManager wifiManager0, Context context0) {
        if(wifiManager0 == null) {
            return false;
        }
        if(wifiManager0.isWifiEnabled()) {
            return true;
        }
        return Settings.System.getInt(context0.getContentResolver(), "airplane_mode_on", 0) == 1 ? false : wifiManager0.isScanAlwaysAvailable();
    }

    public final gmcd e(long v, boolean z, boolean z1, fwyc fwyc0) {
        fwvs fwvs0 = new fwvs(this, SystemClock.elapsedRealtime(), v, z, z1, fwyc0);
        return this.f.c.e(fwvs0);
    }
}

