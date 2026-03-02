import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;

public final class ehjb extends FrameLayout {
    public ImageView a;
    public Long b;
    public BitmapDrawable c;
    public ehja d;
    public boolean e;
    private static final int[] f;
    private TextView g;
    private ImageView h;
    private GradientDrawable i;
    private final float j;

    static {
        ehjb.f = new int[]{0x7F060BDC, 0x7F060C8D, 0x7F060C9B, 0x7F060B66, 0x7F060C09, 0x7F060BC0, 0x7F060C17, 0x7F060B4A, 0x7F060CAF, 0x7F060BCE, 0x7F060C25, 0x7F060C33, 0x7F060CEC, 0x7F060BEA, 0x7F060C4B, 0x7F060B58, 0x7F060B3F, 0x7F060BF8, 0x7F060B34};  // color:material_google_red_500
    }

    public ehjb(Context context0) {
        super(context0);
        this.j = 0.666667f;
        if(this.g == null) {
            TextView textView0 = new TextView(this.getContext());
            this.g = textView0;
            textView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.g.setGravity(17);
            this.g.setTextColor(-1);
            GradientDrawable gradientDrawable0 = new GradientDrawable();
            this.i = gradientDrawable0;
            this.g.setBackgroundDrawable(gradientDrawable0);
            this.g.setImportantForAccessibility(2);
            this.addView(this.g);
        }
        if(this.h == null) {
            ImageView imageView0 = new ImageView(this.getContext());
            this.h = imageView0;
            imageView0.setImageResource(0x7F080DA0);
            this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.h.setVisibility(8);
            this.h.setBackgroundDrawable(this.i);
            this.addView(this.h);
        }
        if(this.a == null) {
            ImageView imageView1 = new ImageView(this.getContext());
            this.a = imageView1;
            imageView1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.setVisibility(8);
            this.addView(this.a);
        }
    }

    public final void a() {
        if(this.d != null) {
            this.d = null;
        }
    }

    public final void b(String s) {
        CharSequence charSequence0 = null;
        String s1 = s == null ? null : s.trim();
        int v = 0;
        if(!TextUtils.isEmpty(s1) && Character.isLetter(s1.codePointAt(0))) {
            charSequence0 = s1.substring(0, 1).toUpperCase();
        }
        this.g.setText(charSequence0);
        if(s != null) {
            v = s.hashCode();
        }
        int v1 = v % 19;
        this.i.setColor(this.getResources().getColor(ehjb.f[(v1 >= 0 ? v % 19 : v1 + 19)]));
    }

    public final void c(int v) {
        this.a.setPadding(v, v, v, v);
    }

    public final void d() {
        TextView textView0 = this.g;
        if(textView0 != null) {
            int v = textView0.getText().length();
            int v1 = 0;
            this.g.setVisibility((v <= 0 ? 4 : 0));
            ImageView imageView0 = this.h;
            if(imageView0 != null) {
                if(v > 0) {
                    v1 = 4;
                }
                imageView0.setVisibility(v1);
            }
        }
        ImageView imageView1 = this.a;
        if(imageView1 != null) {
            imageView1.setVisibility(4);
        }
    }

    public final void e() {
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setVisibility(4);
        }
        ImageView imageView0 = this.h;
        if(imageView0 != null) {
            imageView0.setVisibility(4);
        }
        ImageView imageView1 = this.a;
        if(imageView1 != null) {
            imageView1.setVisibility(0);
        }
    }

    public final void f() {
        if(!this.e) {
            this.a();
            this.c = null;
            this.e = true;
            this.i.setShape(1);
        }
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setTextSize(0, ((float)v2) * this.j);
        }
        super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(v2, 0x40000000));
        ImageView imageView0 = this.h;
        if(imageView0 != null) {
            float f = (float)imageView0.getMeasuredWidth();
            float f1 = (float)this.h.getMeasuredHeight();
            int v3 = (int)(f * (1.0f - this.j) / 2.0f);
            int v4 = (int)(f1 * (1.0f - this.j) / 2.0f);
            this.h.setPadding(v3, v4, v3, v4);
        }
    }
}

