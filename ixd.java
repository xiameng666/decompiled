import android.graphics.Path;

public final class ixd implements ibts {
    public final int a;
    public final int b;
    public final hks c;

    public ixd(hks hks0, int v, int v1) {
        this.c = hks0;
        this.a = v;
        this.b = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        iwc iwc0 = ((ixk)object0).g;
        int v = ((ixk)object0).e(this.a);
        int v1 = ((ixk)object0).e(this.b);
        if(v < 0 || v > v1 || v1 > iwc0.c.length()) {
            jie.a(("start(" + v + ") or end(" + v1 + ") is out of range [0.." + iwc0.c.length() + "], or start > end!"));
        }
        Path path0 = new Path();
        iwc0.b.e.getSelectionPath(v, v1, path0);
        int v2 = iwc0.b.g;
        if(v2 != 0 && !path0.isEmpty()) {
            path0.offset(0.0f, ((float)v2));
        }
        hks hks0 = new hks(path0);
        hks0.o(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(((ixk)object0).e)) & 0xFFFFFFFFL);
        hmj.a(this.c, hks0);
        return ibom.a;
    }
}

