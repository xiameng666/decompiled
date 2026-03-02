import android.app.RemoteInput.Builder;
import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

public final class jvz {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public jvz(String s, CharSequence charSequence0, CharSequence[] arr_charSequence, boolean z, int v, Bundle bundle0, Set set0) {
        this.a = s;
        this.b = charSequence0;
        this.c = arr_charSequence;
        this.d = z;
        this.e = v;
        this.f = bundle0;
        this.g = set0;
        if(v == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput[] a(jvz[] arr_jvz) {
        RemoteInput[] arr_remoteInput = new RemoteInput[arr_jvz.length];
        for(int v = 0; v < arr_jvz.length; ++v) {
            jvz jvz0 = arr_jvz[v];
            RemoteInput.Builder remoteInput$Builder0 = new RemoteInput.Builder(jvz0.a).setLabel(jvz0.b).setChoices(jvz0.c).setAllowFreeFormInput(jvz0.d).addExtras(jvz0.f);
            for(Object object0: jvz0.g) {
                remoteInput$Builder0.setAllowDataType(((String)object0), true);
            }
            remoteInput$Builder0.setEditChoicesBeforeSending(jvz0.e);
            arr_remoteInput[v] = remoteInput$Builder0.build();
        }
        return arr_remoteInput;
    }
}

