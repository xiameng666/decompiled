import j..util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class aqxi implements gmbg {
    final aqxj a;
    private final int b;

    public aqxi(aqxj aqxj0, int v) {
        Objects.requireNonNull(aqxj0);
        this.a = aqxj0;
        super();
        this.b = v;
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        aqxj aqxj0 = this.a;
        synchronized(aqxj0) {
            if((throwable0 instanceof TimeoutException)) {
                Long long0 = hqhq.e();
                aqxj.a.g("Timeout after %d ms switching from %s to %s", throwable0, new Object[]{long0, aqxj.b(aqxj0.b), aqxj.b(this.b)});
            }
            else if((throwable0 instanceof CancellationException)) {
                aqxj.a.g("Cancellation switching from %s to %s", throwable0, new Object[]{aqxj.b(aqxj0.b), aqxj.b(this.b)});
            }
            else {
                aqxj.a.g("Error while switching from %s to %s", throwable0, new Object[]{aqxj.b(aqxj0.b), aqxj.b(this.b)});
            }
            aqxj0.c = aqxj0.b;
            aqxj.e(aqxj0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        synchronized(this.a) {
            aqxj.a.h("Successfully switched from %s to %s", new Object[]{aqxj.b(this.a.b), aqxj.b(this.b)});
            this.a.b = this.b;
            aqxj.e(this.a);
        }
    }
}

