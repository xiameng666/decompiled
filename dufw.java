import android.view.View.OnClickListener;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.tapandpay.ui.rowsecondary.expand.RowSecondaryExpand;

public final class dufw implements View.OnClickListener {
    public final dugg a;

    public dufw(dugg dugg0) {
        this.a = dugg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dugg dugg0 = this.a;
        if(((RowSecondaryExpand)view0).l) {
            dugg0.au.setVisibility(8);
            return;
        }
        dugg0.au.setVisibility(0);
        dugg.y(((NestedScrollView)dugg0.ar.findViewById(0x7F0B07A9)));  // id:ScrollView
    }
}

