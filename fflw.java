import com.google.android.gms.wearable.internal.PackageStorageInfo;
import j..util.Objects;
import java.util.Comparator;

final class fflw implements Comparator {
    public fflw(ffly ffly0) {
        Objects.requireNonNull(ffly0);
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((PackageStorageInfo)object0).c, ((PackageStorageInfo)object1).c);
        if(v == 0) {
            return 0;
        }
        return v < 0 ? 1 : -1;
    }
}

