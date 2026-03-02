public final class fdty {
    final String a;
    final boolean b;

    public fdty(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fdty) ? this.a.equals(((fdty)object0).a) && this.b == ((fdty)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() + 629) * 37 + this.b;
    }
}

