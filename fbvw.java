import android.accounts.Account;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowResponse;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.GetAccountEligibilityServerRequest;
import com.google.android.gms.wallet.service.orchestration.GetInstrumentAvailabilityServerRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.UpstreamInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UpstreamSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.VerifyMerchantRegistrationServerRequest;
import com.google.android.gms.wallet.service.orchestration.WebViewWidgetInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.WriteDocumentServerRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;
import com.google.android.wallet.ui.tapandpay.TapAndPayConsumerVerificationResponse;
import j..util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fbvw extends fbuf {
    public static final List a;
    public static final List b;
    public static final List c;
    public final fbes d;
    FutureTask e;
    private final Context f;
    private final fbwo g;
    private final fboa h;
    private final SecureRandom i;
    private final fbwk j;
    private final gamy k;

    static {
        fbvw.a = Arrays.asList(new String[]{"EES-Proto-Tokenization", "4.50.5.1;52,4.50.5.2;51"});
        fbvw.b = Arrays.asList(new String[]{"EES-Proto-Tokenization", "3.2.1;1,3.2.2;13"});
        fbvw.c = Arrays.asList(new String[]{"EES-Proto-Tokenization", "3.2.6;21,3.2.2;13"});
    }

    public fbvw(Context context0, fbes fbes0, fbwo fbwo0, gamy gamy0) {
        SecureRandom secureRandom0 = fbvx.c();
        fbwk fbwk0 = new fbwk(context0);
        super();
        this.e = null;
        this.f = context0;
        this.d = fbes0;
        this.h = new fboa(context0, "NetworkOrchService");
        this.g = fbwo0;
        this.i = secureRandom0;
        this.j = fbwk0;
        this.k = gamy0;
    }

    public fbvw(Context context0, fbes fbes0, gamy gamy0) {
        this(context0, fbes0, null, gamy0);
    }

    @Override  // fbug
    public final ServerResponse A(BuyFlowConfig buyFlowConfig0, UpstreamSubmitRequest upstreamSubmitRequest0) {
        gesx gesx0 = ((hchx)upstreamSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        hchx hchx0 = (hchx)upstreamSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hchx0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchx hchx1 = (hchx)hftp0.b_message;
        gesx1.getClass();
        hchx1.c = gesx1;
        hchx1.b |= 1;
        hchx hchx2 = (hchx)hftp0.N_build();
        upstreamSubmitRequest0.b = hchx2;
        fbvf fbvf0 = new fbvf(this, buyFlowConfig0, upstreamSubmitRequest0.a, hchx2);
        return this.h.a(fbvf0);
    }

    @Override  // fbug
    public final ServerResponse B(BuyFlowConfig buyFlowConfig0, AddInstrumentSubmitRequest addInstrumentSubmitRequest0) {
        batl.c(addInstrumentSubmitRequest0.c != null, "No SecureDataHeader provided for submitAddInstrument.");
        geqd geqd0 = (geqd)addInstrumentSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)geqd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)geqd0));
        gesx gesx0 = ((geqd)addInstrumentSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geqd geqd1 = (geqd)hftp0.b_message;
        gesx1.getClass();
        geqd1.c = gesx1;
        geqd1.b |= 1;
        geqd geqd2 = (geqd)hftp0.N_build();
        addInstrumentSubmitRequest0.b = geqd2;
        fbuw fbuw0 = new fbuw(this, buyFlowConfig0, addInstrumentSubmitRequest0.a, geqd2, addInstrumentSubmitRequest0);
        return this.h.a(fbuw0);
    }

    @Override  // fbug
    public final ServerResponse C(BuyFlowConfig buyFlowConfig0, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest0) {
        batl.c(embeddedLandingPageSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitEmbeddedLandingPage.");
        gesx gesx0 = ((hcge)embeddedLandingPageSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        hcge hcge0 = (hcge)embeddedLandingPageSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcge0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcge0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcge hcge1 = (hcge)hftp0.b_message;
        gesx1.getClass();
        hcge1.c = gesx1;
        hcge1.b |= 1;
        hcge hcge2 = (hcge)hftp0.N_build();
        embeddedLandingPageSubmitRequest0.b = hcge2;
        fbvb fbvb0 = new fbvb(this, buyFlowConfig0, embeddedLandingPageSubmitRequest0.a, hcge2, embeddedLandingPageSubmitRequest0);
        return this.h.a(fbvb0);
    }

    @Override  // fbug
    public final ServerResponse D(BuyFlowConfig buyFlowConfig0, FixInstrumentSubmitRequest fixInstrumentSubmitRequest0) {
        batl.c(fixInstrumentSubmitRequest0.c != null, "No SecureDataHeader provided for submitFixInstrument.");
        hcgk hcgk0 = (hcgk)fixInstrumentSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcgk0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcgk0));
        gesx gesx0 = ((hcgk)fixInstrumentSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcgk hcgk1 = (hcgk)hftp0.b_message;
        gesx1.getClass();
        hcgk1.c = gesx1;
        hcgk1.b |= 1;
        hcgk hcgk2 = (hcgk)hftp0.N_build();
        fixInstrumentSubmitRequest0.b = hcgk2;
        fbuz fbuz0 = new fbuz(this, buyFlowConfig0, fixInstrumentSubmitRequest0.a, hcgk2, fixInstrumentSubmitRequest0);
        return this.h.a(fbuz0);
    }

    @Override  // fbug
    public final ServerResponse E(BuyFlowConfig buyFlowConfig0, GenericSelectorSubmitRequest genericSelectorSubmitRequest0) {
        gfkl gfkl0 = (gfkl)genericSelectorSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfkl0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfkl0));
        gesx gesx0 = ((gfkl)genericSelectorSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfkl gfkl1 = (gfkl)hftp0.b_message;
        gesx1.getClass();
        gfkl1.c = gesx1;
        gfkl1.b |= 1;
        gfkl gfkl2 = (gfkl)hftp0.N_build();
        genericSelectorSubmitRequest0.b = gfkl2;
        fbut fbut0 = new fbut(this, buyFlowConfig0, genericSelectorSubmitRequest0.a, gfkl2);
        return this.h.a(fbut0);
    }

    @Override  // fbug
    public final ServerResponse H(BuyFlowConfig buyFlowConfig0, IdCreditSubmitRequest idCreditSubmitRequest0) {
        batl.c(idCreditSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitId.");
        gfku gfku0 = (gfku)idCreditSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfku0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfku0));
        gesx gesx0 = ((gfku)idCreditSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfku gfku1 = (gfku)hftp0.b_message;
        gesx1.getClass();
        gfku1.c = gesx1;
        gfku1.b |= 1;
        gfku gfku2 = (gfku)hftp0.N_build();
        idCreditSubmitRequest0.b = gfku2;
        fbuo fbuo0 = new fbuo(this, buyFlowConfig0, idCreditSubmitRequest0.a, gfku2, idCreditSubmitRequest0);
        return this.h.a(fbuo0);
    }

    @Override  // fbug
    public final ServerResponse I(BuyFlowConfig buyFlowConfig0, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest0) {
        batl.c(instrumentManagerSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitIm.");
        gflf gflf0 = (gflf)instrumentManagerSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gflf0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gflf0));
        gesx gesx0 = ((gflf)instrumentManagerSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gflf gflf1 = (gflf)hftp0.b_message;
        gesx1.getClass();
        gflf1.c = gesx1;
        gflf1.b |= 1;
        gflf gflf2 = (gflf)hftp0.N_build();
        instrumentManagerSubmitRequest0.b = gflf2;
        fbvp fbvp0 = new fbvp(this, buyFlowConfig0, instrumentManagerSubmitRequest0.a, gflf2, instrumentManagerSubmitRequest0);
        return this.h.a(fbvp0);
    }

    @Override  // fbug
    public final ServerResponse J(BuyFlowConfig buyFlowConfig0, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest0) {
        batl.c(paymentMethodsSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitPaymentMethods.");
        gfmc gfmc0 = (gfmc)paymentMethodsSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfmc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfmc0));
        gesx gesx0 = ((gfmc)paymentMethodsSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfmc gfmc1 = (gfmc)hftp0.b_message;
        gesx1.getClass();
        gfmc1.c = gesx1;
        gfmc1.b |= 1;
        gfmc gfmc2 = (gfmc)hftp0.N_build();
        paymentMethodsSubmitRequest0.b = gfmc2;
        fbur fbur0 = new fbur(this, buyFlowConfig0, paymentMethodsSubmitRequest0.a, gfmc2, paymentMethodsSubmitRequest0);
        return this.h.a(fbur0);
    }

    @Override  // fbug
    public final ServerResponse K(BuyFlowConfig buyFlowConfig0, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest0) {
        batl.c(purchaseManagerSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitPm.");
        hcgr hcgr0 = (hcgr)purchaseManagerSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcgr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcgr0));
        gesx gesx0 = ((hcgr)purchaseManagerSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcgr hcgr1 = (hcgr)hftp0.b_message;
        gesx1.getClass();
        hcgr1.c = gesx1;
        hcgr1.b |= 1;
        hcgr hcgr2 = (hcgr)hftp0.N_build();
        purchaseManagerSubmitRequest0.b = hcgr2;
        fbvt fbvt0 = new fbvt(this, buyFlowConfig0, purchaseManagerSubmitRequest0.a, hcgr2, purchaseManagerSubmitRequest0);
        return this.h.a(fbvt0);
    }

    @Override  // fbug
    public final ServerResponse L(BuyFlowConfig buyFlowConfig0, SetupWizardSubmitRequest setupWizardSubmitRequest0) {
        batl.c(setupWizardSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitId.");
        gesx gesx0 = ((hcdl)setupWizardSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        hcdl hcdl0 = (hcdl)setupWizardSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcdl0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcdl0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdl hcdl1 = (hcdl)hftp0.b_message;
        gesx1.getClass();
        hcdl1.c = gesx1;
        hcdl1.b |= 1;
        hcdl hcdl2 = (hcdl)hftp0.N_build();
        setupWizardSubmitRequest0.b = hcdl2;
        fbvv fbvv0 = new fbvv(this, buyFlowConfig0, setupWizardSubmitRequest0.a, hcdl2, setupWizardSubmitRequest0);
        return this.h.a(fbvv0);
    }

    @Override  // fbug
    public final ServerResponse M(BuyFlowConfig buyFlowConfig0, TimelineViewSubmitRequest timelineViewSubmitRequest0) {
        batl.c(timelineViewSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitTimelineView.");
        hchr hchr0 = (hchr)timelineViewSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hchr0));
        gesx gesx0 = ((hchr)timelineViewSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchr hchr1 = (hchr)hftp0.b_message;
        gesx1.getClass();
        hchr1.c = gesx1;
        hchr1.b |= 1;
        hchr hchr2 = (hchr)hftp0.N_build();
        timelineViewSubmitRequest0.b = hchr2;
        fbvd fbvd0 = new fbvd(this, buyFlowConfig0, timelineViewSubmitRequest0.a, hchr2, timelineViewSubmitRequest0);
        return this.h.a(fbvd0);
    }

    @Override  // fbug
    public final ServerResponse N(BuyFlowConfig buyFlowConfig0, VerifyMerchantRegistrationServerRequest verifyMerchantRegistrationServerRequest0) {
        fbvl fbvl0 = new fbvl(this, buyFlowConfig0, verifyMerchantRegistrationServerRequest0.a, verifyMerchantRegistrationServerRequest0);
        return this.h.a(fbvl0);
    }

    @Override  // fbug
    public final ServerResponse O(BuyFlowConfig buyFlowConfig0, WriteDocumentServerRequest writeDocumentServerRequest0) {
        Throwable throwable2;
        ServerResponse serverResponse0;
        ParcelFileDescriptor parcelFileDescriptor1;
        gfjy gfjy0 = (gfjy)writeDocumentServerRequest0.a();
        byte[] arr_b = new byte[0];
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        try {
            parcelFileDescriptor1 = this.f.getContentResolver().openFileDescriptor(writeDocumentServerRequest0.d, "r");
            if(parcelFileDescriptor1 != null) {
                goto label_5;
            }
            goto label_35;
        }
        catch(IOException unused_ex) {
            goto label_16;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_30;
        }
        try {
        label_5:
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(new FileInputStream(parcelFileDescriptor1.getFileDescriptor()));
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byte[] arr_b1 = new byte[0x400];
            for(int v = bufferedInputStream0.read(arr_b1); v != -1; v = bufferedInputStream0.read(arr_b1)) {
                byteArrayOutputStream0.write(arr_b1, 0, v);
            }
            arr_b = byteArrayOutputStream0.toByteArray();
            goto label_35;
        }
        catch(IOException unused_ex) {
            parcelFileDescriptor0 = parcelFileDescriptor1;
            try {
            label_16:
                Log.e("NetworkOrchService", "Error reading file");
                serverResponse0 = ServerResponse.e;
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
                goto label_30;
            }
            if(parcelFileDescriptor0 != null) {
                try {
                    parcelFileDescriptor0.close();
                    return serverResponse0;
                }
                catch(IOException unused_ex) {
                    Log.e("NetworkOrchService", "Error closing file descriptor");
                }
            }
            return serverResponse0;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            parcelFileDescriptor0 = parcelFileDescriptor1;
        }
    label_30:
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(IOException unused_ex) {
                Log.e("NetworkOrchService", "Error closing file descriptor");
            }
        }
        throw throwable2;
    label_35:
        if(parcelFileDescriptor1 != null) {
            try {
                parcelFileDescriptor1.close();
            }
            catch(IOException unused_ex) {
                Log.e("NetworkOrchService", "Error closing file descriptor");
            }
        }
        int v1 = gexq.a(gfjy0.b) == 0 ? 1 : gexq.a(gfjy0.b);
        switch(v1 - 1) {
            case 1: {
                parcelFileDescriptor0 = "IMAGE_PNG";
                break;
            }
            case 2: {
                parcelFileDescriptor0 = "IMAGE_JPEG";
                break;
            }
            default: {
                Log.e("NetworkOrchService", "MIME type unspecified or unsupported: " + (v1 - 1));
            }
        }
        if(parcelFileDescriptor0 == null) {
            return ServerResponse.e;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new Pair("s7e_file", Base64.encodeToString(arr_b, 10)));
        arrayList0.add(new Pair("s7e_keytype", Integer.toString(gfjy0.d)));
        arrayList0.add(new Pair("mime_type", parcelFileDescriptor0));
        arrayList0.add(new Pair("file_name", gfjy0.c));
        arrayList0.add(new Pair("os_type", "android"));
        arrayList0.add(new Pair("upload_token", Base64.encodeToString(gfjy0.e.toByteArray(), 2)));
        fbuu fbuu0 = new fbuu(this, buyFlowConfig0, writeDocumentServerRequest0.a, writeDocumentServerRequest0.e, arrayList0);
        return this.h.a(fbuu0);
    }

    static FutureTask P(Context context0, Account account0, BuyFlowConfig buyFlowConfig0) {
        return fbvw.T(account0, fbdv.a(context0, buyFlowConfig0));
    }

    final SecureElementStoredValue[] Q(Account account0, BuyFlowConfig buyFlowConfig0) {
        SecureElementStoredValue[] arr_secureElementStoredValue;
        if(this.e == null) {
            this.e = fbvw.P(this.f, account0, buyFlowConfig0);
        }
        try {
            arr_secureElementStoredValue = (SecureElementStoredValue[])this.e.get(hznd.d(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            arr_secureElementStoredValue = new SecureElementStoredValue[0];
        }
        this.e = null;
        return arr_secureElementStoredValue == null ? new SecureElementStoredValue[0] : arr_secureElementStoredValue;
    }

    public static final String R(BuyFlowConfig buyFlowConfig0) {
        return fbya.b(buyFlowConfig0.b.a);
    }

    public static final String S(BuyFlowConfig buyFlowConfig0, String s) {
        return fbya.c(buyFlowConfig0.b.a, s);
    }

    static FutureTask T(Account account0, gctm gctm0) {
        bblp bblp0 = new bblp(1, 9);
        FutureTask futureTask0 = new FutureTask(new fbdu(gctm0, account0));
        bblp0.execute(futureTask0);
        return futureTask0;
    }

    final SecureElementStoredValue[] U(Account account0, gctm gctm0) {
        SecureElementStoredValue[] arr_secureElementStoredValue;
        if(this.e == null) {
            this.e = fbvw.T(account0, gctm0);
        }
        try {
            arr_secureElementStoredValue = (SecureElementStoredValue[])this.e.get(hznd.d(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            arr_secureElementStoredValue = new SecureElementStoredValue[0];
        }
        this.e = null;
        return arr_secureElementStoredValue == null ? new SecureElementStoredValue[0] : arr_secureElementStoredValue;
    }

    public final ServerResponse V(String s, gamm gamm0, Object object0, int v) {
        return (ServerResponse)fbdx.a(new fbvm(this, object0, s, gamm0, v));
    }

    public final ServerResponse W(String s, gamm gamm0, Object object0, List list0, int v) {
        return (ServerResponse)fbdx.a(new fbvn(this, object0, list0, s, gamm0, v));
    }

    @Override  // fbug
    public final BuyFlowIntegratorDataResponse a(BuyFlowConfig buyFlowConfig0, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest0) {
        throw new UnsupportedOperationException("getBuyFlowIntegratorData not implemented in NetworkOrchestrationService");
    }

    @Override  // fbug
    public final BuyflowResponse c(BuyFlowConfig buyFlowConfig0, ExecuteBuyFlowRequest executeBuyFlowRequest0) {
        gfhi gfhi0;
        String s5;
        ProtoLiteBuilder hftp8;
        gfar gfar0;
        geyr geyr0;
        geza geza0;
        gexh gexh0;
        gfdp gfdp0;
        gexk gexk0;
        Account account0 = buyFlowConfig0.b.b;
        batl.t(account0, "buyFlowConfig must have buyer account set");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geqj.a).v_newBuilder();
        fbbw fbbw0 = (fbbw)gbgs.b().N_build();
        gamy gamy0 = this.k;
        Context context0 = this.f;
        gera gera0 = null;
        gesx gesx0 = fbox.c(gamy0, buyFlowConfig0, context0, fbbw0, null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geqj geqj0 = (geqj)hftp0.b_message;
        gesx0.getClass();
        geqj0.c = gesx0;
        geqj0.b |= 1;
        ByteString hfsf0 = ByteString.copyFrom(executeBuyFlowRequest0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geqj geqj1 = (geqj)hftp0.b_message;
        geqj1.b |= 2;
        geqj1.d = hfsf0;
        byte[] arr_b = executeBuyFlowRequest0.b;
        if(arr_b.length > 0) {
            gers gers0 = fbvx.a(arr_b);
            if(gers0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((geqj)hftp0.b_message).e = gers0;
                ((geqj)hftp0.b_message).b |= 4;
            }
        }
        BuyflowResponse buyflowResponse0 = this.d(buyFlowConfig0, new BuyflowInitializeRequest(account0, ((geqj)hftp0.N_build()), hfyv.a));
        ServerResponse serverResponse0 = buyflowResponse0.a;
        if(serverResponse0.b() == 33) {
            geqk geqk0 = (geqk)serverResponse0.c();
            if((hcdu.b(geqk0.i) == null ? hcdu.a : hcdu.b(geqk0.i)) == hcdu.h) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gerd.a).v_newBuilder();
                hfyv hfyv0 = buyflowResponse0.b;
                byte[] arr_b1 = hfyv0.c.toByteArray();
                gesx gesx1 = ((geqj)hftp0.b_message).c;
                if(gesx1 == null) {
                    gesx1 = gesx.a;
                }
                gesx gesx2 = fbvx.e(arr_b1, null, null, gesx1.l, buyFlowConfig0, context0, true, true, gamy0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gerd gerd0 = (gerd)hftp1.b_message;
                gesx2.getClass();
                gerd0.c = gesx2;
                gerd0.b |= 1;
                geqz geqz0 = geqk0.g == null ? geqz.b : geqk0.g;
                if(geqz0 != null) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gera.a).v_newBuilder();
                    if((geqz0.c & 0x400) != 0) {
                        gexj gexj0 = geqz0.p == null ? gexj.a : geqz0.p;
                        if(gexj0 == null) {
                            gexk0 = null;
                        }
                        else {
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gexk.a).v_newBuilder();
                            if((gexj0.b & 8) != 0) {
                                geyh geyh0 = gcil.g((gexj0.f == null ? geyg.a : gexj0.f));
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gexk gexk1 = (gexk)hftp3.b_message;
                                geyh0.getClass();
                                gexk1.c = geyh0;
                                gexk1.b |= 1;
                            }
                            if((gexj0.b & 4) != 0) {
                                geuj geuj0 = gcil.b((gexj0.e == null ? geui.d : gexj0.e));
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gexk gexk2 = (gexk)hftp3.b_message;
                                geuj0.getClass();
                                gexk2.d = geuj0;
                                gexk2.b |= 2;
                            }
                            String s = (gexj0.d == null ? geuk.a : gexj0.d).d;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gexk gexk3 = (gexk)hftp3.b_message;
                            s.getClass();
                            gexk3.b |= 8;
                            gexk3.f = s;
                            String s1 = gcil.i((gexj0.g == null ? gfbt.a : gexj0.g), ((gexk)hftp3.b_message).f);
                            if(s1 != null) {
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gexk gexk4 = (gexk)hftp3.b_message;
                                gexk4.b |= 4;
                                gexk4.e = s1;
                            }
                            if(gexj0.h.size() == 1) {
                                gfdn gfdn0 = (gfdn)gexj0.h.get(0);
                                if(gfdn0 == null) {
                                    gfdp0 = null;
                                }
                                else {
                                    int v = gfdn0.f.size();
                                    gfdo gfdo0 = (gfdo)((ProtoLiteMessage)gfdp.a).v_newBuilder();
                                    if((gfdn0.b & 2) == 0) {
                                        String s3 = gfdn0.c;
                                        if(!gfdo0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gfdo0).ensureMutable();
                                        }
                                        gfdp gfdp4 = (gfdp)gfdo0.b_message;
                                        s3.getClass();
                                        gfdp4.b |= 1;
                                        gfdp4.c = s3;
                                    }
                                    else {
                                        String s2 = (gfdn0.d == null ? gewg.a : gfdn0.d).c;
                                        if(!gfdo0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gfdo0).ensureMutable();
                                        }
                                        gfdp gfdp1 = (gfdp)gfdo0.b_message;
                                        s2.getClass();
                                        gfdp1.b |= 1;
                                        gfdp1.c = s2;
                                        long v1 = (gfdn0.d == null ? gewg.a : gfdn0.d).d;
                                        if(!gfdo0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gfdo0).ensureMutable();
                                        }
                                        gfdp gfdp2 = (gfdp)gfdo0.b_message;
                                        gfdp2.b |= 2;
                                        gfdp2.d = v1;
                                        ByteString hfsf1 = (gfdn0.d == null ? gewg.a : gfdn0.d).e;
                                        if(!gfdo0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gfdo0).ensureMutable();
                                        }
                                        gfdp gfdp3 = (gfdp)gfdo0.b_message;
                                        hfsf1.getClass();
                                        gfdp3.b |= 4;
                                        gfdp3.e = hfsf1;
                                    }
                                    for(int v2 = 0; v2 < v; ++v2) {
                                        gfdo0.a(gcil.h(((gfjj)gfdn0.f.get(v2))));
                                    }
                                    gfdp0 = (gfdp)((ProtoLiteBuilder)gfdo0).N_build();
                                }
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gexk gexk5 = (gexk)hftp3.b_message;
                                gfdp0.getClass();
                                gexk5.g = gfdp0;
                                gexk5.b |= 16;
                            }
                            gexk0 = (gexk)hftp3.N_build();
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera1 = (gera)hftp2.b_message;
                        gexk0.getClass();
                        gera1.c = gexk0;
                        gera1.b |= 1;
                    }
                    if((geqz0.c & 0x800) != 0) {
                        gexg gexg0 = geqz0.q == null ? gexg.a : geqz0.q;
                        if(gexg0 == null) {
                            gexh0 = null;
                        }
                        else {
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gexh.a).v_newBuilder();
                            gfjo gfjo0 = gcil.h((gexg0.c == null ? gfjj.a : gexg0.c));
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            gexh gexh1 = (gexh)hftp4.b_message;
                            gfjo0.getClass();
                            gexh1.c = gfjo0;
                            gexh1.b |= 1;
                            gexh0 = (gexh)hftp4.N_build();
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera2 = (gera)hftp2.b_message;
                        gexh0.getClass();
                        gera2.d = gexh0;
                        gera2.b |= 2;
                    }
                    if((geqz0.c & 0x4000) != 0) {
                        geyz geyz0 = geqz0.t == null ? geyz.a : geqz0.t;
                        if(geyz0 == null) {
                            geza0 = null;
                        }
                        else {
                            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)geza.a).v_newBuilder();
                            Object object0 = fbdd.d(geyz0);
                            if((object0 instanceof geyw)) {
                                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)geyx.a).v_newBuilder();
                                String s4 = ((geyw)object0).d;
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                geyx geyx0 = (geyx)hftp6.b_message;
                                s4.getClass();
                                geyx0.b |= 1;
                                geyx0.c = s4;
                                if(((geyw)object0).e.size() > 0) {
                                    ByteString hfsf2 = ((geyw)object0).e;
                                    if(!hftp6.b_message.isImmutable()) {
                                        hftp6.ensureMutable();
                                    }
                                    geyx geyx1 = (geyx)hftp6.b_message;
                                    hfsf2.getClass();
                                    geyx1.b |= 2;
                                    geyx1.d = hfsf2;
                                }
                                if(fbgn.J(((geyw)object0))) {
                                    geyq geyq0 = ((geyw)object0).o;
                                    if(geyq0 == null) {
                                        geyq0 = geyq.a;
                                    }
                                    if(geyq0 == null) {
                                        geyr0 = null;
                                    }
                                    else {
                                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)geyr.a).v_newBuilder();
                                        if((geyq0.b & 16) != 0) {
                                            geyh geyh1 = gcil.g((geyq0.f == null ? geyg.a : geyq0.f));
                                            if(!hftp7.b_message.isImmutable()) {
                                                hftp7.ensureMutable();
                                            }
                                            geyr geyr1 = (geyr)hftp7.b_message;
                                            geyh1.getClass();
                                            geyr1.e = geyh1;
                                            geyr1.b |= 4;
                                        }
                                        if((geyq0.b & 8) != 0) {
                                            gfaq gfaq0 = geyq0.e == null ? gfaq.b : geyq0.e;
                                            if(gfaq0 == null) {
                                                gfar0 = null;
                                            }
                                            else {
                                                if((gfaq0.c & 0x2000) == 0) {
                                                    hftp8 = ((ProtoLiteMessage)gfar.a).v_newBuilder();
                                                }
                                                else {
                                                    gfar gfar1 = gfaq0.p == null ? gfar.a : gfaq0.p;
                                                    hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)gfar1).jf(5, null);
                                                    hftp8.X(((ProtoLiteMessage)gfar1));
                                                }
                                                if((gfaq0.c & 0x1000) != 0) {
                                                    geuj geuj1 = gcil.b((gfaq0.o == null ? geui.d : gfaq0.o));
                                                    if(!hftp8.b_message.isImmutable()) {
                                                        hftp8.ensureMutable();
                                                    }
                                                    gfar gfar2 = (gfar)hftp8.b_message;
                                                    geuj1.getClass();
                                                    gfar2.h = geuj1;
                                                    gfar2.b |= 0x20;
                                                }
                                                if((gfaq0.c & 0x4000) != 0) {
                                                    gfar gfar3 = (gfar)hftp8.b_message;
                                                    if((gfar3.b & 0x20) == 0) {
                                                        s5 = null;
                                                    }
                                                    else {
                                                        geuj geuj2 = gfar3.h == null ? geuj.a : gfar3.h;
                                                        s5 = (geuj2.f == null ? gwey.a : geuj2.f).c;
                                                    }
                                                    String s6 = gcil.i((gfaq0.r == null ? gfbt.a : gfaq0.r), s5);
                                                    if(!hftp8.b_message.isImmutable()) {
                                                        hftp8.ensureMutable();
                                                    }
                                                    gfar gfar4 = (gfar)hftp8.b_message;
                                                    s6.getClass();
                                                    gfar4.b |= 0x80;
                                                    gfar4.j = s6;
                                                }
                                                gfar0 = (gfar)hftp8.N_build();
                                            }
                                            if(!hftp7.b_message.isImmutable()) {
                                                hftp7.ensureMutable();
                                            }
                                            geyr geyr2 = (geyr)hftp7.b_message;
                                            gfar0.getClass();
                                            geyr2.d = gfar0;
                                            geyr2.b |= 2;
                                        }
                                        geuj geuj3 = gcil.b((geyq0.d == null ? geui.d : geyq0.d));
                                        if(geuj3 != null) {
                                            if(!hftp7.b_message.isImmutable()) {
                                                hftp7.ensureMutable();
                                            }
                                            ((geyr)hftp7.b_message).c = geuj3;
                                            ((geyr)hftp7.b_message).b |= 1;
                                        }
                                        geyr0 = (geyr)hftp7.N_build();
                                    }
                                    if(!hftp6.b_message.isImmutable()) {
                                        hftp6.ensureMutable();
                                    }
                                    geyx geyx2 = (geyx)hftp6.b_message;
                                    geyr0.getClass();
                                    geyx2.e = geyr0;
                                    geyx2.b |= 4;
                                }
                                if(!hftp5.b_message.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                geza geza1 = (geza)hftp5.b_message;
                                geyx geyx3 = (geyx)hftp6.N_build();
                                geyx3.getClass();
                                geza1.c = geyx3;
                                geza1.b = 1;
                            }
                            else if((object0 instanceof geyp)) {
                                geyg geyg0 = ((geyp)object0).f;
                                if(geyg0 == null) {
                                    geyg0 = geyg.a;
                                }
                                geyh geyh2 = gcil.g(geyg0);
                                if(geyh2 != null) {
                                    if(!hftp5.b_message.isImmutable()) {
                                        hftp5.ensureMutable();
                                    }
                                    ((geza)hftp5.b_message).c = geyh2;
                                    ((geza)hftp5.b_message).b = 2;
                                }
                            }
                            geza0 = (geza)hftp5.N_build();
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera3 = (gera)hftp2.b_message;
                        geza0.getClass();
                        gera3.i = geza0;
                        gera3.b |= 0x20;
                    }
                    if((geqz0.c & 0x40000) != 0) {
                        gfhh gfhh0 = geqz0.v == null ? gfhh.a : geqz0.v;
                        if(gfhh0 == null) {
                            gfhi0 = null;
                        }
                        else {
                            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gfhi.a).v_newBuilder();
                            String s7 = gfhh0.b;
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            gfhi gfhi1 = (gfhi)hftp9.b_message;
                            s7.getClass();
                            gfhi1.b |= 1;
                            gfhi1.c = s7;
                            int v3 = gfhh0.f;
                            if(v3 >= 0 && v3 < gfhh0.e.size()) {
                                gfjo gfjo1 = gcil.h(((gfjj)gfhh0.e.get(v3)));
                                if(!hftp9.b_message.isImmutable()) {
                                    hftp9.ensureMutable();
                                }
                                gfhi gfhi2 = (gfhi)hftp9.b_message;
                                gfjo1.getClass();
                                gfhi2.d = gfjo1;
                                gfhi2.b |= 2;
                            }
                            gfhi0 = (gfhi)hftp9.N_build();
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera4 = (gera)hftp2.b_message;
                        gfhi0.getClass();
                        gera4.e = gfhi0;
                        gera4.b |= 8;
                    }
                    if(gcil.i((geqz0.x == null ? gfbt.a : geqz0.x), null) != null) {
                        String s8 = gcil.i((geqz0.x == null ? gfbt.a : geqz0.x), null);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera5 = (gera)hftp2.b_message;
                        s8.getClass();
                        gera5.b();
                        gera5.g.add(s8);
                    }
                    int v4 = geqz0.J.size();
                    for(int v5 = 0; v5 < v4; ++v5) {
                        geww geww0 = gcil.e(((gewu)geqz0.J.get(v5)));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera6 = (gera)hftp2.b_message;
                        geww0.getClass();
                        gera6.c();
                        gera6.l.add(geww0);
                    }
                    if((geqz0.c & 4) != 0) {
                        ByteString hfsf3 = geqz0.f;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gera gera7 = (gera)hftp2.b_message;
                        hfsf3.getClass();
                        gera7.b |= 16;
                        gera7.h = hfsf3;
                    }
                    gera0 = (gera)hftp2.N_build();
                }
                if(gera0 != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gerd)hftp1.b_message).d = gera0;
                    ((gerd)hftp1.b_message).b |= 2;
                }
                geqj geqj2 = (geqj)hftp0.b_message;
                if((geqj2.b & 2) != 0) {
                    ByteString hfsf4 = geqj2.d;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gerd gerd1 = (gerd)hftp1.b_message;
                    hfsf4.getClass();
                    gerd1.b |= 4;
                    gerd1.e = hfsf4;
                }
                geqj geqj3 = (geqj)hftp0.b_message;
                if((geqj3.b & 4) != 0) {
                    gers gers1 = geqj3.e == null ? gers.b : geqj3.e;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gerd gerd2 = (gerd)hftp1.b_message;
                    gers1.getClass();
                    gerd2.f = gers1;
                    gerd2.b |= 8;
                }
                return this.f(buyFlowConfig0, new BuyflowSubmitRequest(account0, ((gerd)hftp1.N_build()), new byte[0], null, hfyv0, (geqk0.e == null ? getf.a : geqk0.e).b));
            }
        }
        return buyflowResponse0;
    }

    @Override  // fbug
    public final BuyflowResponse d(BuyFlowConfig buyFlowConfig0, BuyflowInitializeRequest buyflowInitializeRequest0) {
        geqj geqj0 = (geqj)buyflowInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)geqj0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)geqj0));
        gesx gesx0 = ((geqj)buyflowInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        Context context0 = this.f;
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, context0, hzqx.d(), hzqx.d(), this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geqj geqj1 = (geqj)hftp0.b_message;
        gesx1.getClass();
        geqj1.c = gesx1;
        geqj1.b |= 1;
        geqj geqj2 = (geqj)hftp0.N_build();
        buyflowInitializeRequest0.b = geqj2;
        gesx gesx2 = geqj2.c == null ? gesx.a : geqj2.c;
        gepm gepm0 = gesx2.c == 10 ? ((gepm)gesx2.d) : gepm.b;
        boolean z = (gepg.b(gepm0.S) == null ? gepg.a : gepg.b(gepm0.S)) == gepg.c;
        if(z) {
            gaxl.a();
            if(hzmb.c()) {
                gaxl.a();
                if(hzks.d()) {
                    gawf.a(context0).h();
                    gawf gawf0 = gawf.a(context0);
                    this.e = fbvw.T(buyflowInitializeRequest0.a, gawf0);
                }
                else {
                    fbdv.a(context0, buyFlowConfig0).h();
                    this.e = fbvw.P(context0, buyflowInitializeRequest0.a, buyFlowConfig0);
                }
            }
            else {
                fbdv.a(context0, buyFlowConfig0).h();
                this.e = fbvw.P(context0, buyflowInitializeRequest0.a, buyFlowConfig0);
            }
        }
        Account account0 = buyflowInitializeRequest0.a;
        gers gers0 = geqj2.e == null ? gers.b : geqj2.e;
        fbvo fbvo0 = new fbvo(this, buyFlowConfig0, account0, geqj2, (gers0.p == null ? hcao.a : gers0.p).f);
        ServerResponse serverResponse0 = this.h.a(fbvo0);
        BuyflowResponse buyflowResponse0 = new BuyflowResponse(serverResponse0, buyflowInitializeRequest0.c());
        if(serverResponse0.b() == 33) {
            geqk geqk0 = (geqk)serverResponse0.c();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)geqk0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)geqk0));
            hfyv hfyv0 = buyflowInitializeRequest0.c();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyv0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hfyv0));
            gete gete0 = ((geqk)hftp1.b_message).d;
            if(gete0 == null) {
                gete0 = gete.c;
            }
            ByteString hfsf0 = gete0.f;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfyv hfyv1 = (hfyv)hftp2.b_message;
            hfsf0.getClass();
            hfyv1.b |= 1;
            hfyv1.c = hfsf0;
            hfyv hfyv2 = (hfyv)hftp2.N_build();
            if(z) {
                geqk geqk1 = (geqk)hftp1.b_message;
                if((geqk1.b & 16) != 0) {
                    geqz geqz0 = geqk1.g == null ? geqz.b : geqk1.g;
                    if(fbds.a((geqz0.t == null ? geyz.a : geqz0.t)) == 1) {
                        gaxl.a();
                        SecureElementStoredValue[] arr_secureElementStoredValue = hzks.d() ? this.U(account0, gawf.a(context0)) : this.Q(account0, buyFlowConfig0);
                        geqz geqz1 = ((geqk)hftp1.b_message).g;
                        if(geqz1 == null) {
                            geqz1 = geqz.b;
                        }
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)geqz1).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)geqz1));
                        geqz geqz2 = ((geqk)hftp1.b_message).g;
                        if(geqz2 == null) {
                            geqz2 = geqz.b;
                        }
                        geyz geyz0 = fbds.b((geqz2.t == null ? geyz.a : geqz2.t), arr_secureElementStoredValue);
                        if(!((geqw)hftp3).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geqw)hftp3))).ensureMutable();
                        }
                        geqz geqz3 = (geqz)((geqw)hftp3).b_message;
                        geyz0.getClass();
                        geqz3.t = geyz0;
                        geqz3.c |= 0x4000;
                        geqz geqz4 = (geqz)((ProtoLiteBuilder)(((geqw)hftp3))).N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        geqk geqk2 = (geqk)hftp1.b_message;
                        geqz4.getClass();
                        geqk2.g = geqz4;
                        geqk2.b |= 16;
                        serverResponse0 = new ServerResponse(33, ((MessageLite)hftp1.N_build()));
                    }
                }
            }
            return new BuyflowResponse(serverResponse0, hfyv2);
        }
        return buyflowResponse0;
    }

    @Override  // fbug
    public final BuyflowResponse e(BuyFlowConfig buyFlowConfig0, BuyflowRefreshRequest buyflowRefreshRequest0) {
        boolean z = false;
        batl.c(buyflowRefreshRequest0.c != null, "No SecureDataHeader provided when performing submitBuyflow.");
        gerb gerb0 = (gerb)buyflowRefreshRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gerb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gerb0));
        gesx gesx0 = ((gerb)buyflowRefreshRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z1 = hzqx.d();
        boolean z2 = hzqx.d();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z1, z2, this.k);
        Context context0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gerb gerb1 = (gerb)hftp0.b_message;
        gesx1.getClass();
        gerb1.c = gesx1;
        gerb1.b |= 1;
        gerb gerb2 = (gerb)hftp0.N_build();
        buyflowRefreshRequest0.b = gerb2;
        gesx gesx2 = gerb2.c == null ? gesx.a : gerb2.c;
        gepm gepm0 = gesx2.c == 10 ? ((gepm)gesx2.d) : gepm.b;
        if((gepg.b(gepm0.S) == null ? gepg.a : gepg.b(gepm0.S)) == gepg.c) {
            z = true;
        }
        if(z) {
            gaxl.a();
            if(hzmb.c()) {
                gaxl.a();
                if(hzks.d()) {
                    gawf.a(context0).h();
                    gawf gawf0 = gawf.a(context0);
                    this.e = fbvw.T(buyflowRefreshRequest0.a, gawf0);
                }
                else {
                    fbdv.a(context0, buyFlowConfig0).h();
                    this.e = fbvw.P(context0, buyflowRefreshRequest0.a, buyFlowConfig0);
                }
            }
            else {
                fbdv.a(context0, buyFlowConfig0).h();
                this.e = fbvw.P(context0, buyflowRefreshRequest0.a, buyFlowConfig0);
            }
        }
        fbvi fbvi0 = new fbvi(this, buyFlowConfig0, buyflowRefreshRequest0.a, gerb2, buyflowRefreshRequest0);
        Account account0 = buyflowRefreshRequest0.a;
        ServerResponse serverResponse0 = this.h.a(fbvi0);
        BuyflowResponse buyflowResponse0 = new BuyflowResponse(serverResponse0, buyflowRefreshRequest0.c());
        if(serverResponse0.b() == 35) {
            gerc gerc0 = (gerc)serverResponse0.c();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gerc0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gerc0));
            hfyv hfyv0 = buyflowRefreshRequest0.c();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyv0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hfyv0));
            gete gete0 = ((gerc)hftp1.b_message).d;
            if(gete0 == null) {
                gete0 = gete.c;
            }
            ByteString hfsf0 = gete0.f;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfyv hfyv1 = (hfyv)hftp2.b_message;
            hfsf0.getClass();
            hfyv1.b |= 1;
            hfyv1.c = hfsf0;
            hfyv hfyv2 = (hfyv)hftp2.N_build();
            if(z) {
                gerc gerc1 = (gerc)hftp1.b_message;
                if((gerc1.b & 8) != 0) {
                    geqz geqz0 = gerc1.f == null ? geqz.b : gerc1.f;
                    if(fbds.a((geqz0.t == null ? geyz.a : geqz0.t)) == 1) {
                        gaxl.a();
                        SecureElementStoredValue[] arr_secureElementStoredValue = hzks.d() ? this.U(account0, gawf.a(context0)) : this.Q(account0, buyFlowConfig0);
                        geqz geqz1 = ((gerc)hftp1.b_message).f;
                        if(geqz1 == null) {
                            geqz1 = geqz.b;
                        }
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)geqz1).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)geqz1));
                        geqz geqz2 = ((gerc)hftp1.b_message).f;
                        if(geqz2 == null) {
                            geqz2 = geqz.b;
                        }
                        geyz geyz0 = fbds.b((geqz2.t == null ? geyz.a : geqz2.t), arr_secureElementStoredValue);
                        if(!((geqw)hftp3).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geqw)hftp3))).ensureMutable();
                        }
                        geqz geqz3 = (geqz)((geqw)hftp3).b_message;
                        geyz0.getClass();
                        geqz3.t = geyz0;
                        geqz3.c |= 0x4000;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gerc gerc2 = (gerc)hftp1.b_message;
                        geqz geqz4 = (geqz)((ProtoLiteBuilder)(((geqw)hftp3))).N_build();
                        geqz4.getClass();
                        gerc2.f = geqz4;
                        gerc2.b |= 8;
                        serverResponse0 = new ServerResponse(35, ((MessageLite)hftp1.N_build()));
                    }
                }
            }
            return new BuyflowResponse(serverResponse0, hfyv2);
        }
        return buyflowResponse0;
    }

    @Override  // fbug
    public final BuyflowResponse f(BuyFlowConfig buyFlowConfig0, BuyflowSubmitRequest buyflowSubmitRequest0) {
        batl.c(buyflowSubmitRequest0.c != null, "No SecureDataHeader provided when performing submitBuyflow.");
        gerd gerd0 = (gerd)buyflowSubmitRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gerd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gerd0));
        gesx gesx0 = ((gerd)buyflowSubmitRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        Context context0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gerd gerd1 = (gerd)hftp0.b_message;
        gesx1.getClass();
        gerd1.c = gesx1;
        gerd1.b |= 1;
        if(buyflowSubmitRequest0.c().d || buyflowSubmitRequest0.e != null && (buyflowSubmitRequest0.e.c & 0x80) != 0) {
            byte[] arr_b = buyflowSubmitRequest0.d;
            if(arr_b != null) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gerd gerd2 = (gerd)hftp0.b_message;
                gerd2.b |= 4;
                gerd2.e = hfsf0;
            }
            gers gers0 = buyflowSubmitRequest0.e;
            if(gers0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gerd)hftp0.b_message).f = gers0;
                ((gerd)hftp0.b_message).b |= 8;
            }
        }
        buyflowSubmitRequest0.b = (gerd)hftp0.N_build();
        gesx gesx2 = ((gerd)hftp0.b_message).c;
        if(gesx2 == null) {
            gesx2 = gesx.a;
        }
        gepm gepm0 = gesx2.c == 10 ? ((gepm)gesx2.d) : gepm.b;
        boolean z = (gepg.b(gepm0.S) == null ? gepg.a : gepg.b(gepm0.S)) == gepg.c;
        if(z) {
            gaxl.a();
            if(hzmb.c()) {
                gaxl.a();
                if(hzks.d()) {
                    gawf.a(context0).h();
                    gawf gawf0 = gawf.a(context0);
                    this.e = fbvw.T(buyflowSubmitRequest0.a, gawf0);
                }
                else {
                    fbdv.a(context0, buyFlowConfig0).h();
                    this.e = fbvw.P(context0, buyflowSubmitRequest0.a, buyFlowConfig0);
                }
            }
            else {
                fbdv.a(context0, buyFlowConfig0).h();
                this.e = fbvw.P(context0, buyflowSubmitRequest0.a, buyFlowConfig0);
            }
        }
        fbux fbux0 = new fbux(this, buyFlowConfig0, buyflowSubmitRequest0.a, hftp0, buyflowSubmitRequest0);
        Account account0 = buyflowSubmitRequest0.a;
        ServerResponse serverResponse0 = this.h.a(fbux0);
        BuyflowResponse buyflowResponse0 = new BuyflowResponse(serverResponse0, buyflowSubmitRequest0.c());
        if(serverResponse0.b() == 34) {
            gere gere0 = (gere)serverResponse0.c();
            hfyv hfyv0 = buyflowSubmitRequest0.c();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyv0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hfyv0));
            ByteString hfsf1 = (gere0.d == null ? gete.c : gere0.d).f;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hfsf1.getClass();
            ((hfyv)hftv0).b |= 1;
            ((hfyv)hftv0).c = hfsf1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfyv hfyv1 = (hfyv)hftp1.b_message;
            hfyv1.b |= 2;
            hfyv1.d = false;
            hfyv hfyv2 = (hfyv)hftp1.N_build();
            if(z && (gere0.b & 0x20) != 0) {
                geqz geqz0 = gere0.g == null ? geqz.b : gere0.g;
                if(fbds.a((geqz0.t == null ? geyz.a : geqz0.t)) == 1) {
                    gaxl.a();
                    SecureElementStoredValue[] arr_secureElementStoredValue = hzks.d() ? this.U(account0, gawf.a(context0)) : this.Q(account0, buyFlowConfig0);
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gere0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)gere0));
                    geqz geqz1 = gere0.g == null ? geqz.b : gere0.g;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)geqz1).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)geqz1));
                    geqz geqz2 = gere0.g == null ? geqz.b : gere0.g;
                    geyz geyz0 = fbds.b((geqz2.t == null ? geyz.a : geqz2.t), arr_secureElementStoredValue);
                    if(!((geqw)hftp3).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((geqw)hftp3))).ensureMutable();
                    }
                    geqz geqz3 = (geqz)((geqw)hftp3).b_message;
                    geyz0.getClass();
                    geqz3.t = geyz0;
                    geqz3.c |= 0x4000;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gere gere1 = (gere)hftp2.b_message;
                    geqz geqz4 = (geqz)((ProtoLiteBuilder)(((geqw)hftp3))).N_build();
                    geqz4.getClass();
                    gere1.g = geqz4;
                    gere1.b |= 0x20;
                    serverResponse0 = new ServerResponse(34, ((MessageLite)(((gere)hftp2.N_build()))));
                }
            }
            return new BuyflowResponse(serverResponse0, hfyv2);
        }
        return buyflowResponse0;
    }

    @Override  // fbug
    public final FetchPaySeCardsResponse g(BuyFlowConfig buyFlowConfig0) {
        Account account0 = buyFlowConfig0.b.b;
        batl.t(account0, "buyFlowConfig must have buyer account set");
        gaxl.a();
        if(hzmb.c()) {
            gaxl.a();
            return hzks.d() ? new FetchPaySeCardsResponse(this.U(account0, gawf.a(this.f))) : new FetchPaySeCardsResponse(this.U(account0, fbdv.a(this.f, buyFlowConfig0)));
        }
        return new FetchPaySeCardsResponse(this.U(account0, fbdv.a(this.f, buyFlowConfig0)));
    }

    @Override  // fbug
    public final GcoreTapAndPayConsumerVerificationServerResponse h(BuyFlowConfig buyFlowConfig0, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest0) {
        eskw eskw0;
        TapAndPayConsumerVerificationResponse tapAndPayConsumerVerificationResponse0;
        fbwo fbwo0 = this.g;
        batl.t(fbwo0, "mLoggingTapAndPayApi can\'t be null when calling performTapAndPayConsumerVerification!");
        Account account0 = buyFlowConfig0.b.b;
        if(tapAndPayConsumerVerificationRequest0.c) {
            Status status0 = fbwo0.f(buyFlowConfig0, account0, null);
            if(!status0.e()) {
                Log.w("TapAndPayUtils", String.format(Locale.US, "Failed to report InApp manual unlock status = %s message = %s", ((int)status0.i), status0.j));
                tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 3);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
            }
        }
        if(tapAndPayConsumerVerificationRequest0.b) {
            long v = this.i.nextLong();
            eskw0 = fbwo0.h(buyFlowConfig0, new RetrieveInAppPaymentCredentialRequest(account0.name, tapAndPayConsumerVerificationRequest0.a, new TransactionData(v, tapAndPayConsumerVerificationRequest0.f, tapAndPayConsumerVerificationRequest0.h, tapAndPayConsumerVerificationRequest0.g, gged_interceptors.l(Integer.valueOf(1)), tapAndPayConsumerVerificationRequest0.e, tapAndPayConsumerVerificationRequest0.l, tapAndPayConsumerVerificationRequest0.k, null, null), (tapAndPayConsumerVerificationRequest0.i.length > 0 ? tapAndPayConsumerVerificationRequest0.i : null), tapAndPayConsumerVerificationRequest0.j, tapAndPayConsumerVerificationRequest0.m), tapAndPayConsumerVerificationRequest0.d, null);
        }
        else {
            eskw0 = null;
        }
        if(tapAndPayConsumerVerificationRequest0.m != 2 || eskw0 == null || !eskw0.a().e()) {
            azth azth0 = fbwo0.d(buyFlowConfig0, account0, null, tapAndPayConsumerVerificationRequest0.a);
            Status status1 = azth0.a;
            if(!status1.e()) {
                Log.w("TapAndPayUtils", String.format(Locale.US, "Failed to check if device was unlocked for payment! status = %s message = %s", ((int)status1.i), status1.j));
                tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 3);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
            }
            if(!azth0.b) {
                tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 1);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
            }
        }
        if(eskw0 != null) {
            if(eskw0.a().e()) {
                RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse0 = eskw0.b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcbr.a).v_newBuilder();
                String s = gcid.a(retrieveInAppPaymentCredentialResponse0.a);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hcbr hcbr0 = (hcbr)hftp0.b_message;
                hcbr0.b |= 1;
                hcbr0.c = s;
                String s1 = Base64.encodeToString(retrieveInAppPaymentCredentialResponse0.a(), 2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s1.getClass();
                ((hcbr)hftv0).b |= 2;
                ((hcbr)hftv0).d = s1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((hcbr)hftv1).i = 1;
                ((hcbr)hftv1).b |= 0x40;
                int v1 = retrieveInAppPaymentCredentialResponse0.c;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((hcbr)hftv2).b |= 4;
                ((hcbr)hftv2).e = v1;
                int v2 = retrieveInAppPaymentCredentialResponse0.d;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hcbr hcbr1 = (hcbr)hftp0.b_message;
                hcbr1.b |= 8;
                hcbr1.f = v2;
                String s2 = retrieveInAppPaymentCredentialResponse0.e;
                if(!TextUtils.isEmpty(s2)) {
                    String s3 = gcid.a(s2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcbr hcbr2 = (hcbr)hftp0.b_message;
                    hcbr2.b |= 16;
                    hcbr2.g = s3;
                }
                String s4 = retrieveInAppPaymentCredentialResponse0.f;
                if(!TextUtils.isEmpty(s4)) {
                    String s5 = gcid.a(s4);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcbr hcbr3 = (hcbr)hftp0.b_message;
                    hcbr3.b |= 0x20;
                    hcbr3.h = s5;
                }
                TapAndPayConsumerVerificationResponse tapAndPayConsumerVerificationResponse1 = new TapAndPayConsumerVerificationResponse(((hcbr)hftp0.N_build()), 0);
                fbwo0.j(buyFlowConfig0, account0, null);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse1.a, tapAndPayConsumerVerificationResponse1.b);
            }
            if(eskw0.a().i == 15001) {
                tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 2);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
            }
            Log.w("TapAndPayUtils", String.format(Locale.US, "Failed to retrieve in app payment credential! status = %s message = %s", ((int)eskw0.a().i), eskw0.a().j));
            tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 3);
            return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
        }
        tapAndPayConsumerVerificationResponse0 = new TapAndPayConsumerVerificationResponse(null, 0);
        return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse0.a, tapAndPayConsumerVerificationResponse0.b);
    }

    @Override  // fbug
    public final SetUpBiometricAuthenticationKeysServiceResponse i(BuyFlowConfig buyFlowConfig0, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest0) {
        boolean z;
        hfyz hfyz0;
        int v1;
        fbdw fbdw0 = fbdw.a(this.f, buyFlowConfig0);
        int v = buyFlowConfig0.b.a;
        Account account0 = buyFlowConfig0.b.b;
        fbwk fbwk0 = this.j;
        hfzc hfzc0 = fbwk0.c(v, account0);
        byte[] arr_b = setUpBiometricAuthenticationKeysRequest0.a;
        if(arr_b == null) {
            v1 = 2;
        }
        else {
            v1 = geuv.a(((gevk)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)gevk.a).jf(7, null)))).b);
            if(v1 == 0) {
                v1 = 1;
            }
        }
        gevm gevm0 = fben.a(hfzc0, v1);
        if(gevm0 != null && fbdw0.j(v1)) {
            return new SetUpBiometricAuthenticationKeysServiceResponse(new SetUpBiometricAuthenticationKeysResponse(gevm0.toBytesArray()), Status.b);
        }
        gevm gevm1 = fbdw0.f(v1);
        if(hfzc0 == null) {
            hfyz0 = (hfyz)((ProtoLiteMessage)hfzc.a).v_newBuilder();
        }
        else {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfzc0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfzc0));
            hfyz0 = (hfyz)hftp0;
        }
        int v2 = 0;
        switch(geuv.a(gevm1.f)) {
            case 0: {
                z = false;
                break;
            }
            case 1: {
                z = false;
                break;
            }
            default: {
                z = true;
            }
        }
        gftb.b(z, "Must set authenticator!");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: DesugarCollections.unmodifiableList(((hfzc)hfyz0.b_message).g)) {
            gevm gevm2 = (gevm)object0;
            if((geuv.a(gevm2.f) == 0 ? 1 : geuv.a(gevm2.f)) == (geuv.a(gevm1.f) == 0 ? 1 : geuv.a(gevm1.f))) {
                arrayList0.add(gevm1);
                gftb.s(((boolean)(v2 ^ 1)), "Repeated entries for authenticator = %s", (geuv.a(gevm1.f) == 0 ? 1 : geuv.a(gevm1.f)) - 1);
                v2 = 1;
            }
            else {
                arrayList0.add(gevm2);
            }
        }
        if(v2 == 0) {
            arrayList0.add(gevm1);
        }
        if(!hfyz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hfyz0).ensureMutable();
        }
        ((hfzc)hfyz0.b_message).g = hfvv.a;
        hfyz0.a(arrayList0);
        fbwk0.f(v, account0, ((hfzc)((ProtoLiteBuilder)hfyz0).N_build()));
        return new SetUpBiometricAuthenticationKeysServiceResponse(new SetUpBiometricAuthenticationKeysResponse(gevm1.toBytesArray()), Status.b);
    }

    @Override  // fbug
    public final ServerResponse j(BuyFlowConfig buyFlowConfig0, InitializeBuyFlowRequest initializeBuyFlowRequest0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geql.a).v_newBuilder();
        byte[][] arr2_b = initializeBuyFlowRequest0.b;
        for(int v = 0; v < arr2_b.length; ++v) {
            ByteString hfsf0 = ByteString.copyFrom(arr2_b[v]);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geql geql0 = (geql)hftp0.b_message;
            hfuo hfuo0 = geql0.d;
            if(!hfuo0.c()) {
                geql0.d = ProtoLiteMessage.E(hfuo0);
            }
            geql0.d.add(hfsf0);
        }
        gamy gamy0 = this.k;
        Context context0 = this.f;
        ProtoLiteBuilder hftp1 = gbgs.b();
        boolean z = hzqx.d();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fbbw fbbw0 = (fbbw)hftp1.b_message;
        fbbw0.b |= 8;
        fbbw0.h = z;
        gesx gesx0 = fbox.c(gamy0, buyFlowConfig0, context0, ((fbbw)hftp1.N_build()), null);
        if(hzqu.a.b().a()) {
            gesx0 = fbvx.b(gesx0);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geql geql1 = (geql)hftp0.b_message;
        gesx0.getClass();
        geql1.c = gesx0;
        geql1.b |= 1;
        fbvr fbvr0 = new fbvr(this, buyFlowConfig0, buyFlowConfig0.b.b, hftp0);
        return this.h.a(fbvr0);
    }

    @Override  // fbug
    public final ServerResponse k(BuyFlowConfig buyFlowConfig0, GetAccountEligibilityServerRequest getAccountEligibilityServerRequest0) {
        hcgx hcgx0 = (hcgx)getAccountEligibilityServerRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcgx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcgx0));
        gesx gesx0 = ((hcgx)getAccountEligibilityServerRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcgx hcgx1 = (hcgx)hftp0.b_message;
        gesx1.getClass();
        hcgx1.c = gesx1;
        hcgx1.b |= 1;
        hcgx hcgx2 = (hcgx)hftp0.N_build();
        getAccountEligibilityServerRequest0.b = hcgx2;
        fbvk fbvk0 = new fbvk(this, buyFlowConfig0, getAccountEligibilityServerRequest0.a, hcgx2);
        return this.h.a(fbvk0);
    }

    @Override  // fbug
    public final ServerResponse l(BuyFlowConfig buyFlowConfig0, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest0) {
        hchb hchb0 = (hchb)getInstrumentAvailabilityServerRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hchb0));
        gesx gesx0 = ((hchb)getInstrumentAvailabilityServerRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, true, true, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchb hchb1 = (hchb)hftp0.b_message;
        gesx1.getClass();
        hchb1.c = gesx1;
        hchb1.b |= 1;
        if(hzqu.a.b().b()) {
            gesx gesx2 = ((hchb)hftp0.b_message).c;
            if(gesx2 == null) {
                gesx2 = gesx.a;
            }
            gesx gesx3 = fbvx.b(gesx2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hchb hchb2 = (hchb)hftp0.b_message;
            gesx3.getClass();
            hchb2.c = gesx3;
            hchb2.b |= 1;
        }
        getInstrumentAvailabilityServerRequest0.b = (hchb)hftp0.N_build();
        fbvj fbvj0 = new fbvj(this, buyFlowConfig0, getInstrumentAvailabilityServerRequest0.a, hftp0);
        return this.h.a(fbvj0);
    }

    @Override  // fbug
    public final ServerResponse m(BuyFlowConfig buyFlowConfig0, UpstreamInitializeRequest upstreamInitializeRequest0) {
        hchu hchu0 = (hchu)upstreamInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchu0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hchu0));
        gesx gesx0 = ((hchu)upstreamInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.l();
        boolean z1 = hzqx.l();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchu hchu1 = (hchu)hftp0.b_message;
        gesx1.getClass();
        hchu1.c = gesx1;
        hchu1.b |= 1;
        hchu hchu2 = (hchu)hftp0.N_build();
        upstreamInitializeRequest0.b = hchu2;
        fbvg fbvg0 = new fbvg(this, buyFlowConfig0, upstreamInitializeRequest0.a, hchu2);
        return this.h.a(fbvg0);
    }

    @Override  // fbug
    public final ServerResponse n(BuyFlowConfig buyFlowConfig0, AddInstrumentInitializeRequest addInstrumentInitializeRequest0) {
        gepz gepz0 = (gepz)addInstrumentInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gepz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gepz0));
        gesx gesx0 = ((gepz)addInstrumentInitializeRequest0.a()).e;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.c();
        boolean z1 = hzqx.c();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gepz gepz1 = (gepz)hftp0.b_message;
        gesx1.getClass();
        gepz1.e = gesx1;
        gepz1.b |= 1;
        gepz gepz2 = (gepz)hftp0.N_build();
        addInstrumentInitializeRequest0.b = gepz2;
        fbuv fbuv0 = new fbuv(this, buyFlowConfig0, addInstrumentInitializeRequest0.a, gepz2);
        return this.h.a(fbuv0);
    }

    @Override  // fbug
    public final ServerResponse o(BuyFlowConfig buyFlowConfig0, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest0) {
        gesx gesx0 = ((hcga)embeddedLandingPageInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.e();
        boolean z1 = hzqx.e();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        hcga hcga0 = (hcga)embeddedLandingPageInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcga0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcga0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcga hcga1 = (hcga)hftp0.b_message;
        gesx1.getClass();
        hcga1.c = gesx1;
        hcga1.b |= 1;
        hcga hcga2 = (hcga)hftp0.N_build();
        embeddedLandingPageInitializeRequest0.b = hcga2;
        fbva fbva0 = new fbva(this, buyFlowConfig0, embeddedLandingPageInitializeRequest0.a, hcga2);
        return this.h.a(fbva0);
    }

    @Override  // fbug
    public final ServerResponse p(BuyFlowConfig buyFlowConfig0, FixInstrumentInitializeRequest fixInstrumentInitializeRequest0) {
        hcgg hcgg0 = (hcgg)fixInstrumentInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcgg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcgg0));
        gesx gesx0 = ((hcgg)fixInstrumentInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.f();
        boolean z1 = hzqx.f();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcgg hcgg1 = (hcgg)hftp0.b_message;
        gesx1.getClass();
        hcgg1.c = gesx1;
        hcgg1.b |= 1;
        hcgg hcgg2 = (hcgg)hftp0.N_build();
        fixInstrumentInitializeRequest0.b = hcgg2;
        fbuy fbuy0 = new fbuy(this, buyFlowConfig0, fixInstrumentInitializeRequest0.a, hcgg2);
        return this.h.a(fbuy0);
    }

    @Override  // fbug
    public final ServerResponse q(BuyFlowConfig buyFlowConfig0, GenericSelectorInitializeRequest genericSelectorInitializeRequest0) {
        gfkf gfkf0 = (gfkf)genericSelectorInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfkf0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfkf0));
        gesx gesx0 = ((gfkf)genericSelectorInitializeRequest0.a()).e;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.g();
        boolean z1 = hzqx.g();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfkf gfkf1 = (gfkf)hftp0.b_message;
        gesx1.getClass();
        gfkf1.e = gesx1;
        gfkf1.b |= 1;
        gfkf gfkf2 = (gfkf)hftp0.N_build();
        genericSelectorInitializeRequest0.b = gfkf2;
        fbus fbus0 = new fbus(this, buyFlowConfig0, genericSelectorInitializeRequest0.a, gfkf2, genericSelectorInitializeRequest0);
        return this.h.a(fbus0);
    }

    @Override  // fbug
    public final ServerResponse r(BuyFlowConfig buyFlowConfig0, IdCreditInitializeRequest idCreditInitializeRequest0) {
        gfkn gfkn0 = (gfkn)idCreditInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfkn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfkn0));
        gesx gesx0 = ((gfkn)idCreditInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.h();
        boolean z1 = hzqx.h();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfkn gfkn1 = (gfkn)hftp0.b_message;
        gesx1.getClass();
        gfkn1.c = gesx1;
        gfkn1.b |= 1;
        gfkn gfkn2 = (gfkn)hftp0.N_build();
        idCreditInitializeRequest0.b = gfkn2;
        fbun fbun0 = new fbun(this, buyFlowConfig0, idCreditInitializeRequest0.a, gfkn2);
        return this.h.a(fbun0);
    }

    @Override  // fbug
    public final ServerResponse s(BuyFlowConfig buyFlowConfig0, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest0) {
        gfky gfky0 = (gfky)instrumentManagerInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfky0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfky0));
        gesx gesx0 = ((gfky)instrumentManagerInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.i();
        boolean z1 = hzqx.i();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfky gfky1 = (gfky)hftp0.b_message;
        gesx1.getClass();
        gfky1.c = gesx1;
        gfky1.b |= 1;
        gfky gfky2 = (gfky)hftp0.N_build();
        instrumentManagerInitializeRequest0.b = gfky2;
        fbve fbve0 = new fbve(this, buyFlowConfig0, instrumentManagerInitializeRequest0.a, gfky2);
        return this.h.a(fbve0);
    }

    @Override  // fbug
    public final ServerResponse t(BuyFlowConfig buyFlowConfig0, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest0) {
        gflx gflx0 = (gflx)paymentMethodsInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gflx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gflx0));
        gesx gesx0 = ((gflx)paymentMethodsInitializeRequest0.a()).e;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.j();
        boolean z1 = hzqx.j();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gflx gflx1 = (gflx)hftp0.b_message;
        gesx1.getClass();
        gflx1.e = gesx1;
        gflx1.b |= 1;
        gflx gflx2 = (gflx)hftp0.N_build();
        paymentMethodsInitializeRequest0.b = gflx2;
        fbuq fbuq0 = new fbuq(this, buyFlowConfig0, paymentMethodsInitializeRequest0.a, gflx2);
        return this.h.a(fbuq0);
    }

    @Override  // fbug
    public final ServerResponse u(BuyFlowConfig buyFlowConfig0, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest0) {
        hcgn hcgn0 = (hcgn)purchaseManagerInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcgn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcgn0));
        gesx gesx0 = ((hcgn)purchaseManagerInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.a.b().i();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, false, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcgn hcgn1 = (hcgn)hftp0.b_message;
        gesx1.getClass();
        hcgn1.c = gesx1;
        hcgn1.b |= 1;
        hcgn hcgn2 = (hcgn)hftp0.N_build();
        fbvs fbvs0 = new fbvs(this, buyFlowConfig0, purchaseManagerInitializeRequest0.a, hcgn2);
        return this.h.a(fbvs0);
    }

    @Override  // fbug
    public final ServerResponse v(BuyFlowConfig buyFlowConfig0, SetupWizardInitializeRequest setupWizardInitializeRequest0) {
        hcdf hcdf0 = (hcdf)setupWizardInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcdf0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcdf0));
        gesx gesx0 = ((hcdf)setupWizardInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, false, false, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdf hcdf1 = (hcdf)hftp0.b_message;
        gesx1.getClass();
        hcdf1.c = gesx1;
        hcdf1.b |= 1;
        hcdf hcdf2 = (hcdf)hftp0.N_build();
        setupWizardInitializeRequest0.b = hcdf2;
        fbvu fbvu0 = new fbvu(this, buyFlowConfig0, setupWizardInitializeRequest0.a, hcdf2);
        return this.h.a(fbvu0);
    }

    @Override  // fbug
    public final ServerResponse w(BuyFlowConfig buyFlowConfig0, TimelineViewInitializeRequest timelineViewInitializeRequest0) {
        gesx gesx0 = ((hchn)timelineViewInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.k();
        boolean z1 = hzqx.k();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        hchn hchn0 = (hchn)timelineViewInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hchn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hchn0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hchn hchn1 = (hchn)hftp0.b_message;
        gesx1.getClass();
        hchn1.c = gesx1;
        hchn1.b |= 1;
        hchn hchn2 = (hchn)hftp0.N_build();
        timelineViewInitializeRequest0.b = hchn2;
        fbvc fbvc0 = new fbvc(this, buyFlowConfig0, timelineViewInitializeRequest0.a, hchn2);
        return this.h.a(fbvc0);
    }

    @Override  // fbug
    public final ServerResponse x(BuyFlowConfig buyFlowConfig0, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest0) {
        hcib hcib0 = (hcib)webViewWidgetInitializeRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcib0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcib0));
        gesx gesx0 = ((hcib)webViewWidgetInitializeRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.m();
        boolean z1 = hzqx.m();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcib hcib1 = (hcib)hftp0.b_message;
        gesx1.getClass();
        hcib1.c = gesx1;
        hcib1.b |= 1;
        hcib hcib2 = (hcib)hftp0.N_build();
        webViewWidgetInitializeRequest0.b = hcib2;
        fbvh fbvh0 = new fbvh(this, buyFlowConfig0, webViewWidgetInitializeRequest0.a, hcib2);
        return this.h.a(fbvh0);
    }

    @Override  // fbug
    public final ServerResponse y(BuyFlowConfig buyFlowConfig0, IdCreditRefreshRequest idCreditRefreshRequest0) {
        batl.c(idCreditRefreshRequest0.c != null, "No SecureDataHeader provided when performing refreshId.");
        gfks gfks0 = (gfks)idCreditRefreshRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfks0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfks0));
        gesx gesx0 = ((gfks)idCreditRefreshRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.h();
        boolean z1 = hzqx.h();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfks gfks1 = (gfks)hftp0.b_message;
        gesx1.getClass();
        gfks1.c = gesx1;
        gfks1.b |= 1;
        gfks gfks2 = (gfks)hftp0.N_build();
        idCreditRefreshRequest0.b = gfks2;
        fbup fbup0 = new fbup(this, buyFlowConfig0, idCreditRefreshRequest0.a, gfks2, idCreditRefreshRequest0);
        return this.h.a(fbup0);
    }

    @Override  // fbug
    public final ServerResponse z(BuyFlowConfig buyFlowConfig0, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest0) {
        batl.c(instrumentManagerRefreshRequest0.c != null, "No SecureDataHeader provided when performing refreshIm.");
        gesx gesx0 = ((gfld)instrumentManagerRefreshRequest0.a()).c;
        if(gesx0 == null) {
            gesx0 = gesx.a;
        }
        boolean z = hzqx.i();
        boolean z1 = hzqx.i();
        gesx gesx1 = fbvx.d(gesx0, buyFlowConfig0, this.f, z, z1, this.k);
        gfld gfld0 = (gfld)instrumentManagerRefreshRequest0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfld0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfld0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfld gfld1 = (gfld)hftp0.b_message;
        gesx1.getClass();
        gfld1.c = gesx1;
        gfld1.b |= 1;
        gfld gfld2 = (gfld)hftp0.N_build();
        instrumentManagerRefreshRequest0.b = gfld2;
        fbvq fbvq0 = new fbvq(this, buyFlowConfig0, instrumentManagerRefreshRequest0.a, gfld2, instrumentManagerRefreshRequest0);
        return this.h.a(fbvq0);
    }
}

