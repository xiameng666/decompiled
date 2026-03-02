import android.os.Bundle;

public final class kwu {
    public static final Bundle a(kwv kwv0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_TYPE", kwv0.a.a);
        bundle0.putBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CREDENTIAL_DATA", kwv0.a.b);
        bundle0.putBundle("androidx.credentials.provider.extra.CREATE_REQUEST_CANDIDATE_QUERY_DATA", kwv0.a.c);
        kvu.b(bundle0, kwv0.b);
        return bundle0;
    }
}

