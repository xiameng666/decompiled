import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class ahew extends aerb {
    private ahfm b;

    @Override  // aerb
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.b = (ahfm)new lso(((xob)this.requireContext())).a(ahfm.class);
        aere aere0 = aerf.a();
        aere0.c(aerg.d);
        aere0.b("Google");
        aerc aerc0 = aerd.a();
        aerc0.d = BitmapFactory.decodeResource(AppContextProvider.a().getResources(), 0x7F080A68);
        aerc0.e = "Google";
        aere0.b = aerc0.a();
        this.A(aere0.a());
    }

    @Override  // aerb
    protected final void y(int v, String s) {
        bxmu bxmu0 = this.b.g;
        if(v == 10) {
            bxmu0.k(16, "Cancelled by user.");
            return;
        }
        if(s == null) {
            s = "User verification failed.";
        }
        bxmu0.k(0x6F3B, bxma.k(v, s));
    }

    @Override  // aerb
    protected final void z(int v) {
        this.b.g.f(bxqz.e);
    }
}

