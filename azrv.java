import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

public final class azrv implements AdapterView.OnItemClickListener {
    public final SimpleDialogAccountPickerChimeraActivity a;
    public final iw b;

    public azrv(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0, iw iw0) {
        this.a = simpleDialogAccountPickerChimeraActivity0;
        this.b = iw0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a.p = v;
        this.b.b(-1).setEnabled(true);
    }
}

