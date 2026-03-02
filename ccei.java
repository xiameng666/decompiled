import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.ExampleConsumption;
import com.google.android.gms.learning.InAppTrainerOptions;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ccei extends wby implements ccej {
    final cbzb a;

    public ccei() {
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    public ccei(cbzb cbzb0) {
        Objects.requireNonNull(cbzb0);
        this.a = cbzb0;
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    @Override  // ccej
    public final int a() {
        return 1;
    }

    @Override  // ccej
    public final void b(InAppTrainerOptions inAppTrainerOptions0, boolean z, List list0, azxs azxs0) {
        cbzi cbzi0 = new cbzi(azxs0);
        this.a.a(z, list0, cbzi0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs0;
        switch(v) {
            case 2: {
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 3: {
                InAppTrainerOptions inAppTrainerOptions0 = (InAppTrainerOptions)wbz.a(parcel0, InAppTrainerOptions.CREATOR);
                boolean z = wbz.i(parcel0);
                ArrayList arrayList0 = parcel0.createTypedArrayList(ExampleConsumption.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                ccei.gr(parcel0);
                this.b(inAppTrainerOptions0, z, arrayList0, azxs0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

