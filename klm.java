import android.os.Bundle;

public final class klm {
    public static final Bundle a(kln kln0) {
        ibuq.f(kln0, "ex");
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE", kln0.a());
        CharSequence charSequence0 = kln0.a;
        if(charSequence0 != null) {
            bundle0.putCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE", charSequence0);
        }
        return bundle0;
    }

    public static final kln b(Bundle bundle0) {
        String s = bundle0.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
        if(s != null) {
            return kmo.b(s, bundle0.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"));
        }
        throw new IllegalArgumentException("Bundle was missing exception type.");
    }
}

