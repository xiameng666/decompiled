import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dagger.internal.InstanceFactory;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ztd extends aaen {
    private ggfp f;
    private final boolean g;
    private final ggfp h;
    private tt i;
    private final ztl j;
    private final zut k;
    private final zvi l;
    private final zvf m;
    private final zua n;
    private final ztw o;
    private final ztt p;
    private final zul q;
    private final zui r;
    private final zri s;
    private final zsd t;
    private final zrf u;
    private final zsa v;

    public ztd(la la0, boolean z, aaev aaev0, ztl ztl0, zut zut0, zvi zvi0, zvf zvf0, zua zua0, ztw ztw0, ztt ztt0, zul zul0, zui zui0, zri zri0, zrf zrf0, zsd zsd0, zsa zsa0) {
        super(la0, aaev0);
        this.f = ggnj.a;
        this.h = ggfp.O(Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(1), Integer.valueOf(5), new Integer[]{((int)6)});
        this.j = ztl0;
        this.k = zut0;
        this.l = zvi0;
        this.m = zvf0;
        this.n = zua0;
        this.o = ztw0;
        this.p = ztt0;
        this.q = zul0;
        this.r = zui0;
        this.s = zri0;
        this.u = zrf0;
        this.t = zsd0;
        this.v = zsa0;
        this.g = z;
    }

    public final void G(grya grya0, aamm aamm0, aamk aamk0, List list0, aatc aatc0, String s, Set set0, boolean z) {
        boolean z5;
        grxr grxr0;
        zoh zoh1;
        boolean z4;
        boolean z3;
        boolean z2;
        gged_interceptors gged3;
        String s21;
        znw znw1;
        zof zof0;
        String s19;
        String s18;
        Object object8;
        Iterator iterator9;
        String s13;
        znw znw0;
        String s10;
        zod zod0;
        zoh zoh0;
        Iterator iterator1;
        ArrayList arrayList0 = new ArrayList();
        if(!hoju.j() && grya0 != null) {
            arrayList0.add(new ztx(grya0));
        }
        if(hoju.j() && aamm0 != null && aatc0 != null) {
            String s1 = aamm0.b.f;
            ibuq.e(s1, "getDisplayName(...)");
            zhu zhu0 = zia.a(aatc0);
            zht zht0 = zhz.a((aamm0.b.d == null ? grwp.a : aamm0.b.d));
            String s2 = aamm0.b.e;
            ibuq.e(s2, "getProfilePictureAccessibilityLabel(...)");
            arrayList0.add(new zpt(aamm0.a, s1, aamm0.c, zhu0, zht0, s2));
        }
        else if(aamm0 != null && aatc0 != null) {
            arrayList0.add(new zuu(aamm0.a, aamm0.b, aatc0, s));
        }
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            aamh aamh0 = (aamh)object0;
            grvb grvb0 = aamh0.b;
            grxw grxw0 = aamh0.a;
            if(hoju.j() && grvb0.b == 12) {
                grvn grvn0 = (grvn)grvb0.c;
                ibuq.f(grvn0, "collection");
                String s3 = grvn0.b;
                ibuq.e(s3, "getTitle(...)");
                String s4 = grvn0.c;
                ibuq.e(s4, "getDescription(...)");
                String s5 = grvn0.d;
                ibuq.e(s5, "getHyperlinkText(...)");
                zht zht1 = zhz.a((grvn0.e == null ? grwp.a : grvn0.e));
                hfuo hfuo0 = grvn0.f;
                iterator1 = iterator0;
                ibuq.e(hfuo0, "getStacksList(...)");
                ArrayList arrayList1 = new ArrayList(ibpo.q(hfuo0, 10));
                Iterator iterator2 = hfuo0.iterator();
                while(iterator2.hasNext()) {
                    Object object1 = iterator2.next();
                    grzd grzd0 = (grzd)object1;
                    ibuq.c(grzd0);
                    hfuo hfuo1 = grzd0.b;
                    ibuq.e(hfuo1, "getItemsList(...)");
                    hfuo hfuo2 = grzd0.c;
                    ibuq.e(hfuo2, "getFootersList(...)");
                    ArrayList arrayList2 = new ArrayList(ibpo.q(hfuo1, 10));
                    int v = 0;
                    Iterator iterator3 = hfuo1.iterator();
                    while(iterator3.hasNext()) {
                        Object object2 = iterator3.next();
                        if(v < 0) {
                            ibpo.m();
                        }
                        int v1 = grzd0.b.size();
                        boolean z1 = grzd0.d;
                        ibuq.c(((grzj)object2));
                        String s6 = ((grzj)object2).c;
                        ibuq.e(s6, "getTitle(...)");
                        String s7 = ((grzj)object2).d;
                        ibuq.e(s7, "getDescription(...)");
                        grwe grwe0 = ((grzj)object2).e;
                        if(grwe0 == null) {
                            grwe0 = grwe.a;
                        }
                        ibuq.e(grwe0, "getImage(...)");
                        zhr zhr0 = zhy.a(grwe0);
                        if(v1 == 1) {
                            zoh0 = zoh.d;
                        }
                        else if(v == 0) {
                            zoh0 = zoh.a;
                        }
                        else {
                            zoh0 = v == v1 - 1 ? zoh.c : zoh.b;
                        }
                        grwp grwp0 = ((grzj)object2).f;
                        if(grwp0 == null) {
                            grwp0 = grwp.a;
                        }
                        zht zht2 = zhz.a(grwp0);
                        hfuo hfuo3 = ((grzj)object2).g;
                        ibuq.e(hfuo3, "getContentUnitsList(...)");
                        ArrayList arrayList3 = new ArrayList(ibpo.q(hfuo3, 10));
                        Iterator iterator4 = hfuo3.iterator();
                        while(iterator4.hasNext()) {
                            Object object3 = iterator4.next();
                            grzl grzl0 = (grzl)object3;
                            ibuq.f(grzl0, "stackItemContentUnit");
                            int v2 = grzl0.b;
                            int v3 = grzk.a(v2);
                            if(v3 == 0) {
                                throw null;
                            }
                        alab1:
                            switch(v3 - 1) {
                                case 0: {
                                    grzo grzo0 = v2 == 1 ? ((grzo)grzl0.c) : grzo.a;
                                    ibuq.e(grzo0, "getStateChipUnit(...)");
                                    zod0 = aawe.b(grzo0);
                                    arrayList3.add(zod0);
                                    iterator4 = iterator4;
                                    grzd0 = grzd0;
                                    continue;
                                }
                                case 1: {
                                    grxk grxk0 = v2 == 2 ? ((grxk)grzl0.c) : grxk.a;
                                    ibuq.e(grxk0, "getProgressBarUnit(...)");
                                    float f = grxk0.b;
                                    String s8 = grxk0.c;
                                    ibuq.e(s8, "getLabelText(...)");
                                    gsad gsad0 = grxk0.d == null ? gsad.a : grxk0.d;
                                    ibuq.e(gsad0, "getBarForegroundColor(...)");
                                    zhx zhx0 = zib.a(gsad0);
                                    gsad gsad1 = grxk0.e == null ? gsad.a : grxk0.e;
                                    ibuq.e(gsad1, "getBarBackgroundColor(...)");
                                    zod0 = new znz(f, s8, zhx0, zib.a(gsad1));
                                    arrayList3.add(zod0);
                                    iterator4 = iterator4;
                                    grzd0 = grzd0;
                                    continue;
                                }
                                case 2: {
                                    gruv gruv0 = v2 == 3 ? ((gruv)grzl0.c) : gruv.a;
                                    ibuq.e(gruv0, "getAttributesUnit(...)");
                                    hfuo hfuo4 = gruv0.b;
                                    ibuq.e(hfuo4, "getAttributesList(...)");
                                    ArrayList arrayList4 = new ArrayList(ibpo.q(hfuo4, 10));
                                    for(Iterator iterator5 = hfuo4.iterator(); iterator5.hasNext(); iterator5 = iterator5) {
                                        Object object4 = iterator5.next();
                                        grwe grwe1 = ((gruu)object4).c;
                                        if(grwe1 == null) {
                                            grwe1 = grwe.a;
                                        }
                                        ibuq.e(grwe1, "getImage(...)");
                                        zhr zhr1 = zhy.a(grwe1);
                                        String s9 = ((gruu)object4).b;
                                        ibuq.e(s9, "getAttribute(...)");
                                        arrayList4.add(new zns(zhr1, s9));
                                    }
                                    zod0 = new znt(ggdx.a(arrayList4));
                                    arrayList3.add(zod0);
                                    iterator4 = iterator4;
                                    grzd0 = grzd0;
                                    continue;
                                }
                                case 3: {
                                    grwr grwr0 = v2 == 4 ? ((grwr)grzl0.c) : grwr.a;
                                    ibuq.e(grwr0, "getListPreviewUnit(...)");
                                    hfuo hfuo5 = grwr0.b;
                                    ibuq.e(hfuo5, "getItemsList(...)");
                                    ArrayList arrayList5 = new ArrayList();
                                    for(Object object5: hfuo5) {
                                        zhr zhr2 = zhy.a(((grwe)object5));
                                        if(zhr2 != null) {
                                            arrayList5.add(zhr2);
                                        }
                                    }
                                    zod0 = new znx(ggdx.a(arrayList5), grwr0.c);
                                    arrayList3.add(zod0);
                                    iterator4 = iterator4;
                                    grzd0 = grzd0;
                                    continue;
                                }
                                case 4: {
                                    int v4 = grzk.a(v2);
                                    switch(v4) {
                                        case 1: {
                                            s10 = "STATE_CHIP_UNIT";
                                            break alab1;
                                        }
                                        case 2: {
                                            s10 = "PROGRESS_BAR_UNIT";
                                            break alab1;
                                        }
                                        case 3: {
                                            s10 = "ATTRIBUTES_UNIT";
                                            break alab1;
                                        }
                                        case 4: {
                                            s10 = "LIST_PREVIEW_UNIT";
                                            break alab1;
                                        }
                                        default: {
                                            s10 = v4 == 5 ? "UNITTYPE_NOT_SET" : "null";
                                            break alab1;
                                        }
                                    }
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(v4 == 0) {
                                throw null;
                            }
                            zod0 = new zof(s10);
                            arrayList3.add(zod0);
                            iterator4 = iterator4;
                            grzd0 = grzd0;
                            continue;
                        }
                        gged_interceptors gged0 = ggdx.a(arrayList3);
                        hfuo hfuo6 = ((grzj)object2).h;
                        ibuq.e(hfuo6, "getTrailingUnitsList(...)");
                        ArrayList arrayList6 = new ArrayList(ibpo.q(hfuo6, 10));
                        for(Object object6: hfuo6) {
                            grzn grzn0 = (grzn)object6;
                            ibuq.c(grzn0);
                            ibuq.f(grzn0, "stackItemTrailingUnit");
                            int v5 = grzn0.b;
                            int v6 = grzm.a(v5);
                            if(v6 == 0) {
                                throw null;
                            }
                        alab2:
                            switch(v6 - 1) {
                                case 0: {
                                    grwg grwg0 = v5 == 1 ? ((grwg)grzn0.c) : grwg.a;
                                    ibuq.e(grwg0, "getImageUnit(...)");
                                    znw0 = aawe.a(grwg0);
                                    arrayList6.add(znw0);
                                    continue;
                                }
                                case 1: {
                                    grxg grxg0 = v5 == 2 ? ((grxg)grzn0.c) : grxg.a;
                                    ibuq.e(grxg0, "getProfilePictureUnit(...)");
                                    zhu zhu1 = zia.a(aatc0);
                                    String s11 = grxg0.b;
                                    ibuq.e(s11, "getAccessibilityTapText(...)");
                                    znw0 = new zny(zhu1, s11);
                                    arrayList6.add(znw0);
                                    continue;
                                }
                                case 2: {
                                    grzo grzo1 = v5 == 3 ? ((grzo)grzn0.c) : grzo.a;
                                    ibuq.e(grzo1, "getStateChipUnit(...)");
                                    znw0 = aawe.b(grzo1);
                                    arrayList6.add(znw0);
                                    continue;
                                }
                                case 3: {
                                    grvr grvr0 = v5 == 4 ? ((grvr)grzn0.c) : grvr.a;
                                    ibuq.e(grvr0, "getExpansionUnit(...)");
                                    String s12 = grvr0.b;
                                    ibuq.e(s12, "getLabel(...)");
                                    grwe grwe2 = grvr0.c == null ? grwe.a : grvr0.c;
                                    ibuq.e(grwe2, "getIcon(...)");
                                    zhr zhr3 = zhy.a(grwe2);
                                    gsad gsad2 = grvr0.d == null ? gsad.a : grvr0.d;
                                    ibuq.e(gsad2, "getForegroundColor(...)");
                                    zhx zhx1 = zib.a(gsad2);
                                    gsad gsad3 = grvr0.e == null ? gsad.a : grvr0.e;
                                    ibuq.e(gsad3, "getBackgroundColor(...)");
                                    znw0 = new znv(s12, zhr3, zhx1, zib.a(gsad3));
                                    arrayList6.add(znw0);
                                    continue;
                                }
                                case 4: {
                                    int v7 = grzm.a(v5);
                                    switch(v7) {
                                        case 1: {
                                            s13 = "IMAGE_UNIT";
                                            break alab2;
                                        }
                                        case 2: {
                                            s13 = "PROFILE_PICTURE_UNIT";
                                            break alab2;
                                        }
                                        case 3: {
                                            s13 = "STATE_CHIP_UNIT";
                                            break alab2;
                                        }
                                        case 4: {
                                            s13 = "EXPANSION_UNIT";
                                            break alab2;
                                        }
                                        default: {
                                            s13 = v7 == 5 ? "UNITTYPE_NOT_SET" : "null";
                                            break alab2;
                                        }
                                    }
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(v7 == 0) {
                                throw null;
                            }
                            znw0 = new zof(s13);
                            arrayList6.add(znw0);
                            continue;
                        }
                        arrayList2.add(new zoc(s6, s7, zhr0, zoh0, zht2, z1, gged0, ggdx.a(arrayList6)));
                        iterator3 = iterator3;
                        s5 = s5;
                        ++v;
                        grzd0 = grzd0;
                    }
                    gged_interceptors gged1 = ggdx.a(arrayList2);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator iterator8 = hfuo2.iterator();
                    while(iterator8.hasNext()) {
                        Object object7 = iterator8.next();
                        grze grze0 = (grze)object7;
                        ibuq.c(grze0);
                        String s14 = grze0.b;
                        ibuq.e(s14, "getDescription(...)");
                        if(s14.length() == 0) {
                            String s15 = grze0.c;
                            ibuq.e(s15, "getHyperlinkText(...)");
                            if(s15.length() == 0 && grze0.f.isEmpty() && grze0.g.isEmpty()) {
                                iterator9 = iterator8;
                                object8 = null;
                                goto label_340;
                            }
                        }
                        grwe grwe3 = grze0.e == null ? grwe.a : grze0.e;
                        ibuq.e(grwe3, "getImage(...)");
                        zhr zhr4 = zhy.a(grwe3);
                        String s16 = grze0.b;
                        ibuq.e(s16, "getDescription(...)");
                        String s17 = grze0.c;
                        ibuq.e(s17, "getHyperlinkText(...)");
                        zht zht3 = zhz.a((grze0.d == null ? grwp.a : grze0.d));
                        hfuo hfuo7 = grze0.f;
                        ibuq.e(hfuo7, "getContentUnitsList(...)");
                        iterator9 = iterator8;
                        ArrayList arrayList8 = new ArrayList(ibpo.q(hfuo7, 10));
                        Iterator iterator10 = hfuo7.iterator();
                        while(iterator10.hasNext()) {
                            Object object9 = iterator10.next();
                            grzg grzg0 = (grzg)object9;
                            ibuq.f(grzg0, "stackFooterContentUnit");
                            int v8 = grzg0.b;
                            int v9 = grzf.a(v8);
                            int v10 = v9 - 1;
                            if(v9 == 0) {
                                throw null;
                            }
                            if(v10 == 0) {
                                s18 = s17;
                                grui grui0 = v8 == 1 ? ((grui)grzg0.c) : grui.a;
                                ibuq.e(grui0, "getActionChipsUnit(...)");
                                hfuo hfuo8 = grui0.b;
                                ibuq.e(hfuo8, "getActionChipsList(...)");
                                ArrayList arrayList9 = new ArrayList(ibpo.q(hfuo8, 10));
                                for(Iterator iterator11 = hfuo8.iterator(); iterator11.hasNext(); iterator11 = iterator11) {
                                    Object object10 = iterator11.next();
                                    grwe grwe4 = ((grug)object10).d;
                                    if(grwe4 == null) {
                                        grwe4 = grwe.a;
                                    }
                                    ibuq.e(grwe4, "getIcon(...)");
                                    zhr zhr5 = zhy.a(grwe4);
                                    String s20 = ((grug)object10).c;
                                    ibuq.e(s20, "getText(...)");
                                    grwp grwp1 = ((grug)object10).e;
                                    if(grwp1 == null) {
                                        grwp1 = grwp.a;
                                    }
                                    arrayList9.add(new znq(zhr5, s20, zhz.a(grwp1)));
                                }
                                zof0 = new znr(ggdx.a(arrayList9));
                            }
                            else {
                                s18 = s17;
                                if(v10 != 1) {
                                    throw new ibnq();
                                }
                                int v11 = grzf.a(v8);
                                switch(v11) {
                                    case 1: {
                                        s19 = "ACTION_CHIPS_UNIT";
                                        break;
                                    }
                                    case 2: {
                                        s19 = "UNITTYPE_NOT_SET";
                                        break;
                                    }
                                    default: {
                                        s19 = "null";
                                    }
                                }
                                if(v11 == 0) {
                                    throw null;
                                }
                                zof0 = new zof(s19);
                            }
                            arrayList8.add(zof0);
                            iterator10 = iterator10;
                            s17 = s18;
                            continue;
                        }
                        gged_interceptors gged2 = ggdx.a(arrayList8);
                        hfuo hfuo9 = grze0.g;
                        ibuq.e(hfuo9, "getTrailingUnitsList(...)");
                        ArrayList arrayList10 = new ArrayList(ibpo.q(hfuo9, 10));
                        for(Object object11: hfuo9) {
                            grzi grzi0 = (grzi)object11;
                            ibuq.f(grzi0, "stackFooterTrailingUnit");
                            int v12 = grzi0.b;
                            int v13 = grzh.a(v12);
                            if(v13 == 0) {
                                throw null;
                            }
                        alab3:
                            switch(v13 - 1) {
                                case 0: {
                                    grwg grwg1 = v12 == 1 ? ((grwg)grzi0.c) : grwg.a;
                                    ibuq.e(grwg1, "getImageUnit(...)");
                                    znw1 = aawe.a(grwg1);
                                    arrayList10.add(znw1);
                                    continue;
                                }
                                case 1: {
                                    int v14 = grzh.a(v12);
                                    switch(v14) {
                                        case 1: {
                                            s21 = "IMAGE_UNIT";
                                            break alab3;
                                        }
                                        case 2: {
                                            s21 = "UNITTYPE_NOT_SET";
                                            break alab3;
                                        }
                                        default: {
                                            s21 = "null";
                                            break alab3;
                                        }
                                    }
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(v14 == 0) {
                                throw null;
                            }
                            znw1 = new zof(s21);
                            arrayList10.add(znw1);
                            continue;
                        }
                        object8 = new zob(zhr4, s16, s17, zht3, gged2, ggdx.a(arrayList10));
                    label_340:
                        if(object8 != null) {
                            arrayList7.add(object8);
                        }
                        iterator8 = iterator9;
                    }
                    arrayList1.add(new zoa(gged1, ggdx.a(arrayList7)));
                    iterator2 = iterator2;
                    s4 = s4;
                    grxw0 = grxw0;
                    s5 = s5;
                }
                arrayList0.add(new zog(grxw0, s3, s4, s5, zht1, ggdx.a(arrayList1)));
            }
            else {
                iterator1 = iterator0;
                if(grvb0.b == 1) {
                    arrayList0.add(new zun(grxw0, grvb0, aatc0));
                }
                else if(hoju.j() && grvb0.b == 2) {
                    grxm grxm0 = (grxm)grvb0.c;
                    ibuq.f(grxm0, "promptCarouselCard");
                    ibuq.f(set0, "expandedResourceKeys");
                    int v15 = grxm0.h > 0 ? grxm0.h : ((int)hojn.b());
                    ArrayList arrayList11 = new ArrayList();
                    for(Object object12: aamh0.c) {
                        if(((grxr)object12).c == 17) {
                            arrayList11.add(object12);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList();
                    for(Object object13: arrayList11) {
                        hfuo hfuo10 = grxm0.c;
                        grxw grxw1 = ((grxr)object13).e;
                        if(grxw1 == null) {
                            grxw1 = grxw.a;
                        }
                        if(hfuo10.contains(grxw1)) {
                            arrayList12.add(object13);
                        }
                    }
                    List list1 = ibpo.ag(arrayList12);
                    if(list1.isEmpty()) {
                        gged3 = ggna.a;
                        ibuq.e(gged3, "of(...)");
                    }
                    else {
                        int v16 = list1.size();
                        if(v16 < v15) {
                            v15 = v16;
                        }
                        List list2 = list1.subList(0, v15);
                        List list3 = ibpo.ah(list1, list2);
                        ggdy ggdy0 = new ggdy();
                        if(list3.isEmpty()) {
                            z3 = z;
                            z2 = false;
                        }
                        else if(z) {
                            z2 = false;
                            z3 = true;
                        }
                        else {
                            z2 = true;
                            z3 = false;
                        }
                        ArrayList arrayList13 = new ArrayList(ibpo.q(list2, 10));
                        int v17 = 0;
                        for(Object object14: list2) {
                            if(v17 < 0) {
                                ibpo.m();
                            }
                            if(v17 != 0) {
                                grxw grxw2 = ((grxr)object14).e;
                                if(grxw2 == null) {
                                    grxw2 = grxw.a;
                                }
                                if(!set0.contains(grxw2)) {
                                    z4 = false;
                                    goto label_415;
                                }
                            }
                            z4 = true;
                        label_415:
                            if(v17 == 0 && list2.size() == 1 && !z2) {
                                zoh1 = zoh.d;
                            }
                            else if(v17 == 0) {
                                zoh1 = zoh.a;
                            }
                            else if(v17 == list2.size() - 1 && z2) {
                                zoh1 = zoh.b;
                            }
                            else {
                                zoh1 = v17 == list2.size() - 1 ? zoh.c : zoh.b;
                            }
                            arrayList13.add(aawd.a(((grxr)object14), z4, zoh1, false));
                            ++v17;
                        }
                        ggdy0.k(ggdx.a(arrayList13));
                        if(!list3.isEmpty()) {
                            ArrayList arrayList14 = new ArrayList(ibpo.q(list3, 10));
                            int v18 = 0;
                            for(Object object15: list3) {
                                if(v18 < 0) {
                                    ibpo.m();
                                }
                                arrayList14.add(aawd.a(((grxr)object15), true, (v18 == list3.size() - 1 ? zoh.c : zoh.b), true));
                                ++v18;
                            }
                            ggdy ggdy1 = new ggdy();
                            if(hoju.d()) {
                                ArrayList arrayList15 = new ArrayList(ibpo.q(arrayList14, 10));
                                for(Object object16: arrayList14) {
                                    arrayList15.add(((aaex)object16).h);
                                }
                                gged_interceptors gged4 = ggdx.a(arrayList15);
                                String s22 = z3 ? grxm0.e : grxm0.d;
                                ibuq.c(s22);
                                String s23 = z3 ? grxm0.g : grxm0.f;
                                ibuq.c(s23);
                                ggdy1.i(new znp(gged4, s22, s23, z3, arrayList14.size()));
                            }
                            else {
                                ArrayList arrayList16 = new ArrayList(ibpo.q(arrayList14, 10));
                                for(Object object17: arrayList14) {
                                    ibuq.d(((aaex)object17), "null cannot be cast to non-null type com.google.android.gms.accountsettings.mg.poc.ui.card.advice.AdviceCardListItem1");
                                    arrayList16.add(((znm)(((aaex)object17))));
                                }
                                gged_interceptors gged5 = ggdx.a(arrayList16);
                                String s24 = grxm0.d;
                                ibuq.e(s24, "getOverflowExpandTitle(...)");
                                String s25 = grxm0.e;
                                ibuq.e(s25, "getOverflowCollapseTitle(...)");
                                String s26 = grxm0.f;
                                ibuq.e(s26, "getOverflowExpandAccessibilityTapText(...)");
                                String s27 = grxm0.g;
                                ibuq.e(s27, "getOverflowCollapseAccessibilityTapText(...)");
                                zno zno0 = new zno(gged5, s24, s26, s25, s27, z3, arrayList14.size());
                                z3 = z3;
                                ggdy1.i(zno0);
                            }
                            if(z3) {
                                ggdy1.k(arrayList14);
                            }
                            gged_interceptors gged6 = ggdy1.h();
                            ibuq.e(gged6, "build(...)");
                            ggdy0.k(gged6);
                        }
                        gged3 = ggdy0.h();
                        ibuq.e(gged3, "build(...)");
                    }
                    arrayList0.addAll(gged3);
                }
                else {
                    int v19 = grvb0.b;
                    if(v19 == 2) {
                        grxm grxm1 = (grxm)grvb0.c;
                        ggdy ggdy2 = new ggdy();
                        int v20 = 0;
                        Iterator iterator19 = grxm1.c.iterator();
                    label_489:
                        while(iterator19.hasNext()) {
                            Object object18 = iterator19.next();
                            grxw grxw3 = (grxw)object18;
                            gged_interceptors gged7 = aamh0.c;
                            int v21 = gged7.size();
                            int v22 = 0;
                            while(true) {
                                if(v22 >= v21) {
                                    continue label_489;
                                }
                                grxr0 = (grxr)gged7.get(v22);
                                if(grxr0.c == 17 && ((ProtoLiteMessage)(grxr0.e == null ? grxw.a : grxr0.e)).equals(grxw3)) {
                                    break;
                                }
                                ++v22;
                            }
                            if(!set0.contains((grxr0.e == null ? grxw.a : grxr0.e)) && (grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a).c != 400) {
                                if(v20 == 0) {
                                    v20 = 0;
                                }
                                else {
                                    z5 = false;
                                    goto label_507;
                                }
                            }
                            z5 = true;
                        label_507:
                            ggdy2.i(new znm((grxr0.e == null ? grxw.a : grxr0.e), (grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a), zoh.b, z5));
                            ++v20;
                        }
                        int v23 = (int)hojn.b();
                        gged_interceptors gged8 = ggdy2.h();
                        if(!z) {
                            int v24 = ((ggna)gged8).c;
                            if(v24 > v23) {
                                gged_interceptors gged9 = gged8.b(v23 - 1, v24);
                                zno zno1 = new zno(gged9, grxm1.d, grxm1.f, "", "", false, gged9.size());
                                ggdy ggdy3 = new ggdy();
                                ggdy3.k(gged8.b(0, v23 - 1));
                                ggdy3.i(zno1);
                                gged8 = ggdy3.h();
                            }
                        }
                        arrayList0.addAll(gged8);
                    }
                    else if(v19 == 10) {
                        if(hoju.j()) {
                            gryu gryu0 = grvb0.b == 10 ? ((gryu)grvb0.c) : gryu.a;
                            ibuq.f(gryu0, "segmentHeaderCard");
                            String s28 = gryu0.c;
                            ibuq.e(s28, "getTitle(...)");
                            String s29 = gryu0.d;
                            ibuq.e(s29, "getDescriptionText(...)");
                            String s30 = gryu0.f;
                            ibuq.e(s30, "getLinkText(...)");
                            arrayList0.add(new zoq(grxw0, s28, s29, s30, zhz.a((gryu0.h == null ? grwp.a : gryu0.h))));
                        }
                        else {
                            arrayList0.add(new zuc(grxw0, grvb0));
                        }
                    }
                }
            }
            iterator0 = iterator1;
        }
        if(aamk0 != null && !list0.isEmpty()) {
            if(hoju.j() && hoju.e()) {
                grxw grxw4 = aamk0.a;
                hfuo hfuo11 = aamk0.b.b;
                ibuq.e(hfuo11, "getItemsList(...)");
                ArrayList arrayList17 = new ArrayList(ibpo.q(hfuo11, 10));
                for(Object object19: hfuo11) {
                    String s31 = ((grvy)object19).b;
                    ibuq.e(s31, "getText(...)");
                    grwp grwp2 = ((grvy)object19).d;
                    if(grwp2 == null) {
                        grwp2 = grwp.a;
                    }
                    arrayList17.add(new zom(s31, zhz.a(grwp2)));
                }
                arrayList0.add(new zon(grxw4, ggdx.a(arrayList17)));
            }
            else {
                arrayList0.add(new ztm(aamk0.a, aamk0.b));
            }
        }
        this.jQ(arrayList0);
    }

    @Override  // lh
    public final Object c(int v) {
        return this.n(v);
    }

    @Override  // tk
    public final int dx(int v) {
        aaem aaem0 = this.n(v);
        int v1 = aael.a(aaem0.a());
        if(hoju.j() && v1 == 12) {
            return ((zog)aaem0).h.c;
        }
        return this.h.contains(Integer.valueOf(v1)) ? v1 : 0;
    }

    @Override  // aaen
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(hoju.j() && this.f.contains(Integer.valueOf(v))) {
            View view0 = layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false);  // layout:as_compose_view
            zem zem0 = (zem)this.j.a.a.get();
            aabl aabl0 = ((aabn)this.j.a.c).a();
            return new ztj(view0, zem0, ((aacf)((InstanceFactory)this.j.a.b).a), aabl0);
        }
        switch(v) {
            case 2: {
                View view3 = layoutInflater0.inflate(0x7F0E00B8, viewGroup0, false);  // layout:as_card
                ztd ztd0 = (ztd)this.k.a.a.get();
                zem zem3 = (zem)this.k.a.c.get();
                zor zor0 = ((zos)this.k.a.e).a();
                zoy zoy0 = ((zoz)this.k.a.f).a();
                zpe zpe0 = ((zpf)this.k.a.g).a();
                zpg zpg0 = ((zph)this.k.a.h).a();
                zpi zpi0 = ((zpj)this.k.a.i).a();
                zpk zpk0 = ((zpl)this.k.a.j).a();
                zpn zpn0 = ((zpo)this.k.a.k).a();
                zpp zpp0 = ((zpq)this.k.a.l).a();
                zpr zpr0 = ((zps)this.k.a.m).a();
                aauk aauk1 = ((aawg)this.k.a.n).a();
                return new zur(view3, ztd0, ((Boolean)((InstanceFactory)this.k.a.b).a).booleanValue(), zem3, ((aacf)((InstanceFactory)this.k.a.d).a), zor0, zoy0, zpe0, zpg0, zpi0, zpk0, zpn0, zpp0, zpr0, aauk1);
            }
            case 7: {
                if(hoju.j()) {
                    View view4 = layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false);  // layout:as_compose_view
                    aabl aabl1 = ((aabn)this.l.a.c).a();
                    return new zvg(view4, ((aacf)((InstanceFactory)this.l.a.a).a), ((aaca)((InstanceFactory)this.l.a.b).a), aabl1);
                }
                View view5 = layoutInflater0.inflate(0x7F0E00F0, viewGroup0, false);  // layout:as_welcome_screen_intro
                aabl aabl2 = ((aabn)this.m.a.d).a();
                fnle fnle0 = (fnle)this.m.a.f.get();
                return new zvd(view5, ((du)((InstanceFactory)this.m.a.a).a), ((aacf)((InstanceFactory)this.m.a.b).a), ((aaca)((InstanceFactory)this.m.a.c).a), aabl2, ((aabz)((InstanceFactory)this.m.a.e).a), fnle0);
            }
            default: {
                if(!hoju.j() && v == 1) {
                    return new zty(layoutInflater0.inflate(0x7F0E00DF, viewGroup0, false), ((ztd)this.n.a.a.get()), ((zem)this.n.a.b.get()), ((aacf)((InstanceFactory)this.n.a.c).a));  // layout:as_screen_intro
                }
                switch(v) {
                    case 5: {
                        return hoju.j() && hoju.e() ? new ztu(layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false), ((aacf)((InstanceFactory)this.o.a.a).a)) : new ztr(layoutInflater0.inflate(0x7F0E00CD, viewGroup0, false), ((aacf)((InstanceFactory)this.p.a.a).a));  // layout:as_compose_view
                    }
                    case 6: {
                        LayoutInflater layoutInflater1 = LayoutInflater.from(viewGroup0.getContext());
                        return hoju.j() ? new zuj(layoutInflater1.inflate(0x7F0E00D0, viewGroup0, false), ((aacf)((InstanceFactory)this.q.a.a).a)) : new zug(layoutInflater1.inflate(0x7F0E00E5, viewGroup0, false), ((zem)this.r.a.a.get()), ((aacf)((InstanceFactory)this.r.a.b).a));  // layout:as_compose_view
                    }
                    case 8: {
                        if(hoju.j() && hoju.d()) {
                            View view1 = layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false);  // layout:as_compose_view
                            zem zem1 = (zem)this.s.a.d.get();
                            return new zrg(view1, ((aacf)((InstanceFactory)this.s.a.a).a), ((aacd)((InstanceFactory)this.s.a.b).a), ((aacb)((InstanceFactory)this.s.a.c).a), zem1);
                        }
                        if(hoju.j()) {
                            int v1 = cchl.d() ? 0x7F160051 : 0x7F160053;  // style:AsAppThemeDarkWithExpressiveAdviceColors
                            layoutInflater0 = LayoutInflater.from(new adv(viewGroup0.getContext(), v1));
                        }
                        View view2 = layoutInflater0.inflate((hoju.j() ? 0x7F0E00B1 : 0x7F0E00B2), viewGroup0, false);  // layout:as_advice_card_item
                        zem zem2 = (zem)this.u.a.d.get();
                        aauk aauk0 = ((aawg)this.u.a.e).a();
                        return new zrd(view2, ((aacf)((InstanceFactory)this.u.a.a).a), ((aacb)((InstanceFactory)this.u.a.b).a), ((aacd)((InstanceFactory)this.u.a.c).a), zem2, aauk0);
                    }
                    case 9: {
                        if(hoju.j() && hoju.d()) {
                            return new zsb(layoutInflater0.inflate(0x7F0E00D0, viewGroup0, false), ((aace)((InstanceFactory)this.t.a.a).a));  // layout:as_compose_view
                        }
                        return hoju.j() ? new zry(layoutInflater0.inflate(0x7F0E00B5, viewGroup0, false), ((aace)((InstanceFactory)this.v.a.a).a)) : new zry(layoutInflater0.inflate(0x7F0E00B6, viewGroup0, false), ((aace)((InstanceFactory)this.v.a.a).a));  // layout:as_advice_overflow_card_item
                    }
                    default: {
                        return new aaet(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E00D1, viewGroup0, false), ((zem)this.e.a.a.get()));  // layout:as_error_banner
                    }
                }
            }
        }
    }

    @Override  // tk
    public final void fr(RecyclerView recyclerView0) {
        if(!hoju.j()) {
            tt tt0 = this.i;
            if(tt0 != null) {
                recyclerView0.ah(tt0);
            }
        }
    }

    @Override  // tk
    public final void hE(RecyclerView recyclerView0) {
        if(!hoju.j() && this.g) {
            Context context0 = recyclerView0.getContext();
            Drawable drawable0 = (Drawable)Objects.requireNonNull(cchs.f(context0, 0x7F040126));  // attr:asDivider
            Drawable drawable1 = (Drawable)Objects.requireNonNull(cchs.f(context0, 0x7F04013A));  // attr:asSegmentHeaderDivider
            zsf zsf0 = new zsf(gged_interceptors.m(new zum(drawable0), new zub(drawable1)));
            this.i = zsf0;
            recyclerView0.A(zsf0);
        }
    }

    @Override  // aaen
    public final void jQ(List list0) {
        ggfn ggfn0 = new ggfn();
        if(list0 != null) {
            for(Object object0: list0) {
                aaem aaem0 = (aaem)object0;
                if((aaem0 instanceof zog)) {
                    ggfn0.i(Integer.valueOf(((zog)aaem0).h.c));
                }
            }
        }
        this.f = ggfn0.h();
        super.jQ(list0);
    }

    public final aaem n(int v) {
        return (aaem)super.c(v);
    }
}

