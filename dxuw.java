import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;

public final class dxuw implements View.OnClickListener {
    public final EditText a;

    public dxuw(EditText editText0) {
        this.a = editText0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.getText().clear();
    }
}

