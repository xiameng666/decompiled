import j..util.Objects;
import java.util.concurrent.Executor;

public final class acgr implements azsu {
    private final Executor a;

    public acgr(Executor executor0) {
        this.a = executor0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof acgr) ? Objects.equals(this.a, ((acgr)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}

