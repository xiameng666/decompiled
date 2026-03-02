import android.content.Context;

final class aywl implements Runnable {
    public final Context a;
    public final azgx b;
    public final azdl c;
    private final gmcg d;

    public aywl(Context context0) {
        this.d = new bblp(1, 10);
        this.a = context0;
        azdl azdl0 = azdn.a(context0, azgk.c());
        this.c = azdl0;
        this.b = azgz.a(context0, azdl0);
    }

    @Override
    public final void run() {
        if(hqzp.e()) {
            Context context0 = this.a;
            if(!fhcd.g(context0)) {
                gmbu.t(glzd.g(gmbt.h(azez.a(context0).a.a()), new aywj(this), this.d), new aywk(this), gmap.a);
            }
        }
    }
}

