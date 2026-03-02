import java.util.List;

public final class ghhz extends ghhy {
    public final ghhq a;
    public final List b;
    public final boolean c;
    private final String d;
    private final String e;

    public ghhz(ghhq ghhq0, List list0, boolean z, String s, String s1) {
        this.a = ghhq0;
        this.b = list0;
        this.c = z;
        this.d = s;
        this.e = s1;
    }

    @Override  // ghhy
    public final void c(StringBuilder stringBuilder0) {
        String s = this.d;
        if(s == null) {
            stringBuilder0.append('<');
            stringBuilder0.append(this.a.a);
        }
        else {
            stringBuilder0.append(s);
        }
        List list0 = this.b;
        if(list0 != null) {
            for(Object object0: list0) {
                ghia ghia0 = (ghia)object0;
                String s1 = ghia0.c;
                if(s1 == null) {
                    stringBuilder0.append(' ');
                    stringBuilder0.append(ghia0.a.a);
                    if(ghia0.b == null || ghia0.a.b == 4) {
                        continue;
                    }
                    stringBuilder0.append("=\"");
                    String s2 = ghia0.b;
                    gftb.check(s2);
                    stringBuilder0.append(ghhi.a.a(s2));
                    stringBuilder0.append("\"");
                }
                else {
                    stringBuilder0.append(s1);
                }
            }
        }
        String s3 = this.e;
        if(s3 != null) {
            stringBuilder0.append(s3);
            return;
        }
        stringBuilder0.append('>');
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Start Tag: ");
        stringBuilder0.append(this.a.a);
        List list0 = this.b;
        if(list0 != null) {
            for(Object object0: list0) {
                stringBuilder0.append(' ');
                stringBuilder0.append(((ghia)object0).toString());
            }
        }
        return stringBuilder0.toString();
    }
}

