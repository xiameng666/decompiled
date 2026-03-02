import j..util.Objects;

public final class ajt extends ajk {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final ajs e;
    public final ajo f;
    public final ajq g;
    public final ajr h;
    public final String i;
    public final ajp j;
    private final boolean k;
    private Integer l;

    public ajt(String s, int v, int v1, String s1, ajs ajs0, ajo ajo0, ajq ajq0, ajr ajr0, String s2, ajp ajp0) {
        this.a = (String)Objects.requireNonNull(s);
        this.b = v;
        this.c = v1;
        this.d = s1;
        this.e = ajs0;
        this.f = ajo0;
        this.g = ajq0;
        this.h = ajr0;
        this.i = (String)Objects.requireNonNull(s2);
        this.j = ajp0;
        this.k = false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajt) ? Objects.equals(this.a, ((ajt)object0).a) && Objects.equals(this.i, ((ajt)object0).i) && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(((ajt)object0).b)) && Objects.equals(Integer.valueOf(this.c), Integer.valueOf(((ajt)object0).c)) && Objects.equals(this.d, ((ajt)object0).d) && Objects.equals(this.e, ((ajt)object0).e) && Objects.equals(this.f, ((ajt)object0).f) && Objects.equals(this.g, ((ajt)object0).g) && Objects.equals(this.h, ((ajt)object0).h) && Objects.equals(this.j, ((ajt)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        if(this.l == null) {
            this.l = Objects.hash(new Object[]{this.a, this.i, ((int)this.b), ((int)this.c), this.d, this.e, this.f, this.g, this.h, this.j, Boolean.valueOf(false)});
        }
        return (int)this.l;
    }

    @Override
    public final String toString() {
        return "{name: " + this.a + ", description: " + this.i + ", dataType: " + this.b + ", cardinality: " + this.c + ", schemaType: " + this.d + ", stringIndexingConfigParcel: " + this.e + ", documentIndexingConfigParcel: " + this.f + ", integerIndexingConfigParcel: " + this.g + ", joinableConfigParcel: " + this.h + ", embeddingIndexingConfigParcel: " + this.j + ", isScoringEnabled: false}";
    }
}

