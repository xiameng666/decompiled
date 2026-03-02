import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import j..util.Comparator.-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class dcdr implements Callable {
    public final dchp a;
    public final dcnp b;
    public final int c;
    public final RegisterReceiveSurfaceParams d;

    public dcdr(dchp dchp0, dcnp dcnp0, int v, RegisterReceiveSurfaceParams registerReceiveSurfaceParams0) {
        this.a = dchp0;
        this.b = dcnp0;
        this.c = v;
        this.d = registerReceiveSurfaceParams0;
    }

    @Override
    public final Object call() {
        dchp dchp0 = this.a;
        NearbySharingChimeraService nearbySharingChimeraService0 = dchp0.e;
        dcnp dcnp0 = this.b;
        int v = this.c;
        Integer integer0 = this.d.e;
        QrCodeMetadata qrCodeMetadata0 = this.d.d;
        String s = this.d.f;
        if(nearbySharingChimeraService0.aR()) {
            nearbySharingChimeraService0.aY(dcnp0);
            dcvz.a.e().h("Ignore registering (and unregistering if registered) %s receive surface, because we\'re currently sending files.", NearbySharingChimeraService.G(v));
            return (int)0x8ABB;
        }
        if(v == 1) {
            if(hvqz.F() && nearbySharingChimeraService0.aO() && qrCodeMetadata0 != null && !qrCodeMetadata0.equals(nearbySharingChimeraService0.E)) {
                nearbySharingChimeraService0.aY(dcnp0);
                dcvz.a.e().h("Ignore registering %s receive surface with QR code, because we\'re currently receiving files.", "FOREGROUND");
                return (int)0x8ABE;
            }
            v = 1;
        }
        boolean z = hvqz.F() && qrCodeMetadata0 != null && !qrCodeMetadata0.equals(nearbySharingChimeraService0.E);
        Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_RECEIVE_SURFACE_REGISTER");
        intent0.putExtra("register_receive_surface_state", v);
        cutr.d(nearbySharingChimeraService0.N, intent0);
        if(v == 1) {
            if(((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue()) {
                cumy cumy0 = nearbySharingChimeraService0.U;
                ArrayList arrayList0 = new ArrayList(cumy0.e());
                Collections.sort(arrayList0, Comparator.-CC.comparing(new dcbf(), new dcbg()));
                int v1 = arrayList0.size();
                int v2 = 0;
                while(v2 < v1) {
                    dikd dikd0 = (dikd)arrayList0.get(v2);
                    ShareTarget shareTarget0 = dikd0.a;
                    nearbySharingChimeraService0.L.f(shareTarget0);
                    dcvz.a.b().h("Reporting in progress share target %s when registering receive surface", shareTarget0.b);
                    if(!z) {
                        dcnn dcnn0 = dikd0.b.a();
                        dcnn0.d();
                        dcnp0.e(shareTarget0, dcnn0.a());
                    }
                    if(dikd0.b.e) {
                        cumy0.b(Long.valueOf(shareTarget0.a));
                    }
                    ++v2;
                    z = true;
                }
            }
            else {
                kau kau0 = nearbySharingChimeraService0.R;
                if(kau0 != null) {
                    nearbySharingChimeraService0.L.f(((ShareTarget)kau0.a));
                }
                kau kau1 = nearbySharingChimeraService0.R;
                if(kau1 != null && !z) {
                    dcnp0.e(((ShareTarget)kau1.a), ((TransferMetadata)kau1.b));
                }
            }
            v = 1;
        }
        dchs dchs0 = new dchs(v, dchp0.b, integer0, qrCodeMetadata0);
        nearbySharingChimeraService0.p.h(dcnp0, dchs0);
        nearbySharingChimeraService0.aA();
        dcvz.a.b().h("A ReceiveSurface(%s) has been registered", NearbySharingChimeraService.G(v));
        if(hvqz.m() && v == 1) {
            nearbySharingChimeraService0.P.i = s;
        }
        if(hvqz.C() && (nearbySharingChimeraService0.aG() || nearbySharingChimeraService0.aF())) {
            nearbySharingChimeraService0.Z();
        }
        else {
            nearbySharingChimeraService0.W();
        }
        nearbySharingChimeraService0.N();
        return (int)0;
    }
}

