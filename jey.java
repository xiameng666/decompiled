import android.content.Context;
import android.graphics.Typeface;

final class jey implements jde {
    public static final jey a;

    static {
        jey.a = new jey();
    }

    @Override  // jde
    public final Typeface a(Context context0, jdf jdf0) {
        Typeface typeface0 = null;
        jdw jdw0 = (jdf0 instanceof jdw) ? ((jdw)jdf0) : null;
        if(jdw0 != null) {
            jew jew0 = jdz.a;
            String s = jdw0.c;
            jeu jeu0 = jdw0.d;
            int v = jdw0.e;
            if(ibuq.m(s, jew0.f)) {
                return jfc.a(jfb.b(jew0, jeu0, v), jdw0.b, context0);
            }
            jew jew1 = jdz.b;
            if(ibuq.m(s, jew1.f)) {
                return jfc.a(jfb.b(jew1, jeu0, v), jdw0.b, context0);
            }
            jew jew2 = jdz.c;
            if(ibuq.m(s, jew2.f)) {
                return jfc.a(jfb.b(jew2, jeu0, v), jdw0.b, context0);
            }
            jew jew3 = jdz.d;
            if(ibuq.m(s, jew3.f)) {
                return jfc.a(jfb.b(jew3, jeu0, v), jdw0.b, context0);
            }
            if(s.length() != 0) {
                Typeface typeface1 = jfb.a(s, jeu0, v);
                if(!ibuq.m(typeface1, Typeface.create(Typeface.DEFAULT, jeu0.l, v == 1)) && !ibuq.m(typeface1, jfb.a(null, jeu0, v))) {
                    typeface0 = typeface1;
                }
            }
            return jfc.a(typeface0, jdw0.b, context0);
        }
        return null;
    }

    @Override  // jde
    public final Object b(Context context0, jdf jdf0, ibrl ibrl0) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}

