import android.view.View;

public final class ehnu implements ibtx {
    public final ehny a;

    public ehnu(ehny ehny0) {
        this.a = ehny0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        xob xob0 = (xob)object0;
        cmec cmec0 = (cmec)object1;
        View view0 = (View)object2;
        ibuq.f(xob0, "activity");
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(view0, "view");
        cmeb cmeb0 = cmec0.b(view0, 158804);
        cmeb0.g();
        view0.setOnClickListener(new ehnt(cmeb0, this.a, xob0));
        return ibom.a;
    }
}

