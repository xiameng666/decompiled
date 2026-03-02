import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.Set;

abstract class ffgn {
    final String g;
    final Intent h;

    public ffgn(String s, Intent intent0) {
        batl.s(s);
        this.g = s;
        batl.s(intent0);
        this.h = intent0;
    }

    // String Decryptor: 1 succeeded, 0 failed
    public String a() {
        return "";
    }

    public abstract void b(fffu arg1, fdjb arg2);

    public abstract boolean c();

    public boolean d(IntentFilter[] arr_intentFilter, boolean z, String s, String s1) {
        if(arr_intentFilter == null) {
            return true;
        }
        String s2 = this.h.getAction();
        String s3 = this.h.getScheme();
        Uri uri0 = this.h.getData();
        Set set0 = this.h.getCategories();
        for(int v = 0; v < arr_intentFilter.length; ++v) {
            if(arr_intentFilter[v].match(s2, null, s3, uri0, set0, "WearableServiceEvent") > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        return "Event[" + this.hashCode() + ": " + this.g + ", event=" + "" + "]";
    }
}

