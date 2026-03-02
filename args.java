final class args {
    final long a;
    final String b;
    final String c;

    public args(String s, String s1) {
        this.a = System.currentTimeMillis();
        this.b = s;
        this.c = s1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        kbb.a(this.a - System.currentTimeMillis(), stringBuilder0);
        stringBuilder0.append("\t");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\t");
        stringBuilder0.append(this.c);
        return stringBuilder0.toString();
    }
}

