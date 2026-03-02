import java.util.List;

public final class zvn implements ibts {
    public final List a;
    public final jkp b;
    public final float c;

    public zvn(List list0, jkp jkp0, float f) {
        this.a = list0;
        this.b = jkp0;
        this.c = f;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        float f = 0.0f;
        for(Object object1: this.a) {
            ibp.A(((ibp)object0), ((ibq)object1), jkp.b(this.b.a) - ((ibq)object1).a, ((int)f));
            f += ((float)((ibq)object1).b) + this.c;
        }
        return ibom.a;
    }
}

