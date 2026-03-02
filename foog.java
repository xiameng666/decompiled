import android.os.Process;
import j..util.Objects;

final class foog implements foob {
    final fooh a;

    public foog(fooh fooh0) {
        Objects.requireNonNull(fooh0);
        this.a = fooh0;
        super();
    }

    @Override  // foob
    public final boolean a(fonn fonn0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fono.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fonp.a).v_newBuilder();
        fooh fooh0 = this.a;
        fgvt fgvt0 = fooh0.a;
        long v = Process.getStartElapsedRealtime();
        hfwn hfwn0 = hfyn.h(fgvt0.d().toEpochMilli() - (fgvt0.a() - v));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fonp fonp0 = (fonp)hftp1.b_message;
        hfwn0.getClass();
        fonp0.c = hfwn0;
        fonp0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fono fono0 = (fono)hftp0.b_message;
        fonp fonp1 = (fonp)hftp1.N_build();
        fonp1.getClass();
        fono0.c = fonp1;
        fono0.b = 2;
        fonn0.a(hftp0);
        if(!((Boolean)fooh0.b.get()).booleanValue()) {
            long v1 = (long)Process.myPid();
            if(!fonn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fonn0).ensureMutable();
            }
            fonv fonv0 = (fonv)fonn0.b_message;
            fonv0.b |= 1;
            fonv0.c = v1;
            hfwn hfwn1 = hfyn.h(fgvt0.d().toEpochMilli());
            if(!fonn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fonn0).ensureMutable();
            }
            fonv fonv1 = (fonv)fonn0.b_message;
            hfwn1.getClass();
            fonv1.d = hfwn1;
            fonv1.b |= 2;
        }
        return true;
    }
}

