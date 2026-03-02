import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

public abstract class epud extends wby implements epue {
    public epud() {
        super("com.google.android.gms.signin.internal.ISignInService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        epub epub0 = null;
        switch(v) {
            case 2: {
                AuthAccountRequest authAccountRequest0 = (AuthAccountRequest)wbz.a(parcel0, AuthAccountRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface0 instanceof epub) ? ((epub)iInterface0) : new eptz(iBinder0);
                }
                epud.gr(parcel0);
                this.a(authAccountRequest0, epub0);
                break;
            }
            case 3: {
                CheckServerAuthResult checkServerAuthResult0 = (CheckServerAuthResult)wbz.a(parcel0, CheckServerAuthResult.CREATOR);
                epud.gr(parcel0);
                this.k();
                break;
            }
            case 4: {
                wbz.i(parcel0);
                epud.gr(parcel0);
                this.l();
                break;
            }
            case 5: {
                ResolveAccountRequest resolveAccountRequest0 = (ResolveAccountRequest)wbz.a(parcel0, ResolveAccountRequest.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    epub0 = (iInterface1 instanceof basq) ? ((basq)iInterface1) : new baso(iBinder1);
                }
                epud.gr(parcel0);
                this.f(resolveAccountRequest0, ((basq)epub0));
                break;
            }
            case 7: {
                int v1 = parcel0.readInt();
                epud.gr(parcel0);
                this.b(v1);
                break;
            }
            case 8: {
                int v2 = parcel0.readInt();
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface2 instanceof epub) ? ((epub)iInterface2) : new eptz(iBinder2);
                }
                epud.gr(parcel0);
                this.g(v2, account0, epub0);
                break;
            }
            case 9: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    epub0 = (iInterface3 instanceof bary) ? ((bary)iInterface3) : new barw(iBinder3);
                }
                int v3 = parcel0.readInt();
                boolean z = wbz.i(parcel0);
                epud.gr(parcel0);
                this.h(((bary)epub0), v3, z);
                break;
            }
            case 10: {
                RecordConsentRequest recordConsentRequest0 = (RecordConsentRequest)wbz.a(parcel0, RecordConsentRequest.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface4 instanceof epub) ? ((epub)iInterface4) : new eptz(iBinder4);
                }
                epud.gr(parcel0);
                this.d(recordConsentRequest0, epub0);
                break;
            }
            case 11: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface5 instanceof epub) ? ((epub)iInterface5) : new eptz(iBinder5);
                }
                epud.gr(parcel0);
                this.c(epub0);
                break;
            }
            case 12: {
                SignInRequest signInRequest0 = (SignInRequest)wbz.a(parcel0, SignInRequest.CREATOR);
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface6 instanceof epub) ? ((epub)iInterface6) : new eptz(iBinder6);
                }
                epud.gr(parcel0);
                this.j(signInRequest0, epub0);
                break;
            }
            case 13: {
                boolean z1 = wbz.i(parcel0);
                epud.gr(parcel0);
                this.i(z1);
                break;
            }
            case 14: {
                RecordConsentByConsentResultRequest recordConsentByConsentResultRequest0 = (RecordConsentByConsentResultRequest)wbz.a(parcel0, RecordConsentByConsentResultRequest.CREATOR);
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    epub0 = (iInterface7 instanceof epub) ? ((epub)iInterface7) : new eptz(iBinder7);
                }
                epud.gr(parcel0);
                this.e(recordConsentByConsentResultRequest0, epub0);
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

