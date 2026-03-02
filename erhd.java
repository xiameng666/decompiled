import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

public abstract class erhd extends wby implements erhe {
    public erhd() {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        erhb erhb0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface0 instanceof erhb) ? ((erhb)iInterface0) : new ergz(iBinder0);
                }
                Account[] arr_account = (Account[])parcel0.createTypedArray(Account.CREATOR);
                erhd.gr(parcel0);
                this.l(erhb0, arr_account);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface1 instanceof erhb) ? ((erhb)iInterface1) : new ergz(iBinder1);
                }
                UserBootstrapInfo[] arr_userBootstrapInfo = (UserBootstrapInfo[])parcel0.createTypedArray(UserBootstrapInfo.CREATOR);
                erhd.gr(parcel0);
                this.k(erhb0, arr_userBootstrapInfo);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface2 instanceof erhb) ? ((erhb)iInterface2) : new ergz(iBinder2);
                }
                Challenge[] arr_challenge = (Challenge[])parcel0.createTypedArray(Challenge.CREATOR);
                boolean z = wbz.i(parcel0);
                erhd.gr(parcel0);
                this.d(erhb0, arr_challenge, z);
                return true;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface3 instanceof erhb) ? ((erhb)iInterface3) : new ergz(iBinder3);
                }
                Assertion[] arr_assertion = (Assertion[])parcel0.createTypedArray(Assertion.CREATOR);
                erhd.gr(parcel0);
                this.h(erhb0, arr_assertion);
                return true;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface4 instanceof erhb) ? ((erhb)iInterface4) : new ergz(iBinder4);
                }
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erhd.gr(parcel0);
                this.m(erhb0, exchangeAssertionsForUserCredentialsRequest0);
                return true;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface5 instanceof erhb) ? ((erhb)iInterface5) : new ergz(iBinder5);
                }
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest1 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erhd.gr(parcel0);
                this.n(erhb0, exchangeAssertionsForUserCredentialsRequest1);
                return true;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface6 instanceof erhb) ? ((erhb)iInterface6) : new ergz(iBinder6);
                }
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erhd.gr(parcel0);
                this.f(erhb0, exchangeAssertionsForUserCredentialsRequest2);
                return true;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface7 instanceof erhb) ? ((erhb)iInterface7) : new ergz(iBinder7);
                }
                boolean z1 = wbz.i(parcel0);
                erhd.gr(parcel0);
                this.p(erhb0, z1);
                return true;
            }
            case 9: {
                this.e();
                return true;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface8 instanceof erhb) ? ((erhb)iInterface8) : new ergz(iBinder8);
                }
                ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0 = (ExchangeSessionCheckpointsForUserCredentialsRequest)wbz.a(parcel0, ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR);
                erhd.gr(parcel0);
                this.g(erhb0, exchangeSessionCheckpointsForUserCredentialsRequest0);
                return true;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface9 instanceof erhb) ? ((erhb)iInterface9) : new ergz(iBinder9);
                }
                Challenge[] arr_challenge1 = (Challenge[])parcel0.createTypedArray(Challenge.CREATOR);
                boolean z2 = wbz.i(parcel0);
                boolean z3 = wbz.i(parcel0);
                erhd.gr(parcel0);
                this.c(erhb0, arr_challenge1, z2, z3);
                return true;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface10 instanceof erhb) ? ((erhb)iInterface10) : new ergz(iBinder10);
                }
                erhd.gr(parcel0);
                this.i(erhb0);
                return true;
            }
            case 13: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface11 instanceof erhb) ? ((erhb)iInterface11) : new ergz(iBinder11);
                }
                int v1 = parcel0.readInt();
                erhd.gr(parcel0);
                this.o(erhb0, v1);
                return true;
            }
            case 14: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
                    erhb0 = (iInterface12 instanceof erhb) ? ((erhb)iInterface12) : new ergz(iBinder12);
                }
                erhd.gr(parcel0);
                this.j(erhb0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

