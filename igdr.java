import java.io.Serializable;

public class igdr extends igdp implements igdi, Serializable {
    public volatile long a;
    public volatile igcm b;
    private static final long serialVersionUID = 0xFFFFF9E14F5D2EA3L;

    public igdr() {
        this(igct.a(), igev.Q());
    }

    public igdr(int v, int v1, int v2, int v3, int v4, int v5, int v6, igcm igcm0) {
        this.b = igct.d(igcm0);
        this.a = this.b.b(v, v1, v2, v3, v4, v5, v6);
        this.d();
    }

    public igdr(long v, igcm igcm0) {
        this.b = igct.d(igcm0);
        this.a = v;
        this.d();
    }

    public igdr(long v, igcw igcw0) {
        this(v, igev.R(igcw0));
    }

    public igdr(Object object0, igcw igcw0) {
        int v9;
        igfh igfh2;
        igfh igfh0;
        int v1;
        igfl igfl0 = igfi.a.a;
        Class class0 = object0 == null ? null : object0.getClass();
        igfk[] arr_igfk = igfl0.b;
        if(class0 != null) {
            v1 = arr_igfk.length - 1 & class0.hashCode();
            goto label_9;
        }
        do {
            v1 = 0;
        label_9:
            igfk igfk0 = arr_igfk[v1];
            if(igfk0 == null) {
                goto label_17;
            }
            if(igfk0.a == class0) {
                igfh0 = igfk0.b;
                goto label_103;
            }
        }
        while(v1 + 1 >= arr_igfk.length);
        ++v1;
        goto label_9;
    label_17:
        igfh[] arr_igfh = igfl0.a;
        int v2 = arr_igfh.length;
        igfl igfl1 = igfl0;
        int v3 = v2;
    alab1:
        while(true) {
            do {
            label_21:
                --v2;
                if(v2 < 0) {
                    goto label_33;
                }
                igfh igfh1 = arr_igfh[v2];
                Class class1 = igfh1.c();
                if(class1 == class0) {
                    igfh2 = igfh1;
                    break alab1;
                }
            }
            while(class1 != null && (class0 == null || class1.isAssignableFrom(class0)));
            igfl1 = igfl1.b(v2);
            arr_igfh = igfl1.a;
            v3 = arr_igfh.length;
            goto label_21;
        label_33:
            if(class0 != null) {
                switch(v3) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        igfh2 = arr_igfh[0];
                        break alab1;
                    }
                    default: {
                        igfl igfl2 = igfl1;
                        int v4 = v3;
                        while(true) {
                            --v3;
                            if(v3 < 0) {
                                break;
                            }
                            Class class2 = arr_igfh[v3].c();
                            igfl igfl3 = igfl2;
                            int v5 = v4;
                            while(true) {
                                --v4;
                                if(v4 < 0) {
                                    break;
                                }
                                if(v4 != v3 && arr_igfh[v4].c().isAssignableFrom(class2)) {
                                    igfl3 = igfl3.b(v4);
                                    arr_igfh = igfl3.a;
                                    v5 = arr_igfh.length;
                                    v3 = v5 - 1;
                                }
                            }
                            v4 = v5;
                            igfl2 = igfl3;
                        }
                        if(v4 == 1) {
                            igfh2 = arr_igfh[0];
                            break alab1;
                        }
                        StringBuilder stringBuilder0 = new StringBuilder("Unable to find best converter for type \"");
                        stringBuilder0.append(class0.getName());
                        stringBuilder0.append("\" from remaining set: ");
                        for(int v = 0; v < v4; ++v) {
                            igfh igfh3 = arr_igfh[v];
                            Class class3 = igfh3.c();
                            stringBuilder0.append(igfh3.getClass().getName());
                            stringBuilder0.append('[');
                            stringBuilder0.append((class3 == null ? null : class3.getName()));
                            stringBuilder0.append("], ");
                        }
                        throw new IllegalStateException(stringBuilder0.toString());
                    }
                }
            }
            igfh2 = null;
            break;
        }
        igfk igfk1 = new igfk(class0, igfh2);
        igfk[] arr_igfk1 = (igfk[])arr_igfk.clone();
        arr_igfk1[v1] = igfk1;
        int v6 = 0;
        while(true) {
            if(v6 >= arr_igfk.length) {
                int v7 = arr_igfk.length + arr_igfk.length;
                igfk[] arr_igfk2 = new igfk[v7];
                int v8 = 0;
                while(v8 < arr_igfk.length) {
                    igfk igfk2 = arr_igfk1[v8];
                    Class class4 = igfk2.a;
                    if(class4 != null) {
                        v9 = class4.hashCode() & v7 - 1;
                        goto label_93;
                    }
                    while(true) {
                        v9 = 0;
                    label_93:
                        if(arr_igfk2[v9] == null) {
                            break;
                        }
                        if(v9 + 1 >= v7) {
                            continue;
                        }
                        ++v9;
                        goto label_93;
                    }
                    arr_igfk2[v9] = igfk2;
                    ++v8;
                }
                igfl0.b = arr_igfk2;
                break;
            }
            if(arr_igfk1[v6] == null) {
                igfl0.b = arr_igfk1;
                break;
            }
            ++v6;
        }
        igfh0 = igfh2;
    label_103:
        if(((igfn)igfh0) == null) {
            throw new IllegalArgumentException("No instant converter found for type: " + (object0 == null ? "null" : object0.getClass().getName()));
        }
        igcm igcm0 = ((igfn)igfh0).b(object0, igcw0);
        this.b = igcm0;
        this.a = ((igfn)igfh0).a(object0, igcm0);
        this.d();
    }

    private final void d() {
        if(this.a != 0x8000000000000000L && this.a != 0x7FFFFFFFFFFFFFFFL) {
            return;
        }
        this.b = this.b.c();
    }

    @Override  // igdk
    public final long oT() {
        return this.a;
    }

    @Override  // igdk
    public final igcm oU() {
        return this.b;
    }

    protected void oV(long v) {
        this.a = v;
    }
}

