import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class aaet extends aaep {
    public static final int t;
    private final zem u;
    private final Context v;
    private final ViewGroup w;

    @AssistedInject
    public aaet(@Assisted View view0, zem zem0) {
        super(view0);
        this.u = zem0;
        this.v = view0.getContext();
        this.w = (ViewGroup)view0.findViewById(0x7F0B1279);  // id:error_banner
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() != 1) {
            return;
        }
        ViewGroup viewGroup0 = this.w;
        if(hoju.j()) {
            int v = this.v.getColor(0x106000D);
            viewGroup0.setBackgroundColor(v);
            viewGroup0.getChildAt(0).setBackgroundColor(v);
        }
        aaby aaby0 = ((aaeq)aaem0).a;
        TextView textView0 = (TextView)viewGroup0.findViewById(0x7F0B12A4);  // id:error_title
        TextView textView1 = (TextView)viewGroup0.findViewById(0x7F0B12A1);  // id:error_summary
        FadeInImageView fadeInImageView0 = (FadeInImageView)viewGroup0.findViewById(0x7F0B128C);  // id:error_image
        textView0.setText(aaby0.a);
        TextView textView2 = (TextView)viewGroup0.findViewById(0x7F0B127A);  // id:error_button
        textView1.setText(gfta.b(aaby0.b));
        int v1 = 8;
        textView1.setVisibility((gfta.c(aaby0.b) ? 8 : 0));
        textView2.setText(gfta.b(aaby0.c));
        Context context0 = this.v;
        textView2.setTextColor(cchs.a(context0, 0x7F04030C, 0x7F0606C6));  // attr:colorPrimary
        if(!gfta.c(aaby0.c)) {
            v1 = 0;
        }
        textView2.setVisibility(v1);
        kfe.j(textView2, new aaes(this));
        if(((aaeq)aaem0).b != null && (aaby0.e || aaby0.f != null)) {
            viewGroup0.setOnClickListener(new aaer(((aaeq)aaem0), aaby0));
            viewGroup0.setClickable(true);
        }
        else {
            viewGroup0.setOnClickListener(null);
            viewGroup0.setClickable(false);
        }
        aabu.g(this.u, fadeInImageView0, aaby0.b(), aaby0.d);
        int v2 = cchs.a(context0, 0x7F0402FC, 0x7F0607A3);  // attr:colorOnSurfaceVariant
        fadeInImageView0.setImageTintList(ColorStateList.valueOf(v2));
        if(fadeInImageView0.getDrawable() != null) {
            Drawable drawable0 = fadeInImageView0.getDrawable();
            if(hoju.a.b().g()) {
                drawable0 = fadeInImageView0.getDrawable().mutate();
            }
            drawable0.setTint(v2);
        }
        viewGroup0.setFocusable(true);
    }
}

