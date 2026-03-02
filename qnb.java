import android.graphics.PointF;
import java.util.List;

public final class qnb extends qmx {
    private final PointF e;

    public qnb(List list0) {
        super(list0);
        this.e = new PointF();
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        return this.k(qtz0, f, f, f);
    }

    @Override  // qmq
    protected final Object g(qtz qtz0, float f, float f1, float f2) {
        return this.k(qtz0, f, f1, f2);
    }

    protected final PointF k(qtz qtz0, float f, float f1, float f2) {
        Object object0 = qtz0.b;
        if(object0 != null) {
            Object object1 = qtz0.c;
            if(object1 != null) {
                qub qub0 = this.d;
                if(qub0 != null) {
                    float f3 = (float)qtz0.h;
                    float f4 = this.c();
                    PointF pointF0 = (PointF)qub0.b(qtz0.g, f3, ((PointF)object0), ((PointF)object1), f, f4, this.c);
                    if(pointF0 != null) {
                        return pointF0;
                    }
                }
                this.e.set(((PointF)object0).x + f1 * (((PointF)object1).x - ((PointF)object0).x), ((PointF)object0).y + f2 * (((PointF)object1).y - ((PointF)object0).y));
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

