import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public final class dnmw implements View.OnClickListener {
    public final dnnk a;

    public dnmw(dnnk dnnk0) {
        this.a = dnnk0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dnnk dnnk0 = this.a;
        TextInputEditText textInputEditText0 = dnnk0.d;
        String s = null;
        if(textInputEditText0 == null) {
            ibuq.j("nicknameView");
            textInputEditText0 = null;
        }
        Editable editable0 = textInputEditText0.getText();
        if(editable0 != null) {
            s = editable0.toString();
        }
        if(dnnc.a(s)) {
            ibuq.c(s);
            dnnk0.G(s);
        }
    }
}

