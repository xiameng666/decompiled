import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import java.util.List;

public final class ahjz extends ArrayAdapter {
    public ahjz(Context context0, List list0) {
        super(context0, 0x7F0E0036, 0x7F0B1038, list0);  // layout:account_chip_view
    }

    @Override  // android.widget.ArrayAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.getView(v, view0, viewGroup0);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = new AccountChipView(this.getContext());
        }
        Credential credential0 = (Credential)this.getItem(v);
        batl.s(credential0);
        ((AccountChipView)view0).b(ahjd.a(credential0));
        return (AccountChipView)view0;
    }
}

