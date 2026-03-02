public final class hmez extends hmeb {
    public hmez() {
        try {
            this.b(new hmgz(3));
        }
        catch(hmdl unused_ex) {
        }
    }

    public hmez(hmhd hmhd0) {
        int v = hmhd0.a + 2000;
        String s = (v >= 2010 ? "" : "0") + v % 2000;
        int v1 = hmhd0.c;
        if(v1 < 10) {
            s = s + "0";
        }
        String s1 = s + v1;
        int v2 = hmhd0.b;
        if(v2 < 10) {
            s1 = s1 + "0";
        }
        hmgz hmgz0 = new hmgz(s1 + v2);
        this.a = hmgz0;
        super.b(hmgz0);
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9A");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgz0;
    }
}

