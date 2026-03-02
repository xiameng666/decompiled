import android.content.Context;
import java.util.concurrent.Callable;

public final class ajko implements Callable {
    public final Context a;
    public final String b;

    public ajko(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override
    public final Object call() {
        return gfsx.l(new ajfq(this.a).c(this.b));
    }
}

