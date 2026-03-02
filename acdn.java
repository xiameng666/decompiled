import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.List;

public final class acdn extends accz {
    public final acdo f;
    private final int g;
    private CharSequence h;
    private CharSequence i;
    private final boolean j;
    private final View.OnClickListener k;
    private final View.OnClickListener l;
    private final View.OnClickListener m;
    private EditText n;
    private final Object[] o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final boolean s;
    private boolean t;

    public acdn(acdo acdo0, int v, String s, CharSequence charSequence0, boolean z, boolean z1) {
        this.f = acdo0;
        this.g = v;
        this.h = charSequence0;
        this.j = z;
        this.s = z1;
        this.k = new acdi(this);
        this.l = new acdj(this);
        this.m = new acdk(this);
        this.o = new Object[]{s};
    }

    @Override  // accz
    public final CharSequence G() {
        return this.n != null && this.n.isShown() && this.n.getParent() != null ? this.n.getText() : null;
    }

    @Override  // accz
    public final void H() {
        EditText editText0 = this.n;
        if(editText0 != null) {
            if(editText0.isShown() && this.n.getParent() != null) {
                this.W();
                return;
            }
            this.t = true;
        }
    }

    @Override  // accz
    public final void I(ContactPerson contactPerson0) {
        if(this.p && !this.a) {
            int v = this.f.B().indexOf(contactPerson0);
            if(v >= 0) {
                this.r(v + 1);
            }
        }
    }

    @Override  // accz
    public final void J(ContactPerson contactPerson0) {
        if(this.p && !this.a) {
            this.s(this.f.y());
            this.r(this.f.y() + 1);
            return;
        }
        this.r(1);
    }

    @Override  // accz
    public final void K(ContactPerson contactPerson0, int v) {
        if(this.p && !this.a) {
            this.q();
            return;
        }
        this.r(1);
    }

    @Override  // accz
    protected final void M(boolean z) {
        if(z) {
            acdo acdo0 = this.f;
            this.r(acdo0.y() + 1);
            if(acdo0.y() > 0) {
                this.x(1, acdo0.y() + 1);
            }
        }
        else {
            this.r(1);
            acdo acdo1 = this.f;
            if(acdo1.y() > 0) {
                this.w(1, acdo1.y() + 1);
            }
        }
    }

    @Override  // accz
    public final void O(boolean z) {
        if(z == this.p) {
            return;
        }
        this.S(null);
        this.p = z;
        if(!z) {
            EditText editText0 = this.n;
            if(editText0 != null) {
                editText0.clearFocus();
                bbpe.b(this.n.getContext(), this.n);
            }
        }
        this.q();
    }

    @Override  // accz
    public final void P(boolean z) {
        this.r = z;
    }

    @Override  // accz
    public final void R(CharSequence charSequence0) {
        if(!bata.b(charSequence0, this.h)) {
            this.h = charSequence0;
            EditText editText0 = this.n;
            if(editText0 != null && !this.a) {
                editText0.setHint(charSequence0);
            }
            if(!this.p && this.f.y() == 0) {
                this.r(1);
            }
        }
    }

    @Override  // accz
    public final void S(CharSequence charSequence0) {
        EditText editText0 = this.n;
        if(editText0 != null) {
            editText0.setText(charSequence0);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.n.setSelection(charSequence0.length());
            }
        }
    }

    @Override  // accz
    public final void U(CharSequence charSequence0) {
        if(!bata.b(charSequence0, this.i)) {
            this.i = charSequence0;
            EditText editText0 = this.n;
            if(editText0 != null && this.a) {
                editText0.setHint((TextUtils.isEmpty(this.i) ? this.h : this.i));
            }
        }
    }

    @Override  // accz
    public final void V(boolean z) {
        this.q = z;
    }

    public final void W() {
        if(this.n.isShown() && this.n.getParent() != null) {
            this.n.requestFocus();
            Context context0 = this.n.getContext();
            EditText editText0 = this.n;
            InputMethodManager inputMethodManager0 = bbpe.a(context0);
            if(inputMethodManager0 != null) {
                inputMethodManager0.showSoftInput(editText0, 0);
            }
        }
    }

    private final void X(TextView textView0) {
        if(this.j && !this.a) {
            Resources resources0 = textView0.getResources();
            textView0.setText(resources0.getString(0x7F1501A0, new Object[]{this.f.y(), ((int)((accn)this.f).c)}));  // string:appinvite_contextual_selection_number_of_recipients "%1$d / %2$d"
            textView0.setContentDescription(resources0.getString(0x7F15019F, new Object[]{this.f.y(), ((int)((accn)this.f).c)}));  // string:appinvite_contextual_selection_num_recipients_content_description "%1$d selected 
                                                                                                                                   // of %2$d recipients maximum"
            textView0.setVisibility(0);
            return;
        }
        textView0.setVisibility(8);
    }

    @Override  // tk
    public final int b() {
        return !this.p || this.a ? 2 : this.f.y() + 2;
    }

    @Override  // tk
    public final int dx(int v) {
        if(v == 0) {
            return 0x7F0E0095;  // layout:appinvite_anchor
        }
        if(!this.a) {
            if(!this.p) {
                return 0x7F0E009F;  // layout:appinvite_contextual_selection_recipients
            }
            if(v - 1 < this.f.y()) {
                return 0x7F0E0099;  // layout:appinvite_contextual_selection_chip
            }
        }
        return this.s ? 0x7F0E00A1 : 0x7F0E00A0;  // layout:appinvite_contextual_selection_search_docked
    }

    @Override  // tk
    public final long dy(int v) {
        if(v == 0) {
            return 0L;
        }
        if(this.a) {
            return 2L;
        }
        if(this.p) {
            List list0 = this.f.B();
            return v - 1 >= list0.size() ? 2L : ((long)((ContactPerson)list0.get(v - 1)).hashCode());
        }
        return 1L;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        if(v == 0x7F0E009F) {  // layout:appinvite_contextual_selection_recipients
            return new aced(view0);
        }
        switch(v) {
            case 0x7F0E0095: {  // layout:appinvite_anchor
                return new uq(view0);
            }
            case 0x7F0E0099: {  // layout:appinvite_contextual_selection_chip
                return new acdz(view0);
            }
            case 0x7F0E00A0:   // layout:appinvite_contextual_selection_search
            case 0x7F0E00A1: {  // layout:appinvite_contextual_selection_search_docked
                return new acec(view0);
            }
            default: {
                return null;
            }
        }
    }

    @Override  // accz
    public final int f() {
        return 1;
    }

    @Override  // android.widget.SectionIndexer
    public final int getPositionForSection(int v) {
        return 0;
    }

    @Override  // android.widget.SectionIndexer
    public final int getSectionForPosition(int v) {
        return 0;
    }

    @Override  // android.widget.SectionIndexer
    public final Object[] getSections() {
        return this.o;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        int v1 = 0;
        if(v > 0) {
            if(!this.p) {
                View view0 = ((aced)uq0).a;
                List list0 = this.f.B();
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
                int v2 = 0;
                while(v1 < list0.size()) {
                    ContactPerson contactPerson0 = (ContactPerson)list0.get(v1);
                    if(v2 >= 5) {
                        spannableStringBuilder0.setSpan(new ForegroundColorSpan(view0.getResources().getColor(0x7F060BC0)), spannableStringBuilder0.length(), spannableStringBuilder0.length(), 18);  // color:material_google_blue_500
                        spannableStringBuilder0.append(String.format(" +%d more", ((int)(list0.size() - v2))));
                        break;
                    }
                    if(v2 > 0) {
                        spannableStringBuilder0.append(", ");
                    }
                    String s = acfd.a(view0.getContext(), contactPerson0);
                    if(s != null) {
                        spannableStringBuilder0.append(s);
                    }
                    ++v2;
                    ++v1;
                }
                TextView textView0 = ((aced)uq0).t;
                if(v2 == 0) {
                    textView0.setText(this.h);
                    textView0.setTextColor(textView0.getResources().getColor(0x7F06004C));  // color:appinvite_medium_black
                }
                else {
                    textView0.setText(spannableStringBuilder0);
                    textView0.setTextColor(textView0.getResources().getColor(0x7F060042));  // color:appinvite_dark_black
                }
                this.X(((aced)uq0).u);
                view0.setOnClickListener(new acdm(this));
                return;
            }
            if(!this.a) {
                acdo acdo0 = this.f;
                if(v - 1 < acdo0.y()) {
                    ContactPerson contactPerson1 = (ContactPerson)acdo0.B().get(v - 1);
                    acdc.ab(((acdz)uq0), contactPerson1, false, false, this.q, true, this.r, ((accn)acdo0).aj, ((accn)acdo0).ak, this.e);
                    View view1 = ((acdz)uq0).a;
                    view1.setOnClickListener(this.l);
                    if(v - 1 == 0) {
                        v1 = view1.getResources().getDimensionPixelSize(0x7F070130);  // dimen:appinvite_chip_spacing
                    }
                    view1.setPaddingRelative(view1.getPaddingStart(), v1, view1.getPaddingEnd(), view1.getPaddingBottom());
                    ((acdz)uq0).t.setOnClickListener(this.k);
                    ((acdz)uq0).t.setTag(0x7F0B0BD7, contactPerson1);  // id:appinvite_chip_view_holder_tag_person
                    return;
                }
            }
            this.X(((acec)uq0).v);
            AutoCompleteTextView autoCompleteTextView0 = ((acec)uq0).t;
            this.n = autoCompleteTextView0;
            TextView textView1 = ((acec)uq0).u;
            ImageView imageView0 = ((acec)uq0).w;
            if(this.a) {
                this.n.setVisibility(0);
                this.n.setHint((TextUtils.isEmpty(this.i) ? this.h : this.i));
                acdo acdo1 = this.f;
                if(((accn)acdo1).aG == null) {
                    ((accn)acdo1).aG = new accf(((accn)acdo1));
                }
                accc accc0 = ((accn)acdo1).aF;
                accc0.j = autoCompleteTextView0.getThreshold();
                autoCompleteTextView0.setAdapter(((accn)acdo1).aF);
                autoCompleteTextView0.setOnEditorActionListener(((TextView.OnEditorActionListener)acdo1));
                autoCompleteTextView0.setOnFocusChangeListener(((View.OnFocusChangeListener)acdo1));
                autoCompleteTextView0.setOnItemClickListener(((accn)acdo1).aG);
                textView1.setVisibility(4);
                View view2 = ((acec)uq0).a;
                view2.setContentDescription(null);
                imageView0.setVisibility(0);
                imageView0.setOnClickListener(this.m);
                Resources resources0 = view2.getResources();
                Drawable drawable0 = resources0.getDrawable(0x7F080CDA).mutate();
                drawable0.setColorFilter(resources0.getColor(0x7F060042), PorterDuff.Mode.MULTIPLY);  // color:appinvite_dark_black
                imageView0.setImageDrawable(drawable0);
                if(this.t) {
                    this.t = false;
                    this.n.post(new acdl(this));
                }
            }
            else {
                this.n.setVisibility(4);
                textView1.setVisibility(0);
                textView1.setText(this.h);
                View view3 = ((acec)uq0).a;
                view3.setOnClickListener(this.l);
                view3.setContentDescription(this.h);
                imageView0.setVisibility(8);
            }
        }
    }

    @Override  // accz
    public final int n(int v) {
        return this.g;
    }
}

