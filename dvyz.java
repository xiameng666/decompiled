import android.view.View;

public final class dvyz implements evpz {
    public final dvze a;

    public dvyz(dvze dvze0) {
        this.a = dvze0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        dvze dvze0 = this.a;
        dvze0.aj = true;
        dvze0.ai = false;
        View view0 = dvze0.ak;
        if(view0 == null) {
            ibuq.j("authenticationPrompt");
            view0 = null;
        }
        view0.setVisibility(8);
        dvze0.L();
    }
}

