package j$.time.format;

import java.text.ParsePosition;

public class n {
    public String a;
    public String b;
    public final char c;
    public n d;
    public n e;

    public n(String s, String s1, n n0) {
        this.a = s;
        this.b = s1;
        this.d = n0;
        if(s.isEmpty()) {
            this.c = '\uFFFF';
            return;
        }
        this.c = this.a.charAt(0);
    }

    public final boolean a(String s, String s1) {
        int v;
        for(v = 0; v < s.length() && v < this.a.length() && this.b(s.charAt(v), this.a.charAt(v)); ++v) {
        }
        if(v == this.a.length()) {
            if(v < s.length()) {
                String s2 = s.substring(v);
                for(n n0 = this.d; n0 != null; n0 = n0.e) {
                    if(this.b(n0.c, s2.charAt(0))) {
                        return n0.a(s2, s1);
                    }
                }
                n n1 = this.d(s2, s1, null);
                n1.e = this.d;
                this.d = n1;
                return true;
            }
            this.b = s1;
            return true;
        }
        n n2 = this.d(this.a.substring(v), this.b, this.d);
        this.a = s.substring(0, v);
        this.d = n2;
        if(v < s.length()) {
            n n3 = this.d;
            n3.e = this.d(s.substring(v), s1, null);
            this.b = null;
            return true;
        }
        this.b = s1;
        return true;
    }

    public boolean b(char c, char c1) {
        return c == c1;
    }

    public final String c(CharSequence charSequence0, ParsePosition parsePosition0) {
        int v = parsePosition0.getIndex();
        int v1 = charSequence0.length();
        if(!this.e(charSequence0, v, v1)) {
            return null;
        }
        int v2 = this.a.length() + v;
        n n0 = this.d;
        if(n0 != null && v2 != v1) {
            do {
                int v3 = charSequence0.charAt(v2);
                if(this.b(n0.c, ((char)v3))) {
                    parsePosition0.setIndex(v2);
                    String s = n0.c(charSequence0, parsePosition0);
                    if(s == null) {
                        break;
                    }
                    return s;
                }
                n0 = n0.e;
            }
            while(n0 != null);
        }
        parsePosition0.setIndex(v2);
        return this.b;
    }

    public n d(String s, String s1, n n0) {
        return new n(s, s1, n0);
    }

    public boolean e(CharSequence charSequence0, int v, int v1) {
        if((charSequence0 instanceof String)) {
            return ((String)charSequence0).startsWith(this.a, v);
        }
        int v2 = this.a.length();
        if(v2 > v1 - v) {
            return false;
        }
        for(int v3 = 0; v2 > 0; ++v3) {
            if(!this.b(this.a.charAt(v3), charSequence0.charAt(v))) {
                return false;
            }
            ++v;
            --v2;
        }
        return true;
    }
}

