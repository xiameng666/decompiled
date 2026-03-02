import android.text.Html;
import java.util.List;

public final class ddkj {
    public static ddkb a(hfga hfga0) {
        String s;
        int v = 1;
        if(hfga0 == null) {
            return null;
        }
        if(hfga0.b == 1) {
            gque gque0 = (gque)hfga0.c;
            return new ddkb(ddkj.b((gque0.b == null ? ghim.a : gque0.b)), ddkj.c(gque0.c), ddkj.c(gque0.e), ddkj.c(gque0.d), gque0.f, gque0.g);
        }
        cunf cunf0 = dcvz.a.b();
        if(hfga0.b == 2) {
            int v1 = hffz.a(((Integer)hfga0.c).intValue());
            if(v1 != 0) {
                v = v1;
            }
        }
        switch(v - 1) {
            case 2: {
                s = "ShouldNotPrompt";
                break;
            }
            case 3: {
                s = "AlreadyAccepted";
                break;
            }
            default: {
                s = "Unknown";
            }
        }
        cunf0.h("Unable to get consent text for device contacts: uiNotAvailableReason=%s.", s);
        return null;
    }

    private static String b(ghim ghim0) {
        return Html.fromHtml(ghin.b(ghim0).b, 0x3F).toString();
    }

    private static String c(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: list0) {
            stringBuilder0.append(ddkj.b(((ghim)object0)));
        }
        return stringBuilder0.toString();
    }
}

