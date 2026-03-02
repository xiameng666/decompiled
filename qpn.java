import android.graphics.PointF;

public final class qpn {
    public String a;
    public String b;
    public float c;
    public int d;
    public float e;
    public float f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public PointF k;
    public PointF l;
    public int m;

    public qpn() {
    }

    public qpn(String s, String s1, float f, int v, int v1, float f1, float f2, int v2, int v3, float f3, boolean z, PointF pointF0, PointF pointF1) {
        this.a(s, s1, f, v, v1, f1, f2, v2, v3, f3, z, pointF0, pointF1);
    }

    public final void a(String s, String s1, float f, int v, int v1, float f1, float f2, int v2, int v3, float f3, boolean z, PointF pointF0, PointF pointF1) {
        this.a = s;
        this.b = s1;
        this.c = f;
        this.m = v;
        this.d = v1;
        this.e = f1;
        this.f = f2;
        this.g = v2;
        this.h = v3;
        this.i = f3;
        this.j = z;
        this.k = pointF0;
        this.l = pointF1;
    }

    @Override
    public final int hashCode() {
        float f = ((float)((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F)) + this.c;
        int v = this.m - 1;
        if(this.m == 0) {
            throw null;
        }
        long v1 = (long)Float.floatToRawIntBits(this.e);
        return (((((int)f) * 0x1F + v) * 0x1F + this.d) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + this.g;
    }
}

