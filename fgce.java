import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fgce implements fgch {
    final boolean a;
    ayud b;
    private final Context c;

    public fgce(Context context0) {
        this.b = null;
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.c = context0;
        this.a = new Random().nextDouble() > 1.0;
    }

    public final ayud a() {
        synchronized(this) {
            if(this.b == null) {
                this.b = new aytt(this.c, "GMS_CORE").a();
            }
        }
        return this.b;
    }

    @Override  // fgch
    public final void b(abyi abyi0) {
        if(!this.a && (abyi0.b & 4) != 0) {
            ayud ayud0 = this.b;
            if(ayud0 == null) {
                Log.w("ClearcutAppDoctorLogger", "Failed to determine opt-in status. Dropping log.");
                return;
            }
            int v = glfz.a(abyh.a((abyh.b(abyi0.f) == 0 ? 1 : abyh.b(abyi0.f))));
            if(v == 0) {
                v = 1;
            }
            int v1 = glfx.a((abyg.b(abyi0.g) == null ? abyg.d : abyg.b(abyi0.g)).a());
            if(v1 == 0) {
                v1 = 1;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glga.a).v_newBuilder();
            String s = abyi0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((glga)hftv0).b |= 1;
            ((glga)hftv0).c = s;
            String s1 = abyi0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s1.getClass();
            ((glga)hftv1).b |= 2;
            ((glga)hftv1).d = s1;
            abyk abyk0 = abyk.b(abyi0.e) == null ? abyk.o : abyk.b(abyi0.e);
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            glga glga0 = (glga)hftp0.b_message;
            glga0.e = abyk0.a();
            glga0.b |= 4;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((glga)hftv2).f = v - 1;
            ((glga)hftv2).b |= 8;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glga)hftp0.b_message).g = v1 - 1;
            ((glga)hftp0.b_message).b |= 16;
            glga glga1 = (glga)hftp0.N_build();
            hlqe hlqe0 = hlqe.a;
            glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
            if(!glil0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glil0).ensureMutable();
            }
            glim glim0 = (glim)glil0.b_message;
            glga1.getClass();
            glim0.z = glga1;
            glim0.b |= 0x8000;
            glim glim1 = (glim)((ProtoLiteBuilder)glil0).N_build();
            zbd zbd0 = new zbd();
            ayuc ayuc0 = ayud0.j(((MessageLite)glim1), fhbe.b(this.c, zbd0));
            ayuc0.k = hlqe0;
            ayuc0.k(30);
            ayuc0.d();
        }
    }

    @Override  // fgch
    public final boolean c(TimeUnit timeUnit0) {
        if(this.a) {
            return false;
        }
        long v = SystemClock.elapsedRealtime() + TimeUnit.MILLISECONDS.convert(500L, timeUnit0);
        if(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            try {
                return ((Boolean)fgci.a(new fgcd(this, v)).get(v - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS)).booleanValue();
            }
            catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                return false;
            }
        }
        return this.a().e(v - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
    }
}

