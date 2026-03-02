import java.util.Objects;

public final class apl implements Runnable {
    public final aqi a;

    public apl(aqi aqi0) {
        this.a = aqi0;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a;
        aqi0.s = false;
        aqi0.r = false;
        Objects.toString(aqc.a(aqi0.A));
        aqi0.O();
        int v = aqi0.A - 1;
        if(aqi0.A != 0) {
            switch(v) {
                case 1: 
                case 5: {
                    kay.c(aqi0.I());
                    aqi0.q();
                    return;
                }
                case 7: {
                    if(aqi0.j != 0) {
                        aqi0.O();
                        aqi0.g.b();
                        return;
                    }
                    aqi0.B(false);
                    return;
                }
                default: {
                    Objects.toString(aqc.a(aqi0.A));
                    aqi0.O();
                    return;
                }
            }
        }
        throw null;
    }
}

