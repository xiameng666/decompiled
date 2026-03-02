import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
import j..util.Objects;

public final class fmsj implements TextWatcher {
    final ComposeBoxView a;
    final fmsg b;

    public fmsj(ComposeBoxView composeBoxView0, fmsg fmsg0) {
        this.b = fmsg0;
        Objects.requireNonNull(composeBoxView0);
        this.a = composeBoxView0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        if(this.a.g.getText().toString().trim().isEmpty()) {
            return;
        }
        this.b.a(false);
    }
}

