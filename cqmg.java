import android.content.Context;
import androidx.preference.Preference;

public final class cqmg implements ohi {
    public final cqne a;

    public cqmg(cqne cqne0) {
        this.a = cqne0;
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        all all0;
        cqne cqne0 = this.a;
        Context context0 = cqne0.requireContext();
        if(cqix.h.a(context0) == object0) {
            return false;
        }
        cqpr cqpr0 = cqne0.ag;
        if(cqpr0 != null) {
            Context context1 = cqne0.requireContext();
            cqpr0.b = ((Boolean)object0).booleanValue();
            alh alh0 = alh.c(context1);
            if(!hxwi.h() && alh0.b(0x80FF) != 0) {
                cqpr0.a();
                return true;
            }
            if(cjbx.h(context1)) {
                all0 = cjbx.a(context1);
            }
            else {
                all0 = new all();
                all0.d = cqpr0.b ? "Allow device to be located?" : "Stop allowing device to be located?";
                all0.e = "To continue, verify it\'s you";
                all0.i = 0x80FF;
            }
            cjbx cjbx0 = cqpr0.a;
            gftb.check(cjbx0);
            all0.a = 0x7F080A61;
            all0.c = "Find Hub";
            cjbx0.e(all0.a());
            return false;
        }
        cqne0.W(((Boolean)object0).booleanValue());
        return true;
    }
}

