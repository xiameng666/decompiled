import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.googleone.StorageManagementIntentRequest;
import com.google.android.gms.googleone.StorageQuotaInfoRequest;
import java.util.concurrent.CopyOnWriteArrayList;

public final class buhf extends azts implements buav {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        buhf.c = azss0;
        buhe buhe0 = new buhe();
        buhf.d = buhe0;
        buhf.b = new azta_api("Googleone.API", buhe0, azss0);
        new CopyOnWriteArrayList();
    }

    public buhf(Context context0) {
        super(context0, buhf.b, azsx.s, aztr_settings.a);
    }

    @Override  // buav
    public final evql b(StorageManagementIntentRequest storageManagementIntentRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{buau.b};
        azzc0.d = 37204;
        azzc0.a = new buhd(storageManagementIntentRequest0);
        return this.iG(azzc0.a());
    }

    @Override  // buav
    public final evql c(StorageQuotaInfoRequest storageQuotaInfoRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{buau.c};
        azzc0.d = 37205;
        azzc0.a = new buhc(this, storageQuotaInfoRequest0);
        return this.iG(azzc0.a());
    }
}

