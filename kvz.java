import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class kvz {
    public static final Map a(Bundle bundle0) {
        Map map0 = new HashMap();
        if(bundle0 != null) {
            Set set0 = bundle0.keySet();
            ibuq.e(set0, "keySet(...)");
            for(Object object0: set0) {
                String s = (String)object0;
                try {
                    map0.put(s, Integer.valueOf(bundle0.getInt(s)));
                }
                catch(Exception exception0) {
                    Log.i("CreateEntry", "Issue unpacking credential count info bundle: " + exception0.getMessage());
                }
            }
        }
        return map0;
    }

    public static final Bundle b(Map map0) {
        ibuq.f(map0, "credentialCountInformationMap");
        Bundle bundle0 = new Bundle();
        boolean z = false;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getValue() != null) {
                String s = (String)map$Entry0.getKey();
                Object object1 = map$Entry0.getValue();
                ibuq.c(object1);
                bundle0.putInt(s, ((Number)object1).intValue());
                z = true;
            }
        }
        return z ? bundle0 : null;
    }

    public static final kwa c(Slice slice0) {
        ibuq.f(slice0, "slice");
        if(Build.VERSION.SDK_INT >= 35) {
            ibuq.f(slice0, "slice");
            kwa kwa0 = kvy.a(slice0);
            if(kwa0 == null) {
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
                kvs kvs0 = bundle0 == null ? null : kvr.a(bundle0);
                return new kwa(kwa0.a, kwa0.b, kwa0.c, kwa0.d, kwa0.e, kwa0.f, kwa0.g, kvs0);
            }
            catch(Exception exception0) {
                Log.i("CreateEntry", "fromSlice failed with: " + exception0.getMessage());
                return null;
            }
        }
        return kvy.a(slice0);
    }
}

