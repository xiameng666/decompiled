import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

public final class btr {
    public final int a;
    public final int b;
    public final Rect c;
    public final Size d;
    public final int e;
    public final boolean f;
    private final UUID g;

    public btr() {
        throw null;
    }

    public btr(UUID uUID0, int v, int v1, Rect rect0, Size size0, int v2, boolean z) {
        if(uUID0 == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.g = uUID0;
        this.a = v;
        this.b = v1;
        if(rect0 == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.c = rect0;
        if(size0 == null) {
            throw new NullPointerException("Null getSize");
        }
        this.d = size0;
        this.e = v2;
        this.f = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof btr) && this.g.equals(((btr)object0).g) && this.a == ((btr)object0).a && this.b == ((btr)object0).b && this.c.equals(((btr)object0).c) && this.d.equals(((btr)object0).d) && this.e == ((btr)object0).e && this.f == ((btr)object0).f;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.g.hashCode() ^ 1000003) * 1000003 ^ this.a) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
        return this.f ? ((this.e ^ v * 1000003) * 1000003 ^ 0x4CF) * 1000003 ^ 0x4D5 : ((this.e ^ v * 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "OutConfig{getUuid=" + this.g + ", getTargets=" + this.a + ", getFormat=" + this.b + ", getCropRect=" + this.c + ", getSize=" + this.d + ", getRotationDegrees=" + this.e + ", isMirroring=" + this.f + ", shouldRespectInputCropRect=false}";
    }
}

