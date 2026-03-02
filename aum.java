import java.util.Collections;
import java.util.concurrent.ExecutionException;

public final class aum implements blv {
    public final auq a;

    public aum(auq auq0) {
        this.a = auq0;
    }

    @Override  // blv
    public final void a(bmb bmb0) {
        this.a.b = this.a.a();
        aqi aqi0 = this.a.e.a;
        try {
            if(!((Boolean)jqy.a(new apn(aqi0)).get()).booleanValue()) {
                return;
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", exception0);
        }
        aqi0.x(aqi.j(aqi0.t), aqi0.t.b, aqi0.t.c, null, Collections.singletonList(bne.f));
    }
}

