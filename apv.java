import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

final class apv implements bpd {
    final atl a;
    final aqi b;

    public apv(aqi aqi0, atl atl0) {
        this.b = aqi0;
        this.a = atl0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        bmb bmb0;
        if((throwable0 instanceof bjy)) {
            aqi aqi0 = this.b;
            bka bka0 = ((bjy)throwable0).a;
            for(Object object0: aqi0.a.c()) {
                bmb0 = (bmb)object0;
                if(!bmb0.g().contains(bka0)) {
                    continue;
                }
                goto label_10;
            }
            bmb0 = null;
        label_10:
            if(bmb0 != null) {
                blv blv0 = bmb0.f;
                ScheduledExecutorService scheduledExecutorService0 = bow.a();
                if(blv0 != null) {
                    aqi0.O();
                    scheduledExecutorService0.execute(new aoz(blv0, bmb0));
                }
            }
        }
        else {
            if((throwable0 instanceof CancellationException)) {
                this.b.O();
                return;
            }
            aqi aqi1 = this.b;
            if(aqi1.A == 10) {
                aqi1.K(10, new bac(4, throwable0));
            }
            Objects.toString(aqi1);
            bcs.b("Camera2CameraImpl", "Unable to configure camera " + aqi1.toString(), throwable0);
            if(aqi1.k == this.a) {
                aqi1.N();
            }
        }
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
    }
}

