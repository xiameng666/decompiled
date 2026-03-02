import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;

public final class epjk extends du {
    public epji a;
    public RecyclerView b;
    public int c;
    private final epjj d;

    public epjk() {
        this.d = new epjj(this);
    }

    public final void A() {
        this.d.a = false;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        boolean z = false;
        View view0 = layoutInflater0.inflate(0x7F0E09BC, viewGroup0, false);  // layout:significant_places_autocomplete_fragment
        if((this.requireContext() instanceof PlacePickerChimeraActivity) || (this.requireContext() instanceof PlacePickerToolbarChimeraActivity)) {
            z = true;
        }
        this.a = new epji(this.requireContext(), z);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1CAD);  // id:place_picker_autocomplete_list
        this.b = recyclerView0;
        epji epji0 = null;
        if(recyclerView0 == null) {
            ibuq.j("recyclerView");
            recyclerView0 = null;
        }
        this.requireContext();
        recyclerView0.ap(new LinearLayoutManager());
        RecyclerView recyclerView1 = this.b;
        if(recyclerView1 == null) {
            ibuq.j("recyclerView");
            recyclerView1 = null;
        }
        epji epji1 = this.a;
        if(epji1 == null) {
            ibuq.j("adapter");
        }
        else {
            epji0 = epji1;
        }
        recyclerView1.an(epji0);
        EditText editText0 = (EditText)((xob)this.requireContext()).findViewById(0x7F0B11E8);  // id:edit_text_enter_address
        if(editText0 != null) {
            editText0.addTextChangedListener(this.d);
        }
        if(z) {
            this.c = Resources.getSystem().getDisplayMetrics().heightPixels;
        }
        return view0;
    }

    public final void y() {
        epji epji0 = null;
        if(this.c != 0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                ibuq.j("recyclerView");
                recyclerView0 = null;
            }
            recyclerView0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        epji epji1 = this.a;
        if(epji1 == null) {
            ibuq.j("adapter");
        }
        else {
            epji0 = epji1;
        }
        epji0.a.a(ibps.a);
    }

    public final void z() {
        this.d.a = true;
    }
}

