import android.app.PendingIntent;
import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.Log;
import j..time.Instant;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class kvy {
    public static final kwa a(Slice slice0) {
        ibuq.f(slice0, "slice");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        List list0 = slice0.getItems();
        ibuq.e(list0, "getItems(...)");
        Map map0 = linkedHashMap0;
        boolean z = false;
        Object object0 = null;
        Object object1 = null;
        Icon icon0 = null;
        CharSequence charSequence0 = null;
        Instant instant0 = null;
        for(Object object2: list0) {
            SliceItem sliceItem0 = (SliceItem)object2;
            if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME")) {
                object0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON")) {
                icon0 = sliceItem0.getIcon();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")) {
                object1 = sliceItem0.getAction();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION")) {
                map0 = ibvh.c(kvz.a(sliceItem0.getBundle()));
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                instant0 = Instant.ofEpochMilli(sliceItem0.getLong());
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE")) {
                charSequence0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                instant0 = Instant.ofEpochMilli(sliceItem0.getLong());
            }
            else {
                if(!sliceItem0.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED") || !ibuq.m(sliceItem0.getText(), "true")) {
                    continue;
                }
                z = true;
            }
        }
        try {
            ibuq.c(object0);
            ibuq.c(object1);
            return new kwa(((CharSequence)object0), ((PendingIntent)object1), icon0, charSequence0, instant0, map0, z);
        }
        catch(Exception exception0) {
            Log.i("CreateEntry", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final Slice.Builder b(kwa kwa0) {
        ibuq.f(kwa0, "createEntry");
        Map map0 = kwa0.f;
        Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
        String s = kwa0.g ? "true" : "false";
        List list0 = ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME");
        slice$Builder0.addText(kwa0.a, null, list0);
        Instant instant0 = kwa0.e;
        if(instant0 != null) {
            slice$Builder0.addLong(instant0.toEpochMilli(), null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
        }
        CharSequence charSequence0 = kwa0.d;
        if(charSequence0 != null) {
            slice$Builder0.addText(charSequence0, null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE"));
        }
        Icon icon0 = kwa0.c;
        if(icon0 != null) {
            slice$Builder0.addIcon(icon0, null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON"));
        }
        if(kvz.b(map0) != null) {
            slice$Builder0.addBundle(kvz.b(map0), null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION"));
        }
        Slice slice0 = new Slice.Builder(slice$Builder0).addHints(Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")).build();
        slice$Builder0.addAction(kwa0.b, slice0, null).addText(s, null, ibpo.b("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED"));
        return slice$Builder0;
    }
}

