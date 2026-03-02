import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dxah implements ibth {
    public final dxcw a;
    public final View b;
    public final RowSecondary c;

    public dxah(dxcw dxcw0, View view0, RowSecondary rowSecondary0) {
        this.a = dxcw0;
        this.b = view0;
        this.c = rowSecondary0;
    }

    @Override  // ibth
    public final Object a() {
        dxcw dxcw0 = this.a;
        Context context0 = this.b.getContext();
        ibuq.e(context0, "getContext(...)");
        gvcb gvcb0 = dxcw0.j;
        RowSecondary rowSecondary0 = this.c;
        switch(gvcb0.ordinal()) {
            case 0: {
                dxai.c(dxcw0, context0, rowSecondary0);
                return ibom.a;
            }
            case 1: {
                dxai.c(dxcw0, context0, rowSecondary0);
                return ibom.a;
            }
            case 2: {
                ((ggtj)dxai.a.h()).x("Time picker is displayed");
                hjio hjio0 = dxcw0.l.c == null ? hjio.a : dxcw0.l.c;
                ibuq.e(hjio0, "getLocalTime(...)");
                boolean z = DateFormat.is24HourFormat(context0);
                fzbe fzbe0 = new fzbe();
                fzbe0.d(((int)z));
                fzbe0.a(hjio0.b);
                fzbe0.c(hjio0.c);
                fzbf fzbf0 = fzbf.A(fzbe0);
                fzbf0.E(new dxae(fzbf0, dxcw0, rowSecondary0));
                ibuq.d(context0, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
                fzbf0.show(((xob)context0).getSupportFragmentManager(), "time_picker");
                return ibom.a;
            }
            default: {
                ((ggtj)dxai.a.i()).B("Unsupported input type: %s", gvcb0);
                return ibom.a;
            }
        }
    }
}

