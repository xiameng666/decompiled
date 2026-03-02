import android.content.Intent;
import android.os.Binder;
import com.google.android.gms.common.api.ApiMetadata;

public final class ekrt extends ekql implements cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public ekrt(cjts cjts0, String s, String s1) {
        this.a = cjts0;
        this.b = s;
        this.c = s1;
    }

    @Override  // ekqm
    public final void a(Intent intent0, ekqp ekqp0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eB);
        azuf0.g(bbdq.Z);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekqz ekqz0 = new ekqz(intent0, ekqp0, azuf0.a(), Binder.getCallingUserHandle());
        this.a.b(ekqz0);
    }

    @Override  // ekqm
    public final void b(int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eB);
        azuf0.g(bbdq.Z);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekqj ekqj0 = new ekqj(v, azuf0.a());
        this.a.b(ekqj0);
    }
}

