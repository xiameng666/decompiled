import java.util.List;
import org.webrtc.SessionDescription;

public final class czng implements Runnable {
    public final cznn a;
    public final byte[] b;

    public czng(cznn cznn0, byte[] arr_b) {
        this.a = cznn0;
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
            cznn cznn0 = this.a;
            czyv czyv0 = new czyv((gyuk0.e == null ? gyug.a : gyuk0.e).c);
            int v = gyuk0.c;
            if(v == 3) {
                SessionDescription sessionDescription0 = czyw.g(gyuk0);
                czyb czyb0 = cznn0.e;
                if(czyb0 == null) {
                    czkq.a.b().p("Unable to receive offer. Failed to load a ConnectionFlow.", new Object[0]);
                }
                else {
                    czyb0.l(sessionDescription0);
                }
                czyb czyb1 = cznn0.e;
                if(czyb1 == null) {
                    czkq.a.b().p("Unable to send answer. Failed to load a ConnectionFlow.", new Object[0]);
                    cznn0.d.countDown();
                    return;
                }
                SessionDescription sessionDescription1 = czyb1.b();
                if(sessionDescription1 == null) {
                    czkq.a.b().p("Unable to send answer. Failed to create an answer.", new Object[0]);
                    cznn0.d.countDown();
                    return;
                }
                if(czyb1.e(sessionDescription1) == null) {
                    czkq.a.b().p("Unable to send answer. Failed to register our answer locally.", new Object[0]);
                    cznn0.d.countDown();
                    return;
                }
                czzk czzk0 = cznn0.m;
                if(czzk0 == null) {
                    czkq.a.b().p("Unable to send answer. Failed to load a TachyonSignalingMessenger.", new Object[0]);
                    cznn0.d.countDown();
                    return;
                }
                byte[] arr_b = czyw.a(cznn0.c, sessionDescription1).toBytesArray();
                if(!czno.q(czzk0, cznn0.a, 3, czyv0, arr_b)) {
                    czkq.a.b().p("Unable to send answer. Failed to write the offer to the remote peer.", new Object[0]);
                    cznn0.d.countDown();
                }
                return;
            }
            if(v == 5) {
                List list0 = czyw.e(gyuk0);
                czyb czyb2 = cznn0.e;
                if(czyb2 == null) {
                    czkq.a.b().p("Unable to receive ice candidates. Failed to load a ConnectionFlow.", new Object[0]);
                    return;
                }
                czyb2.m(list0);
                return;
            }
            czkq.a.b().p("Received unknown WebRTC frame: ignoring.", new Object[0]);
            return;
        }
        czkq.a.b().p("Invalid WebRTC frame: sender id is missing.", new Object[0]);
    }
}

