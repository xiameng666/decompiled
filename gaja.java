import android.content.Context;
import android.widget.TextView;
import java.util.Locale;

public final class gaja {
    public static void a(TextView textView0) {
        if(!gajm.d(textView0)) {
            return;
        }
        gaea gaea0 = gaea.aA;
        gaea gaea1 = gaea.aB;
        gaea gaea2 = gaea.az;
        gaea gaea3 = gaea.aC;
        gaea gaea4 = gaea.aq;
        Context context0 = textView0.getContext();
        String s = gaec.h(context0).k(context0, gaea.aD);
        int v = 0;
        if(s != null) {
            switch(s.toLowerCase(Locale.ROOT)) {
                case "center": {
                    v = 17;
                    break;
                }
                case "end": {
                    v = 0x800005;
                    break;
                }
                case "start": {
                    v = 0x800003;
                }
            }
        }
        gajo.a(textView0, new gajn(gaea0, gaea1, gaea2, gaea3, null, gaea4, null, null, v));
    }
}

