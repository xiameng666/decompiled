import android.net.Uri;

public final class ddaq implements ibtw {
    public final String a;
    public final Uri b;
    public final float c;
    public final int d;

    public ddaq(String s, Uri uri0, float f, int v) {
        this.a = s;
        this.b = uri0;
        this.c = f;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.a(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

