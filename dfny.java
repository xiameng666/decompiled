public final class dfny implements dcyy {
    public final dfnw a;

    public dfny(dfnw dfnw0) {
        this.a = dfnw0;
    }

    @Override  // dcyy
    public final icig a(ddag ddag0) {
        ibuq.f(ddag0, "repository");
        return new icht(new dfnx(this, ddag0, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dfny) ? ibuq.m(this.a, ((dfny)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ConsentToContactsUploadTapped(status=" + this.a + ")";
    }
}

