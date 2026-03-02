import java.util.List;

public final class qmw extends qmx {
    public qmw(List list0) {
        super(list0);
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        return this.k(qtz0, f);
    }

    public final int k(qtz qtz0, float f) {
        float f3;
        int v;
        Object object0 = qtz0.b;
        if(object0 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object object1 = qtz0.c;
        if(object1 == null) {
            v = qtz0.d();
        }
        else {
            int v1 = qtz0.k;
            if(v1 == 0x2EC8FB09) {
                v = (int)(((Integer)object1));
                qtz0.k = v;
            }
            else {
                v = v1;
            }
        }
        qub qub0 = this.d;
        if(qub0 == null) {
            f3 = f;
        }
        else {
            float f1 = (float)qtz0.h;
            float f2 = this.c();
            f3 = f;
            Integer integer0 = (Integer)qub0.b(qtz0.g, f1, ((Integer)object0), Integer.valueOf(v), f3, f2, this.c);
            if(integer0 != null) {
                return (int)integer0;
            }
        }
        int v2 = qtz0.d();
        return (int)(((float)v2) + f3 * ((float)(v - v2)));
    }
}

