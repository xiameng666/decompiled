import android.graphics.drawable.Drawable;

public final class deii implements uox {
    final deij a;

    public deii(deij deij0) {
        this.a = deij0;
        super();
    }

    @Override  // uox
    public final boolean b(Object object0, Object object1, upn upn0, uag uag0) {
        Drawable drawable0 = (Drawable)object0;
        ibuq.f(upn0, "target");
        ibuq.f(uag0, "dataSource");
        this.a.a.remove(object1);
        return false;
    }

    @Override  // uox
    public final boolean fv(udv udv0, Object object0, upn upn0) {
        ibuq.f(upn0, "target");
        this.a.a.remove(object0);
        return false;
    }
}

