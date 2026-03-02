import android.graphics.drawable.Drawable;

public final class ftyx implements uox {
    final fryg a;
    final frxt b;

    public ftyx(fryg fryg0, frxt frxt0) {
        this.a = fryg0;
        this.b = frxt0;
        super();
    }

    @Override  // uox
    public final boolean b(Object object0, Object object1, upn upn0, uag uag0) {
        this.a.d.a();
        frxt frxt0 = this.b;
        if(frxt0 != null && (((Drawable)object0) instanceof umm)) {
            ((umm)(((Drawable)object0))).e(frxt0.a);
            ((umm)(((Drawable)object0))).b(new ftyw(frxt0));
        }
        return false;
    }

    @Override  // uox
    public final boolean fv(udv udv0, Object object0, upn upn0) {
        this.a.e.a(udv0);
        return false;
    }
}

