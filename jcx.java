import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class jcx implements LineHeightSpan {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final int e;
    public int f;
    public int g;
    private final int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public jcx(float f, int v, boolean z, boolean z1, float f1, int v1) {
        this.a = f;
        this.h = v;
        this.b = z;
        this.c = z1;
        this.d = f1;
        this.e = v1;
        this.i = 0x80000000;
        this.j = 0x80000000;
        this.k = 0x80000000;
        this.l = 0x80000000;
        if((!(f1 < 0.0f) && f1 <= 1.0f) || f1 == -1.0f) {
            return;
        }
        jie.b("topRatio should be in [0..1] range or -1");
    }

    @Override  // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence0, int v, int v1, int v2, int v3, Paint.FontMetricsInt paint$FontMetricsInt0) {
        if(jcy.a(paint$FontMetricsInt0) > 0) {
            boolean z = v1 == this.h;
            if(v != 0 || !z || !this.b || !this.c || this.e == 2) {
                if(this.i == 0x80000000) {
                    int v4 = (int)(((float)Math.ceil(this.a)));
                    int v5 = v4 - jcy.a(paint$FontMetricsInt0);
                    int v6 = this.e;
                    if(v6 == 1 && v5 <= 0) {
                        this.j = paint$FontMetricsInt0.ascent;
                        this.k = paint$FontMetricsInt0.descent;
                        this.i = this.j;
                        this.l = paint$FontMetricsInt0.descent;
                        this.f = 0;
                        this.g = 0;
                    }
                    else {
                        float f = this.d == -1.0f ? Math.abs(paint$FontMetricsInt0.ascent) / ((float)jcy.a(paint$FontMetricsInt0)) : this.d;
                        int v7 = paint$FontMetricsInt0.descent + ((int)(((float)(v5 > 0 ? Math.ceil(((float)v5) * (1.0f - f)) : Math.ceil(((float)v5) * f)))));
                        this.k = v7;
                        int v8 = v7 - v4;
                        this.j = v8;
                        if(v6 == 0 || v5 >= 0) {
                            if(this.b) {
                                v8 = paint$FontMetricsInt0.ascent;
                            }
                            this.i = v8;
                            this.l = this.c ? paint$FontMetricsInt0.descent : this.k;
                            this.f = paint$FontMetricsInt0.ascent - this.i;
                            this.g = this.l - paint$FontMetricsInt0.descent;
                        }
                        else if(v6 == 2) {
                            this.i = this.b ? Math.max(paint$FontMetricsInt0.ascent, this.j) : Math.min(paint$FontMetricsInt0.ascent, this.j);
                            this.l = this.c ? Math.min(paint$FontMetricsInt0.descent, this.k) : Math.max(paint$FontMetricsInt0.descent, this.k);
                            this.f = 0;
                            this.g = 0;
                        }
                    }
                }
                paint$FontMetricsInt0.ascent = v == 0 ? this.i : this.j;
                paint$FontMetricsInt0.descent = z ? this.l : this.k;
            }
        }
    }
}

