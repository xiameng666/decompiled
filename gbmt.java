import android.widget.AutoCompleteTextView.OnDismissListener;
import com.google.android.wallet.bender3.framework.view.dropdown.DropDownAutoCompleteTextView;
import j..util.Objects;
import java.util.ArrayList;

public final class gbmt implements AutoCompleteTextView.OnDismissListener {
    final DropDownAutoCompleteTextView a;

    public gbmt(DropDownAutoCompleteTextView dropDownAutoCompleteTextView0) {
        Objects.requireNonNull(dropDownAutoCompleteTextView0);
        this.a = dropDownAutoCompleteTextView0;
        super();
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        DropDownAutoCompleteTextView dropDownAutoCompleteTextView0 = this.a;
        ArrayList arrayList0 = dropDownAutoCompleteTextView0.f;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((AutoCompleteTextView.OnDismissListener)arrayList0.get(v1)).onDismiss();
        }
        AutoCompleteTextView.OnDismissListener autoCompleteTextView$OnDismissListener0 = dropDownAutoCompleteTextView0.g;
        if(autoCompleteTextView$OnDismissListener0 != null) {
            autoCompleteTextView$OnDismissListener0.onDismiss();
        }
    }
}

