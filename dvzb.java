import android.view.View;

public final class dvzb extends ednu {
    final dvze a;

    public dvzb(dvze dvze0) {
        this.a = dvze0;
        super();
    }

    @Override  // ednu
    public final void a(int v, CharSequence charSequence0) {
        ibuq.f(charSequence0, "errString");
        ((ggtj)dvze.a.j()).H("Authentication error. Error code: %s Error message: %s", v, charSequence0);
        if(v == 2) {
            return;
        }
        dvze dvze0 = this.a;
        if(v != 3 && v != 5 && v != 10) {
            dvze.S(dvze0);
            xob xob0 = dvze0.an();
            if(xob0 != null) {
                xob0.setResult(0);
            }
            dvze0.ar();
            return;
        }
        dvze.S(dvze0);
        View view0 = dvze0.ak;
        if(view0 == null) {
            ibuq.j("authenticationPrompt");
            view0 = null;
        }
        view0.setVisibility(8);
    }

    @Override  // ednu
    public final void b() {
        ((ggtj)dvze.a.j()).x("Failed to authenticate user.");
    }

    @Override  // ednu
    public final void c() {
        dvze dvze0 = this.a;
        xob xob0 = dvze0.an();
        if(xob0 != null && !xob0.isFinishing()) {
            xob0.runOnUiThread(new dvza(dvze0));
            return;
        }
        ((ggtj)dvze.a.h()).x("Activity finished already.");
    }
}

