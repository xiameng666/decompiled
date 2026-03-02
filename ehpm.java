import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

public final class ehpm {
    public static final bboh a;
    public final ehmh b;
    private final ibts c;

    static {
        ehpm.a = bboh.b("LearnMoreHandler", bbcu.dO);
    }

    public ehpm(ehmh ehmh0, ibts ibts0) {
        this.b = ehmh0;
        this.c = ibts0;
    }

    public final void a(xob xob0, String s) {
        InProductHelp inProductHelp0 = new InProductHelp(new GoogleHelp("all_consumer_services"), null, null, 0, null, 0, null);
        inProductHelp0.c = s;
        ((bthl)this.c.a(xob0)).b(inProductHelp0);
    }
}

