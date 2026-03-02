import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController.resultReceiver.1;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.Feature;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class kpq extends knu {
    public final Context e;
    public kjk f;
    public Executor g;
    public CancellationSignal h;
    public final CredentialProviderBeginSignInController.resultReceiver.1 i;

    public kpq(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.e = context0;
        this.i = new CredentialProviderBeginSignInController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }

    public final kjk e() {
        kjk kjk0 = this.f;
        if(kjk0 != null) {
            return kjk0;
        }
        ibuq.j("callback");
        return null;
    }

    public final Executor f() {
        Executor executor0 = this.g;
        if(executor0 != null) {
            return executor0;
        }
        ibuq.j("executor");
        return null;
    }

    public final void g(kka kka0, kjk kjk0, Executor executor0, CancellationSignal cancellationSignal0) {
        ibuq.f(kka0, "request");
        ibuq.f(kjk0, "callback");
        ibuq.f(executor0, "executor");
        this.h = cancellationSignal0;
        ibuq.f(kjk0, "<set-?>");
        this.f = kjk0;
        ibuq.f(executor0, "<set-?>");
        this.g = executor0;
        if(!knm.a(cancellationSignal0)) {
            ibuq.f(kka0, "request");
            Context context0 = this.e;
            ibuq.f(kka0, "request");
            ibuq.f(context0, "context");
            BeginSignInRequest.PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0 = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0 = ahpk.a(false, null, null, true, null, null, false, null);
            BeginSignInRequest.PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions0 = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
            BeginSignInRequest.PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions0 = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            PackageManager packageManager0 = context0.getPackageManager();
            ibuq.e(packageManager0, "getPackageManager(...)");
            long v = (long)packageManager0.getPackageInfo("com.google.android.gms", 0).versionCode;
            BeginSignInRequest.PasswordRequestOptions beginSignInRequest$PasswordRequestOptions1 = beginSignInRequest$PasswordRequestOptions0;
            boolean z = false;
            boolean z1 = false;
            BeginSignInRequest.PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions1 = beginSignInRequest$PasskeysRequestOptions0;
            BeginSignInRequest.PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions1 = beginSignInRequest$PasskeyJsonRequestOptions0;
            for(Object object0: kka0.a) {
                kjn kjn0 = (kjn)object0;
                if((kjn0 instanceof kke)) {
                    beginSignInRequest$PasswordRequestOptions1 = new BeginSignInRequest.PasswordRequestOptions(true);
                    z1 = z1 || kjn0.e;
                }
                else if((kjn0 instanceof kkg) && !z) {
                    if(Long.compare(v, 231815000L) >= 0) {
                        ibuq.f(((kkg)kjn0), "option");
                        beginSignInRequest$PasskeyJsonRequestOptions1 = new BeginSignInRequest.PasskeyJsonRequestOptions(true, ((kkg)kjn0).g);
                        z = true;
                    }
                    else {
                        ibuq.f(((kkg)kjn0), "option");
                        JSONObject jSONObject0 = new JSONObject(((kkg)kjn0).g);
                        String s = jSONObject0.optString(krf.c, "");
                        ibuq.c(s);
                        if(s.length() == 0) {
                            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                        }
                        z = true;
                        beginSignInRequest$PasskeysRequestOptions1 = new BeginSignInRequest.PasskeysRequestOptions(true, kre.b(jSONObject0), s);
                    }
                }
                else if((kjn0 instanceof fhsb)) {
                    fhsb fhsb0 = (fhsb)kjn0;
                    throw null;
                }
                continue;
            }
            BeginSignInRequest beginSignInRequest0 = ahpj.a(beginSignInRequest$PasswordRequestOptions1, beginSignInRequest$GoogleIdTokenRequestOptions0, beginSignInRequest$PasskeysRequestOptions1, beginSignInRequest$PasskeyJsonRequestOptions1, null, z1, 0, (v <= 241217000L ? false : kka0.c));
            ahqs ahqs0 = ahqe.b(context0);
            ahpk.a(false, null, null, true, null, null, false, null);
            new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
            new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            BeginSignInRequest beginSignInRequest1 = ahpj.a(beginSignInRequest0.a, beginSignInRequest0.b, beginSignInRequest0.f, beginSignInRequest0.g, ((ahwq)ahqs0).a, beginSignInRequest0.d, beginSignInRequest0.e, beginSignInRequest0.h);
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
            azzc0.a = new ahwn(((ahwq)ahqs0), beginSignInRequest1);
            azzc0.b = false;
            azzc0.d = 0x611;
            evql evql0 = ((azts)ahqs0).iG(azzc0.a());
            evql0.b(new kpg(new kox(cancellationSignal0, this)));
            evql0.A(new kph(this, cancellationSignal0));
        }
    }
}

