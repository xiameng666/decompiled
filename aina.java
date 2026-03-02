import android.os.SystemClock;

public final class aina implements gfsi {
    public final aink a;
    public final long b;

    public aina(aink aink0, long v) {
        this.a = aink0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = SystemClock.elapsedRealtime() - this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aink aink0 = this.a;
        wvd wvd0 = (wvd)hftp0.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v;
        wvd wvd1 = (wvd)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wuu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        aink0.d.getClass();
        ((wuu)hftv0).b |= 1;
        ((wuu)hftv0).c = aink0.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        wvd1.getClass();
        ((wuu)hftv1).d = wvd1;
        int v1 = 2;
        ((wuu)hftv1).b |= 2;
        if(((aizx)object0).c == 3) {
            v1 = 3;
        }
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((wuu)hftv2).e = v1 - 1;
        ((wuu)hftv2).b |= 4;
        int v2 = ((aizx)object0).b;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        wuu wuu0 = (wuu)hftp1.b_message;
        wuu0.b |= 8;
        wuu0.f = v2;
        wuu wuu1 = (wuu)hftp1.N_build();
        aink0.g.h(wuu1);
        return Boolean.valueOf(((aizx)object0).a);
    }
}

