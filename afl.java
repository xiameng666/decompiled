import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class afl implements Iterable {
    private final List a;

    public afl(String s) {
        kay.i(s);
        this.a = new ArrayList();
        try {
            this.c(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(illegalArgumentException0.getMessage() + ": " + s);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final afk b(int v) {
        return (afk)this.a.get(v);
    }

    private final void c(String s) {
        int v3;
        String s3;
        String s1;
        boolean z = false;
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(v1 == 93) {
                throw new IllegalArgumentException("Malformed path (no starting \'[\')");
            }
            if(v1 != 46 && v1 != 91) {
                ++v;
                continue;
            }
            if(v1 == 91) {
                z = true;
            }
            goto label_13;
        }
        v = -1;
    label_13:
        if(v == 0 || s.isEmpty()) {
            throw new IllegalArgumentException("Malformed path (blank property name)");
        }
        if(v == -1) {
            afk afk0 = new afk(s, -1);
            this.a.add(afk0);
            return;
        }
        if(!z) {
            s1 = s.substring(v + 1);
            this.a.add(new afk(s.substring(0, v), -1));
            this.c(s1);
            return;
        }
        kay.i(s);
        String s2 = s.substring(0, v);
        int v2 = s.indexOf(93, v);
        if(v2 == -1) {
            throw new IllegalArgumentException("Malformed path (no ending \']\')");
        }
        if(v2 + 1 < s.length() && s.charAt(v2 + 1) != 46) {
            throw new IllegalArgumentException("Malformed path (\']\' not followed by \'.\'): " + s);
        }
        try {
            s3 = s.substring(v + 1, v2);
            v3 = Integer.parseInt(s3);
        }
        catch(NumberFormatException unused_ex) {
            throw new IllegalArgumentException(a.a(s3, "Malformed path (\"", "\" as path index)"));
        }
        if(v3 < 0) {
            throw new IllegalArgumentException("Malformed path (path index less than 0)");
        }
        afk afk1 = new afk(s2, v3);
        this.a.add(afk1);
        s1 = v2 + 1 >= s.length() ? null : s.substring(v2 + 2);
        if(s1 == null) {
            return;
        }
        this.c(s1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof afl) ? Objects.equals(this.a, ((afl)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; true; ++v) {
            List list0 = this.a;
            if(v >= list0.size()) {
                break;
            }
            stringBuilder0.append(this.b(v).toString());
            if(v < list0.size() - 1) {
                stringBuilder0.append('.');
            }
        }
        return stringBuilder0.toString();
    }
}

