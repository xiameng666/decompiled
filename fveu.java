import android.os.SystemClock;
import j..util.Objects;

final class fveu implements gmbg {
    final fvev a;

    public fveu(fvev fvev0) {
        Objects.requireNonNull(fvev0);
        this.a = fvev0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        for(Object object0: this.a.d) {
            cmph cmph0 = new cmph(((cmpj)object0).c);
            ((cmpj)object0).b.execute(cmph0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        for(Object object1: this.a.d) {
            cmqj cmqj0 = ((cmpj)object1).a.u;
            if(cmqj0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwsr.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwsr gwsr0 = (gwsr)hftp0.b_message;
                ((gxpu)object0).getClass();
                gwsr0.c = (gxpu)object0;
                gwsr0.b = 12;
                cmqj0.a(((gwsr)hftp0.N_build()), SystemClock.elapsedRealtime());
            }
            cmpi cmpi0 = new cmpi(((cmpj)object1).c);
            ((cmpj)object1).b.execute(cmpi0);
        }
    }
}

