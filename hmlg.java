import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmlg {
    public JSONObject a;
    public hmln b;
    public hmll c;
    public int d;
    public JSONArray e;
    public hmlk f;
    hmqm g;
    private boolean h;

    public hmlg() {
        this.h = false;
    }

    public final hmli a() {
        hmli hmli14;
        Deque deque0;
        Deque deque3;
        boolean z2;
        boolean z4;
        Deque deque5;
        if(!this.h) {
            return null;
        }
        JSONArray jSONArray0 = this.a.getJSONArray("minifiedDslSnippets");
        int v = 0;
        while(v < jSONArray0.length()) {
            this.d = v;
            hmlf hmlf0 = new hmlf(this, this.g, jSONArray0.getString(v));
            hmll hmll0 = this.c;
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                hmlf0.a = 0;
                while(hmlf0.a < hmlf0.b.length) {
                    hmlg hmlg0 = hmlf0.k;
                    hmle hmle0 = hmlg0.f.a();
                    if(hmle0 != null && (hmle0.e != null && (hmle0.e.b || hmle0.e.c))) {
                        int v1 = 0;
                        boolean z = false;
                        boolean z1 = false;
                        do {
                            char[] arr_c = hmlf0.b;
                            int v2 = hmlf0.a;
                            switch(arr_c[v2]) {
                                case 40: {
                                    ++v1;
                                    z = true;
                                    break;
                                }
                                case 41: {
                                    if(v1 > 0) {
                                        --v1;
                                        z = true;
                                        z1 = false;
                                    }
                                    break;
                                }
                                case 46: {
                                    z1 = true;
                                    z = true;
                                }
                            }
                            if(z) {
                                hmlf0.a = v2 + 1;
                                if(v2 + 1 == arr_c.length) {
                                    break;
                                }
                                else if(arr_c[v2 + 1] == 46) {
                                    z1 = true;
                                }
                            }
                        }
                        while(v1 != 0 || z1);
                        hmle0.e = null;
                        hmlg0.f.b.pop();
                        hmlf0.j = hmlg0.f.a();
                    }
                    int v3 = hmlf0.a;
                    char[] arr_c1 = hmlf0.b;
                    if(v3 == arr_c1.length) {
                        break;
                    }
                    Character character0 = Character.valueOf(arr_c1[v3]);
                    Character character1 = Character.valueOf('[');
                    if(character0.compareTo(character1) == 0) {
                        ++hmlf0.m;
                    }
                    else if(character0.compareTo(Character.valueOf(']')) == 0) {
                        --hmlf0.m;
                    }
                    else if(character0.compareTo(Character.valueOf('(')) == 0) {
                        ++hmlf0.l;
                    }
                    else if(character0.compareTo(Character.valueOf(')')) == 0) {
                        int v4 = hmlf0.l;
                        if(v4 > 0) {
                            hmlf0.l = v4 - 1;
                        }
                    }
                    if(character0.compareTo(character1) == 0 && !hmlf0.g) {
                        hmlf0.h = true;
                        int v5 = hmlf0.i + 1;
                        hmlf0.i = v5;
                        if(v5 > 1) {
                            stringBuilder0.append(character0);
                        }
                    }
                    else if(hmlf0.h && character0.compareTo(Character.valueOf(']')) != 0) {
                        stringBuilder0.append(character0);
                    }
                    else if(hmlf0.h && character0.compareTo(Character.valueOf(']')) == 0) {
                        int v6 = hmlf0.i - 1;
                        hmlf0.i = v6;
                        if(v6 == 0) {
                            hmlf0.h = false;
                            hmlf0.d.push(new hmli(stringBuilder0.toString()));
                            stringBuilder0.setLength(0);
                        }
                        else {
                            stringBuilder0.append(character0);
                        }
                    }
                    else if(hmlf0.g && character0.compareTo(Character.valueOf('\\')) != 0) {
                        stringBuilder0.append(character0);
                    }
                    else if(character0.compareTo(Character.valueOf(' ')) != 0) {
                        if(character0.compareTo(Character.valueOf('(')) == 0) {
                            if(stringBuilder0.length() > 0) {
                                String s5 = stringBuilder0.toString();
                                stringBuilder0.setLength(0);
                                if(hmke.a.contains(s5)) {
                                    hmlf0.c.push(s5);
                                    hmlj hmlj4 = new hmlj(s5, hmlf0.d.size(), hmlf0.f);
                                    boolean z3 = hmlj4.b;
                                    String s6 = hmlj4.g;
                                    if(!s6.startsWith("foreach")) {
                                        if(!z3) {
                                            deque5 = hmlg0.f.b;
                                            z4 = deque5.isEmpty();
                                        label_256:
                                            if(z4) {
                                                deque5.push(hmle.e(null));
                                            }
                                            else {
                                                deque5.push(hmle.e(((hmle)deque5.peek())));
                                            }
                                            hmlf0.j = hmlg0.f.a();
                                        }
                                    }
                                    else if(!z3 && hmlj4.e.a.intValue() == 0) {
                                        deque5 = hmlg0.f.b;
                                        z4 = deque5.isEmpty();
                                        goto label_256;
                                    }
                                    if(s6.startsWith("foreach")) {
                                        hmlg0.f.a().i = true;
                                    }
                                    hmlf0.j.g.push(hmlj4);
                                    if(s5.startsWith("foreach")) {
                                        hmlj4.a(new hmli(hmlj4.e));
                                    }
                                    hmlf0.f = false;
                                }
                            }
                            hmlf0.c.push("(");
                        }
                        else if(character0.compareTo(Character.valueOf(')')) == 0) {
                            if(stringBuilder0.length() > 0) {
                                hmlf0.d.push(new hmli(stringBuilder0.toString()));
                                stringBuilder0.setLength(0);
                            }
                            hmlf0.b();
                            Deque deque1 = hmlf0.c;
                            if(deque1.isEmpty()) {
                                throw new IllegalArgumentException("Either \'(\' , \')\' , \'[\' or \']\' is missing or extra");
                            }
                            deque1.pop();
                            if(!deque1.isEmpty()) {
                                Object object0 = deque1.peek();
                                if(hmke.a.contains(object0)) {
                                    Deque deque2 = hmlf0.d;
                                    if(!deque2.isEmpty() && hmlf0.j.g.peek() != null && deque2.size() > ((hmlj)hmlf0.j.g.peek()).a) {
                                        ((hmlj)hmlf0.j.g.peek()).a(((hmli)deque2.pop()));
                                    }
                                    hmlj hmlj0 = (hmlj)hmlf0.j.g.peek();
                                    hmlj0.d = hmlf0.a - 1;
                                    String s2 = (String)deque1.pop();
                                    hmlj hmlj1 = (hmlj)hmlf0.j.g.peek();
                                    hmlg0.f.a();
                                    if(s2.startsWith("foreach")) {
                                        hmle hmle1 = hmlg0.f.a();
                                        hmle1.d = ((hmlj)hmlf0.j.g.peek()).e.a.intValue();
                                        if(hmlf0.a < ((hmlj)hmlf0.j.g.peek()).h) {
                                            ((hmlj)hmlf0.j.g.peek()).i = 0;
                                            ((hmlj)hmlf0.j.g.peek()).h = 0;
                                            hmlf0.b = (Arrays.copyOfRange(hmlf0.b, 0, ((hmlj)hmlf0.j.g.peek()).h) + Arrays.copyOfRange(hmlf0.b, ((hmlj)hmlf0.j.g.peek()).i, hmlf0.b.length)).toCharArray();
                                        }
                                    }
                                    List list0 = ((hmlj)hmlf0.j.g.peek()).c;
                                    hmli hmli4 = hmlf0.n.a(hmlf0, s2, list0);
                                    StringBuilder stringBuilder1 = new StringBuilder();
                                    stringBuilder1.append("[resolvedParams:");
                                    for(Object object1: list0) {
                                        hmlf.e(stringBuilder1, ((hmli)object1));
                                        stringBuilder1.append(",");
                                    }
                                    if(stringBuilder1.length() > 0) {
                                        stringBuilder1.deleteCharAt(stringBuilder1.length() - 1);
                                    }
                                    stringBuilder1.append("],[result:");
                                    hmlf.e(stringBuilder1, hmli4);
                                    stringBuilder1.append("]");
                                    hmlf0.c(s2, hmli4);
                                    if(hmli4.b) {
                                        "Error Occurred for function: ".concat(s2);
                                        String s3 = hmli4.d;
                                        Exception exception1 = new Exception(s3);
                                        hmlf0.p.a(s3, exception1);
                                        deque2.push(hmli4);
                                        hmlf0.j.g.pop();
                                    }
                                    else {
                                        ((hmlj)hmlf0.j.g.peek()).f = hmli4;
                                        if(!s2.startsWith("foreach")) {
                                            hmlf0.j.g.pop();
                                            z2 = false;
                                        }
                                        else if((hmli4.a instanceof Boolean) && hmli4.a.equals(Boolean.FALSE) && hmlf0.j.h.isEmpty()) {
                                            goto label_185;
                                        }
                                        else if(!(hmli4.a instanceof Boolean) || hmli4.a.equals(Boolean.TRUE)) {
                                            hmlf0.j.h.push(((hmlj)hmlf0.j.g.pop()));
                                            z2 = false;
                                        }
                                        else {
                                            hmlf0.j.g.pop();
                                            z2 = true;
                                        }
                                        if(!hmlf0.d() && hmlf0.j.h.isEmpty()) {
                                            deque2.push(hmli4);
                                            if(!hmlg0.f.b.isEmpty()) {
                                                hmle hmle2 = (hmle)hmlg0.f.b.pop();
                                                hmlf0.j = hmlg0.f.a();
                                            }
                                        }
                                        if((!hmlf0.d() || z2) && (hmlf0.j != null && !hmlf0.j.h.isEmpty()) && (hmlf0.j.i && hmlf0.j.g.isEmpty())) {
                                            hmli hmli5 = ((hmlj)hmlf0.j.h.peek()).f;
                                            if((hmli5.a instanceof Boolean) && ((Boolean)hmli5.a).booleanValue() || !(hmli5.a instanceof Boolean)) {
                                                hmlj hmlj2 = (hmlj)hmlf0.j.h.peek();
                                                hmkg hmkg0 = hmlj2.e;
                                                BigDecimal bigDecimal0 = hmkg0.a;
                                                Integer.valueOf(1).getClass();
                                                hmkg0.a = bigDecimal0.add(new BigDecimal(1));
                                                hmlf0.a = hmlj2.d;
                                                hmlf0.j.g.push(hmlj2);
                                                deque1.push(hmlj2.g);
                                                deque1.push("(");
                                                hmlf0.j.h.pop();
                                                hmlg0.f.a().f.clear();
                                                hmlf0.e.clear();
                                            }
                                            else {
                                                hmlf0.j.h.pop();
                                            }
                                            goto label_268;
                                        label_185:
                                            hmli4.e();
                                            deque2.push(hmli4);
                                            hmlf0.j.g.pop();
                                        }
                                    }
                                }
                            }
                        }
                        else if(character0.compareTo(Character.valueOf('.')) == 0) {
                            hmlf0.f = true;
                        }
                        else if(character0.compareTo(Character.valueOf(',')) == 0) {
                            if(stringBuilder0.length() > 0) {
                                hmlf0.d.push(new hmli(stringBuilder0.toString()));
                                stringBuilder0.setLength(0);
                            }
                            hmlf0.b();
                            Deque deque4 = hmlf0.d;
                            if(!deque4.isEmpty() && (hmlf0.j != null && !hmlf0.j.g.isEmpty())) {
                                hmlj hmlj3 = (hmlj)hmlf0.j.g.peek();
                                if(hmlj3 != null) {
                                    hmlj3.a(((hmli)deque4.pop()));
                                }
                            }
                        }
                        else if(hmke.c.contains(character0)) {
                            if(stringBuilder0.length() > 0) {
                                hmlf0.d.push(new hmli(stringBuilder0.toString()));
                                stringBuilder0.setLength(0);
                            }
                            while(true) {
                                deque3 = hmlf0.c;
                                if(deque3.isEmpty()) {
                                    break;
                                }
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(character0);
                                if(hmlf.f(stringBuilder2.toString()) >= hmlf.f(((String)deque3.peek()))) {
                                    break;
                                }
                                String s4 = (String)deque3.pop();
                                hmli hmli6 = (hmli)hmlf0.d.pop();
                                hmli hmli7 = (hmli)hmlf0.d.pop();
                                hmli hmli8 = hmlf0.o.a(s4, hmli6, hmli7);
                                hmlf0.c(s4, hmli8);
                                hmlf0.d.push(hmli8);
                            }
                            deque3.push(character0);
                        }
                        else if(character0.compareTo(Character.valueOf('\\')) != 0) {
                            stringBuilder0.append(character0);
                        }
                        else if(hmlf0.g) {
                            hmlf0.g = false;
                            hmlf0.d.push(new hmli(stringBuilder0.toString()));
                        label_222:
                            stringBuilder0.setLength(0);
                        }
                        else {
                            hmlf0.g = true;
                        }
                    }
                    else if(stringBuilder0.length() > 0) {
                        String s = stringBuilder0.toString();
                        if(hmke.b.contains(s)) {
                            while(true) {
                                deque0 = hmlf0.c;
                                if(deque0.isEmpty() || hmlf.f(s) >= hmlf.f(((String)deque0.peek()))) {
                                    break;
                                }
                                String s1 = (String)deque0.pop();
                                hmli hmli0 = (hmli)hmlf0.d.pop();
                                hmli hmli1 = (hmli)hmlf0.d.pop();
                                hmli hmli2 = hmlf0.o.a(s1, hmli0, hmli1);
                                hmlf0.c(s1, hmli2);
                                hmlf0.d.push(hmli2);
                            }
                            deque0.push(s);
                        }
                        else if(hmke.a.contains(s)) {
                            hmlf0.c.push(s);
                            hmlf0.j.g.push(new hmlj(s, hmlf0.d.size(), hmlf0.f));
                            if(s.startsWith("foreach")) {
                                ((hmlj)hmlf0.j.g.peek()).a(new hmli(((hmlj)hmlf0.j.g.peek()).e));
                            }
                        }
                        else {
                            hmli hmli3 = new hmli(s);
                            hmlf0.d.push(hmli3);
                        }
                        goto label_222;
                    }
                label_268:
                    ++hmlf0.a;
                }
                if(hmlf0.m != 0 || hmlf0.l != 0) {
                    throw new IllegalArgumentException("Either \'(\' , \')\' , \'[\' or \']\' is missing or extra");
                }
                while(true) {
                    Deque deque6 = hmlf0.c;
                    if(deque6.isEmpty()) {
                        break;
                    }
                    Deque deque7 = hmlf0.d;
                    if(deque7.size() <= 1) {
                        break;
                    }
                    String s7 = (String)deque6.pop();
                    hmli hmli9 = (hmli)deque7.pop();
                    hmli hmli10 = (hmli)deque7.pop();
                    hmli hmli11 = hmlf0.o.a(s7, hmli9, hmli10);
                    hmlf0.c(s7, hmli11);
                    deque7.push(hmli11);
                }
                Deque deque8 = hmlf0.d;
                if(((hmli)deque8.peek()).b) {
                    Deque deque9 = hmlf0.e;
                    if(!deque9.isEmpty()) {
                        hmli hmli12 = (hmli)deque8.peek();
                        hmli12.e = (hmlh)deque9.getLast();
                        hmli hmli13 = (hmli)deque8.peek();
                        hmli13.d = ((hmlh)deque9.getLast()).a;
                    }
                }
                hmli14 = (hmli)deque8.pop();
            }
            catch(Exception exception0) {
                hmlf0.p.a(exception0.getMessage(), exception0);
                hmli14 = new hmli(exception0.getMessage());
            }
            hmll0.a.put(Integer.valueOf(hmll0.c.d), hmli14);
            ++v;
        }
        return (hmli)this.c.a.get(Integer.valueOf(this.d));
    }

    public final void b(JSONObject jSONObject0, hmqm hmqm0) {
        if(jSONObject0 == null || hmqm0 == null) {
            throw new IllegalArgumentException("Card Config or Logging handler can not be null");
        }
        this.a = jSONObject0;
        this.g = hmqm0;
        this.c = new hmll(this);
        this.b = new hmln();
        this.e = new JSONArray();
        this.f = new hmlk();
        this.h = true;
    }
}

