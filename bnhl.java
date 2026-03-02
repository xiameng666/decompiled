import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public final class bnhl {
    public DataInputStream a;
    public bnhf b;
    private static final bboh c;
    private final byte[] d;
    private final bnhi e;
    private final bnhd f;
    private volatile boolean g;

    static {
        bnhl.c = bnaa.e("WebSocketReceiver");
    }

    public bnhl(bnhi bnhi0) {
        this.d = new byte[0x70];
        this.g = false;
        this.e = bnhi0;
        this.f = new bnhd();
    }

    final void a() {
        long v3;
        ((ggtj)bnhl.c.h()).x("run()");
        bmzx.c("HYBRID_WEBSOCKET_RECEIVER_STARTED", null);
        while(!this.g) {
            try {
                byte[] arr_b = this.d;
                this.d(arr_b, 0, 1);
                int v = arr_b[0];
                int v1 = v & 0x80;
                if((v & 0x70) != 0) {
                    bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_FRAME");
                    throw new bnhj("Invalid frame received");
                }
                this.d(arr_b, 1, 1);
                int v2 = arr_b[1];
                if(v2 < 0x7E) {
                    v3 = (long)v2;
                }
                else if(v2 == 0x7E) {
                    this.d(arr_b, 2, 2);
                    v3 = ((long)(arr_b[3] & 0xFF)) | ((long)(arr_b[2] & 0xFF)) << 8;
                }
                else {
                    this.d(arr_b, 2, 8);
                    v3 = ((long)(arr_b[9] & 0xFF)) + ((((long)arr_b[2]) << 56) + (((long)(arr_b[3] & 0xFF)) << 0x30) + (((long)(arr_b[4] & 0xFF)) << 40) + (((long)(arr_b[5] & 0xFF)) << 0x20) + (((long)(arr_b[6] & 0xFF)) << 24) + ((long)((arr_b[7] & 0xFF) << 16)) + ((long)((arr_b[8] & 0xFF) << 8)));
                }
                byte[] arr_b1 = new byte[((int)v3)];
                this.d(arr_b1, 0, ((int)v3));
                if(((long)(((int)v3))) != v3) {
                    bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_PAYLOAD");
                    throw new bnhj("Payload read failed. payload length != read length");
                }
                switch(v & 15) {
                    case 2: {
                        bnhd bnhd0 = this.f;
                        if(bnhd0.b != 0) {
                            throw new bnhj("Failed to continue outstanding frame");
                        }
                        bnhd0.a.add(arr_b1);
                        int v4 = bnhd0.b + ((int)v3);
                        bnhd0.b = v4;
                        if(v1 == 0) {
                            continue;
                        }
                        byte[] arr_b2 = new byte[v4];
                        int v6 = 0;
                        for(int v5 = 0; v5 < bnhd0.a.size(); ++v5) {
                            byte[] arr_b3 = (byte[])bnhd0.a.get(v5);
                            System.arraycopy(arr_b3, 0, arr_b2, v6, arr_b3.length);
                            v6 += arr_b3.length;
                        }
                        bnhd0.a = new ArrayList();
                        bnhd0.b = 0;
                        this.e.f(arr_b2);
                        continue;
                    }
                    case 8: {
                        bnhf bnhf0 = this.b;
                        ((ggtj)bnhh.a.h()).x("onCloseOpReceived()");
                        bnhf0.a.c();
                        continue;
                    }
                    default: {
                        bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_OPCODE");
                        throw new bnhj("Unexpected opcode from TunnelServer: " + (v & 15));
                    }
                }
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                a.ae(bnhl.c.j(), "SocketTimeoutException", socketTimeoutException0);
                bmzx.c("UNKNOWN", "WEBSOCKET_TIMEOUT");
                this.c(new bnhj("Read Time out", socketTimeoutException0));
            }
            catch(IOException iOException0) {
                a.ae(bnhl.c.j(), "IOException", iOException0);
                bmzx.c("UNKNOWN", "WEBSOCKET_RECEIVER_ERROR");
                this.c(new bnhj("IO Error", iOException0));
            }
            catch(bnhj bnhj0) {
                bmzx.c("UNKNOWN", "WEBSOCKET_RECEIVER_ERROR");
                a.ae(bnhl.c.j(), "WebSocketException", bnhj0);
                this.c(bnhj0);
            }
        }
    }

    final void b() {
        this.g = true;
    }

    private final void c(bnhj bnhj0) {
        if(hsub.f() && this.g) {
            return;
        }
        this.b();
        bnhf bnhf0 = this.b;
        a.ae(bnhh.a.i(), "handleReceiverError()", bnhj0);
        bnhh bnhh0 = bnhf0.a;
        bnhh0.e.d(bnhj0);
        if(bnhh0.c == bnhg.c) {
            bnhh0.b();
        }
        bnhh0.c();
    }

    private final void d(byte[] arr_b, int v, int v1) {
        this.a.readFully(arr_b, v, v1);
    }
}

