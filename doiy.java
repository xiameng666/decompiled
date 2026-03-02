import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.passlistitem.ComposePassListItem;
import com.google.android.material.card.MaterialCardView;
import dagger.internal.Preconditions;

public final class doiy extends uq {
    public ImageView A;
    public TextView B;
    public View C;
    public ComposePassListItem D;
    public dsor E;
    private boolean F;
    public static final bboh t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public View y;
    public ImageView z;

    static {
        doiy.t = bboh.b("Pay", bbcu.cZ);
    }

    public doiy(View view0) {
        ibuq.f(view0, "view");
        super(view0);
        if(hwgz.h()) {
            ComposePassListItem composePassListItem0 = (ComposePassListItem)view0.findViewById(0x7F0B03CD);  // id:ExpiredPassListItem
            ibuq.f(composePassListItem0, "<set-?>");
            this.D = composePassListItem0;
            if(hwev.c()) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.J().getLayoutParams();
                ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int v = funy.a(4);
                int v1 = funy.a(4);
                int v2 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart();
                int v3 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginEnd();
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(v2);
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v;
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginEnd(v3);
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin = v1;
                this.J().setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            }
            Context context0 = this.J().getContext();
            ibuq.e(context0, "getContext(...)");
            if(this.F) {
                return;
            }
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            dolg dolg0 = dolh.a(context0);
            Preconditions.b(dolg0);
            new doiv(domv0, dolg0, new done()).inject(this);
            this.F = true;
            return;
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B04EA);  // id:ItemTitleTextView
        ibuq.f(textView0, "<set-?>");
        this.u = textView0;
        TextView textView1 = (TextView)view0.findViewById(0x7F0B04E8);  // id:ItemSubtitleTextView
        ibuq.f(textView1, "<set-?>");
        this.v = textView1;
        TextView textView2 = (TextView)view0.findViewById(0x7F0B04E9);  // id:ItemTertiaryTitleTextView
        ibuq.f(textView2, "<set-?>");
        this.w = textView2;
        this.z = (ImageView)view0.findViewById(0x7F0B0549);  // id:Logo
        View view1 = view0.findViewById(0x7F0B014F);  // id:CardBackgroundColor
        ibuq.f(view1, "<set-?>");
        this.x = view1;
        this.A = (ImageView)view0.findViewById(0x7F0B0814);  // id:SourceIcon
        this.B = (TextView)view0.findViewById(0x7F0B0462);  // id:GroupValuableBadge
        View view2 = view0.findViewById(0x7F0B0645);  // id:PassListLoadingItem
        ibuq.f(view2, "<set-?>");
        this.C = view2;
        View view3 = view0.findViewById(0x7F0B089E);  // id:TextPillCard
        ibuq.f(view3, "<set-?>");
        this.y = view3;
    }

    public final View D() {
        View view0 = this.x;
        if(view0 != null) {
            return view0;
        }
        ibuq.j("cardBackground");
        return null;
    }

    public final View E() {
        View view0 = this.C;
        if(view0 != null) {
            return view0;
        }
        ibuq.j("shimmerLoader");
        return null;
    }

    public final View F() {
        View view0 = this.y;
        if(view0 != null) {
            return view0;
        }
        ibuq.j("textPillCard");
        return null;
    }

    public final TextView G() {
        TextView textView0 = this.u;
        if(textView0 != null) {
            return textView0;
        }
        ibuq.j("label");
        return null;
    }

    public final TextView H() {
        TextView textView0 = this.v;
        if(textView0 != null) {
            return textView0;
        }
        ibuq.j("subLabel");
        return null;
    }

    public final TextView I() {
        TextView textView0 = this.w;
        if(textView0 != null) {
            return textView0;
        }
        ibuq.j("tertiaryLabel");
        return null;
    }

    public final ComposePassListItem J() {
        ComposePassListItem composePassListItem0 = this.D;
        if(composePassListItem0 != null) {
            return composePassListItem0;
        }
        ibuq.j("passListItem");
        return null;
    }

    public final void K() {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, null, false, null, 0x7FF7));
            return;
        }
        this.H().setVisibility(8);
    }

    public final void L() {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, null, false, null, 0x7FEF));
            return;
        }
        this.I().setVisibility(8);
    }

    public final void M() {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, null, false, null, 0x7F7F));
            return;
        }
        ImageView imageView0 = this.A;
        if(imageView0 == null) {
            ibuq.j("sourceIcon");
            imageView0 = null;
        }
        imageView0.setVisibility(8);
    }

    public final void N(efmo efmo0, Bitmap bitmap0, String s) {
        this.O(efmo0, null, bitmap0, s, 0, efmo0.b());
    }

    public final void O(efmo efmo0, String s, Bitmap bitmap0, String s1, int v, Drawable drawable0) {
        frxu frxu0;
        if(hwgz.h()) {
            ComposePassListItem composePassListItem0 = this.J();
            ftyi ftyi0 = this.J().a();
            fuaw fuaw0 = fuaw.d;
            if(bitmap0 != null) {
                frxu0 = new frxu(bitmap0);
            }
            else if(s == null) {
                frxu0 = new frxu(this.ad(s1));
            }
            else {
                frxu0 = new fryj(s, null, new fryg(null, new frxw(this.ad(s1)), null, null, 27), null, 10);
            }
            composePassListItem0.b(ftyi.a(ftyi0, new fuaz(frxu0, null, null, fuaw0, 22), null, null, null, null, null, null, false, null, 0x7FFE));
            return;
        }
        ImageView imageView0 = this.z;
        ImageView imageView1 = null;
        if(imageView0 == null) {
            ibuq.j("logo");
            imageView0 = null;
        }
        imageView0.setVisibility(0);
        ImageView imageView2 = this.z;
        if(imageView2 == null) {
            ibuq.j("logo");
        }
        else {
            imageView1 = imageView2;
        }
        efmn efmn0 = new efmn(efmo0, imageView1);
        if(v > 0) {
            efmn0.f = gfsx.m(Integer.valueOf(v));
        }
        if(s != null && s.length() != 0) {
            efmn0.c = s;
        }
        if(bitmap0 != null) {
            efmn0.e = gfsx.m(bitmap0);
        }
        efmn0.j = drawable0;
        efmn0.d(s1);
        efmn0.b();
    }

    public final void P(int v) {
        if(hwgz.h()) {
            if(hwev.c()) {
                return;
            }
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, new frxp(v), false, null, 0x7EFF));
            return;
        }
        Context context0 = this.a.getContext();
        this.S(v);
        ibuq.c(context0);
        if(ednb.d(context0, v)) {
            View view0 = this.D();
            ibuq.d(view0, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            ((MaterialCardView)view0).H(context0.getResources().getDimensionPixelSize(0x7F0714E2));  // dimen:wallet_pass_list_stroke_width
            ((MaterialCardView)view0).G(fipx.a(context0, 0x7F040345));  // attr:colorSurfaceVariant
            return;
        }
        View view1 = this.D();
        ibuq.d(view1, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        ((MaterialCardView)view1).H(0);
    }

    public final void Q(Drawable drawable0) {
        if(hwgz.h()) {
            if(drawable0 != null) {
                this.J().b(ftyi.a(this.J().a(), new fuax(new fujl(new frxu(jxv.b(drawable0, 0, 0, 7)), null, null, null, false, null, false, 0xFE)), null, null, null, null, null, null, false, null, 0x7FFE));
            }
        }
        else if(drawable0 != null) {
            ImageView imageView0 = this.z;
            ImageView imageView1 = null;
            if(imageView0 == null) {
                ibuq.j("logo");
                imageView0 = null;
            }
            imageView0.setImageDrawable(drawable0);
            ImageView imageView2 = this.z;
            if(imageView2 == null) {
                ibuq.j("logo");
                imageView2 = null;
            }
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageView imageView3 = this.z;
            if(imageView3 == null) {
                ibuq.j("logo");
            }
            else {
                imageView1 = imageView3;
            }
            imageView1.setVisibility(0);
        }
    }

    public final void R(String s) {
        if(hwgz.h()) {
            return;
        }
        ImageView imageView0 = this.z;
        if(imageView0 == null) {
            ibuq.j("logo");
            imageView0 = null;
        }
        imageView0.setContentDescription(s);
    }

    public final void S(int v) {
        if(hwgz.h()) {
            if(hwev.c()) {
                return;
            }
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, new frxp(v), false, null, 0x7EFF));
            return;
        }
        View view0 = this.D();
        ibuq.d(view0, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        Context context0 = this.a.getContext();
        ibuq.e(context0, "getContext(...)");
        int[] arr_v = {v, fipx.a(context0, 0x7F040332)};  // attr:colorSurface
        ((CardView)view0).e(new ColorStateList(new int[][]{new int[]{0x80FBF4C0}, new int[]{0x7F040B40}}, arr_v));  // attr:state_dragged
    }

    public final void T(View.OnClickListener view$OnClickListener0) {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, null, null, null, false, new doiw(view$OnClickListener0, this), 0x3FFF));
            return;
        }
        this.a.setOnClickListener(view$OnClickListener0);
    }

    public final void U(String s) {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, (s == null ? null : new fryu(s)), null, null, null, null, false, null, 0x7FF7));
            return;
        }
        this.H().setText(s);
        this.H().setVisibility((s == null || s.length() == 0 ? 8 : 0));
    }

    public final void V(int v) {
        if(hwgz.h()) {
            return;
        }
        this.H().setTextColor(v);
    }

    public final void W(String s) {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, (s == null ? null : new fryu(s)), null, null, null, false, null, 0x7FEF));
            return;
        }
        this.I().setText(s);
        this.I().setVisibility((s == null || s.length() == 0 ? 8 : 0));
    }

    public final void X(String s, int v) {
        this.W(s);
        if(hwgz.h()) {
            return;
        }
        this.I().setTextAppearance(v);
    }

    public final void Y(String s) {
        if(hwgz.h()) {
            if(s == null) {
                return;
            }
            this.J().b(ftyi.a(this.J().a(), null, new ftym(new fryu(s)), null, null, null, null, null, false, null, 0x7FFB));
            return;
        }
        this.G().setText(s);
    }

    public final void Z(int v) {
        if(hwgz.h()) {
            return;
        }
        this.G().setTextColor(v);
    }

    public final boolean aa(gufa gufa0) {
        ibuq.f(gufa0, "localIcon");
        int v = dsoa.a(gufa0);
        if(v == 0) {
            ((ggtj)doiy.t.j()).B("Skipping unrecognized local icon: %s", gufa0.name());
            return false;
        }
        try {
            if(hwgz.h()) {
                this.J().b(ftyi.a(this.J().a(), new fuaz(new fryh(v), null, null, fuaw.d, 22), null, null, null, null, null, null, false, null, 0x7FFE));
                return true;
            }
            ImageView imageView0 = null;
            ImageView imageView1 = this.z;
            if(imageView1 == null) {
                ibuq.j("logo");
                imageView1 = null;
            }
            imageView1.setImageResource(v);
            ImageView imageView2 = this.z;
            if(imageView2 == null) {
                ibuq.j("logo");
            }
            else {
                imageView0 = imageView2;
            }
            imageView0.setVisibility(0);
            return true;
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            ((ggtj)((ggtj)doiy.t.i()).s(resources$NotFoundException0)).z("Failed to set image resource ID: %s", v);
            return false;
        }
    }

    public final void ab() {
        if(hwgz.h()) {
            this.J().b(ftyi.a(this.J().a(), null, null, null, null, ftxs.b, null, null, false, null, 0x7FBF));
            return;
        }
        ImageView imageView0 = this.z;
        if(imageView0 == null) {
            ibuq.j("logo");
            imageView0 = null;
        }
        imageView0.setImageAlpha(0x80);
    }

    public final void ac(int v, int v1) {
        ftyj ftyj0 = null;
        if(hwgz.h()) {
            ComposePassListItem composePassListItem0 = this.J();
            ftyi ftyi0 = this.J().a();
            if(v != 0) {
                ftyj0 = new ftyj(new fryh(v));
            }
            composePassListItem0.b(ftyi.a(ftyi0, null, null, null, null, null, ftyj0, null, false, null, 0x7F7F));
            return;
        }
        ImageView imageView0 = this.A;
        if(imageView0 == null) {
            ibuq.j("sourceIcon");
            imageView0 = null;
        }
        imageView0.setBackgroundTintList(ColorStateList.valueOf(v1));
        ImageView imageView1 = this.A;
        if(imageView1 == null) {
            ibuq.j("sourceIcon");
            imageView1 = null;
        }
        imageView1.setImageResource(v);
        ImageView imageView2 = this.A;
        if(imageView2 == null) {
            ibuq.j("sourceIcon");
            imageView2 = null;
        }
        imageView2.setContentDescription(null);
        ImageView imageView3 = this.A;
        if(imageView3 == null) {
            ibuq.j("sourceIcon");
        }
        else {
            ftyj0 = imageView3;
        }
        ((ImageView)ftyj0).setVisibility((v == 0 ? 8 : 0));
    }

    private final Bitmap ad(String s) {
        efmj efmj0 = new efmj(this.J().getResources(), s);
        int v = funy.a((hwev.c() ? 72 : 0x40));
        Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        efmj0.setBounds(0, 0, v, v);
        efmj0.draw(canvas0);
        return bitmap0;
    }
}

