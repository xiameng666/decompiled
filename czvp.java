import android.os.SystemClock;
import j..util.Objects;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

final class czvp extends OutputStream {
    final AtomicBoolean a;
    public String b;
    final czvq c;
    private final String d;
    private final DataOutputStream e;
    private final czvo f;
    private final int g;
    private boolean h;

    public czvp(czvq czvq0, String s, String s1, DataOutputStream dataOutputStream0, czvo czvo0, int v) {
        Objects.requireNonNull(czvq0);
        this.c = czvq0;
        super();
        this.a = new AtomicBoolean(false);
        this.d = s;
        this.b = s1;
        this.e = dataOutputStream0;
        this.f = czvo0;
        this.g = v;
    }

    final boolean a() {
        return this.g == 1;
    }

    @Override
    public final void close() {
        this.a.set(true);
    }

    @Override
    public final void write(int v) {
        this.write(new byte[]{((byte)v)});
    }

    @Override
    public final void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        if(this.a.get()) {
            throw new IOException(String.format(Locale.US, "Failed to write data because the VirtualOutputStream for %s closed", this.d));
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v, v1 + v);
        if(this.c.c()) {
            long v2 = SystemClock.elapsedRealtime();
            boolean z = false;
            if(this.a()) {
                if(!this.h) {
                    this.h = true;
                    z = true;
                }
                if(this.b.equals("RECEIVER_CONDIMENT") && !z) {
                    czkq.a.e().h("[%s] ServiceIdHashSalt is still a fake one and not changed yet; continue to pass salt.", "MultiplexOutputStream");
                    z = true;
                }
            }
            String s = this.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gytz.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(czvl.c(this.d, s));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gytz)hftv0).b |= 1;
            ((gytz)hftv0).c = hfsf0;
            if(z) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gytz gytz0 = (gytz)hftp0.b_message;
                s.getClass();
                gytz0.b |= 2;
                gytz0.d = s;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyty.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gyty)hftp1.b_message).f = 2;
            ((gyty)hftp1.b_message).b |= 2;
            gytz gytz1 = (gytz)hftp0.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyty gyty0 = (gyty)hftp1.b_message;
            gytz1.getClass();
            gyty0.e = gytz1;
            gyty0.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gytv.a).v_newBuilder();
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gytv gytv0 = (gytv)hftp2.b_message;
            gytv0.b |= 1;
            gytv0.c = hfsf1;
            gytv gytv1 = (gytv)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyty gyty1 = (gyty)hftp1.b_message;
            gytv1.getClass();
            gyty1.d = gytv1;
            gyty1.c = 4;
            byte[] arr_b2 = ((gyty)hftp1.N_build()).toBytesArray();
            gmcu gmcu0 = new gmcu();
            this.f.b(gmcu0, arr_b2, "DATA_FRAME");
            czvq.b(gmcu0, "DATA_FRAME");
            if(hvol.aa()) {
                czkq.a.d().i("[PERFORMANCE] Took %d milliseconds to write multiplex DATA frame, size = %s", Long.valueOf(SystemClock.elapsedRealtime() - v2), Integer.valueOf(arr_b2.length));
            }
            return;
        }
        this.e.write(arr_b1);
        this.e.flush();
    }
}

