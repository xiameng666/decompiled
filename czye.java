import java.util.List;
import org.webrtc.IceCandidate;

public final class czye implements Runnable {
    public final czyo a;
    public final jqt b;
    public final List c;

    public czye(czyo czyo0, jqt jqt0, List list0) {
        this.a = czyo0;
        this.b = jqt0;
        this.c = list0;
    }

    @Override
    public final void run() {
        boolean z = true;
        for(Object object0: this.c) {
            if(!this.a.c.b(((IceCandidate)object0))) {
                z = false;
                czkq.a.e().p("Unable to add remote ice candidate.", new Object[0]);
                break;
            }
        }
        this.b.b(Boolean.valueOf(z));
    }
}

