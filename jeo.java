import android.graphics.Typeface;

public final class jeo {
    public static final Object a(int v, Object object0, jdy jdy0, jeu jeu0, int v1) {
        boolean z = false;
        if((object0 instanceof Typeface)) {
            boolean z1 = (v & 1) != 0 && !ibuq.m(jdy0.c(), jeu0) && (jeu0.a(jeu.c) >= 0 && jdy0.c().a(jeu.c) < 0);
            if((v & 2) != 0 && !jem.b(v1, jdy0.b())) {
                z = true;
            }
            if(!z) {
                if(!z1) {
                    return object0;
                }
            }
            else if(!z1) {
                int v2 = jdy0.c().l;
                return z ? Typeface.create(((Typeface)object0), v2, v1 == 1) : Typeface.create(((Typeface)object0), v2, jem.b(jdy0.b(), 1));
            }
            return z ? Typeface.create(((Typeface)object0), jeu0.l, v1 == 1) : Typeface.create(((Typeface)object0), jeu0.l, jem.b(jdy0.b(), 1));
        }
        return object0;
    }
}

