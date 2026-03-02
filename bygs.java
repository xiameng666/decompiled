import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.ui.CredentialSelectorChimeraActivity;

public final class bygs extends ibsl implements ibtw {
    final CredentialSelectorChimeraActivity a;

    public bygs(CredentialSelectorChimeraActivity credentialSelectorChimeraActivity0, ibrl ibrl0) {
        this.a = credentialSelectorChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bygs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bygs(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Intent intent1;
        ibnx.b(object0);
        CredentialSelectorChimeraActivity credentialSelectorChimeraActivity0 = this.a;
        bxzt bxzt0 = credentialSelectorChimeraActivity0.a().b().g;
        switch(bxzt0.a.ordinal()) {
            case 2: {
                Intent intent0 = bxzt0.b;
                if(intent0 == null) {
                    Log.w("CredentialSelector", "Unexpected: complete with null provider result.");
                    CredentialSelectorChimeraActivity.g(credentialSelectorChimeraActivity0, "android.credentials.GetCredentialException.TYPE_USER_CANCELED");
                    return ibom.a;
                }
                if(credentialSelectorChimeraActivity0.a().b().d != null) {
                    byhy byhy0 = credentialSelectorChimeraActivity0.a().b().e;
                    byhu byhu0 = (byhy0 instanceof byhu) ? ((byhu)byhy0) : null;
                    if(byhu0 != null) {
                        String s = byhu0.a;
                        if(s != null) {
                            ibuq.c(intent0.putExtra("androidx.identitycredentials.extra.SIGNING_INFO", credentialSelectorChimeraActivity0.getPackageManager().getPackageInfo(s, 0x8000000).signingInfo));
                            intent0.putExtra("androidx.identitycredentials.extra.CALLING_PACKAGE_NAME", s);
                        }
                    }
                }
                ResultReceiver resultReceiver0 = credentialSelectorChimeraActivity0.j;
                if(resultReceiver0 != null) {
                    resultReceiver0.send(-1, bygn.b(intent0));
                }
                if(credentialSelectorChimeraActivity0.k != 1) {
                    intent1 = new Intent(intent0);
                }
                else if(intent0.getExtras() == null) {
                    intent1 = bygn.g(1, "android.credentials.GetCredentialException.TYPE_UNKNOWN", "No provider data found");
                }
                else if(bygn.f(intent0) && bygn.e(intent0)) {
                    intent1 = new Intent(intent0);
                }
                else if(bygn.e(intent0)) {
                    Intent intent2 = new Intent();
                    if(hvfx.c() && intent0.hasExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA")) {
                        Bundle bundle0 = intent0.getBundleExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA");
                        if(bundle0 == null || !bundle0.containsKey("credentialFormat") || !ibuq.m(bundle0.getString("credentialFormat"), "ZK_MDOC")) {
                            intent2.putExtras(bygn.b(intent0));
                        }
                    }
                    else {
                        intent2.putExtras(bygn.b(intent0));
                    }
                    try {
                        Bundle bundle1 = bygn.b(intent0);
                        Intent intent3 = Build.VERSION.SDK_INT < 33 ? ((Intent)bundle1.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA")) : ((Intent)bundle1.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", Intent.class));
                        if(intent3 == null) {
                            throw new bxur("android.credentials.GetCredentialException.TYPE_UNKNOWN", "Provider result is empty");
                        }
                        if(!intent3.hasExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE")) {
                            if(!intent3.hasExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE")) {
                                throw new bxur("android.credentials.GetCredentialException.TYPE_UNKNOWN", "Unknown provider error");
                            }
                            String s1 = intent3.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE");
                            throw s1 == null ? new bxur("android.credentials.GetCredentialException.TYPE_UNKNOWN", "Unknown provider error") : new bxur(s1, intent3.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE"));
                        }
                        String s2 = intent3.getStringExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE");
                        Bundle bundle2 = intent3.getBundleExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA");
                        if(s2 == null || bundle2 == null) {
                            throw new bxur("android.credentials.GetCredentialException.TYPE_UNKNOWN", "Credential result is empty");
                        }
                        Credential credential0 = new GetCredentialResponse(new Credential(s2, bundle2)).a;
                        Bundle bundle3 = credential0.b;
                        byte[] arr_b = bundle3.getByteArray("identityToken");
                        String s3 = credential0.a;
                        kjf kjf0 = ibuq.m(s3, "com.credman.IdentityCredential") && arr_b != null ? new kjx(new String(arr_b, ibyo.a)) : kje.a(s3, bundle3);
                        kwr.h(intent2, new kkb(kjf0));
                    }
                    catch(bxur bxur0) {
                        kwr.g(intent2, new kll(bxur0.a, bxur0.getMessage()));
                    }
                    intent1 = intent2;
                }
                else {
                    Intent intent4 = new Intent(intent0);
                    intent4.putExtras(bygn.b(intent0));
                    intent1 = intent4;
                }
                credentialSelectorChimeraActivity0.b(-1, intent1);
                return ibom.a;
            }
            case 4: {
                credentialSelectorChimeraActivity0.c();
                return ibom.a;
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: {
                return ibom.a;
            }
            case 6: {
                CredentialSelectorChimeraActivity.g(credentialSelectorChimeraActivity0, "android.credentials.GetCredentialException.TYPE_USER_CANCELED");
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

