import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

final class ffmb implements fceq {
    public static final fceq a;
    private final StorageInfoResponse b;
    private final Status c;

    static {
        ffmb.a = new ffmb(null, Status.d);
    }

    public ffmb(StorageInfoResponse storageInfoResponse0, Status status0) {
        this.b = storageInfoResponse0;
        this.c = status0;
    }

    @Override  // azuj
    public final Status a() {
        return this.c;
    }

    @Override  // fceq
    public final StorageInfoResponse b() {
        return this.b;
    }
}

