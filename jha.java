public final class jha {
    public String a;
    public jgh b;
    public int c;
    public int d;

    public jha(String s) {
        this.a = s;
        this.c = -1;
        this.d = -1;
    }

    public final int a() {
        jgh jgh0 = this.b;
        if(jgh0 == null) {
            return this.a.length();
        }
        int v = jgh0.b();
        return this.a.length() - (this.d - this.c) + v;
    }

    public final void b(int v, int v1, String s) {
        if(v > v1) {
            jie.a(a.z(v1, v, "start index must be less than or equal to end index: ", " > "));
        }
        if(v < 0) {
            jie.a(("start must be non-negative, but was " + v));
        }
        jgh jgh0 = this.b;
        if(jgh0 == null) {
            int v2 = Math.max(0xFF, s.length() + 0x80);
            char[] arr_c = new char[v2];
            int v3 = Math.min(v, 0x40);
            int v4 = Math.min(this.a.length() - v1, 0x40);
            int v5 = v - v3;
            jgj.a(this.a, arr_c, 0, v5, v);
            int v6 = v2 - v4;
            int v7 = v4 + v1;
            jgj.a(this.a, arr_c, v6, v1, v7);
            jgi.a(s, arr_c, v3);
            this.b = new jgh(arr_c, v3 + s.length(), v6);
            this.c = v5;
            this.d = v7;
            return;
        }
        int v8 = v - this.c;
        int v9 = v1 - this.c;
        if(v8 >= 0 && v9 <= jgh0.b()) {
            int v10 = s.length() - (v9 - v8);
            if(v10 > jgh0.a()) {
                int v11 = v10 - jgh0.a();
                int v12 = jgh0.a;
                do {
                    v12 += v12;
                }
                while(v12 - jgh0.a < v11);
                char[] arr_c1 = new char[v12];
                ibpg.Y(jgh0.b, arr_c1, 0, 0, jgh0.c);
                int v13 = jgh0.a - jgh0.d;
                int v14 = v12 - v13;
                ibpg.Y(jgh0.b, arr_c1, v14, jgh0.d, v13 + jgh0.d);
                jgh0.b = arr_c1;
                jgh0.a = v12;
                jgh0.d = v14;
            }
            int v15 = jgh0.c;
            if(v8 < v15 && v9 <= v15) {
                int v16 = v15 - v9;
                ibpg.Y(jgh0.b, jgh0.b, jgh0.d - v16, v9, v15);
                jgh0.c = v8;
                jgh0.d -= v16;
            }
            else if(v8 < v15 && v9 >= v15) {
                jgh0.d = v9 + jgh0.a();
                jgh0.c = v8;
            }
            else {
                int v17 = v8 + jgh0.a();
                int v18 = v17 - jgh0.d;
                ibpg.Y(jgh0.b, jgh0.b, v15, jgh0.d, v17);
                v8 = jgh0.c + v18;
                jgh0.c = v8;
                jgh0.d = v9 + jgh0.a();
            }
            jgi.a(s, jgh0.b, v8);
            jgh0.c += s.length();
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.b(v, v1, s);
    }

    @Override
    public final String toString() {
        jgh jgh0 = this.b;
        if(jgh0 == null) {
            return this.a;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a, 0, this.c);
        stringBuilder0.append(jgh0.b, 0, jgh0.c);
        stringBuilder0.append(jgh0.b, jgh0.d, jgh0.a - jgh0.d);
        stringBuilder0.append(this.a, this.d, this.a.length());
        return stringBuilder0.toString();
    }
}

