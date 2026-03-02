public final class gpay {
    private final Class a;
    private final Class b;

    public gpay(Class class0, Class class1) {
        this.a = class0;
        this.b = class1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            return this.b.equals(((gpay)object0).b) ? this.a.equals(((gpay)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a == gpax.class ? this.b.getName() : "@" + this.a.getName() + " " + this.b.getName();
    }
}

