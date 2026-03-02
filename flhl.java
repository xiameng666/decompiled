import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class flhl implements glzn {
    public final flit a;
    public final ConversationId b;
    public final AccountContext c;
    public final Boolean d;
    public final long e;

    public flhl(flit flit0, ConversationId conversationId0, AccountContext accountContext0, Boolean boolean0, long v) {
        this.a = flit0;
        this.b = conversationId0;
        this.c = accountContext0;
        this.d = boolean0;
        this.e = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v;
        Map map0;
        ConversationId conversationId0 = this.b;
        flit flit0 = this.a;
        synchronized(flit0) {
            map0 = (Map)flit0.p.remove(conversationId0);
        }
        Map map1 = map0 == null ? new HashMap() : ggkm.n(map0, new flho());
        flwi flwi0 = flit0.r;
        ByteString hfsf0 = ((fmev)object0).n;
        boolean z = this.d.booleanValue();
        String s = UUID.randomUUID().toString();
        flqv flqv0 = flqw.a();
        flqv0.a = "get open conversation";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        switch(((int)this.e)) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
                break;
            }
            case 5: {
                v = 7;
                break;
            }
            case 6: {
                v = 8;
                break;
            }
            case 7: {
                v = 9;
                break;
            }
            case 8: {
                v = 10;
                break;
            }
            case 9: {
                v = 11;
                break;
            }
            case 10: {
                v = 12;
                break;
            }
            case 11: {
                v = 13;
                break;
            }
            case 12: {
                v = 14;
                break;
            }
            case 13: {
                v = 15;
                break;
            }
            case 14: {
                v = 16;
                break;
            }
            case 15: {
                v = 17;
                break;
            }
            case 0x1F: {
                v = 33;
                break;
            }
            case 0x20: {
                v = 34;
                break;
            }
            case 33: {
                v = 35;
                break;
            }
            case 51: {
                v = 53;
                break;
            }
            case 52: {
                v = 54;
                break;
            }
            case 53: {
                v = 55;
                break;
            }
            case 54: {
                v = 56;
                break;
            }
            case 55: {
                v = 57;
                break;
            }
            case 56: {
                v = 58;
                break;
            }
            case 57: {
                v = 59;
                break;
            }
            case 58: {
                v = 60;
                break;
            }
            case 59: {
                v = 61;
                break;
            }
            case 71: {
                v = 73;
                break;
            }
            case 72: {
                v = 74;
                break;
            }
            case 73: {
                v = 75;
                break;
            }
            case 74: {
                v = 76;
                break;
            }
            case 75: {
                v = 77;
                break;
            }
            case 76: {
                v = 78;
                break;
            }
            case 77: {
                v = 0x4F;
                break;
            }
            case 78: {
                v = 80;
                break;
            }
            case 0x4F: {
                v = 81;
                break;
            }
            case 80: {
                v = 82;
                break;
            }
            case 81: {
                v = 83;
                break;
            }
            case 82: {
                v = 84;
                break;
            }
            case 83: {
                v = 85;
                break;
            }
            case 84: {
                v = 86;
                break;
            }
            case 85: {
                v = 87;
                break;
            }
            case 86: {
                v = 88;
                break;
            }
            case 87: {
                v = 89;
                break;
            }
            case 88: {
                v = 90;
                break;
            }
            case 89: {
                v = 91;
                break;
            }
            case 90: {
                v = 92;
                break;
            }
            case 91: {
                v = 93;
                break;
            }
            case 92: {
                v = 94;
                break;
            }
            case 93: {
                v = 0x5F;
                break;
            }
            case 94: {
                v = 0x60;
                break;
            }
            case 0x5F: {
                v = 97;
                break;
            }
            case 0x60: {
                v = 98;
                break;
            }
            case 97: {
                v = 99;
                break;
            }
            case 98: {
                v = 100;
                break;
            }
            case 99: {
                v = 101;
                break;
            }
            case 100: {
                v = 102;
                break;
            }
            case 101: {
                v = 103;
                break;
            }
            case 102: {
                v = 104;
                break;
            }
            case 103: {
                v = 105;
                break;
            }
            case 104: {
                v = 106;
                break;
            }
            case 105: {
                v = 107;
                break;
            }
            case 106: {
                v = 108;
                break;
            }
            case 107: {
                v = 109;
                break;
            }
            case 108: {
                v = 110;
                break;
            }
            case 109: {
                v = 0x6F;
                break;
            }
            case 110: {
                v = 0x70;
                break;
            }
            case 0x6F: {
                v = 0x71;
                break;
            }
            case 0x70: {
                v = 0x72;
                break;
            }
            case 0x71: {
                v = 0x73;
                break;
            }
            case 0x72: {
                v = 0x74;
                break;
            }
            case 0x73: {
                v = 0x75;
                break;
            }
            case 0x74: {
                v = 0x76;
                break;
            }
            case 0x75: {
                v = 0x77;
                break;
            }
            case 0x76: {
                v = 120;
                break;
            }
            case 0x77: {
                v = 0x79;
                break;
            }
            default: {
                v = 0;
            }
        }
        hnry hnry0 = flwi.d(conversationId0);
        UUID uUID0 = UUID.randomUUID();
        flyt flyt0 = new flyt(flwi0.b, this.c, conversationId0, hfsf0, map1, z, hnry0, flwi0.d, v, s, flwi0.f);
        gmcd gmcd0 = flwi0.a.d.d();
        return flwi0.a.b(uUID0, flyt0, gmcd0, this.c, flqw0, true);
    }
}

