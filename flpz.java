import android.content.Context;
import android.net.Uri;
import j..util.Objects;

final class flpz extends lvb {
    public final gfsi a;
    public final Uri b;
    final Uri c;
    final String[] d;
    final String e;
    final String[] f;
    final String g;
    final String h;
    final String i;
    public boolean j;
    final flqa k;
    private final flpy l;

    public flpz(flqa flqa0, Context context0, gfsi gfsi0, Uri uri0) {
        Objects.requireNonNull(flqa0);
        this.k = flqa0;
        super(context0);
        this.j = false;
        this.a = gfsi0;
        this.b = uri0;
        gged_interceptors gged0 = flqa0.b.b;
        gged_interceptors gged1 = flqa0.b.d;
        this.c = flqa0.b.a;
        this.d = gged0 == null ? null : ((String[])gged0.toArray(new String[((ggna)gged0).c]));
        this.e = flqa0.b.c;
        this.f = gged1 == null ? null : ((String[])gged1.toArray(new String[((ggna)gged1).c]));
        this.g = flqa0.b.e;
        this.h = null;
        int v = flqa0.b.f;
        this.i = flqa0.b.g + ", " + (v < 0 ? "2147483647" : String.valueOf(v));
        flpy flpy0 = new flpy(this);
        this.l = flpy0;
        flqe.a().c(uri0, flpy0);
    }

    @Override  // lvb
    protected final void onForceLoad() {
        if(this.j) {
            return;
        }
        this.j = true;
        new flpx(this).executeOnExecutor(this.k.a, new Void[0]);
    }

    @Override  // lvb
    protected final void onStartLoading() {
        if(!this.takeContentChanged() && this.k.e().i()) {
            return;
        }
        this.forceLoad();
    }
}

