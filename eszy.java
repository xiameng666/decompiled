import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CheckContactlessEligibilityResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
import com.google.android.gms.tapandpay.firstparty.GetContactlessSetupStatusResponse;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;
import com.google.android.gms.tapandpay.firstparty.GetLastAttestationResultResponse;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.GetPendingPushProvisioningTokenResponse;
import com.google.android.gms.tapandpay.firstparty.GetPollingFrameHandlerStateResponse;
import com.google.android.gms.tapandpay.firstparty.GetSeChipTransactionsResponse;
import com.google.android.gms.tapandpay.firstparty.GetSecurityParamsResponse;
import com.google.android.gms.tapandpay.firstparty.GetTapAndPaySettingsResponse;
import com.google.android.gms.tapandpay.firstparty.IsDeviceRecentlyUnlockedResponse;
import com.google.android.gms.tapandpay.firstparty.RefreshSeCardsResponse;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;

public interface eszy extends IInterface {
    void A(Status arg1, RetrieveInAppPaymentCredentialResponse arg2);

    void B(Status arg1);

    void C(Status arg1, IsDeviceRecentlyUnlockedResponse arg2);

    void D(Status arg1, boolean arg2);

    void E(Status arg1, boolean arg2);

    void F(Status arg1, boolean arg2);

    void G(Status arg1, GetLastAttestationResultResponse arg2);

    void H(Status arg1, String arg2);

    void I(Status arg1, TokenInfo[] arg2);

    void J(Status arg1, GetNotificationSettingsResponse arg2);

    void K(Status arg1);

    void L(Status arg1, String arg2);

    void M(Status arg1);

    void N(Status arg1, Intent arg2);

    void O(Status arg1);

    void P(Status arg1);

    void Q(Status arg1, GetPendingPushProvisioningTokenResponse arg2);

    void R(Status arg1, GetPollingFrameHandlerStateResponse arg2);

    void S(Status arg1, byte[] arg2);

    void T(Status arg1, PushProvisionSessionContext arg2);

    void U(Status arg1, QuickAccessWalletConfig arg2);

    void V(Status arg1);

    void W(Status arg1, boolean arg2);

    void X(Status arg1);

    void Y(Status arg1, RefreshSeCardsResponse arg2);

    void Z(Status arg1, GetSeChipTransactionsResponse arg2);

    void a();

    void aa(Status arg1, GetSecurityParamsResponse arg2);

    void ab(Status arg1);

    void ac(Status arg1);

    void ad(Status arg1, String arg2);

    void ae(Status arg1, GetTapAndPaySettingsResponse arg2);

    void af(Status arg1);

    void ag(Status arg1);

    void ah(Status arg1);

    void ai(Status arg1, TokenStatus arg2);

    void aj(Status arg1, boolean arg2);

    void ak(Status arg1);

    void b(Status arg1, GetActiveAccountResponse arg2);

    void c(Status arg1);

    void d(Status arg1);

    void e(Status arg1, GetActiveCardsForAccountResponse arg2);

    void f(Status arg1, String arg2);

    void g(Status arg1, ReachableDeviceWalletInfo[] arg2);

    void h(Status arg1, GetAllCardsResponse arg2);

    void i(Status arg1, GetAvailableOtherPaymentMethodsResponse arg2);

    void j(Status arg1, boolean arg2);

    void k(Status arg1, CheckContactlessEligibilityResponse arg2);

    void l(Status arg1, GetContactlessSetupStatusResponse arg2);

    void m(Status arg1, boolean arg2);

    void n(Status arg1, boolean arg2);

    void o(Status arg1);

    void p(Status arg1, String arg2);

    void q(Status arg1, GetFelicaTosAcceptanceResponse arg2);

    void v(Status arg1);

    void w(Status arg1, GetGlobalActionCardsResponse arg2);

    void x(Status arg1, Bundle arg2);

    void y(Status arg1, boolean arg2);

    void z(Status arg1, boolean arg2);
}

