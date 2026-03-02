import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.wearable.consent.PrivacySettingsChimeraActivity;

public final class fdcv extends fdal {
    public fddd d;

    public final void B(RecyclerView recyclerView0) {
        fddd fddd0 = this.d;
        fdbf fdbf0 = fdbf.i(this.a);
        evql evql0 = fdbf0.b(((fdan)fddd0.f.get()).d).g(new fddb(fddd0, fdbf0));
        evql0.u(this.a, new fdcp(this));
        evql0.x(this.a, new fdcq(this, recyclerView0));
    }

    @Override  // fdal
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.d = new fddd(new fdab(), new fdct(), fcfo.d(this.requireContext()), new fdcu(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", "[PrivacySettingsFragment] onCreateView(...)");
        }
        this.A(bundle0);
        View view0 = fczo.c(this.b.a, layoutInflater0).inflate(0x7F0E0EBE, viewGroup0, false);  // layout:wearable_privacy_settings_fragment
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B1D15);  // id:privacy_settings_action_bar
        this.a.hG(toolbar0);
        im im0 = this.a.hL();
        if(im0 != null) {
            im0.p(6);
        }
        else if(Log.isLoggable("wearable.Consents", 5)) {
            Log.w("wearable.Consents", "ActionBar is null.");
        }
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B2251);  // id:terms_of_service_list
        view0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        recyclerView0.an(this.d.b(this.a, this.c, this.b));
        this.B(recyclerView0);
        PrivacySettingsChimeraActivity privacySettingsChimeraActivity0 = (PrivacySettingsChimeraActivity)this.a;
        privacySettingsChimeraActivity0.j = new fdcr(this, recyclerView0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1D17);  // id:privacy_settings_title
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1D16);  // id:privacy_settings_subtitle
        if(this.b.g && fdci.b()) {
            textView1.setVisibility(0);
        }
        if(this.b.a.c() == 2) {
            textView0.setGravity(1);
            return view0;
        }
        textView0.setGravity(0x800003);
        return view0;
    }
}

