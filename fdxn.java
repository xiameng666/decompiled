public final class fdxn {
    public final String a;
    public final String b;

    public fdxn(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : this.a.equals(((fdxn)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "NodeInternal{id=\'" + this.a + "\', name=\'" + this.b + "\'}";
    }
}

