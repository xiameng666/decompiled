import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class cprw {
    private double a;
    private double b;
    private double c;
    private double d;

    public cprw() {
        this.a = Infinity;
        this.b = -Infinity;
        this.c = NaN;
        this.d = NaN;
    }

    public final LatLngBounds a() {
        batl.m(((boolean)(Double.isNaN(this.c) ^ 1)), "no included points");
        return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
    }

    public final void b(LatLng latLng0) {
        batl.t(latLng0, "point must not be null");
        this.a = Math.min(this.a, latLng0.a);
        this.b = Math.max(this.b, latLng0.a);
        double f = latLng0.b;
        if(!Double.isNaN(this.c)) {
            double f1 = this.c;
            double f2 = this.d;
            if(!(f1 <= f2)) {
                if(f1 > f && f > f2) {
                label_11:
                    if(((f1 - f + 360.0) % 360.0 < (f - f2 + 360.0) % 360.0)) {
                        this.c = f;
                        return;
                    }
                    this.d = f;
                }
            }
            else if(f1 > f || f > f2) {
                goto label_11;
            }
            return;
        }
        this.c = f;
        this.d = f;
    }
}

