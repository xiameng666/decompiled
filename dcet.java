import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import java.util.Map;
import java.util.concurrent.Callable;

public final class dcet implements Callable {
    public final dchp a;
    public final SetDataUsageParams b;

    public dcet(dchp dchp0, SetDataUsageParams setDataUsageParams0) {
        this.a = dchp0;
        this.b = setDataUsageParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        int v = this.b.a;
        int v1 = nearbySharingChimeraService0.j();
        if(v1 == v) {
            return (int)35500;
        }
        if(v != 1 && v != 2 && v != 3) {
            dcvz.a.e().p("Invalid Data Usage Preference. Refer to SharingClient to see all valid cases.", new Object[0]);
            return (int)13;
        }
        ((dfsk)nearbySharingChimeraService0.d.get()).w(v);
        dcpn dcpn0 = nearbySharingChimeraService0.P;
        ProtoLiteBuilder hftp0 = dcpt.L(29);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyry.a).v_newBuilder();
        int v2 = dcpt.J(v1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyry)hftv0).c = v2 - 1;
        ((gyry)hftv0).b |= 1;
        int v3 = dcpt.J(v);
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyry)hftp1.b_message).d = v3 - 1;
        ((gyry)hftp1.b_message).b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyry gyry0 = (gyry)hftp1.N_build();
        gyry0.getClass();
        gysp0.D = gyry0;
        gysp0.b |= 0x40000000;
        dcpn0.i(new dcow(((gysp)hftp0.N_build())));
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Data usage preference state changed to %s", nearbySharingChimeraService0.D(v));
        nearbySharingChimeraService0.W();
        nearbySharingChimeraService0.N();
        if(hvqz.ag()) {
            int v4 = ((dfsk)nearbySharingChimeraService0.d.get()).a();
            if(((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue()) {
                gged_interceptors gged0 = gged_interceptors.i(nearbySharingChimeraService0.U.e());
                int v5 = gged0.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    dikd dikd0 = (dikd)gged0.get(v6);
                    int v7 = dikd0.b.o;
                    if(NearbySharingChimeraService.aW(v4, v7)) {
                        nearbySharingChimeraService0.c(dikd0.a);
                        cunf0.b().h("Cancel connection, because %s is not allowed.", Integer.valueOf(v7));
                    }
                }
                gged_interceptors gged1 = gged_interceptors.i(nearbySharingChimeraService0.T.e());
                int v8 = gged1.size();
                for(int v9 = 0; v9 < v8; ++v9) {
                    dikd dikd1 = (dikd)gged1.get(v9);
                    int v10 = dikd1.b.o;
                    if(NearbySharingChimeraService.aW(v4, v10)) {
                        nearbySharingChimeraService0.c(dikd1.a);
                        cunf0.b().h("Cancel connection, because %s is not allowed.", Integer.valueOf(v10));
                    }
                }
                return (int)0;
            }
            kau kau0 = nearbySharingChimeraService0.R;
            if(kau0 != null) {
                int v11 = ((TransferMetadata)kau0.b).o;
                if(NearbySharingChimeraService.aW(v4, v11)) {
                    nearbySharingChimeraService0.c(((ShareTarget)kau0.a));
                    cunf0.b().h("Cancel connection, because %s is not allowed.", Integer.valueOf(v11));
                }
            }
            Map map0 = nearbySharingChimeraService0.Q;
            gged_interceptors gged2 = gged_interceptors.i(map0.keySet());
            if(!gged2.isEmpty()) {
                int v12 = gged2.size();
                for(int v13 = 0; v13 < v12; ++v13) {
                    ShareTarget shareTarget0 = (ShareTarget)gged2.get(v13);
                    if(map0.get(shareTarget0) != null) {
                        int v14 = ((TransferMetadata)map0.get(shareTarget0)).o;
                        if(NearbySharingChimeraService.aW(v4, v14)) {
                            nearbySharingChimeraService0.c(shareTarget0);
                            cunf0.b().h("Cancel connection, because %s is not allowed.", Integer.valueOf(v14));
                        }
                    }
                }
            }
        }
        return (int)0;
    }
}

