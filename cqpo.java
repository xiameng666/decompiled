import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.mdm.settings.SecurityAnswerPreference;
import com.google.android.material.textfield.TextInputLayout;
import j..util.Objects;

public final class cqpo implements TextWatcher {
    final SecurityAnswerPreference a;
    private final TextInputLayout b;

    public cqpo(SecurityAnswerPreference securityAnswerPreference0, TextInputLayout textInputLayout0) {
        Objects.requireNonNull(securityAnswerPreference0);
        this.a = securityAnswerPreference0;
        super();
        this.b = textInputLayout0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        SecurityAnswerPreference securityAnswerPreference0 = this.a;
        String s = editable0.toString();
        if(!securityAnswerPreference0.a.equals(s)) {
            securityAnswerPreference0.a = s;
            securityAnswerPreference0.k(this.b, true);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof cqpo;
    }

    @Override
    public final int hashCode() {
        return 7;
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

