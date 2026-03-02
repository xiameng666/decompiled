import java.util.List;

public abstract class hmfv {
    private final hmgf a;
    public final hmbb d;

    public hmfv(hmgf hmgf0) {
        this.d = hmhe.a();
        this.a = hmgf0;
    }

    public abstract int a();

    public abstract int b();

    public final hmfy d() {
        return new hmfy(this.a);
    }

    public final hmfw e() {
        int v1;
        hmdi hmdi1;
        hmgf hmgf0 = this.a;
        hmdi hmdi0 = hmgf0.e;
        hmer hmer0 = null;
        int v = 2;
        if(hmgf0.o) {
            goto label_20;
            try {
            label_21:
                hmer0 = hmdi0.i();
            }
            catch(hmdp unused_ex) {
            }
            if(hmer0 == null) {
                goto label_36;
            }
            else {
                try {
                    if(hmej0 == null || !hmer0.d()) {
                    label_36:
                        v1 = 3;
                    }
                    else if(!hmej0.d()) {
                        v1 = 2;
                    }
                    else if(hmej0.c()) {
                        v1 = 1;
                    }
                    else if(hmer0.c()) {
                        v1 = 1;
                    }
                    else {
                        v1 = 2;
                    }
                }
                catch(hmdp unused_ex) {
                    goto label_36;
                }
            }
        }
        else if(hmgf0.e() == 1) {
            try {
                hmdi1 = this.a.e;
                hmdy hmdy0 = hmdi1.c();
            }
            catch(hmdp unused_ex) {
                goto label_36;
            }
            try {
                hmer0 = hmdi1.i();
            }
            catch(hmdp unused_ex) {
            }
            if(hmer0 == null) {
                goto label_36;
            }
            else {
                try {
                    if(hmdy0 == null) {
                        goto label_36;
                    }
                    else if(hmdy0.c()) {
                        v1 = 1;
                        goto label_37;
                    label_20:
                        hmej hmej0 = hmdi0.f();
                        goto label_21;
                    }
                    else if(!hmer0.d()) {
                        goto label_36;
                    }
                    else if(!hmer0.c()) {
                        v1 = 2;
                    }
                    else {
                        v1 = 1;
                    }
                }
                catch(hmdp unused_ex) {
                    goto label_36;
                }
            }
        }
        else {
            goto label_36;
        }
        try {
        label_37:
            hmgz hmgz0 = (hmgz)((hmeh)hmdi0.d(hmeh.class)).a;
        }
        catch(hmdp unused_ex) {
        }
        try {
            hmdi0.f();
        }
        catch(hmdp unused_ex) {
        }
        hmgf hmgf1 = this.a;
        if(hmgf1.e() == 1) {
            Byte byte0 = (Byte)((hmet)hmdi0.e(hmet.class)).a;
            if(!hmgf1.o) {
                v = 1;
            }
            hmgc hmgc0 = (hmgc)hmgf1;
            return new hmfw(v, v1);
        }
        if(hmgf1.e() == 2) {
            return ((hmgd)hmgf1).a.g == 1 ? new hmfw(3, 3) : new hmfw(4, 3);
        }
        return new hmfw(5, 1);
    }

    public final hmfx f() {
        int v2;
        int v1;
        int v;
        hmdi hmdi0 = this.a.e;
        this.a.i.b();
        try {
            v = 6;
            v = this.d().a();
            hmdi hmdi1 = this.a.e;
            if(!this.a.o) {
                if(hmdi1.c().c()) {
                    v1 = v;
                    v2 = 1;
                }
                else {
                    goto label_20;
                }
            }
            else if(hmdi1.f().c()) {
                v1 = v;
                v2 = 1;
            }
            else {
                v1 = v;
                v2 = 2;
            }
        }
        catch(hmdp unused_ex) {
            v1 = v;
            v2 = 3;
        }
        goto label_22;
    label_20:
        v1 = v;
        v2 = 2;
    label_22:
        hmgf hmgf0 = this.a;
        if((hmgf0 instanceof hmgc)) {
            hmft hmft0 = (hmft)hmgf0.i;
            hmgc hmgc0 = (hmgc)hmgf0;
        }
        hmgz hmgz0 = ((hmex)hmdi0.e(hmex.class)).b;
        hmgz hmgz1 = ((hmdu)hmdi0.e(hmdu.class)).b;
        hmgz hmgz2 = ((hmds)hmdi0.e(hmds.class)).b;
        int v3 = hmgf0.f();
        this.a();
        return new hmfx(hmgz0, hmgz1, hmgz2, v3, v1, v2);
    }

    public final int g(int v, hmca hmca0, int v1, int v2, int v3) {
        if(v3 == 1) {
            this.a.k.g();
        }
        List list0 = hmca0.a;
        hmhq hmhq0 = hmhq.f;
        if((list0.contains(hmhq0) || list0.contains(hmhq.d)) && v == 3 && hmca0.b != 3) {
            return 6;
        }
        hmgf hmgf0 = this.a;
        hmgf0.k.f();
        if(list0.contains(hmhq.d)) {
            return 4;
        }
        if(list0.contains(hmhq0)) {
            return 2;
        }
        return hmgf0.h.e ? 3 : 2;
    }

    public static final int h(int v, int v1) {
        return 2;
    }
}

