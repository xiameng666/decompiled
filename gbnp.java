import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import j..util.Objects;

public final class gbnp implements TextWatcher {
    int a;
    final TextInputEditText b;
    final gbnr c;

    public gbnp(gbnr gbnr0, TextInputEditText textInputEditText0) {
        this.b = textInputEditText0;
        Objects.requireNonNull(gbnr0);
        this.c = gbnr0;
        super();
        this.a = 0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        gbnr gbnr0 = this.c;
        int v = this.a;
        String s = editable0.toString();
        if(!gbnr0.m) {
            TextInputEditText textInputEditText0 = this.b;
            int v1 = gbnr0.b(textInputEditText0);
            if(s.isEmpty()) {
                gbnr0.U.deleteCharAt(v1);
                gbnr0.l(v1);
            }
            else {
                gbnr0.U.replace(v1, v1 + 1, s);
                gbnr0.o();
                gbnr0.l(v1);
                int v2 = s.length() + v1 < gbnr0.W.size() ? s.length() + v1 : gbnr0.W.size() - 1;
                gbnr0.p(textInputEditText0.isFocused(), v2);
                if(gbnr0.q(v1) || s.length() > 2 && gbnr0.U.length() == gbnr0.W.size()) {
                    v = 1;
                }
                gbnr0.d(v2).setSelection(v);
            }
            gbnr0.g();
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        this.a = this.b.getSelectionStart();
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

