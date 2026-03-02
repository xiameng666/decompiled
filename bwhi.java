import android.content.Context;
import android.content.IntentSender;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.home.matter.beacon.BeaconData;
import com.google.android.gms.home.matter.commissioning.CommissioningRequest;

public final class bwhi extends azts implements bwhc {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        bboh.b("InternalCommissioningClient", bbcu.fA);
        azss azss0 = new azss();
        bwhi.b = azss0;
        bwhh bwhh0 = new bwhh();
        bwhi.c = bwhh0;
        bwhi.a = new azta_api("CommissioningClient.API", bwhh0, azss0);
    }

    public bwhi(Context context0) {
        super(context0, bwhi.a, azsx.s, aztr_settings.a);
    }

    @Override  // bwhc
    public final evql b(CommissioningRequest commissioningRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bwgm.b};
        azzc0.a = (bwgw bwgw0, evqp evqp0) -> try {
            bwgx bwgx0 = (bwgx)bwgw0.H();
            Parcel parcel0 = bwgx0.jo();
            wbz.f(parcel0, commissioningRequest0);
            Parcel parcel1 = bwgx0.hM(2, parcel0);
            IntentSender intentSender0 = (IntentSender)wbz.a(parcel1, IntentSender.CREATOR);
            parcel1.recycle();
            evqp0.b(intentSender0);
        }
        catch(UnsupportedOperationException unused_ex) {
            evqp0.a(bwhl.a());
        };
        azzc0.d = 31704;
        azzc0.b = false;
        return this.iG(azzc0.a());
    }

    @Override  // bwhc
    public final void c(BeaconData beaconData0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bwgm.d};
        azzc0.a = (bwgw bwgw0, evqp evqp0) -> {
            try {
                bwgx bwgx0 = (bwgx)bwgw0.H();
                Parcel parcel0 = bwgx0.jo();
                wbz.f(parcel0, beaconData0);
                bwgx0.jp(4, parcel0);
            }
            catch(UnsupportedOperationException unused_ex) {
                evqp0.a(bwhl.a());
                return;
            }
            evqp0.b(null);
        };
        azzc0.d = 31706;
        azzc0.b = false;
        this.iG(azzc0.a());
    }

    @Override  // azts, azty
    public final Feature[] gm() {
        return new Feature[]{bwgm.v};
    }
}

