import android.content.Context;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;

public final class cqut extends azts implements cqsj {
    private static final String a;
    private static final azss b;

    static {
        cqut.a = "cqup";
        cqut.b = new azss();
    }

    public cqut(Context context0, MdnsOptions mdnsOptions0) {
        super(context0, new azta_api("Mdns.API", new cqus(), cqut.b), mdnsOptions0, aztr_settings.a);
    }

    @Override  // cqsj
    public final evql b(cqsk cqsk0, MdnsSearchOptions mdnsSearchOptions0) {
        azyf azyf0 = this.iD(cqsk0, cqut.a);
        azyd_linstner azyd0 = azyf0.listener_;
        batl.t(azyd0, "Key must not be null");
        return this.iI(new cquq(this, azyf0, azyf0, mdnsSearchOptions0), new cqur(this, azyd0, azyf0));
    }

    @Override  // cqsj
    public final void c(cqsk cqsk0) {
        azyd_linstner azyd0 = this.iD(cqsk0, cqut.a).listener_;
        batl.t(azyd0, "key must not be null");
        this.iJ(azyd0);
    }
}

