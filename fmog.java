import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.GridLayoutManager;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

@Deprecated
public final class fmog extends LinearLayout {
    final Paint a;
    public int b;
    public int c;
    public boolean d;
    private static final String e = "fmog";
    private final LinearLayout f;
    private final LinearLayout g;
    private boolean h;
    private final Path i;
    private final RectF j;
    private final float k;
    private final float l;
    private int m;

    static {
    }

    public fmog(Context context0) {
        super(fmrf.b(context0, iaea.j()), null, 0);
        this.i = new Path();
        this.j = new RectF();
        this.d = true;
        fmog.inflate(this.getContext(), 0x7F0E0A09, this);  // layout:stack_card_view
        this.f = (LinearLayout)this.findViewById(0x7F0B22E8);  // id:top
        this.g = (LinearLayout)this.findViewById(0x7F0B0CE5);  // id:bottom
        this.k = (float)context0.getResources().getDimensionPixelSize(0x7F070FC4);  // dimen:rich_card_radius
        float f = (float)context0.getResources().getDimensionPixelSize(0x7F070FC6);  // dimen:rich_card_stroke_width
        this.l = f;
        Paint paint0 = new Paint();
        this.a = paint0;
        paint0.setColor(fyho.b(this, 0x7F04030A));  // attr:colorOutlineVariant
        paint0.setStrokeWidth(f);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setAntiAlias(true);
        this.setOrientation(1);
        this.setBackgroundColor(0);
    }

    public final void a(fmmb fmmb0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, AccountContext accountContext0, fmga fmga0) {
        this.h = false;
        gged_interceptors gged0 = fmmb0.a;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmmj fmmj0 = (fmmj)gged0.get(v1);
            switch(fmmj0.a().ordinal()) {
                case 0: {
                    gged_interceptors gged1 = fmmj0.b().a;
                    for(int v2 = 0; v2 < ((ggna)gged1).c; ++v2) {
                        this.c(((fmmo)gged1.get(v2)), fmqf0, fmrq0, fmid0, accountContext0, fmga0);
                    }
                    break;
                }
                case 1: {
                    this.c(fmmj0.c(), fmqf0, fmrq0, fmid0, accountContext0, fmga0);
                }
            }
        }
        gfsx gfsx0 = fmmb0.b;
        if(gfsx0.i()) {
            this.m = fmro.a(this.getContext(), ((float)(((int)(((Integer)gfsx0.d()))))));
        }
    }

    private static int b(int v, int v1) {
        if(v1 > 0) {
            int v2 = View.MeasureSpec.getSize(v);
            int v3 = View.MeasureSpec.getMode(v);
            switch(v3) {
                case 0x80000000: {
                    return View.MeasureSpec.makeMeasureSpec(Math.min(v2, v1), 0x80000000);
                }
                case 0: {
                    return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
                }
                default: {
                    if(v3 != 0x40000000) {
                        flbj.c(fmog.e, "Invalid MeasureSpecMode: " + v3);
                        return v;
                    }
                    return View.MeasureSpec.makeMeasureSpec(Math.min(v2, v1), 0x40000000);
                }
            }
        }
        return v;
    }

    private final void c(fmmo fmmo0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, AccountContext accountContext0, fmga fmga0) {
        int v7;
        View view0;
        fmnm fmnm0;
        if(fmmo0.b().equals(fmmn.h)) {
            this.h = true;
            return;
        }
        LinearLayout linearLayout0 = this.h ? this.g : this.f;
        Context context0 = this.getContext();
        int v = fmmo0.b().ordinal();
        int v1 = 0;
        if(v == 0) {
            view0 = new TextView(context0);
            ((TextView)view0).setFocusable(true);
            int v5 = 0x7F0402F7;  // attr:colorOnSurface
            if(fmmo0.f) {
                switch(fmga0.r) {
                    case 0: {
                        throw null;
                    }
                    case 2: {
                        v5 = 0x7F0402DC;  // attr:colorOnPrimary
                    }
                }
            }
            int v6 = fyho.b(view0, v5);
            SpannableStringBuilder spannableStringBuilder0 = fmrm.b(context0, fmmo0.a.g(), gfsx.m(Integer.valueOf(v6)));
            if(((URLSpan[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), URLSpan.class)).length > 0) {
                ((TextView)view0).setMovementMethod(LinkMovementMethod.getInstance());
            }
            else {
                ((TextView)view0).setAutoLinkMask(1);
            }
            ((TextView)view0).setText(spannableStringBuilder0, TextView.BufferType.SPANNABLE);
        }
        else {
            switch(v) {
                case 2: {
                    view0 = new fmok(context0);
                    ((fmok)view0).setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    ((fmok)view0).a(fmmo0.a.h().a);
                    break;
                }
                case 3: {
                    fmnm0 = new fmnm(context0);
                    int v2 = fmmo0.a.f().c;
                    gfsx gfsx0 = fmmo0.a.f().d;
                    boolean z = gfsx0.i() && ((int)(((Integer)gfsx0.d()))) == 1;
                    fmnl fmnl0 = new fmnl(fmqf0, fmrq0, z);
                    fmol fmol0 = new fmol((v2 == 1 ? 0 : 1), flbb.b(context0) && v2 == 1);
                    fmol0.s(v2 == 1);
                    fmnl0.f(fmmo0.a.f().b);
                    if(!fmnl0.n() && v2 != 0) {
                        fmnm0.setVisibility(0);
                    }
                    else {
                        fmnm0.setVisibility(8);
                    }
                    if(z) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)fmnm0.getLayoutParams();
                        linearLayout$LayoutParams0.width = -1;
                        fmnm0.setLayoutParams(linearLayout$LayoutParams0);
                    }
                    fmnm0.an(fmnl0);
                    fmnm0.ap(fmol0);
                    fmnm0.A(new fmnw(context0.getResources().getDimensionPixelSize((v2 == 1 ? 0x7F070FBF : 0x7F070FC3))));  // dimen:rich_card_button_horizontal_spacing
                    view0 = fmnm0;
                    break;
                }
                case 4: {
                    view0 = new fmmv(context0);
                    ((fmmv)view0).a(fmmo0.a.c());
                    break;
                }
                case 5: {
                    if(iaea.i()) {
                        fmmt fmmt0 = new fmmt(context0);
                        fmms fmms0 = new fmms(fmqf0, fmrq0);
                        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(5);
                        fmms0.f(fmmo0.a.b().a);
                        if(fmms0.n()) {
                            v1 = 8;
                        }
                        fmmt0.setVisibility(v1);
                        fmmt0.an(fmms0);
                        fmmt0.ap(gridLayoutManager0);
                        view0 = fmmt0;
                    }
                    else {
                        fmnm0 = new fmmu(context0);
                        gged_interceptors gged0 = fmmo0.a.b().a;
                        ((fmmu)fmnm0).setClickable(true);
                        for(int v3 = 0; v3 < ((ggna)gged0).c; ++v3) {
                            fmlm fmlm0 = (fmlm)gged0.get(v3);
                            fmoo fmoo0 = new fmoo(((fmmu)fmnm0).getContext());
                            fmoo0.a(fmlm0, fmqf0, fmrq0);
                            fmoo0.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            ((fmmu)fmnm0).addView(fmoo0);
                        }
                        view0 = fmnm0;
                    }
                    break;
                }
                case 6: {
                    view0 = new fmnc(context0);
                    view0.a = new fmna(((fmnc)view0), fmid0, accountContext0);
                    ((fmnc)view0).a(fmmo0.a.d(), fmga0);
                    break;
                }
                case 8: {
                    view0 = new fmnf(context0);
                    view0.d = new fmnd(((fmnf)view0));
                    fmlt fmlt0 = fmmo0.a.e();
                    ((fmnf)view0).setContentDescription(fmlt0.d);
                    int v4 = fmro.a(((fmnf)view0).getContext(), (fmlt0.c > 0 ? ((float)fmlt0.c) : 112.0f));
                    if(iaea.i()) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((fmnf)view0).getLayoutParams();
                        viewGroup$LayoutParams0.width = -1;
                        viewGroup$LayoutParams0.height = v4;
                        ((fmnf)view0).setLayoutParams(viewGroup$LayoutParams0);
                    }
                    else {
                        ((fmnf)view0).setLayoutParams(new ViewGroup.LayoutParams(-1, v4));
                    }
                    ByteString hfsf0 = fmlt0.b;
                    if(!hfsf0.isEmpty()) {
                        byte[] arr_b = hfsf0.toByteArray();
                        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                        if(bitmap0 != null) {
                            ((AppCompatImageView)view0).setImageBitmap(bitmap0);
                            ((fmnf)view0).setScaleType(ImageView.ScaleType.FIT_CENTER);
                            ((fmnf)view0).setBackgroundColor(-1);
                            view0.a = true;
                        }
                    }
                    fmnd fmnd0 = view0.d;
                    if(fmnd0 != null) {
                        String s = Uri.parse(fmlt0.a.c()).getPath();
                        fmnd0.a.b.post(new fmne(fmnd0.a, (s == null || s.isEmpty() ? null : BitmapFactory.decodeFile(s))));
                    }
                    break;
                }
                default: {
                    flbj.c("UIElemCreator", "Got unknown UiElement type: " + fmmo0.b());
                    view0 = new View(context0);
                }
            }
        }
        view0.setPaddingRelative(fmro.a(context0, ((float)fmmo0.b)), fmro.a(context0, ((float)fmmo0.c)), fmro.a(context0, ((float)fmmo0.d)), fmro.a(context0, ((float)fmmo0.e)));
        if(fmmo0.f) {
            FrameLayout frameLayout0 = new FrameLayout(context0);
            frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout0.addView(view0);
            switch(fmga0.r) {
                case 0: {
                    throw null;
                }
                case 1: {
                    v7 = 0x7F0402F9;  // attr:colorOnSurfaceInverse
                    break;
                }
                default: {
                    v7 = 0x7F04030C;  // attr:colorPrimary
                }
            }
            frameLayout0.setBackgroundColor(fyho.b(frameLayout0, v7));
            view0 = frameLayout0;
        }
        linearLayout0.addView(view0);
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        if(this.d) {
            canvas0.save();
            canvas0.clipPath(this.i);
            super.draw(canvas0);
            canvas0.restore();
            canvas0.drawRoundRect(this.j, this.k, this.k, this.a);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // android.widget.LinearLayout
    protected final void onMeasure(int v, int v1) {
        int v2 = this.m;
        super.onMeasure(fmog.b((v2 <= 0 ? fmog.b(v, this.b) : fmog.b(v, v2)), this.b), fmog.b(v1, this.c));
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v == v2 && v1 == v3) {
            return;
        }
        float f = this.l / 2.0f;
        this.j.set(f, f, ((float)v) - f, ((float)v1) - f);
        this.i.reset();
        this.i.addRoundRect(this.j, this.k, this.k, Path.Direction.CW);
    }
}

