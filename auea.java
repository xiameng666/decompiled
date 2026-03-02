import android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback;
import java.util.List;

public final class auea implements MediaRouter2.DeviceSuggestionsUpdatesCallback {
    final String a;
    final aueg b;

    public auea(String s, aueg aueg0) {
        this.a = s;
        this.b = aueg0;
        super();
    }

    public final void onSuggestionsCleared(String s) {
        ibuq.f(s, "pkgName");
    }

    public final void onSuggestionsRequested() {
        ((ggtj)aueg.b.h()).B("onSuggestionsRequested by UMO for %s", this.a);
        this.b.b(this.a, null);
    }

    public final void onSuggestionsUpdated(String s, List list0) {
        ibuq.f(s, "pkgName");
        ibuq.f(list0, "devices");
    }
}

