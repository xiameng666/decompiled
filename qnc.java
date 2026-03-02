import java.util.List;

public final class qnc extends qmx {
    private final quc e;

    public qnc(List list0) {
        super(list0);
        this.e = new quc();
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        float f3;
        Object object0 = qtz0.b;
        if(object0 != null) {
            Object object1 = qtz0.c;
            if(object1 != null) {
                qub qub0 = this.d;
                if(qub0 == null) {
                    f3 = f;
                }
                else {
                    float f1 = (float)qtz0.h;
                    float f2 = this.c();
                    f3 = f;
                    Object object2 = (quc)qub0.b(qtz0.g, f1, ((quc)object0), ((quc)object1), f3, f2, this.c);
                    if(object2 != null) {
                        return object2;
                    }
                }
                float f4 = ((quc)object0).a;
                float f5 = f4 + (((quc)object1).a - f4) * f3;
                float f6 = ((quc)object0).b;
                this.e.a = f5;
                this.e.b = f6 + (((quc)object1).b - f6) * f3;
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

