import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;

public final class gbmk extends View {
    public int a;
    public int b;
    public RectF c;
    public float d;
    public int e;
    public float f;
    public int[] g;
    public float h;
    public float i;
    public int[] j;
    public final boolean[] k;
    public boolean l;
    public boolean m;
    private Shape n;
    private final Path o;
    private final RectF p;
    private final Paint q;
    private final Paint r;

    public gbmk(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.c = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        int[] arr_v = new int[4];
        for(int v = 0; v < 4; ++v) {
            arr_v[v] = 0;
        }
        this.g = arr_v;
        int[] arr_v1 = new int[4];
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_v1[v1] = 0;
        }
        this.j = arr_v1;
        this.o = new Path();
        this.p = new RectF();
        this.q = new Paint(1);
        Paint paint0 = new Paint(1);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeCap(Paint.Cap.ROUND);
        this.r = paint0;
        this.k = new boolean[4];
    }

    public final void a() {
        if(((Float.compare(this.c.left, 0.0f) > 0 || this.c.top > 0.0f || this.c.right < ((float)this.a)) || (this.c.bottom < ((float)this.b))) && this.e != 0) {
            float f = (float)this.a;
            float f1 = (float)this.b;
            RectF rectF0 = new RectF(this.c.left, this.c.top, ((float)this.a) - this.c.right, ((float)this.b) - this.c.bottom);
            float[] arr_f = new float[8];
            for(int v = 0; v < 8; ++v) {
                arr_f[v] = this.d;
            }
            RoundRectShape roundRectShape0 = new RoundRectShape(null, rectF0, arr_f);
            roundRectShape0.resize(f, f1);
            this.n = roundRectShape0;
            this.q.setColor(this.e);
            return;
        }
        this.n = null;
    }

    private final void b(Canvas canvas0, float f, float f1, int v, int v1) {
        if(v != 0) {
            Paint paint0 = this.r;
            paint0.setColor(v);
            int v2 = 0;
            int v3 = 1;
            int v4 = v1 == 0 || v1 == 3 ? 1 : 0;
            if(v1 == 0 || v1 == 1) {
                v2 = 1;
            }
            Path path0 = this.o;
            path0.rewind();
            path0.moveTo(f, ((float)(1 == v2 ? 1 : -1)) * this.i + f1);
            RectF rectF0 = this.p;
            float f2 = 0.0f;
            rectF0.left = (v4 == 0 ? this.d * -2.0f : 0.0f) + f;
            rectF0.top = (v2 == 0 ? this.d * -2.0f : 0.0f) + f1;
            rectF0.right = (v4 == 0 ? 0.0f : this.d + this.d) + f;
            rectF0.bottom = (v2 == 0 ? 0.0f : this.d + this.d) + f1;
            if(1 == v4) {
                f2 = 180.0f;
            }
            path0.arcTo(rectF0, f2, (v1 == 0 || v1 == 2 ? 90.0f : -90.0f));
            if(1 != v4) {
                v3 = -1;
            }
            path0.lineTo(f + ((float)v3) * this.i, f1);
            canvas0.drawPath(path0, paint0);
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        ibuq.f(canvas0, "canvas");
        super.onDraw(canvas0);
        if(this.a > 0 && this.b > 0) {
            if(this.m) {
                Shape shape0 = this.n;
                if(shape0 != null) {
                    shape0.draw(canvas0, this.q);
                }
            }
            if(this.l) {
                int[] arr_v = this.g;
                float f = this.f;
                if(Float.compare(f, 0.0f) != 0) {
                    Paint paint0 = this.r;
                    paint0.setStrokeWidth(f);
                    boolean[] arr_z = this.k;
                    if(arr_z[0]) {
                        int v = arr_v[0];
                        if(v != 0) {
                            paint0.setColor(v);
                            canvas0.drawLine(this.c.left, this.c.top + this.i, this.c.left, this.c.bottom - this.i, paint0);
                        }
                    }
                    if(arr_z[1]) {
                        int v1 = arr_v[1];
                        if(v1 != 0) {
                            paint0.setColor(v1);
                            canvas0.drawLine(this.i + this.c.left, this.c.top, this.c.right - this.i, this.c.top, paint0);
                        }
                    }
                    if(arr_z[2]) {
                        int v2 = arr_v[2];
                        if(v2 != 0) {
                            paint0.setColor(v2);
                            canvas0.drawLine(this.c.right, this.i + this.c.top, this.c.right, this.c.bottom - this.i, paint0);
                        }
                    }
                    if(arr_z[3]) {
                        int v3 = arr_v[3];
                        if(v3 != 0) {
                            paint0.setColor(v3);
                            canvas0.drawLine(this.i + this.c.left, this.c.bottom, this.c.right - this.i, this.c.bottom, paint0);
                        }
                    }
                }
                int[] arr_v1 = this.j;
                float f1 = this.h;
                if(f1 == 0.0f) {
                    return;
                }
                if(this.i != 0.0f && (this.i >= this.d)) {
                    this.r.setStrokeWidth(f1);
                    this.b(canvas0, this.c.left, this.c.top, arr_v1[0], 0);
                    this.b(canvas0, this.c.right, this.c.top, arr_v1[1], 1);
                    this.b(canvas0, this.c.right, this.c.bottom, arr_v1[2], 2);
                    this.b(canvas0, this.c.left, this.c.bottom, arr_v1[3], 3);
                }
            }
        }
    }
}

