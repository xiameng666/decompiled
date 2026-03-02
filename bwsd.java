import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bwsd implements glzn {
    public final List a;
    public final bwmx b;
    public final long c;
    public final String d;

    public bwsd(List list0, bwmx bwmx0, long v, String s) {
        this.a = list0;
        this.b = bwmx0;
        this.c = v;
        this.d = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        long v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.d;
        glnj glnj0 = (glnj)hftp0.b_message;
        s.getClass();
        glnj0.b |= 1;
        glnj0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        List list0 = this.a;
        ((glnj)hftp0.b_message).d = 3;
        ((glnj)hftp0.b_message).b |= 2;
        for(Object object1: list0) {
            String s1 = ((hlne)object1).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnj glnj1 = (glnj)hftp0.b_message;
            s1.getClass();
            glnj1.b();
            glnj1.f.add(s1);
        }
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator1 = list0.iterator();
        while(true) {
            v = this.c;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object2 = iterator1.next();
            arrayList0.add(bxbz.b(((hlne)object2), v, s));
        }
        afm afm0 = new afm();
        afm0.b(arrayList0);
        gmcd gmcd0 = ((fkno)object0).b(afm0.a());
        gmbu.t(gmcd0, new bxbt(hftp0, this.b.r, v), gmap.a);
        return gmcd0;
    }
}

