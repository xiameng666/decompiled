public abstract class hmgf {
    public hmdi e;
    public hmdj f;
    public hmbz g;
    public hmcp h;
    public hmfv i;
    public hmhl j;
    public hmhk k;
    public hmhn l;
    public hmhj m;
    public hmde n;
    public boolean o;
    public hmcs p;
    public hmhi q;
    public hmfz r;
    public final hmbb s;
    public hmba t;
    public esrk u;

    public hmgf() {
        this.o = false;
        this.s = hmhe.a();
    }

    public abstract int e();

    public final int f() {
        hmen hmen0;
        switch(this.e()) {
            case 2: 
            case 3: {
                break;
            }
            default: {
                if(this.o) {
                    try {
                        if((((byte)(((Byte)this.e.f().a))) & 3) != 0) {
                            return this.e.f().c() ? 2 : 1;
                        }
                        goto label_14;
                    }
                    catch(hmdp unused_ex) {
                        try {
                        label_14:
                            if(!this.e.g().d()) {
                                return 3;
                            }
                            if(this.e.g().c()) {
                                return 1;
                            }
                            break;
                        }
                        catch(hmdp unused_ex) {
                        }
                    }
                    return 3;
                }
                else {
                    try {
                        hmdy hmdy0 = this.e.c();
                    }
                    catch(hmdp unused_ex) {
                        return 3;
                    }
                    switch(((hmgz)hmdy0.a).a[0] & 0x3F) {
                        case 0x1F: 
                        case 0x3F: {
                            goto label_5;
                        }
                    }
                    return 2;
                label_5:
                    if(hmdy0.d() || hmdy0.e()) {
                        try {
                            hmen0 = this.e.g();
                        }
                        catch(hmdp unused_ex) {
                            return 1;
                        }
                        if(hmen0.d()) {
                            return hmen0.c() ? 1 : 2;
                        }
                        return 1;
                    }
                }
            }
        }
        return 2;
    }
}

