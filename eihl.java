import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.PowerManager;
import android.provider.Settings.System;
import com.google.android.gms.personalsafety.settingshandler.SettingsDispatcher.1;

public final class eihl {
    public static eihl a;
    public eihk b;
    public boolean c;
    public final BluetoothAdapter d;
    public final bbku e;
    public boolean f;
    private final BroadcastReceiver g;

    public eihl(Context context0) {
        this.f = false;
        SettingsDispatcher.1 settingsDispatcher$10 = new SettingsDispatcher.1(this);
        this.g = settingsDispatcher$10;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.location.MODE_CHANGED");
        intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter0.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
        intentFilter0.addAction("android.intent.action.AIRPLANE_MODE");
        intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        jwe.b(context0, settingsDispatcher$10, intentFilter0, 4);
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        this.d = bluetoothAdapter0;
        if(bluetoothAdapter0 != null) {
            this.c = bluetoothAdapter0.isLeEnabled();
        }
        this.e = new bbll(1, 10);
    }

    public static gwmt a(Context context0) {
        switch(Settings.System.getInt(context0.getContentResolver(), "airplane_mode_on", 0)) {
            case 0: {
                return gwmt.c;
            }
            case 1: {
                return gwmt.b;
            }
            default: {
                return gwmt.a;
            }
        }
    }

    public static boolean b(Context context0) {
        return eihl.a(context0) == gwmt.b;
    }

    public static boolean c(Context context0) {
        if(context0 == null) {
            return false;
        }
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        return hrtd.a.I().bC() ? bluetoothAdapter0 != null && bluetoothAdapter0.isLeEnabled() : bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled();
    }

    public static boolean d(Context context0) {
        if(context0 == null) {
            return false;
        }
        LocationManager locationManager0 = (LocationManager)context0.getSystemService("location");
        return locationManager0 != null && locationManager0.isLocationEnabled();
    }

    public static boolean e(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        return powerManager0 == null ? false : powerManager0.isPowerSaveMode();
    }
}

