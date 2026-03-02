import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

public final class qna extends qmx {
    private final PointF e;
    private final float[] f;
    private final float[] g;
    private final PathMeasure h;
    private qmz i;

    public qna(List list0) {
        super(list0);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new float[2];
        this.h = new PathMeasure();
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        float f1;
        Path path0 = ((qmz)qtz0).a;
        if(path0 == null) {
            return (PointF)qtz0.b;
        }
        qub qub0 = this.d;
        if(qub0 == null) {
            f1 = f;
        }
        else {
            f1 = f;
            Object object0 = (PointF)qub0.b(((qmz)qtz0).g, ((qmz)qtz0).h.floatValue(), ((PointF)((qmz)qtz0).b), ((PointF)((qmz)qtz0).c), this.c(), f1, this.c);
            if(object0 != null) {
                return object0;
            }
        }
        if(this.i != ((qmz)qtz0)) {
            this.h.setPath(path0, false);
            this.i = (qmz)qtz0;
        }
        float f2 = this.h.getLength();
        float f3 = f1 * f2;
        float[] arr_f = this.g;
        this.h.getPosTan(f3, this.f, arr_f);
        Object object1 = this.e;
        ((PointF)object1).set(this.f[0], this.f[1]);
        if((f3 < 0.0f)) {
            ((PointF)object1).offset(arr_f[0] * f3, arr_f[1] * f3);
            return object1;
        }
        if((f3 > f2)) {
            float f4 = f3 - f2;
            ((PointF)object1).offset(arr_f[0] * f4, arr_f[1] * f4);
        }
        return object1;
    }
}

