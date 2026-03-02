import android.content.Context;
import j..util.Optional;
import java.util.function.Consumer;

public final class bgtb {
    public static final bboh a;
    public final Context b;
    public final bbng c;
    public final bgpa d;
    public final Optional e;
    public final bgsq f;
    public final fxpk g;
    public final bgwf h;
    public final ibnf i;
    public volatile Consumer j;
    public final bgrt k;

    static {
        bgtb.a = bgrz.a("Mngr");
    }

    public bgtb(Context context0, bbng bbng0, bgpa bgpa0, bgrt bgrt0, Optional optional0, bgsq bgsq0, bgwf bgwf0, ibnf ibnf0, fxpk fxpk0) {
        this.b = context0;
        this.c = bbng0;
        this.d = bgpa0;
        this.k = bgrt0;
        this.e = optional0;
        this.f = bgsq0;
        this.h = bgwf0;
        this.g = fxpk0;
        this.i = ibnf0;
    }

    final void a(int v, gxod gxod0) {
        if(v != 3) {
            this.h.e(gxod0);
        }
    }

    public final boolean b(hgud hgud0) {
        if(this.g != null && this.j != null) {
            this.j.accept(hgud0);
            return true;
        }
        return false;
    }
}

