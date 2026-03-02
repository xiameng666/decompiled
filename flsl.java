import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import j..util.Objects;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class flsl {
    public gfsx a;
    public final Set b;
    private static flsl c;
    private final Context d;
    private final ayud e;
    private final Executor f;

    private flsl(Context context0) {
        ayud ayud0 = new aytt(context0, "LIGHTER_ANDROID").a();
        super();
        this.a = gfqx.a;
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.f = Executors.newSingleThreadExecutor();
        this.d = context0;
        this.e = ayud0;
    }

    public static flsl a(Context context0) {
        flsl flsl0;
        synchronized(flsl.class) {
            flsl0 = flsl.c;
            if(flsl0 == null) {
                flsl flsl1 = new flsl(context0.getApplicationContext());
                flsl.c = flsl1;
                return flsl1;
            }
        }
        return flsl0;
    }

    public final void b(fmaj fmaj0) {
        int v1;
        gfsx gfsx0 = fmaj0.b;
        gfsx gfsx1 = gfqx.a;
        if(gfsx0.i() && ((ContactId)gfsx0.d()).b().equals(ContactId.ContactType.c)) {
            gfsx1 = gfsx.m(((ContactId)gfsx0.d()).d());
        }
        ayud ayud0 = this.e;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdi.a).v_newBuilder();
        Context context0 = this.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        "com.google.android.gms".getClass();
        ((gmdi)hftv0).s = "com.google.android.gms";
        int v = fmaj0.a;
        if(v == 10088) {
            v1 = 10090;
        }
        else {
            switch(v) {
                case 0: {
                    v1 = 2;
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                case 4: {
                    v1 = 6;
                    break;
                }
                case 5: {
                    v1 = 7;
                    break;
                }
                case 6: {
                    v1 = 8;
                    break;
                }
                case 7: {
                    v1 = 9;
                    break;
                }
                case 8: {
                    v1 = 10;
                    break;
                }
                case 9: {
                    v1 = 11;
                    break;
                }
                case 10: {
                    v1 = 12;
                    break;
                }
                case 11: {
                    v1 = 13;
                    break;
                }
                case 12: {
                    v1 = 14;
                    break;
                }
                case 13: {
                    v1 = 15;
                    break;
                }
                case 14: {
                    v1 = 16;
                    break;
                }
                case 15: {
                    v1 = 17;
                    break;
                }
                case 16: {
                    v1 = 18;
                    break;
                }
                case 17: {
                    v1 = 19;
                    break;
                }
                case 18: {
                    v1 = 20;
                    break;
                }
                case 19: {
                    v1 = 21;
                    break;
                }
                case 20: {
                    v1 = 22;
                    break;
                }
                case 21: {
                    v1 = 23;
                    break;
                }
                case 22: {
                    v1 = 24;
                    break;
                }
                case 23: {
                    v1 = 25;
                    break;
                }
                case 24: {
                    v1 = 26;
                    break;
                }
                case 25: {
                    v1 = 27;
                    break;
                }
                case 26: {
                    v1 = 28;
                    break;
                }
                case 27: {
                    v1 = 29;
                    break;
                }
                case 28: {
                    v1 = 30;
                    break;
                }
                case 29: {
                    v1 = 0x1F;
                    break;
                }
                case 30: {
                    v1 = 0x20;
                    break;
                }
                case 0x1F: {
                    v1 = 33;
                    break;
                }
                case 0x20: {
                    v1 = 34;
                    break;
                }
                case 33: {
                    v1 = 35;
                    break;
                }
                case 34: {
                    v1 = 36;
                    break;
                }
                case 35: {
                    v1 = 37;
                    break;
                }
                case 36: {
                    v1 = 38;
                    break;
                }
                case 37: {
                    v1 = 39;
                    break;
                }
                case 38: {
                    v1 = 40;
                    break;
                }
                case 39: {
                    v1 = 41;
                    break;
                }
                case 40: {
                    v1 = 42;
                    break;
                }
                case 41: {
                    v1 = 43;
                    break;
                }
                case 42: {
                    v1 = 44;
                    break;
                }
                case 43: {
                    v1 = 45;
                    break;
                }
                case 44: {
                    v1 = 46;
                    break;
                }
                case 45: {
                    v1 = 0x2F;
                    break;
                }
                case 46: {
                    v1 = 0x30;
                    break;
                }
                case 0x2F: {
                    v1 = 49;
                    break;
                }
                case 0x30: {
                    v1 = 50;
                    break;
                }
                case 49: {
                    v1 = 51;
                    break;
                }
                case 50: {
                    v1 = 52;
                    break;
                }
                case 51: {
                    v1 = 53;
                    break;
                }
                case 52: {
                    v1 = 54;
                    break;
                }
                case 53: {
                    v1 = 55;
                    break;
                }
                case 54: {
                    v1 = 56;
                    break;
                }
                case 55: {
                    v1 = 57;
                    break;
                }
                case 56: {
                    v1 = 58;
                    break;
                }
                case 57: {
                    v1 = 59;
                    break;
                }
                case 58: {
                    v1 = 60;
                    break;
                }
                case 59: {
                    v1 = 61;
                    break;
                }
                case 60: {
                    v1 = 62;
                    break;
                }
                case 62: {
                    v1 = 0x40;
                    break;
                }
                case 0x3F: {
                    v1 = 65;
                    break;
                }
                case 0x40: {
                    v1 = 66;
                    break;
                }
                case 65: {
                    v1 = 67;
                    break;
                }
                case 66: {
                    v1 = 68;
                    break;
                }
                case 67: {
                    v1 = 69;
                    break;
                }
                case 68: {
                    v1 = 70;
                    break;
                }
                case 69: {
                    v1 = 71;
                    break;
                }
                case 70: {
                    v1 = 72;
                    break;
                }
                case 71: {
                    v1 = 73;
                    break;
                }
                case 72: {
                    v1 = 74;
                    break;
                }
                case 73: {
                    v1 = 75;
                    break;
                }
                case 74: {
                    v1 = 76;
                    break;
                }
                case 75: {
                    v1 = 77;
                    break;
                }
                case 76: {
                    v1 = 78;
                    break;
                }
                case 77: {
                    v1 = 0x4F;
                    break;
                }
                case 78: {
                    v1 = 80;
                    break;
                }
                case 0x4F: {
                    v1 = 81;
                    break;
                }
                case 80: {
                    v1 = 82;
                    break;
                }
                case 81: {
                    v1 = 83;
                    break;
                }
                case 82: {
                    v1 = 84;
                    break;
                }
                case 83: {
                    v1 = 85;
                    break;
                }
                case 84: {
                    v1 = 86;
                    break;
                }
                case 85: {
                    v1 = 87;
                    break;
                }
                case 86: {
                    v1 = 88;
                    break;
                }
                case 87: {
                    v1 = 89;
                    break;
                }
                case 88: {
                    v1 = 90;
                    break;
                }
                case 89: {
                    v1 = 91;
                    break;
                }
                case 90: {
                    v1 = 92;
                    break;
                }
                case 91: {
                    v1 = 93;
                    break;
                }
                case 92: {
                    v1 = 94;
                    break;
                }
                case 93: {
                    v1 = 0x5F;
                    break;
                }
                case 94: {
                    v1 = 0x60;
                    break;
                }
                case 0x5F: {
                    v1 = 97;
                    break;
                }
                case 0x60: {
                    v1 = 98;
                    break;
                }
                case 100: {
                    v1 = 102;
                    break;
                }
                case 101: {
                    v1 = 103;
                    break;
                }
                case 102: {
                    v1 = 104;
                    break;
                }
                case 103: {
                    v1 = 105;
                    break;
                }
                case 104: {
                    v1 = 106;
                    break;
                }
                case 105: {
                    v1 = 107;
                    break;
                }
                case 106: {
                    v1 = 108;
                    break;
                }
                case 107: {
                    v1 = 109;
                    break;
                }
                case 108: {
                    v1 = 110;
                    break;
                }
                case 109: {
                    v1 = 0x6F;
                    break;
                }
                case 110: {
                    v1 = 0x70;
                    break;
                }
                case 0x6F: {
                    v1 = 0x71;
                    break;
                }
                case 0x70: {
                    v1 = 0x72;
                    break;
                }
                case 0x71: {
                    v1 = 0x73;
                    break;
                }
                case 0x72: {
                    v1 = 0x74;
                    break;
                }
                case 0x73: {
                    v1 = 0x75;
                    break;
                }
                case 0x74: {
                    v1 = 0x76;
                    break;
                }
                case 0x75: {
                    v1 = 0x77;
                    break;
                }
                case 0x76: {
                    v1 = 120;
                    break;
                }
                case 0x77: {
                    v1 = 0x79;
                    break;
                }
                case 120: {
                    v1 = 0x7A;
                    break;
                }
                case 0x79: {
                    v1 = 0x7B;
                    break;
                }
                case 0x7A: {
                    v1 = 0x7C;
                    break;
                }
                case 0x7B: {
                    v1 = 0x7D;
                    break;
                }
                case 0x7C: {
                    v1 = 0x7E;
                    break;
                }
                case 0x7D: {
                    v1 = 0x7F;
                    break;
                }
                case 0x7E: {
                    v1 = 0x80;
                    break;
                }
                case 0x7F: {
                    v1 = 0x81;
                    break;
                }
                case 0x80: {
                    v1 = 130;
                    break;
                }
                case 0x81: {
                    v1 = 0x83;
                    break;
                }
                case 130: {
                    v1 = 0x84;
                    break;
                }
                case 0x83: {
                    v1 = 0x85;
                    break;
                }
                case 0x84: {
                    v1 = 0x86;
                    break;
                }
                case 0x85: {
                    v1 = 0x87;
                    break;
                }
                case 0x86: {
                    v1 = 0x88;
                    break;
                }
                case 0x87: {
                    v1 = 0x89;
                    break;
                }
                case 0x88: {
                    v1 = 0x8A;
                    break;
                }
                case 0x89: {
                    v1 = 0x8B;
                    break;
                }
                case 0x8A: {
                    v1 = 140;
                    break;
                }
                case 0x8B: {
                    v1 = 0x8D;
                    break;
                }
                case 140: {
                    v1 = 0x8E;
                    break;
                }
                case 0x8D: {
                    v1 = 0x8F;
                    break;
                }
                case 0x8E: {
                    v1 = 0x90;
                    break;
                }
                case 0x8F: {
                    v1 = 0x91;
                    break;
                }
                case 0x90: {
                    v1 = 0x92;
                    break;
                }
                case 0x91: {
                    v1 = 0x93;
                    break;
                }
                case 0x92: {
                    v1 = 0x94;
                    break;
                }
                case 0x93: {
                    v1 = 0x95;
                    break;
                }
                case 0x94: {
                    v1 = 150;
                    break;
                }
                case 0x95: {
                    v1 = 0x97;
                    break;
                }
                case 150: {
                    v1 = 0x98;
                    break;
                }
                case 0x97: {
                    v1 = 0x99;
                    break;
                }
                case 0x98: {
                    v1 = 0x9A;
                    break;
                }
                case 201: {
                    v1 = 203;
                    break;
                }
                case 202: {
                    v1 = 204;
                    break;
                }
                case 203: {
                    v1 = 205;
                    break;
                }
                case 204: {
                    v1 = 206;
                    break;
                }
                case 205: {
                    v1 = 0xCF;
                    break;
                }
                case 206: {
                    v1 = 0xD0;
                    break;
                }
                case 0xCF: {
                    v1 = 209;
                    break;
                }
                case 0xD0: {
                    v1 = 210;
                    break;
                }
                case 209: {
                    v1 = 0xD3;
                    break;
                }
                case 210: {
                    v1 = 0xD4;
                    break;
                }
                case 0xD3: {
                    v1 = 0xD5;
                    break;
                }
                case 0xD4: {
                    v1 = 0xD6;
                    break;
                }
                case 0xD5: {
                    v1 = 0xD7;
                    break;
                }
                case 10000: {
                    v1 = 10002;
                    break;
                }
                case 10001: {
                    v1 = 10003;
                    break;
                }
                case 10002: {
                    v1 = 10004;
                    break;
                }
                case 10003: {
                    v1 = 10005;
                    break;
                }
                case 10004: {
                    v1 = 10006;
                    break;
                }
                case 10005: {
                    v1 = 10007;
                    break;
                }
                case 10006: {
                    v1 = 10008;
                    break;
                }
                case 10007: {
                    v1 = 10009;
                    break;
                }
                case 10008: {
                    v1 = 10010;
                    break;
                }
                case 10009: {
                    v1 = 10011;
                    break;
                }
                case 10010: {
                    v1 = 10012;
                    break;
                }
                case 10011: {
                    v1 = 10013;
                    break;
                }
                case 10012: {
                    v1 = 10014;
                    break;
                }
                case 10013: {
                    v1 = 10015;
                    break;
                }
                case 10014: {
                    v1 = 10016;
                    break;
                }
                case 10015: {
                    v1 = 10017;
                    break;
                }
                case 10016: {
                    v1 = 10018;
                    break;
                }
                case 10017: {
                    v1 = 10019;
                    break;
                }
                case 10018: {
                    v1 = 10020;
                    break;
                }
                case 10019: {
                    v1 = 10021;
                    break;
                }
                case 10020: {
                    v1 = 10022;
                    break;
                }
                case 10021: {
                    v1 = 10023;
                    break;
                }
                case 10022: {
                    v1 = 10024;
                    break;
                }
                case 10023: {
                    v1 = 10025;
                    break;
                }
                case 10024: {
                    v1 = 10026;
                    break;
                }
                case 10025: {
                    v1 = 10027;
                    break;
                }
                case 10026: {
                    v1 = 10028;
                    break;
                }
                case 10027: {
                    v1 = 10029;
                    break;
                }
                case 10028: {
                    v1 = 10030;
                    break;
                }
                case 10029: {
                    v1 = 10031;
                    break;
                }
                case 10030: {
                    v1 = 10032;
                    break;
                }
                case 10031: {
                    v1 = 10033;
                    break;
                }
                case 10032: {
                    v1 = 10034;
                    break;
                }
                case 10033: {
                    v1 = 10035;
                    break;
                }
                case 10034: {
                    v1 = 10036;
                    break;
                }
                case 10035: {
                    v1 = 10037;
                    break;
                }
                case 10036: {
                    v1 = 10038;
                    break;
                }
                case 10037: {
                    v1 = 10039;
                    break;
                }
                case 10038: {
                    v1 = 10040;
                    break;
                }
                case 10039: {
                    v1 = 10041;
                    break;
                }
                case 10040: {
                    v1 = 10042;
                    break;
                }
                case 10041: {
                    v1 = 10043;
                    break;
                }
                case 10042: {
                    v1 = 10044;
                    break;
                }
                case 10043: {
                    v1 = 10045;
                    break;
                }
                case 10044: {
                    v1 = 10046;
                    break;
                }
                case 10045: {
                    v1 = 10047;
                    break;
                }
                case 10046: {
                    v1 = 10048;
                    break;
                }
                case 10047: {
                    v1 = 10049;
                    break;
                }
                case 10048: {
                    v1 = 10050;
                    break;
                }
                case 10049: {
                    v1 = 10051;
                    break;
                }
                case 10050: {
                    v1 = 10052;
                    break;
                }
                case 10051: {
                    v1 = 10053;
                    break;
                }
                case 10052: {
                    v1 = 10054;
                    break;
                }
                case 10053: {
                    v1 = 10055;
                    break;
                }
                case 10054: {
                    v1 = 10056;
                    break;
                }
                case 10055: {
                    v1 = 10057;
                    break;
                }
                case 10056: {
                    v1 = 10058;
                    break;
                }
                case 10057: {
                    v1 = 10059;
                    break;
                }
                case 10058: {
                    v1 = 10060;
                    break;
                }
                case 10059: {
                    v1 = 10061;
                    break;
                }
                case 10060: {
                    v1 = 10062;
                    break;
                }
                case 10061: {
                    v1 = 10063;
                    break;
                }
                case 10062: {
                    v1 = 10064;
                    break;
                }
                case 10063: {
                    v1 = 10065;
                    break;
                }
                case 10064: {
                    v1 = 10066;
                    break;
                }
                case 10065: {
                    v1 = 10067;
                    break;
                }
                case 10066: {
                    v1 = 10068;
                    break;
                }
                case 10067: {
                    v1 = 10069;
                    break;
                }
                case 10068: {
                    v1 = 10070;
                    break;
                }
                case 10069: {
                    v1 = 10071;
                    break;
                }
                case 10070: {
                    v1 = 10072;
                    break;
                }
                case 10071: {
                    v1 = 10073;
                    break;
                }
                case 10072: {
                    v1 = 10074;
                    break;
                }
                case 10073: {
                    v1 = 10075;
                    break;
                }
                case 10074: {
                    v1 = 10076;
                    break;
                }
                case 10075: {
                    v1 = 10077;
                    break;
                }
                case 10076: {
                    v1 = 10078;
                    break;
                }
                case 10077: {
                    v1 = 10079;
                    break;
                }
                case 10099: {
                    v1 = 10101;
                    break;
                }
                case 10100: {
                    v1 = 10102;
                    break;
                }
                case 10101: {
                    v1 = 10103;
                    break;
                }
                case 10102: {
                    v1 = 10104;
                    break;
                }
                case 10103: {
                    v1 = 10105;
                    break;
                }
                case 10104: {
                    v1 = 10106;
                    break;
                }
                case 10105: {
                    v1 = 10107;
                    break;
                }
                case 10106: {
                    v1 = 10108;
                    break;
                }
                case 10107: {
                    v1 = 10109;
                    break;
                }
                case 10108: {
                    v1 = 10110;
                    break;
                }
                case 10109: {
                    v1 = 0x277F;
                    break;
                }
                case 10110: {
                    v1 = 0x2780;
                    break;
                }
                case 0x277F: {
                    v1 = 10113;
                    break;
                }
                case 0x2780: {
                    v1 = 10114;
                    break;
                }
                case 10113: {
                    v1 = 10115;
                    break;
                }
                case 10114: {
                    v1 = 10116;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp0.b_message;
        if(v1 == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        gmdi0.c = v1 - 2;
        flbl.b(gfsx0, new flsh(hftp0));
        Objects.requireNonNull(hftp0);
        flri flri0 = new flri(hftp0);
        flbl.b(fmaj0.c, flri0);
        gfsx gfsx2 = this.a.b(new flrj());
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx2, new flrk(hftp0));
        Objects.requireNonNull(hftp0);
        flrl flrl0 = new flrl(hftp0);
        flbl.b(fmaj0.d, flrl0);
        flrm flrm0 = new flrm(hftp0);
        flbl.b(fmaj0.q, flrm0);
        flrn flrn0 = new flrn(hftp0);
        flbl.b(fmaj0.e, flrn0);
        flro flro0 = new flro(hftp0);
        flbl.b(fmaj0.f, flro0);
        flrp flrp0 = new flrp(hftp0);
        flbl.b(fmaj0.g, flrp0);
        flrq flrq0 = new flrq(hftp0);
        flbl.b(fmaj0.h, flrq0);
        Objects.requireNonNull(hftp0);
        flsi flsi0 = new flsi(hftp0);
        flbl.b(fmaj0.i, flsi0);
        Objects.requireNonNull(hftp0);
        flsj flsj0 = new flsj(hftp0);
        flbl.b(fmaj0.j, flsj0);
        Objects.requireNonNull(hftp0);
        flsk flsk0 = new flsk(hftp0);
        flbl.b(fmaj0.n, flsk0);
        gged_interceptors gged0 = fmaj0.l;
        if(!gged0.isEmpty()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmdn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gmdn gmdn0 = (gmdn)hftp1.b_message;
            hfui hfui0 = gmdn0.b;
            if(!hfui0.c()) {
                gmdn0.b = ProtoLiteMessage.D(hfui0);
            }
            hfrj.E(gged0, gmdn0.b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmdi gmdi1 = (gmdi)hftp0.b_message;
            gmdn gmdn1 = (gmdn)hftp1.N_build();
            gmdn1.getClass();
            gmdi1.m = gmdn1;
            gmdi1.b |= 4;
        }
        Objects.requireNonNull(hftp0);
        flre flre0 = new flre(hftp0);
        flbl.b(fmaj0.k, flre0);
        flrf flrf0 = new flrf(hftp0);
        flbl.b(fmaj0.m, flrf0);
        flrg flrg0 = new flrg(hftp0);
        flbl.b(fmaj0.p, flrg0);
        flrh flrh0 = new flrh(hftp0);
        flbl.b(fmaj0.o, flrh0);
        ayuc ayuc0 = ayud0.j(((MessageLite)(((gmdi)hftp0.N_build()))), fhbe.b(context0, new icwh()));
        ayuc0.k(v);
        if(gfsx1.i()) {
            ayuc0.o(((String)gfsx1.d()));
        }
        ayuc0.d();
        flsg flsg0 = new flsg(this, fmaj0);
        this.f.execute(flsg0);
    }

    public static final gmdo c(ContactId contactId0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdo.a).v_newBuilder();
        String s = contactId0.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmdo)hftp0.b_message).c = s;
        String s1 = contactId0.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmdo)hftp0.b_message).e = s1;
        switch(contactId0.b().ordinal()) {
            case 0: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmdo)hftp0.b_message).b = 0;
                return (gmdo)hftp0.N_build();
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmdo)hftp0.b_message).b = 1;
                return (gmdo)hftp0.N_build();
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmdo)hftp0.b_message).b = 2;
                return (gmdo)hftp0.N_build();
            }
            case 3: {
                flbl.b(contactId0.c(), new flsf(hftp0));
                return (gmdo)hftp0.N_build();
            }
            case 4: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmdo)hftp0.b_message).b = 5;
                return (gmdo)hftp0.N_build();
            }
            default: {
                return (gmdo)hftp0.N_build();
            }
        }
    }
}

