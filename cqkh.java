import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.google.android.gms.mdm.settings.DropdownMenuPreference;

public final class cqkh implements AdapterView.OnItemClickListener {
    public final DropdownMenuPreference a;

    public cqkh(DropdownMenuPreference dropdownMenuPreference0) {
        this.a = dropdownMenuPreference0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a.b = v;
        cqni cqni0 = this.a.c;
        if(cqni0 != null) {
            cqni0.a.M();
        }
    }
}

