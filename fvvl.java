import android.content.Context;

public final class fvvl implements gfsi {
    public final fvvp a;
    public final Context b;

    public fvvl(fvvp fvvp0, Context context0) {
        this.a = fvvp0;
        this.b = context0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fvvp fvvp0 = this.a;
        if(((gxel)object0) != null && (((gxel)object0).b & 1) != 0 && System.currentTimeMillis() - ((gxel)object0).c < fvvp0.b) {
            return (gxel)object0;
        }
        fvvp0.g(this.b);
        return null;
    }
}

