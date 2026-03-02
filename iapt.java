import java.util.logging.Level;
import java.util.logging.Logger;

final class iapt extends ialp {
    static final ThreadLocal a;
    private static final Logger b;

    static {
        iapt.b = Logger.getLogger(iapt.class.getName());
        iapt.a = new ThreadLocal();
    }

    @Override  // ialp
    public final ialq a() {
        ialq ialq0 = (ialq)iapt.a.get();
        return ialq0 == null ? ialq.b : ialq0;
    }

    @Override  // ialp
    public final ialq b(ialq ialq0) {
        ialq ialq1 = this.a();
        iapt.a.set(ialq0);
        return ialq1;
    }

    @Override  // ialp
    public final void c(ialq ialq0, ialq ialq1) {
        if(this.a() != ialq0) {
            iapt.b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if(ialq1 != ialq.b) {
            iapt.a.set(ialq1);
            return;
        }
        iapt.a.set(null);
    }
}

