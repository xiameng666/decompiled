import android.content.Context;
import android.net.Uri;
import j..util.Objects;
import java.util.concurrent.Executor;

public final class flqa extends fmpa {
    public final Executor a;
    protected final flqd b;
    protected final flpz c;
    protected final flnc d;

    public flqa(Context context0, gfsi gfsi0, flnc flnc0, Uri uri0, flqd flqd0) {
        this.a = new gmct(flbh.b().a);
        this.b = flqd0;
        this.d = flnc0;
        this.c = new flpz(this, context0, gfsi0, uri0);
    }

    @Override  // fmpa
    protected final void a() {
        synchronized(this) {
            Objects.requireNonNull(this.c);
            this.i(new flpu(this.c));
        }
    }

    @Override  // fmpa
    protected final void b() {
        synchronized(this) {
            Objects.requireNonNull(this.c);
            this.i(new flpw(this.c));
        }
    }

    @Override  // fmpa
    protected final void c(Object object0) {
        super.c(object0);
    }
}

