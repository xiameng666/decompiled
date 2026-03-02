import android.content.Context;
import com.google.android.gms.common.Feature;

public final class caje {
    public final azts a;
    private final Context b;
    private final ajqp c;

    public caje(Context context0, ajqp ajqp0) {
        ibuq.f(ajqp0, "keyRetrievalOptions");
        super();
        this.b = context0;
        this.c = ajqp0;
        this.a = new azts(context0, ajqp0);
    }

    public final gmcd a(String s) {
        return fhra.b(this.a.jw(s));
    }

    public final gmcd b(String s) {
        return fhra.b(this.a.jC(s, true));
    }

    public final gmcd c(String s) {
        ibuq.f(s, "accountName");
        azzc azzc0 = new azzc();
        azzc0.a = new ajvg(this.a, s);
        azzc0.c = new Feature[]{amjz.j};
        azzc0.d = 0x6BC;
        azzd azzd0 = azzc0.a();
        return fhra.b(this.a.iG(azzd0));
    }
}

