import android.graphics.Point;
import android.graphics.Rect;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.DriverLicenseParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;

public final class hbtb implements hbso {
    private final BarcodeParcel a;

    public hbtb(BarcodeParcel barcodeParcel0) {
        this.a = barcodeParcel0;
    }

    @Override  // hbso
    public final int a() {
        return this.a.a;
    }

    @Override  // hbso
    public final int b() {
        return this.a.f;
    }

    @Override  // hbso
    public final hbsm c() {
        BarcodeParcel.DriverLicenseParcel barcodeParcel$DriverLicenseParcel0 = this.a.o;
        return barcodeParcel$DriverLicenseParcel0 == null ? null : new hbsm(barcodeParcel$DriverLicenseParcel0.h, barcodeParcel$DriverLicenseParcel0.n);
    }

    @Override  // hbso
    public final String d() {
        return this.a.b;
    }

    @Override  // hbso
    public final String e() {
        return this.a.c;
    }

    @Override  // hbso
    public final byte[] f() {
        return this.a.d;
    }

    @Override  // hbso
    public final Point[] g() {
        return this.a.e;
    }

    @Override  // hbso
    public final void h() {
        Point[] arr_point = this.g();
        if(arr_point != null) {
            int v1 = 0x80000000;
            int v2 = 0x7FFFFFFF;
            int v3 = 0x7FFFFFFF;
            int v4 = 0x80000000;
            for(int v = 0; v < arr_point.length; ++v) {
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

