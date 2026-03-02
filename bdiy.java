import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public final class bdiy {
    public static final bboh a;
    public final PackageManager b;
    public final bxwm c;
    public final bcyv d;
    private final bdog e;
    private final bdns f;

    static {
        bdiy.a = bboh.b("CredentialExporter", bbcu.cX);
    }

    public bdiy(PackageManager packageManager0, bxwm bxwm0, bcyv bcyv0, bdog bdog0, bdns bdns0) {
        ibuq.f(bdog0, "passwordStorageFactory");
        ibuq.f(bdns0, "passkeyStorageFactory");
        super();
        this.b = packageManager0;
        this.c = bxwm0;
        this.d = bcyv0;
        this.e = bdog0;
        this.f = bdns0;
    }

    static Object a(bdiy bdiy0, String s, Intent intent0, ibrl ibrl0) {
        List list1;
        bdix bdix0;
        if((ibrl0 instanceof bdix)) {
            bdix0 = (bdix)ibrl0;
            int v = bdix0.e;
            if((v & 0x80000000) == 0) {
                bdix0 = new bdix(bdiy0, ibrl0);
            }
            else {
                bdix0.e = v - 0x80000000;
            }
        }
        else {
            bdix0 = new bdix(bdiy0, ibrl0);
        }
        Object object0 = bdix0.c;
        Object object1 = ibrx.a;
        int v1 = 1;
        switch(bdix0.e) {
            case 0: {
                ibnx.b(object0);
                bdkb.b(intent0);
                bdoe bdoe0 = bdiy0.e.a(s);
                bdix0.a = bdiy0;
                bdix0.f = s;
                bdix0.b = 1;
                bdix0.e = 1;
                object0 = bdoe.a(bdoe0, bdix0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_28;
            }
            case 1: {
                v1 = bdix0.b;
                s = bdix0.f;
                bdiy0 = (bdiy)bdix0.a;
                ibnx.b(object0);
            label_28:
                if((((bdnx)object0) instanceof bdnv)) {
                    List list0 = ((bdnv)(((bdnx)object0))).a;
                    if(v1 != 0) {
                        bdnq bdnq0 = bdiy0.f.a(s);
                        bdix0.a = list0;
                        bdix0.f = null;
                        bdix0.e = 2;
                        object0 = bdnq.c(bdnq0, bdix0);
                        if(object0 != object1) {
                            list1 = list0;
                            break;
                        }
                        return object1;
                    }
                    return new bdiu(list0, ibps.a);
                }
                if((((bdnx)object0) instanceof bdnw)) {
                    return new bdiv(((bdnw)(((bdnx)object0))).a);
                }
                if((((bdnx)object0) instanceof bdnu)) {
                    return bdis.a;
                }
                throw new ibnq();
            }
            case 2: {
                list1 = (List)bdix0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((((bdnd)object0) instanceof bdnc)) {
            return new bdiu(list1, ((bdnc)(((bdnd)object0))).a);
        }
        if((((bdnd)object0) instanceof bdnb)) {
            return new bdiv(((bdnb)(((bdnd)object0))).a);
        }
        if((((bdnd)object0) instanceof bdna)) {
            return bdir.a;
        }
        throw new ibnq();
    }
}

