import java.util.List;
import java.util.concurrent.Future;

public final class arqp implements arqr {
    public final Future a;

    public arqp(Future future0) {
        this.a = future0;
    }

    @Override  // arqr
    public final List a() {
        return ((arhg)this.a.get()).b("image");
    }
}

