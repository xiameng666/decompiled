import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mobiledataplan.esim.CarrierEuiccProvisioningChimeraService;
import j..util.Objects;

public final class aw extends wby implements ax {
    final CarrierEuiccProvisioningChimeraService a;

    public aw() {
        super("android.service.euicc.ICarrierEuiccProvisioningService");
    }

    public aw(CarrierEuiccProvisioningChimeraService carrierEuiccProvisioningChimeraService0) {
        Objects.requireNonNull(carrierEuiccProvisioningChimeraService0);
        this.a = carrierEuiccProvisioningChimeraService0;
        super("android.service.euicc.ICarrierEuiccProvisioningService");
    }

    @Override  // ax
    public final void a(String s) {
        this.a.b = s;
    }

    public final void c(ay ay0) {
        CarrierEuiccProvisioningChimeraService carrierEuiccProvisioningChimeraService0 = this.a;
        if(carrierEuiccProvisioningChimeraService0.b.isEmpty()) {
            try {
                Parcel parcel0 = ay0.jo();
                wbz.f(parcel0, ApiMetadata.b);
                ay0.jq(2, parcel0);
            }
            catch(RemoteException remoteException0) {
                a.e(CarrierEuiccProvisioningChimeraService.a.j(), "%s: eSIM RemoteException from LPA", "CarrierEuiccProvisioningService", remoteException0);
            }
            return;
        }
        try {
            String s = carrierEuiccProvisioningChimeraService0.b;
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
            Parcel parcel1 = ay0.jo();
            parcel1.writeString(s);
            wbz.f(parcel1, apiMetadata0);
            ay0.jq(1, parcel1);
        }
        catch(RemoteException remoteException1) {
            a.e(CarrierEuiccProvisioningChimeraService.a.j(), "%s: eSIM RemoteException from LPA", "CarrierEuiccProvisioningService", remoteException1);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ay ay0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("android.service.euicc.IGetActivationCodeCallback");
                    ay0 = (iInterface0 instanceof ay) ? ((ay)iInterface0) : new ay(iBinder0);
                }
                aw.gr(parcel0);
                this.c(ay0);
                return true;
            }
            case 2: {
                parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("android.service.euicc.IGetActivationCodeCallback");
                    ay0 = (iInterface1 instanceof ay) ? ((ay)iInterface1) : new ay(iBinder1);
                }
                aw.gr(parcel0);
                this.c(ay0);
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                aw.gr(parcel0);
                this.a(s);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

