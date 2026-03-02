import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public final class dcfy implements Callable {
    public final dchp a;
    public final dcnp b;
    public final dclv c;
    public final int d;
    public final RegisterSendSurfaceParams e;

    public dcfy(dchp dchp0, dcnp dcnp0, dclv dclv0, int v, RegisterSendSurfaceParams registerSendSurfaceParams0) {
        this.a = dchp0;
        this.b = dcnp0;
        this.c = dclv0;
        this.d = v;
        this.e = registerSendSurfaceParams0;
    }

    @Override
    public final Object call() {
        int v9;
        int v8;
        int v = this.d;
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        String s = this.e.e;
        int v1 = this.e.f;
        boolean z = this.e.g;
        if(!hvqz.q() && v == 2) {
            if(nearbySharingChimeraService0.G && djbz.h(nearbySharingChimeraService0)) {
                v = 2;
                goto label_11;
            }
            dcvz.a.e().h("Ignore registering %s send surface, due to disabled scanning mediums.", "DIRECT_SHARE_SERVICE");
            return (int)35501;
        }
    label_11:
        if(hvrc.a.b().b() && nearbySharingChimeraService0.aH()) {
            return (int)0x8AB8;
        }
        if(nearbySharingChimeraService0.aO()) {
            dcvz.a.e().h("Ignore registering (and unregistering if registered) %s send surface because we\'re currently receiving files.", dcme.a(v));
            return (int)0x8ABB;
        }
        dclv dclv0 = this.c;
        gful_cronetEngineProvider gful0 = nearbySharingChimeraService0.ao;
        if(((Boolean)gful0.mr()).booleanValue()) {
            cumy cumy0 = nearbySharingChimeraService0.S;
            for(Object object0: cumy0.e()) {
                dcvz.a.b().h("Reporting discovered share target %s when registering send surface", ((ShareTarget)object0).b);
                dclv0.jJ(((ShareTarget)object0));
            }
            gged_interceptors gged0 = gged_interceptors.i(nearbySharingChimeraService0.T.e());
            int v2 = gged0.size();
            int v3 = 0;
            while(v3 < v2) {
                ShareTarget shareTarget0 = ((dikd)gged0.get(v3)).a;
                if(!cumy0.k(Long.valueOf(shareTarget0.a))) {
                    dcvz.a.b().h("Reporting discovered share target %s when registering send surface", shareTarget0.b);
                    dclv0.jJ(shareTarget0);
                }
                ++v3;
                gged0 = gged0;
            }
        }
        else {
            gged_interceptors gged1 = nearbySharingChimeraService0.c.g();
            int v4 = gged1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                ShareTarget shareTarget1 = (ShareTarget)gged1.get(v5);
                if(shareTarget1.q()) {
                    dcvz.a.b().h("Reporting discovered share target %s when registering share sheet", shareTarget1.b);
                    dclv0.jJ(shareTarget1);
                }
            }
        }
        dcnp dcnp0 = this.b;
        boolean z1 = true;
        if(v == 1) {
        label_58:
            if(((Boolean)gful0.mr()).booleanValue()) {
                cumy cumy1 = nearbySharingChimeraService0.T;
                z1 = cumy1.l();
                gged_interceptors gged2 = gged_interceptors.i(cumy1.e());
                int v6 = gged2.size();
                int v7 = 0;
                while(v7 < v6) {
                    dikd dikd0 = (dikd)gged2.get(v7);
                    if(z && dikd0.b.e) {
                        cumy1.b(Long.valueOf(dikd0.a.a));
                        v8 = v;
                    }
                    else {
                        cunf cunf0 = dcvz.a.b();
                        ShareTarget shareTarget2 = dikd0.a;
                        v8 = v;
                        cunf0.h("Reporting in progress share target %s when registering send surface", shareTarget2.b);
                        dcnn dcnn0 = dikd0.b.a();
                        dcnn0.d();
                        dcnp0.e(shareTarget2, dcnn0.a());
                        if(dikd0.b.e) {
                            cumy1.b(Long.valueOf(shareTarget2.a));
                        }
                    }
                    ++v7;
                    v = v8;
                }
                v9 = v;
            }
            else {
                v9 = v;
                boolean z2 = nearbySharingChimeraService0.Q.isEmpty();
                for(Object object1: nearbySharingChimeraService0.Q.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    if(!((TransferMetadata)map$Entry0.getValue()).e) {
                        dcvz.a.b().h("Reporting in progress share target %s when registering share sheet", ((ShareTarget)map$Entry0.getKey()).b);
                        dcnp0.e(((ShareTarget)map$Entry0.getKey()), ((TransferMetadata)map$Entry0.getValue()));
                    }
                }
                z1 = z2;
            }
            if(z1) {
                nearbySharingChimeraService0.P.n();
                nearbySharingChimeraService0.aD();
            }
            if(hvrc.C()) {
                if(z1) {
                    nearbySharingChimeraService0.P.g = s;
                }
                nearbySharingChimeraService0.P.h = dcpt.y(v1);
            }
            v = v9;
        }
        else {
            switch(v) {
                case 2: {
                    if(hvod.d()) {
                        v = 2;
                        goto label_58;
                    }
                    else {
                        v = 2;
                    }
                    break;
                }
                case 3: 
                case 5: 
                case 6: {
                    goto label_58;
                }
            }
        }
        dcht dcht0 = new dcht(dclv0, v, v1);
        nearbySharingChimeraService0.q.h(dcnp0, dcht0);
        if(!hvqz.q()) {
            nearbySharingChimeraService0.aA();
        }
        if(!hvrc.C()) {
            if(z1) {
                nearbySharingChimeraService0.P.g = s;
            }
            nearbySharingChimeraService0.P.h = dcpt.y(v1);
        }
        if(!hvqz.X()) {
            Intent intent0 = nearbySharingChimeraService0.X;
            if(intent0 != null) {
                if(v == 5 || v == 6) {
                    intent0.putExtra("share_use_case", 2);
                }
                if(nearbySharingChimeraService0.aH()) {
                    intent0.putExtra("send_surface_state", v);
                    intent0.putExtra("send_surface_start_time", SystemClock.elapsedRealtime());
                }
                nearbySharingChimeraService0.a.q(intent0);
                nearbySharingChimeraService0.X = intent0;
            }
        }
        dcvz.a.b().h("A SendSurface(%s) has been registered", dcme.a(v));
        nearbySharingChimeraService0.Z();
        nearbySharingChimeraService0.N();
        return (int)0;
    }
}

