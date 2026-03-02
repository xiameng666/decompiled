import j..util.Objects;
import java.util.concurrent.Callable;

final class crla implements Callable {
    final String a;
    final crih b;

    public crla(crih crih0, String s) {
        this.a = s;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final Object call() {
        this.b.a.F();
        return this.b.a.o().z(this.a);
    }
}

