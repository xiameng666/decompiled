import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;
import j..util.Objects;

public final class egvi extends du implements View.OnClickListener {
    public lsk a;
    public egvm b;
    private egvc c;

    @Override  // du
    public final lsk getDefaultViewModelProviderFactory() {
        if(this.a == null) {
            this.a = egxn.d(this.requireContext());
        }
        return this.a;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0.getId() != 0x7F0B0F87) {  // id:confirm_button
            return;
        }
        this.y().e(0x20, 9);
        fm fm0 = this.getParentFragmentManager();
        egvm egvm0 = this.b;
        Bundle bundle0 = egwg.c();
        bundle0.putParcelable("import_request", new ImportSimContactsRequest(new ggoh(((int)egvm0.d.b)), egvm0.d.a));
        fm0.ae("ImportSimContactsListFragment", bundle0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = new egvc();
        this.b = (egvm)new lso(this).a(egvm.class);
        Bundle bundle1 = this.requireArguments();
        ImportSimContactsSuggestion importSimContactsSuggestion0 = (ImportSimContactsSuggestion)bundle1.getParcelable("suggestion");
        gftb.z(importSimContactsSuggestion0, "Missing required argument \"suggestion\"");
        egvm egvm0 = this.b;
        int v = bundle1.getInt("suggestion_count", 1);
        if(egvm0.a().b == 1) {
            egvm0.d = importSimContactsSuggestion0;
            egvm0.g = importSimContactsSuggestion0.b;
            egvm0.e = v;
            return;
        }
        if(Objects.equals(egvm0.d, importSimContactsSuggestion0)) {
            return;
        }
        throw new IllegalArgumentException("Cannot change SIM suggestion.");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E04E6, viewGroup0, false);  // layout:import_sim_contact_list_screen
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B16FA);  // id:import_sim_contact_list_toolbar
        egvm egvm0 = this.b;
        egwa egwa0 = egvm0.c;
        CharSequence charSequence0 = egwa0.e(egvm0.g);
        if(charSequence0 == null) {
            charSequence0 = egwa0.f(egvm0.g);
            if(charSequence0 == null) {
                charSequence0 = egvm0.b.getString(0x1040006);
            }
        }
        toolbar0.D(charSequence0);
        toolbar0.x(new egvf(this));
        View view1 = view0.findViewById(0x7F0B0F87);  // id:confirm_button
        view1.setOnClickListener(this);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x102000A);
        this.requireContext();
        recyclerView0.ap(new LinearLayoutManager());
        TextView textView0 = (TextView)view0.findViewById(0x102000B);
        Context context0 = this.requireContext();
        AppCompatTextView appCompatTextView0 = new AppCompatTextView(context0);
        int v = context0.getResources().getDimensionPixelSize(0x7F070E78);  // dimen:people_standard_vertical_padding
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x7F040D0F, 0x10103BD, 0x10103BE});  // attr:textAppearanceOverline
        appCompatTextView0.setTextAppearance(typedArray0.getResourceId(0, 0));
        appCompatTextView0.setPaddingRelative(typedArray0.getDimensionPixelSize(1, 0), v, typedArray0.getDimensionPixelSize(2, 0), v);
        typedArray0.recycle();
        egwf egwf0 = new egwf(appCompatTextView0);
        egvh egvh0 = new egvh(this, layoutInflater0);
        recyclerView0.an(new qq(new tk[]{egwf0, egvh0}));
        egvm egvm1 = this.b;
        if(egvm1.g == -1) {
            throw new IllegalStateException("setSimSubscriptionId must be called previously with a valid subscriptionId");
        }
        if(egvm1.a().b == 1) {
            egvl egvl0 = egvl.b(2);
            egvm1.h.l(egvl0);
            gmbu.t(egvm1.c.c(egvm1.g), new egvk(egvm1), gmap.a);
        }
        lps lps0 = this.getViewLifecycleOwner();
        egvg egvg0 = new egvg(this, textView0, recyclerView0, egwf0, egvh0, view1);
        egvm1.h.g(lps0, egvg0);
        egvm egvm2 = this.b;
        egvc egvc0 = this.y();
        int v1 = egxj.r(egxj.b(this));
        if(bundle0 == null && !egvm2.f) {
            egvc0.g(9, v1);
            egvm2.f = true;
        }
        return view0;
    }

    private final egvc y() {
        egvc egvc0 = this.c;
        gftb.check(egvc0);
        return egvc0;
    }
}

