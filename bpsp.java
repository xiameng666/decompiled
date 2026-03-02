import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;

public final class bpsp {
    private static final bboh a;

    static {
        bpsp.a = bboh.b("IntentHelper", bbcu.eD);
    }

    public static Intent a(Context context0, String s, String s1) {
        Intent intent0 = IntentOperation.getStartIntent(context0, s, s1);
        if(intent0 == null) {
            ((ggtj)((ggtj)bpsp.a.i()).ar(5154)).R("Unable to start %s with action %s.", s, s1);
        }
        return intent0;
    }

    public static boolean b(Intent intent0, String[] arr_s) {
        if(intent0 != null && Arrays.asList(arr_s).contains(intent0.getAction())) {
            return true;
        }
        ((ggtj)((ggtj)bpsp.a.j()).ar(5155)).B("Unsupported intent: [%s]", (intent0 == null ? null : intent0.getAction()));
        return false;
    }
}

