import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;

public final class aijn extends wby implements IInterface, cjug {
    private final cjts a;

    public aijn() {
        super("com.google.android.gms.auth.authzen.internal.ICryptauthInternalDataService");
    }

    public aijn(cjts cjts0) {
        super("com.google.android.gms.auth.authzen.internal.ICryptauthInternalDataService");
        this.a = cjts0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aijm aijm0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBundleCallback");
                    aijm0 = (iInterface0 instanceof aijm) ? ((aijm)iInterface0) : new aijm(iBinder0);
                }
                AuthzenPublicKey authzenPublicKey0 = (AuthzenPublicKey)wbz.a(parcel0, AuthzenPublicKey.CREATOR);
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                aijn.gr(parcel0);
                aihy aihy0 = new aihy(aijm0, authzenPublicKey0);
                this.a.b(aihy0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBundleCallback");
                    aijm0 = (iInterface1 instanceof aijm) ? ((aijm)iInterface1) : new aijm(iBinder1);
                }
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                aijn.gr(parcel0);
                aihx aihx0 = new aihx(aijm0);
                this.a.b(aihx0);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                    aijm0 = (iInterface2 instanceof aijl) ? ((aijl)iInterface2) : new aijl(iBinder2);
                }
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                wbz.i(parcel0);
                int v1 = parcel0.readInt();
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                aijn.gr(parcel0);
                aihv aihv0 = new aihv(((aijl)aijm0), account0, v1);
                this.a.b(aihv0);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                    aijm0 = (iInterface3 instanceof aijl) ? ((aijl)iInterface3) : new aijl(iBinder3);
                }
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                Bundle bundle3 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                aijn.gr(parcel0);
                aihw aihw0 = new aihw(((aijl)aijm0), account1, v2, v3);
                this.a.b(aihw0);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.authzen.internal.IBooleanCallback");
                    aijm0 = (iInterface4 instanceof aijl) ? ((aijl)iInterface4) : new aijl(iBinder4);
                }
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                boolean z = wbz.i(parcel0);
                Bundle bundle4 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                aijn.gr(parcel0);
                aiht aiht0 = new aiht(((aijl)aijm0), account2, z);
                this.a.b(aiht0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

