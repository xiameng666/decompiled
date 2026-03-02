import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

public final class fmzf extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public final boolean c;
    public View d;
    public int e;
    public View f;
    public int g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private Rect s;
    private int t;

    public fmzf(Context context0) {
        super(context0);
        this.t = 0;
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        Paint paint0 = new Paint();
        this.a = paint0;
        this.k = context0.getResources().getDimensionPixelSize(0x7F070923);  // dimen:lt_tooltip_container_padding_horizontal
        this.l = context0.getResources().getDimensionPixelSize(0x7F070924);  // dimen:lt_tooltip_container_padding_vertical
        this.m = context0.getResources().getDimensionPixelSize(0x7F070925);  // dimen:lt_tooltip_margin
        int v = context0.getResources().getDimensionPixelSize(0x7F070927);  // dimen:lt_tooltip_shadow_offset
        this.n = v;
        int v1 = context0.getResources().getDimensionPixelSize(0x7F070928);  // dimen:lt_tooltip_shadow_radius
        this.r = v1;
        this.o = context0.getResources().getDimensionPixelSize(0x7F070921);  // dimen:lt_tooltip_arrow_length
        this.p = context0.getResources().getDimensionPixelSize(0x7F070920);  // dimen:lt_tooltip_arrow_base_width
        this.q = context0.getResources().getDimensionPixelSize(0x7F070922);  // dimen:lt_tooltip_container_corner_radius
        int v2 = fyho.b(this, 0x7F04030D);  // attr:colorPrimaryContainer
        int v3 = fykb.a(0x7F070B4D, context0);  // dimen:m3_sys_elevation_level5
        paint0.setStyle(Paint.Style.FILL);
        paint0.setColor(v2);
        paint0.setAntiAlias(true);
        paint0.setShadowLayer(((float)v1), 0.0f, ((float)v), v3);
        this.c = true;
    }

    public final int a() {
        int v2;
        int v = this.getMeasuredWidth();
        int v1 = this.getLayoutDirection();
        switch(this.g) {
            case 1: {
                v2 = v1 == 1 ? this.s.left + this.s.width() - v : this.s.left;
                break;
            }
            case 2: {
                v2 = this.s.left - (v - this.s.width()) / 2;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        int v3 = this.m;
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        if(windowManager0 == null) {
            return Math.min(this.g(false).x - v3 - v, Math.max(v3, v2));
        }
        return windowManager0.getDefaultDisplay().getRotation() == 3 ? Math.min(this.g(true).x - v3 - v, Math.max(v3, v2)) : Math.min(this.g(false).x - v3 - v, Math.max(v3, v2));
    }

    public final int b() {
        if(this.e == 1) {
            int v = -this.getMeasuredHeight();
            return this.s.top + v;
        }
        return this.s.top;
    }

    public final void c() {
        PopupWindow popupWindow0 = this.b;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
    }

    public final void d() {
        View view0 = this.f;
        view0.getLocationInWindow(this.h);
        int v = view0.getWidth() == 0 ? view0.getMeasuredWidth() : view0.getWidth();
        int v1 = view0.getHeight() == 0 ? view0.getMeasuredHeight() : view0.getHeight();
        int v2 = this.h[0];
        this.s = new Rect(v2, this.h[1] + this.t, v + v2, this.h[1] + v1 + this.t);
    }

    public final void e() {
        Point point0 = this.f();
        int v = point0.y;
        this.h(View.MeasureSpec.makeMeasureSpec(point0.x - (this.m + this.m), 0x80000000), View.MeasureSpec.makeMeasureSpec(v, 0x80000000));
    }

    private final Point f() {
        return this.g(false);
    }

    private final Point g(boolean z) {
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        Point point0 = new Point();
        if(windowManager0 == null) {
            return point0;
        }
        Display display0 = windowManager0.getDefaultDisplay();
        if(z) {
            display0.getRealSize(point0);
            return point0;
        }
        display0.getSize(point0);
        return point0;
    }

    private final void h(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = this.k + this.k;
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = this.l + this.l;
        int v6 = (int)(((float)this.f().x));
        int v7 = this.n;
        int v8 = v2 - v3 - v7;
        View view0 = this.d;
        int v9 = this.o;
        int v10 = v4 - v5 - v7 - v9;
        int v11 = View.MeasureSpec.makeMeasureSpec(v10, 0);
        view0.measure(View.MeasureSpec.makeMeasureSpec(Math.min(v6, v8), 0x80000000), v11);
        if(this.d.getMeasuredHeight() > v10) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(v8, 0x80000000), View.MeasureSpec.makeMeasureSpec(v10, 0x80000000));
        }
        int v12 = this.d.getMeasuredWidth() + v3;
        int v13 = this.d.getMeasuredHeight() + v5;
        this.j.set(0.0f, 0.0f, ((float)v12), ((float)v13));
        this.setMeasuredDimension(((int)this.j.width()) + v7, ((int)this.j.height()) + v7 + v9);
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        canvas0.save();
        Paint paint0 = this.a;
        float f = (float)this.q;
        canvas0.drawRoundRect(this.j, f, f, paint0);
        if(this.e == 1) {
            this.getLocationOnScreen(this.h);
            canvas0.save();
            canvas0.translate(((float)(this.m - this.h[0])), 0.0f);
            canvas0.drawPath(this.i, paint0);
            canvas0.restore();
        }
        canvas0.restore();
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4;
        this.d.layout(this.k, this.l, v2 - v - this.k, v3 - v1 - this.l - (this.e == 1 ? this.o : 0));
        this.b.update(this.a(), this.b(), this.getMeasuredWidth(), this.getMeasuredHeight(), true);
        switch(this.g) {
            case 1: {
                v4 = this.s.width() - this.p / 2 - (this.m + this.m);
                break;
            }
            case 2: {
                v4 = this.s.width() / 2;
                break;
            }
            default: {
                throw new IllegalStateException("Tooltip has invalid alignment.");
            }
        }
        if(this.getLayoutDirection() == 1) {
            v4 = this.s.width() - v4;
        }
        this.f.getLocationOnScreen(this.h);
        int v5 = v4 + this.h[0];
        Path path0 = this.i;
        path0.reset();
        if(this.e == 1) {
            path0.moveTo(((float)(v5 - this.m - this.p / 2)), this.j.bottom);
            path0.rLineTo(((float)this.p), 0.0f);
            float f = ((float)(-this.p)) / 2.0f;
            path0.rLineTo(f, ((float)this.o));
            path0.rLineTo(f, ((float)(-this.o)));
            path0.close();
        }
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        this.h(v, v1);
        if(this.f != null) {
            this.d();
            this.e();
        }
    }

    @Override  // android.view.View
    public final void setTranslationY(float f) {
        this.t = (int)f;
        this.d();
    }
}

