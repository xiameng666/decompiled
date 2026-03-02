import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import j..util.Map.-EL;
import j..util.Objects;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class rid {
    private final Map a;

    public rid(String s) {
        this.a = new ArrayMap();
        this.f(s);
    }

    public final String a(gged_interceptors gged0, String s) {
        String s1 = this.d(gged0, s);
        return !TextUtils.isEmpty(s1) || !gged0.contains("PrimaryConfiguration") || gged0.contains("PrimaryConfigurations") ? s1 : this.d(rid.c(gged0), s);
    }

    public final boolean b(gged_interceptors gged0) {
        boolean z = this.a.containsKey(TextUtils.join("|", gged0));
        return z || !gged0.contains("PrimaryConfiguration") || gged0.contains("PrimaryConfigurations") ? z : this.a.containsKey(TextUtils.join("|", rid.c(gged0)));
    }

    private static gged_interceptors c(gged_interceptors gged0) {
        int v = gged0.indexOf("PrimaryConfiguration");
        ggdy ggdy0 = new ggdy();
        ggdy0.k(gged0.b(0, v));
        ggdy0.i("PrimaryConfigurations");
        ggdy0.k(gged0.b(v, ((ggna)gged0).c));
        return ggdy0.h();
    }

    private final String d(gged_interceptors gged0, String s) {
        String s1 = TextUtils.join("|", gged0);
        Map map0 = (Map)this.a.get(s1);
        if(map0 != null) {
            List list0 = (List)map0.get(s);
            return list0 == null ? null : ((String)list0.get(0));
        }
        return null;
    }

    private final void e(List list0, Node node0) {
        String s = node0.getNodeName();
        NamedNodeMap namedNodeMap0 = node0.getAttributes();
        if(namedNodeMap0 != null) {
            if(s.equals("characteristic")) {
                Node node1 = namedNodeMap0.getNamedItem("type");
                if(node1 != null) {
                    list0.add(((String)Objects.requireNonNull(node1.getNodeValue())));
                    NodeList nodeList0 = node0.getChildNodes();
                    for(int v = 0; v < nodeList0.getLength(); ++v) {
                        this.e(list0, ((Node)Objects.requireNonNull(nodeList0.item(v))));
                    }
                    list0.remove(list0.size() - 1);
                }
            }
            else if(s.equals("parm")) {
                Node node2 = namedNodeMap0.getNamedItem("name");
                Node node3 = namedNodeMap0.getNamedItem("value");
                if(node2 != null && node3 != null) {
                    String s1 = TextUtils.join("|", list0);
                    ArrayMap arrayMap0 = new ArrayMap();
                    Map map0 = (Map)Map.-EL.getOrDefault(this.a, s1, arrayMap0);
                    List list1 = (List)Map.-EL.getOrDefault(map0, Objects.requireNonNull(node2.getNodeValue()), new ArrayList());
                    list1.add(((String)Objects.requireNonNull(node3.getNodeValue())).replace("[NEW----LINE]", "\n"));
                    map0.put(((String)Objects.requireNonNull(node2.getNodeValue())), list1);
                    this.a.put(s1, map0);
                }
            }
        }
    }

    private final void f(String s) {
        if(s != null) {
            try {
                Document document0 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(s.replace("&", "&amp;").replace("&amp;amp;", "&amp;").replace("\r\n", "[NEW----LINE]"))));
                document0.getDocumentElement().normalize();
                NodeList nodeList0 = document0.getDocumentElement().getChildNodes();
                for(int v = 0; v < nodeList0.getLength(); ++v) {
                    this.e(new ArrayList(), ((Node)Objects.requireNonNull(nodeList0.item(v))));
                }
                return;
            }
            catch(ParserConfigurationException | IOException | SAXException exception0) {
                goto label_11;
            }
        }
        return;
    label_11:
        Log.w("Ts43XmlDoc", "e=" + exception0.toString());
    }

    @Override
    public final String toString() {
        return "Ts43XmlDoc: " + this.a.toString();
    }
}

