import java.util.function.Supplier;

public final class azkx implements Supplier {
    public final azla a;
    public final int b;
    public final int c;

    public azkx(azla azla0, int v, int v1) {
        this.a = azla0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final Object get() {
        this.a.d.b("INVALID_METRIC_PARAMS", this.b, this.c);
        return new cjuh(10, String.format("Project not found in the Cobalt registry: %d-%d", ((int)this.b), ((int)this.c)));
    }
}

