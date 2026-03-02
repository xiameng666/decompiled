import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.ExecutorService;

public final class foey implements Factory {
    private final Provider a;
    private final Provider b;

    public foey(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        ExecutorService executorService0 = (ExecutorService)this.a.get();
        fkvs fkvs0 = (fkvs)this.b.get();
        foew foew0 = new foew();
        foew0.b = fkvs0;
        foew0.a = executorService0;
        return foew0.a();
    }
}

