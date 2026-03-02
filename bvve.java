import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.TimeUnit;

public final class bvve {
    public final gful_cronetEngineProvider a;
    public final gful_cronetEngineProvider b;
    public final ianj_grpcChannel c;

    public bvve(Context context0) {
        this.c = bvve.a(context0, iaqs.a);
        this.a = gfus.a(((gful_cronetEngineProvider)new bvvc(this)));
        this.b = gfus.a(((gful_cronetEngineProvider)new bvvd(context0)));
    }

    public static ianj_grpcChannel a(Context context0, iaqs iaqs0) {
        iaqn iaqn0 = gpjc.a(context0, new ggoh("com.google.android.apps.photos"), gmap.a);
        iaqq iaqq0 = iaqq.m(iaql.b("com.google.android.apps.photos", "com.google.android.apps.photos.backup.apiservice.grpc.PhotosBackupGrpcService"), context0);
        iaqo iaqo0 = iaqp.a.a();
        if(Build.VERSION.SDK_INT >= 34) {
            iaqo0.c();
        }
        iaqq0.q(iaqo0.a());
        iaqq0.o(iaqs0);
        iaqq0.p(iaqn0);
        iaqq0.n(htws.a.b().b(), TimeUnit.SECONDS);
        iaqq0.j();
        return iaqq0.a();
    }
}

