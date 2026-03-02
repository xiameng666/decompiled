import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

public final class fmpp extends tk {
    public final fmre a;
    public fmzc e;
    public fmhr f;
    private int g;
    private int h;

    public fmpp(fmre fmre0) {
        this.e = new fmpo();
        this.a = fmre0;
    }

    @Override  // tk
    public final int b() {
        return this.f == null ? 0 : ((ggna)this.f.d).c;
    }

    @Override  // tk
    public final int dx(int v) {
        return 7;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        fmpq fmpq0 = new fmpq(viewGroup0.getContext());
        Resources resources0 = viewGroup0.getContext().getResources();
        this.g = resources0.getDimensionPixelSize(0x7F0712A2);  // dimen:suggestion_chip_margin
        this.h = resources0.getDisplayMetrics().widthPixels - resources0.getDimensionPixelSize(0x7F0712AE);  // dimen:suggestion_chip_width_restriction
        return new uq(fmpq0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        fmpq fmpq0 = (fmpq)uq0.a;
        fmpq0.setMaxWidth(this.h);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.setMargins((v == 0 ? this.g : 0), 0, this.g, (this.f.e != 2 || v == ((ggna)this.f.d).c - 1 ? 0 : this.g));
        fmpq0.setLayoutParams(linearLayout$LayoutParams0);
        fmhp fmhp0 = (fmhp)this.f.d.get(v);
        fmpq0.b();
        String s = fmhp0.c;
        String s1 = fmhp0.f;
        if(TextUtils.isEmpty(s1)) {
            fmpq0.setPadding(fmpq0.f, fmpq0.g, fmpq0.f, fmpq0.g);
            fmpq0.s(0x7F0712A9);  // dimen:suggestion_chip_one_line_radius
            fmpq0.setText(s);
            fmpq0.setTextAppearance(fmpq0.getContext(), fmpq0.b);
        }
        else {
            fmpq0.setPadding(fmpq0.e, fmpq0.h, fmpq0.e, fmpq0.i);
            fmpq0.s(0x7F0712A6);  // dimen:suggestion_chip_multi_line_radius
            SpannableString spannableString0 = new SpannableString(a.r(s1, s, "\n"));
            spannableString0.setSpan(new TextAppearanceSpan(fmpq0.getContext(), fmpq0.c), 0, s.length(), 33);
            spannableString0.setSpan(new TextAppearanceSpan(fmpq0.getContext(), fmpq0.d), s.length(), s.length() + s1.length() + 1, 33);
            fmpq0.setText(spannableString0);
        }
        gfsx gfsx0 = fmhp0.d;
        if(gfsx0.i()) {
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(((fmfh)gfsx0.d()).a, 0, ((fmfh)gfsx0.d()).a.length);
            if(bitmap0 != null) {
                int v1 = fmro.a(fmpq0.getContext(), ((float)((fmfh)gfsx0.d()).b));
                int v2 = fmro.a(fmpq0.getContext(), ((float)((fmfh)gfsx0.d()).c));
                if(v1 > 0 && v2 > 0) {
                    fmpq0.u(new BitmapDrawable(fmpq0.getResources(), Bitmap.createScaledBitmap(bitmap0, v1, v2, true)));
                    if(!TextUtils.isEmpty(((fmfh)gfsx0.d()).e) && TextUtils.isEmpty(fmpq0.getText())) {
                        fmpq0.setContentDescription(((fmfh)gfsx0.d()).e);
                    }
                }
                if(!iaea.j() && ((fmfh)gfsx0.d()).d.i()) {
                    fmpq0.w(ColorStateList.valueOf(((Integer)((fmfh)gfsx0.d()).d.d()).intValue()));
                }
            }
        }
        ((fmuw)this.a).f(0x7C);
        fmpq0.setOnClickListener(new fmpn(this, fmhp0));
    }
}

