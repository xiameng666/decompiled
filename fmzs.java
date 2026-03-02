import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public final class fmzs extends LinearLayout implements fmrd {
    public final MaterialButton a;
    private final TextView b;

    public fmzs(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0x7F040E26);  // attr:unblockStyle
        fmzs.inflate(this.getContext(), 0x7F0E0C0A, this);  // layout:unblock_view_layout
        TextView textView0 = (TextView)this.findViewById(0x7F0B23C2);  // id:unblock_label
        this.b = textView0;
        MaterialButton materialButton0 = (MaterialButton)this.findViewById(0x7F0B23C1);  // id:unblock_button
        this.a = materialButton0;
        this.setElevation(((float)this.getResources().getDimensionPixelSize(0x7F070591)));  // dimen:elevation
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, fmzm.a, 0x7F040E26, 0x7F1604A0);  // attr:unblockStyle
        textView0.setTextAppearance(typedArray0.getResourceId(1, 0x7F16101F));  // style:UnblockLabelText
        int v = typedArray0.getColor(2, fyho.b(this, 0x7F04030C));  // attr:colorPrimary
        materialButton0.setTextColor(v);
        materialButton0.x(ColorStateList.valueOf(fmro.b(v, 0x40)));
        this.setBackgroundResource(typedArray0.getResourceId(0, fyho.b(this, 0x7F04030D)));  // attr:colorPrimaryContainer
        typedArray0.recycle();
    }

    public final void a(String s, boolean z) {
        String s1 = z ? this.getContext().getResources().getString(0x7F15347C, new Object[]{s}) : this.getContext().getResources().getString(0x7F15347D, new Object[]{s});  // string:unblock_and_reported_label "%1$s has been blocked and reported as spam"
        this.b.setText(s1);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }
}

