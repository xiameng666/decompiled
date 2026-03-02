import java.util.List;
import org.webrtc.IceCandidate;

public final class cznh implements Runnable {
    public final cznn a;
    public final IceCandidate b;

    public cznh(cznn cznn0, IceCandidate iceCandidate0) {
        this.a = cznn0;
        this.b = iceCandidate0;
    }

    @Override
    public final void run() {
        cznn cznn0 = this.a;
        IceCandidate iceCandidate0 = this.b;
        if(hvol.w()) {
            czyv czyv0 = cznn0.b;
            czzk czzk0 = cznn0.m;
            if(czzk0 != null) {
                List list0 = cznn0.j;
                list0.add(iceCandidate0);
                cunf cunf0 = czkq.a;
                cunf0.b().i("Added ice candidate %s to %s.", iceCandidate0, czyv0);
                cumn cumn0 = cznn0.i;
                if(cumn0 != null) {
                    cumn0.b();
                }
                cznn0.i = cumn.d(cunf0, new cznj(cznn0, gged_interceptors.i(list0), czzk0, czyv0), hvog.az(), cznn0.k);
            }
        }
        else {
            czyv czyv1 = cznn0.b;
            czzk czzk1 = cznn0.m;
            if(czzk1 != null) {
                byte[] arr_b = czno.p(cznn0.c, iceCandidate0);
                if(!czno.q(czzk1, cznn0.a, 3, czyv1, arr_b)) {
                    czkq.a.b().h("Failed to send ice candidate to %s.", czyv1);
                    return;
                }
                czkq.a.b().i("Sent ice candidate %s to %s.", iceCandidate0, czyv1);
            }
        }
    }
}

