import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Html;
import android.text.Spanned;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.wearable.AppTheme;
import java.util.List;

public final class fddk extends tk {
    List a;
    private final fdco e;
    private final AppTheme f;
    private final boolean g;
    private final boolean h;
    private final Context i;
    private final fdcx j;

    public fddk(fdco fdco0, fdcx fdcx0, fdan fdan0, Context context0) {
        this.i = context0;
        this.e = fdco0;
        this.j = fdcx0;
        this.f = fdan0.a;
        this.g = fdan0.g;
        this.h = fdan0.h;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        return fczo.i(this.f) ? new fddi(layoutInflater0.cloneInContext(new ContextThemeWrapper(viewGroup0.getContext(), fczo.a(this.f))).inflate(0x7F0E0EBA, viewGroup0, false), this.i, this.f) : new fddi(layoutInflater0.cloneInContext(new ContextThemeWrapper(viewGroup0.getContext(), fczo.a(this.f))).inflate(0x7F0E0EB5, viewGroup0, false), this.i, this.f);  // layout:wearable_expressive_consent_term
    }

    public final void f(List list0) {
        this.a = list0;
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        boolean z = fdci.b() && this.g && !this.h;
        fddf fddf0 = (fddf)this.a.get(v);
        fdco fdco0 = this.e;
        fdcx fdcx0 = this.j;
        int v1 = this.b() - 1;
        Context context0 = ((fddi)uq0).w;
        Spanned spanned0 = Html.fromHtml(context0.getString(fddf0.c), 0x3F);
        TextView textView0 = ((fddi)uq0).u;
        fdcl.b(textView0, spanned0);
        boolean z1 = fczo.i(((fddi)uq0).x);
        if(fddf0.f == 0) {
            if(z1) {
                View view0 = ((fddi)uq0).a;
                int v2 = (int)context0.getResources().getDimension(0x7F071639);  // dimen:wear_expressive_subtitle_margin_top
                int v3 = (int)context0.getResources().getDimension(0x7F07162D);  // dimen:wear_expressive_content_margin_top
                ty ty0 = (ty)view0.getLayoutParams();
                if(ty0 != null) {
                    ty0.setMargins(ty0.leftMargin, v2, ty0.rightMargin, v3);
                    view0.setLayoutParams(ty0);
                }
                view0.setPadding(0, 0, 0, 0);
            }
            else {
                View view1 = ((fddi)uq0).a;
                view1.setPadding(view1.getPaddingLeft(), 0, view1.getPaddingRight(), view1.getPaddingBottom());
            }
        }
        Integer integer0 = fddf0.a;
        if(integer0 == null) {
            ((fddi)uq0).t.setVisibility(8);
            if(z1) {
                textView0.setTextAppearance(0x7F1610EA);  // style:WearableExpressiveText.Subheader
            }
            else {
                textView0.setTextAppearance(0x7F1610FB);  // style:WearableTosText.Body1
            }
        }
        else {
            ((fddi)uq0).t.setText(integer0.intValue());
            Spanned spanned1 = Html.fromHtml(context0.getString(integer0.intValue()), 0x3F);
            fdcl.b(((fddi)uq0).t, spanned1);
            ((fddi)uq0).v.setContentDescription(spanned1);
        }
        fdcn fdcn0 = fddf0.b;
        if(fdcn0 == null) {
            ((fddi)uq0).v.setVisibility(8);
        }
        else {
            boolean z2 = fdco0.g(fdcn0);
            ((fddi)uq0).v.c(((int)z2));
            ((fddi)uq0).v.d = new fddh(fdco0, fdcn0, fdcx0);
        }
        if(z || !fddf0.h) {
            ((fddi)uq0).v.setEnabled(false);
            ColorStateList colorStateList0 = ColorStateList.valueOf(context0.getColor(0x7F0613A3));  // color:wearable_tos_check_box_disabled
            ((fddi)uq0).v.setButtonTintList(colorStateList0);
        }
        if(v == v1 && z1) {
            View view2 = ((fddi)uq0).a;
            ty ty1 = (ty)view2.getLayoutParams();
            if(ty1 != null) {
                ty1.setMargins(ty1.leftMargin, ty1.topMargin, ty1.rightMargin, 0);
                view2.setLayoutParams(ty1);
            }
        }
    }
}

