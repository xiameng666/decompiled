import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

public final class aqmq {
    public final du a;
    public final Map b;
    public final Map c;
    public final Map d;

    public aqmq(du du0) {
        ibuq.f(du0, "fragment");
        super();
        this.a = du0;
        du0.getChildFragmentManager().af("backup_dialog_positive_button_clicked", du0, new aqmm(this));
        du0.getChildFragmentManager().af("backup_dialog_negative_button_clicked", du0, new aqml(this));
        du0.getChildFragmentManager().af("backup_dialog_cancelled", du0, new aqmn(this));
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public static iw a(aqmq aqmq0, String s, String s1, String s2, String s3, String s4, boolean z, int v) {
        ibuq.f(s1, "title");
        ibuq.f(s2, "message");
        ibuq.f(s3, "positiveButtonText");
        du du0 = aqmq0.a;
        de de0 = (du0 instanceof de) ? ((de)du0) : null;
        if(de0 != null) {
            de0.setCancelable(((boolean)(((int)z) | ((v & 0x20) == 0 ? 1 : 0) ^ 1)));
        }
        Context context0 = du0.requireContext();
        iv iv0 = sku.a(context0) ? new iv(context0) : new fyju(fyhn.a(new adv(context0, 0x7F160C6A)), 0x7F16009B);  // style:Theme.GoogleMaterial3.DayNight
        if((v & 16) != 0) {
            s4 = null;
        }
        iv0.setTitle(s1);
        iv0.n(s2);
        iv0.r(s3, new aqmo(aqmq0, s));
        if(s4 != null) {
            iv0.o(s4, new aqmp(aqmq0, s));
        }
        iw iw0 = iv0.create();
        ibuq.e(iw0, "create(...)");
        return iw0;
    }
}

