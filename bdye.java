public final class bdye {
    public final int a;
    public final bdyi b;

    public bdye(int v, bdyi bdyi0) {
        this.a = v;
        this.b = bdyi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdye)) {
            return false;
        }
        return this.a == ((bdye)object0).a ? ibuq.m(this.b, ((bdye)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "DeletedEntitiesUiInfo(entitiesCount=" + this.a + ", domainsInfo=" + this.b + ")";
    }
}

