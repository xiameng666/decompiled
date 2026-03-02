import android.content.ContentValues;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ehhg implements Comparator {
    static final Set a;
    static final String[] b;
    static final String[] c;
    static final ggeo d;
    private static final ehhg e;
    private static final ehhg f;
    private static final Map g;
    private final boolean h;

    static {
        ehhg.a = new HashSet();
        ehhg.b = new String[0];
        ehhg.c = new String[]{"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "group_sourceid", "data_sync1", "data_sync2", "data_sync3", "is_primary", "x_calling_card_data", "x_sync1", "x_sync2"};
        ggek ggek0 = new ggek();
        ggek0.i("data1", gjhf.d);
        ggek0.i("data2", gjhf.e);
        ggek0.i("data3", gjhf.f);
        ggek0.i("data4", gjhf.g);
        ggek0.i("data5", gjhf.h);
        ggek0.i("data6", gjhf.i);
        ggek0.i("data7", gjhf.j);
        ggek0.i("data8", gjhf.k);
        ggek0.i("data9", gjhf.l);
        ggek0.i("data10", gjhf.m);
        ggek0.i("data11", gjhf.n);
        ggek0.i("data12", gjhf.o);
        ggek0.i("data13", gjhf.p);
        ggek0.i("data14", gjhf.q);
        ggek0.i("data15", gjhf.r);
        ggek0.i("data_sync1", gjhf.u);
        ggek0.i("data_sync2", gjhf.v);
        ggek0.i("data_sync3", gjhf.w);
        ggek0.i("group_sourceid", gjhf.t);
        ggek0.i("is_primary", gjhf.s);
        ehhg.d = ggek0.b();
        ehhg.e = new ehhg(true);
        ehhg.f = new ehhg(false);
        ehhg.g = new HashMap();
    }

    private ehhg(boolean z) {
        this.h = z;
    }

    public final int a(ContentValues contentValues0, ContentValues contentValues1) {
        if(contentValues0 == null || contentValues1 == null) {
            throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
        }
        int v = ehhg.e("mimetype", contentValues0, contentValues1);
        if(v != 0) {
            contentValues0.getAsString("mimetype");
            contentValues1.getAsString("mimetype");
            return v;
        }
        String s = contentValues0.getAsString("mimetype");
        Map map0 = ehhg.g;
        ehhh ehhh0 = (ehhh)map0.get(s);
        if(ehhh0 == null) {
            ehhh0 = ehhg.f(s);
            map0.put(s, ehhh0);
        }
        if(this.h) {
            Set set0 = ehhh0.b();
            return ehhg.d(contentValues0, contentValues1, ehhh0.d(), set0);
        }
        return ehhg.d(contentValues0, contentValues1, ehhh0.a(), ehhg.a);
    }

    public static ehhg b(boolean z) {
        return z ? ehhg.e : ehhg.f;
    }

    public static gfsx c(List list0, List list1) {
        gfsx gfsx0;
        gfsx gfsx1;
        Collections.sort(list0, ehhg.e);
        Collections.sort(list1, ehhg.e);
        Iterator iterator0 = list0.iterator();
        Iterator iterator1 = list1.iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            ContentValues contentValues0 = (ContentValues)object0;
            Object object1 = iterator1.next();
            ContentValues contentValues1 = (ContentValues)object1;
            if(contentValues0 == null || contentValues1 == null) {
                throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
            }
            int v = ehhg.e("mimetype", contentValues0, contentValues1);
            if(v == 0) {
                String s = contentValues0.getAsString("mimetype");
                Map map0 = ehhg.g;
                ehhh ehhh0 = (ehhh)map0.get(s);
                if(ehhh0 == null) {
                    ehhh0 = ehhg.f(s);
                    map0.put(s, ehhh0);
                }
                Set set0 = ehhh0.b();
                String[] arr_s = ehhh0.d();
                int v3 = 0;
                while(true) {
                    if(v3 < arr_s.length) {
                        String s1 = arr_s[v3];
                        if(ehhg.g(s1, set0) && ehhg.e(s1, contentValues0, contentValues1) != 0) {
                            gfsx1 = gfsx.m(((gjhf)ehhg.d.getOrDefault(s1, gjhf.a)));
                            break;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    gfsx1 = gfqx.a;
                    break;
                }
                if(gfsx1.i()) {
                    gjhf gjhf0 = (gjhf)gfsx1.d();
                }
                gfsx0 = gfsx1.i() ? gfsx.m(new ehil(efuq.a(contentValues1), ((gjhf)gfsx1.d()), ehhg.h(contentValues1.getAsLong("data_version"), contentValues1.getAsLong("data_sync4")))) : gfqx.a;
            }
            else {
                contentValues0.getAsString("mimetype");
                contentValues1.getAsString("mimetype");
                if(v < 0) {
                    gfsx0 = gfsx.m(new ehil(efuq.a(contentValues0), gjhf.b, 1));
                }
                else {
                    int v1 = efuq.a(contentValues1);
                    int v2 = ehhg.h(contentValues1.getAsLong("data_version"), contentValues1.getAsLong("data_sync4"));
                    gfsx0 = gfsx.m(new ehil(v1, gjhf.c, v2));
                }
            }
            if(!gfsx0.i()) {
                continue;
            }
            return gfsx0;
        }
        if(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            return gfsx.m(new ehil(efuq.a(((ContentValues)object2)), gjhf.b, 1));
        }
        if(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            int v4 = efuq.a(((ContentValues)object3));
            int v5 = ehhg.h(((ContentValues)object3).getAsLong("data_version"), ((ContentValues)object3).getAsLong("data_sync4"));
            return gfsx.m(new ehil(v4, gjhf.c, v5));
        }
        return gfqx.a;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.a(((ContentValues)object0), ((ContentValues)object1));
    }

    private static int d(ContentValues contentValues0, ContentValues contentValues1, String[] arr_s, Set set0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(ehhg.g(s, set0)) {
                int v1 = ehhg.e(s, contentValues0, contentValues1);
                if(v1 != 0) {
                    return v1;
                }
            }
        }
        return 0;
    }

    private static int e(String s, ContentValues contentValues0, ContentValues contentValues1) {
        String s1 = contentValues0.getAsString(s);
        String s2 = contentValues1.getAsString(s);
        if("null".equals(s1)) {
            s1 = null;
        }
        if("null".equals(s2)) {
            s2 = null;
        }
        if(s1 == null && s2 == null) {
            return 0;
        }
        if(s1 == null) {
            return -1;
        }
        return s2 == null ? 1 : s1.compareToIgnoreCase(s2);
    }

    private static ehhh f(String s) {
        switch(s) {
            case "vnd.android.cursor.item/bestie": {
                return new ehgg();
            }
            case "vnd.android.cursor.item/calling_card": {
                return new ehgi();
            }
            case "vnd.android.cursor.item/contact_event": {
                return new ehgk();
            }
            case "vnd.android.cursor.item/email_v2": {
                return new ehgj();
            }
            case "vnd.android.cursor.item/group_membership": {
                return new ehgo();
            }
            case "vnd.android.cursor.item/identity": {
                return new ehgq();
            }
            case "vnd.android.cursor.item/im": {
                return new ehgr();
            }
            case "vnd.android.cursor.item/name": {
                return new ehgv();
            }
            case "vnd.android.cursor.item/nickname": {
                return new ehgw();
            }
            case "vnd.android.cursor.item/note": {
                return new ehgx();
            }
            case "vnd.android.cursor.item/organization": {
                return new ehgy();
            }
            case "vnd.android.cursor.item/phone_v2": {
                return new ehgz();
            }
            case "vnd.android.cursor.item/photo": {
                return new ehha();
            }
            case "vnd.android.cursor.item/postal-address_v2": {
                return new ehhb();
            }
            case "vnd.android.cursor.item/relation": {
                return new ehhc();
            }
            case "vnd.android.cursor.item/sip_address": {
                return new ehhd();
            }
            case "vnd.android.cursor.item/website": {
                return new ehhf();
            }
            case "vnd.com.google.cursor.item/contact_calendar_link": {
                return new ehgh();
            }
            case "vnd.com.google.cursor.item/contact_extended_property": {
                return new ehgl();
            }
            case "vnd.com.google.cursor.item/contact_external_id": {
                return new ehgm();
            }
            case "vnd.com.google.cursor.item/contact_file_as": {
                return new ehgn();
            }
            case "vnd.com.google.cursor.item/contact_hobby": {
                return new ehgp();
            }
            case "vnd.com.google.cursor.item/contact_jot": {
                return new ehgs();
            }
            case "vnd.com.google.cursor.item/contact_language": {
                return new ehgt();
            }
            case "vnd.com.google.cursor.item/contact_misc": {
                return new ehgu();
            }
            case "vnd.com.google.cursor.item/contact_user_defined_field": {
                return new ehhe();
            }
            default: {
                throw new IllegalStateException("No matcher found for " + s);
            }
        }
    }

    private static boolean g(String s, Set set0) {
        return !set0.contains(s);
    }

    private static int h(Long long0, Long long1) {
        if(long1 == null) {
            return 4;
        }
        return ehie.b(long0, long1) ? 2 : 3;
    }
}

