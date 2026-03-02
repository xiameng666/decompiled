import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class bulo extends fyfx {
    public buku ag;
    private buhq ah;

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            Bundle bundle1 = this.requireArguments();
            hftc hftc0 = hftc.a();
            this.ah = (buhq)hfxk.d(bundle1, "filterListBottomSheetDialogFragmentArgs", ((MessageLite)buhq.a), hftc0);
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.cloneInContext(fyhn.a(new ContextThemeWrapper(this.requireContext(), 0x7F160C70))).inflate(0x7F0E03A9, viewGroup0, false);  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
        TextView textView0 = (TextView)view0.findViewById(0x7F0B13DF);  // id:filter_dialog_title
        if(!this.ah.d.isEmpty()) {
            textView0.setText(this.ah.d);
        }
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B1825);  // id:list_items_container
        linearLayout0.removeAllViews();
        for(Object object0: this.ah.c) {
            View view1 = LayoutInflater.from(view0.getContext()).inflate(0x7F0E03AA, linearLayout0, false);  // layout:filter_list_item_view
            TextView textView1 = (TextView)view1.findViewById(0x7F0B13E0);  // id:filter_label
            ImageView imageView0 = (ImageView)view1.findViewById(0x7F0B0EA2);  // id:check_mark
            hiwt hiwt0 = ((hivi)object0).b;
            if(hiwt0 == null) {
                hiwt0 = hiwt.a;
            }
            textView1.setText(hiwt0.b);
            textView1.setTextColor((((hivi)object0).c ? fhbz.b(view0.getContext()) : fhbz.a(view0.getContext())));
            imageView0.setImageResource(0x7F080B54);  // drawable:quantum_gm_ic_done_vd_theme_24
            if(!this.ah.e.isEmpty()) {
                imageView0.setContentDescription(this.ah.e);
            }
            imageView0.setVisibility((((hivi)object0).c ? 0 : 4));
            view1.setOnClickListener(new buln(this, ((hivi)object0)));
            linearLayout0.addView(view1);
        }
        return view0;
    }
}

