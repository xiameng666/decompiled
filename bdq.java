import android.graphics.Rect;
import android.util.Size;

public final class bdq {
    public final Size a;
    public final Rect b;
    public final bin c;
    public final int d;
    public final boolean e;

    public bdq() {
        throw null;
    }

    public bdq(Size size0, Rect rect0, bin bin0, int v, boolean z) {
        if(size0 == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size0;
        this.b = rect0;
        this.c = bin0;
        this.d = v;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bdq) && this.a.equals(((bdq)object0).a) && this.b.equals(((bdq)object0).b)) {
            bin bin0 = this.c;
            if(bin0 == null) {
                return ((bdq)object0).c == null ? this.d == ((bdq)object0).d && this.e == ((bdq)object0).e : false;
            }
            return bin0.equals(((bdq)object0).c) ? this.d == ((bdq)object0).d && this.e == ((bdq)object0).e : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ this.d) * 1000003;
        return this.e ? 0x4CF ^ v : 0x4D5 ^ v;
    }

    @Override
    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.c + ", rotationDegrees=" + this.d + ", mirroring=" + this.e + "}";
    }
}

