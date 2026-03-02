import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public final class kom implements evqc {
    public final CancellationSignal a;
    public final Executor b;
    public final kjk c;

    public kom(CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ibvd ibvd0 = new ibvd();
        ibvd0.a = new kli("Create restore credential failed for unknown reason, failure: " + exception0.getMessage());
        if((exception0 instanceof aztb)) {
            switch(((aztb)exception0).b()) {
                case 40201: {
                    ibvd0.a = new kli("The restore credential internal service had a failure, failure: " + exception0.getMessage());
                    break;
                }
                case 40202: {
                    ibvd0.a = new kmm(new klv(), "The request did not match the fido spec, failure: " + exception0.getMessage());
                    break;
                }
                case 40203: {
                    ibvd0.a = new kmn();
                    break;
                }
                default: {
                    ibvd0.a = new kli("The restore credential service failed with unsupported status code, failure: " + exception0.getMessage() + ", status code: " + ((aztb)exception0).b());
                }
            }
        }
        kon kon0 = new kon(this.b, this.c, ibvd0);
        knt.a(this.a, kon0);
    }
}

