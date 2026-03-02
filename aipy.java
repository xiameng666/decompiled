import android.os.SystemClock;

public final class aipy implements Runnable {
    public final aiqa a;
    public final String b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public aipy(aiqa aiqa0, String s, int v, int v1, long v2, boolean z, boolean z1) {
        this.a = aiqa0;
        this.b = s;
        this.c = v;
        this.g = v1;
        this.d = v2;
        this.e = z;
        this.f = z1;
    }

    @Override
    public final void run() {
        long v = SystemClock.elapsedRealtime();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((wvu)hftv0).b |= 1;
        ((wvu)hftv0).c = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((wvu)hftv1).b |= 4;
        ((wvu)hftv1).d = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wvu)hftp0.b_message).e = this.g - 1;
        ((wvu)hftp0.b_message).b |= 8;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v1 = v - this.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp1.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvu wvu0 = (wvu)hftp0.b_message;
        wvd wvd1 = (wvd)hftp1.N_build();
        wvd1.getClass();
        wvu0.f = wvd1;
        wvu0.b |= 16;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wvs.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((wvs)hftv2).b |= 1;
        ((wvs)hftv2).c = this.e;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        wvs wvs0 = (wvs)hftp2.b_message;
        wvs0.b |= 2;
        wvs0.d = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvu wvu1 = (wvu)hftp0.b_message;
        wvs wvs1 = (wvs)hftp2.N_build();
        wvs1.getClass();
        wvu1.g = wvs1;
        wvu1.b |= 0x20;
        wvu wvu2 = (wvu)hftp0.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)wuc.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        wuc wuc0 = (wuc)hftp3.b_message;
        wvu2.getClass();
        wuc0.d = wvu2;
        wuc0.c = 1;
        wuc wuc1 = (wuc)hftp3.N_build();
        cczb cczb0 = this.a.a.c(((ProtoLiteMessage)wuc1));
        cczb0.c = (int)1;
        cczb0.a();
    }
}

