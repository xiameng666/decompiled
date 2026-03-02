import android.content.Context;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import java.util.concurrent.Executor;

public final class gbku {
    public final Bender3Database a(Context context0, Executor executor0) {
        omn omn0;
        synchronized(this) {
            ibuq.f(context0, "context");
            ibuq.f(executor0, "queryExecutor");
            omd omd0 = cctd.a(context0, Bender3Database.class, "Bender3Database");
            omd0.d();
            omd0.e = true;
            ibuq.f(executor0, "executor");
            omd0.c = executor0;
            omd0.c();
            omn0 = omd0.a();
            ibuq.e(omn0, "build(...)");
        }
        return (Bender3Database)omn0;
    }

    public static Bender3Database b(gbku gbku0, Context context0) {
        return gbku0.a(context0, gblx.a);
    }
}

