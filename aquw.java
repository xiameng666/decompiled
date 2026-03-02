import android.content.Context;
import android.os.Build.VERSION;

public final class aquw {
    public final gful_cronetEngineProvider a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;

    public aquw(Context context0) {
        iaqr iaqr0 = new iaqr();
        iaqr0.a = true;
        iaqr0.b();
        fptx fptx0 = fptz.a(aquw.d(context0, "com.google.android.apps.photos", "com.google.android.apps.photos.backup.apiservice.grpc.PhotosBackupGrpcService", iaqr0.a()));
        fpty fpty0 = fptz.b(aquw.c(context0, "com.google.android.apps.photos", "com.google.android.apps.photos.backup.apiservice.grpc.PhotosBackupGrpcService"));
        ianj_grpcChannel ianj0 = aquw.c(context0, "com.google.android.apps.restore", "com.google.android.apps.restore.backup.photos.apiservice.PhotosBackupApiEndpointService");
        fpyg fpyg0 = (fpyg)fpyg.f(new fpyf(), ianj0);
        super();
        this.b = gfus.a(((gful_cronetEngineProvider)new aqut(fptx0)));
        this.a = gfus.a(((gful_cronetEngineProvider)new aquu(fpty0)));
        this.c = gfus.a(((gful_cronetEngineProvider)new aquv(fpyg0)));
    }

    public final fptx a() {
        return (fptx)this.b.mr();
    }

    public final fpyg b() {
        return (fpyg)this.c.mr();
    }

    private static ianj_grpcChannel c(Context context0, String s, String s1) {
        return aquw.d(context0, s, s1, iaqs.a);
    }

    private static ianj_grpcChannel d(Context context0, String s, String s1, iaqs iaqs0) {
        iaqy iaqy0 = gpjc.b(context0, new ggoh(s));
        iaqq iaqq0 = iaqq.m(iaql.b(s, s1), context0);
        iaqo iaqo0 = iaqp.a.a();
        if(Build.VERSION.SDK_INT >= 34) {
            iaqo0.c();
        }
        iaqq0.q(iaqo0.a());
        iaqq0.o(iaqs0);
        iaqq0.p(iaqy0);
        iaqq0.j();
        return iaqq0.a();
    }
}

