import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class aqru {
    public static final bboh a;
    public final gful_cronetEngineProvider b;

    static {
        aqru.a = bboh.a("RestoreGrpcBackupOptInApiClient");
    }

    public aqru(Context context0) {
        aqrt aqrt0 = new aqrt(context0);
        super();
        this.b = gfus.a(((gful_cronetEngineProvider)aqrt0));
    }

    public static fpwv a(Context context0) {
        return new fpwv(aqru.b(context0));
    }

    static ianj_grpcChannel b(Context context0) {
        iaqn iaqn0 = gpjc.a(context0, new ggoh("com.google.android.apps.restore"), new bblp(1, 9));
        iaqq iaqq0 = iaqq.m(iaql.b("com.google.android.apps.restore", "com.google.android.apps.restore.backup.apiservice.BackupOptInApiEndpointService"), context0);
        iaqq0.q(iaqp.a);
        iaqr iaqr0 = new iaqr();
        iaqr0.b();
        iaqq0.o(iaqr0.a());
        iaqq0.p(iaqn0);
        iaqq0.j();
        iaqq0.n(3L, TimeUnit.SECONDS);
        return iaqq0.a();
    }
}

