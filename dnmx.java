import com.google.android.material.textfield.TextInputEditText;

public final class dnmx implements ibts {
    public final dnnk a;

    public dnmx(dnnk dnnk0) {
        this.a = dnnk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dnnk dnnk0 = this.a;
        TextInputEditText textInputEditText0 = dnnk0.d;
        TextInputEditText textInputEditText1 = null;
        if(textInputEditText0 == null) {
            ibuq.j("nicknameView");
            textInputEditText0 = null;
        }
        if(!((String)object0).equals(String.valueOf(textInputEditText0.getText()))) {
            TextInputEditText textInputEditText2 = dnnk0.d;
            if(textInputEditText2 == null) {
                ibuq.j("nicknameView");
            }
            else {
                textInputEditText1 = textInputEditText2;
            }
            textInputEditText1.setText(((String)object0));
        }
        return ibom.a;
    }
}

