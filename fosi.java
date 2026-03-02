import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

abstract class fosi {
    public abstract MessageLite a(String arg1, Object arg2);

    public abstract MessageLite b(MessageLite arg1, MessageLite arg2);

    public abstract String c(MessageLite arg1);

    final List d(Map map0) {
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getValue() != null) {
                MessageLite hfvm0 = this.a(((String)map$Entry0.getKey()), map$Entry0.getValue());
                if(hfvm0 != null) {
                    ((ArrayList)list0).add(hfvm0);
                }
            }
        }
        return list0;
    }

    final List e(List list0, List list1) {
        MessageLite hfvm0;
        if(list0.isEmpty()) {
            return list0;
        }
        List list2 = new ArrayList();
        for(Object object0: list0) {
            String s = this.c(((MessageLite)object0));
            for(Object object1: list1) {
                hfvm0 = (MessageLite)object1;
                if(!s.equals(this.c(hfvm0))) {
                    continue;
                }
                goto label_14;
            }
            hfvm0 = null;
        label_14:
            MessageLite hfvm1 = this.b(((MessageLite)object0), hfvm0);
            if(hfvm1 != null) {
                ((ArrayList)list2).add(hfvm1);
            }
        }
        return list2;
    }
}

