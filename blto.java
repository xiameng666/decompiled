import android.content.Intent;
import j..util.Objects;
import java.util.concurrent.TimeoutException;

final class blto implements gmbg {
    final bltp a;
    final bltn b;

    public blto(bltp bltp0, bltn bltn0) {
        this.b = bltn0;
        Objects.requireNonNull(bltp0);
        this.a = bltp0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof TimeoutException)) {
            this.a.b.a();
            this.b.a(Integer.valueOf(16));
            return;
        }
        this.b.a(Integer.valueOf(8));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((int)(((Integer)object0))) == 0) {
            Intent intent0 = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent0.addFlags(0x10000000);
            this.a.a.startActivity(intent0);
        }
        this.b.a(Integer.valueOf(16));
    }
}

