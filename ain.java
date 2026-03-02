import android.content.Context;
import java.util.concurrent.Executor;

public final class ain {
    private final Context a;
    private final String b;
    private Executor c;

    public ain(Context context0, String s) {
        kay.i(context0);
        this.a = context0;
        if(s.contains("/")) {
            throw new IllegalArgumentException("Database name cannot contain \'/\'");
        }
        this.b = s;
    }

    public final aio a() {
        if(this.c == null) {
            this.c = aip.a;
        }
        return new aio(this.a, this.b, this.c);
    }

    public final void b(Executor executor0) {
        kay.i(executor0);
        this.c = executor0;
    }
}

