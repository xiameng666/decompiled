import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
import j..util.Objects;

public final class fmsk implements TextWatcher {
    final ComposeBoxView a;

    public fmsk(ComposeBoxView composeBoxView0) {
        Objects.requireNonNull(composeBoxView0);
        this.a = composeBoxView0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        int v = TextUtils.isEmpty(editable0);
        ComposeBoxView composeBoxView0 = this.a;
        if((v ^ 1) != composeBoxView0.h) {
            composeBoxView0.h = v ^ 1;
            if(v == 0 || !composeBoxView0.i) {
                composeBoxView0.h(((boolean)(v ^ 1)));
            }
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

