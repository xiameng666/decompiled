import java.util.concurrent.Executor;

final class jqm {
    static final jqm a;
    final Runnable b;
    final Executor c;
    jqm next;

    static {
        jqm.a = new jqm(null, null);
    }

    public jqm(Runnable runnable0, Executor executor0) {
        this.b = runnable0;
        this.c = executor0;
    }
}

