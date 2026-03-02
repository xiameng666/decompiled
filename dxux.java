import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j..util.Objects;

final class dxux implements TextWatcher {
    final dxva a;

    public dxux(dxva dxva0) {
        Objects.requireNonNull(dxva0);
        this.a = dxva0;
        super();
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        if(!TextUtils.isEmpty(editable0) && editable0.toString().endsWith("\n")) {
            this.a.G(this.a.aj);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

