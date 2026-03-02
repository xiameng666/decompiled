import android.content.Context;
import android.widget.TextView;

public final class dvbo implements evqf {
    public final dvcl a;

    public dvbo(dvcl dvcl0) {
        this.a = dvcl0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        byte[] arr_b = (byte[])object0;
        dvcl dvcl0 = this.a;
        Context context0 = dvcl0.requireContext();
        if(!hwev.c()) {
            ((TextView)dvcl0.requireView().findViewById(0x7F0B02F1)).setText("Turn on activity history to view when, where, and what info was shared from your digital ID");  // id:DetailListItemSwitchContent
        }
        dvcl0.K(context0, ggna.a);
        dvcl0.J(false);
    }
}

