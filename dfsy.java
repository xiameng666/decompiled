import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.function.BiConsumer;

final class dfsy extends ibuo implements ibtw {
    public dfsy(Object object0) {
        super(2, object0, BiConsumer.class, "accept", "accept(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ShareTarget shareTarget0 = (ShareTarget)object0;
        TransferMetadata transferMetadata0 = (TransferMetadata)object1;
        ibuq.f(shareTarget0, "p0");
        ibuq.f(transferMetadata0, "p1");
        ((BiConsumer)this.e).accept(shareTarget0, transferMetadata0);
        return ibom.a;
    }
}

