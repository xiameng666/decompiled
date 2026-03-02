import android.os.SystemClock;
import j..util.concurrent.ConcurrentHashMap;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

final class czvq {
    public final DataOutputStream a;
    public final Map b;
    final czvo c;
    private final AtomicBoolean d;

    public czvq(OutputStream outputStream0, AtomicBoolean atomicBoolean0) {
        this.b = new ConcurrentHashMap();
        DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(outputStream0));
        this.a = dataOutputStream0;
        this.c = new czvo(dataOutputStream0);
        this.d = atomicBoolean0;
    }

    public final String a(String s) {
        return this.b.get(s) == null ? "" : ((czvp)this.b.get(s)).b;
    }

    public static void b(gmcu gmcu0, String s) {
        try {
            gmcu0.v(hvog.L(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            czkq.a.e().i("[%s] Interrupted while waiting the %s frame to be sent.", "MultiplexOutputStream", s);
        }
        catch(ExecutionException executionException0) {
            czkq.a.e().f(executionException0).i("[%s] Failed when waiting the %s frame to be sent.", "MultiplexOutputStream", s);
            if(!(executionException0.getCause() instanceof IOException)) {
                return;
            }
            throw (IOException)executionException0.getCause();
        }
        catch(TimeoutException timeoutException0) {
            czkq.a.e().f(timeoutException0).i("[%s] Timeout when waiting the %s frame to be sent.", "MultiplexOutputStream", s);
            throw new IOException(timeoutException0);
        }
    }

    public final boolean c() {
        return this.d.get();
    }

    public final void d(byte[] arr_b, String s, gytp gytp0) {
        if(this.c()) {
            long v = SystemClock.elapsedRealtime();
            gmcu gmcu0 = new gmcu();
            czvo czvo0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyty.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gyty)hftp0.b_message).f = 1;
            ((gyty)hftp0.b_message).b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gytz.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gytz)hftv0).b |= 1;
            ((gytz)hftv0).c = hfsf0;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gytz gytz0 = (gytz)hftp1.b_message;
            s.getClass();
            gytz0.b |= 2;
            gytz0.d = s;
            gytz gytz1 = (gytz)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyty gyty0 = (gyty)hftp0.b_message;
            gytz1.getClass();
            gyty0.e = gytz1;
            gyty0.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gytu.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gytu)hftp2.b_message).e = 2;
            ((gytu)hftp2.b_message).b |= 1;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gytq.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gytq)hftp3.b_message).c = gytp0.d;
            ((gytq)hftp3.b_message).b |= 1;
            gytq gytq0 = (gytq)hftp3.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gytu gytu0 = (gytu)hftp2.b_message;
            gytq0.getClass();
            gytu0.d = gytq0;
            gytu0.c = 3;
            gytu gytu1 = (gytu)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyty gyty1 = (gyty)hftp0.b_message;
            gytu1.getClass();
            gyty1.d = gytu1;
            gyty1.c = 3;
            czvo0.b(gmcu0, ((gyty)hftp0.N_build()).toBytesArray(), "CONNECTION_RESPONSE");
            czvq.b(gmcu0, "CONNECTION_RESPONSE");
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] Took %d milliseconds to write multiplex CONNECTION_RESPONSE frame.", Long.valueOf(SystemClock.elapsedRealtime() - v));
            }
        }
    }
}

