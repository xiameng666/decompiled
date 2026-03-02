import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import jeb.synthetic.FIN;

public final class gyks implements gykn {
    public volatile boolean a;
    private final boolean b;
    private final InputStream c;
    private final OutputStream d;
    private final gyjl e;
    private final byte[] f;
    private final byte[] g;
    private final ByteBuffer h;
    private final ByteBuffer i;
    private final Object j;
    private gyjl k;

    public gyks(boolean z, InputStream inputStream0, OutputStream outputStream0) {
        this.b = z;
        batl.s(inputStream0);
        this.c = inputStream0;
        batl.s(outputStream0);
        this.d = outputStream0;
        this.e = gyjl.a;
        this.k = gyjl.a;
        byte[] arr_b = new byte[4];
        this.f = arr_b;
        byte[] arr_b1 = new byte[4];
        this.g = arr_b1;
        this.h = ByteBuffer.wrap(arr_b);
        this.i = ByteBuffer.wrap(arr_b1);
        this.a = false;
        this.j = new Object();
    }

    private static final void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // gykn
    public final void close() {
        gyks.a(this.c);
        gyks.a(this.d);
        synchronized(this) {
            this.a = false;
        }
    }

    @Override  // gykn
    public final void d() {
        int v1;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.a) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        if(this.b) {
            this.d.write(1);
            this.d.flush();
            v1 = this.c.read();
        }
        else {
            v1 = this.c.read();
            this.d.write(1);
            this.d.flush();
        }
        int v2 = Math.min(v1, 1);
        if(v2 > 0) {
            this.a = true;
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IOException("Cannot connect, version is not supported: " + v2);
    }

    @Override  // gykn
    public final void e(byte[] arr_b) {
        if(this.a) {
            if(arr_b.length <= 0xC800) {
                gyjl gyjl0 = this.e;
                __monitor_enter(gyjl0);
                int v = FIN.finallyOpen$NT();
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gyjl0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gyjl0));
                if(!hftp0.a_defaultInstance.isImmutable()) {
                    hftp0.b_message = hftp0.P_newInstance();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gyjl)hftp0.b_message).c = 0;
                    ((gyjl)hftp0.b_message).b |= 1;
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gyjl gyjl1 = (gyjl)hftp0.b_message;
                    gyjl1.b |= 2;
                    gyjl1.d = hfsf0;
                    byte[] arr_b1 = ((gyjl)hftp0.N_build()).toBytesArray();
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_enter(this.d);
                    int v1 = FIN.finallyOpen$NT();
                    this.h.rewind();
                    this.h.putInt(arr_b1.length);
                    this.d.write(this.f);
                    this.d.write(arr_b1);
                    this.d.flush();
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(this.d);
                    FIN.finallyCodeEnd$NT(v1);
                    return;
                }
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            throw new IllegalArgumentException("Data size out of range: " + arr_b.length);
        }
        throw new IOException("Not connected.");
    }

    @Override  // gykn
    public final boolean f() {
        throw null;
    }

    @Override  // gykn
    public final boolean g() {
        throw null;
    }

    @Override  // gykn
    public final byte[] h() {
        if(this.a) {
            InputStream inputStream0 = this.c;
            __monitor_enter(inputStream0);
            int v = FIN.finallyOpen$NT();
            inputStream0.read(this.g, 0, 4);
            this.i.rewind();
            int v1 = this.i.getInt();
            if(v1 <= 0xDC00) {
                byte[] arr_b = new byte[v1];
                for(int v2 = 0; v2 < v1; v2 += inputStream0.read(arr_b, v2, v1 - v2)) {
                }
                FIN.finallyCodeBegin$NT(v);
                Object object0 = this.j;
                __monitor_enter(object0);
                int v3 = FIN.finallyOpen$NT();
                gyjl gyjl0 = this.k;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gyjl0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gyjl0));
                if(!hftp0.a_defaultInstance.isImmutable()) {
                    hftp0.b_message = hftp0.P_newInstance();
                    this.k = (gyjl)hftp0.N_build();
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyjl.a), arr_b, 0, v1, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    if((((gyjl)hftv0).b & 2) != 0 && ((gyjl)hftv0).d.size() > 0xC800) {
                        throw new IOException("Data packet greater than allowed max size: " + ((gyjl)hftv0).d.size());
                    }
                    FIN.finallyCodeBegin$NT(v3);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v3);
                    return ((gyjl)hftv0).d.toByteArray();
                }
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            throw new IOException("Packet is greater than max allowed data size: 51200");
        }
        throw new IOException("Not connected.");
    }
}

