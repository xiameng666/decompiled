public final class hmdy extends hmeb {
    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F34");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgz0;
    }

    public final boolean c() {
        switch(((hmgz)this.a).a[0] & 0x3F) {
            case 1: 
            case 4: {
                return this.d();
            }
            default: {
                return false;
            }
        }
    }

    public final boolean d() {
        return ((hmgz)this.a).a[2] == 2;
    }

    public final boolean e() {
        return ((hmgz)this.a).a[2] == 0;
    }

    public final int f() {
        int v = ((hmgz)this.a).a[0] & 0x3F;
        if(v != 0) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 1: 
                case 4: {
                    return 2;
                }
                case 30: {
                    return 4;
                }
                case 0x1F: {
                    return 5;
                }
                case 0x3F: {
                    return 6;
                }
                default: {
                    return 7;
                }
            }
        }
        return 1;
    }
}

