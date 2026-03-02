import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;

public final class eils {
    public static boolean a(ScannedDeviceInfo scannedDeviceInfo0) {
        hrtd hrtd0 = hrtd.a;
        if(hrtd0.I().aS()) {
            int v = scannedDeviceInfo0.c.a;
            return v == 0 ? hxjr.a.b().g() : v == 2 && hrtd0.I().aT();
        }
        return false;
    }

    public static boolean b(ScannedDeviceInfo scannedDeviceInfo0, boolean z) {
        return hrtd.af() && z && scannedDeviceInfo0.c.a == 2;
    }
}

