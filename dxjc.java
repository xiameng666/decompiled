import android.view.View;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dxjc implements ibts {
    public final dxjk a;

    public dxjc(dxjk dxjk0) {
        this.a = dxjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ftgg ftgg0;
        if(((ProtoSafeParcelable)object0) == null) {
            ftgg0 = ftgg.a;
            ibuq.e(ftgg0, "getDefaultInstance(...)");
        }
        else {
            ibuq.e(ftgg.a, "getDefaultInstance(...)");
            ftgg0 = (ftgg)ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)ftgg.a));
            if(ftgg0 == null) {
                ftgg0 = ftgg.a;
                ibuq.e(ftgg0, "getDefaultInstance(...)");
            }
        }
        dxjk dxjk0 = this.a;
        ecft.c(dxjk0.y(), dxjk0.N()).b(ftgg0);
        RowSecondary rowSecondary0 = dxjk0.c;
        View view0 = null;
        if(rowSecondary0 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary0 = null;
        }
        RowSecondary rowSecondary1 = dxjk0.c;
        if(rowSecondary1 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary1 = null;
        }
        fuat fuat0 = rowSecondary1.g();
        RowSecondary rowSecondary2 = dxjk0.c;
        if(rowSecondary2 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary2 = null;
        }
        fuca fuca0 = rowSecondary2.g().d;
        fubx fubx0 = (fuca0 instanceof fubx) ? ((fubx)fuca0) : null;
        int v = 0;
        fuca fuca1 = fubx0 == null ? null : fubx.b(fubx0, (ftgf.b(ftgg0.o) == null ? ftgf.e : ftgf.b(ftgg0.o)) == ftgf.c);
        rowSecondary0.h(fuat.d(fuat0, null, null, fuca1, null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary3 = dxjk0.d;
        if(rowSecondary3 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary3 = null;
        }
        RowSecondary rowSecondary4 = dxjk0.d;
        if(rowSecondary4 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary4 = null;
        }
        fuat fuat1 = rowSecondary4.g();
        RowSecondary rowSecondary5 = dxjk0.d;
        if(rowSecondary5 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary5 = null;
        }
        fuca fuca2 = rowSecondary5.g().d;
        fubx fubx1 = (fuca2 instanceof fubx) ? ((fubx)fuca2) : null;
        fuca fuca3 = fubx1 == null ? null : fubx.b(fubx1, (ftgf.b(ftgg0.m) == null ? ftgf.e : ftgf.b(ftgg0.m)) == ftgf.c);
        rowSecondary3.h(fuat.d(fuat1, null, null, fuca3, null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary6 = dxjk0.ag;
        if(rowSecondary6 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary6 = null;
        }
        RowSecondary rowSecondary7 = dxjk0.ag;
        if(rowSecondary7 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary7 = null;
        }
        fuat fuat2 = rowSecondary7.g();
        RowSecondary rowSecondary8 = dxjk0.ag;
        if(rowSecondary8 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary8 = null;
        }
        fuca fuca4 = rowSecondary8.g().d;
        fubx fubx2 = (fuca4 instanceof fubx) ? ((fubx)fuca4) : null;
        fuca fuca5 = fubx2 == null ? null : fubx.b(fubx2, (ftgf.b(ftgg0.n) == null ? ftgf.e : ftgf.b(ftgg0.n)) == ftgf.c);
        rowSecondary6.h(fuat.d(fuat2, null, null, fuca5, null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary9 = dxjk0.d;
        if(rowSecondary9 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary9 = null;
        }
        boolean z = dxjf.a(rowSecondary9);
        View view1 = dxjk0.ar;
        if(view1 == null) {
            ibuq.j("hiddenViewLayout");
        }
        else {
            view0 = view1;
        }
        if(!z) {
            v = 8;
        }
        view0.setVisibility(v);
        dxjk0.I(true);
        return ibom.a;
    }
}

