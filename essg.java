import j..util.Objects;
import java.util.EnumSet;

public final class essg {
    public final long a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final EnumSet h;

    public essg(long v, int v1, long v2, String s, int v3, String s1, boolean z, EnumSet enumSet0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = v3;
        this.f = s1;
        this.g = z;
        this.h = enumSet0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof essg) && this.a == ((essg)object0).a && this.b == ((essg)object0).b && this.c == ((essg)object0).c && Objects.equals(this.d, ((essg)object0).d) && Objects.equals(this.f, ((essg)object0).f) && this.g == ((essg)object0).g && Objects.equals(this.h, ((essg)object0).h);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((long)this.a), ((int)this.b), ((long)this.c), this.d, Boolean.valueOf(this.g), this.f, this.h});
    }
}

