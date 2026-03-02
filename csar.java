import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import java.util.concurrent.Executor;

public final class csar {
    protected static final bboh a;
    public final Executor b;
    protected final bbfe_BaseGrpcServer c;
    public final qil d;
    public String e;
    public static final int f;

    static {
        csar.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public csar(String s, int v) {
        bblp bblp0 = new bblp(1, 10);
        super();
        this.b = bblp0;
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(AppContextProvider.a(), s, v, -1, 0x6100);
        this.c = bbfe0;
        this.e = "";
        this.d = new qil(bbfe0);
    }

    public static baqr a(String s) {
        baqr baqr0 = new baqr();
        baqr0.m("auth_token", s);
        baqr0.a = AppContextProvider.a().getApplicationInfo().uid;
        baqr0.e = "com.google.android.gms";
        baqr0.d = "com.google.android.gms";
        return baqr0;
    }
}

