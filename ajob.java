import android.os.Bundle;
import android.os.IInterface;
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

public interface ajob extends IInterface {
    Bundle a(String arg1);

    AccountRemovalResponse b(AccountRemovalRequest arg1);

    CheckFactoryResetPolicyComplianceResponse c(CheckFactoryResetPolicyComplianceRequest arg1);

    GetAndAdvanceOtpCounterResponse d(String arg1);

    TokenResponse e(ConfirmCredentialsRequest arg1);

    TokenResponse f(TokenRequest arg1);

    TokenResponse g(AccountSignInRequest arg1);

    TokenResponse h(UpdateCredentialsRequest arg1);

    ValidateAccountCredentialsResponse i(AccountCredentials arg1);

    String j(String arg1);

    void k();

    boolean l(String arg1, Bundle arg2);

    boolean m(String arg1);
}

