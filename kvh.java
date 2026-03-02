import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest.Builder;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.CallingAppInfo;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public final class kvh {
    public static final Bundle a(kvi kvi0) {
        ibuq.f(kvi0, "request");
        Bundle bundle0 = new Bundle();
        if(Build.VERSION.SDK_INT >= 34) {
            ibuq.f(kvi0, "request");
            ibuq.f(kvi0, "request");
            BeginGetCredentialRequest.Builder beginGetCredentialRequest$Builder0 = new BeginGetCredentialRequest.Builder();
            kvx kvx0 = kvi0.b;
            if(kvx0 != null) {
                SigningInfo signingInfo0 = kvx0.a();
                beginGetCredentialRequest$Builder0.setCallingAppInfo(new CallingAppInfo(kvx0.a, signingInfo0, kvx0.b));
            }
            BeginGetCredentialRequest beginGetCredentialRequest0 = beginGetCredentialRequest$Builder0.setBeginGetCredentialOptions(((List)Collection.-EL.stream(kvi0.a).map(new kxw(new kxv())).collect(Collectors.toList()))).build();
            ibuq.e(beginGetCredentialRequest0, "build(...)");
            bundle0.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", beginGetCredentialRequest0);
            return bundle0;
        }
        ibuq.f(kvi0, "request");
        List list0 = kvi0.a;
        int v = list0.size();
        bundle0.putInt("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE", v);
        for(int v1 = 0; v1 < v; ++v1) {
            bundle0.putString(a.h(v1, "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_"), ((kvg)list0.get(v1)).a);
            bundle0.putString(a.h(v1, "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_"), ((kvg)list0.get(v1)).b);
            bundle0.putBundle(a.h(v1, "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_"), ((kvg)list0.get(v1)).c);
            kvx kvx1 = kvi0.b;
            if(kvx1 != null) {
                kvu.b(bundle0, kvx1);
            }
        }
        return bundle0;
    }

    public static final kvi b(Bundle bundle0) {
        ibuq.f(bundle0, "bundle");
        if(Build.VERSION.SDK_INT >= 34) {
            ibuq.f(bundle0, "bundle");
            BeginGetCredentialRequest beginGetCredentialRequest0 = bjk..ExternalSyntheticApiModelOutline0.m(bundle0.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", BeginGetCredentialRequest.class));
            return beginGetCredentialRequest0 == null ? null : kyg.b(beginGetCredentialRequest0);
        }
        ibuq.f(bundle0, "bundle");
        kvx kvx0 = kvu.c(bundle0);
        int v = bundle0.getInt("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE", -1);
        if(v < 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = bundle0.getString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_" + v1);
            if(s == null) {
                return null;
            }
            String s1 = bundle0.getString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_" + v1);
            if(s1 == null) {
                return null;
            }
            Bundle bundle1 = bundle0.getBundle("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_" + v1);
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            arrayList0.add(kvf.a(s, s1, bundle1));
        }
        return new kvi(arrayList0, kvx0);
    }
}

