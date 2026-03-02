import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

public final class kww {
    public static final Bundle a(kwx kwx0) {
        Bundle bundle0 = new Bundle();
        List list0 = kwx0.a;
        int v = list0.size();
        bundle0.putInt("androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE", v);
        for(int v1 = 0; v1 < v; ++v1) {
            kjn kjn0 = (kjn)list0.get(v1);
            bundle0.putString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + v1, kjn0.a);
            bundle0.putBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_" + v1, kjn0.c);
            bundle0.putBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_" + v1, kjn0.b);
            bundle0.putBoolean("androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_" + v1, kjn0.d);
            bundle0.putParcelableArray("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_" + v1, ((Parcelable[])kjn0.f.toArray(new ComponentName[0])));
        }
        kvu.b(bundle0, kwx0.b);
        return bundle0;
    }

    public static final kwx b(List list0, kvx kvx0, kvt kvt0, Bundle bundle0) {
        ibuq.f(list0, "options");
        return new kwx(list0, kvx0, kvt0, bundle0);
    }
}

