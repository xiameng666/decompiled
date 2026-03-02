import j..util.Objects;

final class crkn implements Thread.UncaughtExceptionHandler {
    final crkq a;
    private final String b;

    public crkn(crkq crkq0, String s) {
        Objects.requireNonNull(crkq0);
        this.a = crkq0;
        super();
        this.b = s;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            this.a.aJ().c.b(this.b, throwable0);
        }
    }
}

