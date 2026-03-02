import com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class alde implements Consumer {
    public final ProtoLiteBuilder a;

    public alde(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        alsw alsw0 = ((RecentAppsManager.AppData)object0).d();
        if(alsw0 != null) {
            this.a.ce(alsw0);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

