import java.util.List;
import org.webrtc.IceCandidate;

public final class czoa implements Runnable {
    public final czoi a;
    public final czyv b;
    public final IceCandidate c;

    public czoa(czoi czoi0, czyv czyv0, IceCandidate iceCandidate0) {
        this.a = czoi0;
        this.b = czyv0;
        this.c = iceCandidate0;
    }

    @Override
    public final void run() {
        czoi czoi0 = this.a;
        IceCandidate iceCandidate0 = this.c;
        czyv czyv0 = this.b;
        if(hvol.w()) {
            if(czoi0.i == null) {
                czkq.a.b().p("Ignoring local ice candidate since we are not accepting connections.", new Object[0]);
                return;
            }
            List list0 = czoi0.f;
            list0.add(iceCandidate0);
            cunf cunf0 = czkq.a;
            cunf0.b().i("Added ice candidate %s to %s.", iceCandidate0, czyv0);
            cumn cumn0 = czoi0.e;
            if(cumn0 != null) {
                cumn0.b();
            }
            czoi0.e = cumn.d(cunf0, new cznw(czoi0, gged_interceptors.i(list0), czyv0), hvog.az(), czoi0.g);
            return;
        }
        czzk czzk0 = czoi0.i;
        if(czzk0 == null) {
            czkq.a.b().p("Ignoring local ice candidate since we are not accepting connections.", new Object[0]);
            return;
        }
        byte[] arr_b = czos.q(czoi0.b, iceCandidate0);
        if(!czos.s(czzk0, czoi0.a, 2, czyv0, arr_b)) {
            czkq.a.b().h("Failed to send ice candidate to %s.", czyv0);
            return;
        }
        czkq.a.b().i("Sent ice candidate %s to %s.", iceCandidate0, czyv0);
    }
}

