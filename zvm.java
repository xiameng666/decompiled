import java.util.List;

public final class zvm implements ibts {
    public final jkp a;
    public final float b;
    public final List c;
    public final float d;

    public zvm(jkp jkp0, float f, List list0, float f1) {
        this.a = jkp0;
        this.b = f;
        this.c = list0;
        this.d = f1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        float f = ((float)jkp.b(this.a.a)) - this.b;
        for(Object object1: this.c) {
            ibp.A(((ibp)object0), ((ibq)object1), ((int)f), 0);
            f += ((float)((ibq)object1).a) + this.d;
        }
        return ibom.a;
    }
}

