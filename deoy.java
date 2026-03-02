import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class deoy implements ibts {
    public final ShareTarget a;
    public final dffz b;
    public final TransferMetadata c;

    public deoy(ShareTarget shareTarget0, dffz dffz0, TransferMetadata transferMetadata0) {
        this.a = shareTarget0;
        this.b = dffz0;
        this.c = transferMetadata0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dffg dffg0 = (dffg)object0;
        ibuq.e(this.c.t, "getAttachmentPreviews(...)");
        return devq.d(this.a, this.b, false, this.c.t, 2);
    }
}

