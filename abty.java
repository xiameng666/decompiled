import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceListFragment;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceWrapper;
import j..util.Objects;

public final class abty extends ArrayAdapter {
    final LayoutInflater a;

    public abty(LicenseSourceListFragment licenseSourceListFragment0, Context context0, LayoutInflater layoutInflater0) {
        this.a = layoutInflater0;
        Objects.requireNonNull(licenseSourceListFragment0);
        super(context0, 0x7F0E0519);  // layout:license_source_list_item
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.a.inflate(0x7F0E0519, viewGroup0, false);  // layout:license_source_list_item
        }
        LicenseSourceWrapper licenseSourceWrapper0 = (LicenseSourceWrapper)this.getItem(v);
        gfuy.e(licenseSourceWrapper0);
        TextView textView0 = (TextView)view0.findViewById(0x1020014);
        gfuy.e(textView0);
        textView0.setText(licenseSourceWrapper0.c);
        TextView textView1 = (TextView)view0.findViewById(0x1020015);
        gfuy.e(textView1);
        textView1.setText(licenseSourceWrapper0.d);
        return view0;
    }
}

