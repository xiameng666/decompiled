import java.util.Iterator;

public final class ghin {
    public static ghik a(Iterable iterable0) {
        int v;
        String s = ghik.a.b;
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v = ((ghik)object0).b.length();
        }
        else {
            v = 0;
        }
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            v = v + s.length() + ((ghik)object1).b.length();
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        Iterator iterator1 = iterable0.iterator();
        if(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            stringBuilder0.append(((ghik)object2).b);
        }
        while(iterator1.hasNext()) {
            stringBuilder0.append(s);
            Object object3 = iterator1.next();
            stringBuilder0.append(((ghik)object3).b);
        }
        return new ghik(stringBuilder0.toString());
    }

    public static ghik b(ghim ghim0) {
        return new ghik(ghim0.c);
    }

    public static ghik c(String s) {
        return new ghik(ghin.e(s));
    }

    public static ghim d(ghik ghik0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghim.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghim ghim0 = (ghim)hftp0.b_message;
        ghim0.b |= 1;
        ghim0.c = ghik0.b;
        return (ghim)hftp0.N_build();
    }

    public static String e(String s) {
        return ghii.a(gqjv.a(s));
    }
}

