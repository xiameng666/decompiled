import j..util.Objects;
import java.util.Comparator;
import java.util.Map.Entry;

public final class bwui implements Comparator {
    public bwui(bwur bwur0) {
        Objects.requireNonNull(bwur0);
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        bwny bwny0 = ((bwnr)((Map.Entry)object0).getValue()).d;
        if(bwny0 == null) {
            bwny0 = bwny.a;
        }
        int v = bwnx.a(bwny0.d);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        bwny bwny1 = ((bwnr)((Map.Entry)object1).getValue()).d;
        if(bwny1 == null) {
            bwny1 = bwny.a;
        }
        int v2 = bwnx.a(bwny1.d);
        if(v2 != 0) {
            v1 = v2;
        }
        int v3 = v - 1 - (v1 - 1);
        if(v3 == 0) {
            bwnq bwnq0 = ((bwnr)((Map.Entry)object0).getValue()).c;
            if(bwnq0 == null) {
                bwnq0 = bwnq.a;
            }
            String s = bwnq0.f;
            bwnq bwnq1 = ((bwnr)((Map.Entry)object1).getValue()).c;
            if(bwnq1 == null) {
                bwnq1 = bwnq.a;
            }
            v3 = s.compareTo(bwnq1.f);
            if(v3 == 0) {
                bwnq bwnq2 = ((bwnr)((Map.Entry)object0).getValue()).c;
                if(bwnq2 == null) {
                    bwnq2 = bwnq.a;
                }
                String s1 = bwnq2.d;
                bwnq bwnq3 = ((bwnr)((Map.Entry)object1).getValue()).c;
                if(bwnq3 == null) {
                    bwnq3 = bwnq.a;
                }
                v3 = s1.compareTo(bwnq3.d);
                if(v3 == 0) {
                    bwnq bwnq4 = ((bwnr)((Map.Entry)object0).getValue()).c;
                    if(bwnq4 == null) {
                        bwnq4 = bwnq.a;
                    }
                    Long long0 = (long)bwnq4.o;
                    bwnq bwnq5 = ((bwnr)((Map.Entry)object1).getValue()).c;
                    if(bwnq5 == null) {
                        bwnq5 = bwnq.a;
                    }
                    return long0.compareTo(Long.valueOf(bwnq5.o));
                }
            }
        }
        return v3;
    }
}

