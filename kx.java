import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class kx extends Drawable {
    public float a;
    private static final float b;
    private final Paint c;
    private final float d;
    private final float e;
    private final float f;
    private float g;
    private boolean h;
    private final Path i;
    private final int j;
    private float k;
    private final int l;

    static {
        kx.b = (float)Math.toRadians(45.0);
    }

    public kx(Context context0) {
        Paint paint0 = new Paint();
        this.c = paint0;
        this.i = new Path();
        this.l = 2;
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeJoin(Paint.Join.MITER);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, ku.n, 0x7F04048C, 0x7F160226);  // attr:drawerArrowStyle
        this.a(typedArray0.getColor(3, 0));
        float f = typedArray0.getDimension(7, 0.0f);
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
            this.k = (float)(((double)(f / 2.0f)) * Math.cos(kx.b));
            this.invalidateSelf();
        }
        boolean z = typedArray0.getBoolean(6, true);
        if(this.h != z) {
            this.h = z;
            this.invalidateSelf();
        }
        float f1 = (float)Math.round(typedArray0.getDimension(5, 0.0f));
        if(f1 != this.g) {
            this.g = f1;
            this.invalidateSelf();
        }
        this.j = typedArray0.getDimensionPixelSize(4, 0);
        this.e = (float)Math.round(typedArray0.getDimension(2, 0.0f));
        this.d = (float)Math.round(typedArray0.getDimension(0, 0.0f));
        this.f = typedArray0.getDimension(1, 0.0f);
        typedArray0.recycle();
    }

    public final void a(int v) {
        Paint paint0 = this.c;
        if(v != paint0.getColor()) {
            paint0.setColor(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        int v = 0;
        switch(this.l) {
            case 0: {
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            default: {
                if(this.getLayoutDirection() == 1) {
                    v = 1;
                    break;
                }
            }
        }
        float f = this.d * this.d;
        float f1 = (this.f - this.e) * this.a;
        float f2 = (float)Math.round((this.k + 0.0f) * this.a + 0.0f);
        float f3 = this.a;
        float f4 = (kx.b + 0.0f) * f3;
        double f5 = (double)((((float)Math.sqrt(f + f)) - this.e) * this.a + this.e);
        float f6 = (float)Math.round(Math.cos(f4 + 0.0f) * f5);
        float f7 = (float)Math.round(f5 * Math.sin(f4 + 0.0f));
        Path path0 = this.i;
        path0.rewind();
        Paint paint0 = this.c;
        float f8 = this.g + paint0.getStrokeWidth();
        float f9 = (-this.k - f8) * this.a;
        float f10 = f1 + this.e;
        path0.moveTo(-f10 / 2.0f + f2, 0.0f);
        path0.rLineTo(f10 - (f2 + f2), 0.0f);
        float f11 = f8 + f9;
        path0.moveTo(-f10 / 2.0f, f11);
        path0.rLineTo(f6, f7);
        path0.moveTo(-f10 / 2.0f, -f11);
        path0.rLineTo(f6, -f7);
        path0.close();
        canvas0.save();
        float f12 = paint0.getStrokeWidth();
        float f13 = (float)rect0.height();
        float f14 = f12 * 1.5f + this.g;
        int v1 = ((int)(f13 - 3.0f * f12 - (this.g + this.g))) / 4;
        canvas0.translate(((float)rect0.centerX()), ((float)(v1 + v1)) + f14);
        if(this.h) {
            canvas0.rotate(((1 == v ? 0.0f : -180.0f) + f3 * 180.0f) * ((float)(1 == v ? -1 : 1)));
        }
        else if(v != 0) {
            canvas0.rotate(180.0f);
        }
        canvas0.drawPath(path0, paint0);
        canvas0.restore();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        Paint paint0 = this.c;
        if(v != paint0.getAlpha()) {
            paint0.setAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.c.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setProgress(float f) {
        if(this.a != f) {
            this.a = f;
            this.invalidateSelf();
        }
    }
}

