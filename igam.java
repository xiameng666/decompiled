import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo.HeaderBlock;

public final class igam extends UrlResponseInfo.HeaderBlock {
    public final List a;
    public Map b;

    public igam(List list0) {
        this.a = list0;
    }

    @Override  // org.chromium.net.UrlResponseInfo$HeaderBlock
    public final List getAsList() {
        return this.a;
    }

    @Override  // org.chromium.net.UrlResponseInfo$HeaderBlock
    public final Map getAsMap() {
        Map map0 = this.b;
        if(map0 != null) {
            return map0;
        }
        TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for(Object object0: this.a) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            ArrayList arrayList0 = new ArrayList();
            if(treeMap0.containsKey(map$Entry0.getKey())) {
                arrayList0.addAll(((Collection)treeMap0.get(map$Entry0.getKey())));
            }
            arrayList0.add(((String)map$Entry0.getValue()));
            treeMap0.put(((String)map$Entry0.getKey()), DesugarCollections.unmodifiableList(arrayList0));
        }
        Map map1 = DesugarCollections.unmodifiableMap(treeMap0);
        this.b = map1;
        return map1;
    }
}

