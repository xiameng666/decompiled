import android.os.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest.Callback;

final class ifzz {
    final igas a;
    final Executor b;
    final Executor c;
    final igac d;

    public ifzz(igac igac0, UrlRequest.Callback urlRequest$Callback0, Executor executor0) {
        this.d = igac0;
        super();
        this.a = new igas(urlRequest$Callback0);
        if(igac0.h) {
            this.b = executor0;
            this.c = null;
            return;
        }
        this.b = new igaf(executor0);
        this.c = executor0;
    }

    final void a(igad igad0, String s) {
        try {
            this.b(new ifzh(this.d, igad0), s);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            ifxw ifxw0 = new ifxw("Exception posting task to executor", rejectedExecutionException0);
            this.d.b(ifxw0);
        }
    }

    final void b(Runnable runnable0, String s) {
        new ifvp("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + s);
        try {
            ifzv ifzv0 = new ifzv(s, runnable0);
            this.b.execute(ifzv0);
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    public final void c() {
        ifzx ifzx0 = new ifzx(this);
        this.d.d(ifzx0, "maybeReportMetrics");
    }

    final void d() {
        this.a(new ifzt(this), "onResponseStarted");
    }
}

