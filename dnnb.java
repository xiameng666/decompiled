import android.text.Editable;
import com.google.android.material.textfield.TextInputEditText;

public final class dnnb implements ibth {
    public final dnnk a;

    public dnnb(dnnk dnnk0) {
        this.a = dnnk0;
    }

    @Override  // ibth
    public final Object a() {
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
            dnnk0.G(String.valueOf(s));
        }
        return ibom.a;
    }
}

