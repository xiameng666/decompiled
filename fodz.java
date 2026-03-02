import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class fodz implements fodv {
    public static final String[] a;
    public final Context b;
    public final gmcg c;

    static {
        fodz.a = new String[]{"service_googleone"};
    }

    public fodz(Context context0, ExecutorService executorService0) {
        this.b = context0;
        this.c = gmcn.a(executorService0);
    }

    @Override  // fodv
    public final gmcd a() {
        return gdtf.h(new fody(this), this.c);
    }
}

