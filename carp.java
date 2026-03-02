import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class carp implements Factory {
    private final Provider a;
    private final Provider b;

    public carp(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)((InstanceFactory)this.a).a;
        icck icck0 = (icck)((InstanceFactory)this.b).a;
        ibuq.f(context0, "applicationContext");
        ibuq.f(icck0, "scope");
        return laq.b(new ldn(((MessageLite)carr.a(((ProtoLiteMessage)carq.a).v_newBuilder()).a())), new lek(new carn()), icck0, new caro(context0), 4);
    }
}

