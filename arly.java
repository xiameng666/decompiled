import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class arly extends bbln {
    private static final aqql a;
    private final armp b;
    private final arlx c;

    static {
        arly.a = new aqql(new String[]{"UsbReceiverThread"});
    }

    public arly(armp armp0, arlx arlx0) {
        super(9);
        this.b = armp0;
        this.c = arlx0;
    }

    @Override
    public final void run() {
        asco asco0;
        try {
            arlx arlx0 = this.c;
            try {
                while(true) {
                    armj armj0 = arlx0.c;
                    int v1 = armj0.e(4).getInt();
                    if(v1 < 0 || v1 > 0x400) {
                        arlx0.e.d(1, ((long)v1));
                        throw new arlp(String.format(Locale.US, "Size of the fragment header exceeds expectations (%d actual vs %d expected).", v1, ((int)0x400)));
                    }
                    ByteBuffer byteBuffer0 = armj0.e(v1);
                    if(byteBuffer0.position() != 0 || byteBuffer0.limit() != byteBuffer0.capacity()) {
                        throw new arlp("Such byte buffers are not yet supported.");
                    }
                    try {
                        byte[] arr_b = byteBuffer0.array();
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asco.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        asco0 = (asco)hftv0;
                        arlx.a.d("Received: %d bytes.", new Object[]{((int)asco0.d)});
                    }
                    catch(hfur hfur0) {
                        arlx.a.f("Could not parse header!", new Object[0]);
                        throw new arlp(hfur0);
                    }
                    int v2 = asco0.d;
                    if(v2 < 0 || v2 > 0xA00000) {
                        arlx0.e.d(2, ((long)v2));
                        throw new arlp(String.format(Locale.US, "Size of the fragment payload exceeds expectations (%d actual vs %d expected).", ((int)asco0.d), ((int)0xA00000)));
                    }
                    ByteBuffer byteBuffer1 = armj0.e(v2);
                    if(byteBuffer1.limit() - byteBuffer1.position() != asco0.d) {
                        throw new RuntimeException("Remaining payload does not match payloadSize");
                    }
                    arlv arlv0 = new arlv(arlx0.g, asco0, byteBuffer1);
                    arlx0.g.a.execute(arlv0);
                }
            }
            catch(Throwable throwable0) {
                arlx0.d.set(false);
                arlu arlu0 = new arlu(arlx0);
                arlx0.g.a.execute(arlu0);
                throw throwable0;
            }
        }
        catch(arln arln0) {
            arly.a.e("Usb connection shutting down (maybe expected).", arln0, new Object[0]);
        }
        catch(IOException | arlp exception0) {
            arly.a.g("Unhandled exception; shutting down.", exception0, new Object[0]);
        }
        finally {
            this.b.u();
        }
    }
}

