import android.content.Context;

public final class gylh implements gykt {
    public final gyif a;
    public gyjp b;
    private final gyjo c;

    public gylh(Context context0, gyif gyif0) {
        this.c = (gyjo)cusq.c(context0, gyjo.class);
        this.a = gyif0;
    }

    @Override  // gykt
    public final gyjk b(gyim gyim0) {
        gyjp gyjp0 = (gyjp)this.c.a.get((this.a.c == null ? gyhi.a : this.a.c).c);
        this.b = gyjp0;
        if(gyjp0 != null) {
            return new gylg(this);
        }
        throw new RuntimeException("Connection does not exist.");
    }

    @Override  // gykt
    public final MessageLite d() {
        return gyig.a;
    }

    @Override  // gykt
    public final void e(gykr gykr0) {
        gykr0.b();
    }
}

