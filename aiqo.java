import android.os.SystemClock;

public final class aiqo implements Runnable {
    public final aiqw a;
    public final String b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;

    public aiqo(aiqw aiqw0, String s, int v, int v1, long v2, int v3) {
        this.a = aiqw0;
        this.b = s;
        this.c = v;
        this.f = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override
    public final void run() {
        long v = SystemClock.elapsedRealtime();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wva.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((wva)hftv0).b |= 1;
        ((wva)hftv0).c = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((wva)hftv1).b |= 2;
        ((wva)hftv1).d = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wva)hftp0.b_message).e = this.f - 1;
        ((wva)hftp0.b_message).b |= 4;
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
        wva wva0 = (wva)hftp0.b_message;
        wvd wvd1 = (wvd)hftp1.N_build();
        wvd1.getClass();
        wva0.f = wvd1;
        wva0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wva wva1 = (wva)hftp0.b_message;
        wva1.b |= 16;
        wva1.g = this.e;
        wva wva2 = (wva)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wuc.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        wuc wuc0 = (wuc)hftp2.b_message;
        wva2.getClass();
        wuc0.d = wva2;
        wuc0.c = 4;
        wuc wuc1 = (wuc)hftp2.N_build();
        ayuc ayuc0 = this.a.b.j(((MessageLite)wuc1), this.a.c);
        ayuc0.k(4);
        ayuc0.d();
    }
}

