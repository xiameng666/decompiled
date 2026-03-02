import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TextView;

public final class aqal extends aqao {
    final TextView A;
    final ViewGroup B;
    final ImageView C;
    final Switch D;
    final Button E;
    public static final int F;
    final ViewGroup t;
    final ImageView u;
    final Switch v;
    final Button w;
    final TextView x;
    final TextView y;
    final TextView z;

    public aqal(ViewGroup viewGroup0) {
        super(viewGroup0, 0x7F0E0167);  // layout:autofill_payments_list_item_with_title_hint
        this.t = (ViewGroup)this.a.findViewById(0x7F0B227A);  // id:text_item_container
        this.u = (ImageView)this.a.findViewById(0x1020007);
        this.v = (Switch)this.a.findViewById(0x7F0B22D3);  // id:toggle1
        this.w = (Button)this.a.findViewById(0x7F0B0D7E);  // id:button1
        this.x = (TextView)this.a.findViewById(0x1020014);
        this.y = (TextView)this.a.findViewById(0x1020015);
        this.A = (TextView)this.a.findViewById(0x7F0B177D);  // id:item_tag_text_view
        this.z = (TextView)this.a.findViewById(0x7F0B22C6);  // id:title_hint
        this.B = (ViewGroup)this.a.findViewById(0x7F0B16ED);  // id:image_item_container
        this.C = (ImageView)this.a.findViewById(0x1020008);
        this.D = (Switch)this.a.findViewById(0x7F0B22D4);  // id:toggle2
        this.E = (Button)this.a.findViewById(0x7F0B0D7F);  // id:button2
    }

    @Override  // aqao
    public final void D(aqan aqan0) {
        if(!(aqan0 instanceof aqah)) {
            throw new IllegalArgumentException("An instance of MaskedCardPaymentsBottomSheetItem is required");
        }
        aqae aqae0 = ((aqah)aqan0).a;
        gfsx gfsx0 = aqae0.a;
        if(gfsx0.i()) {
            CharSequence charSequence0 = (CharSequence)gfsx0.d();
            this.x.setText(charSequence0);
            this.x.setVisibility(0);
        }
        else {
            this.x.setVisibility(8);
        }
        gfsx gfsx1 = aqae0.c;
        if(gfsx1.i()) {
            CharSequence charSequence1 = (CharSequence)gfsx1.d();
            this.y.setText(charSequence1);
            this.y.setVisibility(0);
        }
        else {
            this.y.setVisibility(8);
        }
        TextView textView0 = this.A;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        TextView textView1 = this.z;
        if(textView1 != null) {
            gfsx gfsx2 = aqae0.b;
            if(gfsx2.i()) {
                textView1.setText(((CharSequence)gfsx2.d()));
                textView1.setVisibility(0);
            }
            else {
                textView1.setVisibility(8);
            }
        }
        if(aqae0.e.i()) {
            View view0 = this.a;
            view0.setOnClickListener(new aqai(aqae0));
            view0.setAlpha(1.0f);
            view0.setEnabled(true);
        }
        else {
            this.a.setEnabled(false);
        }
        aqal.E(aqae0.f, this.t, this.u, this.v, this.w);
        aqal.E(aqae0.g, this.B, this.C, this.D, this.E);
    }

    private static final void E(gfsx gfsx0, View view0, ImageView imageView0, Switch switch0, Button button0) {
        view0.setVisibility(0);
        imageView0.setVisibility(8);
        switch0.setVisibility(8);
        button0.setVisibility(8);
        if((gfsx0.g() instanceof aqab)) {
            aqab aqab0 = (aqab)gfsx0.d();
            imageView0.setVisibility(0);
            imageView0.setImageResource(aqab0.a);
            return;
        }
        if((gfsx0.g() instanceof aqad)) {
            aqad aqad0 = (aqad)gfsx0.d();
            switch0.setVisibility(0);
            switch0.setOnCheckedChangeListener(null);
            switch0.setChecked(aqad0.a().booleanValue());
            switch0.setOnCheckedChangeListener(new aqaj(aqad0));
            return;
        }
        if((gfsx0.g() instanceof apzz)) {
            apzz apzz0 = (apzz)gfsx0.d();
            button0.setText(apzz0.a);
            button0.setVisibility(0);
            button0.setOnClickListener(new aqak(apzz0));
            return;
        }
        if((gfsx0.g() instanceof aqac)) {
            aqac aqac0 = (aqac)gfsx0.d();
            imageView0.setVisibility(0);
            imageView0.setImageIcon(aqac0.a(imageView0.getContext()));
            imageView0.setContentDescription(aqac0.b());
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)imageView0.getLayoutParams();
            gftb.check(linearLayout$LayoutParams0);
            linearLayout$LayoutParams0.width = aqac0.a;
            linearLayout$LayoutParams0.height = aqac0.b;
            imageView0.setLayoutParams(linearLayout$LayoutParams0);
            return;
        }
        if((gfsx0.g() instanceof aqaa)) {
            aqaa aqaa0 = (aqaa)gfsx0.d();
            imageView0.setVisibility(0);
            imageView0.setImageIcon(aqaa0.a(imageView0.getContext()));
            imageView0.setContentDescription(aqaa0.b());
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView0.setAdjustViewBounds(true);
            Resources resources0 = imageView0.getResources();
            imageView0.setMaxHeight(resources0.getDimensionPixelSize(0x7F07023E));  // dimen:autofill_list_start_icon_max_size
            imageView0.setMaxWidth(resources0.getDimensionPixelSize(0x7F07023E));  // dimen:autofill_list_start_icon_max_size
            return;
        }
        view0.setVisibility(8);
    }
}

