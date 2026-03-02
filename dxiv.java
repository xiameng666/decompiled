import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dxiv implements evqc {
    public final dxjk a;
    public final boolean b;

    public dxiv(dxjk dxjk0, boolean z) {
        this.a = dxjk0;
        this.b = z;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        dxjk dxjk0 = this.a;
        RowSecondary rowSecondary0 = dxjk0.d;
        fubx fubx0 = null;
        if(rowSecondary0 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary0 = null;
        }
        RowSecondary rowSecondary1 = dxjk0.d;
        if(rowSecondary1 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary1 = null;
        }
        fuat fuat0 = rowSecondary1.g();
        RowSecondary rowSecondary2 = dxjk0.d;
        if(rowSecondary2 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary2 = null;
        }
        fuca fuca0 = rowSecondary2.g().d;
        fubx fubx1 = (fuca0 instanceof fubx) ? ((fubx)fuca0) : null;
        if(fubx1 != null) {
            fubx0 = fubx.b(fubx1, this.b);
        }
        rowSecondary0.h(fuat.d(fuat0, null, null, fubx0, null, false, false, null, 0x3FF7));
        dxjk0.G();
    }
}

