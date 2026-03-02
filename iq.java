import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

final class iq implements AdapterView.OnItemClickListener {
    final AlertController.RecycleListView a;
    final iu b;
    final ir c;

    public iq(ir ir0, AlertController.RecycleListView alertController$RecycleListView0, iu iu0) {
        this.c = ir0;
        this.a = alertController$RecycleListView0;
        this.b = iu0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ir ir0 = this.c;
        boolean[] arr_z = ir0.w;
        if(arr_z != null) {
            arr_z[v] = this.a.isItemChecked(v);
        }
        DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0 = ir0.A;
        boolean z = this.a.isItemChecked(v);
        dialogInterface$OnMultiChoiceClickListener0.onClick(this.b.b, v, z);
    }
}

