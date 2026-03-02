import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class aknl implements Consumer {
    public final PhoneskyDpcInstallChimeraActivity a;
    public final ryw b;

    public aknl(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0, ryw ryw0) {
        this.a = phoneskyDpcInstallChimeraActivity0;
        this.b = ryw0;
    }

    @Override
    public final void accept(Object object0) {
        akrp akrp0 = (akrp)object0;
        akid akid0 = new akid(this.a.k, akrp0);
        sci sci0 = new sci(akrp0);
        this.b.a(akid0, sci0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

