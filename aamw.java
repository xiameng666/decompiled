import android.content.Intent;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class aamw implements Factory {
    private final Provider a;

    public aamw(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        zfz.a();
        Intent intent0 = (Intent)((InstanceFactory)this.a).a;
        ibuq.f(intent0, "intent");
        grxy grxy0 = grxx.a(((grxu)((ProtoLiteMessage)grxw.a).v_newBuilder()));
        grxy0.b(intent0.getIntExtra("extra.screenId", 1));
        grxy0.d();
        grxy0.c(aaur.a(intent0));
        Object object0 = grxy0.a();
        Preconditions.f(object0);
        return object0;
    }
}

