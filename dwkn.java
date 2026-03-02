import android.view.View;

public final class dwkn implements Runnable {
    public final dwkz a;
    public final gged_interceptors b;
    public final gfsx c;

    public dwkn(dwkz dwkz0, gged_interceptors gged0, gfsx gfsx0) {
        this.a = dwkz0;
        this.b = gged0;
        this.c = gfsx0;
    }

    @Override
    public final void run() {
        dwkz dwkz0 = this.a;
        dwkz0.au.setVisibility(8);
        dwkz0.al.setVisibility(8);
        int v = dwkz0.I();
        guvv guvv0 = dwkz0.ai.o;
        if(dwkz0.ak != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)guvv0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)guvv0));
            guut guut0 = dwkz0.ak;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guvv guvv1 = (guvv)hftp0.b_message;
            guut0.getClass();
            guvv1.d = guut0;
            guvv1.b |= 1;
            guvv0 = (guvv)hftp0.N_build();
        }
        gged_interceptors gged0 = this.b;
        dwkz0.av.a(dwkz0.at, gged0, guvv0, v == 4, ((String)this.c.g()));
        dwkz0.av.f(dwkz0.I(), new dwkv(dwkz0));
        View view0 = dwkz0.getView();
        if(view0 != null) {
            dwkz0.av.d(dwkz0.getString(0x7F151C1C), view0, gged0, dwkz0.D(), dwkz0);  // string:pay_button_save "Save"
        }
        dwkz0.av.setVisibility(0);
        dwkz0.an.setVisibility(0);
        dwkz0.an.animate().translationY(dwkz0.J(0.0f));
        dwkz0.N(true);
    }
}

