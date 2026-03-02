import android.view.View;

public final class dnbu implements ibts {
    public final dnci a;

    public dnbu(dnci dnci0) {
        this.a = dnci0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = this.a.ag;
        if(view0 == null) {
            ibuq.j("spinner");
            view0 = null;
        }
        view0.setVisibility((((Boolean)object0).booleanValue() ? 0 : 8));
        return ibom.a;
    }
}

