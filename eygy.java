import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutorService;

public abstract class eygy extends cjtm {
    public final bboh a;
    public static final int b;

    public eygy(bboh bboh0, azug azug0) {
        super(327, "ActiveUnlock", azug0);
        this.a = bboh0;
    }

    protected abstract gmcd b(Context arg1, ExecutorService arg2);

    public abstract void c(Status arg1, Object arg2);

    @Override  // cjtm
    protected final void f(Context context0) {
        throw new ibnr("execute not implemented");
    }

    @Override  // cjtm
    public final gmcd fA(Context context0, ExecutorService executorService0) {
        ibuq.f(context0, "context");
        ibuq.f(executorService0, "executor");
        gmcd gmcd0 = glzd.f(gmbt.h(this.b(context0, executorService0)), new eygv(new eygu(this)), gmap.a);
        eygw eygw0 = new eygw(new eygx(this));
        return glyi.f(gmcd0, Throwable.class, eygw0, gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.c(status0, null);
    }
}

