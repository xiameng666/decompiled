import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class bvyu extends bvxo {
    public static final List a;
    public final xob b;
    private static final ibzd k;
    private final bwcl l;
    private final bwca m;

    static {
        bvyu.k = new ibzd("(^|<br>)\\d+\\. ");
        bvyu.a = ibpo.g(new ibns[]{new ibns(((int)5), Color.parseColor("#05000000")), new ibns(((int)4), Color.parseColor("#0C000000")), new ibns(((int)3), Color.parseColor("#24000000")), new ibns(((int)2), Color.parseColor("#24000000")), new ibns(((int)1), Color.parseColor("#24000000")), new ibns(((int)0), Color.parseColor("#10000000"))});
    }

    public bvyu(hgmq hgmq0, bvwy bvwy0, fhwo fhwo0, bwcl bwcl0, xob xob0, bwca bwca0, bvwa bvwa0, bvxp bvxp0, du du0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
        this.l = bwcl0;
        this.b = xob0;
        this.m = bwca0;
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        int v11;
        int v7;
        Object[] arr_object1;
        String s2;
        ibuq.f(layoutInflater0, "inflater");
        hgmq hgmq0 = this.d;
        hgnm hgnm0 = hgmq0.e == 12 ? ((hgnm)hgmq0.f) : hgnm.a;
        ibuq.e(hgnm0, "getText(...)");
        TextView textView0 = (view0 instanceof TextView) ? ((TextView)view0) : null;
        if(textView0 != null) {
            String s = hgmq0.h;
            ibuq.e(s, "getContentDescription(...)");
            if(s.length() > 0) {
                textView0.setContentDescription(hgmq0.h);
            }
            this.d(textView0);
            if(hgnm0.h) {
                String s1 = hgnm0.c;
                ibuq.e(s1, "getText(...)");
                bvys bvys0 = new bvys();
                s2 = bvyu.k.c(s1, bvys0);
            }
            else {
                s2 = hgnm0.c;
                ibuq.c(s2);
            }
            Spanned spanned0 = Html.fromHtml(s2, 0x3F, new bwbw(textView0, this.e), null);
            ibuq.e(spanned0, "fromHtml(...)");
            ibuq.f(spanned0, "<this>");
            Object[] arr_object = spanned0.getSpans(0, spanned0.length(), Object.class);
            ibuq.c(arr_object);
            int v = arr_object.length;
            if(v != 0) {
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
                int v1 = 0;
                int v2 = 0;
                int v3 = 0;
                while(v1 < v) {
                    Object object0 = arr_object[v1];
                    int v4 = spanned0.getSpanEnd(object0) - spanned0.getSpanStart(object0);
                    boolean z = object0 instanceof ImageSpan;
                    if(z && ibuq.m(((ImageSpan)object0).getDrawable(), bwbv.a())) {
                        int v5 = spanned0.getSpanEnd(object0);
                        int v6 = v4 + ibzk.D(spanned0.subSequence(v5, v5 + 1));
                        v2 += v6;
                        v3 += v6;
                        arr_object1 = arr_object;
                        v7 = v;
                    }
                    else {
                        int v8 = v2 + bwdk.a(spannableStringBuilder0, spanned0, v2, spanned0.getSpanStart(object0));
                        int v9 = spanned0.getSpanStart(object0);
                        int v10 = spanned0.getSpanEnd(object0);
                        arr_object1 = arr_object;
                        spannableStringBuilder0.append(spanned0.subSequence(v9, v10));
                        if(z) {
                            Drawable drawable0 = ((ImageSpan)object0).getDrawable();
                            float f = textView0.getLineSpacingExtra() / 2.0f;
                            v7 = v;
                            v11 = v9;
                            drawable0.setBounds(drawable0.getBounds().left, drawable0.getBounds().top - ((int)f), drawable0.getBounds().right, drawable0.getBounds().bottom - ((int)f));
                            object0 = new ImageSpan(drawable0, 2);
                        }
                        else {
                            v7 = v;
                            v11 = v9;
                        }
                        spannableStringBuilder0.setSpan(object0, v11 - v3, v10 - v3, 33);
                        v2 = v8 + v4;
                    }
                    ++v1;
                    arr_object = arr_object1;
                    v = v7;
                }
                bwdk.a(spannableStringBuilder0, spanned0, v2, spanned0.length());
                spanned0 = spannableStringBuilder0;
            }
            if(hgnm0.h) {
                ibuq.f(spanned0, "<this>");
                if(ibzk.F(spanned0, '\n')) {
                    ibwm ibwm0 = ibwt.q(1, 10);
                    ArrayList arrayList0 = new ArrayList(ibpo.q(ibwm0, 10));
                    ibpw ibpw0 = ibwm0.e();
                    while(((ibwl)ibpw0).a) {
                        int v12 = ibpw0.a();
                        arrayList0.add(Float.valueOf(textView0.getPaint().measureText(v12 + ". ")));
                    }
                    Iterator iterator0 = arrayList0.iterator();
                    if(!iterator0.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object object1 = iterator0.next();
                    float f1;
                    for(f1 = ((Number)object1).floatValue(); iterator0.hasNext(); f1 = Math.max(f1, ((Number)object2).floatValue())) {
                        Object object2 = iterator0.next();
                    }
                    Context context0 = textView0.getContext();
                    ibuq.e(context0, "getContext(...)");
                    boolean z1 = bwcp.a(context0);
                    SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(spanned0);
                    int v14 = 0;
                    for(int v13 = 1; v14 < spanned0.length(); ++v13) {
                        Integer integer0 = ibzk.M(spannableStringBuilder1, '\n', v14, 4);
                        if(integer0.intValue() == -1) {
                            integer0 = null;
                        }
                        int v15 = integer0 == null ? spanned0.length() : ((int)integer0);
                        spannableStringBuilder1.setSpan(new bwcn(textView0, z1, v13, ((int)f1)), v14, v15, 33);
                        v14 = v15 + 1;
                    }
                    spanned0 = spannableStringBuilder1;
                }
            }
            textView0.setText(spanned0);
            String s3 = hgnm0.d;
            ibuq.e(s3, "getIconSourceUri(...)");
            if(s3.length() > 0) {
                CharSequence charSequence0 = textView0.getText();
                String s4 = hgnm0.d;
                ibuq.e(s4, "getIconSourceUri(...)");
                bvyt bvyt0 = new bvyt(this, hgnm0, textView0, charSequence0);
                ibuq.f(s4, "sourceUri");
                txc.d(this.l.a).h(s4).p(new bwck(bvyt0));
            }
            if(hgnm0.e && (!this.i.h() || !ibuq.m(hgmq0.g, "id/uiflow_summary_card_title"))) {
                bwdz.g(textView0, new bvyp(textView0));
            }
            if((hgnm0.b & 1) != 0) {
                bvzg bvzg0 = (bvzg)this.j.a(bvzg.class);
                hgmj hgmj0 = hgnm0.f == null ? hgmj.a : hgnm0.f;
                ibuq.e("Learn more", "getString(...)");
                int v16 = hgmj0.c;
                bvyq bvyq0 = new bvyq(hgmj0, bvzg0);
                bvyr bvyr0 = new bvyr(this, hgmj0);
                ibuq.f("Learn more", "suffix");
                RelativeLayout relativeLayout0 = new RelativeLayout(textView0.getContext());
                relativeLayout0.setId(0x7F0B1384);  // id:fake_ve_id_element
                ViewParent viewParent0 = textView0.getParent();
                ibuq.d(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup)viewParent0).addView(relativeLayout0);
                this.m.a.b.e(v16).c(relativeLayout0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(textView0.getText());
                spannableStringBuilder2.append(" ");
                spannableStringBuilder2.append("Learn more");
                spannableStringBuilder2.setSpan(new bwbz(this.m, bvyq0, relativeLayout0, bvyr0, textView0), textView0.getText().length() + 1, textView0.getText().length() + 11, 33);
                textView0.setOnTouchListener(new bwby(textView0, spannableStringBuilder2));
                kfe.g(textView0);
                textView0.setText(spannableStringBuilder2);
            }
        }
    }
}

