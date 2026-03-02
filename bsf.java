import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

public final class bsf {
    public final Object a;
    public final bnr b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final bhv h;

    public bsf() {
        throw null;
    }

    public bsf(Object object0, bnr bnr0, int v, Size size0, Rect rect0, int v1, Matrix matrix0, bhv bhv0) {
        if(object0 == null) {
            throw new NullPointerException("Null data");
        }
        this.a = object0;
        this.b = bnr0;
        this.c = v;
        this.d = size0;
        if(rect0 == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.e = rect0;
        this.f = v1;
        if(matrix0 == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix0;
        this.h = bhv0;
    }

    public static bsf a(bcn bcn0, bnr bnr0, Rect rect0, int v, Matrix matrix0, bhv bhv0) {
        return bsf.b(bcn0, bnr0, new Size(bcn0.c(), bcn0.b()), rect0, v, matrix0, bhv0);
    }

    public static bsf b(bcn bcn0, bnr bnr0, Size size0, Rect rect0, int v, Matrix matrix0, bhv bhv0) {
        if(brh.b(bcn0.a())) {
            kay.j(bnr0, "JPEG image must have Exif.");
        }
        return new bsf(bcn0, bnr0, bcn0.a(), size0, rect0, v, matrix0, bhv0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bsf) && this.a.equals(((bsf)object0).a)) {
            bnr bnr0 = this.b;
            if(bnr0 == null) {
                return ((bsf)object0).b == null ? this.c == ((bsf)object0).c && this.d.equals(((bsf)object0).d) && this.e.equals(((bsf)object0).e) && this.f == ((bsf)object0).f && this.g.equals(((bsf)object0).g) && this.h.equals(((bsf)object0).h) : false;
            }
            return bnr0.equals(((bsf)object0).b) ? this.c == ((bsf)object0).c && this.d.equals(((bsf)object0).d) && this.e.equals(((bsf)object0).e) && this.f == ((bsf)object0).f && this.g.equals(((bsf)object0).g) && this.h.equals(((bsf)object0).h) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b == null ? this.h.hashCode() ^ (((((v * 1000003 * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f) * 1000003 ^ this.g.hashCode()) * 1000003 : this.h.hashCode() ^ ((((((v * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f) * 1000003 ^ this.g.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}

