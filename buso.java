import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class buso implements View.OnClickListener {
    public final cmeb a;
    public final bunz b;

    public buso(cmeb cmeb0, bunz bunz0) {
        this.a = cmeb0;
        this.b = bunz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a(gltz.e);
        bupl bupl0 = this.b.a;
        ccmg ccmg0 = bupl0.b;
        bujj bujj0 = null;
        if(ccmg0 == null) {
            ibuq.j("facetEventLogger");
            ccmg0 = null;
        }
        ccmg0.a(bbdg.xA);
        ((ggtj)bupl.a.h()).x("Launching purchase buy flow");
        acp acp0 = bupl0.ak;
        if(acp0 == null) {
            ibuq.j("upsellResultLauncher");
            acp0 = null;
        }
        busq busq0 = busq.a;
        Context context0 = bupl0.requireContext();
        bujj bujj1 = bupl0.c;
        if(bujj1 == null) {
            ibuq.j("accountInfo");
        }
        else {
            bujj0 = bujj1;
        }
        bujp bujp0 = bupl0.z();
        acp0.b(busq0.a(context0, bujj0.a, bujp0, 7));
    }
}

