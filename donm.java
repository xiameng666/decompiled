import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.BlockClosedLoopCardsRequest;
import com.google.android.gms.pay.ChangeSePostpaidDefaultStatusRequest;
import com.google.android.gms.pay.ClearBulletinInteractionForDevRequest;
import com.google.android.gms.pay.ClearSmartTapOverrideRequest;
import com.google.android.gms.pay.DataChangeListenerRequest;
import com.google.android.gms.pay.DebitSePrepaidCardRequest;
import com.google.android.gms.pay.DeleteCardCentricProductRequest;
import com.google.android.gms.pay.DeleteSePrepaidCardRequest;
import com.google.android.gms.pay.DeleteTicketCentricCardRequest;
import com.google.android.gms.pay.DeleteTicketCentricProductRequest;
import com.google.android.gms.pay.DeleteValuablesRequest;
import com.google.android.gms.pay.DigitizeCardCentricRequest;
import com.google.android.gms.pay.DigitizeTicketCentricRequest;
import com.google.android.gms.pay.GetAttestationSignalRequest;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.GetCardCentricBundleRequest;
import com.google.android.gms.pay.GetClockSkewMillisRequest;
import com.google.android.gms.pay.GetClosedLoopBundleRequest;
import com.google.android.gms.pay.GetClosedLoopCardsFromServerRequest;
import com.google.android.gms.pay.GetClosedLoopCardsRequest;
import com.google.android.gms.pay.GetDigitalCarKeysRequest;
import com.google.android.gms.pay.GetImagesForValuableRequest;
import com.google.android.gms.pay.GetIntegrityTokenForPixRequest;
import com.google.android.gms.pay.GetLastUserPresentTimestampRequest;
import com.google.android.gms.pay.GetLegalDocumentsRequest;
import com.google.android.gms.pay.GetLinkedValuablesRequest;
import com.google.android.gms.pay.GetMdlRefreshTimestampsRequest;
import com.google.android.gms.pay.GetOnboardingInfoRequest;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdRequest;
import com.google.android.gms.pay.GetPayCapabilitiesRequest;
import com.google.android.gms.pay.GetPayCardArtRequest;
import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.GetPaymentMethodsRequest;
import com.google.android.gms.pay.GetPredefinedRotatingBarcodeValuesRequest;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusRequest;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.GetSePrepaidCardRequest;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GetValuablesFromServerRequest;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.GetWearClosedLoopCardsRequest;
import com.google.android.gms.pay.GetWearPaymentMethodsRequest;
import com.google.android.gms.pay.HasAcceptedTosForPartnerRequest;
import com.google.android.gms.pay.HasAcceptedTosRequest;
import com.google.android.gms.pay.ListCommuterPassRenewalOptionsForSePrepaidCardRequest;
import com.google.android.gms.pay.MarkTosAcceptedForPartnerRequest;
import com.google.android.gms.pay.MoveCardOnOtherDeviceRequest;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;
import com.google.android.gms.pay.ProvisionSePrepaidCardRequest;
import com.google.android.gms.pay.RecordBulletinInteractionsRequest;
import com.google.android.gms.pay.RecoverSeCardRequest;
import com.google.android.gms.pay.RefreshSePostpaidsTransactionsFromChipRequest;
import com.google.android.gms.pay.RefreshSePrepaidTransactionsFromChipRequest;
import com.google.android.gms.pay.RemoveSePostpaidTokenRequest;
import com.google.android.gms.pay.RenewCommuterPassForSePrepaidCardRequest;
import com.google.android.gms.pay.RequestPayModuleRequest;
import com.google.android.gms.pay.ReversePurchaseRequest;
import com.google.android.gms.pay.SaveCardCentricRequest;
import com.google.android.gms.pay.SaveImagesForValuableRequest;
import com.google.android.gms.pay.SaveLocalValuablesRequest;
import com.google.android.gms.pay.SavePurchasedCardRequest;
import com.google.android.gms.pay.SaveTicketCentricRequest;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;
import com.google.android.gms.pay.SetAcceptedTosForPartnerRequest;
import com.google.android.gms.pay.SetClockSkewMillisRequest;
import com.google.android.gms.pay.SetOnboardingInfoRequest;
import com.google.android.gms.pay.SetPassesUpdateNotificationsEnabledRequest;
import com.google.android.gms.pay.SetSeTransitDefaultRequest;
import com.google.android.gms.pay.SetSmartTapOverrideRequest;
import com.google.android.gms.pay.SetSortOrderRequest;
import com.google.android.gms.pay.SetValuableSmartTapEnabledRequest;
import com.google.android.gms.pay.SetWalletItemSurfacingEnabledRequest;
import com.google.android.gms.pay.StartClosedLoopHceMigrationRequest;
import com.google.android.gms.pay.StoreMdlRefreshTimestampRequest;
import com.google.android.gms.pay.SyncTransactionsRequest;
import com.google.android.gms.pay.TopupSePrepaidCardRequest;
import com.google.android.gms.pay.UndigitizeTicketCentricCardRequest;
import com.google.android.gms.pay.UndigitizeTicketCentricProductRequest;
import com.google.android.gms.pay.UpdateBalanceRequest;
import com.google.android.gms.pay.UpdateClosedLoopBundleRequest;
import com.google.android.gms.pay.UpdateClosedLoopBundleWithClientSettingsRequest;
import com.google.android.gms.pay.UpdateLegalDocumentsRequest;
import com.google.android.gms.pay.UpdateSettingsRequest;
import com.google.android.gms.pay.ValidateCardCentricRequest;
import com.google.android.gms.pay.ValidateTicketCentricRequest;

public interface donm extends IInterface {
    void A(GetImagesForValuableRequest arg1, donp arg2, ApiMetadata arg3);

    void B(GetIntegrityTokenForPixRequest arg1, donp arg2, ApiMetadata arg3);

    void C(GetLastUserPresentTimestampRequest arg1, donp arg2, ApiMetadata arg3);

    void D(GetLegalDocumentsRequest arg1, donp arg2, ApiMetadata arg3);

    void E(GetLinkedValuablesRequest arg1, donp arg2, ApiMetadata arg3);

    void F(GetTransactionsRequest arg1, donp arg2, ApiMetadata arg3);

    void G(GetMdlRefreshTimestampsRequest arg1, donp arg2, ApiMetadata arg3);

    void H(GetOnboardingInfoRequest arg1, donp arg2, ApiMetadata arg3);

    void I(GetOutstandingPurchaseOrderIdRequest arg1, donp arg2, ApiMetadata arg3);

    void J(GetPayCapabilitiesRequest arg1, donp arg2, ApiMetadata arg3);

    void K(GetPayCardArtRequest arg1, donp arg2, ApiMetadata arg3);

    void L(GetPaymentMethodActionTokensRequest arg1, donp arg2, ApiMetadata arg3);

    void M(GetPaymentMethodsRequest arg1, donp arg2, ApiMetadata arg3);

    void N(GetPredefinedRotatingBarcodeValuesRequest arg1, donp arg2, ApiMetadata arg3);

    void O(GetSeFeatureReadinessStatusRequest arg1, donp arg2, ApiMetadata arg3);

    void P(GetSeMfiPrepaidCardsRequest arg1, donp arg2, ApiMetadata arg3);

    void Q(GetSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void R(GetSettingsRequest arg1, donp arg2, ApiMetadata arg3);

    void S(GetSortOrderRequest arg1, donp arg2, ApiMetadata arg3);

    void T(GetTransactionsRequest arg1, donp arg2, ApiMetadata arg3);

    void U(GetValuablesRequest arg1, donp arg2, ApiMetadata arg3);

    void V(GetValuablesFromServerRequest arg1, donp arg2, ApiMetadata arg3);

    void W(GetBulletinsRequest arg1, donp arg2, ApiMetadata arg3);

    void X(GetWearClosedLoopCardsRequest arg1, donp arg2, ApiMetadata arg3);

    void Y(GetWearPaymentMethodsRequest arg1, donp arg2, ApiMetadata arg3);

    void Z(HasAcceptedTosRequest arg1, donp arg2, ApiMetadata arg3);

    void a(BlockClosedLoopCardsRequest arg1, donp arg2, ApiMetadata arg3);

    void aA(SaveLocalValuablesRequest arg1, donp arg2, ApiMetadata arg3);

    void aB(SavePurchasedCardRequest arg1, donp arg2, ApiMetadata arg3);

    void aC(SaveTicketCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void aD(SelectPayGlobalActionCardRequest arg1, donp arg2, ApiMetadata arg3);

    void aE(SetAcceptedTosForPartnerRequest arg1, donp arg2, ApiMetadata arg3);

    void aF(SetClockSkewMillisRequest arg1, donp arg2, ApiMetadata arg3);

    void aG(SetOnboardingInfoRequest arg1, donp arg2, ApiMetadata arg3);

    void aH(SetPassesUpdateNotificationsEnabledRequest arg1, donp arg2, ApiMetadata arg3);

    void aI(SetSeTransitDefaultRequest arg1, donp arg2, ApiMetadata arg3);

    void aJ(SetSmartTapOverrideRequest arg1, donp arg2, ApiMetadata arg3);

    void aK(SetSortOrderRequest arg1, donp arg2, ApiMetadata arg3);

    void aL(SetValuableSmartTapEnabledRequest arg1, donp arg2, ApiMetadata arg3);

    void aM(SetWalletItemSurfacingEnabledRequest arg1, donp arg2, ApiMetadata arg3);

    void aN(StartClosedLoopHceMigrationRequest arg1, donp arg2, ApiMetadata arg3);

    void aO(StoreMdlRefreshTimestampRequest arg1, donp arg2, ApiMetadata arg3);

    void aP(SyncTransactionsRequest arg1, donp arg2, ApiMetadata arg3);

    void aQ(TopupSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void aR(UndigitizeTicketCentricCardRequest arg1, donp arg2, ApiMetadata arg3);

    void aS(UndigitizeTicketCentricProductRequest arg1, donp arg2, ApiMetadata arg3);

    void aT(DataChangeListenerRequest arg1, donp arg2, ApiMetadata arg3);

    void aU(UpdateBalanceRequest arg1, donp arg2, ApiMetadata arg3);

    void aV(UpdateClosedLoopBundleRequest arg1, donp arg2, ApiMetadata arg3);

    void aW(UpdateClosedLoopBundleWithClientSettingsRequest arg1, donp arg2, ApiMetadata arg3);

    void aX(UpdateLegalDocumentsRequest arg1, donp arg2, ApiMetadata arg3);

    void aY(UpdateSettingsRequest arg1, donp arg2, ApiMetadata arg3);

    void aZ(ValidateCardCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void aa(HasAcceptedTosForPartnerRequest arg1, donp arg2, ApiMetadata arg3);

    void ab(ListCommuterPassRenewalOptionsForSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void ac(MarkTosAcceptedForPartnerRequest arg1, donp arg2, ApiMetadata arg3);

    void ad(MoveCardOnOtherDeviceRequest arg1, donp arg2, ApiMetadata arg3);

    void ae(byte[] arg1, donp arg2, ApiMetadata arg3);

    void af(byte[] arg1, donp arg2, ApiMetadata arg3);

    void ag(byte[] arg1, donp arg2, ApiMetadata arg3);

    void ah(byte[] arg1, donp arg2, ApiMetadata arg3);

    void ai(byte[] arg1, donp arg2, ApiMetadata arg3);

    void aj(byte[] arg1, donp arg2, ApiMetadata arg3);

    void ak(PerformPaymentMethodServerActionRequest arg1, donp arg2, ApiMetadata arg3);

    void al(byte[] arg1, donp arg2, ApiMetadata arg3);

    void am(byte[] arg1, donp arg2, ApiMetadata arg3);

    void an(byte[] arg1, donp arg2, ApiMetadata arg3);

    void ao(ProvisionSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void ap(RecordBulletinInteractionsRequest arg1, donp arg2, ApiMetadata arg3);

    void aq(RecoverSeCardRequest arg1, donp arg2, ApiMetadata arg3);

    void ar(RefreshSePostpaidsTransactionsFromChipRequest arg1, donp arg2, ApiMetadata arg3);

    void as(RefreshSePrepaidTransactionsFromChipRequest arg1, donp arg2, ApiMetadata arg3);

    void at(DataChangeListenerRequest arg1, donp arg2, ApiMetadata arg3);

    void au(RemoveSePostpaidTokenRequest arg1, donp arg2, ApiMetadata arg3);

    void av(RenewCommuterPassForSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void aw(RequestPayModuleRequest arg1, donp arg2, ApiMetadata arg3);

    void ax(ReversePurchaseRequest arg1, donp arg2, ApiMetadata arg3);

    void ay(SaveCardCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void az(SaveImagesForValuableRequest arg1, donp arg2, ApiMetadata arg3);

    void b(ChangeSePostpaidDefaultStatusRequest arg1, donp arg2, ApiMetadata arg3);

    void ba(ValidateTicketCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void c(ClearBulletinInteractionForDevRequest arg1, donp arg2, ApiMetadata arg3);

    void d(ClearSmartTapOverrideRequest arg1, donp arg2, ApiMetadata arg3);

    void e(DebitSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void f(DeleteCardCentricProductRequest arg1, donp arg2, ApiMetadata arg3);

    void g(DeleteSePrepaidCardRequest arg1, donp arg2, ApiMetadata arg3);

    void h(DeleteTicketCentricCardRequest arg1, donp arg2, ApiMetadata arg3);

    void i(DeleteTicketCentricProductRequest arg1, donp arg2, ApiMetadata arg3);

    void j(DeleteValuablesRequest arg1, donp arg2, ApiMetadata arg3);

    void k(DigitizeCardCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void l(DigitizeTicketCentricRequest arg1, donp arg2, ApiMetadata arg3);

    void m(GetAttestationSignalRequest arg1, donp arg2, ApiMetadata arg3);

    void n(GetBulletinsRequest arg1, donp arg2, ApiMetadata arg3);

    void o(GetBulletinsRequest arg1, donp arg2, ApiMetadata arg3);

    void p(GetCardCentricBundleRequest arg1, donp arg2, ApiMetadata arg3);

    void q(GetClockSkewMillisRequest arg1, donp arg2, ApiMetadata arg3);

    void v(GetClosedLoopBundleRequest arg1, donp arg2, ApiMetadata arg3);

    void w(GetClosedLoopCardsRequest arg1, donp arg2, ApiMetadata arg3);

    void x(GetClosedLoopCardsFromServerRequest arg1, donp arg2, ApiMetadata arg3);

    void y(GetDigitalCarKeysRequest arg1, donp arg2, ApiMetadata arg3);

    void z(donp arg1, ApiMetadata arg2);
}

