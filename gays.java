import android.os.SystemClock;
import java.util.ArrayList;

public final class gays implements gdqs {
    public final gayt a;
    public final String b;

    public gays(gayt gayt0, String s) {
        this.a = gayt0;
        this.b = s;
    }

    @Override  // gdqs
    public final void close() {
        gayt gayt0 = this.a;
        bzs bzs0 = gayt0.a;
        String s = this.b;
        if(bzs0.containsKey(s)) {
            ArrayList arrayList0 = gayt0.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkye.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkye gkye0 = (gkye)hftp0.b_message;
            gkye0.b |= 1;
            gkye0.c = s;
            long v = SystemClock.elapsedRealtimeNanos();
            Long long0 = (Long)bzs0.get(s);
            gftb.check(long0);
            long v1 = v - ((long)long0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkye gkye1 = (gkye)hftp0.b_message;
            gkye1.b |= 2;
            gkye1.d = v1;
            arrayList0.add(((gkye)hftp0.N_build()));
        }
    }
}

