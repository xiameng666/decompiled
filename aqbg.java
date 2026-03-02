import android.app.assist.AssistStructure.ViewNode;
import android.content.ContentResolver;
import android.provider.Settings.Global;
import android.view.ViewStructure.HtmlInfo;
import com.google.android.gms.autofill.fill.IFillField;
import com.google.android.gms.autofill.service.common.IDetectionHistory.IDetectionResult;
import com.google.android.gms.autofill.service.common.IDetectionHistory;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public final class aqbg {
    static {
        bboh.b("AWG_DEBUG", bbcu.cD);
    }

    public static Object a(Object object0, String s) {
        if(object0 != null) {
            try {
                Method method0 = object0.getClass().getDeclaredMethod(s, null);
                if(method0 != null) {
                    method0.setAccessible(true);
                    return method0.invoke(object0, null);
                }
                return null;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static void b(AssistStructure.ViewNode assistStructure$ViewNode0, int v) {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(String.format(a.f(v, "%", "s"), ""));
        stringBuilder0.append(assistStructure$ViewNode0.getClassName());
        stringBuilder0.append(" [ ");
        aqbg.f(stringBuilder0, "web_domain", assistStructure$ViewNode0.getWebDomain());
        aqbg.f(stringBuilder0, "autofill_id", assistStructure$ViewNode0.getAutofillId());
        aqbg.f(stringBuilder0, "id", assistStructure$ViewNode0.getIdEntry());
        aqbg.f(stringBuilder0, "hints", assistStructure$ViewNode0.getAutofillHints());
        aqbg.f(stringBuilder0, "placeholder", assistStructure$ViewNode0.getHint());
        aqbg.f(stringBuilder0, "text", assistStructure$ViewNode0.getText());
        aqbg.f(stringBuilder0, "cdesc", assistStructure$ViewNode0.getContentDescription());
        aqbg.f(stringBuilder0, "visible", Boolean.valueOf(assistStructure$ViewNode0.getVisibility() == 0));
        aqbg.f(stringBuilder0, "text_id", assistStructure$ViewNode0.getTextIdEntry());
        switch(assistStructure$ViewNode0.getImportantForAutofill()) {
            case 0: 
            case 1: 
            case 4: {
                s = "Yes";
                break;
            }
            default: {
                s = "No";
            }
        }
        aqbg.f(stringBuilder0, "autofill_enabled", s);
        ViewStructure.HtmlInfo viewStructure$HtmlInfo0 = assistStructure$ViewNode0.getHtmlInfo();
        if(viewStructure$HtmlInfo0 != null) {
            aqbg.f(stringBuilder0, "html", viewStructure$HtmlInfo0.getAttributes());
        }
        stringBuilder0.append(']');
        int v2 = assistStructure$ViewNode0.getChildCount();
        for(int v1 = 0; v1 < v2; ++v1) {
            aqbg.b(assistStructure$ViewNode0.getChildAt(v1), v + 1);
        }
    }

    public static void c(StringBuilder stringBuilder0, int v, int v1, String s) {
        if((v & v1) != 0) {
            stringBuilder0.append(" flag ");
            stringBuilder0.append(s);
            stringBuilder0.append(" set\n");
        }
    }

    public static boolean d(ContentResolver contentResolver0) {
        return Settings.Global.getInt(contentResolver0, "awg_debug_logging_enabled", -1) == 1;
    }

    public static void e(IDetectionHistory iDetectionHistory0) {
        if(iDetectionHistory0 != null) {
            gged_interceptors gged0 = iDetectionHistory0.h();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                gged_interceptors gged1 = ((IDetectionHistory.IDetectionResult)gged0.get(v1)).f();
                int v2 = gged1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    IFillField iFillField0 = (IFillField)gged1.get(v3);
                    Objects.toString(iFillField0.e());
                    iFillField0.g();
                    String s = (String)Collection.-EL.stream(iFillField0.l()).map(new aqbf()).collect(Collectors.joining(", "));
                    gfsx gfsx0 = iFillField0.h();
                    if(gfsx0.i()) {
                        amxo amxo0 = (amxo)gfsx0.d();
                        ((amxo)gfsx0.d()).a.a();
                    }
                }
            }
        }
    }

    private static void f(StringBuilder stringBuilder0, String s, Object object0) {
        if(object0 != null) {
            stringBuilder0.append(s);
            stringBuilder0.append(" = \"");
            if((object0 instanceof String[])) {
                stringBuilder0.append(Arrays.toString(((String[])object0)));
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append("\" ");
        }
    }
}

