import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public final class kwm {
    public static final kwn a(Slice slice0) {
        ibuq.f(slice0, "slice");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(slice0, "slice");
            kwn kwn0 = kwl.a(slice0);
            if(kwn0 == null) {
                return null;
            }
            List list0 = slice0.getItems();
            ibuq.e(list0, "getItems(...)");
            Bundle bundle0 = null;
            for(Object object0: list0) {
                SliceItem sliceItem0 = (SliceItem)object0;
                if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA")) {
                    bundle0 = sliceItem0.getBundle();
                }
            }
            try {
                ibuq.d(kwn0.b, "null cannot be cast to non-null type androidx.credentials.provider.BeginGetPasswordOption");
                boolean z = kwn0.o;
                kvs kvs0 = bundle0 == null ? null : kvr.a(bundle0);
                return new kwn(kwn0.g, kwn0.h, kwn0.i, kwn0.j, kwn0.k, kwn0.l, kwn0.m, ((kvo)kwn0.b), kwn0.d, kwn0.c, kwn0.e, kvs0, kwn0.p, true, z);
            }
            catch(Exception exception0) {
                Log.i("PasswordCredentialEntry", "fromSlice failed with: " + exception0.getMessage());
                return null;
            }
        }
        return kwl.a(slice0);
    }

    public static final Slice b(kwn kwn0) {
        ibuq.f(kwn0, "entry");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(kwn0, "entry");
            Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kwn0.a, 1));
            kwl.c(kwn0, slice$Builder0);
            ibuq.f(kwn0, "entry");
            kvs kvs0 = kwn0.f;
            if(kvs0 != null) {
                List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS");
                slice$Builder0.addInt(kvs0.a, null, list0);
                slice$Builder0.addBundle(kvr.b(kvs0), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA"));
            }
            Slice slice0 = slice$Builder0.build();
            ibuq.e(slice0, "build(...)");
            return slice0;
        }
        ibuq.f(kwn0, "entry");
        Slice.Builder slice$Builder1 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kwn0.a, 1));
        kwl.c(kwn0, slice$Builder1);
        Slice slice1 = slice$Builder1.build();
        ibuq.e(slice1, "build(...)");
        return slice1;
    }
}

