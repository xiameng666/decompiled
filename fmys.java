import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

public final class fmys extends LinearLayout implements fmrd {
    public final Switch a;
    private final TextView b;

    public fmys(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        fmys.inflate(this.getContext(), 0x7F0E093B, this);  // layout:settings_page_layout
        Switch switch0 = (Switch)this.findViewById(0x7F0B1E08);  // id:read_receipt_switch_button
        this.a = switch0;
        TextView textView0 = (TextView)this.findViewById(0x7F0B1E07);  // id:read_receipt_description
        this.b = textView0;
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B22D9);  // id:toolbar
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(0x7F0B1FDF);  // id:settings_read_receipt_container
        ProgressBar progressBar0 = (ProgressBar)this.findViewById(0x7F0B1FDE);  // id:settings_progress_bar
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, fmyr.a, 0, 0x7F16049B);  // style:LighterSettingsPageView
        this.setBackgroundResource(typedArray0.getResourceId(0, 0));
        this.setBackgroundColor(fyho.b(this, 0x7F040332));  // attr:colorSurface
        switch0.setTextColor(typedArray0.getColor(2, fyho.b(this, 0x7F0402F7)));  // attr:colorOnSurface
        textView0.setTextColor(typedArray0.getColor(1, fyho.b(this, 0x7F0402FC)));  // attr:colorOnSurfaceVariant
        typedArray0.recycle();
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }
}

