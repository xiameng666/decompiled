import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

public class erha extends wby implements erhb {
    protected final azvd a;

    protected erha(azvd azvd0) {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
        this.a = azvd0;
    }

    @Override  // erhb
    public void a(Status status0, Assertion[] arr_assertion) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public final void b(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void c(Status status0, UserCredential[] arr_userCredential, String s, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void d(Status status0, UserCredential[] arr_userCredential) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void e(Status status0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void f(Status status0, BootstrapAccount[] arr_bootstrapAccount) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                UserBootstrapInfo[] arr_userBootstrapInfo = (UserBootstrapInfo[])parcel0.createTypedArray(UserBootstrapInfo.CREATOR);
                erha.gr(parcel0);
                this.i(status0, arr_userBootstrapInfo);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                Challenge[] arr_challenge = (Challenge[])parcel0.createTypedArray(Challenge.CREATOR);
                erha.gr(parcel0);
                this.h(status1, arr_challenge);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                Assertion[] arr_assertion = (Assertion[])parcel0.createTypedArray(Assertion.CREATOR);
                erha.gr(parcel0);
                this.a(status2, arr_assertion);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erha.gr(parcel0);
                this.e(status3, exchangeAssertionsForUserCredentialsRequest0);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest1 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erha.gr(parcel0);
                this.j(status4, exchangeAssertionsForUserCredentialsRequest1);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest)wbz.a(parcel0, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                erha.gr(parcel0);
                this.k(status5, exchangeAssertionsForUserCredentialsRequest2);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                UserCredential[] arr_userCredential = (UserCredential[])parcel0.createTypedArray(UserCredential.CREATOR);
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                erha.gr(parcel0);
                this.c(status6, arr_userCredential, s, s1);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                erha.gr(parcel0);
                throw new UnsupportedOperationException();
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                erha.gr(parcel0);
                this.b(status8);
                return true;
            }
            case 10: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                UserCredential[] arr_userCredential1 = (UserCredential[])parcel0.createTypedArray(UserCredential.CREATOR);
                erha.gr(parcel0);
                this.d(status9, arr_userCredential1);
                return true;
            }
            case 11: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                BootstrapAccount[] arr_bootstrapAccount = (BootstrapAccount[])parcel0.createTypedArray(BootstrapAccount.CREATOR);
                erha.gr(parcel0);
                this.f(status10, arr_bootstrapAccount);
                return true;
            }
            case 12: {
                Status status11 = (Status)wbz.a(parcel0, Status.CREATOR);
                erha.gr(parcel0);
                this.l(status11);
                return true;
            }
            case 13: {
                Status status12 = (Status)wbz.a(parcel0, Status.CREATOR);
                long v1 = parcel0.readLong();
                erha.gr(parcel0);
                this.g(status12, v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // erhb
    public void g(Status status0, long v) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void h(Status status0, Challenge[] arr_challenge) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void i(Status status0, UserBootstrapInfo[] arr_userBootstrapInfo) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void j(Status status0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void k(Status status0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erhb
    public void l(Status status0) {
        throw new UnsupportedOperationException();
    }
}

