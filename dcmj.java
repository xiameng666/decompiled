import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dcmj implements dcnp {
    public final boolean a;
    public final ichm b;

    public dcmj(ichm ichm0, boolean z) {
        this.b = ichm0;
        this.a = z;
    }

    @Override  // dcnp
    public final void e(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        ibuq.c(shareTarget0);
        ibuq.c(transferMetadata0);
        dckw dckw0 = new dckw(shareTarget0, transferMetadata0);
        ichm ichm0 = this.b;
        Object object0 = ichm0.b(dckw0);
        if(!icha.c(object0) && !(object0 instanceof icgy)) {
            throw new IllegalStateException("trySend should always succeed due to unlimited buffer.");
        }
        if(this.a && transferMetadata0.e) {
            ichp.a(ichm0);
        }
    }
}

