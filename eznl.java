import java.util.concurrent.Callable;

public final class eznl implements Callable {
    public final int a;
    public final gmcd b;
    public final gmcd c;

    public eznl(int v, gmcd gmcd0, gmcd gmcd1) {
        this.a = v;
        this.b = gmcd0;
        this.c = gmcd1;
    }

    @Override
    public final Object call() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffv hffv0 = (hffv)hftp0.b_message;
        hffv0.b |= 1;
        hffv0.c = this.a;
        boolean z = ((Boolean)gmbu.r(this.b)).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffv hffv1 = (hffv)hftp0.b_message;
        hffv1.b |= 2;
        hffv1.d = z;
        boolean z1 = ((Boolean)gmbu.r(this.c)).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffv hffv2 = (hffv)hftp0.b_message;
        hffv2.b |= 8;
        hffv2.f = z1;
        return new eznq(((hffv)hftp0.N_build()));
    }
}

