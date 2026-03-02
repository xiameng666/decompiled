import android.net.Uri;

public final class ddas implements ibtw {
    public final int a;
    public final String b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final int g;

    public ddas(int v, String s, Uri uri0, boolean z, boolean z1, float f, int v1) {
        this.a = v;
        this.b = s;
        this.c = uri0;
        this.d = z;
        this.e = z1;
        this.f = f;
        this.g = v1;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.g(this.a, this.b, this.c, this.d, this.e, this.f, ((goz)object0), gsc.a(this.g | 1));
        return ibom.a;
    }
}

