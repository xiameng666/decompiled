import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class ctmt extends wby implements ctmu {
    final ichm a;

    public ctmt() {
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IDiscoveryCallback");
    }

    public ctmt(ichm ichm0) {
        this.a = ichm0;
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IDiscoveryCallback");
    }

    @Override  // ctmu
    public final void a(List list0) {
        Object object1;
        ibuq.f(list0, "devices");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            IBinder iBinder0 = (IBinder)object0;
            if(iBinder0 == null) {
                object1 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastDevice");
                object1 = (iInterface0 instanceof ctmo) ? ((ctmo)iInterface0) : new ctmm(iBinder0);
            }
            arrayList0.add(object1);
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object2: arrayList0) {
            arrayList1.add(new cthy(((ctmo)object2)));
        }
        Set set0 = ibpo.ay(arrayList1);
        ichd.a(this.a, set0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createBinderArrayList();
            ctmt.gr(parcel0);
            this.a(arrayList0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

