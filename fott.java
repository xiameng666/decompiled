import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class fott implements Factory {
    private final Provider a;

    public fott(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return azqk.a(((Context)((InstanceFactory)this.a).a));
    }
}

