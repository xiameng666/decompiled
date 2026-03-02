import android.content.Context;
import android.credentials.CreateCredentialRequest.Builder;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption.Builder;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest.Builder;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.concurrent.Executor;

public final class kjw implements kjo {
    private final CredentialManager a;

    public kjw(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = bjk..ExternalSyntheticApiModelOutline0.m(context0.getSystemService("credential"));
    }

    public static final kln a(GetCredentialException getCredentialException0) {
        ibuq.f(getCredentialException0, "error");
        String s = getCredentialException0.getType();
        ibuq.e(s, "getType(...)");
        return kmo.b(s, getCredentialException0.getMessage());
    }

    private final boolean b(ibth ibth0) {
        if(this.a == null) {
            ibth0.a();
            return true;
        }
        return false;
    }

    private static final GetCredentialRequest c(kka kka0) {
        GetCredentialRequest.Builder getCredentialRequest$Builder0 = new GetCredentialRequest.Builder(kjz.a(kka0));
        for(Object object0: kka0.a) {
            getCredentialRequest$Builder0.addCredentialOption(new CredentialOption.Builder(((kjn)object0).a, ((kjn)object0).b, ((kjn)object0).c).setIsSystemProviderRequired(((kjn)object0).d).setAllowedProviders(((kjn)object0).f).build());
        }
        String s = kka0.b;
        if(s != null) {
            getCredentialRequest$Builder0.setOrigin(s);
        }
        GetCredentialRequest getCredentialRequest0 = getCredentialRequest$Builder0.build();
        ibuq.e(getCredentialRequest0, "build(...)");
        return getCredentialRequest0;
    }

    @Override  // kjo
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override  // kjo
    public final void onCreateCredential(Context context0, kis kis0, CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        int v;
        ibuq.f(kis0, "request");
        ibuq.f(executor0, "executor");
        if(this.b(new kjs(kjk0))) {
            return;
        }
        kjt kjt0 = new kjt(kjk0, kis0);
        CredentialManager credentialManager0 = this.a;
        ibuq.c(credentialManager0);
        String s = kis0.a;
        ibuq.f(kis0, "request");
        Bundle bundle0 = kis0.b;
        kir kir0 = kis0.f;
        Bundle bundle1 = new Bundle();
        bundle1.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", kir0.a);
        CharSequence charSequence0 = kir0.b;
        if(!TextUtils.isEmpty(charSequence0)) {
            bundle1.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence0);
        }
        String s1 = kir0.d;
        if(!TextUtils.isEmpty(s1)) {
            bundle1.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", s1);
        }
        if((kis0 instanceof kiy)) {
            v = 0x7F0801EA;  // drawable:adx_ic_password
        }
        else {
            v = (kis0 instanceof kja) ? 0x7F0801E9 : 0x7F0801E8;  // drawable:adx_ic_passkey
        }
        bundle1.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context0, v));
        bundle0.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle1);
        CreateCredentialRequest.Builder createCredentialRequest$Builder0 = new CreateCredentialRequest.Builder(s, bundle0, kis0.c).setIsSystemProviderRequired(kis0.d).setAlwaysSendAppInfoToProvider(true);
        ibuq.e(createCredentialRequest$Builder0, "setAlwaysSendAppInfoToProvider(...)");
        String s2 = kis0.g;
        if(s2 != null) {
            createCredentialRequest$Builder0.setOrigin(s2);
        }
        CreateCredentialRequest createCredentialRequest0 = createCredentialRequest$Builder0.build();
        ibuq.e(createCredentialRequest0, "build(...)");
        credentialManager0.createCredential(context0, createCredentialRequest0, null, executor0, kjt0);
    }

    @Override  // kjo
    public final void onGetCredential(Context context0, kka kka0, CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        ibuq.f(executor0, "executor");
        if(this.b(new kjr(kjk0))) {
            return;
        }
        kju kju0 = new kju(kjk0);
        ibuq.c(this.a);
        GetCredentialRequest getCredentialRequest0 = kjw.c(kka0);
        this.a.getCredential(context0, getCredentialRequest0, null, executor0, kju0);
    }

    @Override  // kjo
    public final void onPrepareCredential(kka kka0, CancellationSignal cancellationSignal0, Executor executor0, kjk kjk0) {
        if(this.b(new kjq(kjk0))) {
            return;
        }
        kjv kjv0 = new kjv(kjk0);
        ibuq.c(this.a);
        GetCredentialRequest getCredentialRequest0 = kjw.c(kka0);
        this.a.prepareGetCredential(getCredentialRequest0, cancellationSignal0, executor0, kjv0);
    }
}

