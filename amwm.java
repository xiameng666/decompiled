import com.google.android.gms.location.places.personalized.AliasedPlace;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.HashSet;
import java.util.List;

public final class amwm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggek ggek0 = new ggek();
        HashSet hashSet0 = new HashSet();
        for(Object object1: ((azui)object0).e()) {
            AliasedPlace aliasedPlace0 = (AliasedPlace)object1;
            List list0 = (List)Collection.-EL.stream(aliasedPlace0.b).filter(new amwl()).distinct().collect(Collectors.toList());
            if(!list0.isEmpty()) {
                String s = aliasedPlace0.a;
                if(hashSet0.add(s)) {
                    ggek0.i(s, ((String)list0.get(0)));
                }
            }
        }
        return ggek0.b();
    }
}

