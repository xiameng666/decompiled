import android.util.Size;
import java.util.Map;

public final class bmq {
    public final Size a;
    public final Map b;
    public final Size c;
    public final Map d;
    public final Size e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;

    public bmq() {
        throw null;
    }

    public bmq(Size size0, Map map0, Size size1, Map map1, Size size2, Map map2, Map map3, Map map4, Map map5) {
        if(size0 == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.a = size0;
        this.b = map0;
        if(size1 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.c = size1;
        this.d = map1;
        if(size2 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.e = size2;
        this.f = map2;
        this.g = map3;
        this.h = map4;
        this.i = map5;
    }

    public final Size a(int v) {
        return (Size)this.f.get(Integer.valueOf(v));
    }

    public final Size b(int v) {
        return (Size)this.i.get(Integer.valueOf(v));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bmq) && this.a.equals(((bmq)object0).a) && this.b.equals(((bmq)object0).b) && this.c.equals(((bmq)object0).c) && this.d.equals(((bmq)object0).d) && this.e.equals(((bmq)object0).e) && this.f.equals(((bmq)object0).f) && this.g.equals(((bmq)object0).g) && this.h.equals(((bmq)object0).h) && this.i.equals(((bmq)object0).i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}

