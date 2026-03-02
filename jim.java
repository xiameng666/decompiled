import android.graphics.Typeface;

public final class jim implements ibty {
    public final jin a;

    public jim(jin jin0) {
        this.a = jin0;
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        jin jin0 = this.a;
        gui gui0 = jin0.g.b(((jdz)object0), ((jeu)object1), ((jem)object2).a, ((jen)object3).a);
        if(!(gui0 instanceof jfj)) {
            jja jja0 = new jja(gui0, jin0.e);
            jin0.e = jja0;
            ibuq.d(jja0.a, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface)jja0.a;
        }
        ibuq.d(((jfj)gui0).a, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface)((jfj)gui0).a;
    }
}

