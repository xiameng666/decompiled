public final class ajae {
    public final ByteString a;
    public final int b;
    public final int c;

    public ajae() {
        throw null;
    }

    public ajae(ByteString hfsf0, int v, int v1) {
        this.a = hfsf0;
        this.c = v;
        this.b = v1;
    }

    public static ajad a() {
        ajad ajad0 = new ajad();
        ajad0.a = null;
        ajad0.b = 1;
        ajad0.b(0);
        return ajad0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ajae)) {
            ByteString hfsf0 = this.a;
            if(hfsf0 != null) {
                if(hfsf0.equals(((ajae)object0).a)) {
                label_8:
                    int v = this.c;
                    int v1 = ((ajae)object0).c;
                    if(v != 0) {
                        return v == v1 && this.b == ((ajae)object0).b;
                    }
                    throw null;
                }
            }
            else if(((ajae)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        aiye.b(this.c);
        return this.b ^ (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ this.c) * 1000003;
    }

    @Override
    public final String toString() {
        return "ReadAllBlockDataResult{bytes=" + this.a + ", resultType=" + aiye.a(this.c) + ", packageCount=" + this.b + "}";
    }
}

