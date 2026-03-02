import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class pk extends MultiAutoCompleteTextView {
    private static final int[] a;
    private final ow b;
    private final qg c;
    private final pg d;

    static {
        pk.a = new int[]{0x1010176};
    }

    public pk(Context context0) {
        this(context0, null);
    }

    public pk(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040155);  // attr:autoCompleteTextViewStyle
    }

    public pk(Context context0, AttributeSet attributeSet0, int v) {
        wf.a(context0);
        super(context0, attributeSet0, v);
        wd.d(this, this.getContext());
        wi wi0 = wi.l(this.getContext(), attributeSet0, pk.a, v, 0);
        if(wi0.q(0)) {
            this.setDropDownBackgroundDrawable(wi0.h(0));
        }
        wi0.o();
        ow ow0 = new ow(this);
        this.b = ow0;
        ow0.b(attributeSet0, v);
        qg qg0 = new qg(this);
        this.c = qg0;
        qg0.c(attributeSet0, v);
        qg0.a();
        pg pg0 = new pg(this);
        this.d = pg0;
        pg0.a(attributeSet0, v);
        KeyListener keyListener0 = this.getKeyListener();
        if(pg.b(keyListener0)) {
            boolean z = super.isFocusable();
            boolean z1 = super.isClickable();
            boolean z2 = super.isLongClickable();
            int v1 = super.getInputType();
            KeyListener keyListener1 = pg.c(keyListener0);
            if(keyListener1 != keyListener0) {
                super.setKeyListener(keyListener1);
                super.setRawInputType(v1);
                super.setFocusable(z);
                super.setClickable(z1);
                super.setLongClickable(z2);
            }
        }
    }

    @Override  // android.widget.TextView
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ow ow0 = this.b;
        if(ow0 != null) {
            ow0.a();
        }
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        pi.a(inputConnection0, editorInfo0, this);
        return this.d.d(inputConnection0);
    }

    @Override  // android.view.View
    public final void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        ow ow0 = this.b;
        if(ow0 != null) {
            ow0.e();
        }
    }

    @Override  // android.view.View
    public final void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        ow ow0 = this.b;
        if(ow0 != null) {
            ow0.c(v);
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int v) {
        this.setDropDownBackgroundDrawable(kv.a(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener0) {
        super.setKeyListener(pg.c(keyListener0));
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.d(context0, v);
        }
    }
}

