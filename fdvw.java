import j..util.Objects;

public final class fdvw {
    public final ffaw a;
    public final String b;
    private final String c;

    public fdvw(ffaw ffaw0, String s, String s1) {
        this.a = ffaw0;
        this.b = s;
        this.c = s1;
    }

    public fdvw(String s) {
        this(null, null, s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fdvw) ? this.a == ((fdvw)object0).a && Objects.equals(this.b, ((fdvw)object0).b) && Objects.equals(this.c, ((fdvw)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        ffaw ffaw0 = this.a;
        if(ffaw0 != null) {
            stringBuilder0.append(ffaw0.o);
        }
        String s = this.b;
        if(!gfta.c(s)) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(":");
            }
            stringBuilder0.append(ffmr.a(s));
        }
        String s1 = this.c;
        if(!gfta.c(s1)) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(":");
            }
            stringBuilder0.append(s1);
        }
        return stringBuilder0.toString();
    }
}

