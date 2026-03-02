import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView.OnDismissListener;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

public class gbne extends ov implements View.OnClickListener, AdapterView.OnItemClickListener {
    public final ArrayList a;
    public AutoCompleteTextView.OnDismissListener b;
    public boolean c;
    public boolean d;
    public boolean e;
    private View.OnClickListener f;
    private int g;
    private final boolean h;

    public gbne(Context context0) {
        super(context0);
        this.a = new ArrayList();
        this.c = true;
        this.d = true;
        this.h = true;
        this.e = false;
    }

    public gbne(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.c = true;
        this.d = true;
        this.h = true;
        this.e = false;
    }

    public gbne(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.c = true;
        this.d = true;
        this.h = true;
        this.e = false;
    }

    public final gbmq a() {
        ListAdapter listAdapter0 = super.getAdapter();
        gftb.b(listAdapter0 instanceof gbmq, "Adapter should be a BaseDropDownAdapter.");
        return (gbmq)listAdapter0;
    }

    public void b() {
        super.setOnClickListener(this);
        this.setOnItemClickListener(this);
        super.setOnDismissListener(new gbnd(this));
    }

    // Detected as a lambda impl.
    protected final void c() {
        if(!this.d && this.getWindowToken() != null && this.enoughToFilter() && this.hasFocus()) {
            this.showDropDown();
            this.setError(null);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    protected final CharSequence convertSelectionToString(Object object0) {
        return this.a().a(object0);
    }

    @Override  // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.c ? this.getText().length() >= this.g : this.getText().length() == 0;
    }

    @Override  // android.widget.TextView
    public final CharSequence getHint() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if((viewParent0 instanceof TextInputLayout)) {
                TextInputLayout textInputLayout0 = (TextInputLayout)viewParent0;
                return textInputLayout0 == null || TextUtils.isEmpty(textInputLayout0.o()) ? super.getHint() : textInputLayout0.o();
            }
        }
        return super.getHint();
    }

    @Override  // android.widget.AutoCompleteTextView
    public final int getThreshold() {
        return this.g;
    }

    @Override  // android.view.View
    public final boolean hasOnClickListeners() {
        return this.f != null;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.c();
        View.OnClickListener view$OnClickListener0 = this.f;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(view0);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.e) {
            this.post(() -> if(!this.d && this.getWindowToken() != null && this.enoughToFilter() && this.hasFocus()) {
                this.showDropDown();
                this.setError(null);
            });
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a().b(view0, v);
    }

    @Override  // android.widget.AutoCompleteTextView
    protected final void performFiltering(CharSequence charSequence0, int v) {
        if(this.h) {
            super.performFiltering(charSequence0, v);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter0) {
        gftb.b((listAdapter0 instanceof gbmq) || listAdapter0 == null, "Parameter adapter should be a BaseDropDownAdapter.");
        super.setAdapter(listAdapter0);
        gbnc gbnc0 = new gbnc(this);
        this.a.add(gbnc0);
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.f = view$OnClickListener0;
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void setOnDismissListener(AutoCompleteTextView.OnDismissListener autoCompleteTextView$OnDismissListener0) {
        this.b = autoCompleteTextView$OnDismissListener0;
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void setThreshold(int v) {
        if(v < 0) {
            v = 0;
        }
        this.g = v;
    }
}

