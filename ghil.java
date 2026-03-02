import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ghil {
    public static final ggfp a;
    public static final ggfp b;
    public static final ggfp c;
    private static final ggfp d;
    private static final ggfp e;
    private static final ggfp f;

    static {
        ghil.a = ggfp.O("applet", "base", "embed", "math", "meta", "object", new String[]{"svg", "template"});
        ghil.d = new ggoh("script");
        ghil.e = new ggoh("style");
        ghil.f = ggfp.O("area", "br", "col", "hr", "img", "input", new String[]{"link", "param", "source", "track", "wbr"});
        new ggoh("input");
        new ggoh("form");
        new ggoh("script");
        ggfp.K("button", "input");
        ggfp.K("button", "input");
        ghil.b = ggfp.K("a", "area");
        ghil.c = ggfp.O("alternate", "author", "bookmark", "canonical", "cite", "help", new String[]{"icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource"});
        new ggoh("form");
        new ggoh("input");
        ggfp.K("input", "textarea");
        ggfp.N("audio", "img", "input", "source", "video");
        new ggoh("iframe");
    }

    public static final ghik a(String s, Map map0, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder("<");
        stringBuilder0.append(s);
        for(Object object0: map0.entrySet()) {
            stringBuilder0.append(" ");
            stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
            stringBuilder0.append("=\"");
            stringBuilder0.append(ghii.a(((String)((Map.Entry)object0).getValue())));
            stringBuilder0.append("\"");
        }
        boolean z = ghil.f.contains(s);
        stringBuilder0.append(">");
        if(!z) {
            for(Object object1: list0) {
                stringBuilder0.append(((String)object1));
            }
            stringBuilder0.append("</");
            stringBuilder0.append(s);
            stringBuilder0.append(">");
        }
        return new ghik(stringBuilder0.toString());
    }

    public static final void b(String s, String s1, List list0) {
        Iterator iterator0 = Arrays.asList(new ghik[]{ghin.c(s)}).iterator();
        gftb.u(((boolean)(ghil.f.contains(s1) ^ 1)), "Element \"%s\" is a void element and so cannot have content.", s1);
        gftb.u(((boolean)(ghil.d.contains(s1) ^ 1)), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", s1);
        gftb.u(((boolean)(1 ^ ghil.e.contains(s1))), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", s1);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            list0.add(((ghik)object0).b);
        }
    }
}

