import android.os.Bundle;

public final class kwb {
    public static final void a(kwc kwc0, Bundle bundle0, int v) {
        ibuq.f(kwc0, "<this>");
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_" + v, kwc0.a());
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_" + v, kwc0.b.a);
        bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + v, kwc0.b.b);
        bundle0.putBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_" + v, kwc0.b.c);
        bundle0.putCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_" + v, kwc0.c);
        bundle0.putBoolean("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_" + v, kwc0.d);
        CharSequence charSequence0 = kwc0.e;
        if(charSequence0 != null) {
            bundle0.putCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_" + v, charSequence0);
        }
    }
}

