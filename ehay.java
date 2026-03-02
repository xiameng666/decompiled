import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class ehay {
    static final String[] a;
    public static final int b;
    private static final Pattern c;

    static {
        ehay.c = Pattern.compile("[^0-9#*+]");
        ehay.a = new String[]{"starred", "custom_ringtone", "send_to_voicemail", "pinned"};
    }

    public static Map a(List list0, gghp gghp0, boolean z) {
        ehav ehav0;
        Long long1;
        egzv egzv1;
        Map map0 = new HashMap();
        Iterator iterator0 = list0.iterator();
    label_2:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = ((ehge)object0).a;
            egzv egzv0 = ((ehge)object0).b;
            if(!ehay.h(egzv0, false)) {
                List list1 = gghp0.g(s);
                if(hxba.y()) {
                    Collections.sort(list1, new ehaw());
                }
                Long long0 = egzv0.d;
                long v = (long)long0;
                Iterator iterator1 = list1.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        continue label_2;
                    }
                    Object object1 = iterator1.next();
                    egzv1 = (egzv)object1;
                    long1 = egzv1.d;
                    if(((long)long1) != v && !ehay.h(egzv1, true)) {
                        List list2 = egzv0.I;
                        List list3 = egzv1.I;
                        if(ehjs.i(list2) && ehjs.i(list3)) {
                        label_35:
                            if(ehay.e(egzv0.r, egzv1.r) && ehay.e(egzv0.K, egzv1.K)) {
                                break;
                            }
                        }
                        else if(!ehjs.i(list2) && !ehjs.i(list3)) {
                            HashSet hashSet0 = new HashSet();
                            for(Object object2: list2) {
                                hashSet0.add(ehay.d(((ContentValues)object2).get("data1").toString()));
                            }
                            HashSet hashSet1 = new HashSet();
                            for(Object object3: list3) {
                                hashSet1.add(ehay.d(((ContentValues)object3).get("data1").toString()));
                            }
                            if(hashSet1.equals(hashSet0)) {
                                goto label_35;
                            }
                        }
                    }
                }
                if(z) {
                    eggh eggh0 = egzv1.m;
                    ehav0 = eggh0 == null ? new ehav(((long)long1), eggh.a) : new ehav(((long)long1), eggh0);
                }
                else {
                    ehav0 = null;
                }
                map0.put(long0, ehav0);
            }
        }
        return map0;
    }

    public static Set b(List list0, Context context0, ehbp ehbp0, Account account0) {
        gghp gghp0 = ehfr.a(list0, context0, ehbp0, account0);
        Set set0 = new HashSet();
        Iterator iterator0 = list0.iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            egzv egzv0 = ((ehge)object0).b;
            List list1 = gghp0.g(((ehge)object0).a);
            if(!list1.isEmpty()) {
                if(hxba.y()) {
                    Collections.sort(list1, new ehax());
                }
                for(Object object1: list1) {
                    egzv egzv1 = (egzv)object1;
                    List list2 = egzv1.I;
                    List list3 = egzv0.I;
                    if(ehjs.i(list3)) {
                    label_33:
                        List list4 = egzv1.r;
                        List list5 = egzv0.r;
                        if(ehjs.i(list5)) {
                            continue label_3;
                        }
                        if(!ehjs.i(list4)) {
                            HashSet hashSet2 = new HashSet();
                            for(Object object4: list5) {
                                hashSet2.add(((ContentValues)object4).get("data1").toString());
                            }
                            HashSet hashSet3 = new HashSet();
                            for(Object object5: list4) {
                                hashSet3.add(((ContentValues)object5).get("data1").toString());
                            }
                            if(hashSet3.containsAll(hashSet2)) {
                                continue label_3;
                            }
                        }
                    }
                    else {
                        if(ehjs.i(list2)) {
                            continue;
                        }
                        HashSet hashSet0 = new HashSet();
                        for(Object object2: list3) {
                            hashSet0.add(ehay.d(((ContentValues)object2).get("data1").toString()));
                        }
                        HashSet hashSet1 = new HashSet();
                        for(Object object3: list2) {
                            hashSet1.add(ehay.d(((ContentValues)object3).get("data1").toString()));
                        }
                        if(hashSet1.containsAll(hashSet0)) {
                            goto label_33;
                        }
                    }
                }
            }
            set0.add(egzv0);
        }
        return set0;
    }

    static boolean c(Set set0, long v, Cursor cursor0) {
        int v1 = cursor0.getInt(cursor0.getColumnIndex("starred"));
        int v2 = cursor0.getInt(cursor0.getColumnIndex("send_to_voicemail"));
        String s = cursor0.getString(cursor0.getColumnIndex("custom_ringtone"));
        int v3 = cursor0.getInt(cursor0.getColumnIndex("pinned"));
        return set0.contains(Long.valueOf(v)) && v1 == 0 && v2 == 0 && TextUtils.isEmpty(s) && v3 == 0;
    }

    private static String d(String s) {
        String s1 = Locale.getDefault().getCountry();
        if(gfqz.e(s1, Locale.US.getCountry()) || gfqz.e(s1, Locale.CANADA.getCountry())) {
            s = ehay.c.matcher(s).replaceAll("");
        }
        return PhoneNumberUtils.formatNumber(s);
    }

    private static boolean e(List list0, List list1) {
        if(ehjs.i(list0) && ehjs.i(list1)) {
            return true;
        }
        if(!ehjs.i(list0) && !ehjs.i(list1)) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.add(((ContentValues)object0).get("data1").toString());
            }
            HashSet hashSet1 = new HashSet();
            for(Object object1: list1) {
                hashSet1.add(((ContentValues)object1).get("data1").toString());
            }
            return hashSet1.equals(hashSet0);
        }
        return false;
    }

    private static boolean f(List list0) {
        if(!ehay.g(list0)) {
            return false;
        }
        for(Object object0: list0) {
            if(!TextUtils.isEmpty(((ContentValues)object0).getAsString("data1"))) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(Collection collection0) {
        return !ehjs.i(collection0);
    }

    private static boolean h(egzv egzv0, boolean z) {
        if(!ehay.f(egzv0.n) && !ehay.g(egzv0.o) && !ehay.g(egzv0.q) && !ehay.f(egzv0.s) && !ehay.g(egzv0.t) && !ehay.g(egzv0.u) && !ehay.g(egzv0.v)) {
            List list0 = egzv0.w;
            if(ehay.g(list0)) {
                for(Object object0: list0) {
                    ContentValues contentValues0 = (ContentValues)object0;
                    if((!z || !"6".equals(contentValues0.getAsString("group_sourceid"))) && contentValues0.getAsLong("data1") != null) {
                        return true;
                    }
                }
            }
            if(!ehay.g(egzv0.y) && !ehay.g(egzv0.z) && !ehay.f(egzv0.A) && !ehay.g(egzv0.B) && !ehay.g(egzv0.C) && !ehay.g(egzv0.D) && !ehay.f(egzv0.F) && !ehay.f(egzv0.G) && !ehay.g(egzv0.H)) {
                List list1 = egzv0.J;
                if(ehay.g(list1)) {
                    for(Object object1: list1) {
                        if(!TextUtils.isEmpty(((ContentValues)object1).getAsString("data15")) || ((ContentValues)object1).getAsLong("data14") != null || !TextUtils.isEmpty(((ContentValues)object1).getAsString("display_photo"))) {
                            return true;
                        }
                    }
                }
                return ehay.f(egzv0.L) || ehay.f(egzv0.M) || ehay.f(egzv0.N) || egzv0.k;
            }
        }
        return true;
    }
}

