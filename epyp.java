import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.util.ArrayList;
import java.util.List;

public final class epyp implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        List list0 = (List)evql0.j();
        Object object0 = new ArrayList();
        if(list0 != null) {
            for(Object object1: list0) {
                evql evql1 = (evql)object1;
                if(evql1.n()) {
                    EsimActivationPayload esimActivationPayload0 = (EsimActivationPayload)evql1.j();
                    if(esimActivationPayload0 != null) {
                        ((ArrayList)object0).add(esimActivationPayload0);
                    }
                }
            }
        }
        return object0;
    }
}

