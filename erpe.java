import android.os.Looper;
import j..util.Objects;

public final class erpe implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    final erqa b;
    private static final baun c;

    static {
        erpe.c = new erqc(new String[]{"Utils", "CascadingUncaughtExceptionHandler"});
    }

    public erpe(erqa erqa0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        Objects.requireNonNull(erqa0);
        this.b = erqa0;
        super();
        this.a = thread$UncaughtExceptionHandler0;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        erpe.c.d("Uncaught exception: " + throwable0, new Object[0]);
        try {
            Looper looper0 = Looper.getMainLooper();
            if(looper0.getThread() == thread0) {
                this.b.a();
            }
            else {
                new clht(looper0).post(new erpz(this));
            }
        }
        catch(Exception exception0) {
            try {
                erpe.c.g("Error reporting crash", exception0, new Object[0]);
            }
            catch(Exception unused_ex) {
            }
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.a;
        if(thread$UncaughtExceptionHandler0 != null) {
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        }
    }
}

