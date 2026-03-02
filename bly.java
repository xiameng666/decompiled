import java.util.Collections;
import java.util.List;

public final class bly {
    public final bka a;
    public final List b;
    public final int c;
    public final int d;
    public final bat e;

    public bly() {
        throw null;
    }

    public bly(bka bka0, List list0, int v, bat bat0) {
        this.a = bka0;
        this.b = list0;
        this.c = v;
        this.d = -1;
        this.e = bat0;
    }

    public static blx a(bka bka0) {
        blx blx0 = new blx();
        if(bka0 == null) {
            throw new NullPointerException("Null surface");
        }
        blx0.a = bka0;
        List list0 = Collections.EMPTY_LIST;
        if(list0 == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        blx0.b = list0;
        blx0.c(-1);
        blx0.c = (int)-1;
        blx0.b(bat.b);
        return blx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bly) && this.a.equals(((bly)object0).a) && this.b.equals(((bly)object0).b) && this.c == ((bly)object0).c && this.d == ((bly)object0).d && this.e.equals(((bly)object0).e);
    }

    @Override
    public final int hashCode() {
        return (this.d ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 0xD5009D89 ^ this.c) * 1000003) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}

