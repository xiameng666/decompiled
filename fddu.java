import android.content.Context;

public final class fddu implements evpz {
    public final fded a;
    public final Context b;
    public final gged_interceptors c;
    public final fdco d;
    public final String e;
    public final String f;

    public fddu(fded fded0, Context context0, gged_interceptors gged0, fdco fdco0, String s, String s1) {
        this.a = fded0;
        this.b = context0;
        this.c = gged0;
        this.d = fdco0;
        this.e = s;
        this.f = s1;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        String s;
        if(evql0.n()) {
            fded.a.h("Watch account GAIA ID fetched", new Object[0]);
            s = (String)evql0.j();
        }
        else {
            fded.a.m("Watch account GAIA ID fetch failed", new Object[0]);
            s = null;
        }
        this.a.a(this.b, this.c, this.d, this.e, s, this.f);
    }
}

