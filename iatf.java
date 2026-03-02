import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo.HeaderBlock;
import org.chromium.net.UrlResponseInfo;

final class iatf extends BidirectionalStream.Callback {
    final iatj a;
    private List b;

    public iatf(iatj iatj0) {
        Objects.requireNonNull(iatj0);
        this.a = iatj0;
        super();
    }

    private final void a(List list0, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((String)((Map.Entry)object0).getKey()));
            arrayList0.add(((String)((Map.Entry)object0).getValue()));
        }
        byte[][] arr2_b = new byte[arrayList0.size()][];
        for(int v = 0; v < arrayList0.size(); v += 2) {
            arr2_b[v] = ((String)arrayList0.get(v)).getBytes(StandardCharsets.UTF_8);
            arr2_b[v + 1] = ((String)arrayList0.get(v + 1)).getBytes(StandardCharsets.UTF_8);
        }
        iaof_metadata iaof0 = new iaof_metadata(ibfs.b(arr2_b));
        iati iati0 = this.a.o;
        synchronized(iati0.a) {
            if(z) {
                iati0.p(iaof0);
            }
            else {
                iati0.o(iaof0);
            }
        }
    }

    private static final iapk b(UrlResponseInfo urlResponseInfo0) {
        return iayh.a(urlResponseInfo0.getHttpStatusCode());
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0) {
        iapk iapk0;
        synchronized(this.a.o.a) {
            iapk0 = this.a.o.e;
            if(iapk0 == null) {
                iapk0 = urlResponseInfo0 == null ? iapk.c.f("stream cancelled without reason") : iatf.b(urlResponseInfo0);
            }
        }
        this.a.r(iapk0);
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onFailed(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0, CronetException cronetException0) {
        iapk iapk0 = iapk.q.e(cronetException0);
        this.a.r(iapk0);
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0, ByteBuffer byteBuffer0, boolean z) {
        byteBuffer0.flip();
        iati iati0 = this.a.o;
        synchronized(iati0.a) {
            iati0.f = z;
            if(byteBuffer0.remaining() != 0) {
                iati.f(iati0, byteBuffer0);
            }
        }
        if(z) {
            List list0 = this.b;
            if(list0 != null) {
                this.a(list0, true);
            }
        }
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0) {
        this.a(urlResponseInfo0.getAllHeadersAsList(), false);
        bidirectionalStream0.read(ByteBuffer.allocateDirect(0x1000));
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0, UrlResponseInfo.HeaderBlock urlResponseInfo$HeaderBlock0) {
        List list0 = urlResponseInfo$HeaderBlock0.getAsList();
        this.b = list0;
        synchronized(this.a.o.a) {
        }
        if(this.a.o.f) {
            this.a(list0, true);
        }
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream0) {
        iati iati0 = this.a.o;
        synchronized(iati0.a) {
            iati0.d();
            iati0.c = true;
            Collection collection0 = iati0.b;
            for(Object object1: collection0) {
                iati0.h.s(((iatg)object1).a, ((iatg)object1).b, ((iatg)object1).c);
            }
            collection0.clear();
        }
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0) {
        boolean z = false;
        synchronized(this.a.o.a) {
            if(this.b != null && this.a.o.f) {
                z = true;
            }
        }
        if(!z) {
            List list0 = this.b;
            if(list0 == null) {
                if(urlResponseInfo0 == null) {
                    throw new AssertionError("No response header or trailer");
                }
                this.a(urlResponseInfo0.getAllHeadersAsList(), true);
            }
            else {
                this.a(list0, true);
            }
        }
        iapk iapk0 = iatf.b(urlResponseInfo0);
        this.a.r(iapk0);
    }

    @Override  // org.chromium.net.BidirectionalStream$Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0, ByteBuffer byteBuffer0, boolean z) {
        iati iati0 = this.a.o;
        synchronized(iati0.a) {
            if(!iati0.g) {
                iati0.g = true;
            }
            iati0.h(byteBuffer0.position());
        }
    }
}

