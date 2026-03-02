import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import com.google.android.material.button.MaterialButton;

public final class fmyu extends LinearLayout implements fmyy {
    public final ContactAvatarView a;
    public final TextView b;
    public final MaterialButton c;
    public final ImageButton d;

    public fmyu(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0x7F040D48);  // attr:textStatusBarStyle
        fmyu.inflate(this.getContext(), 0x7F0E017C, this);  // layout:avatar_status_bar_layout
        this.a = (ContactAvatarView)this.findViewById(0x7F0B0FB2);  // id:contact_avatar
        TextView textView0 = (TextView)this.findViewById(0x7F0B20CE);  // id:status_content
        this.b = textView0;
        MaterialButton materialButton0 = (MaterialButton)this.findViewById(0x7F0B0AC8);  // id:action_button
        this.c = materialButton0;
        this.d = (ImageButton)this.findViewById(0x7F0B122B);  // id:end_icon
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, fmyx.a, 0x7F040D48, 0x7F16035B);  // attr:textStatusBarStyle
        int v = fmrf.d(this.getContext());
        int v1 = typedArray0.getColor((v ? 4 : 5), fyho.b(this, 0x7F0402FC));  // attr:colorOnSurfaceVariant
        int v2 = typedArray0.getColor(v ^ 1, fyho.b(this, 0x7F04030C));  // attr:colorPrimary
        int v3 = fykb.a(0x7F070B4B, this.getContext());  // dimen:m3_sys_elevation_level3
        textView0.setTextColor(v1);
        materialButton0.setTextColor(v2);
        materialButton0.x(ColorStateList.valueOf(fmro.b(v2, 0x40)));
        this.setBackgroundColor(v3);
        typedArray0.recycle();
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        fmyt fmyt0 = new fmyt(((fmyz)object0));
        this.c.setOnClickListener(fmyt0);
    }

    @Override  // android.view.View
    public final void setBackgroundColor(int v) {
        super.setBackgroundColor(v);
        this.c.setBackgroundColor(v);
    }
}

