import android.content.Context;
import android.util.ArrayMap;
import dagger.Lazy;
import dagger.internal.ProviderOfLazy;
import java.util.concurrent.Executor;

@ibnh
public final class fowz extends foxf implements foqo, fotm {
    public final Context a;
    public final foxr b;
    public final ArrayMap c;
    public final Executor d;
    public final fotj e;
    public final ibnf f;
    public final foxi g;
    public final gfsx h;
    public final ibnf i;
    private final forb j;
    private final fowr k;
    private final fowy l;

    public fowz(fotk fotk0, Context context0, forb forb0, Lazy lazy0, fowr fowr0, ibnf ibnf0, ibnf ibnf1, Executor executor0, foxs foxs0, ibnf ibnf2, foxi foxi0, gfsx gfsx0, ibnf ibnf3) {
        ArrayMap arrayMap0 = new ArrayMap();
        this.c = arrayMap0;
        this.d = executor0;
        this.e = fotk0.a(executor0, lazy0, ibnf1);
        this.a = context0;
        this.j = forb0;
        this.f = ibnf0;
        this.k = fowr0;
        fowy fowy0 = new fowy(arrayMap0, ibnf2);
        this.l = fowy0;
        Lazy lazy1 = ((ProviderOfLazy)foxs0.a).a();
        lazy1.getClass();
        ((gmch)foxs0.b.get()).getClass();
        this.b = new foxr(lazy1, fowy0);
        this.g = foxi0;
        this.h = gfsx0;
        this.i = ibnf3;
    }

    public static fotb a(idck idck0, foxd foxd0) {
        fota fota0 = fotb.a();
        idcv idcv0 = (idcv)((ProtoLiteMessage)idcw.a).v_newBuilder();
        if(!idcv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)idcv0).ensureMutable();
        }
        idcw idcw0 = (idcw)idcv0.b_message;
        idck0.getClass();
        idcw0.l = idck0;
        idcw0.b |= 0x400;
        fota0.f(((idcw)((ProtoLiteBuilder)idcv0).N_build()));
        fota0.b = null;
        fota0.c = "Activity";
        fota0.a = foxd0.a.b();
        fota0.c(true);
        return fota0.a();
    }

    @Override  // foqo
    public final void g(fokg fokg0) {
        synchronized(this.c) {
            this.c.clear();
        }
    }

    @Override  // foqo
    public final void j(fokg fokg0) {
    }

    @Override  // fotm
    public final void k() {
        this.j.a(this.b);
        this.j.a(this.k);
    }
}

