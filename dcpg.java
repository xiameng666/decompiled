import java.util.concurrent.Callable;

public final class dcpg implements Callable {
    public final dcpn a;

    public dcpg(dcpn dcpn0) {
        this.a = dcpn0;
    }

    @Override
    public final Object call() {
        return (long)this.a.e;
    }
}

