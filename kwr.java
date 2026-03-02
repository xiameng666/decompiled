import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class kwr {
    public static final kle a(Intent intent0) {
        if(Build.VERSION.SDK_INT >= 34) {
            CreateCredentialException createCredentialException0 = bjk..ExternalSyntheticApiModelOutline0.m(intent0.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class));
            if(createCredentialException0 != null) {
                String s = createCredentialException0.getType();
                ibuq.e(s, "getType(...)");
                return kmo.a(s, createCredentialException0.getMessage());
            }
            return null;
        }
        Bundle bundle0 = intent0.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
        return bundle0 == null ? null : kld.b(bundle0);
    }

    public static final kiu b(String s, Intent intent0) {
        if(Build.VERSION.SDK_INT >= 34) {
            CreateCredentialResponse createCredentialResponse0 = bjk..ExternalSyntheticApiModelOutline0.m(intent0.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class));
            if(createCredentialResponse0 == null) {
                return null;
            }
            Bundle bundle0 = createCredentialResponse0.getData();
            ibuq.e(bundle0, "getData(...)");
            return kit.a(s, bundle0);
        }
        Bundle bundle1 = intent0.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
        if(bundle1 == null) {
            return null;
        }
        String s1 = bundle1.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE");
        if(s1 == null) {
            return null;
        }
        Bundle bundle2 = bundle1.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA");
        return bundle2 == null ? null : kit.a(s1, bundle2);
    }

    public static final kln c(Intent intent0) {
        if(Build.VERSION.SDK_INT >= 34) {
            GetCredentialException getCredentialException0 = kju..ExternalSyntheticApiModelOutline4.m(intent0.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class));
            if(getCredentialException0 != null) {
                String s = getCredentialException0.getType();
                ibuq.e(s, "getType(...)");
                return kmo.b(s, getCredentialException0.getMessage());
            }
            return null;
        }
        Bundle bundle0 = intent0.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
        return bundle0 == null ? null : klm.b(bundle0);
    }

    public static final kkb d(Intent intent0) {
        if(Build.VERSION.SDK_INT >= 34) {
            GetCredentialResponse getCredentialResponse0 = epd..ExternalSyntheticApiModelOutline2.m(intent0.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class));
            if(getCredentialResponse0 == null) {
                return null;
            }
            Credential credential0 = getCredentialResponse0.getCredential();
            ibuq.e(credential0, "getCredential(...)");
            ibuq.f(credential0, "credential");
            String s = credential0.getType();
            ibuq.e(s, "getType(...)");
            Bundle bundle0 = credential0.getData();
            ibuq.e(bundle0, "getData(...)");
            return new kkb(kje.a(s, bundle0));
        }
        Bundle bundle1 = intent0.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
        if(bundle1 == null) {
            return null;
        }
        String s1 = bundle1.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE");
        if(s1 == null) {
            return null;
        }
        Bundle bundle2 = bundle1.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA");
        return bundle2 == null ? null : new kkb(kje.a(s1, bundle2));
    }

    public static final void e(Intent intent0, kle kle0) {
        if(Build.VERSION.SDK_INT >= 34) {
            intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", new CreateCredentialException(kle0.a(), kle0.getMessage()));
            return;
        }
        intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", kld.a(kle0));
    }

    public static final void f(Intent intent0, kiu kiu0) {
        if(Build.VERSION.SDK_INT >= 34) {
            intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", new CreateCredentialResponse(kiu0.b));
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE", kiu0.a);
        bundle0.putBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA", kiu0.b);
        intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", bundle0);
    }

    public static final void g(Intent intent0, kln kln0) {
        ibuq.f(kln0, "exception");
        if(Build.VERSION.SDK_INT >= 34) {
            ibuq.f(kln0, "exception");
            intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", new GetCredentialException(kln0.a(), kln0.getMessage()));
            return;
        }
        ibuq.f(kln0, "exception");
        intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", klm.a(kln0));
    }

    public static final void h(Intent intent0, kkb kkb0) {
        if(Build.VERSION.SDK_INT >= 34) {
            intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", new GetCredentialResponse(new Credential(kkb0.a.a, kkb0.a.b)));
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE", kkb0.a.a);
        bundle0.putBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA", kkb0.a.b);
        intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", bundle0);
    }
}

