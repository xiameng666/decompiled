import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class gayv implements Factory {
    private final Provider a;
    private final Provider b;

    public gayv(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)((InstanceFactory)this.a).a;
        String s = ((gayu)this.b).a();
        ibuq.f(context0, "context");
        return new aytt(context0, s).a();
    }
}

