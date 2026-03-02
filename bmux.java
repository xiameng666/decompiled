import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class bmux {
    public final Status a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final gfsx f;

    public bmux(Status status0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, gfsx gfsx4) {
        this.a = status0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = gfsx3;
        this.f = gfsx4;
    }

    public static bmux a(blpi blpi0) {
        gfsx gfsx0 = gfsx.m(blpi0);
        return new bmux(Status.b, gfsx0, gfqx.a, gfqx.a, gfqx.a, gfqx.a);
    }

    public static bmux b(blpw blpw0) {
        gfsx gfsx0 = gfsx.m(blpw0);
        return new bmux(Status.b, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfsx0);
    }

    public static bmux c(foec foec0) {
        gfsx gfsx0 = gfsx.m(foec0);
        return new bmux(Status.b, gfqx.a, gfsx0, gfqx.a, gfqx.a, gfqx.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmux) && Objects.equals(((bmux)object0).b, this.b) && Objects.equals(((bmux)object0).c, this.c) && Objects.equals(((bmux)object0).d, this.d) && Objects.equals(((bmux)object0).e, this.e) && ((bmux)object0).a.equals(this.a);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}

