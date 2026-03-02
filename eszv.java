import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CheckContactlessEligibilityRequest;
import com.google.android.gms.tapandpay.firstparty.GetCobadgedShowPaymentNetworkToggleRequest;
import com.google.android.gms.tapandpay.firstparty.GetOverridePaymentNetworkRequest;
import com.google.android.gms.tapandpay.firstparty.GetParentalConsentIntentRequest;
import com.google.android.gms.tapandpay.firstparty.IsDeviceRecentlyUnlockedRequest;
import com.google.android.gms.tapandpay.firstparty.RegisterServiceListenerRequest;
import com.google.android.gms.tapandpay.firstparty.ReportUnlockRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.SendPollingFrameHandlerEventRequest;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.SetOverridePaymentNetworkRequest;
import com.google.android.gms.tapandpay.firstparty.SetReceivesIneligibleCardNotificationRequest;
import com.google.android.gms.tapandpay.firstparty.SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import com.google.android.gms.tapandpay.firstparty.UnifiedTokenizationRequest;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DeleteTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DisableSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAvailableOtherPaymentMethodsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetFelicaTosAcceptanceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetLastAttestationResultRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetSeChipTransactionsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetTapAndPaySettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetTokenDetailsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.PromptDeviceUnlockForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.RefreshSeCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetFelicaTosAcceptanceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetReceivesTransactionNotificationsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetTapAndPaySettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetTapDoodleEnabledRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;

public interface eszv extends IInterface {
    void A(GetOverridePaymentNetworkRequest arg1, eszy arg2, ApiMetadata arg3);

    void B(GetParentalConsentIntentRequest arg1, eszy arg2, ApiMetadata arg3);

    void C(GetQuickAccessWalletConfigRequest arg1, eszy arg2, ApiMetadata arg3);

    void D(GetSeChipTransactionsRequest arg1, eszy arg2, ApiMetadata arg3);

    void E(eszy arg1, ApiMetadata arg2);

    void F(GetTapAndPaySettingsRequest arg1, eszy arg2, ApiMetadata arg3);

    void G(GetTokenDetailsRequest arg1, eszy arg2, ApiMetadata arg3);

    void H(eszy arg1, ApiMetadata arg2);

    void I(IsDeviceRecentlyUnlockedRequest arg1, eszy arg2, ApiMetadata arg3);

    void J(IsDeviceUnlockedForInAppPaymentRequest arg1, eszy arg2, ApiMetadata arg3);

    void K(IsDeviceUnlockedForPaymentRequest arg1, eszy arg2, ApiMetadata arg3);

    void L(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void M(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void N(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void O(UnifiedTokenizationRequest arg1, eszy arg2, ApiMetadata arg3);

    void P(PromptDeviceUnlockForPaymentRequest arg1, eszy arg2, ApiMetadata arg3);

    void Q(RefreshSeCardsRequest arg1, eszy arg2, ApiMetadata arg3);

    void R(eszy arg1, ApiMetadata arg2);

    void S(RegisterServiceListenerRequest arg1, eszy arg2, ApiMetadata arg3);

    void T(eszy arg1, ApiMetadata arg2);

    void U(ReportInAppTransactionCompletedRequest arg1, eszy arg2, ApiMetadata arg3);

    void V(ReportUnlockRequest arg1, eszy arg2, ApiMetadata arg3);

    void W(eszy arg1, ApiMetadata arg2);

    void X(RetrieveInAppPaymentCredentialRequest arg1, eszy arg2, ApiMetadata arg3);

    void Y(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void Z(eszy arg1, ApiMetadata arg2);

    Status a(ApiMetadata arg1);

    void aa(SendPollingFrameHandlerEventRequest arg1, eszy arg2, ApiMetadata arg3);

    void ab(SendTransmissionEventRequest arg1, eszy arg2, ApiMetadata arg3);

    void ac(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void ad(SetActiveAccountRequest arg1, eszy arg2, ApiMetadata arg3);

    void ae(SetFelicaTosAcceptanceRequest arg1, eszy arg2, ApiMetadata arg3);

    void af(SetNotificationSettingsRequest arg1, eszy arg2, ApiMetadata arg3);

    void ag(SetOverridePaymentNetworkRequest arg1, eszy arg2, ApiMetadata arg3);

    void ah(SetQuickAccessWalletCardsRequest arg1, eszy arg2, ApiMetadata arg3);

    void ai(SetReceivesIneligibleCardNotificationRequest arg1, eszy arg2, ApiMetadata arg3);

    void aj(SetReceivesTransactionNotificationsRequest arg1, eszy arg2, ApiMetadata arg3);

    void ak(SetSelectedTokenRequest arg1, eszy arg2, ApiMetadata arg3);

    void al(SetSupervisedChildAccountTypeAndResetOnboardingInfoRequest arg1, eszy arg2, ApiMetadata arg3);

    void am(SetTapAndPaySettingsRequest arg1, eszy arg2, ApiMetadata arg3);

    void an(SetTapDoodleEnabledRequest arg1, eszy arg2, ApiMetadata arg3);

    void ao(ShowSecurityPromptRequest arg1, eszy arg2, ApiMetadata arg3);

    void ap(SyncDeviceInfoRequest arg1, eszy arg2, ApiMetadata arg3);

    void aq(TokenizeAccountRequest arg1, eszy arg2, ApiMetadata arg3);

    void ar(eszy arg1, ApiMetadata arg2);

    void as(ViewTokenRequest arg1, eszy arg2, ApiMetadata arg3);

    void b(AddOtherPaymentOptionRequest arg1, eszy arg2, ApiMetadata arg3);

    void c(RegisterServiceListenerRequest arg1, eszy arg2, ApiMetadata arg3);

    void d(long arg1, eszy arg2, ApiMetadata arg3);

    void e(CheckContactlessEligibilityRequest arg1, eszy arg2, ApiMetadata arg3);

    void f(byte[] arg1, eszy arg2, ApiMetadata arg3);

    void g(eszy arg1, ApiMetadata arg2);

    void h(eszy arg1, ApiMetadata arg2);

    void i(DeleteTokenRequest arg1, eszy arg2, ApiMetadata arg3);

    void j(DisableSelectedTokenRequest arg1, eszy arg2, ApiMetadata arg3);

    void k(eszy arg1, ApiMetadata arg2);

    void l(FirstPartyTokenizePanRequest arg1, eszy arg2, ApiMetadata arg3);

    void m(GetActiveAccountRequest arg1, eszy arg2, ApiMetadata arg3);

    void n(GetActiveCardsForAccountRequest arg1, eszy arg2, ApiMetadata arg3);

    void o(eszy arg1, ApiMetadata arg2);

    void p(GetAllCardsRequest arg1, eszy arg2, ApiMetadata arg3);

    void q(GetAvailableOtherPaymentMethodsRequest arg1, eszy arg2, ApiMetadata arg3);

    void v(GetCobadgedShowPaymentNetworkToggleRequest arg1, eszy arg2, ApiMetadata arg3);

    void w(GetFelicaTosAcceptanceRequest arg1, eszy arg2, ApiMetadata arg3);

    void x(eszy arg1, ApiMetadata arg2);

    void y(GetLastAttestationResultRequest arg1, eszy arg2, ApiMetadata arg3);

    void z(GetNotificationSettingsRequest arg1, eszy arg2, ApiMetadata arg3);
}

