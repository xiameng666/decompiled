public final class qvl extends qvj {
    public int a;
    public boolean b;
    public int f;
    public long g;
    public String h;
    public final String i;
    public String j;
    public int k;
    public String l;

    public qvl() {
        this.a = 0;
        this.b = true;
        this.f = 0;
        this.g = -1L;
        this.i = "2.2.0-1.0.23";
        this.h = null;
        this.j = "00";
        this.k = 0;
    }

    @Override
    public final String toString() {
        String s1;
        String s = "00";
        if(this.j.compareToIgnoreCase("00") != 0) {
            int v = Integer.parseInt(this.j);
            int v1 = 0;
            int v2 = 0;
            while(v2 < 5) {
                int v3 = new int[]{1, 2, 3, 4, 5}[v2];
                if(v3 == 0) {
                    throw null;
                }
                if(v == v3) {
                    v1 = v3;
                    break;
                }
                ++v2;
                continue;
            }
            switch(v1) {
                case 1: {
                    s1 = "ACTIVE";
                    break;
                }
                case 2: {
                    s1 = "SUSPEND";
                    break;
                }
                case 3: {
                    s1 = "DELETE";
                    break;
                }
                case 4: {
                    s1 = "BLOCKED";
                    break;
                }
                case 5: {
                    s1 = "TERMINATE";
                    break;
                }
                default: {
                    s1 = "null";
                }
            }
            s = s1;
            if(v1 == 0) {
                throw null;
            }
        }
        return "TokenStatus{lupcCount=" + String.format("%04x", ((int)(this.a & 0xFF))) + ", refreshRequired=" + this.b + ", maxATC=" + String.format("%04x", ((int)this.f)) + ", lupcRefreshCheckBack=" + this.g + ", healthyLupcCount=" + this.k + ", tokenDataVersion=\'" + this.h + "\', clientVersion=\'" + this.i + "\', tokenState=\'" + s + "\', apiLog=\'" + this.l + "\'}";
    }
}

