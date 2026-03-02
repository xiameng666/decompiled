import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public final class kwz {
    public static final kxa a(Slice slice0) {
        ibuq.f(slice0, "slice");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(slice0, "slice");
            kxa kxa0 = kwy.a(slice0);
            if(kxa0 == null) {
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
                ibuq.d(kxa0.b, "null cannot be cast to non-null type androidx.credentials.provider.BeginGetPublicKeyCredentialOption");
                kvs kvs0 = bundle0 == null ? null : kvr.a(bundle0);
                return new kxa(kxa0.g, kxa0.h, kxa0.i, kxa0.j, kxa0.k, kxa0.l, kxa0.m, ((kvq)kxa0.b), kxa0.d, kxa0.c, kxa0.e, kvs0, kxa0.p, true, kxa0.o);
            }
            catch(Exception exception0) {
                Log.i("PublicKeyCredEntry", "fromSlice failed with: " + exception0.getMessage());
                return null;
            }
        }
        return kwy.a(slice0);
    }

    public static final Slice b(kxa kxa0) {
        ibuq.f(kxa0, "entry");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(kxa0, "entry");
            Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kxa0.a, 1));
            kwy.c(kxa0, slice$Builder0);
            ibuq.f(kxa0, "entry");
            kvs kvs0 = kxa0.f;
            if(kvs0 != null) {
                List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS");
                slice$Builder0.addInt(kvs0.a, null, list0);
                slice$Builder0.addBundle(kvr.b(kvs0), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA"));
            }
            Slice slice0 = slice$Builder0.build();
            ibuq.e(slice0, "build(...)");
            return slice0;
        }
        ibuq.f(kxa0, "entry");
        Slice.Builder slice$Builder1 = new Slice.Builder(Uri.EMPTY, new SliceSpec(kxa0.a, 1));
        kwy.c(kxa0, slice$Builder1);
        Slice slice1 = slice$Builder1.build();
        ibuq.e(slice1, "build(...)");
        return slice1;
    }
}

