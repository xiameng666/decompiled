import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager.OnActiveSessionsChangedListener;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class auee implements MediaSessionManager.OnActiveSessionsChangedListener {
    final aueg a;
    public static final int b;

    public auee(aueg aueg0) {
        this.a = aueg0;
        super();
    }

    @Override  // android.media.session.MediaSessionManager$OnActiveSessionsChangedListener
    public final void onActiveSessionsChanged(List list0) {
        Context context0 = AppContextProvider.a();
        if(list0 != null && !list0.isEmpty()) {
            List list1 = ibpo.at(list0);
            if(!aufd.a()) {
                hfuo hfuo0 = avij.e().f().b;
                ibuq.e(hfuo0, "getElementList(...)");
                ((ggtj)aueg.b.h()).B("Supported apps list %s", hfuo0);
                ibpo.G(list1, new auec(hfuo0));
            }
            aueg aueg0 = this.a;
            ibpo.G(list1, new aued(context0, aueg0));
            if(list1.isEmpty()) {
                ((ggtj)aueg.b.h()).x("Active mediasession apps are not supported for device suggestions.");
                ibuq.c(context0);
                aueg0.f(context0);
                return;
            }
            ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
            for(Object object0: list1) {
                arrayList0.add(((MediaController)object0).getPackageName());
            }
            Map map0 = aueh.e();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object1: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!arrayList0.contains(map$Entry0.getKey()) && !aueg0.c(((String)map$Entry0.getKey()))) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            for(Object object2: linkedHashMap0.entrySet()) {
                ibuq.c(context0);
                aueg0.g(context0, ((String)((Map.Entry)object2).getKey()));
            }
            ibuq.c(context0);
            ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
            for(Object object3: list1) {
                arrayList1.add(((MediaController)object3).getPackageName());
            }
            aueg0.i(context0, arrayList1);
            return;
        }
        ((ggtj)aueg.b.h()).x("No active sessions left; clearing cache");
        ibuq.c(context0);
        this.a.f(context0);
    }
}

