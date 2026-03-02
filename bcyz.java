import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class bcyz implements Factory {
    private final Provider a;

    public bcyz(Provider provider0) {
        this.a = provider0;
    }

    public final String a() {
        bczb bczb0 = (bczb)this.a.get();
        ibuq.f(bczb0, "accountNameStore");
        String s = bczb0.a;
        if(s == null) {
            ibuq.j("accountName");
            s = null;
        }
        Preconditions.f(s);
        return s;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

