import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

public final class ajnz extends wbx implements ajob {
    public ajnz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
    }

    @Override  // ajob
    public final Bundle a(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(16, parcel0);
        Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // ajob
    public final AccountRemovalResponse b(AccountRemovalRequest accountRemovalRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, accountRemovalRequest0);
        Parcel parcel1 = this.hM(20, parcel0);
        AccountRemovalResponse accountRemovalResponse0 = (AccountRemovalResponse)wbz.a(parcel1, AccountRemovalResponse.CREATOR);
        parcel1.recycle();
        return accountRemovalResponse0;
    }

    @Override  // ajob
    public final CheckFactoryResetPolicyComplianceResponse c(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, checkFactoryResetPolicyComplianceRequest0);
        Parcel parcel1 = this.hM(27, parcel0);
        CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponse0 = (CheckFactoryResetPolicyComplianceResponse)wbz.a(parcel1, CheckFactoryResetPolicyComplianceResponse.CREATOR);
        parcel1.recycle();
        return checkFactoryResetPolicyComplianceResponse0;
    }

    @Override  // ajob
    public final GetAndAdvanceOtpCounterResponse d(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(37, parcel0);
        GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounterResponse0 = (GetAndAdvanceOtpCounterResponse)wbz.a(parcel1, GetAndAdvanceOtpCounterResponse.CREATOR);
        parcel1.recycle();
        return getAndAdvanceOtpCounterResponse0;
    }

    @Override  // ajob
    public final TokenResponse e(ConfirmCredentialsRequest confirmCredentialsRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, confirmCredentialsRequest0);
        Parcel parcel1 = this.hM(10, parcel0);
        TokenResponse tokenResponse0 = (TokenResponse)wbz.a(parcel1, TokenResponse.CREATOR);
        parcel1.recycle();
        return tokenResponse0;
    }

    @Override  // ajob
    public final TokenResponse f(TokenRequest tokenRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, tokenRequest0);
        Parcel parcel1 = this.hM(8, parcel0);
        TokenResponse tokenResponse0 = (TokenResponse)wbz.a(parcel1, TokenResponse.CREATOR);
        parcel1.recycle();
        return tokenResponse0;
    }

    @Override  // ajob
    public final TokenResponse g(AccountSignInRequest accountSignInRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, accountSignInRequest0);
        Parcel parcel1 = this.hM(9, parcel0);
        TokenResponse tokenResponse0 = (TokenResponse)wbz.a(parcel1, TokenResponse.CREATOR);
        parcel1.recycle();
        return tokenResponse0;
    }

    @Override  // ajob
    public final TokenResponse h(UpdateCredentialsRequest updateCredentialsRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, updateCredentialsRequest0);
        Parcel parcel1 = this.hM(11, parcel0);
        TokenResponse tokenResponse0 = (TokenResponse)wbz.a(parcel1, TokenResponse.CREATOR);
        parcel1.recycle();
        return tokenResponse0;
    }

    @Override  // ajob
    public final ValidateAccountCredentialsResponse i(AccountCredentials accountCredentials0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, accountCredentials0);
        Parcel parcel1 = this.hM(36, parcel0);
        ValidateAccountCredentialsResponse validateAccountCredentialsResponse0 = (ValidateAccountCredentialsResponse)wbz.a(parcel1, ValidateAccountCredentialsResponse.CREATOR);
        parcel1.recycle();
        return validateAccountCredentialsResponse0;
    }

    @Override  // ajob
    public final String j(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(38, parcel0);
        String s1 = parcel1.readString();
        parcel1.recycle();
        return s1;
    }

    @Override  // ajob
    public final void k() {
        this.jp(29, this.jo());
    }

    @Override  // ajob
    public final boolean l(String s, Bundle bundle0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        wbz.f(parcel0, bundle0);
        Parcel parcel1 = this.hM(17, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // ajob
    public final boolean m(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(39, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }
}

