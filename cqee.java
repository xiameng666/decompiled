import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j..time.Instant;

public final class cqee extends azts implements cpzn {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        cqee.c = azss0;
        cqed cqed0 = new cqed();
        cqee.d = cqed0;
        cqee.b = new azta_api("MdiSync.API", cqed0, azss0);
    }

    public cqee(Context context0, cpzo cpzo0) {
        super(context0, cqee.b, cpzo0, aztr_settings.a);
    }

    public final evql e(int v, byte[] arr_b, SyncOptions syncOptions0, CallerInfo callerInfo0, boolean z, int v1) {
        Feature[] arr_feature;
        cpzo cpzo0 = (cpzo)this.z;
        SyncRequest syncRequest0 = new SyncRequest(v, arr_b, syncOptions0, Instant.now().toEpochMilli());
        azzc azzc0 = new azzc();
        azzc0.a = new cqec(z, syncRequest0, callerInfo0);
        switch(syncRequest0.a.ordinal()) {
            case 1: 
            case 2: 
            case 3: {
                arr_feature = new Feature[]{cpzm.b};
                break;
            }
            case 4: {
                arr_feature = new Feature[]{cpzm.a};
                break;
            }
            default: {
                arr_feature = new Feature[0];
            }
        }
        azzc0.c = arr_feature;
        azzc0.d = v1;
        return this.iG(azzc0.a());
    }
}

