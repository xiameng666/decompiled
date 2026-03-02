import android.view.View.OnClickListener;
import android.view.View;
import android.widget.CheckBox;

public final class bmyo implements View.OnClickListener {
    public final bmyr a;

    public bmyo(bmyr bmyr0) {
        this.a = bmyr0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmyr bmyr0 = this.a;
        if(!bmcn.e) {
            bmyr0.a.l();
            return;
        }
        CheckBox checkBox0 = (CheckBox)bmyr0.b.findViewById(0x7F0B1F10);  // id:save_device_checkbox
        if(checkBox0 != null && checkBox0.isChecked()) {
            bmyr0.a.l();
            return;
        }
        bmyr0.a.m();
    }
}

