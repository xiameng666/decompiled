import android.content.Context;
import android.net.Uri;
import com.google.android.gms.pay.pass.valuable.model.program.GiftCardProgram;

public final class dwau implements dpug {
    public final dway a;

    public dwau(dway dway0) {
        this.a = dway0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        dway dway0 = this.a;
        Context context0 = dway0.getContext();
        if(context0 != null) {
            guzv guzv0 = ((gvaa)object0).b;
            if(guzv0 == null) {
                guzv0 = guzv.a;
            }
            GiftCardProgram giftCardProgram0 = new GiftCardProgram(guzv0);
            guzy guzy0 = giftCardProgram0.j;
            if(guzy0 != null) {
                dway0.ag.startActivity(dlnf.o(context0, Uri.parse(guzy0.c), giftCardProgram0, dlnd.e).putExtra("RETURN_WHEN_COMPLETE", dway0.an));
            }
        }
    }
}

