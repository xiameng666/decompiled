import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class oy extends CheckedTextView {
    private final oz a;
    private final ow b;
    private final qg c;
    private ph d;

    public oy(Context context0) {
        this(context0, null);
    }

    public oy(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F04023F);  // attr:checkedTextViewStyle
    }

    public oy(Context context0, AttributeSet attributeSet0, int v) {
        wf.a(context0);
        super(context0, attributeSet0, v);
        wd.d(this, this.getContext());
        qg qg0 = new qg(this);
        this.c = qg0;
        qg0.c(attributeSet0, v);
        qg0.a();
        ow ow0 = new ow(this);
        this.b = ow0;
        ow0.b(attributeSet0, v);
        oz oz0 = new oz(this);
        this.a = oz0;
        oz0.b(attributeSet0, v);
        this.a().a(attributeSet0, v);
    }

    private final ph a() {
        if(this.d == null) {
            this.d = new ph(this);
        }
        return this.d;
    }

    @Override  // android.widget.CheckedTextView
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.a();
        }
        ow ow0 = this.b;
        if(ow0 != null) {
            ow0.a();
        }
        oz oz0 = this.a;
        if(oz0 != null) {
            oz0.a();
        }
    }

    @Override  // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback actionMode$Callback0 = super.getCustomSelectionActionModeCallback();
        kim.f(actionMode$Callback0);
        return actionMode$Callback0;
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        pi.a(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.a();
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

    @Override  // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int v) {
        this.setCheckMarkDrawable(kv.a(this.getContext(), v));
    }

    @Override  // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable0) {
        super.setCheckMarkDrawable(drawable0);
        oz oz0 = this.a;
        if(oz0 != null) {
            if(oz0.a) {
                oz0.a = false;
                return;
            }
            oz0.a = true;
            oz0.a();
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

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        qg qg0 = this.c;
        if(qg0 != null) {
            qg0.d(context0, v);
        }
    }
}

