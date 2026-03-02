import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ehfu {
    protected final Set a;
    public final ehab b;
    public final ehim c;

    public ehfu(ehbp ehbp0, Account account0, ehab ehab0, ehim ehim0) {
        Set set0;
        if(ehag.o(ehbp0, account0)) {
            set0 = null;
        }
        else {
            List list0 = ehag.n(ehbp0, account0, ehag.b);
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                egzx egzx0 = (egzx)object0;
                if(!TextUtils.isEmpty(egzx0.k)) {
                    hashSet0.add(egzx0.k);
                }
            }
            set0 = hashSet0;
        }
        this.a = set0;
        this.b = ehab0;
        this.c = ehim0;
    }

    public final void a(Context context0, egzv egzv0, egzv egzv1) {
        egzv[] arr_egzv;
        egiv.R();
        boolean z = hwzc.a.c().aJ();
        Boolean.valueOf(z).getClass();
        if(z) {
            List list0 = egzv1.J;
            if(!ehjs.i(list0)) {
                for(Object object0: list0) {
                    Long long0 = ((ContentValues)object0).getAsLong("data_version");
                    Long long1 = ((ContentValues)object0).getAsLong("data_sync4");
                    boolean z1 = ehhl.k(((ContentValues)object0));
                    boolean z2 = ehhl.j(((ContentValues)object0));
                    if(((ContentValues)object0).get("data15") == null || !z2 && (z1 || ehie.b(long0, long1))) {
                        continue;
                    }
                    arr_egzv = new egzv[]{egzv0, egzv1};
                    goto label_21;
                }
            }
            if(!ehjs.i(egzv0.J) && !egzv0.j) {
                arr_egzv = new egzv[]{egzv0, egzv1};
                goto label_21;
            }
        }
        else {
            arr_egzv = new egzv[]{egzv0, egzv1};
        label_21:
            for(int v = 0; v < 2; ++v) {
                egzv egzv2 = arr_egzv[v];
                if(egzv2 != null) {
                    List list1 = egzv2.J;
                    if(list1 != null) {
                        list1.clear();
                    }
                    Iterator iterator1 = egzv2.O.iterator();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        if(ehhl.l(((ContentValues)object1))) {
                            iterator1.remove();
                        }
                    }
                }
            }
        }
        ehhm ehhm0 = ehhn.a();
        ehhm0.b(egzv0);
        ehhm0.a = egzv1;
        this.c(context0, ehhm0.a(), 3);
        this.b.b.m(egzv1.d);
    }

    public final void b(egzv egzv0) {
        this.b.b.j(egzv0.d, egzv0.m, egzv0.f);
    }

    // This method was un-flattened
    public final void c(Context context0, ehhn ehhn0, int v) {
        boolean z22;
        boolean z12;
        ArrayList arrayList4;
        ehim ehim2;
        egzv egzv2;
        boolean z11;
        boolean z21;
        boolean z20;
        Iterator iterator7;
        boolean z17;
        boolean z16;
        egzv egzv3;
        List list14;
        Iterator iterator5;
        Long long2;
        ehac ehac1;
        ArrayList arrayList6;
        boolean z8;
        Collection collection0;
        List list4;
        boolean z7;
        List list3;
        boolean z4;
        Long long0;
        Integer integer0;
        egzv egzv0 = (egzv)ehhn0.b;
        egzv egzv1 = (egzv)ehhn0.a;
        batl.s(egzv1);
        boolean z = ehfu.d(v);
        ehab ehab0 = this.b;
        ehad ehad0 = ehab0.b;
        if(!egzv1.h) {
            Set set0 = this.a;
            if(set0 == null) {
                goto label_15;
            }
            List list0 = egzv1.w;
            if(list0 != null) {
                for(Object object0: list0) {
                    if(!set0.contains(((ContentValues)object0).getAsString("group_sourceid"))) {
                        continue;
                    }
                label_15:
                    if(egzv0 == null) {
                        if(z) {
                            this.c.h(girk.b, gjgi.b, true, 1, 1);
                        }
                        Uri uri0 = ehad0.a;
                        ehad0.g(uri0, egzv1.a);
                        ContentValues contentValues0 = egzv1.a();
                        egiv.R();
                        integer0 = ehad0.a(uri0, contentValues0, ((boolean)(egiv.v().booleanValue() ^ 1)));
                        egzv0 = null;
                        long0 = null;
                        goto label_51;
                    }
                    else {
                        boolean z1 = ((Boolean)ehij.b.mr()).booleanValue();
                        boolean z2 = ((Boolean)ehij.a.mr()).booleanValue();
                        if(z) {
                            ehim ehim0 = this.c;
                            girk girk0 = girk.c;
                            gjgi gjgi0 = gjgi.b;
                            ehim0.h(girk0, gjgi0, true, 1, 1);
                            if(egzv0.g) {
                                if(z2) {
                                    ehim0.h(girk0, gjgi0, true, 3, 1);
                                }
                                else {
                                    ehim0.h(girk0, gjgi0, true, 4, 1);
                                }
                            }
                        }
                        Long long1 = egzv0.d;
                        if(!z2 || v != 1) {
                            if(z1 && v == 1) {
                                ehad0.q(egzv0, egzv1, 3);
                            }
                            else {
                                ehad0.q(egzv0, egzv1, 1);
                            }
                            long0 = long1;
                            integer0 = null;
                        label_51:
                            ehim ehim1 = this.c;
                            List list1 = egzv1.O;
                            List list2 = egzv0 == null ? null : egzv0.O;
                            boolean z3 = ehfu.d(v);
                            egiv.R();
                            if(!egiv.o().booleanValue()) {
                                z4 = false;
                            }
                            else if(((ehiv)ehim1).m && (v == 1 || v == 3) && (egzv0 == null || !egzv0.g || v != 1) && (egzv0 != null && egzv0.g && (egzv0.e != null && ((long)egzv0.e) == 1L) || v != 3)) {
                                z4 = true;
                            }
                            else {
                                z4 = false;
                            }
                            ArrayList arrayList0 = new ArrayList();
                            boolean z5 = ehjs.i(list1);
                            boolean z6 = ehjs.i(list2);
                            if(!z5) {
                            label_69:
                                ehac ehac0 = ehab0.e;
                                HashMap hashMap0 = new HashMap();
                                ArrayList arrayList1 = new ArrayList();
                                if(z5) {
                                    list3 = list2;
                                    z7 = z4;
                                    list4 = null;
                                    collection0 = null;
                                    goto label_151;
                                }
                                else if(z6) {
                                    z7 = z4;
                                    list4 = list1;
                                    list3 = null;
                                    collection0 = null;
                                    goto label_151;
                                }
                                else {
                                    if(hxcf.d()) {
                                        for(Object object1: list2) {
                                            ContentValues contentValues1 = (ContentValues)object1;
                                            if(ehhl.h(contentValues1)) {
                                                efuo.h(contentValues1, ((ehiv)ehim1).C);
                                            }
                                        }
                                    }
                                    if(hxau.c()) {
                                        ArrayList arrayList2 = new ArrayList();
                                        if(!((ehiv)ehim1).D) {
                                            for(Object object2: list2) {
                                                ContentValues contentValues2 = (ContentValues)object2;
                                                if(ehhl.g(contentValues2)) {
                                                    arrayList2.add(contentValues2);
                                                }
                                            }
                                            list2.removeAll(arrayList2);
                                        }
                                    }
                                    List list5 = ehgf.c(hashMap0);
                                    List list6 = ehgf.d(hashMap0);
                                    batl.b(ehhl.e(new Collection[]{list5, list6}));
                                    ArrayList arrayList3 = new ArrayList();
                                    ehhj ehhj0 = new ehhj(ehac0, z4, arrayList3);
                                    ehhl.c(list1, list2, ehhl.a, list5, list6, ehhj0);
                                    if(z4) {
                                        arrayList0.addAll(arrayList3);
                                        z8 = true;
                                    }
                                    else {
                                        z8 = false;
                                    }
                                    List list7 = ehgf.c(hashMap0);
                                    List list8 = ehgf.d(hashMap0);
                                    boolean z9 = list7.isEmpty();
                                    boolean z10 = list8.isEmpty();
                                    if(!z9) {
                                    label_127:
                                        if(z9) {
                                            z7 = z8;
                                            list3 = list8;
                                            list4 = null;
                                            collection0 = null;
                                        }
                                        else if(z10) {
                                            z7 = z8;
                                            list4 = list7;
                                            list3 = null;
                                            collection0 = null;
                                        }
                                        else {
                                            List list9 = ehgf.c(hashMap0);
                                            List list10 = ehgf.d(hashMap0);
                                            List list11 = ehgf.a(hashMap0);
                                            List list12 = ehgf.b(hashMap0);
                                            batl.b(!list9.isEmpty() && !list10.isEmpty() && ehhl.e(new Collection[]{list11, list12, arrayList1}));
                                            ehhi ehhi0 = new ehhi(arrayList1);
                                            ehhl.c(list9, list10, ehhl.b, list11, list12, ehhi0);
                                            List list13 = ehgf.a(hashMap0);
                                            list3 = ehgf.b(hashMap0);
                                            collection0 = arrayList1;
                                            list4 = list13;
                                            z7 = z8;
                                        }
                                    label_151:
                                        ArrayList arrayList5 = new ArrayList();
                                        ehim ehim3 = ehim1;
                                        if(!ehjs.i(list4)) {
                                            boolean z13 = hxcf.c();
                                            for(Object object3: list4) {
                                                ContentValues contentValues3 = (ContentValues)object3;
                                                ehhl.d(contentValues3);
                                                ehhl.b(contentValues3, 0L);
                                                if(ehhl.g(contentValues3)) {
                                                    try {
                                                        long2 = hwyi.n() ? egda.c(context0, 1, egcv.a(contentValues3), true) : null;
                                                    }
                                                    catch(egdi egdi0) {
                                                        egig.c("FSA2_CallingCardOp", "Failed to create calling card", egdi0);
                                                        long2 = (long)0L;
                                                    }
                                                    if(((long)long2) <= 0L) {
                                                        egig.k("FSA2_DataItemProcessor", "Failed to create calling card.");
                                                        z4 = z4;
                                                        continue;
                                                    }
                                                    else {
                                                        contentValues3.put("data1", long2);
                                                        contentValues3.put("is_primary", Integer.valueOf(1));
                                                        if(hxau.a.b().d()) {
                                                            Long long3 = contentValues3.getAsLong("data_sync4");
                                                            if(long3 != null) {
                                                                contentValues3.put("data_sync4", Long.valueOf(((long)long3) + 1L));
                                                            }
                                                        }
                                                        eham.c(contentValues3);
                                                    }
                                                }
                                                ehac0.b(ehac0.a, contentValues3, long0, integer0, false);
                                                if(z7) {
                                                    arrayList5.add(contentValues3);
                                                }
                                                if(z13 && ehhl.i(contentValues3)) {
                                                    ehim3.h(girk.b, gjgi.i, z3, 1, 1);
                                                    arrayList5 = arrayList5;
                                                    ehac0 = ehac0;
                                                    ehim3 = ehim3;
                                                }
                                                else {
                                                    arrayList5 = arrayList5;
                                                    ehac0 = ehac0;
                                                }
                                                arrayList0 = arrayList0;
                                                z4 = z4;
                                            }
                                        }
                                        z11 = z4;
                                        arrayList4 = arrayList0;
                                        arrayList6 = arrayList5;
                                        ehim2 = ehim3;
                                        ehac1 = ehac0;
                                        ArrayList arrayList7 = new ArrayList();
                                        if(!ehjs.i(list3)) {
                                            Iterator iterator4 = list3.iterator();
                                            while(iterator4.hasNext()) {
                                                Object object4 = iterator4.next();
                                                ContentValues contentValues4 = (ContentValues)object4;
                                                Long long4 = contentValues4.getAsLong("data_sync4");
                                                boolean z14 = long4 != null;
                                                egiv.R();
                                                boolean z15 = hwzc.a.c().aN();
                                                Boolean.valueOf(z15).getClass();
                                                if(z15) {
                                                    z14 = long4 != null && ((long)long4) != 0L;
                                                }
                                                if(z14) {
                                                    iterator5 = iterator4;
                                                    egzv3 = egzv0;
                                                    list14 = list3;
                                                    z16 = false;
                                                }
                                                else {
                                                    if(ehhl.l(contentValues4) && contentValues4.getAsLong("data_version") != null && ((long)contentValues4.getAsLong("data_version")) == 0L) {
                                                        iterator5 = iterator4;
                                                        list14 = list3;
                                                        egzv3 = egzv0;
                                                        int v1 = 0;
                                                        while(v1 < 4) {
                                                            if(TextUtils.isEmpty(contentValues4.getAsString(new String[]{"data_sync4", "data_sync2", "data_sync3", "data14"}[v1]))) {
                                                                ++v1;
                                                                continue;
                                                            }
                                                            else {
                                                                goto label_237;
                                                            }
                                                            break;
                                                        }
                                                        z16 = true;
                                                        contentValues4.getAsLong("data_id");
                                                    }
                                                    else {
                                                        iterator5 = iterator4;
                                                        egzv3 = egzv0;
                                                        list14 = list3;
                                                    }
                                                label_237:
                                                    if(!z16) {
                                                        if(z7) {
                                                            arrayList7.add(contentValues4);
                                                        }
                                                        iterator4 = iterator5;
                                                        list3 = list14;
                                                        egzv0 = egzv3;
                                                        continue;
                                                    }
                                                }
                                                if(ehhl.g(contentValues4) && contentValues4.getAsLong("data1") != null) {
                                                    z17 = z16;
                                                    egda.d(context0, contentValues4.getAsLong("data1").longValue());
                                                }
                                                else {
                                                    z17 = z16;
                                                }
                                                ehac1.d(contentValues4.getAsLong("data_id"), false);
                                                if(ehhl.l(contentValues4) && !z17) {
                                                    ehim2.h(girk.d, gjgi.d, true, 1, 1);
                                                }
                                                iterator4 = iterator5;
                                                list3 = list14;
                                                egzv0 = egzv3;
                                            }
                                        }
                                        egzv2 = egzv0;
                                        ArrayList arrayList8 = new ArrayList();
                                        if(!ehjs.i(collection0)) {
                                            boolean z18 = hxcf.c();
                                            Iterator iterator6 = ((List)collection0).iterator();
                                            while(iterator6.hasNext()) {
                                                Object object5 = iterator6.next();
                                                ContentValues contentValues5 = ((ehho)object5).b;
                                                ContentValues contentValues6 = ((ehho)object5).a;
                                                egiv.R();
                                                Boolean.valueOf(true).getClass();
                                                if(ehhl.l(contentValues5)) {
                                                    egiv.R();
                                                    boolean z19 = hwzc.a.c().aO();
                                                    Boolean.valueOf(z19).getClass();
                                                    if(z19 && ehhl.j(contentValues5)) {
                                                        if(z3) {
                                                            iterator7 = iterator6;
                                                            z20 = true;
                                                            goto label_296;
                                                        }
                                                        else {
                                                            z20 = false;
                                                            goto label_294;
                                                        }
                                                        goto label_282;
                                                    }
                                                }
                                                else {
                                                label_282:
                                                    Long long5 = contentValues5.getAsLong("data_sync4");
                                                    if(long5 != null) {
                                                        if(((long)long5) >= 10L) {
                                                            if(!ehie.b(contentValues5.getAsLong("data_version"), long5)) {
                                                                iterator7 = iterator6;
                                                                z20 = z3;
                                                                goto label_296;
                                                            }
                                                        }
                                                        else if(((long)long5) == 0L) {
                                                            iterator7 = iterator6;
                                                            z20 = z3;
                                                            goto label_296;
                                                        }
                                                    }
                                                }
                                                z20 = z3;
                                            label_294:
                                                if(ehhl.h(contentValues5) && z20 && ((ehiv)ehim2).B && !ehhl.f(contentValues6) && ehhl.f(contentValues5)) {
                                                    iterator7 = iterator6;
                                                }
                                                else {
                                                    goto label_301;
                                                }
                                            label_296:
                                                if(z7) {
                                                    arrayList8.add(contentValues5);
                                                }
                                                if(z18 && ehhl.i(contentValues5)) {
                                                    ehim2.h(girk.c, gjgi.i, z20, 3, 1);
                                                    goto label_329;
                                                label_301:
                                                    iterator7 = iterator6;
                                                    ehhl.b(contentValues6, ehhl.a(contentValues5));
                                                    Long long6 = contentValues5.getAsLong("data_id");
                                                    ehhl.d(contentValues6);
                                                    if(ehhl.g(contentValues6) && contentValues5.getAsLong("data1") != null) {
                                                        Long long7 = contentValues5.getAsLong("data1");
                                                        Long long8 = contentValues5.getAsLong("x_data_version");
                                                        contentValues6.put("x_calling_card_id", long7);
                                                        contentValues6.put("x_assert_data_version", long8);
                                                        try {
                                                            if(hwyi.n()) {
                                                                String s = contentValues6.getAsString("mimetype");
                                                                if(s == null || !s.equals("vnd.android.cursor.item/calling_card")) {
                                                                    throw new egdi(1, "Invalid Calling Card Mimetype");
                                                                }
                                                                Long long9 = contentValues6.getAsLong("x_calling_card_id");
                                                                if(long9 == null) {
                                                                    long9 = null;
                                                                }
                                                                if(long9 == null) {
                                                                    throw new egdi(1, "Invalid Calling Card ID");
                                                                }
                                                                egda.e(context0, long9.longValue(), egcv.a(contentValues6), true);
                                                            }
                                                        }
                                                        catch(egdi egdi1) {
                                                            egig.c("FSA2_CallingCardOp", "Failed to update calling card", egdi1);
                                                        }
                                                        eham.c(contentValues6);
                                                    }
                                                    ehac1.l(long6, contentValues6);
                                                    if(z7) {
                                                        arrayList8.add(contentValues6);
                                                    }
                                                    if(z18 && ehhl.i(contentValues6)) {
                                                        ehim2.h(girk.c, gjgi.i, z20, 4, 1);
                                                    }
                                                }
                                            label_329:
                                                z18 = z18;
                                                iterator6 = iterator7;
                                            }
                                            ((List)collection0).size();
                                        }
                                        egiv.R();
                                        if(!egiv.v().booleanValue()) {
                                            z21 = z3;
                                        }
                                        else if(z3) {
                                            ehac1.b.g();
                                            z21 = true;
                                        }
                                        else {
                                            z21 = false;
                                        }
                                        if(z7) {
                                            arrayList4.addAll(arrayList6);
                                            arrayList4.addAll(arrayList7);
                                            arrayList4.addAll(arrayList8);
                                        }
                                        z12 = z21;
                                    }
                                    else if(z10) {
                                    label_120:
                                        z11 = z4;
                                        egzv2 = egzv0;
                                        ehim2 = ehim1;
                                        arrayList4 = arrayList0;
                                        z12 = z3;
                                    }
                                    else {
                                        z10 = false;
                                        goto label_127;
                                    }
                                }
                            }
                            else if(!z6) {
                                z6 = false;
                                goto label_69;
                            }
                            else {
                                goto label_120;
                            }
                            if(z11) {
                                gfsx gfsx0 = ehhg.c(list1, arrayList4);
                                if(gfsx0.i()) {
                                    ehil ehil0 = (ehil)gfsx0.d();
                                    gjgi gjgi1 = gjgi.b;
                                    ehim2.t((egzv2 == null ? girk.b : girk.c), gjgi1, z12, ehil0, 1);
                                    if(egzv2 != null && z12 && (hxco.a.b().e() && (ehil0.c == 3 || ehil0.c == 4) && (!hxco.a.b().g() || hxco.a.b().b().b.contains(Integer.valueOf(ehil0.b - 1))) && ((long)((ehiv)ehim2).F) < hxco.a.b().a())) {
                                        ehad ehad1 = this.b.b;
                                        Long long10 = egzv2.d;
                                        ehad1.p(long10);
                                        if(hxco.d()) {
                                            ContentValues contentValues7 = new ContentValues();
                                            contentValues7.put("sync3", Long.valueOf(1L));
                                            ehad1.e(ehad1.a, long10, contentValues7, true);
                                        }
                                        ehim2.t(girk.c, gjgi1, true, ehil0, 3);
                                    }
                                }
                            }
                        }
                        else if(!egzv0.g) {
                            ehad0.q(egzv0, egzv1, 2);
                            long0 = long1;
                            integer0 = null;
                            goto label_51;
                        }
                    }
                    return;
                }
            }
        }
        if(z) {
            this.c.h(girk.d, gjgi.b, true, 1, 1);
            z22 = true;
        }
        else {
            z22 = false;
        }
        if(egzv0 == null) {
            this.c.h(girk.d, gjgi.b, z22, 3, 1);
            return;
        }
        if(egzv0.g) {
            this.c.h(girk.d, gjgi.b, z22, 4, 1);
        }
        ehad0.d(egzv0.d, true);
    }

    private static boolean d(int v) {
        return v == 1 || v == 2;
    }
}

