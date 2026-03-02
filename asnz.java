import android.accounts.Account;
import android.content.Context;

public final class asnz {
    private final asxf a;
    private final asyd b;
    private final asog c;
    private final asod d;
    private final asoc e;
    private final asoe f;
    private final Account g;

    public asnz(asxf asxf0, asyd asyd0, asog asog0, asod asod0, asoc asoc0, asoe asoe0, Account account0) {
        this.a = asxf0;
        this.b = asyd0;
        this.c = asog0;
        this.d = asod0;
        this.e = asoc0;
        this.f = asoe0;
        this.g = account0;
    }

    public final Object a(ibrl ibrl0) {
        String s8;
        arzs arzs2;
        ccow ccow1;
        String s7;
        ccow ccow0;
        String s6;
        String s5;
        String s2;
        String s4;
        String s3;
        Integer integer0;
        asoj asoj0;
        asnx asnx0;
        if((ibrl0 instanceof asnx)) {
            asnx0 = (asnx)ibrl0;
            int v = asnx0.c;
            if((v & 0x80000000) == 0) {
                asnx0 = new asnx(this, ibrl0);
            }
            else {
                asnx0.c = v - 0x80000000;
            }
        }
        else {
            asnx0 = new asnx(this, ibrl0);
        }
        Object object0 = asnx0.a;
        Object object1 = ibrx.a;
        switch(asnx0.c) {
            case 0: {
                ibnx.b(object0);
                arzs arzs0 = this.b.a(this.g);
                String s = this.g.name;
                ibuq.e(s, "name");
                Account account0 = (Account)this.a.b().g();
                String s1 = account0 == null ? null : account0.name;
                asoi asoi0 = !this.a.e() || !this.a.b().i() ? asoi.b : asoi.a;
                asoi asoi1 = this.a.f() - 2 == 2 ? asoi.b : asoi.a;
                arzs arzs1 = this.b.a(this.g);
                if(arzs1 == null) {
                    asoj0 = asoj.a;
                }
                else {
                    double f = asyc.a(arzs1);
                    if((f < 0.8)) {
                        asoj0 = asoj.a;
                    }
                    else {
                        asoj0 = new ibwq(0.8, 0.9).d(Double.valueOf(f)) ? asoj.b : asoj.c;
                    }
                }
                asoh asoh0 = new asoh(s, s1, asoi0, asoi1, asoj0);
                asog asog0 = this.c;
                asoj asoj1 = asoh0.d;
                switch(asoj1.ordinal()) {
                    case 0: {
                        integer0 = asoh0.a() ? null : ((int)0x7F15187F);  // string:merged_contextual_card_title_healthy "Storage used"
                        break;
                    }
                    case 1: {
                        integer0 = (int)0x7F15187B;  // string:merged_contextual_card_title_aoos "You\'re almost out of account storage"
                        break;
                    }
                    case 2: {
                        integer0 = (int)0x7F151880;  // string:merged_contextual_card_title_oos "You are out of account storage"
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                if(asoh0.a()) {
                    asoi asoi2 = asoh0.b;
                    asoi asoi3 = asoh0.c;
                    if(asoi2 == asoi3) {
                        switch(asoi2.ordinal()) {
                            case 0: {
                                s2 = asog0.a(0x7F15187D, integer0);  // string:merged_contextual_card_title_backup_on "Backup is on%1$s %2$s"
                                break;
                            }
                            case 1: {
                                s2 = asog0.a(0x7F15187C, integer0);  // string:merged_contextual_card_title_backup_off "Backup is off%1$s %2$s"
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        switch(asoi2.ordinal()) {
                            case 0: {
                                s3 = null;
                                break;
                            }
                            case 1: {
                                s3 = asog0.a(0x7F15187E, integer0);  // string:merged_contextual_card_title_general_backup_off "Backup is off for some data%1$s 
                                                                     // %2$s"
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        if(s3 == null) {
                            switch(asoi3.ordinal()) {
                                case 0: {
                                    s4 = null;
                                    break;
                                }
                                case 1: {
                                    s4 = asog0.a(0x7F151881, integer0);  // string:merged_contextual_card_title_photos_backup_off "Backup is off for photos 
                                                                         // and videos%1$s %2$s"
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(s4 == null) {
                                Context context1 = asog0.a;
                                if(integer0 == null) {
                                    s2 = "";
                                }
                                else {
                                    s2 = context1.getString(integer0.intValue());
                                    ibuq.e(s2, "getString(...)");
                                }
                            }
                            else {
                                s2 = s4;
                            }
                        }
                        else {
                            s2 = s3;
                        }
                    }
                }
                else {
                    Context context0 = asog0.a;
                    if(integer0 == null) {
                        s2 = "";
                    }
                    else {
                        s2 = context0.getString(integer0.intValue());
                        ibuq.e(s2, "getString(...)");
                    }
                }
                if(asoh0.a()) {
                    asoi asoi4 = asoh0.b;
                    asoi asoi5 = asoh0.c;
                    if(asoi4 == asoi5) {
                        switch(asoi4.ordinal()) {
                            case 0: {
                                s5 = "";
                                break;
                            }
                            case 1: {
                                s5 = "Photos, contacts, messages, and other device data aren\'t being backed up";
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        switch(asoi4.ordinal()) {
                            case 0: {
                                s6 = null;
                                break;
                            }
                            case 1: {
                                s6 = "Contacts, messages, and other device data aren\'t being backed up";
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        if(s6 == null) {
                            switch(asoi5.ordinal()) {
                                case 0: {
                                    s5 = null;
                                    break;
                                }
                                case 1: {
                                    s5 = "Photos & videos aren\'t being backed up";
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(s5 == null) {
                                s5 = "";
                            }
                        }
                        else {
                            s5 = s6;
                        }
                    }
                }
                else {
                    s5 = "";
                }
                if(asoh0.a()) {
                    asoi asoi6 = asoh0.b;
                    asoi asoi7 = asoi.b;
                    if(asoi6 == asoi7 && asoh0.c == asoi7) {
                        switch(asoj1.ordinal()) {
                            case 0: {
                                ccow0 = ccow.G;
                                break;
                            }
                            case 1: {
                                ccow0 = ccow.C;
                                break;
                            }
                            case 2: {
                                ccow0 = ccow.y;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else if(asoi6 == asoi7) {
                        switch(asoj1.ordinal()) {
                            case 0: {
                                ccow0 = ccow.H;
                                break;
                            }
                            case 1: {
                                ccow0 = ccow.D;
                                break;
                            }
                            case 2: {
                                ccow0 = ccow.z;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else if(asoh0.c == asoi7) {
                        switch(asoj1.ordinal()) {
                            case 0: {
                                ccow0 = ccow.I;
                                break;
                            }
                            case 1: {
                                ccow0 = ccow.E;
                                break;
                            }
                            case 2: {
                                ccow0 = ccow.A;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        switch(asoj1.ordinal()) {
                            case 0: {
                                ccow0 = ccow.J;
                                break;
                            }
                            case 1: {
                                ccow0 = ccow.F;
                                break;
                            }
                            case 2: {
                                ccow0 = ccow.B;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                }
                else {
                    switch(asoj1.ordinal()) {
                        case 0: {
                            ccow0 = ccow.M;
                            break;
                        }
                        case 1: {
                            ccow0 = ccow.L;
                            break;
                        }
                        case 2: {
                            ccow0 = ccow.K;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                asnx0.d = arzs0;
                asnx0.e = s2;
                asnx0.f = s5;
                asnx0.g = ccow0;
                asnx0.c = 1;
                Object object2 = this.e.a(asoh0, asnx0);
                if(object2 != object1) {
                    s7 = s2;
                    object0 = object2;
                    ccow1 = ccow0;
                    arzs2 = arzs0;
                    s8 = s5;
                    break;
                }
                return object1;
            }
            case 1: {
                ccow ccow2 = asnx0.g;
                String s9 = asnx0.f;
                s7 = asnx0.e;
                arzs2 = asnx0.d;
                ibnx.b(object0);
                ccow1 = ccow2;
                s8 = s9;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        asoe asoe0 = this.f;
        if(arzs2 != null && asyc.c(arzs2)) {
            double f1 = asyc.a(arzs2);
            if((f1 < 0.8)) {
                return new ccnh(s7, s8, ccow1, null, ((ccnf)object0), new ccoq(f1, asyc.b(asoe0.a, arzs2), ccou.b), 0x40);
            }
            return new ibwq(0.8, 0.9).d(Double.valueOf(f1)) ? new ccnh(s7, s8, ccow1, null, ((ccnf)object0), new ccoq(f1, asyc.b(asoe0.a, arzs2), ccou.c), 0x40) : new ccnh(s7, s8, ccow1, null, ((ccnf)object0), new ccoq(f1, asyc.b(asoe0.a, arzs2), ccou.d), 0x40);
        }
        return new ccnh(s7, s8, ccow1, null, ((ccnf)object0), null, 0x40);
    }
}

