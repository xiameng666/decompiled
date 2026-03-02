public abstract class igne implements ignb {
    @Override  // ignb
    public abstract ignj a();

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ignb) ? this.a().equals(((ignb)object0).a()) : false;
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
}

