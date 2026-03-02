import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.ArrayList;
import java.util.List;

public class eqiv extends wby implements eqiw {
    protected final azvd a;

    protected eqiv(azvd azvd0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
        this.a = azvd0;
    }

    @Override  // eqiw
    public final void a(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public void b(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public void c(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public void d(Status status0, AdvertisingInfo advertisingInfo0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public final void e(Status status0, List list0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public void f(Status status0, ManagedAccountSetupInfo managedAccountSetupInfo0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqiv.gr(parcel0);
                this.c(status0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqiv.gr(parcel0);
                this.h(status1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqiv.gr(parcel0);
                this.b(status2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                String s = parcel0.readString();
                eqiv.gr(parcel0);
                this.g(status3, s);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqiv.gr(parcel0);
                this.i(status4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqiv.gr(parcel0);
                this.a(status5);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                ManagedAccountSetupInfo managedAccountSetupInfo0 = (ManagedAccountSetupInfo)wbz.a(parcel0, ManagedAccountSetupInfo.CREATOR);
                eqiv.gr(parcel0);
                this.f(status6, managedAccountSetupInfo0);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(EsimActivationPayload.CREATOR);
                eqiv.gr(parcel0);
                this.e(status7, arrayList0);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                AdvertisingInfo advertisingInfo0 = (AdvertisingInfo)wbz.a(parcel0, AdvertisingInfo.CREATOR);
                eqiv.gr(parcel0);
                this.d(status8, advertisingInfo0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqiw
    public final void g(Status status0, String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public final void h(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqiw
    public final void i(Status status0) {
        throw new UnsupportedOperationException();
    }
}

