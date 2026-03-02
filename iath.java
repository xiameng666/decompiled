import android.net.Network;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import org.chromium.net.BidirectionalStream.Builder;
import org.chromium.net.BidirectionalStream;

final class iath implements iatq {
    final iatj a;

    public iath(iatj iatj0) {
        Objects.requireNonNull(iatj0);
        this.a = iatj0;
        super();
    }

    @Override  // iatq
    public final void a(iapk iapk0) {
        iatj iatj0 = this.a;
        iati iati0 = iatj0.o;
        synchronized(iati0.a) {
            if(iati0.d) {
                return;
            }
            iati0.d = true;
            iati0.e = iapk0;
            Collection collection0 = iati0.b;
            for(Object object1: collection0) {
                ((iatg)object1).a.clear();
            }
            collection0.clear();
            BidirectionalStream bidirectionalStream0 = iatj0.k;
            if(bidirectionalStream0 == null) {
                iatj0.i.a(iatj0, iapk0);
            }
            else {
                bidirectionalStream0.cancel();
            }
        }
    }

    @Override  // iatq
    public final void b(ibfv ibfv0, boolean z, boolean z1, int v) {
        ByteBuffer byteBuffer0;
        iatj iatj0 = this.a;
        iati iati0 = iatj0.o;
        synchronized(iati0.a) {
            if(iati0.d) {
                return;
            }
            if(ibfv0 == null) {
                byteBuffer0 = iatj.a;
            }
            else {
                byteBuffer0 = ((iatn)ibfv0).a;
                byteBuffer0.flip();
            }
            iatj0.w(byteBuffer0.remaining());
            if(iati0.c) {
                iatj0.s(byteBuffer0, z, z1);
            }
            else {
                iatg iatg0 = new iatg(byteBuffer0, z, z1);
                iati0.b.add(iatg0);
            }
        }
    }

    @Override  // iatq
    public final void c(iaof_metadata iaof0) {
        iatj iatj0 = this.a;
        iatj0.j.run();
        if(iatj0.p == null) {
            return;
        }
        iatf iatf0 = new iatf(iatj0);
        iatd iatd0 = iatj0.p;
        BidirectionalStream.Builder bidirectionalStream$Builder0 = iatd0.a.newBidirectionalStreamBuilder(iatj0.d, iatf0, iatj0.g);
        if(iatd0.b) {
            bidirectionalStream$Builder0.setTrafficStatsTag(iatd0.c);
        }
        if(iatd0.d) {
            bidirectionalStream$Builder0.setTrafficStatsUid(iatd0.e);
        }
        Network network0 = iatd0.f;
        if(network0 != null) {
            bidirectionalStream$Builder0.bindToNetwork(network0.getNetworkHandle());
        }
        if(iatj0.l) {
            bidirectionalStream$Builder0.delayRequestHeadersUntilFirstFlush(true);
        }
        Object object0 = iatj0.m;
        if(object0 != null || iatj0.n != null) {
            if(object0 != null) {
                bidirectionalStream$Builder0.addRequestAnnotation(object0);
            }
            Collection collection0 = iatj0.n;
            if(collection0 != null) {
                for(Object object1: collection0) {
                    bidirectionalStream$Builder0.addRequestAnnotation(object1);
                }
            }
        }
        String s = iayh.i.a;
        bidirectionalStream$Builder0.addHeader(s, iatj0.e);
        String s1 = iayh.g.a;
        bidirectionalStream$Builder0.addHeader(s1, "application/grpc");
        bidirectionalStream$Builder0.addHeader("te", "trailers");
        byte[][] arr2_b = ibfs.a(iatj0.h);
        for(int v = 0; v < arr2_b.length; v += 2) {
            String s2 = new String(arr2_b[v], StandardCharsets.UTF_8);
            if(!s1.equalsIgnoreCase(s2) && !s.equalsIgnoreCase(s2) && !iayh.h.a.equalsIgnoreCase(s2)) {
                bidirectionalStream$Builder0.addHeader(s2, new String(arr2_b[v + 1], StandardCharsets.UTF_8));
            }
        }
        iatj0.k = bidirectionalStream$Builder0.build();
        iatj0.k.start();
    }
}

