import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class bfer {
    public final Context a;
    public final bgmt b;
    public final beau c;

    public bfer(Context context0, bgmt bgmt0, beau beau0) {
        this.a = context0;
        this.b = bgmt0;
        this.c = beau0;
    }

    public final Object a(bedz bedz0, bdbk bdbk0, ibrl ibrl0) {
        Object object3;
        bfeo bfeo0;
        if((ibrl0 instanceof bfeo)) {
            bfeo0 = (bfeo)ibrl0;
            int v = bfeo0.d;
            if((v & 0x80000000) == 0) {
                bfeo0 = new bfeo(this, ibrl0);
            }
            else {
                bfeo0.d = v - 0x80000000;
            }
        }
        else {
            bfeo0 = new bfeo(this, ibrl0);
        }
        Object object0 = bfeo0.b;
        Object object1 = ibrx.a;
        switch(bfeo0.d) {
            case 0: {
                ibnx.b(object0);
                String s = bedz0.toString();
                evql evql0 = bdbk0.b(ibpo.b(s));
                bfeo0.a = bedz0;
                bfeo0.e = s;
                bfeo0.d = 1;
                Object object2 = ictn.b(evql0, bfeo0);
                if(object2 != object1) {
                    object3 = s;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 1: {
                String s1 = bfeo0.e;
                Object object4 = bfeo0.a;
                ibnx.b(object0);
                object3 = s1;
                bedz0 = object4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        hhyh hhyh0 = (hhyh)ibpo.T(((gged_interceptors)object0));
        if(hhyh0 != null) {
            hfuo hfuo0 = hhyh0.c;
            if(hfuo0 != null) {
                for(Object object5: hfuo0) {
                    String s2 = ((hhyf)object5).c;
                    ibuq.e(s2, "getId(...)");
                    bedz bedz1 = bgmt.b(s2);
                    if(bedz1 == null || !bedz1.equals(bedz0)) {
                        continue;
                    }
                    goto label_43;
                }
                object5 = null;
            label_43:
                if(((hhyf)object5) != null) {
                    hhyd hhyd0 = ((hhyf)object5).d;
                    if(hhyd0 == null) {
                        hhyd0 = hhyd.a;
                    }
                    if(hhyd0 != null) {
                        return hhyd0.c == null ? object3 : hhyd0.c;
                    }
                }
            }
        }
        return object3;
    }

    public final Object b(bedy bedy0, String s, bdbk bdbk0, ibrl ibrl0) {
        String s2;
        bfep bfep0;
        if((ibrl0 instanceof bfep)) {
            bfep0 = (bfep)ibrl0;
            int v = bfep0.c;
            if((v & 0x80000000) == 0) {
                bfep0 = new bfep(this, ibrl0);
            }
            else {
                bfep0.c = v - 0x80000000;
            }
        }
        else {
            bfep0 = new bfep(this, ibrl0);
        }
        Object object0 = bfep0.a;
        Object object1 = ibrx.a;
        switch(bfep0.c) {
            case 0: {
                ibnx.b(object0);
                String s1 = bedy0.toString();
                bfep0.d = bedy0;
                bfep0.e = s;
                bfep0.f = s1;
                bfep0.c = 1;
                Object object2 = this.a(bedy0, bdbk0, bfep0);
                if(object2 != object1) {
                    object0 = object2;
                    s2 = s1;
                    break;
                }
                return object1;
            }
            case 1: {
                s2 = bfep0.f;
                s = bfep0.e;
                bedy0 = bfep0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(bedy0.toString()));
        ibuq.e(intent0, "setData(...)");
        return new bfen(s, s2, ((String)object0), intent0);
    }

    public final Object c(bedw bedw0, String s, bdbk bdbk0, Intent intent0, ibrl ibrl0) {
        bfeq bfeq0;
        if((ibrl0 instanceof bfeq)) {
            bfeq0 = (bfeq)ibrl0;
            int v = bfeq0.d;
            if((v & 0x80000000) == 0) {
                bfeq0 = new bfeq(this, ibrl0);
            }
            else {
                bfeq0.d = v - 0x80000000;
            }
        }
        else {
            bfeq0 = new bfeq(this, ibrl0);
        }
        Object object0 = bfeq0.b;
        Object object1 = ibrx.a;
        switch(bfeq0.d) {
            case 0: {
                ibnx.b(object0);
                String s1 = bedw0.toString();
                bfeq0.a = intent0;
                bfeq0.e = s;
                bfeq0.f = s1;
                bfeq0.d = 1;
                Object object2 = this.a(bedw0, bdbk0, bfeq0);
                return object2 != object1 ? new bfen(s, s1, ((String)object2), intent0) : object1;
            }
            case 1: {
                String s2 = bfeq0.f;
                s = bfeq0.e;
                intent0 = bfeq0.a;
                ibnx.b(object0);
                return new bfen(s, s2, ((String)object0), intent0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

