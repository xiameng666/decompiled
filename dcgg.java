import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.InvalidateIntentParams;
import j..util.Objects;
import java.util.Iterator;
import java.util.Map;

public final class dcgg implements Runnable {
    public final dchp a;
    public final InvalidateIntentParams b;

    public dcgg(dchp dchp0, InvalidateIntentParams invalidateIntentParams0) {
        this.a = dchp0;
        this.b = invalidateIntentParams0;
    }

    @Override
    public final void run() {
        try {
            InvalidateIntentParams invalidateIntentParams0 = this.b;
            NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
            Intent intent0 = invalidateIntentParams0.a;
            kau kau0 = nearbySharingChimeraService0.t;
            nearbySharingChimeraService0.Z = intent0.getBooleanExtra("com.google.android.gms.sharing.CHIME_NOTIFICATION_TRIGGER_SYNC", false);
            if(intent0.getIntExtra("nearby_share_intent_id", -1) == -1) {
                nearbySharingChimeraService0.a.A();
                nearbySharingChimeraService0.P.n();
                nearbySharingChimeraService0.a.q(intent0);
            }
            else {
                if(!hvrc.g()) {
                    if(!intent0.hasExtra("initial_opt_in")) {
                        intent0.putExtra("initial_opt_in", djat.c(nearbySharingChimeraService0.N));
                    }
                    if(!intent0.hasExtra("initial_enable_status")) {
                        intent0.putExtra("initial_enable_status", nearbySharingChimeraService0.aL());
                    }
                }
                nearbySharingChimeraService0.X = intent0;
                if(kau0 == null) {
                label_31:
                    if(!Objects.equals(intent0.getStringExtra("source_activity"), "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity")) {
                        nearbySharingChimeraService0.a.q(intent0);
                        nearbySharingChimeraService0.a.A();
                        nearbySharingChimeraService0.P.n();
                        cuui.h(nearbySharingChimeraService0.I, "NearbySharingServiceExecutor.downloadAttachmentsExecutor");
                        for(Object object2: nearbySharingChimeraService0.V.values()) {
                            ((bbln)object2).interrupt();
                        }
                        nearbySharingChimeraService0.I = cuui.f();
                        nearbySharingChimeraService0.P(null, intent0, new dccv(nearbySharingChimeraService0, intent0));
                        dcvz.a.b().p("Invalidate intent done.", new Object[0]);
                    }
                    else if(nearbySharingChimeraService0.R == null || ((TransferMetadata)nearbySharingChimeraService0.R.b).e) {
                        nearbySharingChimeraService0.a.q(intent0);
                    }
                }
                else {
                    int v = intent0.getIntExtra("nearby_share_intent_id", -1);
                    Object object0 = kau0.a;
                    if(v == ((Intent)object0).getIntExtra("nearby_share_intent_id", -1)) {
                        intent0 = (Intent)object0;
                    }
                    else {
                        Map map0 = nearbySharingChimeraService0.L(1);
                        Iterator iterator0 = map0.keySet().iterator();
                    label_22:
                        if(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            ShareTarget shareTarget0 = (ShareTarget)object1;
                            if(((TransferMetadata)map0.get(shareTarget0)).e) {
                                goto label_22;
                            }
                            switch(((TransferMetadata)map0.get(shareTarget0)).a) {
                                case 1000: 
                                case 0x3FD: {
                                    goto label_22;
                                }
                                default: {
                                    intent0 = (Intent)object0;
                                }
                            }
                        }
                        else {
                            goto label_31;
                        }
                    }
                }
            }
            if(intent0 != null) {
                invalidateIntentParams0.b.b(intent0);
                return;
            }
            invalidateIntentParams0.b.a(0x8ABD);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke invalidateIntent callback.", new Object[0]);
        }
    }
}

