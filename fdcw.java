import android.content.Context;

public final class fdcw implements Runnable {
    public final fddd a;
    public final Context b;
    public final gged_interceptors c;
    public final String d;

    public fdcw(fddd fddd0, Context context0, gged_interceptors gged0, String s) {
        this.a = fddd0;
        this.b = context0;
        this.c = gged0;
        this.d = s;
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
            fddd.a.g("Could not retrieve local GAIA ID", illegalStateException0, new Object[0]);
            s = null;
        }
        int v = (int)hzvd.b();
        fdcz fdcz0 = new fdcz(this.a, this.d);
        ffnc.a(v, gmap.a, ((gful_cronetEngineProvider)fdcz0)).z(new fdda(this.a, context0, this.c, s, this.d));
    }
}

