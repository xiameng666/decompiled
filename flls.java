import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class flls implements Callable {
    public final flmu a;
    public final Context b;
    public final gfsi c;
    public final Uri d;
    public final flqd e;

    public flls(flmu flmu0, Context context0, gfsi gfsi0, Uri uri0, flqd flqd0) {
        this.a = flmu0;
        this.b = context0;
        this.c = gfsi0;
        this.d = uri0;
        this.e = flqd0;
    }

    @Override
    public final Object call() {
        return new flqa(this.b, this.c, this.a.e, this.d, this.e);
    }
}

