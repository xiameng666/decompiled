import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;

public final class sjo {
    public Button a;
    public CharSequence b;
    public View.OnClickListener c;
    public boolean d;
    public int e;
    public ColorStateList f;
    public ColorStateList g;
    public ColorStateList h;

    public sjo() {
        this.d = true;
    }

    public final void a() {
        this.a.setText(this.b);
        this.a.setOnClickListener(this.c);
        MaterialButton materialButton0 = (this.a instanceof MaterialButton) ? ((MaterialButton)this.a) : null;
        if(materialButton0 != null && sku.a(materialButton0.getContext())) {
            ColorStateList colorStateList0 = this.f;
            if(colorStateList0 != null) {
                materialButton0.B(colorStateList0);
            }
            ColorStateList colorStateList1 = this.g;
            if(colorStateList1 != null) {
                materialButton0.A(colorStateList1);
            }
            ColorStateList colorStateList2 = this.h;
            if(colorStateList2 != null) {
                materialButton0.setTextColor(colorStateList2);
            }
        }
        else {
            this.a.setTextColor(this.e);
        }
        if(this.b()) {
            this.a.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
    }

    public final boolean b() {
        return this.d && !TextUtils.isEmpty(this.b);
    }
}

