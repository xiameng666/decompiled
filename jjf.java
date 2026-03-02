import android.graphics.Canvas;
import android.graphics.Paint;

public final class jjf implements ibth {
    public final jjg a;
    public final long b;
    public final int c;
    public final Canvas d;
    public final Paint e;
    public final int f;
    public final float g;

    public jjf(jjg jjg0, long v, int v1, Canvas canvas0, Paint paint0, int v2, float f) {
        this.a = jjg0;
        this.b = v;
        this.c = v1;
        this.d = canvas0;
        this.e = paint0;
        this.f = v2;
        this.g = f;
    }

    @Override  // ibth
    public final Object a() {
        int v = this.c;
        float f = this.g;
        Paint paint0 = this.e;
        Canvas canvas0 = this.d;
        hkc hkc0 = ((hmf)this.a.a.a(this.b, (v <= 0 ? jlm.b : jlm.a), this.a.b)).a;
        float f1 = (float)this.f;
        if(!hkd.c(hkc0)) {
            hks hks0 = new hks(null);
            hmj.c(hks0, hkc0);
            canvas0.save();
            canvas0.translate(f1, f - hkc0.a() / 2.0f);
            canvas0.drawPath(hks0.a, paint0);
            canvas0.restore();
            return ibom.a;
        }
        float f2 = Float.intBitsToFloat(((int)(hkc0.e >> 0x20)));
        canvas0.drawRoundRect(f1, f - hkc0.a() / 2.0f, f1 + ((float)v) * hkc0.b(), f + hkc0.a() / 2.0f, f2, f2, paint0);
        return ibom.a;
    }
}

