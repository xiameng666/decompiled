import java.util.HashMap;

final class jmi extends ibur implements ibts {
    final jmw a;

    public jmi(jmw jmw0) {
        this.a = jmw0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ili ili0 = (((iio)object0) instanceof ili) ? ((ili)(((iio)object0))) : null;
        if(ili0 != null) {
            ili0.D().removeViewInLayout(this.a);
            HashMap hashMap0 = ili0.D().b;
            Object object1 = ili0.D().a.remove(this.a);
            ibvh.c(hashMap0).remove(object1);
            this.a.setImportantForAccessibility(0);
        }
        this.a.removeAllViewsInLayout();
        return ibom.a;
    }
}

