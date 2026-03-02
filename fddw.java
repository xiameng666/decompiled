import android.content.Context;
import java.util.concurrent.Callable;

public final class fddw implements Callable {
    public final Context a;
    public final String b;

    public fddw(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(((boolean)(bbmn.w(this.a, this.b) ^ 1)));
    }
}

