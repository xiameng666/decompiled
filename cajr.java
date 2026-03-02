import android.os.SystemClock;

final class cajr implements evqc {
    final int a;
    final gisx b;
    final long c;

    public cajr(int v, gisx gisx0, long v1) {
        this.a = v;
        this.b = gisx0;
        this.c = v1;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(cajs.a.j(), "Apps indexing failed.", exception0);
        cakj.a().c(this.a);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.b).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.b));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).i = 2;
        long v = SystemClock.elapsedRealtime() - this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).j = v;
        gisx gisx0 = (gisx)hftp0.N_build();
        cakj.a().b(gisx0);
    }
}

