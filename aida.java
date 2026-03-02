import android.util.Pair;
import j..util.Objects;

public final class aida extends byk {
    final ahwx f;

    public aida(ahwx ahwx0) {
        Objects.requireNonNull(ahwx0);
        this.f = ahwx0;
        super(4);
    }

    @Override  // byk
    protected final Object c(Object object0) {
        Pair pair0 = (Pair)object0;
        return new bbfe_BaseGrpcServer(this.f.a, ((String)pair0.first), ((int)(((Integer)pair0.second))), -1, 4100);
    }
}

