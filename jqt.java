import java.util.Objects;
import java.util.concurrent.Executor;

public final class jqt {
    Object a;
    jqx b;
    public jqz c;
    private boolean d;

    public jqt() {
        this.c = new jqz();
    }

    public final void a(Runnable runnable0, Executor executor0) {
        jqz jqz0 = this.c;
        if(jqz0 != null) {
            jqz0.hB(runnable0, executor0);
        }
    }

    public final boolean b(Object object0) {
        boolean z = true;
        this.d = true;
        if(this.b == null || !this.b.b.g(object0)) {
            z = false;
        }
        if(z) {
            this.e();
        }
        return z;
    }

    public final boolean c(Throwable throwable0) {
        boolean z = true;
        this.d = true;
        if(this.b == null || !this.b.a(throwable0)) {
            z = false;
        }
        if(z) {
            this.e();
        }
        return z;
    }

    public final void d() {
        this.d = true;
        if(this.b != null && this.b.b.cancel(true)) {
            this.e();
        }
    }

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override
    protected final void finalize() {
        jqx jqx0 = this.b;
        if(jqx0 != null && !jqx0.isDone()) {
            Object object0 = this.a;
            Objects.toString(object0);
            jqx0.a(new jqu("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + object0));
        }
        if(!this.d) {
            jqz jqz0 = this.c;
            if(jqz0 != null) {
                jqz0.g(null);
            }
        }
    }
}

