public final class beiv {
    public final int a;
    public final int b;

    public beiv(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof beiv)) {
            return false;
        }
        return this.a == ((beiv)object0).a ? this.b == ((beiv)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "CredentialAndAffiliatedGroupCount(credentialGroupCount=" + this.a + ", affiliatedGroupCount=" + this.b + ")";
    }
}

