import android.content.Context;
import android.view.View;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import java.util.Arrays;
import java.util.Locale;

public final class dxac extends uq {
    private final RowSecondary t;

    public dxac(View view0) {
        ibuq.f(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B025D);  // id:DateTimeSelector
        ibuq.e(view1, "findViewById(...)");
        this.t = (RowSecondary)view1;
    }

    public final void D(dxcw dxcw0) {
        String s;
        ibuq.f(dxcw0, "ucpInputItem");
        ((ggtj)dxai.a.h()).B("Local date input: %s", ((ProtoLiteMessage)(dxcw0.k.c == null ? hjih.a : dxcw0.k.c)).toString());
        gvcb gvcb0 = dxcw0.j;
        if(gvcb0 == gvcb.b && (dxcw0.k.b & 1) != 0) {
            edmp edmp0 = new edmp().c().b().d();
            Context context0 = this.a.getContext();
            hjih hjih0 = dxcw0.k.c == null ? hjih.a : dxcw0.k.c;
            ibuq.e(hjih0, "getDate(...)");
            s = edmp0.g(context0, dxai.a(hjih0));
        }
        else if(gvcb0 == gvcb.c) {
            s = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{((int)(dxcw0.l.c == null ? hjio.a : dxcw0.l.c).b), ((int)(dxcw0.l.c == null ? hjio.a : dxcw0.l.c).c)}, 2));
            ibuq.e(s, "format(...)");
        }
        else {
            s = dxcw0.c;
        }
        View view0 = this.a;
        fuat fuat0 = new fuat(new fryu(dxcw0.b), new fryu(dxcw0.c), null, new fubv(new fryh((gvcb0 == gvcb.c ? 0x7F08061F : 0x7F0804F0)), null, null, null, null, 0x7E), 0, null, new dxah(dxcw0, view0, this.t), null, null, false, false, false, fule.b, false, 0x2000);  // drawable:gs_schedule_vd_theme_24
        ibuq.c(s);
        this.t.h(fuat.d(fuat0, new fryu(s), null, null, null, false, false, null, 0x3FFD));
    }
}

