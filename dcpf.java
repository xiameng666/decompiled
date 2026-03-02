import java.util.concurrent.Callable;

public final class dcpf implements Callable {
    public final dcpn a;

    public dcpf(dcpn dcpn0) {
        this.a = dcpn0;
    }

    @Override
    public final Object call() {
        return (long)this.a.d;
    }
}

