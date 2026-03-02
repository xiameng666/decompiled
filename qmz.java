import android.graphics.Path;
import android.graphics.PointF;

public final class qmz extends qtz {
    public Path a;
    private final qtz n;

    public qmz(qkb qkb0, qtz qtz0) {
        super(qkb0, ((PointF)qtz0.b), ((PointF)qtz0.c), qtz0.d, qtz0.e, qtz0.f, qtz0.g, qtz0.h);
        this.n = qtz0;
        this.a();
    }

    public final void a() {
        boolean z = this.c != null && (this.b != null && ((PointF)this.b).equals(((PointF)this.c).x, ((PointF)this.c).y));
        Object object0 = this.b;
        if(object0 != null) {
            Object object1 = this.c;
            if(object1 != null && !z) {
                PointF pointF0 = this.n.l;
                PointF pointF1 = this.n.m;
                Path path0 = new Path();
                path0.moveTo(((PointF)object0).x, ((PointF)object0).y);
                if(pointF0 != null && pointF1 != null && ((pointF0.length() != 0.0f) || pointF1.length() != 0.0f)) {
                    path0.cubicTo(pointF0.x + ((PointF)object0).x, ((PointF)object0).y + pointF0.y, ((PointF)object1).x + pointF1.x, ((PointF)object1).y + pointF1.y, ((PointF)object1).x, ((PointF)object1).y);
                }
                else {
                    path0.lineTo(((PointF)object1).x, ((PointF)object1).y);
                }
                this.a = path0;
            }
        }
    }
}

