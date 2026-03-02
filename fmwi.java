import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.view.View.MeasureSpec;

public final class fmwi extends AppCompatTextView implements fmrd, fmsc {
    public boolean a;
    public boolean b;
    public boolean c;
    public final int d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public final int j;
    public final int k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public fmre r;
    public boolean s;
    private float[] t;

    public fmwi(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0x7F0401E6);  // attr:bubbleCellTextContentStyle
        this.a = false;
        this.b = false;
        this.c = false;
        this.s = false;
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, fmwe.a, 0x7F0401E6, 0x7F160492);  // attr:bubbleCellTextContentStyle
        this.t = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.setPadding(this.getResources().getDimensionPixelSize(0x7F0702EA), this.getResources().getDimensionPixelSize(0x7F0702EB), this.getResources().getDimensionPixelSize(0x7F0702EA), this.getResources().getDimensionPixelSize(0x7F0702EB));  // dimen:bubble_cell_content_start_end_padding
        this.setMaxWidth(fmro.a(this.getContext(), 300.0f));
        this.d = fykb.a(0x7F070B4B, this.getContext());  // dimen:m3_sys_elevation_level3
        this.e = typedArray0.getColor(2, fyho.b(this, 0x7F04030C));  // attr:colorPrimary
        this.o = fyho.b(this, 0x7F04030C);  // attr:colorPrimary
        this.p = fyho.b(this, 0x7F0402FC);  // attr:colorOnSurfaceVariant
        int v = typedArray0.getResourceId(1, 0x7F16047A);  // style:IncomingBubbleCellTextMessage
        this.i = v;
        int v1 = typedArray0.getResourceId(3, 0x7F160596);  // style:OutgoingBubbleCellTextMessage
        this.j = v1;
        TypedArray typedArray1 = context0.obtainStyledAttributes(v, new int[]{0x1010098});
        this.k = fyho.b(this, 0x7F0402F7);  // attr:colorOnSurface
        this.m = fmro.b(fyho.b(this, 0x7F040314), 0x80);  // attr:colorPrimaryInverse
        typedArray1.recycle();
        TypedArray typedArray2 = context0.obtainStyledAttributes(v1, new int[]{0x1010098});
        this.l = iaea.h() ? fyho.b(this, 0x7F0402DB) : fyho.b(this, 0x7F0402DC);  // attr:colorOnMessageBubbleOutgoingRcs
        this.n = fmro.b(fyho.b(this, 0x7F0402F7), 0x80);  // attr:colorOnSurface
        typedArray2.recycle();
        typedArray0.recycle();
        this.setImportantForAccessibility(4);
    }

    static int a(int v) {
        float[] arr_f = new float[3];
        jxm.h(v, arr_f);
        float f = arr_f[0] - 3.0f;
        arr_f[0] = f;
        return f < 0.0f ? v : jxm.c(arr_f);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmsc
    public final void b() {
    }

    public final void c() {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(this.f);
        int v = this.g;
        if(v == this.h) {
            gradientDrawable0.setColor(v);
        }
        else {
            if(iaea.o() && iaea.j() && fmrf.c(this.getResources().getConfiguration())) {
                int v1 = this.h;
                float[] arr_f = new float[3];
                jxm.h(v1, arr_f);
                float f = arr_f[2] + 0.03f;
                arr_f[2] = f;
                if(f <= 1.0f) {
                    v1 = jxm.c(arr_f);
                }
                this.h = v1;
            }
            else {
                this.g = fmwi.a(this.g);
                this.h = fmwi.a(this.h);
            }
            gradientDrawable0.setOrientation(GradientDrawable.Orientation.TL_BR);
            int[] arr_v = {this.g, this.h};
            if(iaea.o() && iaea.j() && fmrf.c(this.getResources().getConfiguration())) {
                gradientDrawable0.setColors(arr_v, new float[]{0.4f, 0.9f});
            }
            else {
                gradientDrawable0.setColors(arr_v, new float[]{0.2f, 0.8f});
            }
        }
        gradientDrawable0.setCornerRadii(this.t);
        this.setBackground(gradientDrawable0);
    }

    public final void d(float f, float f1, float f2, float f3) {
        boolean z = flbb.a(this.getContext());
        float f4 = z ? f1 : f;
        if(!z) {
            f = f1;
        }
        float f5 = z ? f2 : f3;
        if(z) {
            f2 = f3;
        }
        this.t = new float[]{((float)fmro.a(this.getContext(), f4)), ((float)fmro.a(this.getContext(), f4)), ((float)fmro.a(this.getContext(), f)), ((float)fmro.a(this.getContext(), f)), ((float)fmro.a(this.getContext(), f2)), ((float)fmro.a(this.getContext(), f2)), ((float)fmro.a(this.getContext(), f5)), ((float)fmro.a(this.getContext(), f5))};
        this.c();
    }

    @Override  // android.support.v7.widget.AppCompatTextView
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        Layout layout0 = this.getLayout();
        int v2 = layout0.getLineCount();
        float f = 0.0f;
        for(int v3 = 0; v3 < v2; ++v3) {
            float f1 = layout0.getLineMax(v3);
            if((f1 > f)) {
                f = f1;
            }
        }
        int v4 = this.getPaddingRight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int)Math.ceil(f)) + this.getPaddingLeft() + v4, 0x80000000), v1);
    }
}

