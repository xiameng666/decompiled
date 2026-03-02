import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Comparator;
import java.util.Map;

public final class dcih implements Comparator {
    public final Map a;

    public dcih(Map map0) {
        this.a = map0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        TransferMetadata transferMetadata0 = (TransferMetadata)this.a.get(((ShareTarget)object0));
        TransferMetadata transferMetadata1 = (TransferMetadata)this.a.get(((ShareTarget)object1));
        if(transferMetadata0 == null) {
            dcvz.a.e().h("There is no TransferMetadata for the share target %s when calling SharingClient#getShareTargets()", ((ShareTarget)object0));
            return 1;
        }
        if(transferMetadata1 == null) {
            dcvz.a.e().h("There is no TransferMetadata for the share target %s when calling SharingClient#getShareTargets()", ((ShareTarget)object1));
            return -1;
        }
        return Integer.compare(transferMetadata0.g, transferMetadata1.g);
    }
}

