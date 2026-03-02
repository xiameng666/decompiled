public final class ajab {
    public final boolean a;

    public ajab() {
        throw null;
    }

    public ajab(boolean z) {
        this.a = z;
    }

    public static ajaa a() {
        ajaa ajaa0 = new ajaa();
        ajaa0.b(false);
        return ajaa0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ajab) && this.a == ((ajab)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a ? 1001100 : 1001110;
    }

    @Override
    public final String toString() {
        return "GetAllPackagesFilter{onlyCloudBackupEnabled=" + this.a + "}";
    }
}

