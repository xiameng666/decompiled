import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import java.io.IOException;

public final class gbml extends CardView {
    public float[] g;
    public float h;
    public View i;
    public FrameLayout j;
    public ImageView k;
    public gbmk l;
    protected boolean m;
    protected int n;
    protected int o;
    protected final RectF p;
    protected final Rect q;
    private int r;
    private int s;
    private Uri t;
    private final ibnf u;

    public gbml(Context context0, ibnf ibnf0) {
        super(context0);
        this.p = new RectF();
        this.q = new Rect();
        this.u = ibnf0;
    }

    public final gaym h() {
        ibnf ibnf0 = this.u;
        return ibnf0 != null ? ibnf0.get() : null;
    }

    public final void i() {
        this.k.setImageBitmap(null);
        this.k.setVisibility(8);
        this.t = null;
        this.m();
    }

    public final void j(Bitmap bitmap0, Uri uri0, boolean z) {
        this.t = uri0;
        this.m = z;
        this.k.setImageBitmap(bitmap0);
        this.k.setVisibility(0);
        this.o();
        this.m();
    }

    public final void k(int v, int v1) {
        this.r = v;
        this.s = v1;
        this.requestLayout();
    }

    public final void l(View view0) {
        this.i = view0;
        this.addView(view0, 0);
        this.m();
    }

    public final void m() {
        int v = 0;
        boolean z = this.i != null || this.k.getVisibility() == 0;
        boolean z1 = this.i != null && this.k.getVisibility() != 0;
        gbmk gbmk0 = this.l;
        if(gbmk0.m != z) {
            gbmk0.m = z;
            gbmk0.invalidate();
        }
        gbmk gbmk1 = this.l;
        if(gbmk1.l != z1) {
            gbmk1.l = z1;
            gbmk1.invalidate();
        }
        if(!z1) {
            v = 4;
        }
        if(this.j.getVisibility() != v) {
            this.j.setVisibility(v);
        }
    }

    private final int n() {
        return this.i == null ? 3 : 4;
    }

    private final void o() {
        if(this.m) {
            this.k.setPadding(0, 0, 0, 0);
            return;
        }
        this.k.setPadding(((int)this.p.left), ((int)this.p.top), ((int)(((float)this.n) - this.p.right)), ((int)(((float)this.o) - this.p.bottom)));
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = v2 - v;
        int v5 = v3 - v1;
        boolean z1 = false;
        this.j.layout(0, 0, v4, v5);
        if(this.k.getVisibility() != 8) {
            this.k.layout(0, 0, v4, v5);
        }
        this.l.layout(0, 0, v4, v5);
        boolean z2 = true;
        if(this.i != null) {
            gavs.c(this.getChildCount() == this.n(), "BE_CPC_06", this.h(), "Child views other than preview surface may not be added.");
            if(this.r <= 0 || this.s <= 0) {
                z2 = false;
            }
            gavs.c(z2, "BE_CPC_07", this.h(), "Preview dimensions must be specified before adding preview surface.");
            int v6 = this.r;
            int v7 = v5 * v6;
            int v8 = this.s;
            int v9 = v4 * v8;
            if(v7 > v9) {
                int v10 = v7 / v8;
                this.q.top = 0;
                this.q.bottom = v5;
                this.q.left = (v4 - v10) / 2;
                this.q.right = this.q.left + v10;
            }
            else {
                int v11 = v9 / v6;
                this.q.top = (v5 - v11) / 2;
                this.q.bottom = this.q.top + v11;
                this.q.left = 0;
                this.q.right = v4;
            }
            View view0 = this.i;
            gftb.check(view0);
            view0.layout(this.q.left, this.q.top, this.q.right, this.q.bottom);
            return;
        }
        if(this.getChildCount() == this.n()) {
            z1 = true;
        }
        gavs.c(z1, "BE_CPC_08", this.h(), "Child views other than preview surface may not be added.");
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 == 0) {
            if(v3 == 0) {
                throw new IllegalStateException("At least one measure spec is required for sizing.");
            }
            v4 = Math.round(this.h * ((float)v5));
        }
        else if(v3 == 0 || (((float)v4) < this.h * ((float)v5))) {
            v5 = Math.round(((float)v4) / this.h);
        }
        else {
            v4 = Math.round(this.h * ((float)v5));
        }
        this.setMeasuredDimension(v4, v5);
        int v6 = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        int v7 = View.MeasureSpec.makeMeasureSpec(v5, 0x40000000);
        this.j.measure(v6, v7);
        if(this.k.getVisibility() != 8) {
            this.k.measure(v6, v7);
        }
        this.l.measure(v6, v7);
        boolean z = true;
        if(this.i != null) {
            gavs.c(this.getChildCount() == this.n(), "BE_CPC_03", this.h(), "Child views other than preview surface may not be added.");
            if(this.r <= 0 || this.s <= 0) {
                z = false;
            }
            gavs.c(z, "BE_CPC_04", this.h(), "Preview dimensions must be specified before adding preview surface.");
            int v8 = this.r;
            int v9 = v5 * v8;
            int v10 = this.s;
            int v11 = v4 * v10;
            if(v9 > v11) {
                v6 = View.MeasureSpec.makeMeasureSpec(v9 / v10, 0x40000000);
            }
            else {
                v7 = View.MeasureSpec.makeMeasureSpec(v11 / v8, 0x40000000);
            }
            View view0 = this.i;
            gftb.check(view0);
            view0.measure(v6, v7);
            return;
        }
        if(this.getChildCount() != this.n()) {
            z = false;
        }
        gavs.c(z, "BE_CPC_05", this.h(), "Child views other than preview surface may not be added.");
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        Bitmap bitmap0;
        if((parcelable0 instanceof Bundle)) {
            Parcelable parcelable1 = ((Bundle)parcelable0).getParcelable("superSavedInstanceState");
            gftb.check(parcelable1);
            super.onRestoreInstanceState(parcelable1);
            Uri uri0 = (Uri)((Bundle)parcelable0).getParcelable("captureFrameUri");
            if(uri0 != null) {
                ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(this.getContext().getContentResolver(), uri0);
                try {
                    bitmap0 = null;
                    bitmap0 = ImageDecoder.decodeBitmap(imageDecoder$Source0);
                }
                catch(IOException unused_ex) {
                }
                if(bitmap0 != null) {
                    this.j(bitmap0, uri0, ((Bundle)parcelable0).getBoolean("captureFrameIncludesMargins"));
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("captureFrameUri", this.t);
        ((Bundle)parcelable0).putBoolean("captureFrameIncludesMargins", this.m);
        return parcelable0;
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.n = v;
        this.o = v1;
        float[] arr_f = this.g;
        int v4 = 0;
        float f = arr_f[0];
        float f1 = ((float)v) / (1.0f + f + arr_f[2]);
        RectF rectF0 = this.p;
        rectF0.left = f * f1;
        int v5 = 1;
        rectF0.top = this.g[1] * f1;
        rectF0.right = ((float)v) - this.g[2] * f1;
        rectF0.bottom = ((float)v1) - this.g[3] * f1;
        this.o();
        gbmk gbmk0 = this.l;
        int v6 = this.n;
        int v7 = this.o;
        ibuq.f(rectF0, "roi");
        if(!ibuq.m(gbmk0.c, rectF0)) {
            gbmk0.c = rectF0;
            v4 = 1;
        }
        if(gbmk0.a == v6) {
            v5 = v4;
        }
        else {
            gbmk0.a = v6;
        }
        if(gbmk0.b != v7) {
            gbmk0.b = v7;
        }
        else if(v5 == 0) {
            return;
        }
        gbmk0.a();
    }
}

