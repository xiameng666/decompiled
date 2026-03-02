import android.util.Xml;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

final class furr extends ibsl implements ibtw {
    final ibvd a;
    final Map b;
    final OutputStream c;

    public furr(ibvd ibvd0, Map map0, OutputStream outputStream0, ibrl ibrl0) {
        this.a = ibvd0;
        this.b = map0;
        this.c = outputStream0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((furr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new furr(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        fury fury0 = fury.a;
        furw furw0 = (furw)this.a.a;
        ibuq.f(furw0, "rootNode");
        ibuq.f(this.b, "hierarchyAttributes");
        ibuq.f(this.c, "outputStream");
        XmlSerializer xmlSerializer0 = Xml.newSerializer();
        xmlSerializer0.setOutput(this.c, StandardCharsets.UTF_8.name());
        xmlSerializer0.startDocument("UTF-8", Boolean.valueOf(true));
        xmlSerializer0.startTag("", "hierarchy");
        fusk fusk0 = new fusk();
        for(Object object1: this.b.entrySet()) {
            fusk0.b(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
        }
        fusk0.a(xmlSerializer0, null);
        fusl fusl0 = new fusl();
        ibuq.c(xmlSerializer0);
        fury0.a(furw0, xmlSerializer0, fusl0);
        xmlSerializer0.startTag("", "attributeNameMap");
        ArrayList arrayList0 = fusl0.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)arrayList0.get(v1);
            xmlSerializer0.attribute("", ((String)fusl0.a.get(s)), s);
        }
        xmlSerializer0.endTag("", "attributeNameMap");
        xmlSerializer0.endTag("", "hierarchy");
        xmlSerializer0.endDocument();
        return ibom.a;
    }
}

