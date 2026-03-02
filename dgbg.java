import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class dgbg {
    public final Context a;
    public final dgbi b;
    public final dgbl c;
    public final dgbj d;

    public dgbg(Context context0) {
        this.a = context0;
        this.b = new dgbi(context0);
        this.c = new dgbl(context0);
        this.d = new dgbj(context0);
    }

    public static void a(dbxx dbxx0, List list0) {
        for(Object object0: dbxx0.c) {
            dbxv dbxv0 = (dbxv)object0;
            int v1 = 0;
            boolean z = false;
            while(v1 < list0.size()) {
                dbxw dbxw0 = (dbxw)list0.get(v1);
                int v2 = 0;
                while(v2 < ((dbxx)dbxw0.b_message).c.size()) {
                    dbxv dbxv1 = dbxw0.a(v2);
                    if(dbxv1.d.equals(dbxv0.d)) {
                        dcvz.a.d().i("We noticed that the unassociated %s has the same display name as the Gaia %s. Merging the two contacts.", dgbg.c(dbxv0), dgbg.c(dbxv1));
                        dbxw0.m(v2, dgbg.b(dbxv1, dbxv0));
                        list0.set(v1, dbxw0);
                    }
                    else {
                        for(Object object1: dbxv0.g) {
                            String s = (String)object1;
                            Iterator iterator2 = dbxv1.g.iterator();
                        label_22:
                            if(!iterator2.hasNext()) {
                                continue;
                            }
                            Object object2 = iterator2.next();
                            if(!((String)object2).equals(s)) {
                                goto label_22;
                            }
                            dcvz.a.d().i("We noticed that the unassociated %s shares a phone number with the Gaia %s. Merging the two contacts.", dgbg.c(dbxv0), dgbg.c(dbxv1));
                            dbxw0.m(v2, dgbg.b(dbxv1, dbxv0));
                            list0.set(v1, dbxw0);
                            goto label_40;
                        }
                        Iterator iterator3 = dbxv0.f.iterator();
                        while(true) {
                            if(!iterator3.hasNext()) {
                                goto label_41;
                            }
                            Object object3 = iterator3.next();
                            String s1 = (String)object3;
                            Iterator iterator4 = dbxv1.f.iterator();
                        label_34:
                            if(!iterator4.hasNext()) {
                                continue;
                            }
                            Object object4 = iterator4.next();
                            if(!((String)object4).equals(s1)) {
                                goto label_34;
                            }
                            dcvz.a.d().i("We noticed that the unassociated %s shares an email with the Gaia %s. Merging the two contacts.", dgbg.c(dbxv0), dgbg.c(dbxv1));
                            dbxw0.m(v2, dgbg.b(dbxv1, dbxv0));
                            list0.set(v1, dbxw0);
                            break;
                        }
                    }
                label_40:
                    z = true;
                label_41:
                    ++v2;
                }
                ++v1;
            }
            if(z || dbxv0.d.isEmpty()) {
                continue;
            }
            for(int v = 0; v < list0.size(); ++v) {
                dbxw dbxw1 = (dbxw)list0.get(v);
                if(!dbxw1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dbxw1).ensureMutable();
                }
                dbxx dbxx1 = (dbxx)dbxw1.b_message;
                dbxv0.getClass();
                dbxx1.b();
                dbxx1.c.add(dbxv0);
                list0.set(v, dbxw1);
            }
            dcvz.a.d().h("The unassociated %s does not match any existing Gaia contacts. Appending to the contact book.", dgbg.c(dbxv0));
        }
    }

    private static dbxv b(dbxv dbxv0, dbxv dbxv1) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dbxv0));
        if(dbxv0.d.isEmpty()) {
            String s = dbxv1.d;
            if(!((dbxu)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((dbxu)hftp0))).ensureMutable();
            }
            dbxv dbxv2 = (dbxv)((dbxu)hftp0).b_message;
            s.getClass();
            dbxv2.b |= 2;
            dbxv2.d = s;
        }
        for(Object object0: dbxv1.g) {
            String s1 = (String)object0;
            if(!dbxv0.g.contains(s1)) {
                ((dbxu)hftp0).k(s1);
            }
        }
        for(Object object1: dbxv1.f) {
            String s2 = (String)object1;
            if(!dbxv0.f.contains(s2)) {
                ((dbxu)hftp0).a(s2);
            }
        }
        return (dbxv)((ProtoLiteBuilder)(((dbxu)hftp0))).N_build();
    }

    private static String c(dbxv dbxv0) {
        return String.format("Contact{%s, %s, %s}", dbxv0.d, dbxv0.g, dbxv0.f);
    }
}

