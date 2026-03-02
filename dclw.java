import com.google.android.gms.nearby.sharing.SharingChimeraTileService;
import java.util.concurrent.Callable;

public final class dclw implements Callable {
    public final SharingChimeraTileService a;

    public dclw(SharingChimeraTileService sharingChimeraTileService0) {
        this.a = sharingChimeraTileService0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(((aket)this.a.c.mr()).c());
    }
}

