import java.io.IOException;
import java.nio.ByteBuffer;

public final class arlv implements Runnable {
    public final arlw a;
    public final asco b;
    public final ByteBuffer c;

    public arlv(arlw arlw0, asco asco0, ByteBuffer byteBuffer0) {
        this.a = arlw0;
        this.b = asco0;
        this.c = byteBuffer0;
    }

    @Override
    public final void run() {
        arlw arlw0;
        try {
            arlw0 = this.a;
            asco asco0 = this.b;
            arlx arlx0 = arlw0.b;
            int v = 1;
            if(arlx0.d.get()) {
                int v1 = asco0.c;
                if(ascq.a(v1) == 4) {
                    arlx.a.f("Stream error. Abandoning item and moving to next one, hopefully.", new Object[0]);
                    if(arlx0.f == null) {
                        arlx0.b();
                    }
                    arlx0.c(3);
                    return;
                }
                ByteBuffer byteBuffer0 = this.c;
                if(arlx0.f == null) {
                    switch(ascq.a(v1)) {
                        case 2: {
                            armp armp0 = arlx0.b;
                            if(byteBuffer0.position() != 0 || byteBuffer0.limit() != byteBuffer0.array().length) {
                                throw new RuntimeException("We don\'t yet support slices of byte buffers.");
                            }
                            try {
                                byte[] arr_b = byteBuffer0.array();
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asci.a), arr_b, 0, arr_b.length, hftc0);
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                armp0.a.r(((asci)hftv0), hkyj.b);
                                return;
                            }
                            catch(hfur hfur0) {
                                throw new RuntimeException("Invalid packet received", hfur0);
                            }
                        }
                        case 3: {
                            arlx0.b();
                            break;
                        }
                        default: {
                            arlx.a.f("Invalid payload type", new Object[0]);
                            aqqn aqqn1 = arlx0.e;
                            int v3 = ascq.a(asco0.c);
                            if(v3 != 0) {
                                v = v3;
                            }
                            aqqn1.d(4, ((long)(v - 1)));
                            throw new arlp("Unknown/invalid payload type.");
                        }
                    }
                }
                else if(ascq.a(v1) != 3) {
                    aqqn aqqn0 = arlx0.e;
                    int v2 = ascq.a(v1);
                    if(v2 != 0) {
                        v = v2;
                    }
                    aqqn0.d(3, ((long)(v - 1)));
                    throw new arlp("Unexpected payload type while streaming.");
                }
                if(ascq.a(asco0.c) != 3) {
                    throw new RuntimeException("payloadType is not STREAM");
                }
                try {
                    arlx0.f.b().write(byteBuffer0.array(), byteBuffer0.position(), byteBuffer0.limit() - byteBuffer0.position());
                }
                catch(IOException iOException0) {
                    arlx.a.g("Exception while writing to stream.", iOException0, new Object[0]);
                    throw new RuntimeException(iOException0);
                }
                if(asco0.e) {
                    arlx0.f.a(1);
                    arlx0.f = null;
                }
            }
        }
        catch(arlp arlp0) {
            arlx.a.g("Unexpected exception while processing usb data:", arlp0, new Object[0]);
            arlw0.b.d.set(false);
            arlw0.b.b.f();
        }
    }
}

