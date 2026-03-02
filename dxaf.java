import android.content.Context;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dxaf implements ibts {
    public final fyiz a;
    public final Context b;
    public final dxcw c;
    public final RowSecondary d;

    public dxaf(fyiz fyiz0, Context context0, dxcw dxcw0, RowSecondary rowSecondary0) {
        this.a = fyiz0;
        this.b = context0;
        this.c = dxcw0;
        this.d = rowSecondary0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Long long0 = (Long)object0;
        Object object1 = this.a.z();
        if(object1 != null) {
            String s = new edmp().c().b().d().g(this.b, dxai.a(dxai.b(((Long)object1).longValue())));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvbh.a).v_newBuilder();
            hjih hjih0 = dxai.b(((Long)object1).longValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvbh gvbh0 = (gvbh)hftp0.b_message;
            hjih0.getClass();
            gvbh0.c = hjih0;
            gvbh0.b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((gvbh)hftv0), "<set-?>");
            this.c.k = (gvbh)hftv0;
            ibuq.c(s);
            this.c.b(s);
            fuat fuat0 = fuat.d(this.d.g(), new fryu(s), null, null, null, false, false, null, 0x3FFD);
            this.d.h(fuat0);
        }
        return ibom.a;
    }
}

