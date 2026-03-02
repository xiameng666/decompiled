import java.util.Objects;

public final class bedy extends bedz {
    private final String a;
    private final String b;
    private final Integer c;

    public bedy(String s, String s1, Integer integer0) {
        this.a = s;
        this.b = s1;
        this.c = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bedy)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bedy)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bedy)object0).b) ? ibuq.m(this.c, ((bedy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F : v * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        Integer integer0 = this.c;
        if(integer0 != null) {
            Objects.toString(integer0);
            return this.a + "://" + this.b + (":" + integer0.toString()) + "/";
        }
        return this.a + "://" + this.b + "" + "/";
    }
}

