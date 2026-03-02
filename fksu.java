import j..util.Collection.-EL;
import java.util.concurrent.Callable;

public final class fksu implements Callable {
    public final gmcd a;
    public final gmcd b;

    public fksu(gmcd gmcd0, gmcd gmcd1) {
        this.a = gmcd0;
        this.b = gmcd1;
    }

    @Override
    public final Object call() {
        gged_interceptors gged0 = (gged_interceptors)gmbu.r(this.a);
        ggfp ggfp0 = (ggfp)Collection.-EL.stream(((gged_interceptors)gmbu.r(this.b))).map(new fktb()).collect(ggaf.b);
        return (gged_interceptors)Collection.-EL.stream(gged0).filter(new fkta(ggfp0)).collect(ggaf.a);
    }
}

