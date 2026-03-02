import android.widget.EditText;

public final class lkr {
    public final EditText a;
    public final lkz b;

    public lkr(EditText editText0) {
        this.a = editText0;
        lkz lkz0 = new lkz(editText0);
        this.b = lkz0;
        editText0.addTextChangedListener(lkz0);
        editText0.setEditableFactory(lks.a());
    }
}

