import android.content.Context;
import com.google.android.gms.wearable.Term;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ffkz extends ffee {
    final int c;
    final fdiy d;
    final fflv e;

    public ffkz(fflv fflv0, int v, fdiy fdiy0) {
        this.c = v;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getTerms");
    }

    @Override  // ffee
    public final void a() {
        Context context1;
        Locale locale8;
        Locale locale7;
        ghia ghia2;
        int v50;
        String s18;
        LinkedList linkedList3;
        HashMap hashMap5;
        int v49;
        ghig ghig4;
        int v44;
        String s12;
        ghhj ghhj1;
        int v34;
        int v33;
        gfsx gfsx4;
        int v32;
        int v31;
        ArrayList arrayList6;
        int v29;
        String s8;
        int v28;
        ghhq ghhq1;
        int v27;
        int v26;
        gfsx gfsx2;
        ArrayList arrayList4;
        ghhq ghhq0;
        ghig ghig3;
        ArrayList arrayList3;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v14;
        int v13;
        boolean z2;
        ghig ghig2;
        int v11;
        ArrayList arrayList2;
        int v8;
        int v7;
        Locale locale4;
        HashMap hashMap3;
        String s3;
        Locale locale3;
        fddf fddf1;
        LinkedList linkedList1;
        int v6;
        Object object0;
        int v1;
        evql evql0;
        ffkz ffkz0 = this;
        fdch fdch0 = ffkz0.e.C;
        batl.s(fdch0);
        boolean z = ffgp.k();
        if(ffgp.m()) {
            evql0 = evrg.c(new IllegalStateException("Terms not available on watch"));
        }
        else {
            int v = ffkz0.c;
            Context context0 = fdch0.i;
            gged_interceptors gged0 = fddj.e(v, context0, z);
            if(gged0 == null) {
                v1 = v;
                object0 = null;
            }
            else {
                ggdy ggdy0 = new ggdy();
                int v2 = 0;
                while(v2 < ((ggna)gged0).c) {
                    fddf fddf0 = (fddf)gged0.get(v2);
                    String s = context0.getString(fddf0.c);
                    Locale locale0 = Locale.getDefault();
                    String s1 = fdcm.a(context0);
                    Locale locale1 = s1 == null ? null : new Locale(locale0.getLanguage(), s1);
                    ArrayList arrayList0 = ggia.d(new ghhr[]{ghih.f});
                    HashMap hashMap0 = new HashMap();
                    HashMap hashMap1 = new HashMap();
                    gfsx gfsx0 = gfsx.m(new HashMap());
                    gfsx gfsx1 = gfsx.m(new HashMap());
                    Object object1 = ((gftm)gfsx0).a;
                    if(!((Map)object1).isEmpty()) {
                        throw new RuntimeException("Dirty location data: Location-preserving parsers are not reusable.");
                    }
                    Object object2 = ((gftm)gfsx1).a;
                    if(!((Map)object2).isEmpty()) {
                        throw new RuntimeException("Dirty location data: Location-preserving parsers are not reusable.");
                    }
                    Locale locale2 = locale1;
                    LinkedList linkedList0 = new LinkedList();
                    HashMap hashMap2 = hashMap0;
                    ghig ghig0 = ghig.a;
                    int v3 = s.length();
                    int v4 = Math.min(0x7FFFFFFF, v3);
                    v4 = v4 <= 1 || !Character.isHighSurrogate(s.charAt(v4 - 1)) ? Math.min(0x7FFFFFFF, v3) : v4 - 1;
                    ghig ghig1 = ghig0;
                    int v5 = 0;
                    boolean z1 = false;
                    while(v5 < v3 && !z1) {
                        gftb.check(ghig1);
                        String s2 = s;
                        switch(ghig1.ordinal()) {
                            case 0: {
                                v6 = v3;
                                linkedList1 = linkedList0;
                                fddf1 = fddf0;
                                locale3 = locale2;
                                ArrayList arrayList1 = arrayList0;
                                s3 = s2;
                                hashMap3 = hashMap2;
                                locale4 = locale0;
                                v7 = v5;
                                v8 = v4;
                                while(true) {
                                    if(v7 >= v8) {
                                        arrayList2 = arrayList1;
                                        break;
                                    }
                                    arrayList2 = arrayList1;
                                    if(s3.charAt(v7) == 60 && v7 + 1 < v8) {
                                        int v9 = s3.charAt(v7 + 1);
                                        if(v9 == 0x2F || Character.isLetter(((char)v9)) || (v9 == 33 || v9 == 0x3F)) {
                                            ghhz ghhz0 = ghih.b(linkedList1);
                                            if(ghhz0 != null && !ghhz0.c) {
                                                ghhz ghhz1 = ghih.b(linkedList1);
                                                gftb.check(ghhz1);
                                                Pattern pattern0 = (Pattern)ghih.d.get(ghhz1.a);
                                                gftb.check(pattern0);
                                                if(pattern0.matcher(s3).region(v7 + 1, s3.length()).lookingAt()) {
                                                    ghig1 = ghig.b;
                                                    break;
                                                }
                                            }
                                            else {
                                                ghig1 = !s3.regionMatches(v7, "<!--", 0, 4) && !s3.regionMatches(v7, "<!", 0, 2) && !s3.regionMatches(v7, "<?", 0, 2) && (!s3.regionMatches(v7, "</", 0, 2) || v7 + 2 > s3.length() - 1 || !ghih.a.c(s3.charAt(v7 + 2))) ? ghig.b : ghig.c;
                                                break;
                                            }
                                        }
                                    }
                                    ++v7;
                                    arrayList1 = arrayList2;
                                }
                                if(v7 > v5) {
                                    String s4 = s3.substring(v5, v7);
                                    if(v7 == v8 && v8 < s3.length()) {
                                        Matcher matcher0 = ghih.b.matcher(s4);
                                        if(matcher0.find()) {
                                            int v10 = matcher0.start();
                                            v11 = v5 + v10;
                                            s4 = s4.substring(0, v10);
                                            goto label_90;
                                        }
                                    }
                                    v11 = v7;
                                label_90:
                                    if(v11 > v5) {
                                        ghih.e(new ghhx(s4, s4), v5, v11, linkedList1, gfsx0);
                                    }
                                }
                                if(v7 <= v5) {
                                    ghig2 = ghig0;
                                    if(ghig1 == ghig2) {
                                        z2 = false;
                                        goto label_99;
                                    }
                                }
                                else {
                                    ghig2 = ghig0;
                                }
                                z2 = true;
                            label_99:
                                gftb.q(z2);
                                ghig1 = ghig1;
                                break;
                            }
                            case 1: {
                                fddf1 = fddf0;
                                locale3 = locale2;
                                HashMap hashMap4 = hashMap2;
                                String s5 = s2;
                                locale4 = locale0;
                                LinkedList linkedList2 = linkedList0;
                                int v12 = v3;
                                gftb.checkTrue(s5.charAt(v5) == 60);
                                if(s5.charAt(v5 + 1) == 0x2F) {
                                    v13 = v5 + 2;
                                    v14 = 1;
                                }
                                else {
                                    v13 = v5 + 1;
                                    v14 = 0;
                                }
                                int v15 = v13;
                                while(true) {
                                    if(v15 < v12) {
                                        int v16 = s5.charAt(v15);
                                        v17 = v14;
                                        if(v16 != 0x2F && v16 != 62 && !ghih.a.c(((char)v16))) {
                                            ++v15;
                                            v14 = v17;
                                            continue;
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    v17 = v14;
                                    break;
                                }
                                if(v15 > v13) {
                                    v18 = v15;
                                    v19 = v13;
                                }
                                else {
                                    v19 = -1;
                                    v18 = -1;
                                }
                                String s6 = v19 == -1 || v18 == -1 ? null : s5.substring(v19, v18);
                                if(s6 == null) {
                                    if(v17 == 0) {
                                        ghih.e(new ghic("<", "<"), v5, v5 + 1, linkedList2, gfsx0);
                                        v20 = v5;
                                        v6 = v12;
                                        v21 = v4;
                                        s3 = s5;
                                        v22 = v13;
                                        arrayList3 = arrayList0;
                                        ghig3 = ghig0;
                                        hashMap3 = hashMap4;
                                        linkedList1 = linkedList2;
                                        goto label_387;
                                    }
                                    else {
                                        ghhq0 = ghih.c("", hashMap4);
                                        arrayList4 = arrayList0;
                                        goto label_160;
                                    }
                                    goto label_149;
                                }
                                else {
                                label_149:
                                    arrayList4 = arrayList0;
                                    ListIterator listIterator0 = arrayList4.listIterator(arrayList0.size());
                                    while(listIterator0.hasPrevious()) {
                                        ghhr ghhr0 = (ghhr)listIterator0.previous();
                                        String s7 = gfqz.c(s6);
                                        ghhq0 = (ghhq)ghhs.a.get(s7);
                                        if(ghhq0 == null) {
                                            continue;
                                        }
                                        goto label_158;
                                    }
                                    ghhq0 = null;
                                label_158:
                                    if(ghhq0 == null) {
                                        ghhq0 = ghih.c(s6, hashMap4);
                                    }
                                }
                            label_160:
                                ghif ghif0 = new ghif(s5);
                                int v23 = v15;
                                int v24 = v23;
                                ArrayList arrayList5 = null;
                                while(v23 < v12) {
                                    gfsx2 = gfsx0;
                                    int v25 = s5.charAt(v23);
                                    if(v23 + 1 < v12 && v25 == 0x2F) {
                                        if(s5.charAt(v23 + 1) == 62) {
                                            v26 = ghih.c.contains(ghhq0) ^ 1;
                                            v20 = v5;
                                            v6 = v12;
                                            arrayList3 = arrayList4;
                                            v21 = v4;
                                            v27 = v15;
                                            hashMap3 = hashMap4;
                                            ghhq1 = ghhq0;
                                            v28 = v24;
                                            s8 = s5;
                                            v29 = v23 + 1;
                                            linkedList1 = linkedList2;
                                            goto label_362;
                                        }
                                        else {
                                            v25 = 0x2F;
                                        }
                                    }
                                    if(v25 == 62) {
                                        v20 = v5;
                                        v6 = v12;
                                        arrayList3 = arrayList4;
                                        v21 = v4;
                                        v27 = v15;
                                        linkedList1 = linkedList2;
                                        ghhq1 = ghhq0;
                                        v28 = v24;
                                        v26 = 0;
                                        s8 = s5;
                                        v29 = v23;
                                        hashMap3 = hashMap4;
                                        goto label_362;
                                    }
                                    else if(v17 != 0 && v25 == 60) {
                                        v20 = v5;
                                        v6 = v12;
                                        linkedList1 = linkedList2;
                                        v22 = v23;
                                        ghih.d(ghhq0, v20, v22, s5, linkedList1, gfsx2);
                                        arrayList3 = arrayList4;
                                        v21 = v4;
                                        hashMap3 = hashMap4;
                                        s3 = s5;
                                        gfsx0 = gfsx2;
                                        ghig3 = ghig0;
                                        goto label_387;
                                    }
                                    else {
                                        gfsx gfsx3 = gfsx2;
                                        int v30 = v23;
                                        gfrx gfrx0 = ghih.a;
                                        if(gfrx0.c(((char)v25))) {
                                            arrayList6 = arrayList4;
                                            v31 = v4;
                                            v32 = v15;
                                            gfsx4 = gfsx3;
                                            v33 = v24;
                                            ++v23;
                                        }
                                        else {
                                            ghif0.d = -1;
                                            ghif0.e = -1;
                                            ghif0.f = -1;
                                            ghif0.g = -1;
                                            ghif0.h = false;
                                            ghif0.b = null;
                                            ghif0.c = null;
                                            String s9 = ghif0.a;
                                            v31 = v4;
                                            gftb.checkTrue(s9.charAt(v30) != 62);
                                            if(v30 == v12) {
                                                v32 = v15;
                                                v34 = v30;
                                            }
                                            else {
                                                v34 = v23 + 1;
                                                while(true) {
                                                    v32 = v15;
                                                    if(v34 >= v12) {
                                                        break;
                                                    }
                                                    int v35 = s9.charAt(v34);
                                                    if(v35 == 0x2F || v35 == 61 || v35 == 62 || gfrx0.c(((char)v35))) {
                                                        break;
                                                    }
                                                    ++v34;
                                                    v15 = v32;
                                                }
                                                ghif0.d = v30;
                                                ghif0.e = v34;
                                            }
                                            gftb.q(v34 > v30);
                                            ghif0.c();
                                            int v36 = ghif0.a(v34, v12);
                                            if(v36 != v12 && s9.charAt(v36) == 61) {
                                                v33 = ghif0.a(v36 + 1, v12);
                                                if(v33 == v12) {
                                                    gfsx4 = gfsx3;
                                                }
                                                else {
                                                    int v37 = s9.charAt(v33);
                                                    if(ghih.e.c(((char)v37))) {
                                                        ghif0.h = true;
                                                        ++v33;
                                                        int v38;
                                                        for(v38 = v33; v38 < v12 && s9.charAt(v38) != v37; ++v38) {
                                                        }
                                                        ghif0.f = v33;
                                                        ghif0.g = v38;
                                                        if(v38 < v12) {
                                                            ++v38;
                                                        }
                                                        gfsx4 = gfsx3;
                                                    }
                                                    else {
                                                        int v39 = v33;
                                                        while(true) {
                                                            if(v39 < v12) {
                                                                int v40 = s9.charAt(v39);
                                                                gfsx4 = gfsx3;
                                                                if(v40 != 62 && !gfrx0.c(((char)v40))) {
                                                                    ++v39;
                                                                    gfsx3 = gfsx4;
                                                                    continue;
                                                                }
                                                                else {
                                                                    break;
                                                                }
                                                            }
                                                            gfsx4 = gfsx3;
                                                            break;
                                                        }
                                                        ghif0.f = v33;
                                                        ghif0.g = v39;
                                                        v38 = v39;
                                                    }
                                                    gftb.q(v33 >= 0);
                                                    gftb.q(ghif0.g >= 0);
                                                    gftb.q(ghif0.f <= ghif0.g);
                                                    gftb.q(v38 <= v12);
                                                    v33 = v38;
                                                }
                                            }
                                            else {
                                                gfsx4 = gfsx3;
                                                v33 = v34;
                                            }
                                            ArrayList arrayList7 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            gftb.checkTrue(v24 < v33);
                                            String s10 = ghif0.c();
                                            gftb.q(true);
                                            ListIterator listIterator1 = arrayList4.listIterator(arrayList4.size());
                                            while(true) {
                                                if(listIterator1.hasPrevious()) {
                                                    ghhr ghhr1 = (ghhr)listIterator1.previous();
                                                    arrayList6 = arrayList4;
                                                    String s11 = gfqz.c(s10);
                                                    ghhj ghhj0 = (ghhj)ghhs.b.get(s11);
                                                    if(ghhj0 == null) {
                                                        arrayList4 = arrayList6;
                                                        continue;
                                                    }
                                                    else {
                                                        ghhj1 = ghhj0;
                                                        break;
                                                    }
                                                }
                                                arrayList6 = arrayList4;
                                                ghhj1 = null;
                                                break;
                                            }
                                            if(ghif0.c == null) {
                                                int v41 = ghif0.f;
                                                if(v41 == -1) {
                                                    s12 = s10;
                                                }
                                                else {
                                                    s12 = s10;
                                                    int v42 = ghif0.g;
                                                    if(v42 != -1) {
                                                        ghif0.c = s9.substring(v41, v42);
                                                    }
                                                }
                                            }
                                            else {
                                                s12 = s10;
                                            }
                                            String s13 = ghif0.c == null ? null : ghie.a(ghif0.c);
                                            if(ghhj1 == null) {
                                                String s14 = s5.substring(v24, v33);
                                                String s15 = s12.toLowerCase();
                                                ghhj ghhj2 = (ghhj)hashMap1.get(s15);
                                                if(ghhj2 == null) {
                                                    ghhj2 = new ghhj(s15, 0);
                                                    hashMap1.put(s15, ghhj2);
                                                }
                                                ghia ghia0 = ghid.a(ghhj2, s13, s14);
                                                arrayList7.add(ghia0);
                                                gftb.checkTrue(true);
                                                ((Map)object2).put(ghia0, ghif0.b());
                                            }
                                            else {
                                                ghia ghia1 = ghid.a(ghhj1, s13, s5.substring(v24, v33));
                                                arrayList7.add(ghia1);
                                                gftb.checkTrue(true);
                                                ((Map)object2).put(ghia1, ghif0.b());
                                            }
                                            v23 = v33;
                                            arrayList5 = arrayList7;
                                        }
                                        gftb.q(v23 > v30);
                                        v12 = v12;
                                        v5 = v5;
                                        s5 = s5;
                                        linkedList2 = linkedList2;
                                        gfsx0 = gfsx4;
                                        hashMap4 = hashMap4;
                                        arrayList4 = arrayList6;
                                        v15 = v32;
                                        ghhq0 = ghhq0;
                                        v24 = v33;
                                        v4 = v31;
                                        continue;
                                    }
                                    break;
                                }
                                v29 = v23;
                                v28 = v24;
                                s8 = s5;
                                v20 = v5;
                                v6 = v12;
                                arrayList3 = arrayList4;
                                v21 = v4;
                                v27 = v15;
                                gfsx2 = gfsx0;
                                hashMap3 = hashMap4;
                                linkedList1 = linkedList2;
                                ghhq1 = ghhq0;
                                v26 = 0;
                            label_362:
                                if(v29 == v6) {
                                    gftb.q(v20 < v6);
                                    ghih.e(new ghic(s8.substring(v20, v6), s8.substring(v20, v6)), v20, v6, linkedList1, gfsx2);
                                    v22 = v6;
                                    gfsx0 = gfsx2;
                                    s3 = s8;
                                    ghig3 = ghig0;
                                }
                                else {
                                    gftb.q(s8.charAt(v29) == 62);
                                    v22 = v29 + 1;
                                    if(v17 == 0) {
                                        gfsx0 = gfsx2;
                                        s3 = s8;
                                        ghig3 = v26 != 0 || !ghhs.c.equals(ghhq1) && !ghhs.d.equals(ghhq1) ? ghig0 : ghig.d;
                                        gftb.checkTrue(v20 < v27);
                                        gftb.checkTrue(v27 <= v28);
                                        gftb.checkTrue(v28 <= v22);
                                        String s16 = s3.substring(v20, v27);
                                        String s17 = s3.substring(v28, v22);
                                        ghih.e((v26 == 0 ? new ghhz(ghhq1, arrayList5, false, s16, s17) : new ghhz(ghhq1, arrayList5, true, s16, s17)), v20, v22, linkedList1, gfsx0);
                                    }
                                    else {
                                        ghih.d(ghhq1, v20, v22, s8, linkedList1, gfsx2);
                                        s3 = s8;
                                        gfsx0 = gfsx2;
                                        ghig3 = ghig0;
                                    }
                                }
                            label_387:
                                gftb.q(v22 > v20);
                                ghig1 = ghig3;
                                v7 = v22;
                                arrayList2 = arrayList3;
                                ghig2 = ghig0;
                                v8 = v21;
                                break;
                            }
                            case 2: {
                                fddf1 = fddf0;
                                locale3 = locale2;
                                locale4 = locale0;
                                gftb.checkTrue(s2.regionMatches(v5, "<!--", 0, 4) || s2.regionMatches(v5, "<!", 0, 2) || s2.regionMatches(v5, "<?", 0, 2) || s2.regionMatches(v5, "</", 0, 2) && ghih.a.c(s2.charAt(v5 + 2)));
                                if(s2.regionMatches(v5, "<!--", 0, 4)) {
                                    int v43 = s2.indexOf("-->", v5 + 2);
                                    v44 = v43 == -1 ? v3 : v43 + 3;
                                    ghih.e(new ghhv(s2.substring(v5, v44)), v5, v44, linkedList0, gfsx0);
                                    ghig4 = ghig0;
                                }
                                else if(s2.length() < v5 + 9 || !"doctype".equalsIgnoreCase(s2.substring(v5 + 2, v5 + 9))) {
                                    ghig4 = ghig0;
                                    v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                }
                                else if(v5 + 9 >= v3) {
                                    v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                    ghig4 = ghig0;
                                }
                                else {
                                    gfrx gfrx1 = ghih.a;
                                    if(gfrx1.c(s2.charAt(v5 + 9))) {
                                        int v45 = ghih.a(v5 + 9, s2);
                                        ghig4 = ghig0;
                                        int v46 = v45 + 4;
                                        if(s2.length() < v46 || !"html".equalsIgnoreCase(s2.substring(v45, v46))) {
                                            v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                        }
                                        else if(v46 >= v3) {
                                            v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                        }
                                        else if(!gfrx1.c(s2.charAt(v46)) && s2.charAt(v46) != 62) {
                                            v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                        }
                                        else {
                                            int v47 = ghih.a(v46, s2);
                                            if(s2.charAt(v47) == 62) {
                                                v44 = v47 + 1;
                                                gftb.checkTrue(s2.length() >= v44);
                                                ghih.e(new ghhv("<!--" + s2.substring(v5 + 2, v47) + "-->"), v5, v44, linkedList0, gfsx0);
                                            }
                                            else {
                                                v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                            }
                                        }
                                    }
                                    else {
                                        v44 = ghih.g(v5, v3, s2, linkedList0, gfsx0);
                                        ghig4 = ghig0;
                                    }
                                }
                                gftb.q(v44 > v5);
                                v6 = v3;
                                arrayList2 = arrayList0;
                                ghig2 = ghig4;
                                ghig1 = ghig2;
                                hashMap3 = hashMap2;
                                v7 = v44;
                                linkedList1 = linkedList0;
                                v8 = v4;
                                s3 = s2;
                                break;
                            }
                            case 3: {
                                ghhq ghhq2 = ((ghhz)linkedList0.get(linkedList0.size() - 1)).a;
                                gftb.q(ghhs.c.equals(ghhq2) || ghhs.d.equals(ghhq2));
                                int v48 = v5;
                                while(true) {
                                    if(v48 < v3) {
                                        v49 = v3;
                                        fddf1 = fddf0;
                                        locale3 = locale2;
                                        hashMap5 = hashMap2;
                                        ghig2 = ghig0;
                                        locale4 = locale0;
                                        linkedList3 = linkedList0;
                                        s18 = s2;
                                        v50 = v48;
                                        if(s2.regionMatches(true, v48, "</" + ghhq2.a, 0, ghhq2.a.length())) {
                                            break;
                                        }
                                        else {
                                            v3 = v49;
                                            hashMap2 = hashMap5;
                                            linkedList0 = linkedList3;
                                            s2 = s18;
                                            fddf0 = fddf1;
                                            locale0 = locale4;
                                            locale2 = locale3;
                                            ghig0 = ghig2;
                                            v48 = v50 + 1;
                                            continue;
                                        }
                                    }
                                    fddf1 = fddf0;
                                    v50 = v48;
                                    v49 = v3;
                                    locale3 = locale2;
                                    hashMap5 = hashMap2;
                                    ghig2 = ghig0;
                                    s18 = s2;
                                    locale4 = locale0;
                                    linkedList3 = linkedList0;
                                    break;
                                }
                                if(v50 > v5) {
                                    ghih.e(new ghhu(s18.substring(v5, v50)), v5, v50, linkedList3, gfsx0);
                                }
                                gftb.q(v50 > v5 || ghig.b != ghig.d);
                                ghig1 = ghig.b;
                                v6 = v49;
                                linkedList1 = linkedList3;
                                arrayList2 = arrayList0;
                                v8 = v4;
                                hashMap3 = hashMap5;
                                v7 = v50;
                                s3 = s18;
                                break;
                            }
                            default: {
                                throw new Error("Unknown state!");
                            }
                        }
                        if(v7 >= v8 && v8 < v6) {
                            s = s3;
                            v4 = v8;
                            linkedList0 = linkedList1;
                            arrayList0 = arrayList2;
                            locale0 = locale4;
                            hashMap2 = hashMap3;
                            v = v;
                            ggdy0 = ggdy0;
                            locale2 = locale3;
                            z1 = true;
                        }
                        else {
                            s = s3;
                            v4 = v8;
                            linkedList0 = linkedList1;
                            arrayList0 = arrayList2;
                            locale0 = locale4;
                            hashMap2 = hashMap3;
                            v = v;
                            ggdy0 = ggdy0;
                            locale2 = locale3;
                            z1 = false;
                        }
                        ghig0 = ghig2;
                        v3 = v6;
                        v5 = v7;
                        fddf0 = fddf1;
                        context0 = context0;
                    }
                    Locale locale5 = locale0;
                    Locale locale6 = locale2;
                    ArrayList arrayList8 = new ArrayList(linkedList0.size());
                    LinkedList linkedList4 = new LinkedList();
                    for(Object object3: linkedList0) {
                        ghhy ghhy0 = (ghhy)object3;
                        if((ghhy0 instanceof ghib)) {
                            linkedList4.add(((ghib)ghhy0));
                        }
                        else {
                            ghih.f(linkedList4, arrayList8, gfsx0);
                            arrayList8.add(ghhy0);
                        }
                    }
                    ghih.f(linkedList4, arrayList8, gfsx0);
                    gfsx.m(object1);
                    int v51 = 0;
                    while(v51 < arrayList8.size()) {
                        ghhy ghhy1 = (ghhy)arrayList8.get(v51);
                        if((ghhy1 instanceof ghhz)) {
                            ghhj ghhj3 = new ghhj("href", 1);
                            List list0 = ((ghhz)ghhy1).b;
                            if(list0 != null) {
                                for(Object object4: list0) {
                                    ghia2 = (ghia)object4;
                                    if(!ghia2.a.equals(ghhj3)) {
                                        continue;
                                    }
                                    goto label_550;
                                }
                            }
                            ghia2 = null;
                        label_550:
                            if(ghia2 == null) {
                                locale7 = locale5;
                                locale8 = locale6;
                            }
                            else if(z) {
                                ghia2.b(ghia2.a());
                                locale7 = locale5;
                                locale8 = locale6;
                            }
                            else if(ghia2.a().equals("https://policies.google.com/terms/location")) {
                                locale7 = locale5;
                                locale8 = locale6;
                                if(locale8 != null) {
                                    ghia2.b(fdcl.a(ghia2.a(), locale8));
                                }
                            }
                            else {
                                locale7 = locale5;
                                ghia2.b(fdcl.a(ghia2.a(), locale7));
                                locale8 = locale6;
                            }
                        }
                        else {
                            locale7 = locale5;
                            locale8 = locale6;
                        }
                        ++v51;
                        locale5 = locale7;
                        locale6 = locale8;
                    }
                    StringBuilder stringBuilder0 = new StringBuilder(arrayList8.size() * 10);
                    for(Object object5: arrayList8) {
                        ((ghhy)object5).c(stringBuilder0);
                    }
                    fcfj fcfj0 = new fcfj();
                    fcfj0.c(0);
                    fcfj0.b = "";
                    fcfj0.a(false);
                    fcfj0.d = null;
                    fcfj0.b(0);
                    fcfj0.b = stringBuilder0.toString();
                    fcfj0.a(fddf0.g);
                    fcfj0.c(fddf0.f);
                    Integer integer0 = fddf0.a;
                    if(integer0 == null) {
                        context1 = context0;
                    }
                    else {
                        context1 = context0;
                        fcfj0.d = context1.getString(integer0.intValue());
                    }
                    fdcn fdcn0 = fddf0.b;
                    if(fdcn0 != null) {
                        switch(fdcn0.ordinal()) {
                            case 0: {
                                fcfj0.b(1);
                                break;
                            }
                            case 1: {
                                fcfj0.b(2);
                                break;
                            }
                            case 2: {
                                fcfj0.b(3);
                            }
                        }
                    }
                    if(fcfj0.f == 7) {
                        String s19 = fcfj0.b;
                        if(s19 != null) {
                            ggdy0.i(new Term(fcfj0.a, s19, fcfj0.c, fcfj0.d, null, fcfj0.e));
                            ++v2;
                            ggdy0 = ggdy0;
                            context0 = context1;
                            z = z;
                            gged0 = gged0;
                            v = v;
                            continue;
                        }
                    }
                    StringBuilder stringBuilder1 = new StringBuilder();
                    if((fcfj0.f & 1) == 0) {
                        stringBuilder1.append(" termType");
                    }
                    if(fcfj0.b == null) {
                        stringBuilder1.append(" description");
                    }
                    if((fcfj0.f & 2) == 0) {
                        stringBuilder1.append(" isExplicitConsent");
                    }
                    if((fcfj0.f & 4) == 0) {
                        stringBuilder1.append(" optInType");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder1.toString());
                }
                v1 = v;
                object0 = ggdy0.h();
            }
            evql0 = object0 == null ? evrg.c(new IllegalStateException("No terms available for " + v1)) : evrg.d(object0);
            ffkz0 = this;
        }
        evql0.z(new ffky(ffkz0.d));
    }
}

