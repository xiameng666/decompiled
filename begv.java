import java.util.Comparator;

public final class begv implements Comparator {
    public final beih a;

    public begv(beih beih0) {
        this.a = beih0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        bedc bedc0 = (bedc)object0;
        bedc bedc1 = (bedc)object1;
        ibuq.f(bedc0, "blocklistEntry1");
        ibuq.f(bedc1, "blocklistEntry2");
        String s = gqlw.b(beid.a(bedc0));
        String s1 = gqlw.b(beid.a(bedc1));
        return this.a.m.compare(s, s1);
    }
}

