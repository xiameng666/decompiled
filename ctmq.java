import android.os.Parcel;
import com.google.android.gms.multidevice.sync.appcast.service.aidl.AppMetadata;
import java.util.ArrayList;
import java.util.List;

public final class ctmq extends wby implements ctmr {
    final ichm a;

    public ctmq() {
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppListCallback");
    }

    public ctmq(ichm ichm0) {
        this.a = ichm0;
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppListCallback");
    }

    @Override  // ctmr
    public final void a(List list0) {
        ibuq.f(list0, "metadata");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            ctzq ctzq0 = ctzp.a(((ProtoLiteMessage)ctza.a).v_newBuilder());
            ctzq0.b(((AppMetadata)object0).a);
            ctzq0.c(((AppMetadata)object0).b);
            arrayList0.add(ctzq0.a());
        }
        ichd.a(this.a, arrayList0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(AppMetadata.CREATOR);
            ctmq.gr(parcel0);
            this.a(arrayList0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

