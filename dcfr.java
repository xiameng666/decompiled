import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.concurrent.Callable;

public final class dcfr implements Callable {
    public final NearbySharingChimeraService a;

    public dcfr(NearbySharingChimeraService nearbySharingChimeraService0) {
        this.a = nearbySharingChimeraService0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a;
        if(cjpd.i(((cjpc)nearbySharingChimeraService0.al.get()), "contacts_upload_consent_accepted", false)) {
            return (int)35500;
        }
        cjpa cjpa0 = ((cjpc)nearbySharingChimeraService0.al.get()).c();
        cjpa0.e("contacts_upload_consent_accepted", true);
        cjpd.g(cjpa0);
        nearbySharingChimeraService0.N();
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        dcpu0.a = 18;
        nearbySharingChimeraService0.Q(new dcpv(dcpu0));
        nearbySharingChimeraService0.Y();
        dcvz.a.b().p("NearbySharing has contacts upload consent", new Object[0]);
        return (int)0;
    }
}

