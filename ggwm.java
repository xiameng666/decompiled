public abstract class ggwm {
    public final int a;
    public final ggtr b;

    protected ggwm(ggtr ggtr0, int v) {
        if(ggtr0 == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if(v < 0) {
            throw new IllegalArgumentException("invalid index: " + v);
        }
        this.a = v;
        this.b = ggtr0;
    }

    public abstract void a(ggwq arg1, Object arg2);
}

