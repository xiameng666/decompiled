import android.os.CancellationSignal;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class kui implements evqc {
    public final CancellationSignal a;
    public final Executor b;
    public final kjk c;

    public kui(CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        klq klq0;
        kln kln0;
        if((exception0 instanceof bxur)) {
            kln0 = kmo.b(((bxur)exception0).a, exception0.getMessage());
        }
        else {
            if((exception0 instanceof aztb)) {
                int v = ((aztb)exception0).b();
                if(v == 16) {
                    klq0 = new klk(exception0.getMessage());
                }
                else if(kno.b.contains(Integer.valueOf(v))) {
                    klq0 = new klo(exception0.getMessage());
                }
                else {
                    Objects.toString(exception0);
                    klq0 = new klq("Get digital credential failed, failure: " + exception0.toString());
                }
            }
            else {
                Objects.toString(exception0);
                klq0 = new klq("Get digital credential failed, failure: " + exception0.toString());
            }
            kln0 = klq0;
        }
        kuj kuj0 = new kuj(this.b, this.c, kln0);
        knt.a(this.a, kuj0);
    }
}

