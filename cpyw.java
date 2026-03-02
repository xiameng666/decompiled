import android.content.Context;
import android.content.IntentFilter;
import java.util.Random;

public final class cpyw implements cpyv {
    private static final bboh a;
    private static final Random b;
    private final Context c;
    private final fjbb d;
    private final int e;
    private final String f;

    static {
        cpyw.a = bboh.b("MobStore.EventLoggerImpl", bbcu.cm);
        cpyw.b = new Random();
    }

    public cpyw(Context context0, fjbb fjbb0, int v) {
        this.c = context0;
        this.d = fjbb0;
        this.e = v;
        this.f = "com.google.android.gms";
    }

    @Override  // cpyv
    public final void a(glpy glpy0) {
        long v = hucy.a.b().f();
        int v1 = Long.compare(v, 0L);
        if(v1 <= 0) {
            if(v1 < 0) {
                ((ggtj)cpyw.a.j()).A("Bad sample interval: %d", v);
            }
        }
        else if(cpyw.b.nextLong() % v == 0L) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            glpy0.getClass();
            ((glnz)hftv0).u = glpy0;
            ((glnz)hftv0).b |= 0x400000;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz0 = (glnz)hftp0.b_message;
            glnz0.b |= 0x80000;
            glnz0.s = v;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glny.a).v_newBuilder();
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW");
            boolean z = jwe.b(this.c, null, intentFilter0, 2) != null;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glny glny0 = (glny)hftp1.b_message;
            glny0.b |= 1;
            glny0.c = z;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz1 = (glnz)hftp0.b_message;
            glny glny1 = (glny)hftp1.N_build();
            glny1.getClass();
            glnz1.C = glny1;
            glnz1.c |= 0x80;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glne.a).v_newBuilder();
            String s = this.f;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            s.getClass();
            ((glne)hftv1).b |= 2;
            ((glne)hftv1).d = s;
            int v2 = this.e;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            glne glne0 = (glne)hftp2.b_message;
            glne0.b |= 1;
            glne0.c = v2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnz glnz2 = (glnz)hftp0.b_message;
            glne glne1 = (glne)hftp2.N_build();
            glne1.getClass();
            glnz2.I = glne1;
            glnz2.c |= 0x80000;
            ProtoLiteMessage hftv2 = hftp0.N_build();
            this.d.a(((MessageLite)hftv2), 13000);
        }
    }
}

