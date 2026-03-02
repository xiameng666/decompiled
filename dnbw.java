import android.widget.TextView;
import java.util.regex.Matcher;

public final class dnbw implements ibts {
    public final dnci a;

    public dnbw(dnci dnci0) {
        this.a = dnci0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s1;
        dnkk dnkk0 = (dnkk)object0;
        dnci dnci0 = this.a;
        dnkk dnkk1 = (dnkk)dnci0.y().g.ij();
        if(dnkk1 != null) {
            dxev dxev0 = dnkk1.a;
            if(dxev0 != null) {
                hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                if(hkhr0 != null) {
                    TextView textView0 = dnci0.ah;
                    if(textView0 == null) {
                        ibuq.j("cardNickname");
                        textView0 = null;
                    }
                    String s = hkhr0.h;
                    ibuq.e(s, "getTitle(...)");
                    Matcher matcher0 = dnci.a.matcher(s);
                    ibuq.e(matcher0, "matcher(...)");
                    if(matcher0.find()) {
                        s1 = matcher0.group();
                        ibuq.e(s1, "group(...)");
                    }
                    else {
                        s1 = "";
                    }
                    if(s1.length() != 0) {
                        s = ibzk.s(ibzk.Q(s, s1, "")).toString();
                    }
                    textView0.setText(s);
                }
            }
        }
        return ibom.a;
    }
}

