import j..util.Objects;
import java.util.concurrent.Callable;

final class crlj implements Callable {
    final String a;
    final String b;
    final String c;
    final crih d;

    public crlj(crih crih0, String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        Objects.requireNonNull(crih0);
        this.d = crih0;
        super();
    }

    @Override
    public final Object call() {
        this.d.a.F();
        return this.d.a.o().w(this.a, this.b, this.c);
    }
}

