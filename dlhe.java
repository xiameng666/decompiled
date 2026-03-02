import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.AddBankAccountIntentArgs;
import com.google.android.gms.pay.AddPaymentMethodIntentArgs;
import com.google.android.gms.pay.AddValuableIntentArgs;
import com.google.android.gms.pay.AutoloadSettingsIntentArgs;
import com.google.android.gms.pay.CardRewardsDetailsIntentArgs;
import com.google.android.gms.pay.ClosedLoopCardIntentArgs;
import com.google.android.gms.pay.CreateOrUpdateUserCreatedPassIntentArgs;
import com.google.android.gms.pay.DriversLicenseIntentArgs;
import com.google.android.gms.pay.EnterUserCreatedPassIntentArgs;
import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.FopListIntentArgs;
import com.google.android.gms.pay.HomeIntentArgs;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.LowBalanceNotificationSettingsIntentArgs;
import com.google.android.gms.pay.ManagedSecureElementWalletIntentArgs;
import com.google.android.gms.pay.MdocIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.PaycacheSetupIntentArgs;
import com.google.android.gms.pay.ProvisionSePrepaidCardIntentArgs;
import com.google.android.gms.pay.SaveTicketCentricIntentArgs;
import com.google.android.gms.pay.SeCommuterPassDetailIntentArgs;
import com.google.android.gms.pay.SePrepaidCardDetailIntentArgs;
import com.google.android.gms.pay.SePrepaidMfiCardDetailIntentArgs;
import com.google.android.gms.pay.SecureElementPrepaidTosIntentArgs;
import com.google.android.gms.pay.SelectPurchasablePassIntentArgs;
import com.google.android.gms.pay.SuwAddPaymentMethodIntentArgs;
import com.google.android.gms.pay.TopUpIntentArgs;
import com.google.android.gms.pay.TransactionDetailIntentArgs;
import com.google.android.gms.pay.TransactionListIntentArgs;
import com.google.android.gms.pay.TransitDisplayCardIntentArgs;
import com.google.android.gms.pay.ValuableDetailIntentArgs;
import com.google.android.gms.pay.ValuableSaveIntentArgs;
import com.google.android.gms.pay.ViewValuableSearchLoyaltyCardProgramIntentArgs;
import com.google.android.gms.pay.WalletFrameworkIntentArgs;
import com.google.android.gms.pay.WearCardManagementIntentArgs;
import com.google.android.gms.pay.WearClosedLoopCardIntentArgs;
import com.google.android.gms.pay.WearMfiAcquireUserConsentIntentArgs;
import com.google.android.gms.pay.WearPrepaidCardDetailIntentArgs;
import com.google.android.gms.pay.WearTransactionListIntentArgs;

public final class dlhe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        String s = null;
        IntentSource intentSource0 = null;
        FopDetailIntentArgs fopDetailIntentArgs0 = null;
        TransactionDetailIntentArgs transactionDetailIntentArgs0 = null;
        TransactionListIntentArgs transactionListIntentArgs0 = null;
        ClosedLoopCardIntentArgs closedLoopCardIntentArgs0 = null;
        TransitDisplayCardIntentArgs transitDisplayCardIntentArgs0 = null;
        SaveTicketCentricIntentArgs saveTicketCentricIntentArgs0 = null;
        PaycacheSetupIntentArgs paycacheSetupIntentArgs0 = null;
        TopUpIntentArgs topUpIntentArgs0 = null;
        ValuableDetailIntentArgs valuableDetailIntentArgs0 = null;
        HomeIntentArgs homeIntentArgs0 = null;
        ValuableSaveIntentArgs valuableSaveIntentArgs0 = null;
        AddValuableIntentArgs addValuableIntentArgs0 = null;
        AutoloadSettingsIntentArgs autoloadSettingsIntentArgs0 = null;
        LowBalanceNotificationSettingsIntentArgs lowBalanceNotificationSettingsIntentArgs0 = null;
        SePrepaidCardDetailIntentArgs sePrepaidCardDetailIntentArgs0 = null;
        SePrepaidMfiCardDetailIntentArgs sePrepaidMfiCardDetailIntentArgs0 = null;
        ProvisionSePrepaidCardIntentArgs provisionSePrepaidCardIntentArgs0 = null;
        WalletFrameworkIntentArgs walletFrameworkIntentArgs0 = null;
        SelectPurchasablePassIntentArgs selectPurchasablePassIntentArgs0 = null;
        WearCardManagementIntentArgs wearCardManagementIntentArgs0 = null;
        WearClosedLoopCardIntentArgs wearClosedLoopCardIntentArgs0 = null;
        AddPaymentMethodIntentArgs addPaymentMethodIntentArgs0 = null;
        WearTransactionListIntentArgs wearTransactionListIntentArgs0 = null;
        SecureElementPrepaidTosIntentArgs secureElementPrepaidTosIntentArgs0 = null;
        SeCommuterPassDetailIntentArgs seCommuterPassDetailIntentArgs0 = null;
        ManagedSecureElementWalletIntentArgs managedSecureElementWalletIntentArgs0 = null;
        DriversLicenseIntentArgs driversLicenseIntentArgs0 = null;
        byte[] arr_b = null;
        AddBankAccountIntentArgs addBankAccountIntentArgs0 = null;
        FopListIntentArgs fopListIntentArgs0 = null;
        SuwAddPaymentMethodIntentArgs suwAddPaymentMethodIntentArgs0 = null;
        ViewValuableSearchLoyaltyCardProgramIntentArgs viewValuableSearchLoyaltyCardProgramIntentArgs0 = null;
        MdocIntentArgs mdocIntentArgs0 = null;
        EnterUserCreatedPassIntentArgs enterUserCreatedPassIntentArgs0 = null;
        CreateOrUpdateUserCreatedPassIntentArgs createOrUpdateUserCreatedPassIntentArgs0 = null;
        WearPrepaidCardDetailIntentArgs wearPrepaidCardDetailIntentArgs0 = null;
        WearMfiAcquireUserConsentIntentArgs wearMfiAcquireUserConsentIntentArgs0 = null;
        CardRewardsDetailsIntentArgs cardRewardsDetailsIntentArgs0 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 2: {
                    fopDetailIntentArgs0 = (FopDetailIntentArgs)baua.m(parcel0, v2, FopDetailIntentArgs.CREATOR);
                    break;
                }
                case 3: {
                    transactionDetailIntentArgs0 = (TransactionDetailIntentArgs)baua.m(parcel0, v2, TransactionDetailIntentArgs.CREATOR);
                    break;
                }
                case 4: {
                    transactionListIntentArgs0 = (TransactionListIntentArgs)baua.m(parcel0, v2, TransactionListIntentArgs.CREATOR);
                    break;
                }
                case 5: {
                    closedLoopCardIntentArgs0 = (ClosedLoopCardIntentArgs)baua.m(parcel0, v2, ClosedLoopCardIntentArgs.CREATOR);
                    break;
                }
                case 6: {
                    transitDisplayCardIntentArgs0 = (TransitDisplayCardIntentArgs)baua.m(parcel0, v2, TransitDisplayCardIntentArgs.CREATOR);
                    break;
                }
                case 7: {
                    saveTicketCentricIntentArgs0 = (SaveTicketCentricIntentArgs)baua.m(parcel0, v2, SaveTicketCentricIntentArgs.CREATOR);
                    break;
                }
                case 8: {
                    paycacheSetupIntentArgs0 = (PaycacheSetupIntentArgs)baua.m(parcel0, v2, PaycacheSetupIntentArgs.CREATOR);
                    break;
                }
                case 9: {
                    topUpIntentArgs0 = (TopUpIntentArgs)baua.m(parcel0, v2, TopUpIntentArgs.CREATOR);
                    break;
                }
                case 10: {
                    valuableDetailIntentArgs0 = (ValuableDetailIntentArgs)baua.m(parcel0, v2, ValuableDetailIntentArgs.CREATOR);
                    break;
                }
                case 11: {
                    homeIntentArgs0 = (HomeIntentArgs)baua.m(parcel0, v2, HomeIntentArgs.CREATOR);
                    break;
                }
                case 12: {
                    valuableSaveIntentArgs0 = (ValuableSaveIntentArgs)baua.m(parcel0, v2, ValuableSaveIntentArgs.CREATOR);
                    break;
                }
                case 13: {
                    addValuableIntentArgs0 = (AddValuableIntentArgs)baua.m(parcel0, v2, AddValuableIntentArgs.CREATOR);
                    break;
                }
                case 14: {
                    autoloadSettingsIntentArgs0 = (AutoloadSettingsIntentArgs)baua.m(parcel0, v2, AutoloadSettingsIntentArgs.CREATOR);
                    break;
                }
                case 15: {
                    lowBalanceNotificationSettingsIntentArgs0 = (LowBalanceNotificationSettingsIntentArgs)baua.m(parcel0, v2, LowBalanceNotificationSettingsIntentArgs.CREATOR);
                    break;
                }
                case 16: {
                    sePrepaidCardDetailIntentArgs0 = (SePrepaidCardDetailIntentArgs)baua.m(parcel0, v2, SePrepaidCardDetailIntentArgs.CREATOR);
                    break;
                }
                case 17: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v2, IntentSource.CREATOR);
                    break;
                }
                case 18: {
                    walletFrameworkIntentArgs0 = (WalletFrameworkIntentArgs)baua.m(parcel0, v2, WalletFrameworkIntentArgs.CREATOR);
                    break;
                }
                case 21: {
                    selectPurchasablePassIntentArgs0 = (SelectPurchasablePassIntentArgs)baua.m(parcel0, v2, SelectPurchasablePassIntentArgs.CREATOR);
                    break;
                }
                case 22: {
                    wearCardManagementIntentArgs0 = (WearCardManagementIntentArgs)baua.m(parcel0, v2, WearCardManagementIntentArgs.CREATOR);
                    break;
                }
                case 24: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 25: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 26: {
                    wearClosedLoopCardIntentArgs0 = (WearClosedLoopCardIntentArgs)baua.m(parcel0, v2, WearClosedLoopCardIntentArgs.CREATOR);
                    break;
                }
                case 27: {
                    addPaymentMethodIntentArgs0 = (AddPaymentMethodIntentArgs)baua.m(parcel0, v2, AddPaymentMethodIntentArgs.CREATOR);
                    break;
                }
                case 29: {
                    wearTransactionListIntentArgs0 = (WearTransactionListIntentArgs)baua.m(parcel0, v2, WearTransactionListIntentArgs.CREATOR);
                    break;
                }
                case 0x1F: {
                    secureElementPrepaidTosIntentArgs0 = (SecureElementPrepaidTosIntentArgs)baua.m(parcel0, v2, SecureElementPrepaidTosIntentArgs.CREATOR);
                    break;
                }
                case 33: {
                    seCommuterPassDetailIntentArgs0 = (SeCommuterPassDetailIntentArgs)baua.m(parcel0, v2, SeCommuterPassDetailIntentArgs.CREATOR);
                    break;
                }
                case 34: {
                    managedSecureElementWalletIntentArgs0 = (ManagedSecureElementWalletIntentArgs)baua.m(parcel0, v2, ManagedSecureElementWalletIntentArgs.CREATOR);
                    break;
                }
                case 35: {
                    driversLicenseIntentArgs0 = (DriversLicenseIntentArgs)baua.m(parcel0, v2, DriversLicenseIntentArgs.CREATOR);
                    break;
                }
                case 36: {
                    sePrepaidMfiCardDetailIntentArgs0 = (SePrepaidMfiCardDetailIntentArgs)baua.m(parcel0, v2, SePrepaidMfiCardDetailIntentArgs.CREATOR);
                    break;
                }
                case 37: {
                    provisionSePrepaidCardIntentArgs0 = (ProvisionSePrepaidCardIntentArgs)baua.m(parcel0, v2, ProvisionSePrepaidCardIntentArgs.CREATOR);
                    break;
                }
                case 38: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 39: {
                    addBankAccountIntentArgs0 = (AddBankAccountIntentArgs)baua.m(parcel0, v2, AddBankAccountIntentArgs.CREATOR);
                    break;
                }
                case 40: {
                    fopListIntentArgs0 = (FopListIntentArgs)baua.m(parcel0, v2, FopListIntentArgs.CREATOR);
                    break;
                }
                case 41: {
                    suwAddPaymentMethodIntentArgs0 = (SuwAddPaymentMethodIntentArgs)baua.m(parcel0, v2, SuwAddPaymentMethodIntentArgs.CREATOR);
                    break;
                }
                case 42: {
                    viewValuableSearchLoyaltyCardProgramIntentArgs0 = (ViewValuableSearchLoyaltyCardProgramIntentArgs)baua.m(parcel0, v2, ViewValuableSearchLoyaltyCardProgramIntentArgs.CREATOR);
                    break;
                }
                case 43: {
                    mdocIntentArgs0 = (MdocIntentArgs)baua.m(parcel0, v2, MdocIntentArgs.CREATOR);
                    break;
                }
                case 44: {
                    enterUserCreatedPassIntentArgs0 = (EnterUserCreatedPassIntentArgs)baua.m(parcel0, v2, EnterUserCreatedPassIntentArgs.CREATOR);
                    break;
                }
                case 45: {
                    createOrUpdateUserCreatedPassIntentArgs0 = (CreateOrUpdateUserCreatedPassIntentArgs)baua.m(parcel0, v2, CreateOrUpdateUserCreatedPassIntentArgs.CREATOR);
                    break;
                }
                case 46: {
                    wearPrepaidCardDetailIntentArgs0 = (WearPrepaidCardDetailIntentArgs)baua.m(parcel0, v2, WearPrepaidCardDetailIntentArgs.CREATOR);
                    break;
                }
                case 0x2F: {
                    wearMfiAcquireUserConsentIntentArgs0 = (WearMfiAcquireUserConsentIntentArgs)baua.m(parcel0, v2, WearMfiAcquireUserConsentIntentArgs.CREATOR);
                    break;
                }
                case 0x30: {
                    cardRewardsDetailsIntentArgs0 = (CardRewardsDetailsIntentArgs)baua.m(parcel0, v2, CardRewardsDetailsIntentArgs.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PayIntentArgs(account0, s, v1, intentSource0, fopDetailIntentArgs0, transactionDetailIntentArgs0, transactionListIntentArgs0, closedLoopCardIntentArgs0, transitDisplayCardIntentArgs0, saveTicketCentricIntentArgs0, paycacheSetupIntentArgs0, topUpIntentArgs0, valuableDetailIntentArgs0, homeIntentArgs0, valuableSaveIntentArgs0, addValuableIntentArgs0, autoloadSettingsIntentArgs0, lowBalanceNotificationSettingsIntentArgs0, sePrepaidCardDetailIntentArgs0, sePrepaidMfiCardDetailIntentArgs0, provisionSePrepaidCardIntentArgs0, walletFrameworkIntentArgs0, selectPurchasablePassIntentArgs0, wearCardManagementIntentArgs0, wearClosedLoopCardIntentArgs0, addPaymentMethodIntentArgs0, wearTransactionListIntentArgs0, secureElementPrepaidTosIntentArgs0, seCommuterPassDetailIntentArgs0, managedSecureElementWalletIntentArgs0, driversLicenseIntentArgs0, arr_b, addBankAccountIntentArgs0, fopListIntentArgs0, suwAddPaymentMethodIntentArgs0, viewValuableSearchLoyaltyCardProgramIntentArgs0, mdocIntentArgs0, enterUserCreatedPassIntentArgs0, createOrUpdateUserCreatedPassIntentArgs0, wearPrepaidCardDetailIntentArgs0, wearMfiAcquireUserConsentIntentArgs0, cardRewardsDetailsIntentArgs0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PayIntentArgs[v];
    }
}

