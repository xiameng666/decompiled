import android.content.Context;

public final class fdda implements evpz {
    public final fddd a;
    public final Context b;
    public final gged_interceptors c;
    public final String d;
    public final String e;

    public fdda(fddd fddd0, Context context0, gged_interceptors gged0, String s, String s1) {
        this.a = fddd0;
        this.b = context0;
        this.c = gged0;
        this.d = s;
        this.e = s1;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        String s;
        if(evql0.n()) {
            fddd.a.h("Watch account GAIA ID fetched", new Object[0]);
            s = (String)evql0.j();
        }
        else {
            fddd.a.m("Watch account GAIA ID fetch failed", new Object[0]);
            s = null;
        }
        this.a.d.b(this.b, gqtz.WJ, this.c, this.a.b, this.d, s, this.e);
    }
}

