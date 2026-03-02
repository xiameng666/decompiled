import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.ScheduledExecutorService;

public final class bvpa implements Factory {
    private final Provider a;

    public bvpa(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Application application0;
        Context context0 = (Context)this.a.get();
        ibuq.f(context0, "context");
        ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(1, clhr.a);
        cdbi cdbi0 = new cdbi(cfrz.b);
        ibuq.f(context0, "applicationContext");
        try {
            application0 = null;
            application0 = (Application)context0;
        }
        catch(ClassCastException unused_ex) {
        }
        return new bvmx(scheduledExecutorService0, cdbi0, application0);
    }
}

