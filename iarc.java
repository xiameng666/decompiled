import android.content.Context;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class iarc implements iavd {
    final Context a;
    final Executor b;
    final ibcd c;
    final ibcd d;
    final iaqy e;
    final iaqp f;
    final iaqs g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    public iarc(iarb iarb0) {
        Context context0 = iarb0.a;
        gftb.check(context0);
        this.a = context0;
        gftb.check(iarb0.h);
        this.b = context0.getMainExecutor();
        this.c = iarb0.c;
        ibcd ibcd0 = iarb0.b;
        gftb.check(ibcd0);
        this.d = ibcd0;
        iaqy iaqy0 = iarb0.d;
        gftb.check(iaqy0);
        this.e = iaqy0;
        iaqp iaqp0 = iarb0.e;
        gftb.check(iaqp0);
        this.f = iaqp0;
        iaqs iaqs0 = iarb0.f;
        gftb.check(iaqs0);
        this.g = iaqs0;
        gftb.check(iarb0.g);
        this.h = (ScheduledExecutorService)iarb0.c.a();
        this.i = ibcd0.a();
    }

    @Override  // iavd
    public final iavn a(SocketAddress socketAddress0, iavc iavc0, iakt iakt0) {
        if(!this.j) {
            return new iarl(this, ((iaql)socketAddress0), iavc0);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    @Override  // iavd
    public final Collection b() {
        return Collections.singleton(iaql.class);
    }

    @Override  // iavd
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override  // iavd
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}

