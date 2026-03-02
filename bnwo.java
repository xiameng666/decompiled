import java.util.List;
import java.util.concurrent.Executor;

final class bnwo {
    public static final bboh a;
    public final bnvk b;
    public final Executor c;

    static {
        bnwo.a = bboh.b("KeychainDomainRetriever", bbcu.eD);
    }

    public bnwo(Executor executor0, bnvk bnvk0) {
        this.b = bnvk0;
        this.c = executor0;
    }

    public static final void a(List list0) {
        if(!list0.isEmpty()) {
            return;
        }
        throw new IllegalStateException("getKeyMaterial() returned an empty list");
    }
}

