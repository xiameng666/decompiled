import android.os.Process;
import j..util.Objects;

final class ehht implements Runnable {
    final ehhu a;

    public ehht(ehhu ehhu0) {
        Objects.requireNonNull(ehhu0);
        this.a = ehhu0;
        super();
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        try {
            this.a.b.g(this.a.c);
        }
        catch(ehfh ehfh0) {
            this.a.d.b(ehfh0.a);
        }
        catch(Exception exception0) {
            this.a.d.b(exception0);
        }
        finally {
            this.a.d.c(this.a.a);
            ehhu.b(this.a);
        }
    }
}

