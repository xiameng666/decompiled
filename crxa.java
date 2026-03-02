import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;

public final class crxa implements IBinder.DeathRecipient {
    private static final bboh a;
    private final Context b;
    private final String c;
    private AbstractSafeParcelable d;
    private IBinder e;
    private ServiceConnection f;
    private int g;

    static {
        crxa.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crxa(Context context0, String s) {
        this.b = context0;
        this.c = s;
    }

    public final void a() {
        synchronized(this) {
            Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.HANDLE_EVENT");
            intent0.setPackage(this.c);
            this.f = new crwz(this);
            this.b.getClass();
            bbic.a().d(this.b, intent0, this.f, 1);
        }
    }

    public final void b(MdpDataPlanStatusResponse mdpDataPlanStatusResponse0) {
        synchronized(this) {
            this.d = mdpDataPlanStatusResponse0;
            this.g = 1;
            this.a();
        }
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        synchronized(this) {
            IBinder iBinder0 = this.e;
            if(iBinder0 != null) {
                iBinder0.unlinkToDeath(this, 0);
                this.f();
            }
        }
    }

    public final void c(MdpUpsellOfferResponse mdpUpsellOfferResponse0) {
        synchronized(this) {
            this.d = mdpUpsellOfferResponse0;
            this.g = 2;
            this.a();
        }
    }

    public final void d() {
        synchronized(this) {
            if(this.f != null) {
                bbic.a().b(this.b, this.f);
                this.f = null;
            }
        }
    }

    public final void e(IBinder iBinder0) {
        crxf crxf0;
        synchronized(this) {
            try {
                this.e = iBinder0;
                iBinder0.linkToDeath(this, 0);
            }
            catch(RemoteException remoteException0) {
                a.ae(crxa.a.j(), "Unable to link to event service death", remoteException0);
            }
        }
        if(iBinder0 == null) {
            crxf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IEventCallbacks");
            crxf0 = (iInterface0 instanceof crxf) ? ((crxf)iInterface0) : new crxf(iBinder0);
        }
        try {
            switch(this.g) {
                case 0: {
                    throw null;
                }
                case 1: {
                    MdpDataPlanStatusResponse mdpDataPlanStatusResponse0 = (MdpDataPlanStatusResponse)this.d;
                    ApiMetadata apiMetadata1 = cckf.d(bbdp.dm);
                    Parcel parcel1 = crxf0.jo();
                    wbz.f(parcel1, Status.b);
                    wbz.f(parcel1, mdpDataPlanStatusResponse0);
                    wbz.f(parcel1, apiMetadata1);
                    crxf0.jq(1, parcel1);
                    break;
                }
                default: {
                    MdpUpsellOfferResponse mdpUpsellOfferResponse0 = (MdpUpsellOfferResponse)this.d;
                    ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
                    Parcel parcel0 = crxf0.jo();
                    wbz.f(parcel0, Status.b);
                    wbz.f(parcel0, mdpUpsellOfferResponse0);
                    wbz.f(parcel0, apiMetadata0);
                    crxf0.jq(2, parcel0);
                }
            }
        }
        catch(RemoteException remoteException1) {
            a.ae(crxa.a.i(), "Could not send event", remoteException1);
        }
        this.d();
    }

    public final void f() {
        synchronized(this) {
            this.e = null;
            this.f = null;
        }
    }
}

