import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSetIdRequestParams;

public final class acku {
    private final gmcd a;

    static {
    }

    public acku(gmcd gmcd0) {
        this.a = gmcd0;
    }

    public final gmcd a(Context context0, AppSetIdRequestParams appSetIdRequestParams0, int v) {
        String s;
        acln acln0 = acln.b(context0);
        try {
            if(!azql.c(context0).i(v)) {
                goto label_4;
            }
            s = appSetIdRequestParams0.b;
            if(TextUtils.isEmpty(s)) {
            label_4:
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    context1 = context0;
                }
                String[] arr_s = bbsr.b(context1).k(v);
                if(arr_s == null || arr_s.length <= 0) {
                    throw new ackv();
                }
                s = arr_s[0];
                return glzd.g(acln0.c.a(), new aclk(acln0, s, context0, this.a), acln0.b);
            }
        }
        catch(ackv ackv0) {
            return gmbu.h(ackv0);
        }
        return glzd.g(acln0.c.a(), new aclk(acln0, s, context0, this.a), acln0.b);
    }
}

