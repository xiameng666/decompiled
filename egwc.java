import java.util.concurrent.Callable;

public final class egwc implements Callable {
    public final egwd a;
    public final int b;

    public egwc(egwd egwd0, int v) {
        this.a = egwd0;
        this.b = v;
    }

    @Override
    public final Object call() {
        egnt egnt0 = new egnt(this.b, 1);
        return this.a.b.a(egnt0);
    }
}

