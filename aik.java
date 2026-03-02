import java.util.Map;
import java.util.Set;

public final class aik {
    public static int a(aes aes0, Map map0, Map map1, Set set0) {
        String s = aes0.a;
        if(set0.contains(s)) {
            throw new agt(a.a(s, "Invalid cycle detected in schema type configs. \'", "\' references itself."));
        }
        if(map1.containsKey(s)) {
            return (int)(((Integer)map1.get(s)));
        }
        set0.add(s);
        int v = 0;
        for(Object object0: aes0.b()) {
            aep aep0 = (aep)object0;
            if(aep0.e() == 6) {
                String s1 = ((aej)aep0).a();
                if(!map0.containsKey(s1)) {
                    throw new agt("Undefined schema type: " + s1);
                }
                v += (((aej)aep0).c() ? aik.a(((aes)map0.get(s1)), map0, map1, set0) : ((aej)aep0).b().size());
            }
            else {
                int v1 = aep0.e();
                int v2 = 1;
                if(v1 != 1) {
                    switch(v1) {
                        case 2: {
                            if(((aeo)aep0).a() != 0) {
                                v += v2;
                                continue;
                            }
                            break;
                        }
                        case 6: {
                            if(((aej)aep0).c() || !((aej)aep0).b().isEmpty()) {
                                v += v2;
                                continue;
                            }
                        }
                    }
                    v2 = 0;
                }
                else if(((aer)aep0).a() == 0) {
                    v2 = 0;
                }
                v += v2;
            }
        }
        set0.remove(s);
        map1.put(s, Integer.valueOf(v));
        return v;
    }
}

