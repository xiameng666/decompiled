import j..util.Objects;
import java.util.function.Consumer;

final class eqre implements gmbg {
    final Consumer a;

    public eqre(eqrf eqrf0, Consumer consumer0) {
        this.a = consumer0;
        Objects.requireNonNull(eqrf0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eqrf.a.m("Failed to read rpcAttempts from dataStore", new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(object0 != null) {
            this.a.accept(object0);
        }
    }
}

