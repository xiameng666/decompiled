import android.content.Context;

public final class fddz implements Runnable {
    public final fded a;
    public final Context b;
    public final int c;
    public final String d;
    public final gged_interceptors e;

    public fddz(fded fded0, Context context0, int v, String s, gged_interceptors gged0) {
        this.a = fded0;
        this.b = context0;
        this.c = v;
        this.d = s;
        this.e = gged0;
    }

    @Override
    public final void run() {
        String s;
        Context context0;
        try {
            context0 = this.b;
            s = fdcj.a(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            if(illegalStateException0.getCause() != null) {
                illegalStateException0 = illegalStateException0.getCause();
            }
            fded.a.g("Could not retrieve local GAIA ID", illegalStateException0, new Object[0]);
            s = null;
        }
        fded fded0 = this.a;
        String s1 = this.d;
        gged_interceptors gged0 = this.e;
        fdco fdco0 = fded0.b;
        if(s1 == null) {
            if(this.c == 1) {
                fded.a.m("Could not fetch remote GAIA ID: missing watch node id", new Object[0]);
            }
            fded0.a(context0, gged0, fdco0, s, null, null);
            return;
        }
        int v = (int)hzvd.b();
        fddt fddt0 = new fddt(fded0, s1);
        ffnc.a(v, gmap.a, ((gful_cronetEngineProvider)fddt0)).z(new fddu(fded0, context0, gged0, fdco0, s, s1));
    }
}

