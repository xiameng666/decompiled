import android.view.View.OnClickListener;
import android.view.View;
import android.widget.CheckBox;

public final class dxmd implements View.OnClickListener {
    public final dxme a;

    public dxmd(dxme dxme0) {
        this.a = dxme0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CheckBox checkBox0 = (CheckBox)this.a.am.findViewById(0x7F0B00A6);  // id:AutoTopUpSuccessNotification
        if(checkBox0.isChecked()) {
            checkBox0.setChecked(false);
            return;
        }
        checkBox0.setChecked(true);
    }
}

