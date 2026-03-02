import android.graphics.Rect;
import android.util.Size;

public final class btw {
    public final Rect a;
    public final Size b;
    public final Size c;

    public btw(Rect rect0, Size size0, Size size1) {
        ibuq.f(rect0, "cropRectBeforeScaling");
        ibuq.f(size0, "childSizeToScale");
        ibuq.f(size1, "originalSelectedChildSize");
        super();
        this.a = rect0;
        this.b = size0;
        this.c = size1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof btw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((btw)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((btw)object0).b) ? ibuq.m(this.c, ((btw)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}

