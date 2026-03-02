import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public final class fnyk implements fnyo {
    public final fnzx a;
    public final foaf b;
    public final gfsx c;

    public fnyk(fnzx fnzx0, foaf foaf0, gfsx gfsx0) {
        this.a = fnzx0;
        this.b = foaf0;
        this.c = gfsx0;
    }

    @Override  // fnyo
    public final void a(fnzu fnzu0) {
        fnzx fnzx0 = this.a;
        fnzu0.f = fnzx0;
        fnzu0.getContext();
        fnzu0.x = ((gftm)this.c).a;
        foaf foaf0 = this.b;
        foan foan0 = foaf0.a;
        fnzu0.r = (Button)fnzu0.findViewById(0x7F0B0FF0);  // id:continue_as_button
        fnzu0.s = (Button)fnzu0.findViewById(0x7F0B1F68);  // id:secondary_action_button
        fnzu0.t = new fnxm(fnzu0.s);
        fnzu0.u = new fnxm(fnzu0.r);
        fodo fodo0 = fnzx0.e;
        fodo0.a(fnzu0, 90569);
        fnzu0.b(fodo0);
        fnzu0.d = foan0.h;
        gfsx gfsx0 = foan0.d;
        if(gfsx0.i()) {
            gfsx0.d();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -1);
            frameLayout$LayoutParams0.gravity = 17;
            FrameLayout frameLayout0 = (FrameLayout)fnzu0.findViewById(0x7F0B1372);  // id:express_sign_in_header_logo_container
            Context context0 = fnzu0.getContext();
            ImageView imageView0 = new ImageView(context0);
            imageView0.setImageDrawable(kv.a(context0, (fnxe.d(context0) ? 0x7F08049A : 0x7F080496)));  // drawable:googlelogo_standard_color_74x24_vd
            frameLayout0.addView(imageView0, frameLayout$LayoutParams0);
            frameLayout0.setVisibility(0);
        }
        foaq foaq0 = (foaq)foan0.e.g();
        if(foaq0 != null) {
            fnzu0.A = foaq0;
            fnyt fnyt0 = new fnyt(fnzu0);
            fnzu0.c = true;
            fnzu0.t.a(foaq0.a);
            fnzu0.s.setOnClickListener(fnyt0);
            fnzu0.s.setVisibility(0);
        }
        fnzu0.w = null;
        foai foai0 = (foai)foan0.c.g();
        if(foai0 != null) {
            fnzu0.findViewById(0x7F0B12AD).setVisibility(0);  // id:esi_custom_header_container
            TextView textView0 = (TextView)fnzu0.findViewById(0x7F0B12B0);  // id:esi_custom_header_title
            TextView textView1 = (TextView)fnzu0.findViewById(0x7F0B12AF);  // id:esi_custom_header_subtitle
            textView0.setText(foai0.a);
            fnft.a(textView0);
            gfsx gfsx1 = foai0.b;
            if(gfsx1.i()) {
                textView1.setText(((CharSequence)gfsx1.d()));
            }
            else {
                textView1.setVisibility(8);
            }
        }
        fnzu0.e = foan0.i;
        if(gfsx0.i()) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)fnzu0.l.getLayoutParams();
            viewGroup$MarginLayoutParams0.topMargin = fnzu0.getResources().getDimensionPixelSize(0x7F070D61);  // dimen:og_sign_in_button_with_google_logo_top_margin
            fnzu0.l.requestLayout();
            View view0 = fnzu0.findViewById(0x7F0B12AD);  // id:esi_custom_header_container
            ((ViewGroup.MarginLayoutParams)view0.getLayoutParams()).topMargin = 0;
            view0.requestLayout();
        }
        if(fnzu0.c) {
            ((ViewGroup.MarginLayoutParams)fnzu0.l.getLayoutParams()).bottomMargin = 0;
            fnzu0.l.requestLayout();
            ((ViewGroup.MarginLayoutParams)fnzu0.r.getLayoutParams()).bottomMargin = 0;
            fnzu0.r.requestLayout();
        }
        fnza fnza0 = new fnza(fnzu0, fodo0);
        fnzu0.h.setOnClickListener(fnza0);
        fnid fnid0 = fnid.a().a();
        fnzb fnzb0 = new fnzb(fnzu0);
        fnzu0.k.l(fnzx0.c, fnzx0.f.a, fnid0, fnzb0, "Collapse account list.", "Expand account list.");
        fnzc fnzc0 = new fnzc(fnzu0, fnzx0);
        fnzu0.getContext();
        fnjn fnjn0 = new fnjn(null);
        fnjn0.b(fnzx0.f.a);
        fnjn0.c(fnzx0.b);
        fnjn0.d(fnzx0.c);
        fnjn0.e(fnzx0.d);
        fnjv fnjv0 = new fnjv(fnjn0.a(), fnzc0, new fnzi(fnzu0), fnzu.a(), fodo0, fnzu0.g.c, fnid.a().a(), false);
        Context context1 = fnzu0.getContext();
        fnys fnys0 = new fnys(fnzu0);
        Context context2 = fnzu0.getContext();
        fnwf fnwf0 = fnwd.a(fnzx0.b, fnys0, context2);
        fnxr fnxr0 = new fnxr(context1, (fnwf0 == null ? ggna.a : gged_interceptors.l(fnwf0)), fodo0, fnzu0.g.c);
        fnzu.n(fnzu0.i, fnjv0);
        fnzu.n(fnzu0.j, fnxr0);
        fnzu0.d(fnjv0, fnxr0);
        fnzj fnzj0 = new fnzj(fnzu0, fnjv0, fnxr0);
        fnjv0.A(fnzj0);
        fnxr0.A(fnzj0);
        fnzu0.r.setOnClickListener(new fnzd(fnzu0, fodo0, foaf0, fnzx0));
        fnyq fnyq0 = new fnyq(fnzu0, fodo0, fnzx0, new fnze(fnzu0, foaf0));
        fnzu0.l.setOnClickListener(fnyq0);
        fnzk fnzk0 = new fnzk(fnzu0, fnzx0);
        fnzu0.addOnAttachStateChangeListener(fnzk0);
        fnzl fnzl0 = new fnzl(fnzu0);
        fnzu0.addOnAttachStateChangeListener(fnzl0);
        if(fnzu0.isAttachedToWindow()) {
            fnzk0.onViewAttachedToWindow(fnzu0);
            fnzl0.onViewAttachedToWindow(fnzu0);
        }
        fnzu0.j(false);
    }
}

