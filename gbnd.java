import android.widget.AutoCompleteTextView.OnDismissListener;
import j..util.Objects;
import java.util.ArrayList;

final class gbnd implements AutoCompleteTextView.OnDismissListener {
    final gbne a;

    public gbnd(gbne gbne0) {
        Objects.requireNonNull(gbne0);
        this.a = gbne0;
        super();
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        gbne gbne0 = this.a;
        ArrayList arrayList0 = gbne0.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AutoCompleteTextView.OnDismissListener)arrayList0.get(v1)).onDismiss();
        }
        AutoCompleteTextView.OnDismissListener autoCompleteTextView$OnDismissListener0 = gbne0.b;
        if(autoCompleteTextView$OnDismissListener0 != null) {
            autoCompleteTextView$OnDismissListener0.onDismiss();
        }
    }
}

