public final class ghdy {
    public final ghea a;
    public final ghea b;

    public ghdy() {
        this.a = new ghea();
        this.b = new ghea();
    }

    public final int a(int v) {
        return this.b.a(v);
    }

    public final int b() {
        return this.a.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("IntPairVector of ");
        ghea ghea0 = this.a;
        stringBuilder0.append(ghea0.b);
        stringBuilder0.append(" pairs: ");
        for(int v = 0; true; ++v) {
            int v1 = ghea0.b;
            if(v >= v1 || v >= 10) {
                break;
            }
            stringBuilder0.append("(");
            stringBuilder0.append(ghea0.a(v));
            stringBuilder0.append(",");
            stringBuilder0.append(this.b.a(v));
            stringBuilder0.append("), ");
        }
        if(v1 > 10) {
            stringBuilder0.append("...");
        }
        return stringBuilder0.toString();
    }
}

