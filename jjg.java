import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

public final class jjg implements LeadingMarginSpan {
    public final hmu a;
    public final jks b;
    private final float c;
    private final float d;
    private final hpe e;
    private final int f;
    private final int g;

    public jjg(hmu hmu0, float f, float f1, float f2, hpe hpe0, jks jks0, float f3) {
        this.a = hmu0;
        this.c = f;
        this.d = f1;
        this.e = hpe0;
        this.b = jks0;
        int v = ibvr.c(f + f2);
        this.f = v;
        this.g = ibvr.c(f3) - v;
    }

    @Override  // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas0, Paint paint0, int v, int v1, int v2, int v3, int v4, CharSequence charSequence0, int v5, int v6, boolean z, Layout layout0) {
        Integer integer0;
        if(canvas0 != null) {
            int v7 = v - this.f;
            ibuq.d(charSequence0, "null cannot be cast to non-null type android.text.Spanned");
            if(((Spanned)charSequence0).getSpanStart(this) == v5 && paint0 != null) {
                Paint.Style paint$Style0 = paint0.getStyle();
                if(!ibuq.m(this.e, hpg.a)) {
                    throw new ibnq();
                }
                paint0.setStyle(Paint.Style.FILL);
                jjf jjf0 = new jjf(this, ((long)Float.floatToRawIntBits(this.c)) << 0x20 | ((long)Float.floatToRawIntBits(this.d)) & 0xFFFFFFFFL, v1, canvas0, paint0, ibwt.g(v7, 0), ((float)(v2 + v4)) / 2.0f);
                if(Float.isNaN(NaNf)) {
                    integer0 = null;
                }
                else {
                    integer0 = paint0.getAlpha();
                    integer0.intValue();
                    paint0.setAlpha(((int)(((float)Math.rint(NaN)))));
                }
                jjf0.a();
                if(integer0 != null) {
                    paint0.setAlpha(integer0.intValue());
                }
                paint0.setStyle(paint$Style0);
            }
        }
    }

    @Override  // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.g < 0 ? Math.abs(this.g) : 0;
    }
}

