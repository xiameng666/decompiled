import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

final class dfzc extends dfzd {
    Uri a;
    dcjz b;
    long c;
    long d;
    long e;
    String f;
    List g;

    public dfzc() {
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.g = new ArrayList();
    }

    public final void a(long v) {
        if(this.e != -1L) {
            dcvz.a.e().p("Likely logic error... calling setStreamFromSenderPayloadId() more than once.", new Object[0]);
        }
        this.e = v;
    }

    public final void b(long v) {
        if(this.d != -1L) {
            dcvz.a.e().p("Likely logic error... calling setStreamFromSenderPayloadId() more than once.", new Object[0]);
        }
        this.d = v;
    }

    public final boolean c() {
        return this.d != -1L && this.e != -1L;
    }

    @Override
    public final String toString() {
        return String.format("AttachmentInfo<destination: %s, payloadId: %s>", this.a, ((long)this.c));
    }
}

