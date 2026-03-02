import android.graphics.Typeface;

final class jfb {
    public static final Typeface a(String s, jeu jeu0, int v) {
        if(v == 0 && ibuq.m(jeu0, jeu.h) && (s == null || s.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return s == null ? Typeface.create(Typeface.DEFAULT, jeu0.l, v == 1) : Typeface.create(Typeface.create(s, 0), jeu0.l, v == 1);
    }

    public static final Typeface b(jew jew0, jeu jeu0, int v) {
        return jfb.a(jew0.f, jeu0, v);
    }
}

