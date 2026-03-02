import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import j..util.Objects;

final class fdgn extends fdix {
    final fdgo a;

    public fdgn(fdgo fdgo0) {
        Objects.requireNonNull(fdgo0);
        this.a = fdgo0;
        super();
    }

    @Override  // fdix
    public final void c(StorageInfoResponse storageInfoResponse0) {
        fdgw fdgw0 = new fdgw(new Status(storageInfoResponse0.a), storageInfoResponse0);
        this.a.n(fdgw0);
    }
}

