import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import java.util.List;
import java.util.concurrent.Callable;

public final class arbo implements Callable {
    public final D2dEarlySourceChimeraService a;

    public arbo(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        this.a = d2dEarlySourceChimeraService0;
    }

    @Override
    public final Object call() {
        D2dEarlySourceChimeraService d2dEarlySourceChimeraService0 = this.a;
        aree aree0 = d2dEarlySourceChimeraService0.h;
        List list0 = D2dEarlySourceChimeraService.l();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbl.a).v_newBuilder();
        for(Object object0: d2dEarlySourceChimeraService0.f.c()) {
            aqfx aqfx0 = (aqfx)object0;
            if(aqfx0 != aqfx.h && !list0.contains(Integer.valueOf(aqfx0.q))) {
                hftp0.cU(aqhj.b(aqfx0));
            }
        }
        return aree0.c(((asbl)hftp0.N_build()), d2dEarlySourceChimeraService0.m);
    }
}

