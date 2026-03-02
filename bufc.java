import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bufc implements Factory {
    private final Provider a;

    public bufc(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        buff buff0 = (buff)this.a.get();
        ibuq.f(buff0, "lastEligibleStorageCardDataStoreProvider");
        ldn ldn0 = new ldn(((MessageLite)buck.a(((ProtoLiteMessage)bucj.a).v_newBuilder()).a()));
        lek lek0 = new lek(new bufe());
        bufd bufd0 = new bufd(buff0);
        return new buez(laq.b(ldn0, lek0, buff0.b, bufd0, 4));
    }
}

