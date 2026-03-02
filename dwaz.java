import android.content.Context;
import android.net.Uri;
import com.google.android.gms.pay.pass.valuable.model.program.LoyaltyCardProgram;

public final class dwaz implements dpug {
    public final dwbd a;

    public dwaz(dwbd dwbd0) {
        this.a = dwbd0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        dwbd dwbd0 = this.a;
        Context context0 = dwbd0.getContext();
        if(context0 != null) {
            guzw guzw0 = ((gvac)object0).b;
            if(guzw0 == null) {
                guzw0 = guzw.a;
            }
            LoyaltyCardProgram loyaltyCardProgram0 = new LoyaltyCardProgram(guzw0);
            guzy guzy0 = loyaltyCardProgram0.j;
            if(guzy0 != null) {
                dlnd dlnd0 = dwbd0.ao == dlnd.o ? dlnd.q : dlnd.k;
                dwbd0.ag.startActivity(dlnf.o(context0, Uri.parse(guzy0.c), loyaltyCardProgram0, dlnd0).putExtra("RETURN_WHEN_COMPLETE", dwbd0.an));
            }
        }
    }
}

