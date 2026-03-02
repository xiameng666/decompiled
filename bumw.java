import android.accounts.Account;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.googleone.smui.selection.ItemCell;
import java.util.ArrayList;
import java.util.List;

public final class bumw extends tk {
    public static final bboh a;
    public final tyb e;
    public final List f;
    public final busg g;
    public String h;
    public int i;
    public buku j;
    private final Account k;
    private final bujx l;
    private Drawable m;
    private DisplayMetrics n;
    private static final hfid o;

    static {
        bumw.a = bboh.b("ItemsViewAdapter", bbcu.hd);
        bumw.o = new hfid(null);
    }

    public bumw(String s, tyb tyb0, bujx bujx0, busg busg0) {
        this.f = new ArrayList();
        this.k = new Account(s, "com.google");
        this.l = bujx0;
        this.e = tyb0;
        this.g = busg0;
    }

    // Detected as a lambda impl.
    public final void G(View view0, ItemCell itemCell0) {
        this.I(view0, itemCell0, ((boolean)(this.g.d(itemCell0) ^ 1)));
    }

    private final int H(boolean z) {
        if(z) {
            return 0x7F080E76;  // drawable:selection_indicator_checked
        }
        return this.i == 2 ? 0x7F080E77 : 0x7F080614;  // drawable:selection_indicator_unchecked
    }

    private final void I(View view0, ItemCell itemCell0, boolean z) {
        ((ImageView)kfb.b(view0, 0x7F0B1FAC)).setImageResource(this.H(z));  // id:selection_icon
        int v = fhbz.c(view0.getContext(), 0x7F04033B);  // attr:colorSurfaceContainerHighest
        if(z) {
            view0.setBackgroundColor(v);
        }
        else {
            view0.setBackground(this.m);
        }
        if(this.i == 2) {
            float f = z ? 0.83f : 1.0f;
            ((ImageView)kfb.b(view0, 0x7F0B16B9)).animate().scaleX(f).scaleY(f).start();  // id:icon
            int v1 = z ? 8 : 0;
            ((FrameLayout)kfb.b(view0, 0x7F0B18FF)).setVisibility(v1);  // id:metadata_container
            ((View)kfb.b(view0, 0x7F0B22F0)).setVisibility(v1);  // id:top_gradient
        }
        if(z) {
            this.g.b(itemCell0);
        }
        else {
            this.g.b.a.remove(itemCell0);
            this.g.b.a();
        }
        bukv bukv0 = this.j.a;
        if(bukv0.b.a.isEmpty()) {
            bukv0.N(1);
        }
        else {
            bukv0.N(2);
        }
        bukv0.K();
    }

    private final void J(String s, ImageView imageView0) {
        if(s.isEmpty()) {
            return;
        }
        Uri uri0 = Uri.parse(s);
        uoy uoy0 = (uoy)new uoy().L(new ujr());
        int v = (int)htuh.a.d().c();
        uoy uoy1 = (uoy)uoy0.B(v, v);
        if(bumw.o.i(uri0)) {
            gmbu.t(this.l.a(this.k), new bumv(this, s, uoy1, imageView0), imageView0.getContext().getMainExecutor());
            return;
        }
        this.e.h(uri0.toString()).b(uoy1).k(imageView0);
    }

    private static final Drawable K(Context context0, hiwp hiwp0) {
        return hiwp0 == hiwp.b ? context0.getDrawable(0x7F080D53) : context0.getDrawable(0x7F080D0B);
    }

    @Override  // tk
    public final int b() {
        return this.f.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        int v1;
        ItemCell itemCell0 = (ItemCell)this.f.get(v);
        if(itemCell0 != null && (hiwp.b(itemCell0.a.b) == null ? hiwp.f : hiwp.b(itemCell0.a.b)) == hiwp.c) {
            v1 = 0x7F0E04A8;  // layout:gmail_item_list_view
        }
        else {
            v1 = this.i == 1 ? 0x7F0E0504 : 0x7F0E0503;  // layout:item_list_view_generic
        }
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v1, viewGroup0, false);
        this.m = view0.getBackground();
        this.n = viewGroup0.getResources().getDisplayMetrics();
        return new uq(view0);
    }

    public final void f() {
        this.g.a();
        Bundle bundle0 = new Bundle();
        bundle0.putString("partial_update", "SELECTION_FALSE");
        this.v(0, this.f.size(), bundle0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        View view0 = uq0.a;
        ItemCell itemCell0 = (ItemCell)this.f.get(v);
        if(itemCell0 == null) {
            return;
        }
        hiwq hiwq0 = itemCell0.a;
        int v1 = 0;
        if((hiwp.b(hiwq0.b) == null ? hiwp.f : hiwp.b(hiwq0.b)) == hiwp.c) {
            TextView textView0 = (TextView)kfb.b(view0, 0x7F0B1FB7);  // id:sender_info
            TextView textView1 = (TextView)kfb.b(view0, 0x7F0B11F9);  // id:email_subject
            TextView textView2 = (TextView)kfb.b(view0, 0x7F0B22B3);  // id:timestamp
            textView0.setText((itemCell0.b.e == 11 ? ((hiwd)itemCell0.b.f) : hiwd.a).b);
            textView1.setText(itemCell0.b.h);
            textView2.setText(String.format("%s, %s", (itemCell0.b.i == null ? hiwy.a : itemCell0.b.i).c, itemCell0.b.j));
            hfuo hfuo0 = (itemCell0.b.e == 11 ? ((hiwd)itemCell0.b.f) : hiwd.a).c;
            LinearLayout linearLayout0 = (LinearLayout)kfb.b(view0, 0x7F0B0BFC);  // id:attachments_container
            LinearLayout linearLayout1 = (LinearLayout)kfb.b(view0, 0x7F0B0BFB);  // id:attachment_views
            linearLayout1.removeAllViews();
            int v2 = Math.min((bulm.a(this.n, this.n.widthPixels) >= 599 ? 4 : 2), hfuo0.size());
            for(int v3 = 0; v3 < v2; ++v3) {
                hiwc hiwc0 = (hiwc)hfuo0.get(v3);
                View view1 = LayoutInflater.from(view0.getContext()).inflate(0x7F0E00F6, linearLayout1, false);  // layout:attachment_item_view
                ImageView imageView0 = (ImageView)kfb.b(view1, 0x7F0B0BF7);  // id:attachment_icon
                TextView textView3 = (TextView)kfb.b(view1, 0x7F0B0BF9);  // id:attachment_name
                String s = ghiq.a((hiwc0.c == null ? ghip.a : hiwc0.c)).b;
                if(!s.isEmpty()) {
                    this.e.h(s).k(imageView0);
                }
                textView3.setText(hiwc0.b);
                int v4 = bulm.a(this.n, this.n.widthPixels);
                DisplayMetrics displayMetrics0 = this.n;
                ibuq.f(displayMetrics0, "metrics");
                textView3.setMaxWidth(((int)(((double)(((float)(v4 >= 599 ? v4 - 338 >> 2 : (v4 - 0xE8) / 2)) * displayMetrics0.density)) + 0.5)));
                linearLayout1.addView(view1);
            }
            if(hfuo0.size() > v2) {
                TextView textView4 = (TextView)kfb.b(view0, 0x7F0B192D);  // id:more_attachments_label
                textView4.setText(view0.getContext().getString(0x7F150220, new Object[]{((int)(hfuo0.size() - v2))}));  // string:attachments_additional_count "+%1$d"
                textView4.setVisibility(0);
            }
            if(v2 <= 0) {
                v1 = 8;
            }
            linearLayout0.setVisibility(v1);
        }
        else if(this.i == 1) {
            hiwu hiwu0 = itemCell0.b;
            ImageView imageView1 = (ImageView)kfb.b(view0, 0x7F0B16B9);  // id:icon
            TextView textView5 = (TextView)kfb.b(view0, 0x7F0B22B8);  // id:title
            TextView textView6 = (TextView)kfb.b(view0, 0x7F0B2121);  // id:subtitle
            if((hiwu0.b & 2) == 0) {
                imageView1.setImageDrawable(bumw.K(view0.getContext(), (hiwp.b(hiwq0.b) == null ? hiwp.f : hiwp.b(hiwq0.b))));
            }
            else {
                this.J(ghiq.a((hiwu0.k == null ? ghip.a : hiwu0.k)).b, imageView1);
            }
            textView5.setText(hiwu0.h);
            textView6.setText(String.format("%s, %s", (hiwu0.i == null ? hiwy.a : hiwu0.i).c, hiwu0.j));
        }
        else {
            hiwu hiwu1 = itemCell0.b;
            ImageView imageView2 = (ImageView)kfb.b(view0, 0x7F0B16B9);  // id:icon
            TextView textView7 = (TextView)kfb.b(view0, 0x7F0B22B8);  // id:title
            TextView textView8 = (TextView)kfb.b(view0, 0x7F0B2121);  // id:subtitle
            if((hiwu1.b & 2) == 0) {
                imageView2.setImageDrawable(bumw.K(view0.getContext(), (hiwp.b(hiwq0.b) == null ? hiwp.f : hiwp.b(hiwq0.b))));
            }
            else {
                this.J(ghiq.a((hiwu1.k == null ? ghip.a : hiwu1.k)).b, imageView2);
                ((View)kfb.b(view0, 0x7F0B0CF0)).setVisibility(0);  // id:bottom_dark_gradient
            }
            textView7.setText(hiwu1.h);
            textView8.setText(String.format("%s, %s", (hiwu1.i == null ? hiwy.a : hiwu1.i).c, hiwu1.j));
        }
        ImageView imageView3 = (ImageView)kfb.b(view0, 0x7F0B1FAC);  // id:selection_icon
        boolean z = this.g.d(itemCell0);
        imageView3.setImageResource(this.H(z));
        this.I(view0, itemCell0, z);
        if(!gfta.c(this.h)) {
            imageView3.setContentDescription(this.h);
        }
        imageView3.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> this.I(view0, itemCell0, ((boolean)(this.g.d(itemCell0) ^ 1))));
        view0.setOnLongClickListener(new bums(this, view0, itemCell0));
        view0.setOnClickListener(new bumu(this, itemCell0));
    }

    public final void n(List list0) {
        this.f.clear();
        this.f.addAll(list0);
        this.q();
    }

    @Override  // tk
    public final void z(uq uq0, int v, List list0) {
        View view0 = uq0.a;
        ItemCell itemCell0 = (ItemCell)this.f.get(v);
        if(itemCell0 != null) {
            if(list0.isEmpty()) {
                this.h(uq0, v);
                return;
            }
            String s = ((Bundle)list0.get(0)).getString("partial_update");
            if(s != null) {
                switch(s) {
                    case "SELECTION_FALSE": {
                        this.I(view0, itemCell0, false);
                        return;
                    }
                    case "SELECTION_TRUE": {
                        this.I(view0, itemCell0, true);
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
    }
}

