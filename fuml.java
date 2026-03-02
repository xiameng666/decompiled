import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public class fuml extends ConstraintLayout {
    private final TextView h;
    public ImageView i;
    public boolean j;
    private final TextView k;

    public fuml(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public fuml(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public fuml(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E08DC, this);  // layout:row_secondary
        View view0 = this.findViewById(0x7F0B08C5);  // id:TitleText
        ibuq.e(view0, "findViewById(...)");
        this.h = (TextView)view0;
        View view1 = this.findViewById(0x7F0B0857);  // id:SubtitleText
        ibuq.e(view1, "findViewById(...)");
        this.k = (TextView)view1;
        View view2 = this.findViewById(0x7F0B0823);  // id:StartIcon
        ibuq.e(view2, "findViewById(...)");
        this.i = (ImageView)view2;
        this.setImportantForAccessibility(1);
        Integer integer0 = context0.getResources().getDimensionPixelSize(0x7F070FD9);  // dimen:row_secondary_vertical_spacing
        funy.f(this, null, integer0, null, integer0, 5);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, fumk.a, 0, 0);
        String s = typedArray0.getString(1);
        if(s != null) {
            this.o(s);
        }
        String s1 = typedArray0.getString(0);
        if(s1 != null) {
            fuml.p(this, s1);
        }
    }

    public fuml(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final fuml h(CharSequence charSequence0) {
        ibuq.f(charSequence0, "subtitle");
        fuml.p(this, charSequence0);
        return this;
    }

    public final void i() {
        float f1;
        ImageView imageView0 = this.i;
        float f = imageView0.getTranslationX();
        if(this.j) {
            f1 = (float)imageView0.getResources().getDimensionPixelSize(0x7F07115D);  // dimen:start_icon_layout_large_marginStart
            if(this.ml()) {
                f1 = -f1;
            }
        }
        else {
            f1 = 0.0f;
        }
        imageView0.setTranslationX(f1);
        if(f == imageView0.getTranslationX()) {
            return;
        }
        imageView0.requestLayout();
    }

    public static void j(fuml fuml0, String s) {
        fuml0.m(s, null, true);
    }

    public final void k(CharSequence charSequence0) {
        ibuq.f(charSequence0, "title");
        this.o(charSequence0);
    }

    public static void l(fuml fuml0, int v) {
        String s = fuml0.getResources().getString(v);
        ibuq.e(s, "getString(...)");
        fuml0.o(s);
    }

    public final void m(String s, String s1, boolean z) {
        ibuq.f(s, "subtitle");
        TextView textView0 = this.k;
        funx.d(textView0, ftrm.f(s, z));
        if(s1 != null) {
            textView0.setContentDescription(s1);
        }
    }

    public final void n(CharSequence charSequence0, CharSequence charSequence1) {
        ibuq.f(charSequence0, "subtitle");
        TextView textView0 = this.k;
        funx.d(textView0, charSequence0);
        if(charSequence1 != null) {
            textView0.setContentDescription(charSequence1);
        }
    }

    public final void o(CharSequence charSequence0) {
        ibuq.f(charSequence0, "title");
        funx.d(this.h, charSequence0);
    }

    @Override  // android.view.View
    public final void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        this.i();
    }

    public static void p(fuml fuml0, CharSequence charSequence0) {
        fuml0.n(charSequence0, null);
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        funy.d(this);
    }
}

