import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class ekjl extends tk {
    public final ejyv a;
    public final ekit e;
    public final Context f;
    public List g;
    public final Set h;
    public Drawable i;

    public ekjl(Context context0, ekit ekit0, ejyv ejyv0) {
        this.f = context0;
        this.e = ekit0;
        this.a = ejyv0;
        this.g = new ArrayList();
        this.h = new HashSet();
        this.i = null;
    }

    @Override  // tk
    public final int b() {
        return this.g.size() + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return v == 0 ? 0 : 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 0) {
            View view0 = layoutInflater0.inflate(0x7F0E07BA, viewGroup0, false);  // layout:people_contacts_import_screen_title
            ((TextView)view0.findViewById(0x7F0B22B8)).setText(0x7F152893);  // id:title
            ((TextView)view0.findViewById(0x7F0B2187)).setText(0x7F15289F);  // id:summary
            if(hwym.c()) {
                ((ImageView)view0.findViewById(0x7F0B1E71)).setImageResource(0x7F080A5A);  // id:restore_title_icon
            }
            return new ekjk(view0);
        }
        return new ekjj(layoutInflater0.inflate(0x7F0E07BC, viewGroup0, false));  // layout:people_contacts_import_source_item
    }

    final List f() {
        List list0 = new ArrayList();
        for(Object object0: this.g) {
            ejyy ejyy0 = (ejyy)object0;
            if(this.h.contains(ejyy0.a)) {
                list0.add(ejyy0);
            }
        }
        return list0;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        Context context0 = this.f;
        int v1 = context0.getResources().getDimensionPixelSize(0x7F070076);  // dimen:accessibility_required_min_touch_target_height
        if(v == 0) {
            String s = this.a.i();
            ((ekjk)uq0).u.setText(s);
            ((ekjk)uq0).u.j(this.i);
            ekjf ekjf0 = new ekjf(this);
            ((ekjk)uq0).t.setOnClickListener(ekjf0);
            ekmx.b(((ekjk)uq0).t, v1);
            return;
        }
        ejyy ejyy0 = (ejyy)this.g.get(v - 1);
        String s1 = ejyy0.a;
        ((ekjj)uq0).t.setText(ejyy0.j);
        String s2 = ekmu.b(context0, ejyy0.c);
        ((ekjj)uq0).u.setText(s2);
        if(this.b() >= 3) {
            Set set0 = this.a.l();
            if(set0 != null && !set0.contains(s1)) {
                ((ekjj)uq0).y.setChecked(false);
            }
            else {
                ((ekjj)uq0).y.setChecked(true);
                this.h.add(s1);
            }
            ((ekjj)uq0).x.setVisibility(0);
            ekjg ekjg0 = new ekjg(((ekjj)uq0));
            ((ekjj)uq0).x.setOnClickListener(ekjg0);
            ekjh ekjh0 = new ekjh(this, ejyy0);
            ((ekjj)uq0).y.setOnCheckedChangeListener(ekjh0);
        }
        else {
            this.h.add(s1);
        }
        Resources resources0 = context0.getResources();
        TextView textView0 = ((ekjj)uq0).v;
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        textView0.setOnClickListener(new ekji(this, uq0));
        SpannableString spannableString0 = new SpannableString(Html.fromHtml(resources0.getQuantityString(0x7F13006D, ejyy0.d, new Object[]{((int)ejyy0.d)})));  // plurals:romanesco_restore_backup_contacts_count
        TypedValue typedValue0 = new TypedValue();
        Resources.Theme resources$Theme0 = context0.getTheme();
        int v2 = context0.getColor((resources$Theme0 == null || !resources$Theme0.resolveAttribute(0x7F040312, typedValue0, true) ? 0x7F06076F : typedValue0.resourceId));  // attr:colorPrimaryGoogle
        URLSpan[] arr_uRLSpan = (URLSpan[])spannableString0.getSpans(0, spannableString0.length(), URLSpan.class);
        for(int v3 = 0; v3 < arr_uRLSpan.length; ++v3) {
            URLSpan uRLSpan0 = arr_uRLSpan[v3];
            int v4 = spannableString0.getSpanStart(uRLSpan0);
            int v5 = spannableString0.getSpanEnd(uRLSpan0);
            spannableString0.removeSpan(uRLSpan0);
            spannableString0.setSpan(new ForegroundColorSpan(v2), v4, v5, 0);
        }
        textView0.setText(new SpannableString(spannableString0));
        textView0.setClickable(true);
        ekmx.b(textView0, v1);
    }

    public final void n(boolean z) {
        this.e.G(z);
    }
}

