import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class foaa implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = eyxu.a();
        gfsx gfsx0 = eymg.a();
        foek foek0 = new foek();
        foek0.b(context0);
        foek0.b = (ExecutorService)gfsx0.f(Executors.newCachedThreadPool(fnwu.a()));
        return foek0.a();
    }
}

