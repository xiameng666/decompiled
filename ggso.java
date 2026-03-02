public abstract class ggso implements ggsp {
    public static final ggso a;

    static {
        ggso.a = new ggsm();
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LogSite{ class=");
        stringBuilder0.append(this.b());
        stringBuilder0.append(", method=");
        stringBuilder0.append(this.d());
        stringBuilder0.append(", line=");
        stringBuilder0.append(this.a());
        if(this.c() != null) {
            stringBuilder0.append(", file=");
            stringBuilder0.append(this.c());
        }
        if(this.e() != null) {
            stringBuilder0.append(", filePath=");
            stringBuilder0.append(this.e());
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }
}

