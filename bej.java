import android.graphics.Matrix;
import android.graphics.Rect;

public final class bej {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    private final boolean f;

    public bej() {
        throw null;
    }

    public bej(Rect rect0, int v, int v1, boolean z, Matrix matrix0, boolean z1) {
        if(rect0 == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.a = rect0;
        this.b = v;
        this.c = v1;
        this.d = z;
        if(matrix0 == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.e = matrix0;
        this.f = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bej) && this.a.equals(((bej)object0).a) && this.b == ((bej)object0).b && this.c == ((bej)object0).c && this.d == ((bej)object0).d && this.e.equals(((bej)object0).e) && this.f == ((bej)object0).f;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ (this.d ? 0x4CF : 0x4D5)) * 1000003 ^ this.e.hashCode()) * 1000003;
        if(this.f) {
            v = 0x4CF;
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.c + ", hasCameraTransform=" + this.d + ", getSensorToBufferTransform=" + this.e + ", isMirroring=" + this.f + "}";
    }
}

