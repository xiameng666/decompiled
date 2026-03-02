import android.view.View;

final class jmh extends ibur implements ibts {
    final jmw a;
    final ify b;

    public jmh(jmw jmw0, ify ify0) {
        this.a = jmw0;
        this.b = ify0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ili ili0 = (((iio)object0) instanceof ili) ? ((ili)(((iio)object0))) : null;
        if(ili0 != null) {
            ili0.D().a.put(this.a, this.b);
            ili0.D().addView(this.a);
            ili0.D().b.put(this.b, this.a);
            this.a.setImportantForAccessibility(1);
            ikj ikj0 = new ikj(ili0, this.b, ili0);
            kfe.j(this.a, ikj0);
        }
        jmw jmw0 = this.a;
        View view0 = jmw0.c;
        if(view0.getParent() != jmw0) {
            jmw0.addView(view0);
        }
        return ibom.a;
    }
}

