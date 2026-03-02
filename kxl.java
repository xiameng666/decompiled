import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse.Builder;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;
import java.util.List;

public final class kxl {
    public static final BeginCreateCredentialResponse a(kvc kvc0) {
        Slice slice0;
        ibuq.f(kvc0, "response");
        BeginCreateCredentialResponse.Builder beginCreateCredentialResponse$Builder0 = new BeginCreateCredentialResponse.Builder();
        for(Object object0: kvc0.a) {
            kwa kwa0 = (kwa)object0;
            ibuq.f(kwa0, "createEntry");
            if(Build.VERSION.SDK_INT >= 35) {
                ibuq.f(kwa0, "createEntry");
                Slice.Builder slice$Builder0 = kvy.b(kwa0);
                kvs kvs0 = kwa0.h;
                if(kvs0 != null) {
                    List list0 = ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS");
                    slice$Builder0.addInt(kvs0.a, null, list0);
                    slice$Builder0.addBundle(kvr.b(kvs0), null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA"));
                }
                slice0 = slice$Builder0.build();
            }
            else {
                ibuq.f(kwa0, "createEntry");
                slice0 = kvy.b(kwa0).build();
            }
            ibuq.e(slice0, "build(...)");
            if(slice0 != null) {
                beginCreateCredentialResponse$Builder0.addCreateEntry(new CreateEntry(slice0));
            }
        }
        kxc kxc0 = kvc0.b;
        if(kxc0 != null) {
            beginCreateCredentialResponse$Builder0.setRemoteCreateEntry(new RemoteEntry(kxb.c(kxc0)));
        }
        BeginCreateCredentialResponse beginCreateCredentialResponse0 = beginCreateCredentialResponse$Builder0.build();
        ibuq.e(beginCreateCredentialResponse0, "build(...)");
        return beginCreateCredentialResponse0;
    }

    public static final kva b(BeginCreateCredentialRequest beginCreateCredentialRequest0) {
        ibuq.f(beginCreateCredentialRequest0, "request");
        String s = beginCreateCredentialRequest0.getType();
        ibuq.e(s, "getType(...)");
        Bundle bundle0 = beginCreateCredentialRequest0.getData();
        ibuq.e(bundle0, "getData(...)");
        CallingAppInfo callingAppInfo0 = beginCreateCredentialRequest0.getCallingAppInfo();
        if(callingAppInfo0 != null) {
            String s1 = callingAppInfo0.getPackageName();
            ibuq.e(s1, "getPackageName(...)");
            SigningInfo signingInfo0 = callingAppInfo0.getSigningInfo();
            ibuq.e(signingInfo0, "getSigningInfo(...)");
            return kuz.a(s, bundle0, kvu.a(s1, signingInfo0, callingAppInfo0.getOrigin()));
        }
        return kuz.a(s, bundle0, null);
    }
}

