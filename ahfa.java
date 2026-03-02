import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class ahfa extends fyfx {
    private ahfm ag;
    private aggo ah;

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        this.ah.d(6);
        this.ag.g.k(16, "Cancelled by user.");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ag = (ahfm)new lso(((xob)this.requireContext())).a(ahfm.class);
        aggo aggo0 = new aggo(this, this.ag.b, null);
        this.ah = aggo0;
        aggo0.a = bxnz.R;
        return layoutInflater0.inflate(0x7F0E0258, viewGroup0, false);  // layout:credential_verifiable_credential_loading_fragment
    }
}

