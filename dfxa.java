import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxa implements Runnable {
    public final dfzz a;
    public final dfum b;
    public final dcnp c;
    public final ShareTarget d;
    public final dfzh e;

    public dfxa(dfzz dfzz0, dfum dfum0, dcnp dcnp0, ShareTarget shareTarget0, dfzh dfzh0) {
        this.a = dfzz0;
        this.b = dfum0;
        this.c = dcnp0;
        this.d = shareTarget0;
        this.e = dfzh0;
    }

    @Override
    public final void run() {
        gyzg gyzg0;
        dfzz dfzz0 = this.a;
        dfum dfum0 = this.b;
        ShareTarget shareTarget0 = this.d;
        dcnp dcnp0 = this.c;
        dfzh dfzh0 = this.e;
        dcjy dcjy0 = dfzh0.a;
        if(dcjy0 == null) {
            int v1 = dfzh0.b;
            int v2 = 1007;
            if(v1 != 0) {
                if(v1 - 1 == 0) {
                    gyzg0 = gyzg.x;
                    v2 = 1010;
                }
                else if(dfzz0.bx(shareTarget0)) {
                    gyzg0 = gyzg.c;
                }
                else if(dfzz0.bF()) {
                    gyzg0 = gyzg.D;
                }
                else {
                    gyzg0 = gyzg.C;
                }
            }
            else if(dfzz0.bF()) {
                gyzg0 = gyzg.D;
            }
            else {
                gyzg0 = gyzg.A;
            }
            dfzz0.aA(dfum0, dcnp0, shareTarget0, v2, gyzg0);
            dcvz.a.e().p("Failed to read a response from the remote device. Disconnecting.", new Object[0]);
            return;
        }
        dfzz0.h.a();
        dfzz0.ae(shareTarget0).z = dcjy0;
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Successfully read the response frame", new Object[0]);
        dciz dciz0 = dcjy0.e == null ? dciz.a : dcjy0.e;
        switch((dciy.b(dciz0.c) == null ? dciy.a : dciy.b(dciz0.c)).ordinal()) {
            case 1: {
                dfzz0.ae(shareTarget0).l = true;
                if(hvqz.L()) {
                    if(dciz0.e.size() != shareTarget0.g().size()) {
                        dfzz0.aA(dfum0, dcnp0, shareTarget0, 0x3F0, gyzg.w);
                        cunf0.b().p("Response did NOT include expected number of stream metadatas.", new Object[0]);
                        return;
                    }
                    dfzt dfzt0 = new dfzt(dfzz0, shareTarget0, dcnp0);
                    dfzz0.d.put(Long.valueOf(shareTarget0.a), dfzt0);
                    for(int v = 0; v < dciz0.e.size(); ++v) {
                        dcjs dcjs0 = (dcjs)dciz0.e.get(v);
                        dfzz0.ab(((Attachment)shareTarget0.g().get(v))).a(dcjs0.e);
                        dfzt0.k(dcjs0.e);
                        dfzz0.aQ(dcjs0.e, dfzt0);
                    }
                }
                dfzz0.aC();
                dfzz0.bk(dfum0, shareTarget0);
                return;
            }
            case 2: {
                dfzz0.aA(dfum0, dcnp0, shareTarget0, 0x3F0, gyzg.w);
                cunf0.b().p("The connection was rejected. The connection has been closed.", new Object[0]);
                return;
            }
            case 3: {
                dfzz0.aA(dfum0, dcnp0, shareTarget0, 0x3F5, gyzg.y);
                cunf0.b().p("The connection was rejected because the remote device does not have enough space for our attachments. The connection has been closed.", new Object[0]);
                return;
            }
            case 4: {
                dfzz0.aA(dfum0, dcnp0, shareTarget0, 0x3F6, gyzg.z);
                cunf0.b().p("The connection was rejected because the remote device does not support the attachments we were sending. The connection has been closed.", new Object[0]);
                return;
            }
            case 5: {
                dfzz0.aA(dfum0, dcnp0, shareTarget0, 1010, gyzg.x);
                cunf0.b().p("The connection was rejected because the remote device timed out. The connection has been closed.", new Object[0]);
                return;
            }
            default: {
                dfzz0.aA(dfum0, dcnp0, shareTarget0, 1007, gyzg.A);
                cunf0.b().p("The connection failed. The connection has been closed.", new Object[0]);
            }
        }
    }
}

