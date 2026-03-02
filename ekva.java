import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import jeb.synthetic.TWR;

public final class ekva extends clht {
    private final esaa a;
    private final ekvm c;
    private long d;

    public ekva(Looper looper0, esaa esaa0, ekvm ekvm0) {
        super(looper0);
        this.d = 0L;
        this.a = esaa0;
        this.c = ekvm0;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v;
        if(message0.what != 0 && message0.what != 1 && message0.what != 2) {
            return;
        }
        if(Long.compare(message0.getWhen(), this.d) < 0) {
            if(Log.isLoggable("NetworkScheduler", 4)) {
                Log.i("NetworkScheduler", "ignoring stale queue check message");
            }
            ekrz ekrz0 = this.c.p;
            btak btak0 = this.c.c();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btat.a).v_newBuilder();
            btar btar0 = btar.b(message0.arg1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((btat)hftv0).c = btar0.q;
            ((btat)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btat)hftp0.b_message).f = 2;
            ((btat)hftp0.b_message).b |= 8;
            ekrz0.i(btak0, ((btat)hftp0.N_build()));
            return;
        }
        this.d = SystemClock.uptimeMillis();
        btar btar1 = btar.b(message0.arg1);
        String s = ekrz.d(btar1);
        if(s == null) {
            s = "";
        }
        try {
            new cllw("nts:standalone:checkQueue:" + s);
        }
        catch(Throwable throwable0) {
            goto label_49;
        }
        try {
            this.a.d(s);
            switch(message0.what) {
                case 1: {
                    gdqb gdqb1 = gdsp.e("com/google/android/gms/scheduler/standalone/StandaloneSchedulingEngine", "checkQueueLazily", 888, "checkQueueLazily");
                    TWR.declareResource(gdqb1);
                    TWR.useResource$NT(gdqb1);
                    v = this.c.a(this.c.s, btar1);
                    goto label_46;
                }
                case 0: 
                case 2: {
                    gdqb gdqb0 = gdsp.e("com/google/android/gms/scheduler/standalone/StandaloneSchedulingEngine", "checkQueueEagerly", 0x380, "checkQueueEagerly");
                    TWR.declareResource(gdqb0);
                    TWR.useResource$NT(gdqb0);
                    v = this.c.a(this.c.r, btar1);
                    goto label_46;
                }
                default: {
                    v = 0;
                    goto label_46;
                }
            }
        }
        catch(Throwable throwable1) {
            try {
                Trace.endSection();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable1.addSuppressed(throwable2);
                    throw throwable1;
                label_46:
                    Trace.endSection();
                    goto label_51;
                }
                catch(Throwable throwable0) {
                }
            }
        }
    label_49:
        this.a.n(s);
        throw throwable0;
    label_51:
        this.a.n(s);
        long v1 = SystemClock.uptimeMillis() - this.d;
        if(v == -1) {
            ekrz ekrz1 = this.c.p;
            btak btak1 = this.c.c();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btat.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((btat)hftv1).c = btar1.q;
            ((btat)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((btat)hftv2).b |= 4;
            ((btat)hftv2).e = 0L;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((btat)hftp1.b_message).f = 5;
            ((btat)hftp1.b_message).b |= 8;
            ekrz1.i(btak1, ((btat)hftp1.N_build()));
            return;
        }
        if(v == -2) {
            ekrz ekrz2 = this.c.p;
            btak btak2 = this.c.c();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btat.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((btat)hftv3).c = btar1.q;
            ((btat)hftv3).b |= 1;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp2.b_message;
            ((btat)hftv4).b |= 4;
            ((btat)hftv4).e = 0L;
            if(!hftv4.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((btat)hftp2.b_message).f = 6;
            ((btat)hftp2.b_message).b |= 8;
            ekrz2.i(btak2, ((btat)hftp2.N_build()));
            return;
        }
        ekrz ekrz3 = this.c.p;
        btak btak3 = this.c.c();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)btat.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp3.b_message;
        ((btat)hftv5).c = btar1.q;
        ((btat)hftv5).b |= 1;
        if(!hftv5.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp3.b_message;
        ((btat)hftv6).f = 1;
        ((btat)hftv6).b |= 8;
        if(!hftv6.isImmutable()) {
            hftp3.ensureMutable();
        }
        btat btat0 = (btat)hftp3.b_message;
        btat0.b |= 4;
        btat0.e = (long)v;
        hfst hfst0 = hfyf.k(v1);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        btat btat1 = (btat)hftp3.b_message;
        hfst0.getClass();
        btat1.d = hfst0;
        btat1.b |= 2;
        ekrz3.i(btak3, ((btat)hftp3.N_build()));
    }
}

