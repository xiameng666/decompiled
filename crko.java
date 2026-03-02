import j..util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class crko extends FutureTask implements Comparable {
    final boolean a;
    final crkq b;
    private final long c;
    private final String d;

    public crko(crkq crkq0, Runnable runnable0, boolean z, String s) {
        Objects.requireNonNull(crkq0);
        this.b = crkq0;
        super(clhn.b.b(runnable0), null);
        long v = crkq.a.getAndIncrement();
        this.c = v;
        this.d = s;
        this.a = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            crkq0.aJ().c.a("Tasks index overflow");
        }
    }

    public crko(crkq crkq0, Callable callable0, boolean z) {
        Objects.requireNonNull(crkq0);
        this.b = crkq0;
        super(clhn.b.c(callable0));
        long v = crkq.a.getAndIncrement();
        this.c = v;
        this.d = "Task exception on worker thread";
        this.a = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            crkq0.aJ().c.a("Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.a;
        if(z != ((crko)object0).a) {
            return z ? -1 : 1;
        }
        long v = this.c;
        int v1 = Long.compare(v, ((crko)object0).c);
        if(v1 < 0) {
            return -1;
        }
        if(v1 > 0) {
            return 1;
        }
        this.b.aJ().d.b("Two tasks share the same index. index", Long.valueOf(v));
        return 0;
    }

    @Override
    protected final void setException(Throwable throwable0) {
        this.b.aJ().c.b(this.d, throwable0);
        if((throwable0 instanceof crkm)) {
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
            }
        }
        super.setException(throwable0);
    }
}

