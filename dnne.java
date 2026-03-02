import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class dnne implements TextWatcher {
    final dnnk a;
    final TextInputLayout b;
    final TextInputEditText c;

    public dnne(dnnk dnnk0, TextInputLayout textInputLayout0, TextInputEditText textInputEditText0) {
        this.a = dnnk0;
        this.b = textInputLayout0;
        this.c = textInputEditText0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        ibuq.f(editable0, "s");
        dnnk dnnk0 = this.a;
        dnnk0.B().a(editable0.toString());
        Button button0 = null;
        if(dnnc.a(editable0.toString())) {
            this.b.H(null);
            if(hwev.c()) {
                ComposeActionBar composeActionBar3 = dnnk0.ai;
                if(composeActionBar3 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar3 = null;
                }
                ComposeActionBar composeActionBar4 = dnnk0.ai;
                if(composeActionBar4 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar4 = null;
                }
                ftuw ftuw1 = composeActionBar4.b();
                ComposeActionBar composeActionBar5 = dnnk0.ai;
                if(composeActionBar5 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar5 = null;
                }
                ftts ftts1 = composeActionBar5.b().a;
                if(ftts1 != null) {
                    button0 = ftts.b(ftts1, null, true, null, 0x3FB);
                }
                composeActionBar3.d(ftuw.a(ftuw1, ((ftts)button0), null, false, null, null, false, 0xFE));
            }
            else {
                Button button2 = dnnk0.ah;
                if(button2 == null) {
                    ibuq.j("saveButton");
                }
                else {
                    button0 = button2;
                }
                button0.setEnabled(true);
                button0.setClickable(true);
            }
        }
        else {
            this.b.H("Nickname can\'t include numbers");
            if(hwev.c()) {
                ComposeActionBar composeActionBar0 = dnnk0.ai;
                if(composeActionBar0 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar0 = null;
                }
                ComposeActionBar composeActionBar1 = dnnk0.ai;
                if(composeActionBar1 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar1 = null;
                }
                ftuw ftuw0 = composeActionBar1.b();
                ComposeActionBar composeActionBar2 = dnnk0.ai;
                if(composeActionBar2 == null) {
                    ibuq.j("saveActionBar");
                    composeActionBar2 = null;
                }
                ftts ftts0 = composeActionBar2.b().a;
                if(ftts0 != null) {
                    button0 = ftts.b(ftts0, null, false, null, 0x3FB);
                }
                composeActionBar0.d(ftuw.a(ftuw0, ((ftts)button0), null, false, null, null, false, 0xFE));
            }
            else {
                Button button1 = dnnk0.ah;
                if(button1 == null) {
                    ibuq.j("saveButton");
                }
                else {
                    button0 = button1;
                }
                button0.setEnabled(false);
                button0.setClickable(false);
            }
        }
        if(!TextUtils.isEmpty(editable0)) {
            this.b.E(2);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        ibuq.f(charSequence0, "s");
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        ibuq.f(charSequence0, "s");
    }
}

