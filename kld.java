import android.os.Bundle;

public final class kld {
    public static final Bundle a(kle kle0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE", kle0.a());
        CharSequence charSequence0 = kle0.b;
        if(charSequence0 != null) {
            bundle0.putCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE", charSequence0);
        }
        return bundle0;
    }

    public static final kle b(Bundle bundle0) {
        String s = bundle0.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
        if(s != null) {
            return kmo.a(s, bundle0.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"));
        }
        throw new IllegalArgumentException("Bundle was missing exception type.");
    }
}

