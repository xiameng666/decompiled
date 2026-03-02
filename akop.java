import android.content.BroadcastReceiver;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallViewModel.PackageInstallSession.2;
import j..util.Objects;
import java.util.function.Consumer;

public final class akop {
    public String a;
    public Consumer b;
    public boolean c;
    public final Handler d;
    public final akok e;
    public final ServiceConnection f;
    public final BroadcastReceiver g;
    final akou h;
    public yxh i;

    public akop(akou akou0) {
        Objects.requireNonNull(akou0);
        this.h = akou0;
        super();
        clht clht0 = new clht();
        this.d = clht0;
        this.e = new akok(new lqi(((int)-4)), clht0);
        this.f = new akoo(this);
        this.g = new PhoneskyDpcInstallViewModel.PackageInstallSession.2(this);
    }
}

