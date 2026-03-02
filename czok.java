import java.util.List;
import org.webrtc.SessionDescription;

public final class czok implements Runnable {
    public final czor a;
    public final byte[] b;

    public czok(czor czor0, byte[] arr_b) {
        this.a = czor0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        gyuk gyuk0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyuk.a), this.b, 0, this.b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gyuk0 = (gyuk)hftv0;
        }
        catch(hfur hfur0) {
            czkq.a.b().f(hfur0).p("Failed to parse tachyon signaling frame.", new Object[0]);
            return;
        }
        if((gyuk0.b & 1) != 0) {
            czor czor0 = this.a;
            int v = gyuk0.c;
            if(v == 3) {
                SessionDescription sessionDescription0 = czyw.g(gyuk0);
                czyo czyo0 = czor0.e;
                if(czyo0 == null) {
                    czkq.a.b().p("Unable to receive offer. Failed to load a ConnectionFlow.", new Object[0]);
                    return;
                }
                czyo0.c(sessionDescription0);
                return;
            }
            switch(v) {
                case 4: {
                    SessionDescription sessionDescription1 = czyw.f(gyuk0);
                    czyo czyo1 = czor0.e;
                    if(czyo1 == null) {
                        czkq.a.b().p("Unable to receive answer. Failed to create a ConnectionFlow.", new Object[0]);
                        czor0.d.countDown();
                        return;
                    }
                    czyo1.c(sessionDescription1);
                    return;
                }
                case 5: {
                    List list0 = czyw.e(gyuk0);
                    czyo czyo2 = czor0.e;
                    if(czyo2 == null) {
                        czkq.a.b().p("Unable to receive ice candidates. Failed to load a ConnectionFlow.", new Object[0]);
                        return;
                    }
                    czyo2.i(list0);
                    return;
                }
                default: {
                    czkq.a.b().p("Received unknown WebRTC frame: ignoring.", new Object[0]);
                    return;
                }
            }
        }
        czkq.a.b().p("Invalid WebRTC frame: sender id is missing.", new Object[0]);
    }
}

