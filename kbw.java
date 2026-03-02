import android.content.Context;
import j..util.Objects;
import java.util.concurrent.Executor;

public final class kbw extends kcu {
    public kbw(Context context0, Executor executor0, kbu kbu0, kde kde0, boolean z) {
        super(context0, executor0, kbu0, kde0, z);
    }

    @Override  // kcu
    protected final int a(kcw kcw0) {
        return kbw.l(((kda)kcw0.g.get(0)), kcw0.f);
    }

    @Override  // kcu
    protected final hjlk b() {
        Objects.requireNonNull(this.e);
        return kbq.b(0, this.n(), this.e, this.k);
    }
}

