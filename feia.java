import com.google.android.gms.wearable.MessageOptions;
import j..util.Optional;
import j..util.concurrent.ConcurrentMap.-EL;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class feia extends Thread {
    private final fehe a;
    private final byte[] b;
    private final ByteBuffer c;

    public feia(fehe fehe0) {
        super("WearableBleOffloadSocketReader");
        byte[] arr_b = new byte[0x1000];
        this.b = arr_b;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        this.c = byteBuffer0;
        this.a = fehe0;
        byteBuffer0.flip();
    }

    @Override
    public final void run() {
        fehe fehe1;
        Optional optional0;
        while(true) {
            try {
            label_0:
                fehe fehe0 = this.a;
                if(fehe0.e.get()) {
                    return;
                }
                ffmn.e("OffloadReaderTask", "Receive...", new Object[0]);
                while(true) {
                    ByteBuffer byteBuffer0 = this.c;
                    int v = byteBuffer0.remaining();
                    if(v > 4) {
                        byteBuffer0.mark();
                        int v1 = byteBuffer0.getShort();
                        if(v1 > byteBuffer0.capacity()) {
                            byteBuffer0.reset();
                            ffmn.b("WearIoStream", "decodePacket: header.len : %s", new Object[]{v1});
                            throw new IOException("header length too large");
                        }
                        if(v1 <= v) {
                            if(v1 <= 4) {
                                byteBuffer0.reset();
                                byte[] arr_b = byteBuffer0.array();
                                int v2 = byteBuffer0.arrayOffset() + byteBuffer0.position();
                                ffmn.b("WearIoStream", "decodePacket: invalid header: %s", new Object[]{ghjc.f.p(arr_b, v2, 4)});
                                throw new IOException("invalid header");
                            }
                            ffmn.e("WearIoStream", "decodePacket: %s %s", new Object[]{v1, ((int)byteBuffer0.getShort())});
                            byte[] arr_b1 = new byte[v1 - 4];
                            byteBuffer0.get(arr_b1);
                            optional0 = Optional.of(arr_b1);
                        }
                        else {
                            byteBuffer0.reset();
                            optional0 = Optional.empty();
                        }
                    }
                    else {
                        optional0 = Optional.empty();
                    }
                    if(optional0.isPresent()) {
                        break;
                    }
                    byteBuffer0.compact();
                    int v3 = fehe0.b.getInputStream().read(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
                    if(v3 <= 0) {
                        ffmn.b("OffloadReaderTask", "Read error bytesRead: %s", new Object[]{v3});
                        throw new IOException("EOF");
                    }
                    byteBuffer0.position(byteBuffer0.position() + v3);
                    byteBuffer0.flip();
                    ffmn.a("OffloadReaderTask", "Receive: read %s; buffered %s", new Object[]{v3, byteBuffer0.remaining()});
                }
                Object object0 = optional0.get();
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)wtr.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                wtr wtr0 = (wtr)hftv0;
                int v4 = wtq.a(wtr0.b).ordinal();
                if(v4 == 1) {
                    wta wta0 = wtr0.b == 2 ? ((wta)wtr0.c) : wta.a;
                    ferc ferc0 = fehe0.a();
                    String s = fehe0.a;
                    int v5 = wta0.b;
                    byte[] arr_b2 = wta0.c.toByteArray();
                    feoy feoy0 = ((fdyu)ferc0).d.a(s, v5);
                    if(feoy0 == null) {
                        ffmn.d("rpcs", "Received message from node %s for endpoint %d which isn\'t known - dropping.", new Object[]{s, v5});
                        ((fdyu)ferc0).b.g(s, v5, arr_b2, "unknown endpoint for message");
                        fdny.a(fdnm.k);
                    }
                    else {
                        MessageOptions messageOptions0 = new MessageOptions(0);
                        ((fdyu)ferc0).f(-1, 0, feoy0.a, feoy0.b, arr_b2, s, null, false, null, messageOptions0);
                        fdny.a(fdnm.l);
                    }
                    goto label_0;
                }
                switch(v4) {
                    case 2: {
                        wtc wtc0 = wtr0.b == 3 ? ((wtc)wtr0.c) : wtc.a;
                        ferc ferc1 = fehe0.a();
                        String s1 = fehe0.a;
                        int v6 = wtc0.b;
                        int v7 = wtc0.c;
                        byte[] arr_b3 = wtc0.d.toByteArray();
                        feoy feoy1 = ((fdyu)ferc1).d.a(s1, v6);
                        if(feoy1 == null) {
                            ffmn.d("rpcs", "Received request from node %s for endpoint %d which isn\'t known - dropping.", new Object[]{s1, v6});
                            ((fdyu)ferc1).b.g(s1, v6, arr_b3, "unknown endpoint for request");
                            fdny.a(fdnm.k);
                            goto label_0;
                        }
                        else {
                            MessageOptions messageOptions1 = new MessageOptions(0);
                            ((fdyu)ferc1).f(-1, v7, feoy1.a, feoy1.b, arr_b3, s1, null, true, null, messageOptions1);
                            fdny.a(fdnm.m);
                            continue;
                        }
                        goto label_80;
                    }
                    case 3: {
                    label_80:
                        wtd wtd0 = wtr0.b == 4 ? ((wtd)wtr0.c) : wtd.a;
                        ferc ferc2 = fehe0.a();
                        String s2 = fehe0.a;
                        int v8 = wtd0.b;
                        byte[] arr_b4 = wtd0.c.toByteArray();
                        Integer integer0 = v8;
                        Integer integer1 = (Integer)ConcurrentMap.-EL.getOrDefault(((fdyu)ferc2).c.b, integer0, Integer.valueOf(-1));
                        int v9 = (int)integer1;
                        if(v9 == -1) {
                            ffmn.d("rpcs", "Received response from node %s to request %d which isn\'t known - dropping.", new Object[]{s2, integer0});
                            ((fdyu)ferc2).b.h(s2, v8, arr_b4, "unknown response ID");
                            fdny.a(fdnm.k);
                        }
                        else {
                            feoy feoy2 = ((fdyu)ferc2).d.a(s2, v9);
                            if(feoy2 == null) {
                                ffmn.f("rpcs", "Response ID %d from node %s comes from endpoint ID %d, which is no longer known.", new Object[]{integer0, s2, integer1});
                                ((fdyu)ferc2).b.h(s2, v8, arr_b4, "unknown endpoint ID");
                                fdny.a(fdnm.k);
                            }
                            else {
                                fdyr fdyr0 = new fdyr(v8, arr_b4);
                                MessageOptions messageOptions2 = new MessageOptions(0);
                                ((fdyu)ferc2).f(-1, v8, feoy2.a, feoy2.b, arr_b4, s2, null, false, fdyr0, messageOptions2);
                                fdny.a(fdnm.n);
                            }
                        }
                        continue;
                    }
                    default: {
                        ffmn.b("OffloadReaderTask", "Received unexpected message of type %s", new Object[]{wtq.a(wtr0.b)});
                        continue;
                    }
                }
            }
            catch(IOException iOException0) {
                ffmn.g("OffloadReaderTask", iOException0, "Reading from the offloaded socket threw an IO exception", new Object[0]);
                fehe1 = this.a;
                ffmn.d("OffloadClientSocket", "Close and delete %s", new Object[]{Boolean.valueOf(fehe1.e.get())});
                if(fehe1.e.compareAndSet(false, true)) {
                    try {
                        fehe1.b.close();
                        String s3 = fehe1.a;
                        if(((ferb)fehe1.c.b.remove(s3)) == null) {
                            ffmn.f("OffloadMessageManager", "removeWriter for %s: no writer was connected", new Object[]{s3});
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                }
            }
            ffmn.d("OffloadClientSocket", "Triggering a retry via the client connection", new Object[0]);
            gmbu.t(fehe1.d.c(), new fehd(fehe1), gmap.a);
            return;
        }
    }
}

