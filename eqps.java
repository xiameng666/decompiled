import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;

public final class eqps extends du {
    public int a;
    private boolean ag;
    private eqos ah;
    private UiCustomization ai;
    private int aj;
    public int b;
    private int c;
    private boolean d;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        du du0 = this.getParentFragment();
        if((du0 instanceof eqos)) {
            this.ah = (eqos)du0;
            return;
        }
        if(!(context0 instanceof eqos)) {
            throw new RuntimeException("Parent fragment or activity must implement ActionListener.");
        }
        this.ah = (eqos)context0;
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        this.a = bundle1.getInt("primaryActionId");
        this.b = bundle1.getInt("secondaryActionId");
        this.c = bundle1.getInt("illustrationResId");
        this.d = bundle1.getBoolean("adjustIllustrationBounds", false);
        this.ag = bundle1.getBoolean("progressBarEnabled");
        this.ai = (UiCustomization)bundle1.getParcelable("uiCustomization");
        this.aj = bundle1.getInt("uiTheme");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        Context context0 = this.getContext();
        batl.s(context0);
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(context0);
        layoutInflater1.setFactory2(new bagp());
        View view0 = (GlifLayout)layoutInflater1.inflate(0x7F0E09DA, viewGroup0, false);  // layout:smartdevice_d2d_target_glif_fragment
        gaff gaff0 = (gaff)((TemplateLayout)view0).t(gaff.class);
        gafg gafg0 = new gafg(((GlifLayout)view0).getContext());
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafh gafh0 = gafg0.a();
        gafg gafg1 = new gafg(((GlifLayout)view0).getContext());
        gafg1.c = 7;
        gafg1.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
        gafh gafh1 = gafg1.a();
        gaff0.c(gafh0);
        gaff0.d(gafh1);
        eqpc.c(((GlifLayout)view0));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        GlifLayout glifLayout0 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        int v = bundle1.getInt("iconResId");
        xnz xnz0 = (xnz)this.getContext();
        if(v >= 0 && xnz0 != null) {
            eqpc.d(xnz0, glifLayout0, v);
        }
        String s = bundle1.getString("title");
        if(!TextUtils.isEmpty(s)) {
            glifLayout0.b(s);
        }
        glifLayout0.K(bundle1.getCharSequence("description"));
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0CD7);  // id:body
        CharSequence charSequence0 = bundle1.getCharSequence("body");
        if(TextUtils.isEmpty(charSequence0)) {
            textView0.setVisibility(8);
        }
        else {
            textView0.setText(charSequence0);
            textView0.setVisibility(0);
        }
        if(gaec.B(this.getContext())) {
            gaja.a(textView0);
        }
        eqpp eqpp0 = (/* MISSING LAMBDA PARAMETER */) -> this.ah.c(this.a.a, Bundle.EMPTY);
        eqpq eqpq0 = (/* MISSING LAMBDA PARAMETER */) -> this.ah.c(this.a.b, Bundle.EMPTY);
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        if(this.a != 0) {
            gaff0.k.f = eqpp0;
        }
        if(this.b != 0) {
            gaff0.l.f = eqpq0;
        }
        eqps.z(bundle1, gaff0.k, "primaryActionText");
        eqps.z(bundle1, gaff0.l, "secondaryActionText");
        View view1 = view0.findViewById(0x7F0B16D7);  // id:illustration_container
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B16D5);  // id:illustration
        if(imageView0 != null) {
            int v1 = this.c;
            if(v1 > 0) {
                imageView0.setImageResource(v1);
                imageView0.setAdjustViewBounds(this.d);
                view1.setVisibility(0);
                glifLayout0.findViewById(0x7F0B0CD7).setVisibility(8);  // id:body
                glifLayout0.findViewById(0x7F0B0CE2).setVisibility(8);  // id:bold_centered_body
            }
            else {
                view1.setVisibility(8);
            }
            if(this.ag) {
                eqpc.e(glifLayout0, this.aj);
            }
            else {
                glifLayout0.O(false);
            }
            if(xnz0 != null) {
                erpa.a(xnz0.getContainerActivity(), s);
            }
            if(hygx.g()) {
                UiCustomization uiCustomization0 = this.ai;
                if(uiCustomization0 != null) {
                    eqpc.a(uiCustomization0, glifLayout0);
                }
            }
        }
    }

    // Detected as a lambda impl.
    public final void y(int v) {
        this.ah.c(v, Bundle.EMPTY);
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

