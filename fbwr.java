import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMetadataRequest;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fbwr extends fblt implements cjug {
    private final fblt a;
    private final Context b;

    public fbwr(Context context0, fblt fblt0) {
        this.b = context0.getApplicationContext();
        this.a = fblt0;
    }

    @Override  // fblu
    public final void A(WarmUpUiProcessRequest warmUpUiProcessRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.A(warmUpUiProcessRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "warmUpUiProcess: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            WarmUpUiProcessResponse warmUpUiProcessResponse0 = new WarmUpUiProcessResponse(null);
            fblx0.t(Status.d, warmUpUiProcessResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void a(String s, String s1, Bundle bundle0, fblx fblx0) {
        try {
            this.a.a(s, s1, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "changeMaskedWallet: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            faws faws0 = MaskedWallet.a();
            faws0.b(s1);
            faws0.a(s);
            fblx0.l(8, faws0.a, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void b(Bundle bundle0, fblx fblx0) {
        try {
            this.a.b(bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "checkForPreAuthorization: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.p(8, false, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void c(CreateWalletObjectsRequest createWalletObjectsRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.c(createWalletObjectsRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "createWalletObjects: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.s(8, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void d(ExecuteBuyFlowRequest executeBuyFlowRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.d(executeBuyFlowRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "executeBuyFlow: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.e(Status.d, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void e(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.e(getBuyFlowInitializationTokenRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getBuyFlowInitializationToken: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse0 = new GetBuyFlowInitializationTokenResponse(new byte[0]);
            fblx0.c(Status.d, getBuyFlowInitializationTokenResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void f(GetClientTokenRequest getClientTokenRequest0, Bundle bundle0, fblx fblx0) {
        long v = SystemClock.elapsedRealtime();
        try {
            this.a.f(getClientTokenRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getClientToken: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            BuyFlowConfig buyFlowConfig0 = fbxe.c(bundle0, getClientTokenRequest0.a);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gklc.a).v_newBuilder();
            fbxe.h(this.b, buyFlowConfig0, hftp0, 5, v);
            GetClientTokenResponse getClientTokenResponse0 = new GetClientTokenResponse(new byte[0]);
            fblx0.d(Status.d, getClientTokenResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void g(FullWalletRequest fullWalletRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.g(fullWalletRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getFullWallet: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fawh fawh0 = FullWallet.a();
            fawh0.b(fullWalletRequest0.b);
            fawh0.a(fullWalletRequest0.a);
            fblx0.f(8, fawh0.a, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void h(Bundle bundle0, fblx fblx0) {
        try {
            this.a.h(bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "GetInstrumentAvailability: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse0 = GetInstrumentAvailabilityResponse.a().a;
            fblx0.g(Status.d, getInstrumentAvailabilityResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void i(MaskedWalletRequest maskedWalletRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.i(maskedWalletRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getMaskedWalletForPreauthorizedBuyer: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            faws faws0 = MaskedWallet.a();
            faws0.b(maskedWalletRequest0.a);
            fblx0.l(8, faws0.a, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void j(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.j(paymentCardRecognitionIntentRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getPaymentCardRecognitionIntent: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.m(Status.d, null, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void k(PaymentMetadataRequest paymentMetadataRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.k(paymentMetadataRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getPaymentMetadata: DeadObjectException");
        }
    }

    @Override  // fblu
    public final void l(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.l(getSaveInstrumentDetailsRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "saveInstrument: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse0 = GetSaveInstrumentDetailsResponse.a().a();
            fblx0.h(Status.d, getSaveInstrumentDetailsResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void m(GetSetupWizardIntentRequest getSetupWizardIntentRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.m(getSetupWizardIntentRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "getSetupWizardIntent: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.r(8, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void n(InitializeBuyFlowRequest initializeBuyFlowRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.n(initializeBuyFlowRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "initializeBuyFlow: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.i(Status.d, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void o(Bundle bundle0, fblx fblx0) {
        try {
            this.a.o(bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "isNewUser: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.j(8, false, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void p(IsReadyToPayRequest isReadyToPayRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.p(isReadyToPayRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "isReadyToPay: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.k(Status.d, false, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void q(PaymentDataRequest paymentDataRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.q(paymentDataRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "loadPaymentData: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            PaymentData paymentData0 = PaymentData.b().a;
            fblx0.n(Status.d, paymentData0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void v(WebPaymentDataRequest webPaymentDataRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.v(webPaymentDataRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "loadWebPaymentData: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            WebPaymentData webPaymentData0 = WebPaymentData.a().a;
            fblx0.u(Status.d, webPaymentData0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void w(SaveInstrumentRequest saveInstrumentRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.w(saveInstrumentRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "saveInstrument: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            fblx0.q(Status.d, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void x(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest0, Bundle bundle0, fblx fblx0) {
        try {
            this.a.x(setUpBiometricAuthenticationKeysRequest0, bundle0, fblx0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("ExceptionHandlingOwServ", "setUpBiometricAuthenticationKeys: DeadObjectException");
        }
        catch(Throwable unused_ex) {
            SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse0 = new SetUpBiometricAuthenticationKeysResponse(null);
            fblx0.a(Status.d, setUpBiometricAuthenticationKeysResponse0, Bundle.EMPTY);
        }
    }

    @Override  // fblu
    public final void y(Bundle bundle0) {
        try {
            this.a.y(bundle0);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // fblu
    public final void z(Bundle bundle0) {
        try {
            this.a.z(bundle0);
        }
        catch(Throwable unused_ex) {
        }
    }
}

