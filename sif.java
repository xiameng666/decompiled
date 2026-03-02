import android.content.Context;

public final class sif {
    public final jdz a;
    public final jdz b;
    public final jdz c;
    public final jdz d;
    public final jdz e;
    public final jdz f;
    public final jdz g;
    public final jdz h;
    public final jdz i;
    public final jdz j;
    public final jdz k;
    public final jdz l;
    public final jdz m;
    public final jdz n;
    public final jdz o;
    public final jdz p;
    public final jdz q;

    public sif(Context context0) {
        this.a = sih.a(context0, "config_headlineFontFamily", "config_headlineFontFamilyMedium");
        this.b = sih.a(context0, "config_bodyFontFamily", "config_bodyFontFamilyMedium");
        this.c = sif.a("variable-display-large-emphasized");
        this.d = sif.a("variable-display-medium-emphasized");
        this.e = sif.a("variable-display-small-emphasized");
        this.f = sif.a("variable-headline-large-emphasized");
        this.g = sif.a("variable-headline-medium-emphasized");
        this.h = sif.a("variable-headline-small-emphasized");
        this.i = sif.a("variable-title-large-emphasized");
        this.j = sif.a("variable-title-medium-emphasized");
        this.k = sif.a("variable-title-small-emphasized");
        this.l = sif.a("variable-body-large-emphasized");
        this.m = sif.a("variable-body-medium-emphasized");
        this.n = sif.a("variable-body-small-emphasized");
        this.o = sif.a("variable-label-large-emphasized");
        this.p = sif.a("variable-label-medium-emphasized");
        this.q = sif.a("variable-label-small-emphasized");
    }

    private static final jdz a(String s) {
        jdy[] arr_jdy = new jdy[1];
        jdv.a(s);
        arr_jdy[0] = jdx.a(s, null, 0, null, 14);
        return jea.a(arr_jdy);
    }
}

