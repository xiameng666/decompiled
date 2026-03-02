import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

final class pg {
    private final EditText a;
    private final lkr b;

    public pg(EditText editText0) {
        this.a = editText0;
        this.b = new lkr(editText0);
    }

    final void a(AttributeSet attributeSet0, int v) {
        boolean z = true;
        TypedArray typedArray0 = this.a.getContext().obtainStyledAttributes(attributeSet0, ku.i, v, 0);
        try {
            if(typedArray0.hasValue(14)) {
                z = typedArray0.getBoolean(14, true);
            }
        }
        finally {
            typedArray0.recycle();
        }
        lkz lkz0 = this.b.b;
        if(lkz0.a != z) {
            lkz0.a = z;
            if(z) {
                lkm.a();
                throw null;
            }
        }
    }

    static final boolean b(KeyListener keyListener0) {
        return !(keyListener0 instanceof NumberKeyListener);
    }

    static final KeyListener c(KeyListener keyListener0) {
        if(pg.b(keyListener0) && !(keyListener0 instanceof lku)) {
            if(keyListener0 == null) {
                return null;
            }
            if(!(keyListener0 instanceof NumberKeyListener)) {
                return new lku(keyListener0);
            }
        }
        return keyListener0;
    }

    final InputConnection d(InputConnection inputConnection0) {
        if(inputConnection0 == null) {
            return null;
        }
        return !(inputConnection0 instanceof lkt) ? new lkt(this.b.a, inputConnection0) : inputConnection0;
    }
}

