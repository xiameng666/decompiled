import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dMigrateHelperChimeraService;
import com.google.android.gms.backup.migrate.helper.ParcelableBrokerRequest;
import com.google.android.gms.backup.migrate.helper.ParcelableBrokerResponse;
import j..util.Objects;

public final class asdk extends wby implements IInterface {
    final D2dMigrateHelperChimeraService a;

    public asdk() {
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBroker");
    }

    public asdk(D2dMigrateHelperChimeraService d2dMigrateHelperChimeraService0) {
        Objects.requireNonNull(d2dMigrateHelperChimeraService0);
        this.a = d2dMigrateHelperChimeraService0;
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBroker");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        asdl asdl0;
        if(v == 1) {
            ParcelableBrokerRequest parcelableBrokerRequest0 = (ParcelableBrokerRequest)wbz.a(parcel0, ParcelableBrokerRequest.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                asdl0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBrokerCallbacks");
                asdl0 = (iInterface0 instanceof asdl) ? ((asdl)iInterface0) : new asdl(iBinder0);
            }
            asdk.gr(parcel0);
            ccmq.a().a(bbdg.mi);
            D2dMigrateHelperChimeraService.a.j("ID2dMigrateHelperBroker.requestD2dMigrateHelper() was called.", new Object[0]);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asdf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((asdf)hftv0).b = 1;
            try {
                hfur hfur1 = parcelableBrokerRequest0.b;
                if(hfur1 != null) {
                    throw hfur1;
                }
            }
            catch(hfur hfur0) {
                D2dMigrateHelperChimeraService.a.g("Unable to parse broker request request.", hfur0, new Object[0]);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((asdf)hftp0.b_message).c = 1;
                asdl0.a(new ParcelableBrokerResponse(((asdf)hftp0.N_build())), null);
                return true;
            }
            if(parcelableBrokerRequest0.a.b != 1) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((asdf)hftp0.b_message).c = 2;
                asdl0.a(new ParcelableBrokerResponse(((asdf)hftp0.N_build())), null);
                return true;
            }
            try {
                String s = asdb.a(this.a);
                bbmq.M(this.a, s);
                azql.c(this.a).d(s);
            }
            catch(SecurityException securityException0) {
                D2dMigrateHelperChimeraService.a.g("Client failed security check.", securityException0, new Object[0]);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((asdf)hftp0.b_message).c = 3;
                asdl0.a(new ParcelableBrokerResponse(((asdf)hftp0.N_build())), null);
                return true;
            }
            D2dMigrateHelperChimeraService.a.j("Broker checks passed.", new Object[0]);
            asdl0.a(new ParcelableBrokerResponse(((asdf)hftp0.N_build())), new areg(this.a));
            return true;
        }
        return false;
    }
}

