import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

public final class dcct implements Runnable {
    public final dccu a;
    public final ShareTarget b;
    public final AppInstallMetadata c;

    public dcct(dccu dccu0, ShareTarget shareTarget0, AppInstallMetadata appInstallMetadata0) {
        this.a = dccu0;
        this.b = shareTarget0;
        this.c = appInstallMetadata0;
    }

    @Override
    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.b;
        List list0 = nearbySharingChimeraService0.J(new Integer[]{((int)1)});
        if(list0.isEmpty()) {
            list0 = nearbySharingChimeraService0.J(new Integer[]{((int)0)});
        }
        for(Object object0: list0) {
            ((dbzg)object0).a(this.b, this.c);
        }
    }
}

