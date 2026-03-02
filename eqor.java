import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public class eqor extends du {
    public eqos a;
    protected gajv b;
    public GlifLayout c;
    private final int d;

    public eqor() {
        this(0x7F0E09E2);  // layout:smartdevice_glif_fragment
    }

    public eqor(int v) {
        this.d = v;
    }

    @Override  // du
    public void onAttach(Context context0) {
        super.onAttach(context0);
        du du0 = this.getParentFragment();
        if(this.d == 0x7F0E09E3) {  // layout:smartdevice_glif_loading_fragment
            if((du0 instanceof gajv)) {
                this.b = (gajv)du0;
                return;
            }
            if(!(context0 instanceof gajv)) {
                throw new IllegalArgumentException("Parent fragment or activity must implement NavigationBarListener.");
            }
            this.b = (gajv)context0;
            return;
        }
        if((du0 instanceof eqos)) {
            this.a = (eqos)du0;
            return;
        }
        if(!(context0 instanceof eqos)) {
            throw new IllegalArgumentException("Parent fragment or activity must implement ActionListener.");
        }
        this.a = (eqos)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        Context context0 = this.getContext();
        if(context0 != null) {
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
        }
        int v = this.d;
        if(v == 0) {
            throw null;
        }
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate(v, viewGroup0, false);
        this.c = glifLayout0;
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        gafg gafg0 = new gafg(this.c.getContext());
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafh gafh0 = gafg0.a();
        gafg gafg1 = new gafg(this.c.getContext());
        gafg1.c = 7;
        gafg1.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
        gafh gafh1 = gafg1.a();
        gaff0.c(gafh0);
        gaff0.d(gafh1);
        eqpc.c(this.c);
        gaie gaie0 = (gaie)this.c.t(gaie.class);
        if(gaie0 != null && v == 0x7F0E09E3) {  // layout:smartdevice_glif_loading_fragment
            gaie0.b(this.b);
            gaie0.a().b.setVisibility(0);
            this.y(layoutInflater0, ((ViewGroup)this.c.findViewById(0x7F0B0FE3)));  // id:content_container
            return this.c;
        }
        if(v != 0x7F0E09E4) {  // layout:smartdevice_glif_recycler_fragment
            this.y(layoutInflater0, ((ViewGroup)this.c.findViewById(0x7F0B0FE3)));  // id:content_container
        }
        return this.c;
    }

    @Override  // du
    public void onViewCreated(View view0, Bundle bundle0) {
        GlifLayout glifLayout0 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        int v = bundle1.getInt("iconResId");
        xnz xnz0 = (xnz)this.getContext();
        if(v > 0 && xnz0 != null) {
            eqpc.d(xnz0, glifLayout0, v);
        }
        String s = bundle1.getString("title");
        if(!TextUtils.isEmpty(s)) {
            glifLayout0.b(s);
        }
        CharSequence charSequence0 = bundle1.getCharSequence("description");
        if(charSequence0 != null) {
            glifLayout0.K(charSequence0);
            Context context0 = this.getContext();
            if(context0 != null && !gaec.B(context0)) {
                TextView textView0 = ((gahu)glifLayout0.t(gahu.class)).a();
                Context context1 = textView0.getContext();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
                if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                    int v1 = (int)context1.getResources().getDimension(0x7F0711AF);  // dimen:sud_description_margin_bottom_extra
                    int v2 = (int)context1.getResources().getDimension(0x7F0711B2);  // dimen:sud_description_margin_top_extra
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin + v2, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin + v1);
                }
            }
        }
        int v3 = bundle1.getInt("primaryActionId");
        int v4 = bundle1.getInt("secondaryActionId");
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        if(v3 != 0) {
            gafh gafh0 = gaff0.k;
            gafh0.f = new eqoo(this, v3);
        }
        if(v4 != 0) {
            gafh gafh1 = gaff0.l;
            gafh1.f = new eqop(this, v4);
        }
        eqor.z(bundle1, gaff0.k, "primaryActionText");
        eqor.z(bundle1, gaff0.l, "secondaryActionText");
        int v5 = bundle1.getInt("illustrationResId");
        boolean z = bundle1.getBoolean("adjustIllustrationBounds", false);
        View view1 = view0.findViewById(0x7F0B16D7);  // id:illustration_container
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B16D5);  // id:illustration
        if(imageView0 != null) {
            if(v5 > 0) {
                imageView0.setImageResource(v5);
                imageView0.setAdjustViewBounds(z);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
                frameLayout$LayoutParams0.gravity = z ? 81 : 17;
                view1.setVisibility(0);
            }
            else {
                view1.setVisibility(8);
            }
            if(xnz0 != null && s != null) {
                erpa.a(xnz0.getContainerActivity(), s);
            }
        }
    }

    public void y(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
    }

    private static final void z(Bundle bundle0, gafh gafh0, String s) {
        String s1 = bundle0.getString(s);
        if(!TextUtils.isEmpty(s1)) {
            gafh0.d(s1);
            gafh0.f(0);
            return;
        }
        gafh0.f(8);
    }
}

