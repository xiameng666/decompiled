import android.os.SystemClock;

final class cajq implements evqf {
    final gisx a;
    final long b;

    public cajq(gisx gisx0, long v) {
        this.a = gisx0;
        this.b = v;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((gisx)hftv0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gisx)hftv1).d = v;
        int v1 = ((gisx)hftv1).e;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gisx)hftv2).f = v1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).i = 1;
        long v2 = SystemClock.elapsedRealtime() - this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).j = v2;
        cakj.a().b(((gisx)hftp0.N_build()));
    }
}

