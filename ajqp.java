import java.util.Arrays;

public final class ajqp implements azsu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final String g;

    public ajqp(ajqo ajqo0) {
        this.a = ajqo0.a;
        this.b = ajqo0.b;
        this.c = ajqo0.c;
        this.d = ajqo0.d;
        this.e = ajqo0.f;
        this.g = ajqo0.e;
        this.f = ajqo0.g;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ajqp) ? bata.b(this.a, ((ajqp)object0).a) && bata.b(this.b, ((ajqp)object0).b) && bata.b(this.c, ((ajqp)object0).c) && bata.b(this.d, ((ajqp)object0).d) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((ajqp)object0).e)) && bata.b(this.g, ((ajqp)object0).g) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((ajqp)object0).f)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((int)this.e), this.g, Boolean.valueOf(this.f)});
    }
}

