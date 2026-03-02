import android.graphics.Bitmap;
import j..util.Objects;

public final class bmpg {
    public final String a;
    public final String b;
    public final int c;
    public final Bitmap d;
    public final String e;
    public final int f;

    public bmpg(String s, String s1, int v, Bitmap bitmap0, String s2, int v1) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = bitmap0;
        this.e = s2;
        this.f = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bmpg) ? Objects.equals(this.e, ((bmpg)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.e});
    }
}

