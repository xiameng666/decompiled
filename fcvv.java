import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fcvv implements ibtw {
    final fcvw a;

    public fcvv(fcvw fcvw0) {
        this.a = fcvw0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        Context context0 = (Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b);
        pmt pmt0 = null;
        if(Build.VERSION.SDK_INT >= 35 && Settings.Global.getInt(context0.getContentResolver(), "dynamic_color_theme_enabled", 0) == 1) {
            long v = psk.a(context0, 0x10600B4);
            long v1 = psk.a(context0, 0x10600B5);
            long v2 = psk.a(context0, 0x1060089);
            long v3 = psk.a(context0, 0x10600B6);
            long v4 = psk.a(context0, 0x106008A);
            long v5 = psk.a(context0, 0x10600B8);
            long v6 = psk.a(context0, 0x10600B9);
            long v7 = psk.a(context0, 0x106008D);
            long v8 = psk.a(context0, 0x10600BA);
            long v9 = psk.a(context0, 0x106008E);
            long v10 = psk.a(context0, 0x10600BC);
            long v11 = psk.a(context0, 0x10600BD);
            long v12 = psk.a(context0, 0x1060091);
            long v13 = psk.a(context0, 0x10600BE);
            long v14 = psk.a(context0, 0x1060092);
            long v15 = psk.a(context0, 0x1060099);
            long v16 = psk.a(context0, 0x106009B);
            long v17 = psk.a(context0, 0x106009C);
            long v18 = psk.a(context0, 0x1060098);
            long v19 = psk.a(context0, 0x10600A1);
            long v20 = psk.a(context0, 0x10600A2);
            long v21 = psk.a(context0, 0x10600C1);
            long v22 = psk.a(context0, 0x1060095);
            long v23 = psk.a(context0, 0x1060096);
            long v24 = psk.a(context0, 0x10600A3);
            long v25 = psk.a(context0, 0x10600A5);
            pmt0 = new pmt(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, ppg.a(psk.a(context0, 0x10600A5), 68.0f), v25, psk.a(context0, 0x10600A4), psk.a(context0, 0x10600A6));
        }
        if(pmt0 == null) {
            pmt0 = new pmt();
        }
        pqt.a(pmt0, null, null, null, gzf.e(0x49F40B6C, new fcvu(this.a), ((goz)object0)), ((goz)object0), 0x6000, 14);
        return ibom.a;
    }
}

