import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.GlifLayout;
import j..util.Objects;

public final class akqa extends du {
    public akqg a;
    private int ag;
    public GlifLayout b;
    private int c;
    private gfsx d;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        Bundle bundle1 = (Bundle)Objects.requireNonNull(this.getArguments());
        akqg[] arr_akqg = akqg.values();
        this.a = arr_akqg[bundle1.getInt("UWP_SCREEN_ID")];
        this.c = bundle1.getInt("UWP_HEADER_TEXT");
        gfsx gfsx0 = bundle1.containsKey("UWP_REJECT_BUTTON_TEXT") ? gfsx.m(Integer.valueOf(bundle1.getInt("UWP_REJECT_BUTTON_TEXT"))) : gfqx.a;
        this.d = gfsx0;
        this.ag = bundle1.getInt("UWP_ACCEPT_BUTTON_TEXT");
        Resources resources0 = this.getResources();
        GlifLayout glifLayout0 = (GlifLayout)LayoutInflater.from(this.requireContext()).inflate(0x7F0E0C0D, viewGroup0, false);  // layout:unmanaged_work_profile_opt_in_glif
        this.b = glifLayout0;
        glifLayout0.b(resources0.getString(this.c));
        akqh akqh0 = (akqh)new lso(((lsq)this.requireContext()), new akqf(new akqc())).a(akqh.class);
        gaff gaff0 = (gaff)this.b.t(gaff.class);
        gafg gafg0 = new gafg(this.requireContext());
        gafg0.a = resources0.getString(this.ag);
        gafg0.b = new akpw(this, akqh0);
        gaff0.c(gafg0.a());
        if(this.d.i()) {
            gafg gafg1 = new gafg(this.requireContext());
            gafg1.a = resources0.getString(((Integer)this.d.d()).intValue());
            gafg1.b = new akpx(this, akqh0);
            gaff0.d(gafg1.a());
        }
        ((lqd)Objects.requireNonNull(((lqd)akqh0.b.get(this.a)))).g(this, new akpy(this));
        return this.b;
    }
}

