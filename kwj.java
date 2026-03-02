import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public final class kwj {
    public static final kwk a(Slice slice0) {
        ibuq.f(slice0, "slice");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(slice0, "slice");
            kwk kwk0 = kwh.a(slice0);
            if(kwk0 == null) {
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
                boolean z = kwk0.p;
                kvs kvs0 = bundle0 == null ? null : kvr.a(bundle0);
                return new kwk(kwk0.g, kwk0.h, kwk0.i, kwk0.j, kwk0.k, kwk0.l, kwk0.m, kwk0.n, kwk0.b, kwk0.d, kwk0.c, kwk0.e, kvs0, kwk0.q, true, z);
            }
            catch(Exception exception0) {
                Log.i("CredentialEntry", "fromSlice failed with: " + exception0.getMessage());
                return null;
            }
        }
        return kwh.a(slice0);
    }

    public static final Slice b(kwk kwk0) {
        ibuq.f(kwk0, "entry");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(kwk0, "entry");
            Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kwk0.g, 1));
            kwh.c(kwk0, slice$Builder0);
            ibuq.f(kwk0, "entry");
            kvs kvs0 = kwk0.f;
            if(kvs0 != null) {
                List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS");
                slice$Builder0.addInt(kvs0.a, null, list0);
                slice$Builder0.addBundle(kvr.b(kvs0), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA"));
            }
            Slice slice0 = slice$Builder0.build();
            ibuq.e(slice0, "build(...)");
            return slice0;
        }
        ibuq.f(kwk0, "entry");
        Slice.Builder slice$Builder1 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kwk0.g, 1));
        kwh.c(kwk0, slice$Builder1);
        Slice slice1 = slice$Builder1.build();
        ibuq.e(slice1, "build(...)");
        return slice1;
    }
}

