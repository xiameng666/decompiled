import android.app.PendingIntent;
import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.List;

public final class kxb {
    public static final kxc a(Slice slice0) {
        ibuq.f(slice0, "slice");
        List list0 = slice0.getItems();
        ibuq.e(list0, "getItems(...)");
        boolean z = false;
        Object object0 = null;
        for(Object object1: list0) {
            SliceItem sliceItem0 = (SliceItem)object1;
            if(sliceItem0.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")) {
                object0 = sliceItem0.getAction();
            }
            else {
                if(!sliceItem0.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT")) {
                    continue;
                }
                z = true;
            }
        }
        try {
            ibuq.c(object0);
            return new kxc(((PendingIntent)object0), z);
        }
        catch(Exception exception0) {
            Log.i("RemoteEntry", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final void b(kxc kxc0, Bundle bundle0) {
        bundle0.putParcelable("androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT", kxc0.a);
    }

    public static final Slice c(kxc kxc0) {
        Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec("RemoteEntry", 1));
        Slice slice0 = new Slice.Builder(slice$Builder0).addHints(Collections.singletonList("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")).build();
        slice$Builder0.addAction(kxc0.a, slice0, null);
        if(kxc0.b) {
            slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT"));
        }
        Slice slice1 = slice$Builder0.build();
        ibuq.e(slice1, "build(...)");
        return slice1;
    }

    public static final kxc d(Bundle bundle0) {
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT");
        return pendingIntent0 == null ? null : new kxc(pendingIntent0);
    }
}

