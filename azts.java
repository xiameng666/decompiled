import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.google.android.gms.actionlearner.ContextData;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl.Operation;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.pay.BlockClosedLoopCardsRequest;
import com.google.android.gms.pay.ChangeSePostpaidDefaultStatusRequest;
import com.google.android.gms.pay.DeleteSePrepaidCardRequest;
import com.google.android.gms.pay.GetAttestationSignalRequest;
import com.google.android.gms.pay.GetImagesForValuableRequest;
import com.google.android.gms.pay.GetOnboardingInfoRequest;
import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusRequest;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.GetSePrepaidCardRequest;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GetValuablesFromServerRequest;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.GetWearClosedLoopCardsRequest;
import com.google.android.gms.pay.GetWearPaymentMethodsRequest;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;
import com.google.android.gms.pay.ProvisionSePrepaidCardRequest;
import com.google.android.gms.pay.RecoverSeCardRequest;
import com.google.android.gms.pay.RefreshSePostpaidsTransactionsFromChipRequest;
import com.google.android.gms.pay.RefreshSePrepaidTransactionsFromChipRequest;
import com.google.android.gms.pay.RemoveSePostpaidTokenRequest;
import com.google.android.gms.pay.SaveImagesForValuableRequest;
import com.google.android.gms.pay.SaveLocalValuablesRequest;
import com.google.android.gms.pay.SetOnboardingInfoRequest;
import com.google.android.gms.pay.SetSortOrderRequest;
import com.google.android.gms.pay.SetWalletItemSurfacingEnabledRequest;
import com.google.android.gms.pay.SyncTransactionsRequest;
import com.google.android.gms.pay.UpdateSettingsRequest;
import com.google.android.gms.serviceentitlement.AuthenticationException;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wearable.Channel;
import j..util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public class azts implements aztx, azty, erek, faik {
    public final azux A;
    public final Looper B;
    public final int C;
    public final aztw D;
    public final azxm E;
    private final azyx a;
    public final Context v;
    public final String w;
    public final bbso x;
    public final azta_api y;
    public final azsx z;

    public azts(Activity activity0) {
        this(activity0, activity0, dlgw.a, azsx.s, aztr_settings.a);
    }

    public azts(Activity activity0, ajqp ajqp0) {
        this(activity0, activity0, ajqn.a, ajqp0, aztr_settings.a);
    }

    @Deprecated
    public azts(Activity activity0, azta_api azta0, azsx azsx0, azyx azyx0) {
        aztq aztq0 = new aztq();
        aztq0.a = azyx0;
        aztq0.b(activity0.getMainLooper());
        this(activity0, activity0, azta0, azsx0, aztq0.a());
    }

    public azts(Context context0) {
        this(context0, abux.a, null, aztr_settings.a);
    }

    public azts(Context context0, adsz adsz0) {
        this(context0, adsx.a, adsz0, aztr_settings.a);
    }

    public azts(Context context0, ajqp ajqp0) {
        this(context0, ajqn.a, ajqp0, aztr_settings.a);
    }

    public azts(Context context0, Activity activity0, azta_api azta0, azsx azsx0, aztr_settings aztr0) {
        batl.t(context0, "Null context is not permitted.");
        batl.t(azta0, "Api must not be null.");
        batl.t(aztr0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context1 = context0.getApplicationContext();
        batl.t(context1, "The provided context did not have an application context.");
        this.v = context1;
        String s = azts.g(context0);
        this.w = s;
        this.x = azts.f(context0);
        this.y = azta0;
        this.z = azsx0;
        this.B = aztr0.c;
        azux azux0 = new azux(azta0, azsx0, s);
        this.A = azux0;
        this.D = new azxn(this);
        azxm azxm0 = azxm.d(context1);
        this.E = azxm0;
        this.C = azxm0.a();
        this.a = aztr0.b;
        if(activity0 != null && !(activity0 instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            azwc.l(activity0, azxm0, azux0);
        }
        azxm0.i(this);
    }

    public azts(Context context0, aqcr aqcr0) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, aqcq.a, aqcr0, aztr0);
        aqcr0.b(this.w);
    }

    public azts(Context context0, aqcr aqcr0, byte[] arr_b) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, aqcq.a, aqcr0, aztr0);
        aqcr0.b(this.w);
    }

    public azts(Context context0, aqcr aqcr0, char[] arr_c) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, aqcq.a, aqcr0, aztr0);
        aqcr0.b(this.w);
    }

    public azts(Context context0, aqcr aqcr0, int[] arr_v) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, aqcq.a, aqcr0, aztr0);
        aqcr0.b(this.w);
    }

    public azts(Context context0, aqcr aqcr0, short[] arr_v) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, aqcq.a, aqcr0, aztr0);
        aqcr0.b(this.w);
    }

    public azts(Context context0, axzj axzj0) {
        this(context0, ayss.a, axzj0, aztr_settings.a);
    }

    public azts(Context context0, axzj axzj0, byte[] arr_b) {
        this(context0, ayss.a, axzj0, aztr_settings.a);
    }

    public azts(Context context0, azta_api azta0, azsx azsx0, aztr_settings aztr0) {
        this(context0, null, azta0, azsx0, aztr0);
    }

    public azts(Context context0, efom efom0) {
        this(context0, efon.a, efom0, aztr_settings.a);
    }

    public azts(Context context0, efom efom0, byte[] arr_b) {
        this(context0, efon.a, efom0, aztr_settings.a);
    }

    public azts(Context context0, efom efom0, char[] arr_c) {
        this(context0, efon.a, efom0, aztr_settings.a);
    }

    public azts(Context context0, faig faig0) {
        this(context0, faih.a, faig0, aztr_settings.a);
    }

    public azts(Context context0, faxq faxq0) {
        this(context0, faxr.a, faxq0, aztr_settings.a);
    }

    public azts(Context context0, byte[] arr_b) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, cntw.a, azsx.s, aztr0);
    }

    public azts(Context context0, byte[] arr_b, byte[] arr_b1) {
        this(context0, exdq.b, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, char[] arr_c) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, ekoo.a, azsx.s, aztr0);
        if(ekpe.a == null) {
            synchronized(ekpe.class) {
                if(ekpe.a == null) {
                    ekpe.a = new ekpe();
                }
            }
        }
    }

    public azts(Context context0, char[] arr_c, byte[] arr_b) {
        this(context0, cnjv.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, float[] arr_f) {
        this(context0, adhc.a, azsv.s, aztr_settings.a);
    }

    public azts(Context context0, int[] arr_v) {
        this(context0, eomx.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, short[] arr_v) {
        this(context0, esen.b, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, short[] arr_v, byte[] arr_b) {
        this(context0, cpvh.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, boolean[] arr_z) {
        this(context0, exdq.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, byte[][] arr2_b) {
        this(context0, cnjv.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, char[][] arr2_c) {
        this(context0, covd.a, null, aztr_settings.a);
    }

    public azts(Context context0, float[][] arr2_f) {
        this(context0, ephm.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, int[][] arr2_v) {
        this(context0, esen.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, short[][] arr2_v) {
        this(context0, epvl.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, boolean[][] arr2_z) {
        this(context0, dlgw.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, byte[][][] arr3_b) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        this(context0, ekoo.a, azsx.s, aztr0);
    }

    public azts(Context context0, char[][][] arr3_c) {
        this(context0, aunl.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, float[][][] arr3_f) {
        aztq aztq0 = new aztq();
        aztq0.b(Looper.getMainLooper());
        aztq0.a = new gopd();
        aztr_settings aztr0 = aztq0.a();
        this(context0, gopz.a, azsx.s, aztr0);
        fpjb.f(context0);
    }

    public azts(Context context0, int[][][] arr3_v) {
        this(context0, cnjv.a, azsx.s, aztr_settings.a);
    }

    public azts(Context context0, short[][][] arr3_v) {
        this(context0, bkwf.a, azsx.s, aztr_settings.a);
        ffud.c(context0.getApplicationContext());
    }

    public azts(Context context0, boolean[][][] arr3_z) {
        this(context0, ejjt.a, azsx.s, aztr_settings.a);
    }

    public azts(azxv azxv0, azta_api azta0, azsx azsx0, aztr_settings aztr0) {
        batl.t(azxv0, "Null chimeraActivity is not permitted.");
        batl.t(azta0, "Api must not be null.");
        batl.t(aztr0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context0 = azxv0.getApplicationContext();
        batl.t(context0, "The provided context did not have an application context.");
        this.v = context0;
        String s = azts.g(azxv0);
        this.w = s;
        this.x = azts.f(azxv0);
        this.y = azta0;
        this.z = azsx0;
        this.B = aztr0.c;
        azux azux0 = new azux(azta0, azsx0, s);
        this.A = azux0;
        this.D = new azxn(this);
        azxm azxm0 = azxm.d(context0);
        this.E = azxm0;
        this.C = azxm0.a();
        this.a = aztr0.b;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            azwc.m(azyz.y(azxv0, azxv0.gy()), azxm0, azux0);
        }
        azxm0.i(this);
    }

    public azts(com.google.android.chimera.android.Activity activity0) {
        this(activity0, dlgw.a, azsx.s, aztr_settings.a);
    }

    public azts(com.google.android.chimera.android.Activity activity0, azta_api azta0, azsx azsx0, aztr_settings aztr0) {
        batl.t(activity0, "Null chimeraActivity is not permitted.");
        batl.t(azta0, "Api must not be null.");
        batl.t(aztr0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context0 = activity0.getApplicationContext();
        batl.t(context0, "The provided context did not have an application context.");
        this.v = context0;
        String s = azts.g(activity0);
        this.w = s;
        this.x = azts.f(activity0);
        this.y = azta0;
        this.z = azsx0;
        this.B = aztr0.c;
        azux azux0 = new azux(azta0, azsx0, s);
        this.A = azux0;
        this.D = new azxn(this);
        azxm azxm0 = azxm.d(context0);
        this.E = azxm0;
        this.C = azxm0.a();
        this.a = aztr0.b;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            azwc.l(activity0.getContainerActivity(), azxm0, azux0);
        }
        azxm0.i(this);
    }

    public final evql P(String s, int v, bctn bctn0, bcto bcto0) {
        InterestUpdateBatchImpl interestUpdateBatchImpl0 = new InterestUpdateBatchImpl();
        interestUpdateBatchImpl0.b(s, v, bctn0, bcto0);
        return batf.c(interestUpdateBatchImpl0.a(this.D));
    }

    public final evql Q(bcsw bcsw0) {
        batl.s(bcsw0);
        bcsy bcsy0 = new bcsy(this.D, bcsw0);
        this.D.c(bcsy0);
        return batf.c(bcsy0);
    }

    public final evql R(ContextDataFilterImpl contextDataFilterImpl0, bcsw bcsw0) {
        batl.s(bcsw0);
        bcsx bcsx0 = new bcsx(this.D, contextDataFilterImpl0, bcsw0);
        this.D.c(bcsx0);
        return batf.c(bcsx0);
    }

    public final evql S() {
        bcvq bcvq0 = new bcvq(this.D);
        this.D.c(bcvq0);
        return batf.a(new xrm(aqcq.c, bcvq0), new azui());
    }

    public final evql T() {
        azzc azzc0 = new azzc();
        azzc0.d = 0x20E1;
        azzc0.a = new aunp(this);
        return this.iG(azzc0.a());
    }

    public final void U(String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x20E2;
        azzc0.a = new aunn(s, z);
        this.jn(azzc0.a());
    }

    public final void V(List list0, List list1, Bundle bundle0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x20F0;
        azzc0.a = new auns(list0, list1, bundle0);
        azzc0.b = false;
        azzc0.c = new Feature[]{atry.l};
        this.jn(azzc0.a());
    }

    public final void W(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new aunr(s);
        azzc0.b = false;
        azzc0.c = new Feature[]{atry.f};
        azzc0.d = 0x20E6;
        this.jn(azzc0.a());
    }

    public final void X(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new aunq(z);
        azzc0.b = false;
        azzc0.d = 0x20ED;
        azzc0.c = new Feature[]{atry.i};
        this.jn(azzc0.a());
    }

    public evql Y() {
        azzc azzc0 = new azzc();
        azzc0.d = 901;
        azzc0.a = new aysu();
        return this.iG(azzc0.a());
    }

    public static Bitmap Z(Activity activity0) {
        try {
            return azts.aa(activity0.getWindow().getDecorView().getRootView());
        }
        catch(Exception exception0) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", exception0);
            return null;
        }
    }

    public final evql aA(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dook(account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7258;
        return this.iG(azzc0.a());
    }

    public final evql aB(GetImagesForValuableRequest getImagesForValuableRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorf(getImagesForValuableRequest0);
        azzc0.c = new Feature[]{dlde.at};
        azzc0.b = false;
        azzc0.d = 7333;
        return this.iG(azzc0.a());
    }

    public final evql aC(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorh(account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7258;
        return this.iG(azzc0.a());
    }

    public final evql aD(Account account0, List list0, int v) {
        GetTransactionsRequest getTransactionsRequest0 = new GetTransactionsRequest();
        getTransactionsRequest0.a = account0;
        getTransactionsRequest0.c = (GooglePaymentMethodId[])list0.toArray(new GooglePaymentMethodId[0]);
        getTransactionsRequest0.d = v;
        return this.aE(getTransactionsRequest0);
    }

    public final evql aE(GetTransactionsRequest getTransactionsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqe(this, getTransactionsRequest0);
        azzc0.c = new Feature[]{dlde.I};
        azzc0.b = false;
        azzc0.d = 7210;
        return this.iG(azzc0.a());
    }

    public final evql aF(Account account0, List list0, int v, long v1) {
        GetTransactionsRequest getTransactionsRequest0 = new GetTransactionsRequest();
        getTransactionsRequest0.a = account0;
        getTransactionsRequest0.c = (GooglePaymentMethodId[])list0.toArray(new GooglePaymentMethodId[0]);
        getTransactionsRequest0.d = v;
        getTransactionsRequest0.e = v1;
        return this.aE(getTransactionsRequest0);
    }

    public final evql aG(GetOnboardingInfoRequest getOnboardingInfoRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopq(getOnboardingInfoRequest0);
        azzc0.c = new Feature[]{dlde.q};
        azzc0.b = false;
        azzc0.d = 7266;
        return this.iG(azzc0.a());
    }

    public final evql aH(Account account0, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new doog(this, account0, v);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 0x1C60;
        return this.iG(azzc0.a());
    }

    public final evql aI() {
        azzc azzc0 = new azzc();
        azzc0.a = new doqf();
        azzc0.c = new Feature[]{dlde.c};
        azzc0.b = false;
        azzc0.d = 7275;
        return this.iG(azzc0.a());
    }

    public final evql aJ(GetPaymentMethodActionTokensRequest getPaymentMethodActionTokensRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqw(getPaymentMethodActionTokensRequest0);
        azzc0.c = new Feature[]{dlde.w};
        azzc0.b = false;
        azzc0.d = 7255;
        return this.iG(azzc0.a());
    }

    public final evql aK(Account account0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqm(account0, v);
        azzc0.c = new Feature[]{dlde.v};
        azzc0.b = false;
        azzc0.d = 7257;
        return this.iG(azzc0.a());
    }

    public final evql aL(GetSeFeatureReadinessStatusRequest getSeFeatureReadinessStatusRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dooj(this, getSeFeatureReadinessStatusRequest0);
        azzc0.c = new Feature[]{dlde.aa};
        azzc0.b = false;
        azzc0.d = 7308;
        return this.iG(azzc0.a());
    }

    public final evql aM(GetSeMfiPrepaidCardsRequest getSeMfiPrepaidCardsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqu(getSeMfiPrepaidCardsRequest0);
        azzc0.c = new Feature[]{dlde.X};
        azzc0.b = false;
        azzc0.d = 7305;
        return this.iG(azzc0.a());
    }

    public final evql aN(GetSePrepaidCardRequest getSePrepaidCardRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dool(getSePrepaidCardRequest0);
        azzc0.c = new Feature[]{dlde.h};
        azzc0.b = false;
        azzc0.d = 7282;
        return this.iG(azzc0.a());
    }

    public final evql aO(GetSettingsRequest getSettingsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqy(getSettingsRequest0);
        azzc0.c = new Feature[]{dlde.F};
        azzc0.b = false;
        azzc0.d = 7272;
        return this.iG(azzc0.a());
    }

    public final evql aP(Account account0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqg(this, account0, v);
        azzc0.c = new Feature[]{dlde.o};
        azzc0.b = false;
        azzc0.d = 7237;
        return this.iG(azzc0.a());
    }

    public final evql aQ(Account account0, String s, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopb(this, account0, s, s1);
        azzc0.c = new Feature[]{dlde.I};
        azzc0.b = false;
        azzc0.d = 7211;
        return this.iG(azzc0.a());
    }

    public final evql aR(GetValuablesRequest getValuablesRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopo(getValuablesRequest0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7213;
        return this.iG(azzc0.a());
    }

    public final evql aS(Account account0) {
        GetValuablesFromServerRequest getValuablesFromServerRequest0 = new GetValuablesFromServerRequest();
        getValuablesFromServerRequest0.a = account0;
        return this.aT(getValuablesFromServerRequest0);
    }

    public final evql aT(GetValuablesFromServerRequest getValuablesFromServerRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dore(getValuablesFromServerRequest0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7212;
        return this.iG(azzc0.a());
    }

    public final evql aU(Account account0, int v, IntentSource intentSource0, boolean z, int v1) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopj(account0, v, intentSource0, z, v1);
        azzc0.c = new Feature[]{dlde.af};
        azzc0.b = false;
        azzc0.d = 0x1C90;
        return this.iG(azzc0.a());
    }

    public final evql aV(GetWearClosedLoopCardsRequest getWearClosedLoopCardsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doop(getWearClosedLoopCardsRequest0);
        azzc0.c = new Feature[]{dlde.T};
        azzc0.b = false;
        azzc0.d = 7300;
        return this.iG(azzc0.a());
    }

    public final evql aW(GetWearPaymentMethodsRequest getWearPaymentMethodsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorn(getWearPaymentMethodsRequest0);
        azzc0.c = new Feature[]{dlde.S};
        azzc0.b = false;
        azzc0.d = 7294;
        return this.iG(azzc0.a());
    }

    public final evql aX(Account account0, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new dori(account0, v);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7262;
        return this.iG(azzc0.a());
    }

    public final evql aY(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqb(arr_b);
        azzc0.c = new Feature[]{dlde.aD};
        azzc0.b = false;
        azzc0.d = 0x1CAF;
        return this.jn(azzc0.a());
    }

    public final evql aZ(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopg(arr_b);
        azzc0.c = new Feature[]{dlde.ap};
        azzc0.b = false;
        azzc0.d = 7326;
        return this.jn(azzc0.a());
    }

    public static Bitmap aa(View view0) {
        try {
            Picture picture0 = new Picture();
            Canvas canvas0 = picture0.beginRecording(view0.getWidth(), view0.getHeight());
            canvas0.drawRect(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()), new Paint());
            view0.draw(canvas0);
            picture0.endRecording();
            return Bitmap.createBitmap(picture0, view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
        }
        catch(Exception | Error throwable0) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", throwable0);
            return null;
        }
    }

    public final evql ab(FeedbackOptions feedbackOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bkxx(feedbackOptions0, System.nanoTime());
        azzc0.d = 6005;
        return this.jn(azzc0.a());
    }

    public final evql ac(GeofencingRequest geofencingRequest0, PendingIntent pendingIntent0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cnkc(geofencingRequest0, pendingIntent0);
        azzc0.d = 0x978;
        return this.jn(azzc0.a());
    }

    public final evql ad(PendingIntent pendingIntent0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cnkb(pendingIntent0);
        azzc0.d = 0x979;
        return this.jn(azzc0.a());
    }

    public final evql ae(List list0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cnka(list0);
        azzc0.d = 0x979;
        return this.jn(azzc0.a());
    }

    public final evql af(LocationSettingsRequest locationSettingsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cnke(locationSettingsRequest0);
        azzc0.d = 0x97A;
        return this.iG(azzc0.a());
    }

    public final evql ag(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new cntu(account0);
        azzc0.d = 0x97B;
        return this.iG(azzc0.a());
    }

    public final evql ah() {
        azzc azzc0 = new azzc();
        azzc0.d = 304;
        azzc0.a = new cput(this);
        return this.iG(azzc0.a());
    }

    public final evql ai() {
        azzc azzc0 = new azzc();
        azzc0.d = 308;
        azzc0.a = new cpuz(this);
        return this.iG(azzc0.a());
    }

    public final evql aj(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.d = 305;
        azzc0.a = new cpuy(this, z);
        return this.iG(azzc0.a());
    }

    public final evql ak() {
        azzc azzc0 = new azzc();
        azzc0.d = 307;
        azzc0.a = new cpuv(this);
        return this.iG(azzc0.a());
    }

    public final evql al() {
        azzc azzc0 = new azzc();
        azzc0.d = 306;
        azzc0.a = new cpux(this);
        return this.iG(azzc0.a());
    }

    public final evql am(ChangeSePostpaidDefaultStatusRequest changeSePostpaidDefaultStatusRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dood(changeSePostpaidDefaultStatusRequest0);
        azzc0.c = new Feature[]{dlde.R};
        azzc0.b = false;
        azzc0.d = 7284;
        return this.iG(azzc0.a());
    }

    public final evql an(Account account0, String s, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new donv(account0, s, v);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7254;
        return this.iG(azzc0.a());
    }

    public final evql ao(DeleteSePrepaidCardRequest deleteSePrepaidCardRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doox(deleteSePrepaidCardRequest0);
        azzc0.c = new Feature[]{dlde.V};
        azzc0.b = false;
        azzc0.d = 7301;
        return this.iG(azzc0.a());
    }

    public final evql ap(Account account0, Iterable iterable0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dora(this, account0, iterable0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7218;
        return this.iG(azzc0.a());
    }

    public final evql aq(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new doon(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7242;
        return this.iG(azzc0.a());
    }

    public final evql ar(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new donx(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 0x1C4F;
        return this.iG(azzc0.a());
    }

    public final evql as(Account account0, String s) {
        GetAttestationSignalRequest getAttestationSignalRequest0 = new GetAttestationSignalRequest();
        getAttestationSignalRequest0.a = account0;
        getAttestationSignalRequest0.b = s;
        azzc azzc0 = new azzc();
        azzc0.a = new doqz(getAttestationSignalRequest0);
        azzc0.c = new Feature[]{dlde.b};
        azzc0.b = false;
        azzc0.d = 7274;
        return this.iG(azzc0.a());
    }

    public final evql at(Account account0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqi(account0, v);
        azzc0.c = new Feature[]{dlde.j};
        azzc0.b = false;
        azzc0.d = 7239;
        return this.iG(azzc0.a());
    }

    public final evql au(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopc(account0, arr_b);
        azzc0.c = new Feature[]{dlde.e};
        azzc0.b = false;
        azzc0.d = 7244;
        return this.iG(azzc0.a());
    }

    public final evql av(Account account0, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorl(this, account0, v);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7265;
        return this.iG(azzc0.a());
    }

    public final evql aw(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqr(account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7235;
        return this.iG(azzc0.a());
    }

    public final evql ax(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqv(account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7236;
        return this.iG(azzc0.a());
    }

    public final evql ay(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopd(account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7299;
        return this.iG(azzc0.a());
    }

    public final evql az() {
        azzc azzc0 = new azzc();
        azzc0.a = new dony(this);
        azzc0.c = new Feature[]{dlde.n};
        azzc0.b = false;
        azzc0.d = 7286;
        return this.iG(azzc0.a());
    }

    public final evql bA(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new doob(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7240;
        return this.iG(azzc0.a());
    }

    public final evql bB(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dooy(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7245;
        return this.iG(azzc0.a());
    }

    public final void bC(Account account0, int v, dmqb dmqb0) {
        azyf azyf0 = this.iD(dmqb0, azts.i(v));
        String s = UUID.randomUUID().toString();
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new doqs(this, account0, s, v, azyf0);
        azyq0.b = new doqt(this, account0, s, v);
        azyq0.e = 7217;
        this.iH(azyq0.a());
    }

    public final void bD(RefreshSePostpaidsTransactionsFromChipRequest refreshSePostpaidsTransactionsFromChipRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopa(refreshSePostpaidsTransactionsFromChipRequest0);
        azzc0.c = new Feature[]{dlde.M};
        azzc0.b = false;
        azzc0.d = 7278;
        this.jn(azzc0.a());
    }

    public final void bE(int v, dmqb dmqb0) {
        this.jm(azyg.a(dmqb0, azts.i(v)), 7287);
    }

    public final void bF(int v) {
        BlockClosedLoopCardsRequest blockClosedLoopCardsRequest0 = new BlockClosedLoopCardsRequest();
        blockClosedLoopCardsRequest0.a = 0L;
        blockClosedLoopCardsRequest0.b = v;
        this.cm(blockClosedLoopCardsRequest0);
    }

    public final azua bG(efnv efnv0) {
        eghp eghp0 = efon.b;
        if(efnv0 == null) {
            efnv0 = efnv.a;
        }
        azua azua0 = new egho(eghp0, this.D, efnv0);
        this.D.c(((azvc)azua0));
        return azua0;
    }

    public final azua bH(String s, int v, int v1) {
        return efon.c.a(this.D, s, v, v1);
    }

    public final evql bI(Bundle bundle0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0xAB8;
        azzc0.a = new efod(this, bundle0);
        return this.iG(azzc0.a());
    }

    public final evql bJ() {
        azzc azzc0 = new azzc();
        azzc0.a = new ejjv(this);
        azzc0.d = 0xF3D;
        return this.iG(azzc0.a());
    }

    public final evql bK() {
        Objects.requireNonNull(ekoo.b);
        ekpj ekpj0 = new ekpj(this.D);
        this.D.c(ekpj0);
        return batf.a(ekpj0, new azui());
    }

    public final evql bL() {
        azzc azzc0 = new azzc();
        azzc0.d = 4201;
        azzc0.a = new ekor(this);
        return this.iG(azzc0.a());
    }

    public final evql bM() {
        Objects.requireNonNull(ekoo.b);
        ekpl ekpl0 = new ekpl(this.D);
        this.D.c(ekpl0);
        return batf.a(ekpl0, new azui());
    }

    public final evql bN(byte[] arr_b) {
        ekph ekph0 = new ekph(this.D, arr_b);
        this.D.c(ekph0);
        return batf.a(ekph0, new azui());
    }

    public final void bO() {
        azzc azzc0 = new azzc();
        azzc0.d = 4203;
        azzc0.a = new ekos();
        this.iG(azzc0.a());
    }

    public static rie bP(Status status0, AuthenticationException authenticationException0) {
        return authenticationException0 == null ? new rie(((int)(((Integer)eomy.a.getOrDefault(Integer.valueOf(status0.i), Integer.valueOf(0))))), (bbqr.d(status0.j) ? eomy.b(status0.i) : status0.j)) : new rie(authenticationException0.a, authenticationException0.b, authenticationException0.c, authenticationException0.d);
    }

    public final evql bQ() {
        azzc azzc0 = new azzc();
        azzc0.a = new ephd();
        azzc0.d = 35304;
        return this.iG(azzc0.a());
    }

    public final evql bR(SignificantPlacesRequest significantPlacesRequest0, epga epga0, Executor executor0) {
        return this.bS(35301, significantPlacesRequest0, epga0, executor0);
    }

    public final evql bS(int v, SignificantPlacesRequest significantPlacesRequest0, epga epga0, Executor executor0) {
        azyf azyf0 = azyg.c(epga0, executor0, epga.class.getSimpleName());
        epgy epgy0 = new epgy(azyf0);
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new ephe(significantPlacesRequest0, epgy0);
        azyq0.b = new ephf(epgy0);
        azyq0.e = v;
        return this.iH(azyq0.a());
    }

    public final evql bT(epga epga0) {
        ibuq.f(epga0, "listener");
        return this.jm(azyg.a(epga0, epga.class.getSimpleName()), 35302);
    }

    @Override  // erek
    public final evql bU(Challenge[] arr_challenge, boolean z, boolean z1) {
        ergs ergs0 = new ergs(arr_challenge, z, z1);
        azzc azzc0 = new azzc();
        azzc0.a = ergs0;
        azzc0.d = 0x5106;
        return this.iG(azzc0.a());
    }

    @Override  // erek
    public final evql bV(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        batl.s(exchangeAssertionsForUserCredentialsRequest0);
        ergw ergw0 = new ergw(exchangeAssertionsForUserCredentialsRequest0);
        azzc azzc0 = new azzc();
        azzc0.a = ergw0;
        azzc0.d = 0x510A;
        return this.iG(azzc0.a());
    }

    @Override  // erek
    public final evql bW(Assertion[] arr_assertion) {
        ergo ergo0 = new ergo(arr_assertion);
        azzc azzc0 = new azzc();
        azzc0.a = ergo0;
        azzc0.d = 0x5107;
        return this.iG(azzc0.a());
    }

    @Override  // erek
    public final evql bX(UserBootstrapInfo[] arr_userBootstrapInfo) {
        ergf ergf0 = new ergf(arr_userBootstrapInfo);
        azzc azzc0 = new azzc();
        azzc0.a = ergf0;
        azzc0.d = 0x5105;
        return this.iG(azzc0.a());
    }

    @Override  // erek
    public final evql bY(Account[] arr_account) {
        ergg ergg0 = new ergg(arr_account);
        azzc azzc0 = new azzc();
        azzc0.a = ergg0;
        azzc0.d = 20740;
        return this.iG(azzc0.a());
    }

    @Override  // erek
    public final evql bZ(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        batl.s(exchangeAssertionsForUserCredentialsRequest0);
        ergh ergh0 = new ergh(exchangeAssertionsForUserCredentialsRequest0);
        azzc azzc0 = new azzc();
        azzc0.a = ergh0;
        azzc0.d = 0x5108;
        return this.iG(azzc0.a());
    }

    public final evql ba(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new doql(arr_b);
        azzc0.c = new Feature[]{dlde.aw};
        azzc0.b = false;
        azzc0.d = 7335;
        return this.iG(azzc0.a());
    }

    public final evql bb(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorm(arr_b);
        azzc0.c = new Feature[]{dlde.ar};
        azzc0.b = false;
        azzc0.d = 7329;
        return this.jn(azzc0.a());
    }

    public final evql bc(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dord(arr_b);
        azzc0.c = new Feature[]{dlde.am};
        azzc0.b = false;
        azzc0.d = 0x1C9F;
        return this.jn(azzc0.a());
    }

    public final evql bd(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new doov(arr_b);
        azzc0.c = new Feature[]{dlde.ag};
        azzc0.b = false;
        azzc0.d = 7315;
        return this.jn(azzc0.a());
    }

    public final evql be(PerformPaymentMethodServerActionRequest performPaymentMethodServerActionRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doou(performPaymentMethodServerActionRequest0);
        azzc0.c = new Feature[]{dlde.x};
        azzc0.b = false;
        azzc0.d = 7256;
        return this.iG(azzc0.a());
    }

    public final evql bf(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorb(arr_b);
        azzc0.c = new Feature[]{dlde.aC};
        azzc0.b = false;
        azzc0.d = 7342;
        return this.jn(azzc0.a());
    }

    public final evql bg(ProvisionSePrepaidCardRequest provisionSePrepaidCardRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqj(provisionSePrepaidCardRequest0);
        azzc0.c = new Feature[]{dlde.y};
        azzc0.b = false;
        azzc0.d = 7313;
        return this.iG(azzc0.a());
    }

    public final evql bh(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dooq(this, account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7209;
        return this.iG(azzc0.a());
    }

    public final evql bi(RecoverSeCardRequest recoverSeCardRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqp(recoverSeCardRequest0);
        azzc0.c = new Feature[]{dlde.ab};
        azzc0.b = false;
        azzc0.d = 7309;
        return this.iG(azzc0.a());
    }

    public final evql bj(RefreshSePrepaidTransactionsFromChipRequest refreshSePrepaidTransactionsFromChipRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dooc(refreshSePrepaidTransactionsFromChipRequest0);
        azzc0.c = new Feature[]{dlde.N};
        azzc0.b = false;
        azzc0.d = 7290;
        return this.jn(azzc0.a());
    }

    public final evql bk(RemoveSePostpaidTokenRequest removeSePostpaidTokenRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopp(removeSePostpaidTokenRequest0);
        azzc0.c = new Feature[]{dlde.Q};
        azzc0.b = false;
        azzc0.d = 7283;
        return this.iG(azzc0.a());
    }

    public final evql bl(Account account0, int v, long v1, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopi(this, account0, v, v1, arr_b);
        azzc0.c = new Feature[]{dlde.A};
        azzc0.b = false;
        azzc0.d = 7261;
        return this.iG(azzc0.a());
    }

    public final evql bm(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dorp(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7241;
        return this.iG(azzc0.a());
    }

    public final evql bn(SaveImagesForValuableRequest saveImagesForValuableRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dork(saveImagesForValuableRequest0);
        azzc0.c = new Feature[]{dlde.au};
        azzc0.b = false;
        azzc0.d = 7332;
        return this.jn(azzc0.a());
    }

    public final evql bo(SaveLocalValuablesRequest saveLocalValuablesRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopu(saveLocalValuablesRequest0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7298;
        return this.iG(azzc0.a());
    }

    public final evql bp(Account account0, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dont(account0, arr_b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7246;
        return this.iG(azzc0.a());
    }

    public final evql bq(Account account0, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopf(this, account0, v);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 0x1C5F;
        return this.iG(azzc0.a());
    }

    public final evql br(SetOnboardingInfoRequest setOnboardingInfoRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopl(setOnboardingInfoRequest0);
        azzc0.c = new Feature[]{dlde.q};
        azzc0.b = false;
        azzc0.d = 7267;
        return this.iG(azzc0.a());
    }

    public final evql bs(SetSortOrderRequest setSortOrderRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dope(this, setSortOrderRequest0);
        azzc0.c = new Feature[]{dlde.o};
        azzc0.b = false;
        azzc0.d = 7238;
        return this.iG(azzc0.a());
    }

    public final evql bt(Account account0, String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new doos(this, account0, s, z);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 0x1C2F;
        return this.iG(azzc0.a());
    }

    public final evql bu(SetWalletItemSurfacingEnabledRequest setWalletItemSurfacingEnabledRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopy(this, setWalletItemSurfacingEnabledRequest0);
        azzc0.c = new Feature[]{dlde.ad};
        azzc0.b = false;
        azzc0.d = 7310;
        return this.iG(azzc0.a());
    }

    public final evql bv(Account account0) {
        SyncTransactionsRequest syncTransactionsRequest0 = new SyncTransactionsRequest();
        syncTransactionsRequest0.a = account0;
        return this.h(syncTransactionsRequest0);
    }

    public final evql bw(Account account0, long v) {
        SyncTransactionsRequest syncTransactionsRequest0 = new SyncTransactionsRequest();
        syncTransactionsRequest0.a = account0;
        syncTransactionsRequest0.b = v;
        return this.h(syncTransactionsRequest0);
    }

    public final evql bx(Account account0, long v, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new dooo(account0, v, arr_b);
        azzc0.c = new Feature[]{dlde.K};
        azzc0.b = false;
        azzc0.d = 0x1C6F;
        return this.jn(azzc0.a());
    }

    public final evql by(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new dopm(this, account0);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7259;
        return this.iG(azzc0.a());
    }

    public final evql bz(UpdateSettingsRequest updateSettingsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqx(updateSettingsRequest0);
        azzc0.c = new Feature[]{dlde.F};
        azzc0.b = false;
        azzc0.d = 7273;
        return this.jn(azzc0.a());
    }

    @Override  // erek
    public final evql ca(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        ergi ergi0 = new ergi(exchangeAssertionsForUserCredentialsRequest0);
        azzc azzc0 = new azzc();
        azzc0.a = ergi0;
        azzc0.d = 0x5109;
        return this.iG(azzc0.a());
    }

    public final evql cb() {
        azzc azzc0 = new azzc();
        azzc0.a = new etai(this);
        azzc0.d = 2103;
        return this.iG(azzc0.a());
    }

    public final void cc(Activity activity0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etaj(activity0);
        azzc0.d = 0x840;
        this.iG(azzc0.a());
    }

    public final void cd(esek esek0) {
        azyf azyf0 = this.iD(esek0, "tapAndPayDataChangedListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new etag(azyf0);
        azyq0.b = new etah();
        azyq0.e = 0x86B;
        this.iH(azyq0.a());
    }

    public final void ce(esek esek0) {
        this.jm(azyg.a(esek0, "tapAndPayDataChangedListener"), 0x868).c(new azze());
    }

    public final evql cf(int v, Bundle bundle0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezdz(this, v, bundle0);
        azzc0.d = 22201;
        return this.iG(azzc0.a());
    }

    public final evql cg() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezea(this);
        azzc0.d = 22202;
        return this.iG(azzc0.a());
    }

    public final evql ch() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezeb(this);
        azzc0.d = 22203;
        return this.iG(azzc0.a());
    }

    public static boolean ci(Context context0) {
        return context0.getPackageManager().resolveService(new Intent("com.google.android.gms.trustagent.StateApi.START"), 0) != null;
    }

    public final evql cj(PaymentDataRequest paymentDataRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new faxj(paymentDataRequest0);
        azzc0.c = new Feature[]{fawg.c};
        azzc0.b = true;
        azzc0.d = 23707;
        return this.jn(azzc0.a());
    }

    public static void ck(Channel channel0) {
        batl.t(channel0, "channel must not be null");
    }

    public final evql cl(String s) {
        if(Log.isLoggable("ExperienceClient", 3)) {
            Log.d("ExperienceClient", "Getting app theme for" + s);
        }
        azzc azzc0 = new azzc();
        azzc0.a = new fdhn(this, s);
        azzc0.c = new Feature[]{fcfa.z};
        azzc0.d = 24033;
        return this.iG(azzc0.a());
    }

    public final void cm(BlockClosedLoopCardsRequest blockClosedLoopCardsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doph(blockClosedLoopCardsRequest0);
        azzc0.c = new Feature[]{dlde.an};
        azzc0.b = false;
        azzc0.d = 7323;
        this.jn(azzc0.a());
    }

    @Override  // faik
    public final evql cn(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahf(this, s);
        azzc0.c = new Feature[]{fahe.b};
        azzc0.d = 4505;
        return this.iG(azzc0.a());
    }

    @Override  // faik
    public final evql co() {
        azzc azzc0 = new azzc();
        azzc0.a = new fahj(this);
        azzc0.d = 0x119F;
        return this.iG(azzc0.a());
    }

    @Override  // faik
    public final evql cp() {
        azzc azzc0 = new azzc();
        azzc0.a = new fahq(this);
        azzc0.d = 4501;
        return this.iG(azzc0.a());
    }

    @Override  // faik
    public final evql cq() {
        azzc azzc0 = new azzc();
        azzc0.a = new fahi(this);
        azzc0.d = 4513;
        return this.iG(azzc0.a());
    }

    @Override  // faik
    public final evql cr(ElCapitanOptions elCapitanOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahk(this, elCapitanOptions0);
        azzc0.d = 4510;
        return this.jn(azzc0.a());
    }

    @Override  // faik
    public final evql cs(UsageReportingOptInOptions usageReportingOptInOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahh(this, usageReportingOptInOptions0);
        azzc0.d = 4502;
        return this.jn(azzc0.a());
    }

    @Override  // faik
    public final evql ct(faij faij0) {
        azyf azyf0 = azyg.b(faij0, this.B, faij.class.getSimpleName());
        faho faho0 = new faho(this, azyf0, ((faig)this.z).b);
        fahp fahp0 = new fahp(this);
        azyq azyq0 = new azyq();
        azyq0.a = faho0;
        azyq0.b = fahp0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{fahe.a};
        azyq0.e = 4507;
        return this.iH(azyq0.a());
    }

    @Override  // faik
    public final evql cu(SafetyOptions safetyOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahg(this, safetyOptions0);
        azzc0.d = 0x11A0;
        return this.jn(azzc0.a());
    }

    @Override  // faik
    public final void cv(faij faij0) {
        azyd_linstner azyd0 = azyg.b(faij0, this.B, faij.class.getSimpleName()).listener_;
        batl.t(azyd0, "Key must not be null");
        this.jm(azyd0, 4508);
    }

    @Override  // faik
    public final void cw(String s, MessageLite hfvm0, faid faid0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahn(this, faid0, s, hfvm0);
        azzc0.c = new Feature[]{fahe.c};
        azzc0.d = 4506;
        this.jn(azzc0.a());
    }

    @Override  // faik
    public final evql cx(String s, MessageLite hfvm0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahl(this, s, hfvm0, v);
        azzc0.c = new Feature[]{fahe.c};
        azzc0.d = 4506;
        return this.jn(azzc0.a());
    }

    @Override  // faik
    public final evql cy(String s, MessageLite hfvm0, int[] arr_v, int v, ayvm ayvm0, ayud ayud0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fahm(this, ayvm0, s, hfvm0, arr_v, v, ayud0);
        azzc0.c = new Feature[]{fahe.c};
        azzc0.d = 4506;
        return this.jn(azzc0.a());
    }

    private final evql e(int v, azzd azzd0) {
        evqp evqp0 = new evqp();
        this.E.f(evqp0, azzd0.h, this);
        azyk azyk0 = new azyk(new azut(v, azzd0, evqp0, this.a), this.E.j.get(), this);
        Message message0 = this.E.n.obtainMessage(4, azyk0);
        this.E.n.sendMessage(message0);
        return evqp0.a;
    }

    private static final bbso f(Context context0) {
        return context0 == null ? null : new bbso(context0.getAttributionSource());
    }

    private static final String g(Context context0) {
        return context0 == null ? null : context0.getAttributionTag();
    }

    @Override  // aztx
    public final azux ga() {
        return this.A;
    }

    public evql gd(gqlo gqlo0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{axyd.e};
        azzc0.d = 0x3F0;
        azzc0.a = new aysk(gqlo0);
        return this.iG(azzc0.a());
    }

    public evql ge(gged_interceptors gged0) {
        batl.u(gged0.size());
        azzc azzc0 = new azzc();
        azzc0.d = 1006;
        azzc0.a = new aysi(gged0);
        return this.iG(azzc0.a());
    }

    @Override  // azty
    public Feature[] gm() {
        return new Feature[]{aaxe.b};
    }

    private final evql h(SyncTransactionsRequest syncTransactionsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new doqo(this, syncTransactionsRequest0);
        azzc0.c = new Feature[]{dlde.I};
        azzc0.b = false;
        azzc0.d = 7208;
        return this.iG(azzc0.a());
    }

    private static String i(int v) {
        return "dataChangedListenerKey_" + v;
    }

    public final azyf iD(Object object0, String s) {
        return azyg.b(object0, this.B, s);
    }

    public baqt iE() {
        Set set0;
        Account account0;
        baqt baqt0 = new baqt();
        azsx azsx0 = this.z;
        if((azsx0 instanceof bsaz)) {
            GoogleSignInAccount googleSignInAccount0 = ((bsaz)azsx0).k;
            if(googleSignInAccount0 == null) {
                account0 = (azsx0 instanceof azst) ? ((azst)azsx0).a() : null;
            }
            else {
                account0 = googleSignInAccount0.a();
            }
        }
        else {
            account0 = (azsx0 instanceof azst) ? ((azst)azsx0).a() : null;
        }
        baqt0.a = account0;
        if((azsx0 instanceof bsaz)) {
            GoogleSignInAccount googleSignInAccount1 = ((bsaz)azsx0).k;
            set0 = googleSignInAccount1 == null ? Collections.EMPTY_SET : googleSignInAccount1.e();
        }
        else {
            set0 = Collections.EMPTY_SET;
        }
        if(baqt0.b == null) {
            baqt0.b = new bxf();
        }
        baqt0.b.addAll(set0);
        baqt0.d = this.v.getClass().getName();
        baqt0.c = "com.google.android.gms";
        return baqt0;
    }

    public final evql iF(azzd azzd0) {
        return this.e(2, azzd0);
    }

    public final evql iG(azzd azzd0) {
        return this.e(0, azzd0);
    }

    public final evql iH(azyr azyr0) {
        batl.t(azyr0.a.getListener(), "Listener has already been released.");
        return this.E.e(this, azyr0.a, azyr0.b, azyr0.c);
    }

    @Deprecated
    public final evql iI(azyl azyl0, azzi azzi0) {
        batl.t(azyl0.getListener(), "Listener has already been released.");
        batl.c(bata.b(azyl0.getListener(), azzi0.b), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        aztp aztp0 = new aztp();
        return this.E.e(this, azyl0, azzi0, aztp0);
    }

    public final evql iJ(azyd_linstner azyd0) {
        return this.jm(azyd0, 0);
    }

    public final evql jA(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajvi(this, s);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 0x62E;
        return this.iG(azzc0.a());
    }

    public final evql jB(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajur(this, s);
        azzc0.c = new Feature[]{amjz.e};
        azzc0.d = 0x678;
        return this.iG(azzc0.a());
    }

    public final evql jC(String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajvd(this, s, z);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 0x62B;
        return this.iG(azzc0.a());
    }

    public final evql jD(String s, List list0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajvl(this, list0, s);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 0x630;
        return this.iG(azzc0.a());
    }

    public final evql jE(String s, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajup(this, s, v);
        azzc0.c = new Feature[]{amjz.d};
        azzc0.d = 0x66F;
        return this.iG(azzc0.a());
    }

    public final evql jF(ContextDataFilterImpl contextDataFilterImpl0) {
        bcvm bcvm0 = new bcvm(this.D, contextDataFilterImpl0);
        this.D.c(bcvm0);
        return batf.a(bcvm0, new azui());
    }

    public final evql jG(FenceUpdateRequestImpl fenceUpdateRequestImpl0) {
        bctv bctv0 = new bctv(aqcq.b, this.D, fenceUpdateRequestImpl0);
        this.D.c(bctv0);
        return batf.c(bctv0);
    }

    public final evql jH(String s) {
        InterestUpdateBatchImpl interestUpdateBatchImpl0 = new InterestUpdateBatchImpl();
        InterestUpdateBatchImpl.Operation interestUpdateBatchImpl$Operation0 = new InterestUpdateBatchImpl.Operation(2, null, s);
        interestUpdateBatchImpl0.a.add(interestUpdateBatchImpl$Operation0);
        return batf.c(interestUpdateBatchImpl0.a(this.D));
    }

    public final evql jm(azyd_linstner azyd0, int v) {
        batl.t(azyd0, "Listener key cannot be null.");
        evqp evqp0 = new evqp();
        this.E.f(evqp0, v, this);
        azyk azyk0 = new azyk(new azuu(azyd0, evqp0), this.E.j.get(), this);
        Message message0 = this.E.n.obtainMessage(13, azyk0);
        this.E.n.sendMessage(message0);
        return evqp0.a;
    }

    public final evql jn(azzd azzd0) {
        return this.e(1, azzd0);
    }

    public final void jr(int v, azvc azvc0) {
        azvc0.l();
        azyk azyk0 = new azyk(new azur(v, azvc0), this.E.j.get(), this);
        Message message0 = this.E.n.obtainMessage(4, azyk0);
        this.E.n.sendMessage(message0);
    }

    public final evql js(ContextData contextData0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{aaxe.a};
        azzc0.d = 0x9026;
        azzc0.a = new aaxv(contextData0);
        return this.iG(azzc0.a());
    }

    public static ApiMetadata jt(bark bark0) {
        return cclr.a(bark0.r);
    }

    public final evql ju() {
        azzc azzc0 = new azzc();
        azzc0.a = new aidm(this);
        azzc0.d = 0x5F0;
        return this.iG(azzc0.a());
    }

    public final evql jv(ProxyRequest proxyRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new aidn(this, proxyRequest0);
        azzc0.d = 0x5EE;
        return this.jn(azzc0.a());
    }

    public final evql jw(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajuw(this, s);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 0x62A;
        return this.iG(azzc0.a());
    }

    public final evql jx(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajvf(this, s);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 0x62D;
        return this.iG(azzc0.a());
    }

    public final evql jy(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajve(this, s);
        azzc0.c = new Feature[]{amjz.a};
        azzc0.d = 1580;
        return this.iG(azzc0.a());
    }

    public final evql jz(String s, byte[] arr_b, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ajun(this, s, arr_b, v);
        azzc0.c = new Feature[]{amjz.d};
        azzc0.d = 0x66E;
        return this.iG(azzc0.a());
    }
}

