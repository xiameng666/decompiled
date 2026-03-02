import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class dfwc implements Runnable {
    public final dfzz a;
    public final dfum b;
    public final ShareTarget c;

    public dfwc(dfzz dfzz0, dfum dfum0, ShareTarget shareTarget0) {
        this.a = dfzz0;
        this.b = dfum0;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        dcjy dcjy0;
        while(true) {
            dfum dfum0 = this.b;
            if(dfum0.d()) {
                break;
            }
            ShareTarget shareTarget0 = this.c;
            dfzz dfzz0 = this.a;
            ConcurrentMap concurrentMap0 = shareTarget0.f ? dfzz0.as(shareTarget0) : dfzz0.at(shareTarget0);
            Iterator iterator0 = concurrentMap0.keySet().iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                dcjy0 = (dcjy)concurrentMap0.remove(object0);
            }
            else {
                dcjy0 = null;
            }
            if(dcjy0 == null) {
                dcjy0 = dfzz.U(dfum0);
            }
            if(dcjy0 != null) {
                switch((dcjx.b(dcjy0.c) == null ? dcjx.a : dcjx.b(dcjy0.c)).ordinal()) {
                    case 2: 
                    case 5: {
                        break;
                    }
                    case 6: {
                        dcvz.a.b().p("Read the cancel frame. Going to close connection", new Object[0]);
                        dfzz0.aU(new dfxn(dfzz0, shareTarget0));
                        break;
                    }
                    case 7: {
                        dfzz0.aU(new dfxo(dfzz0, shareTarget0, dcjy0));
                        break;
                    }
                    default: {
                        dcvz.a.b().h("Discarding unknown frame of type %s", (dcjx.b(dcjy0.c) == null ? dcjx.a : dcjx.b(dcjy0.c)).name());
                    }
                }
            }
        }
    }
}

