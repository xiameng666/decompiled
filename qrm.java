import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public final class qrm extends qrf {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final qrj n;
    private qmq o;
    private qmq p;

    public qrm(qkz qkz0, qrj qrj0) {
        super(qkz0, qrj0);
        this.j = new RectF();
        qlp qlp0 = new qlp();
        this.k = qlp0;
        this.l = new float[8];
        this.m = new Path();
        this.n = qrj0;
        qlp0.setAlpha(0);
        qlp0.setStyle(Paint.Style.FILL);
        qlp0.setColor(qrj0.k);
    }

    @Override  // qrf
    public final void a(Object object0, qub qub0) {
        super.a(object0, qub0);
        if(object0 == qle.K) {
            if(qub0 == null) {
                this.o = null;
                return;
            }
            this.o = new qni(qub0);
            return;
        }
        if(object0 == qle.a) {
            if(qub0 == null) {
                this.p = null;
                this.k.setColor(this.n.k);
                return;
            }
            this.p = new qni(qub0);
        }
    }

    @Override  // qrf
    public final void c(RectF rectF0, Matrix matrix0, boolean z) {
        super.c(rectF0, matrix0, z);
        this.j.set(0.0f, 0.0f, ((float)this.n.i), ((float)this.n.j));
        this.a.mapRect(this.j);
        rectF0.set(this.j);
    }

    @Override  // qrf
    public final void l(Canvas canvas0, Matrix matrix0, int v) {
        qrj qrj0 = this.n;
        int v1 = qrj0.k;
        int v2 = Color.alpha(v1);
        if(v2 != 0) {
            Integer integer0 = this.p == null ? null : ((Integer)this.p.e());
            if(integer0 == null) {
                this.k.setColor(v1);
            }
            else {
                this.k.setColor(integer0.intValue());
            }
            qmq qmq0 = this.g.e;
            int v3 = qmq0 == null ? 100 : ((int)(((Integer)qmq0.e())));
            Paint paint0 = this.k;
            int v4 = (int)(((float)v) / 255.0f * (((float)v2) / 255.0f * ((float)v3) / 100.0f) * 255.0f);
            paint0.setAlpha(v4);
            qmq qmq1 = this.o;
            if(qmq1 != null) {
                paint0.setColorFilter(((ColorFilter)qmq1.e()));
            }
            if(v4 > 0) {
                this.l[0] = 0.0f;
                this.l[1] = 0.0f;
                this.l[2] = (float)qrj0.i;
                this.l[3] = 0.0f;
                this.l[4] = (float)qrj0.i;
                this.l[5] = (float)qrj0.j;
                this.l[6] = 0.0f;
                this.l[7] = (float)qrj0.j;
                matrix0.mapPoints(this.l);
                this.m.reset();
                this.m.moveTo(this.l[0], this.l[1]);
                this.m.lineTo(this.l[2], this.l[3]);
                this.m.lineTo(this.l[4], this.l[5]);
                this.m.lineTo(this.l[6], this.l[7]);
                this.m.lineTo(this.l[0], this.l[1]);
                this.m.close();
                canvas0.drawPath(this.m, paint0);
            }
        }
    }
}

