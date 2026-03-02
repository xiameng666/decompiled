import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class buna extends fyfx {
    public buku ag;
    private buhs ah;

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            Bundle bundle1 = this.requireArguments();
            hftc hftc0 = hftc.a();
            this.ah = (buhs)hfxk.d(bundle1, "sortMenuBottomSheetDialogFragmentArgs", ((MessageLite)buhs.a), hftc0);
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.cloneInContext(fyhn.a(new ContextThemeWrapper(this.requireContext(), 0x7F160C70))).inflate(0x7F0E09FA, viewGroup0, false);  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
        TextView textView0 = (TextView)view0.findViewById(0x7F0B207E);  // id:sort_dialog_title
        if(!this.ah.d.isEmpty()) {
            textView0.setText(this.ah.d);
        }
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B18EE);  // id:menu_items_container
        linearLayout0.removeAllViews();
        for(Object object0: this.ah.c) {
            View view1 = LayoutInflater.from(view0.getContext()).inflate(0x7F0E09FB, linearLayout0, false);  // layout:sort_menu_item_view
            TextView textView1 = (TextView)view1.findViewById(0x7F0B1B66);  // id:option_label
            ImageView imageView0 = (ImageView)view1.findViewById(0x7F0B0EA2);  // id:check_mark
            hiwv hiwv0 = ((hivj)object0).b;
            if(hiwv0 == null) {
                hiwv0 = hiwv.a;
            }
            textView1.setText(hiwv0.c);
            textView1.setTextColor((((hivj)object0).c ? fhbz.b(view0.getContext()) : fhbz.a(view0.getContext())));
            imageView0.setImageResource(0x7F080B54);  // drawable:quantum_gm_ic_done_vd_theme_24
            imageView0.setVisibility((((hivj)object0).c ? 0 : 4));
            if(!this.ah.e.isEmpty()) {
                imageView0.setContentDescription(this.ah.e);
            }
            view1.setOnClickListener(new bumz(this, ((hivj)object0)));
            linearLayout0.addView(view1);
        }
        return view0;
    }
}

