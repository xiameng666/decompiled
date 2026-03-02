import android.content.pm.PackageManager;
import java.util.List;
import java.util.concurrent.Callable;

public final class bglf implements Callable {
    public final bgln a;
    public final PackageManager b;

    public bglf(bgln bgln0, PackageManager packageManager0) {
        this.a = bgln0;
        this.b = packageManager0;
    }

    @Override
    public final Object call() {
        PackageManager packageManager0 = this.b;
        List list0 = packageManager0.getInstalledApplications(0x80);
        if(list0 == null) {
            return ggna.a;
        }
        gged_interceptors gged0 = ggch.j(list0).i(new bgla(this.a)).l(new bglb(packageManager0)).n();
        ggmo ggmo0 = ggmo.g(String.CASE_INSENSITIVE_ORDER);
        return gged_interceptors.D(new gfze(new bglc(), ggmo0), gged0);
    }
}

