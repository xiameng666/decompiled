import j..util.Objects;

public final class iaos {
    public final iapm a;
    public final iakk b;
    public final iaoo c;

    public iaos(iapm iapm0, iakk iakk0, iaoo iaoo0) {
        this.a = iapm0;
        gftb.z(iakk0, "attributes");
        this.b = iakk0;
        this.c = iaoo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iaos) ? Objects.equals(this.a, ((iaos)object0).a) && Objects.equals(this.b, ((iaos)object0).b) && Objects.equals(this.c, ((iaos)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("addressesOrError", this.a.toString());
        gfsv0.add("attributes", this.b);
        gfsv0.add("serviceConfigOrError", this.c);
        return gfsv0.toString();
    }
}

