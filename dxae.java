import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import java.util.Arrays;
import java.util.Locale;

public final class dxae implements View.OnClickListener {
    public final fzbf a;
    public final dxcw b;
    public final RowSecondary c;

    public dxae(fzbf fzbf0, dxcw dxcw0, RowSecondary rowSecondary0) {
        this.a = fzbf0;
        this.b = dxcw0;
        this.c = rowSecondary0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Locale locale0 = Locale.getDefault();
        fzbf fzbf0 = this.a;
        String s = String.format(locale0, "%02d:%02d", Arrays.copyOf(new Object[]{fzbf0.y(), fzbf0.z()}, 2));
        ibuq.e(s, "format(...)");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvbj.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjio.a).v_newBuilder();
        int v = fzbf0.y();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjio)hftp1.b_message).b = v;
        int v1 = fzbf0.z();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjio)hftp1.b_message).c = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvbj gvbj0 = (gvbj)hftp0.b_message;
        hjio hjio0 = (hjio)hftp1.N_build();
        hjio0.getClass();
        gvbj0.c = hjio0;
        gvbj0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvbj)hftv0), "<set-?>");
        this.b.l = (gvbj)hftv0;
        this.b.b(s);
        fuat fuat0 = fuat.d(this.c.g(), new fryu(s), null, null, null, false, false, null, 0x3FFD);
        this.c.h(fuat0);
    }
}

