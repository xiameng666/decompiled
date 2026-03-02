import java.util.List;
import org.webrtc.IceCandidate;

public final class czon implements Runnable {
    public final czor a;
    public final IceCandidate b;

    public czon(czor czor0, IceCandidate iceCandidate0) {
        this.a = czor0;
        this.b = iceCandidate0;
    }

    @Override
    public final void run() {
        czor czor0 = this.a;
        IceCandidate iceCandidate0 = this.b;
        if(hvol.w()) {
            czyv czyv0 = czor0.b;
            czzk czzk0 = czor0.m;
            if(czzk0 != null) {
                List list0 = czor0.j;
                list0.add(iceCandidate0);
                cunf cunf0 = czkq.a;
                cunf0.b().i("Added ice candidate %s to %s.", iceCandidate0, czyv0);
                cumn cumn0 = czor0.i;
                if(cumn0 != null) {
                    cumn0.b();
                }
                czor0.i = cumn.d(cunf0, new czom(czor0, gged_interceptors.i(list0), czzk0, czyv0), hvog.az(), czor0.k);
            }
        }
        else {
            czyv czyv1 = czor0.b;
            czzk czzk1 = czor0.m;
            if(czzk1 != null) {
                byte[] arr_b = czos.q(czor0.c, iceCandidate0);
                if(!czos.s(czzk1, czor0.a, 3, czyv1, arr_b)) {
                    czkq.a.b().h("Failed to send ice candidate to %s.", czyv1);
                    return;
                }
                czkq.a.b().i("Sent ice candidate %s to %s.", iceCandidate0, czyv1);
            }
        }
    }
}

