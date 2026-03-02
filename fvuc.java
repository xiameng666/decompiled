public final class fvuc {
    public final fvua a;
    public final fvux b;
    public final fvtg c;

    public fvuc(fvua fvua0, fvux fvux0, fvtg fvtg0) {
        this.a = fvua0;
        this.b = fvux0;
        this.c = fvtg0;
        if(fvua0 != null && fvua0.f != 1) {
            throw new RuntimeException("Invalid Args");
        }
    }

    public final fvtm a() {
        return this.c == null ? null : this.c.b;
    }

    public final fvvj b() {
        return this.b == null ? null : this.b.b;
    }

    public final boolean c() {
        return this.c == null || !this.c.e ? this.b != null && this.b.e : true;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(5000);
        stringBuilder0.append("NetworkLocation [bestResult=");
        fvua fvua0 = this.a;
        if(fvua0 == null) {
            stringBuilder0.append("null");
        }
        else if(fvua0 == this.b) {
            stringBuilder0.append("WIFI");
        }
        else if(fvua0 == this.c) {
            stringBuilder0.append("CELL");
        }
        stringBuilder0.append(" wifiResult=");
        fvux.a(stringBuilder0, this.b);
        stringBuilder0.append(" cellResult=");
        fvtg.a(stringBuilder0, this.c);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

