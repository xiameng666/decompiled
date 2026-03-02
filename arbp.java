import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import java.util.concurrent.Callable;

public final class arbp implements Callable {
    public final D2dEarlySourceChimeraService a;

    public arbp(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        this.a = d2dEarlySourceChimeraService0;
    }

    @Override
    public final Object call() {
        asbo asbo0 = (asbo)gmbu.r(this.a.j);
        asbk asbk0 = (asbk)aqhj.b(aqfx.h).N_build();
        arqo arqo0 = this.a.f.a(asbk0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbn asbn0 = (asbn)hftp0.b_message;
        asbk0.getClass();
        asbn0.c = asbk0;
        asbn0.b |= 1;
        hftp0.cV(arqo0.c());
        asbn asbn1 = (asbn)hftp0.N_build();
        D2dEarlySourceChimeraService.a.j("Adding flavor summary apk with %d items", new Object[]{asbn1.d.size()});
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbo.a).w(((ProtoLiteMessage)asbo0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbo asbo1 = (asbo)hftp1.b_message;
        asbn1.getClass();
        asbo1.b();
        asbo1.c.add(asbn1);
        return (asbo)hftp1.N_build();
    }
}

