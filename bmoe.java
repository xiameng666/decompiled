import android.credentials.CreateCredentialRequest.Builder;
import android.credentials.CreateCredentialRequest;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import org.json.JSONException;

public final class bmoe implements lqj {
    public final AuthenticateChimeraActivity a;

    public bmoe(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Bundle bundle0;
        AuthenticateChimeraActivity authenticateChimeraActivity0 = this.a;
        bmor bmor0 = new bmor(authenticateChimeraActivity0);
        String s = ((BrowserPublicKeyCredentialCreationOptions)object0).b.toString();
        if(s.endsWith("/")) {
            s = s.substring(0, s.length() - 1);
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = ((BrowserPublicKeyCredentialCreationOptions)object0).a;
        byte[] arr_b = ((BrowserPublicKeyCredentialCreationOptions)object0).c;
        byte[] arr_b1 = "<invalid>".getBytes();
        if(arr_b == null) {
            String s1 = ghjc.e.g().o(((BrowserPublicKeyCredentialCreationOptions)object0).i());
            bmbu bmbu0 = new bmbu(bmbt.a, s1, s, "com.google.android.gms", null);
            arr_b = bmbu0.b();
            arr_b1 = bmbu0.c();
        }
        gfsz gfsz0 = new gfsz(arr_b1, arr_b);
        try {
            bundle0 = new Bundle();
            bundle0.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle0.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", publicKeyCredentialCreationOptions0.m().toString());
            bundle0.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", ((byte[])gfsz0.b));
            byte[] arr_b2 = publicKeyCredentialCreationOptions0.b.c();
            Bundle bundle1 = new Bundle();
            bundle1.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", Base64.encodeToString(arr_b2, 11));
            bundle1.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", publicKeyCredentialCreationOptions0.b.d);
            bundle0.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle1);
            bundle0.putBoolean("com.android.chrome.GPM_IGNORE", true);
            bundle0.putString("com.android.chrome.CHANNEL", "gmscore");
        }
        catch(JSONException unused_ex) {
            bmhb bmhb0 = new bmhb();
            bmhb0.b(ErrorCode.b);
            bmhb0.a = "invalid json";
            bmor0.b(bmhb0.a());
            return;
        }
        CreateCredentialRequest createCredentialRequest0 = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle0, bundle0).setAlwaysSendAppInfoToProvider(true).setOrigin(s).build();
        bjk..ExternalSyntheticApiModelOutline0.m(authenticateChimeraActivity0.getSystemService("credential")).createCredential(authenticateChimeraActivity0, createCredentialRequest0, null, authenticateChimeraActivity0.getMainExecutor(), new bmpd(bmor0, gfsz0));
    }
}

