import java.util.BitSet;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

public final class fury {
    public static final fury a;

    static {
        fury.a = new fury();
    }

    public final void a(furw furw0, XmlSerializer xmlSerializer0, fusl fusl0) {
        xmlSerializer0.startTag("", "node");
        fusk fusk0 = new fusk();
        BitSet bitSet0 = new BitSet();
        List list0 = furw0.b;
        int v = 0;
        int v1 = 0;
        for(Object object0: list0) {
            if(v1 < 0) {
                ibpo.m();
            }
            String s = ((furu)object0).a;
            if(!ibzk.D(s)) {
                String s1 = ((furu)object0).b;
                if(s1 != null && !fusk0.a.containsKey(s)) {
                    bitSet0.set(v1);
                    fusk0.b(s, s1);
                }
            }
            ++v1;
        }
        fusk0.a(xmlSerializer0, fusl0);
        for(Object object1: list0) {
            if(v < 0) {
                ibpo.m();
            }
            if(!bitSet0.get(v)) {
                xmlSerializer0.startTag("", "a");
                fusk fusk1 = new fusk();
                String s2 = ((furu)object1).a;
                if(!ibzk.D(s2)) {
                    fusk1.b("name", fusl0.a(s2));
                }
                String s3 = ((furu)object1).b;
                if(s3 != null) {
                    fusk1.b("value", s3);
                }
                fusk1.a(xmlSerializer0, fusl0);
                xmlSerializer0.endTag("", "a");
            }
            ++v;
        }
        for(Object object2: furw0.a) {
            this.a(((furw)object2), xmlSerializer0, fusl0);
        }
        xmlSerializer0.endTag("", "node");
    }
}

