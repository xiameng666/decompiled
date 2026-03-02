import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public final class jin implements ixm {
    public final jbn a;
    public final jiq b;
    public final CharSequence c;
    public final jbz d;
    public jja e;
    public final int f;
    public final jed g;
    private final String h;
    private final List i;
    private final List j;
    private final jks k;
    private final boolean l;

    public jin(String s, jbn jbn0, List list0, List list1, jed jed0, jks jks0) {
        jks jks6;
        float f11;
        float f10;
        jcv jcv0;
        float f8;
        int v35;
        List list4;
        int v34;
        jjz jjz4;
        jks jks4;
        SpannableString spannableString1;
        int v33;
        jjz jjz3;
        ArrayList arrayList2;
        jks jks2;
        jbn jbn2;
        float f6;
        float f5;
        jjz jjz1;
        List list2;
        jat jat1;
        boolean z;
        jim jim1;
        int v1;
        Locale locale0;
        this.h = s;
        this.a = jbn0;
        this.i = list0;
        this.j = list1;
        this.g = jed0;
        this.k = jks0;
        jiq jiq0 = new jiq(jks0.dX());
        this.b = jiq0;
        if(jio.a(jbn0)) {
            Boolean boolean0 = (Boolean)jiw.a().a();
        }
        this.l = false;
        int v = jbn0.d();
        jii jii0 = jbn0.r();
        if(v == 4) {
            v1 = 2;
        }
        else {
            switch(v) {
                case 1: {
                    v1 = 0;
                    break;
                }
                case 2: {
                    v1 = 1;
                    break;
                }
                case 0: 
                case 3: {
                    if(jii0 == null) {
                        locale0 = Locale.getDefault();
                    }
                    else {
                        locale0 = jii0.a().a;
                        if(locale0 == null) {
                            locale0 = Locale.getDefault();
                        }
                    }
                    v1 = TextUtils.getLayoutDirectionFromLocale(locale0) == 1 ? 3 : 2;
                    break;
                }
                case 5: {
                    v1 = 3;
                    break;
                }
                default: {
                    throw new IllegalStateException("Invalid TextDirection.");
                }
            }
        }
        this.f = v1;
        jim jim0 = new jim(this);
        jkk jkk0 = jbn0.v() == null ? jkk.a : jbn0.v();
        jiq0.setFlags((jkk0.d ? jiq0.getFlags() | 0x80 : jiq0.getFlags() & 0xFFFFFF7F));
        int v2 = jkk0.c;
        if(v2 == 1) {
            jiq0.setFlags(jiq0.getFlags() | 0x40);
            jiq0.setHinting(0);
        }
        else {
            switch(v2) {
                case 2: {
                    jiq0.getFlags();
                    jiq0.setHinting(1);
                    break;
                }
                case 3: {
                    jiq0.getFlags();
                    jiq0.setHinting(0);
                    break;
                }
                default: {
                    jiq0.getFlags();
                }
            }
        }
        jat jat0 = jbn0.b;
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            Object object0 = null;
            if(v4 >= v3) {
                break;
            }
            Object object1 = list0.get(v4);
            if((((iwh)object1).a instanceof jat)) {
                object0 = object1;
                break;
            }
        }
        long v5 = jlp.c(jat0.b);
        if(jlr.b(v5, 0x100000000L)) {
            jiq0.setTextSize(jks0.ed(jat0.b));
        }
        else if(jlr.b(v5, 0x200000000L)) {
            jiq0.setTextSize(jiq0.getTextSize() * jlp.a(jat0.b));
        }
        if(jje.b(jat0)) {
            jiq0.setTypeface(((Typeface)jim0.a(jat0.f, (jat0.c == null ? jeu.h : jat0.c), new jem((jat0.d == null ? 0 : jat0.d.a)), new jen((jat0.e == null ? 0xFFFF : jat0.e.a)))));
        }
        if(jat0.k != null && !ibuq.m(jat0.k, jih.a())) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(jat0.k, 10));
            for(Object object2: jat0.k) {
                arrayList0.add(((jig)object2).a);
            }
            Locale[] arr_locale = (Locale[])arrayList0.toArray(new Locale[0]);
            jiq0.setTextLocales(new LocaleList(((Locale[])Arrays.copyOf(arr_locale, arr_locale.length))));
        }
        if(jat0.g != null && !ibuq.m(jat0.g, "")) {
            jiq0.setFontFeatureSettings(jat0.g);
        }
        if(jat0.j != null && !ibuq.m(jat0.j, jkh.a)) {
            jiq0.setTextScaleX(jiq0.getTextScaleX() * jat0.j.b);
            jiq0.setTextSkewX(jiq0.getTextSkewX() + jat0.j.c);
        }
        jiq0.c(jat0.b());
        jiq0.b(jat0.c(), 0x7FC000007FC00000L, jat0.a());
        jiq0.e(jat0.n);
        jiq0.f(jat0.m);
        jiq0.d(jat0.p);
        if(jlr.b(jlp.c(jat0.h), 0x100000000L)) {
            jim1 = jim0;
            if(jlp.a(jat0.h) == 0.0f) {
                goto label_101;
            }
            else {
                float f = jiq0.getTextSize() * jiq0.getTextScaleX();
                float f1 = jks0.ed(jat0.h);
                if(f != 0.0f) {
                    jiq0.setLetterSpacing(f1 / f);
                }
            }
        }
        else {
            jim1 = jim0;
        label_101:
            if(jlr.b(jlp.c(jat0.h), 0x200000000L)) {
                jiq0.setLetterSpacing(jlp.a(jat0.h));
            }
        }
        long v6 = jat0.h;
        long v7 = jat0.l;
        jjk jjk0 = jat0.i;
        if(object0 == null || !jlr.b(jlp.c(v6), 0x100000000L)) {
            z = false;
        }
        else if(jlp.a(v6) == 0.0f) {
            z = false;
        }
        else {
            z = true;
        }
        long v8 = hll.i;
        int v9 = ibog.c(v7, v8) || ibog.c(v7, hll.h) ? 0 : 1;
        int v10 = jjk0 == null || Float.compare(jjk0.a, 0.0f) == 0 ? 0 : 1;
        if(z || v9 != 0) {
        label_121:
            if(!z) {
                v6 = jlp.a;
            }
            jat1 = new jat(0L, 0L, null, null, null, null, null, v6, (1 == v10 ? jjk0 : null), null, null, (1 == v9 ? v7 : v8), null, null, 0xF67F);
        }
        else if(v10 == 0) {
            jat1 = null;
        }
        else {
            v10 = 1;
            goto label_121;
        }
        if(jat1 == null) {
            list2 = this.i;
        }
        else {
            int v11 = this.i.size() + 1;
            list2 = new ArrayList(v11);
            for(int v12 = 0; v12 < v11; ++v12) {
                ((ArrayList)list2).add((v12 == 0 ? new iwh(jat1, 0, this.h.length()) : ((iwh)this.i.get(v12 - 1))));
            }
        }
        String s1 = this.h;
        float f2 = this.b.getTextSize();
        jbn jbn1 = this.a;
        List list3 = this.j;
        jks jks1 = this.k;
        if(!list2.isEmpty() || !list3.isEmpty() || !ibuq.m(jbn1.u(), jki.a) || (jbn1.i() & 0xFF00000000L) != 0L) {
            SpannableString spannableString0 = new SpannableString(s1);
            jjz jjz0 = jjz.b;
            if(ibuq.m(jbn1.t(), jjz0)) {
                jjd.h(spannableString0, jil.a, 0, s1.length());
            }
            if(jil.a(jbn1) && jbn1.s() == null) {
                float f3 = jjd.b(jbn1.i(), f2, jks1);
                if(!Float.isNaN(f3)) {
                    jjd.h(spannableString0, new jcw(f3), 0, spannableString0.length());
                }
            }
            else {
                jjw jjw0 = jbn1.s() == null ? jjw.a : jbn1.s();
                float f4 = jjd.b(jbn1.i(), f2, jks1);
                if(!Float.isNaN(f4)) {
                    jjd.h(spannableString0, new jcx(f4, (spannableString0.length() == 0 || ibzk.Y(spannableString0) == 10 ? spannableString0.length() + 1 : spannableString0.length()), 1 == (jjw0.c & 1), (jjw0.c & 16) > 0, jjw0.b, jjw0.d), 0, spannableString0.length());
                }
            }
            jki jki0 = jbn1.u();
            if(jki0 == null) {
                jjz1 = jjz0;
            }
            else {
                jjz1 = jjz0;
                if(!jlp.e(jki0.b, jlq.e(0)) || !jlp.e(jki0.c, jlq.e(0))) {
                    long v13 = jki0.b;
                    if((v13 & 0xFF00000000L) != 0L && (jki0.c & 0xFF00000000L) != 0L) {
                        long v14 = jlp.c(v13);
                        if(jlr.b(v14, 0x100000000L)) {
                            f5 = jks1.ed(jki0.b);
                        }
                        else {
                            f5 = jlr.b(v14, 0x200000000L) ? jlp.a(jki0.b) * f2 : 0.0f;
                        }
                        long v15 = jlp.c(jki0.c);
                        if(jlr.b(v15, 0x100000000L)) {
                            f6 = jks1.ed(jki0.c);
                        }
                        else {
                            f6 = jlr.b(v15, 0x200000000L) ? jlp.a(jki0.c) * f2 : 0.0f;
                        }
                        int v16 = spannableString0.length();
                        jjd.h(spannableString0, new LeadingMarginSpan.Standard(((int)(((float)Math.ceil(f5)))), ((int)(((float)Math.ceil(f6))))), 0, v16);
                    }
                }
            }
            ArrayList arrayList1 = new ArrayList(list2.size());
            int v17 = list2.size();
            for(int v18 = 0; v18 < v17; ++v18) {
                iwh iwh0 = (iwh)list2.get(v18);
                if((iwh0.a instanceof jat) && (jje.b(((jat)iwh0.a)) || ((jat)iwh0.a).e != null)) {
                    ibuq.d(iwh0, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList1.add(iwh0);
                }
            }
            jat jat2 = jje.b(jbn1.b) || jbn1.p() != null ? new jat(0L, 0L, jbn1.q(), jbn1.o(), jbn1.p(), jbn1.n(), null, 0L, null, null, null, 0L, null, null, 0xFFC3) : null;
            jjc jjc0 = new jjc(spannableString0, jim1);
            if(arrayList1.size() > 1) {
                int v19 = arrayList1.size();
                int v20 = v19 + v19;
                int[] arr_v = new int[v20];
                int v21 = arrayList1.size();
                int v22 = 0;
                while(v22 < v21) {
                    iwh iwh1 = (iwh)arrayList1.get(v22);
                    arr_v[v22] = iwh1.b;
                    arr_v[v22 + v19] = iwh1.c;
                    ++v22;
                    v19 = v19;
                }
                if(v20 > 1) {
                    Arrays.sort(arr_v);
                }
                int v23 = ibpg.r(arr_v);
                int v24 = 0;
                while(v24 < v20) {
                    int v25 = arr_v[v24];
                    if(v25 == v23) {
                        arrayList2 = arrayList1;
                        jbn2 = jbn1;
                        jks2 = jks1;
                    }
                    else {
                        int v26 = arrayList1.size();
                        jbn2 = jbn1;
                        jks2 = jks1;
                        jat jat3 = jat2;
                        int v27 = 0;
                        while(v27 < v26) {
                            iwh iwh2 = (iwh)arrayList1.get(v27);
                            if(iwh2.b != iwh2.c && iwm.b(v23, v25, iwh2.b, iwh2.c)) {
                                jat3 = jjd.c(jat3, ((jat)iwh2.a));
                            }
                            ++v27;
                            arrayList1 = arrayList1;
                            v26 = v26;
                        }
                        arrayList2 = arrayList1;
                        if(jat3 != null) {
                            jjc0.a(jat3, Integer.valueOf(v23), Integer.valueOf(v25));
                        }
                        v23 = v25;
                    }
                    ++v24;
                    arrayList1 = arrayList2;
                    jks1 = jks2;
                    jbn1 = jbn2;
                }
            }
            else if(!arrayList1.isEmpty()) {
                jjc0.a(jjd.c(jat2, ((jat)((iwh)arrayList1.get(0)).a)), Integer.valueOf(((iwh)arrayList1.get(0)).b), Integer.valueOf(((iwh)arrayList1.get(0)).c));
            }
            jks jks3 = jks1;
            int v28 = list2.size();
            int v29 = 0;
            int v30 = 0;
            while(v30 < v28) {
                iwh iwh3 = (iwh)list2.get(v30);
                if((iwh3.a instanceof jat)) {
                    int v31 = iwh3.b;
                    int v32 = iwh3.c;
                    if(v31 >= 0 && v31 < spannableString0.length() && v32 > v31 && v32 <= spannableString0.length()) {
                        jat jat4 = (jat)iwh3.a;
                        jjk jjk1 = jat4.i;
                        if(jjk1 != null) {
                            jjd.h(spannableString0, new jcp(jjk1.a), v31, v32);
                        }
                        jjd.e(spannableString0, jat4.b(), v31, v32);
                        hlf hlf0 = jat4.c();
                        float f7 = jat4.a();
                        if(hlf0 != null) {
                            jjd.h(spannableString0, new jjj(((hms)hlf0), f7), v31, v32);
                        }
                        jjz jjz2 = jat4.m;
                        if(jjz2 == null) {
                            jjz3 = jjz1;
                            v33 = v28;
                        }
                        else {
                            jjz3 = jjz1;
                            v33 = v28;
                            jjd.h(spannableString0, new jdc(jjz2.a(jjz3), jjz2.a(jjz.c)), v31, v32);
                        }
                        jjd.f(spannableString0, jat4.b, jks3, v31, v32);
                        spannableString1 = spannableString0;
                        jks4 = jks3;
                        String s2 = jat4.g;
                        if(s2 != null) {
                            jjd.h(spannableString1, new jcq(s2), v31, v32);
                        }
                        jkh jkh0 = jat4.j;
                        if(jkh0 != null) {
                            jjd.h(spannableString1, new ScaleXSpan(jkh0.b), v31, v32);
                            jjd.h(spannableString1, new jdb(jkh0.c), v31, v32);
                        }
                        jjd.g(spannableString1, jat4.k, v31, v32);
                        jjd.d(spannableString1, jat4.l, v31, v32);
                        hmt hmt0 = jat4.n;
                        if(hmt0 == null) {
                            f8 = f2;
                            v34 = v30;
                            list4 = list3;
                            jjz4 = jjz3;
                            v35 = v29;
                        }
                        else {
                            jjz4 = jjz3;
                            v34 = v30;
                            list4 = list3;
                            v35 = v29;
                            f8 = f2;
                            jjd.h(spannableString1, new jda(hln.b(hmt0.b), Float.intBitsToFloat(((int)(hmt0.c >> 0x20))), Float.intBitsToFloat(((int)(hmt0.c & 0xFFFFFFFFL))), jje.a(hmt0.d)), v31, v32);
                        }
                        hpe hpe0 = jat4.p;
                        if(hpe0 != null) {
                            jjd.h(spannableString1, new jjh(hpe0), v31, v32);
                        }
                        jat jat5 = (jat)iwh3.a;
                        if(jlr.b(jlp.c(jat5.h), 0x100000000L) || jlr.b(jlp.c(jat5.h), 0x200000000L)) {
                            v29 = 1;
                            goto label_303;
                        }
                    }
                    else {
                        goto label_294;
                    }
                }
                else {
                label_294:
                    jjz4 = jjz1;
                    v33 = v28;
                    f8 = f2;
                    v34 = v30;
                    list4 = list3;
                    spannableString1 = spannableString0;
                    jks4 = jks3;
                    v35 = v29;
                }
                v29 = v35;
            label_303:
                v30 = v34 + 1;
                f2 = f8;
                jks3 = jks4;
                list3 = list4;
                spannableString0 = spannableString1;
                v28 = v33;
                jjz1 = jjz4;
            }
            float f9 = f2;
            s1 = spannableString0;
            jks jks5 = jks3;
            if(v29 != 0) {
                int v36 = list2.size();
                for(int v37 = 0; v37 < v36; ++v37) {
                    iwh iwh4 = (iwh)list2.get(v37);
                    iwd iwd0 = (iwd)iwh4.a;
                    if((iwd0 instanceof jat)) {
                        int v38 = iwh4.b;
                        int v39 = iwh4.c;
                        if(v38 >= 0 && v38 < ((Spannable)s1).length() && v39 > v38 && v39 <= ((Spannable)s1).length()) {
                            long v40 = ((jat)iwd0).h;
                            long v41 = jlp.c(v40);
                            if(jlr.b(v41, 0x100000000L)) {
                                jcv0 = new jcv(jks5.ed(v40));
                            }
                            else if(jlr.b(v41, 0x200000000L)) {
                                jcv0 = new jcu(jlp.a(v40));
                            }
                            else {
                                jcv0 = null;
                            }
                            if(jcv0 != null) {
                                jjd.h(((Spannable)s1), jcv0, v38, v39);
                            }
                        }
                    }
                }
            }
            jki jki1 = jbn1.u();
            if(jki1 == null) {
                f10 = 0.0f;
            }
            else {
                long v42 = jlp.c(jki1.b);
                if(jlr.b(v42, 0x100000000L)) {
                    f10 = jks5.ed(jki1.b);
                }
                else if(jlr.b(v42, 0x200000000L)) {
                    f10 = jlp.a(jki1.b) * f9;
                }
                else {
                    f10 = 0.0f;
                }
            }
            int v43 = list2.size();
            int v44 = 0;
            while(v44 < v43) {
                iwh iwh5 = (iwh)list2.get(v44);
                iwq iwq0 = (iwh5.a instanceof iwq) ? ((iwq)iwh5.a) : null;
                if(iwq0 == null) {
                    f11 = f9;
                }
                else {
                    f11 = f9;
                    float f12 = jjd.a(iwq0.d, f11, jks5);
                    float f13 = jjd.a(iwq0.e, f11, jks5);
                    float f14 = jjd.a(iwq0.f, f11, jks5);
                    if(!Float.isNaN(f12) && !Float.isNaN(f13) && !Float.isNaN(f14)) {
                        jks6 = jks5;
                        jjd.h(((Spannable)s1), new jjg(iwq0.c, f12, f13, f14, iwq0.g, jks5, f10), iwh5.b, iwh5.c);
                        goto label_365;
                    }
                }
                jks6 = jks5;
            label_365:
                ++v44;
                f9 = f11;
                jks5 = jks6;
            }
            if(list3.size() > 0) {
                iwh iwh6 = (iwh)list3.get(0);
                ixq ixq0 = (ixq)iwh6.a;
                Object[] arr_object = ((Spannable)s1).getSpans(iwh6.b, iwh6.c, lko.class);
                for(int v45 = 0; v45 < arr_object.length; ++v45) {
                    ((Spannable)s1).removeSpan(((lko)arr_object[v45]));
                }
                throw null;
            }
        }
        this.c = s1;
        this.d = new jbz(s1, this.b, this.f);
    }

    @Override  // ixm
    public final float a() {
        return this.d.b();
    }

    @Override  // ixm
    public final float b() {
        float f;
        jbz jbz0 = this.d;
        if(!Float.isNaN(jbz0.c)) {
            return jbz0.c;
        }
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(jbz0.b.getTextLocale());
        int v = jbz0.a.length();
        breakIterator0.setText(new jbs(jbz0.a, v));
        PriorityQueue priorityQueue0 = new PriorityQueue(10, new jby());
        int v1 = breakIterator0.next();
        int v2 = 0;
        while(v1 != -1) {
            if(priorityQueue0.size() < 10) {
                priorityQueue0.add(new ibns(v2, v1));
            }
            else {
                ibns ibns0 = (ibns)priorityQueue0.peek();
                if(ibns0 != null && ((Number)ibns0.b).intValue() - ((Number)ibns0.a).intValue() < v1 - v2) {
                    priorityQueue0.poll();
                    priorityQueue0.add(new ibns(v2, v1));
                }
            }
            v2 = v1;
            v1 = breakIterator0.next();
        }
        if(priorityQueue0.isEmpty()) {
            f = 0.0f;
            jbz0.c = f;
            return f;
        }
        Iterator iterator0 = priorityQueue0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        float f1;
        for(f1 = jbz0.a(((Number)((ibns)object0).a).intValue(), ((Number)((ibns)object0).b).intValue()); iterator0.hasNext(); f1 = Math.max(f1, jbz0.a(((Number)((ibns)object1).a).intValue(), ((Number)((ibns)object1).b).intValue()))) {
            Object object1 = iterator0.next();
        }
        f = f1;
        jbz0.c = f;
        return f;
    }

    @Override  // ixm
    public final boolean c() {
        if(this.e != null && this.e.a()) {
            return true;
        }
        if(!jio.a(this.a)) {
            return false;
        }
        Boolean boolean0 = (Boolean)jiw.a().a();
        return false;
    }
}

