import android.content.Context;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class io extends ArrayAdapter {
    final AlertController.RecycleListView a;
    final ir b;

    public io(ir ir0, Context context0, int v, CharSequence[] arr_charSequence, AlertController.RecycleListView alertController$RecycleListView0) {
        this.b = ir0;
        this.a = alertController$RecycleListView0;
        super(context0, v, 0x1020014, arr_charSequence);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = super.getView(v, view0, viewGroup0);
        boolean[] arr_z = this.b.w;
        if(arr_z != null && arr_z[v]) {
            this.a.setItemChecked(v, true);
        }
        return view1;
    }
}

