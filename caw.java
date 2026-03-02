import java.util.List;

final class caw implements iau {
    public final cbm a;

    public caw(cbm cbm0) {
        this.a = cbm0;
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((hzf)list0.get(0)).a(v);
        int v1 = ibpo.d(list0);
        if(v1 > 0) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((hzf)list0.get(v2)).a(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((hzf)list0.get(0)).b(v);
        int v1 = ibpo.d(list0);
        if(v1 > 0) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((hzf)list0.get(v2)).b(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((hzf)list0.get(0)).c(v);
        int v1 = ibpo.d(list0);
        if(v1 > 0) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((hzf)list0.get(v2)).c(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((hzf)list0.get(0)).d(v);
        int v1 = ibpo.d(list0);
        if(v1 > 0) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((hzf)list0.get(v2)).d(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        int v15;
        int v10;
        int v5;
        caz caz0;
        int v1 = list0.size();
        ibq[] arr_ibq = new ibq[v1];
        int v2 = list0.size();
        long v3 = 0L;
        for(int v4 = 0; true; ++v4) {
            caz0 = null;
            v5 = 1;
            if(v4 >= v2) {
                break;
            }
            ias ias0 = (ias)list0.get(v4);
            Object object0 = ias0.f();
            if((object0 instanceof caz)) {
                caz0 = (caz)object0;
            }
            if(caz0 != null && ((Boolean)caz0.a.a()).booleanValue()) {
                ibq ibq0 = ias0.e(v);
                long v6 = ((long)ibq0.a) << 0x20;
                long v7 = ((long)ibq0.b) & 0xFFFFFFFFL;
                arr_ibq[v4] = ibq0;
                v3 = v6 | v7;
            }
        }
        int v8 = list0.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            ias ias1 = (ias)list0.get(v9);
            if(arr_ibq[v9] == null) {
                arr_ibq[v9] = ias1.e(v);
            }
        }
        if(iax0.ep()) {
            v10 = (int)(v3 >> 0x20);
        }
        else if(v1 == 0) {
            v10 = 0;
        }
        else {
            ibq ibq1 = arr_ibq[0];
            int v11 = ibpg.w(arr_ibq);
            if(v11 != 0) {
                int v12 = ibq1 == null ? 0 : ibq1.a;
                if(v11 > 0) {
                    int v13 = 1;
                    while(true) {
                        ibq ibq2 = arr_ibq[v13];
                        int v14 = ibq2 == null ? 0 : ibq2.a;
                        if(v12 < v14) {
                            ibq1 = ibq2;
                        }
                        if(v13 == v11) {
                            break;
                        }
                        ++v13;
                        v12 = v12 >= v14 ? v12 : v14;
                    }
                }
            }
            v10 = ibq1 == null ? 0 : ibq1.a;
        }
        if(iax0.ep()) {
            v15 = (int)(v3 & 0xFFFFFFFFL);
        }
        else if(v1 == 0) {
            v15 = 0;
        }
        else {
            caz0 = arr_ibq[0];
            int v16 = ibpg.w(arr_ibq);
            if(v16 != 0) {
                int v17 = caz0 == null ? 0 : caz0.b;
                if(v16 > 0) {
                    while(true) {
                        ibq ibq3 = arr_ibq[v5];
                        int v18 = ibq3 == null ? 0 : ibq3.b;
                        if(v17 < v18) {
                            caz0 = ibq3;
                        }
                        if(v5 == v16) {
                            break;
                        }
                        ++v5;
                        v17 = v17 >= v18 ? v17 : v18;
                    }
                }
            }
            v15 = caz0 == null ? 0 : caz0.b;
        }
        if(!iax0.ep()) {
            jlk jlk0 = new jlk(((long)v10) << 0x20 | ((long)v15) & 0xFFFFFFFFL);
            this.a.d.b(jlk0);
        }
        return iaw.b(iax0, v10, v15, new cav(arr_ibq, this, v10, v15));
    }
}

