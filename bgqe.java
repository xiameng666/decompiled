import android.content.Context;
import android.content.res.Resources;
import j..time.Duration;

public final class bgqe extends bgqc {
    public bgqe(Context context0, bayn bayn0) {
        super(context0, bayn0, Duration.ofMinutes(hsbn.d()), Duration.ofMinutes(hsbn.c()));
    }

    @Override  // bgqc
    protected final evuh b() {
        return evuh.cr;
    }

    @Override  // bgqc
    protected final String c() {
        return "ls/bOParR4an854uGOH3lQ";
    }

    @Override  // bgqc
    protected final String d(hgug hgug0) {
        hgtr hgtr0 = hgug0.c == null ? hgtr.a : hgug0.c;
        return (hgtr0.d == null ? hgts.a : hgtr0.d).d;
    }

    @Override  // bgqc
    protected final String e(hgug hgug0) {
        Resources resources0 = this.a.getResources();
        hgtr hgtr0 = hgug0.c == null ? hgtr.a : hgug0.c;
        hgtr hgtr1 = hgug0.c == null ? hgtr.a : hgug0.c;
        return resources0.getString(0x7F150A87, new Object[]{(hgtr0.d == null ? hgts.a : hgtr0.d).b, (hgtr1.d == null ? hgts.a : hgtr1.d).c});  // string:crisis_alerts_public_alerts_title "%1$s, %2$s"
    }
}

