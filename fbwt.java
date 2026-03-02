import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.ocr.OcrAvailabilityRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.service.orchestration.VerifyMerchantRegistrationServerRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public final class fbwt extends cjtm {
    private final fbrc a;
    private final PaymentCardRecognitionIntentRequest b;
    private final fblx c;
    private final Bundle d;

    public fbwt(fbrc fbrc0, PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest0, fblx fblx0, Bundle bundle0) {
        super(4, "getPaymentCardRecognitionIntent");
        this.a = fbrc0;
        this.b = paymentCardRecognitionIntentRequest0;
        this.c = fblx0;
        this.d = bundle0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ServerResponse serverResponse0;
        Bundle bundle0 = this.d;
        String s = bundle0.getString("androidPackageName");
        batl.s(s);
        int v = bundle0.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 1);
        int v1 = this.b.a;
        Account account0 = fbru.m(context0, fbru.s(bundle0, null));
        if(!hzpt.a.b().a() && v != 3 && account0 == null) {
            this.j(new Status(5, "No valid account is found for the request."));
            return;
        }
        if(v != 3) {
            fbrc fbrc0 = this.a;
            String s1 = bundle0.getString("androidPackageName");
            batl.s(s1);
            BuyFlowConfig buyFlowConfig0 = fbru.s(bundle0, null);
            fbug fbug0 = fbrc0.g;
            if(account0 == null) {
                account0 = fbru.m(fbrc0.a, buyFlowConfig0);
            }
            hcdp hcdp0 = fbru.z(fbrc0.c.a(s1));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gflt.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfls.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gfls gfls0 = (gfls)hftp1.b_message;
            hcdp0.getClass();
            gfls0.c = hcdp0;
            gfls0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gflt gflt0 = (gflt)hftp0.b_message;
            gfls gfls1 = (gfls)hftp1.N_build();
            gfls1.getClass();
            gflt0.c = gfls1;
            gflt0.b = 2;
            gflt gflt1 = (gflt)hftp0.N_build();
            try {
                serverResponse0 = fbug0.N(buyFlowConfig0, new VerifyMerchantRegistrationServerRequest(account0, gflt1));
            }
            catch(RemoteException unused_ex) {
                this.j(new Status(10, "The Application invoking the current API hasn\'t registered for Google card recognition API."));
                return;
            }
            gflu gflu0 = (gflu)serverResponse0.c();
            if(gflu0 == null) {
                this.j(new Status(10, "The Application invoking the current API hasn\'t registered for Google card recognition API."));
                return;
            }
            if((gflu0.b & 1) != 0) {
                this.j(new Status(10, "The Application invoking the current API hasn\'t registered for Google card recognition API."));
                return;
            }
        }
        dklu dklu0 = new dklu(context0);
        try {
            int[] arr_v = (int[])evrg.n(dklu0.b(new OcrAvailabilityRequest(0L)));
            batl.s(arr_v);
        }
        catch(ExecutionException | InterruptedException | NullPointerException exception0) {
            this.j(new Status(8, "There was an internal error while validating requested paymentCardRecognitionType."));
            throw new IllegalStateException("Unable to get available DeviceBasedCardInputType from WalletOcrClient.", exception0);
        }
        if(!glwy.k(arr_v, (v1 == 1 ? 1 : 0))) {
            this.j(new Status(10, String.format(Locale.US, "The requested paymentCardRecognitionType: %d is not supported or invalid.", v1)));
            return;
        }
        gftb.b(((boolean)(TextUtils.isEmpty(s) ^ 1)), "A valid caller package name is required.");
        Intent intent0 = new Intent().setPackage("com.google.android.gms").setClassName("com.google.android.gms", "com.google.android.gms.wallet.ocr.CardRecognitionShimProxyActivity").putExtra("callerPackageName", s).putExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", v);
        PendingIntent pendingIntent0 = fqaw.a(context0, gcvi.a.getAndIncrement(), intent0, 0x44000000);
        gftb.check(pendingIntent0);
        PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse0 = new PaymentCardRecognitionIntentResponse(pendingIntent0);
        this.c.m(Status.b, paymentCardRecognitionIntentResponse0, Bundle.EMPTY);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.m(status0, null, Bundle.EMPTY);
    }
}

