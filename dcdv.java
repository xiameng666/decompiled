import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDownloadsDirectoryParams;
import j..util.Objects;
import java.util.concurrent.Callable;

public final class dcdv implements Callable {
    public final dchp a;
    public final SetDownloadsDirectoryParams b;

    public dcdv(dchp dchp0, SetDownloadsDirectoryParams setDownloadsDirectoryParams0) {
        this.a = dchp0;
        this.b = setDownloadsDirectoryParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        String s = this.b.a;
        if(Objects.equals(s, ((dfsk)nearbySharingChimeraService0.d.get()).i())) {
            return (int)35500;
        }
        dcvz.a.b().h("The download directory has been changed to %s", s);
        ((dfsk)nearbySharingChimeraService0.d.get()).A(s);
        if(hvqz.z()) {
            gged_interceptors gged0 = nearbySharingChimeraService0.z();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((dftm)gged0.get(v1)).t(s);
            }
        }
        nearbySharingChimeraService0.N();
        return (int)0;
    }
}

