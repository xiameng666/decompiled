import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.barcode.Barcode.DriverLicense;
import com.google.android.gms.vision.barcode.Barcode;

public final class hbtd implements hbso {
    private final Barcode a;

    public hbtd(Barcode barcode0) {
        this.a = barcode0;
    }

    @Override  // hbso
    public final int a() {
        return this.a.a;
    }

    @Override  // hbso
    public final int b() {
        return this.a.d;
    }

    @Override  // hbso
    public final hbsm c() {
        Barcode.DriverLicense barcode$DriverLicense0 = this.a.n;
        return barcode$DriverLicense0 == null ? null : new hbsm(barcode$DriverLicense0.h, barcode$DriverLicense0.n);
    }

    @Override  // hbso
    public final String d() {
        return this.a.c;
    }

    @Override  // hbso
    public final String e() {
        return this.a.b;
    }

    @Override  // hbso
    public final byte[] f() {
        return this.a.o;
    }

    @Override  // hbso
    public final Point[] g() {
        return this.a.e;
    }

    @Override  // hbso
    public final void h() {
        Barcode barcode0 = this.a;
        if(barcode0.e != null) {
            int v1 = 0x80000000;
            int v2 = 0x7FFFFFFF;
            int v3 = 0x7FFFFFFF;
            int v4 = 0x80000000;
            for(int v = 0; true; ++v) {
                Point[] arr_point = barcode0.e;
                if(v >= arr_point.length) {
                    break;
                }
                Point point0 = arr_point[v];
                v2 = Math.min(v2, point0.x);
                v1 = Math.max(v1, point0.x);
                v3 = Math.min(v3, point0.y);
                v4 = Math.max(v4, point0.y);
            }
            new Rect(v2, v3, v1, v4);
        }
    }
}

