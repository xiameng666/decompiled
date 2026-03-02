import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

public class pf extends EditText {
    private final ow a;
    private final qg b;
    private final pg c;
    private pe d;
    private qf e;

    public pf(Context context0) {
        this(context0, null);
    }

    public pf(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F0404A1);  // attr:editTextStyle
    }

    public pf(Context context0, AttributeSet attributeSet0, int v) {
        wf.a(context0);
        super(context0, attributeSet0, v);
        wd.d(this, this.getContext());
        ow ow0 = new ow(this);
        this.a = ow0;
        ow0.b(attributeSet0, v);
        qg qg0 = new qg(this);
        this.b = qg0;
        qg0.c(attributeSet0, v);
        qg0.a();
        pg pg0 = new pg(this);
        this.c = pg0;
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

    private final pe c() {
        if(this.d == null) {
            this.d = new pe(this);
        }
        return this.d;
    }

    @Override  // android.widget.TextView
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ow ow0 = this.a;
        if(ow0 != null) {
            ow0.a();
        }
        qg qg0 = this.b;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback actionMode$Callback0 = super.getCustomSelectionActionModeCallback();
        kim.f(actionMode$Callback0);
        return actionMode$Callback0;
    }

    @Override  // android.widget.TextView
    public final String getFontVariationSettings() {
        return this.ko().b;
    }

    @Override  // android.widget.EditText
    public final CharSequence getText() {
        return this.getText();
    }

    @Override  // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return this.c().a.super.getTextClassifier();
    }

    @Override  // android.widget.TextView
    public final Typeface getTypeface() {
        return this.ko().a;
    }

    final qf ko() {
        if(this.e == null) {
            this.e = new qf(this, new pd(this));
        }
        return this.e;
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        pi.a(inputConnection0, editorInfo0, this);
        return this.c.d(inputConnection0);
    }

    @Override  // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override  // android.view.View
    public final void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        ow ow0 = this.a;
        if(ow0 != null) {
            ow0.e();
        }
    }

    @Override  // android.view.View
    public final void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        ow ow0 = this.a;
        if(ow0 != null) {
            ow0.c(v);
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        qg qg0 = this.b;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        qg qg0 = this.b;
        if(qg0 != null) {
            qg0.a();
        }
    }

    @Override  // android.widget.TextView
    public final boolean setFontVariationSettings(String s) {
        return this.ko().b(s);
    }

    @Override  // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener0) {
        super.setKeyListener(pg.c(keyListener0));
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        qg qg0 = this.b;
        if(qg0 != null) {
            qg0.d(context0, v);
        }
    }

    @Override  // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier0) {
        this.c().a.super.setTextClassifier(textClassifier0);
    }

    @Override  // android.widget.TextView
    public final void setTypeface(Typeface typeface0) {
        this.ko().a(typeface0);
    }
}

