import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public final class koq implements evqc {
    public final CancellationSignal a;
    public final Executor b;
    public final kjk c;

    public koq(CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ibvd ibvd0 = new ibvd();
        ibvd0.a = new klq("Get restore credential failed for unknown reason, failure: " + exception0.getMessage());
        if((exception0 instanceof aztb)) {
            ibvd0.a = ((aztb)exception0).b() == 40201 ? new klq("The restore credential internal service had a failure, failure: " + exception0.getMessage()) : new klq("The restore credential service failed with unsupported status code, failure: " + exception0.getMessage() + ", status code: " + ((aztb)exception0).b());
        }
        kot kot0 = new kot(this.b, this.c, ibvd0);
        knt.a(this.a, kot0);
    }
}

