import com.google.android.gms.findmydevice.spot.ScanResult;

public final class bnji {
    public static final void a(byte[] arr_b, ScanResult scanResult0) {
        scanResult0.b = arr_b;
        scanResult0.a.add(Integer.valueOf(1));
    }

    public static final void b(String s, ScanResult scanResult0) {
        scanResult0.d = s;
        scanResult0.a.add(Integer.valueOf(3));
    }

    public static final void c(long v, ScanResult scanResult0) {
        scanResult0.e = v;
        scanResult0.a.add(Integer.valueOf(4));
    }

    public static final void d(int v, ScanResult scanResult0) {
        scanResult0.c = v;
        scanResult0.a.add(Integer.valueOf(2));
    }
}

