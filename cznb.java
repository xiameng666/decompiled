import java.util.List;
import org.webrtc.IceCandidate;

public final class cznb implements Runnable {
    public final cznf a;
    public final czyv b;
    public final IceCandidate c;

    public cznb(cznf cznf0, czyv czyv0, IceCandidate iceCandidate0) {
        this.a = cznf0;
        this.b = czyv0;
        this.c = iceCandidate0;
    }

    @Override
    public final void run() {
        cznf cznf0 = this.a;
        IceCandidate iceCandidate0 = this.c;
        czyv czyv0 = this.b;
        if(hvol.w()) {
            if(cznf0.i == null) {
                czkq.a.b().p("Ignoring local ice candidate since we are not accepting connections.", new Object[0]);
                return;
            }
            List list0 = cznf0.f;
            list0.add(iceCandidate0);
            cunf cunf0 = czkq.a;
            cunf0.b().i("Added ice candidate %s to %s.", iceCandidate0, czyv0);
            cumn cumn0 = cznf0.e;
            if(cumn0 != null) {
                cumn0.b();
            }
            cznf0.e = cumn.d(cunf0, new czmx(cznf0, gged_interceptors.i(list0), czyv0), hvog.az(), cznf0.g);
            return;
        }
        czzk czzk0 = cznf0.i;
        if(czzk0 == null) {
            czkq.a.b().p("Ignoring local ice candidate since we are not accepting connections.", new Object[0]);
            return;
        }
        byte[] arr_b = czno.p(cznf0.b, iceCandidate0);
        if(!czno.q(czzk0, cznf0.a, 2, czyv0, arr_b)) {
            czkq.a.b().h("Failed to send ice candidate to %s.", czyv0);
            return;
        }
        czkq.a.b().i("Sent ice candidate %s to %s.", iceCandidate0, czyv0);
    }
}

