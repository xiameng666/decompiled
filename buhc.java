import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.googleone.StorageQuotaInfoRequest;

public final class buhc implements azys {
    public final buhf a;
    public final StorageQuotaInfoRequest b;

    public buhc(buhf buhf0, StorageQuotaInfoRequest storageQuotaInfoRequest0) {
        this.a = buhf0;
        this.b = storageQuotaInfoRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bugv bugv0 = (bugv)object0;
        buha buha0 = new buha(this.a, ((evqp)object1));
        bugy bugy0 = (bugy)bugv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bugv0.r);
        bugy0.b(buha0, this.b, apiMetadata0);
    }
}

