import java.util.ArrayList;

public final class jsf {
    public static jsm a(jro jro0, int v, ArrayList arrayList0, jsm jsm0) {
        int v1 = v == 0 ? jro0.ap : jro0.aq;
        if(v1 != -1 && (jsm0 == null || v1 != jsm0.c)) {
            for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
                jsm jsm1 = (jsm)arrayList0.get(v2);
                if(jsm1.c == v1) {
                    if(jsm0 != null) {
                        jsm0.c(v, jsm1);
                        arrayList0.remove(jsm0);
                    }
                    jsm0 = jsm1;
                    break;
                }
            }
        }
        else if(v1 != -1) {
            return jsm0;
        }
        if(jsm0 == null) {
            if((jro0 instanceof jrt)) {
                for(int v3 = 0; true; ++v3) {
                    int v4 = -1;
                    if(v3 >= ((jrt)jro0).aK) {
                        break;
                    }
                    jro jro1 = ((jrt)jro0).aJ[v3];
                    if(v == 0) {
                        int v5 = jro1.ap;
                        if(v5 != -1) {
                            v4 = v5;
                            break;
                        }
                    }
                    else {
                        int v6 = jro1.aq;
                        if(v6 != -1) {
                            v4 = v6;
                            break;
                        }
                    }
                }
                if(v4 != -1) {
                    for(int v7 = 0; v7 < arrayList0.size(); ++v7) {
                        jsm jsm2 = (jsm)arrayList0.get(v7);
                        if(jsm2.c == v4) {
                            jsm0 = jsm2;
                            break;
                        }
                    }
                }
            }
            if(jsm0 == null) {
                jsm0 = new jsm(v);
            }
            arrayList0.add(jsm0);
        }
        if(jsm0.d(jro0)) {
            if((jro0 instanceof jrs)) {
                ((jrs)jro0).d.d((((jrs)jro0).as == 0 ? 1 : 0), arrayList0, jsm0);
            }
            if(v == 0) {
                jro0.ap = jsm0.c;
                jro0.K.d(0, arrayList0, jsm0);
                jro0.M.d(0, arrayList0, jsm0);
            }
            else {
                jro0.aq = jsm0.c;
                jro0.L.d(1, arrayList0, jsm0);
                jro0.O.d(1, arrayList0, jsm0);
                jro0.N.d(1, arrayList0, jsm0);
            }
            jro0.R.d(v, arrayList0, jsm0);
        }
        return jsm0;
    }

    public static jsm b(ArrayList arrayList0, int v) {
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            jsm jsm0 = (jsm)arrayList0.get(v2);
            if(v == jsm0.c) {
                return jsm0;
            }
        }
        return null;
    }

    public static boolean c(int v, int v1, int v2, int v3) {
        boolean z;
        switch(v2) {
            case 1: 
            case 2: {
                z = true;
                break;
            }
            case 4: {
                z = v != 2;
                break;
            }
            default: {
                z = false;
            }
        }
        switch(v3) {
            case 1: 
            case 2: {
                return true;
            }
            case 4: {
                return v1 == 2 ? z : true;
            }
            default: {
                return z;
            }
        }
    }
}

