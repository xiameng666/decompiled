import android.os.SystemClock;

public final class cajm implements evpz {
    public final long a;
    public final ProtoLiteBuilder b;

    public cajm(ProtoLiteBuilder hftp0, long v) {
        this.b = hftp0;
        this.a = v;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        long v = SystemClock.elapsedRealtime() - this.a;
        ProtoLiteBuilder hftp0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).j = v;
        cakj.a().b(((gisx)hftp0.N_build()));
    }
}

