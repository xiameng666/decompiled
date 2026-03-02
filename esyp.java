import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;

public final class esyp implements Runnable {
    public final esyr a;
    public final Context b;
    public final esqi c;

    public esyp(esyr esyr0, Context context0, esqi esqi0) {
        this.a = esyr0;
        this.b = context0;
        this.c = esqi0;
    }

    @Override
    public final void run() {
        String s9;
        String s8;
        String s2;
        try {
            Context context0 = this.b;
            esqi esqi0 = this.c;
            if(!esqi0.c()) {
                return;
            }
            Level level0 = esgh.a();
            ggtj ggtj0 = esyr.a.g(level0);
            String s = esqi0.a;
            String s1 = "UNKNOWN";
            switch(esqi0.v) {
                case -1: {
                    s2 = "NO_FAILURE";
                    break;
                }
                case 1: {
                    s2 = "NO_CREDENTIAL";
                    break;
                }
                case 4: {
                    s2 = "DEVICE_LOCKED";
                    break;
                }
                case 5: {
                    s2 = "DEVICE_SETUP_REQUIRED";
                    break;
                }
                case 7: {
                    s2 = "NO_STORAGE_KEY";
                    break;
                }
                case 9: {
                    s2 = "ATTESTATION_FAILURE";
                    break;
                }
                case 10: {
                    s2 = "SCREEN_OFF";
                    break;
                }
                case 11: {
                    s2 = "TEAR";
                    break;
                }
                case 12: {
                    s2 = "PAYMENT_NOT_STARTED";
                    break;
                }
                case 13: {
                    s2 = "PROTOCOL_FAILURE";
                    break;
                }
                case 14: {
                    s2 = "CARD_NOT_SUPPORTED";
                    break;
                }
                case 15: {
                    s2 = "INTERNAL";
                    break;
                }
                case 16: {
                    s2 = "PAYMENTS_DISABLED";
                    break;
                }
                case 17: {
                    s2 = "THROTTLED";
                    break;
                }
                case 18: {
                    s2 = "PAY_ON_WEAR_DISABLED";
                    break;
                }
                case 19: {
                    s2 = "CDCVM_REQUIRED_SDK";
                    break;
                }
                case 21: {
                    s2 = "VELOCITY_CHECK";
                    break;
                }
                case 22: {
                    s2 = "NO_WALLET";
                    break;
                }
                case 23: {
                    s2 = "NO_CARD";
                    break;
                }
                case 24: {
                    s2 = "READER_ERROR_WRONG_AID";
                    break;
                }
                case 25: {
                    s2 = "READER_ERROR_WRONG_LENGTH";
                    break;
                }
                case 26: {
                    s2 = "READER_ERROR_IN_SDK";
                    break;
                }
                case 27: {
                    s2 = "CARD_NOT_SUPPORTED_AID_NOT_SUPPORTED";
                    break;
                }
                case 28: {
                    s2 = "CARD_NOT_SUPPORTED_MSD_ON_EMV";
                    break;
                }
                case 29: {
                    s2 = "CARD_NOT_SUPPORTED_SDK";
                    break;
                }
                case 30: {
                    s2 = "PPSE_ONLY";
                    break;
                }
                case 0x1F: {
                    s2 = "TRANSIT_INSUFFICIENT_BALANCE";
                    break;
                }
                case 0x20: {
                    s2 = "TRANSIT_INVALID_TICKET";
                    break;
                }
                case 33: {
                    s2 = "TRANSIT_EXPIRED_TICKET";
                    break;
                }
                case 34: {
                    s2 = "TRANSIT_SUSPENDED_TICKET";
                    break;
                }
                case 37: {
                    s2 = "PAYMENT_CARDS_BLOCKED";
                    break;
                }
                case 38: {
                    s2 = "BUNDLE_ON_DIFFERENT_ACCOUNT";
                    break;
                }
                case 39: {
                    s2 = "PAYMENT_NOT_STARTED_MULTIPLE_CARDS";
                    break;
                }
                case 40: {
                    s2 = "ACCESS_SUSPENDED_CARD";
                    break;
                }
                case 41: {
                    s2 = "ODA_CERTS_EXPIRED";
                    break;
                }
                case 43: {
                    s2 = "NO_TRANSACTION";
                    break;
                }
                case 45: {
                    s2 = "IN_PROGRESS";
                    break;
                }
                case 46: {
                    s2 = "SCREEN_OFF_NOT_WEAR_TRANSIT";
                    break;
                }
                case 0x2F: {
                    s2 = "RESULT_UNKNOWN";
                    break;
                }
                default: {
                    s2 = "UNKNOWN";
                }
            }
            ggtj0.R("Tap %s finished with failure: %s", s, s2);
            etmv etmv0 = esyr.h(context0, esqi0);
            ArrayList arrayList0 = new ArrayList(esqi0.a());
            List list0 = esqi0.b;
            for(Object object0: list0) {
                arrayList0.add(esyr.d(s, ((esqf)object0)));
                list0 = list0;
            }
            ProtoLiteBuilder hftp0 = esyr.k(context0, esqi0);
            gjuj gjuj0 = (gjuj)hftp0.N_build();
            gjxu gjxu0 = (gjxu)etmv.ao(esqi0).N_build();
            gutm gutm0 = (gutm)((ProtoLiteMessage)guts.a).v_newBuilder();
            gutl gutl0 = gutl.a;
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts0 = (guts)gutm0.b_message;
            gutl0.getClass();
            guts0.m = gutl0;
            guts0.b |= 0x40;
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts1 = (guts)gutm0.b_message;
            s.getClass();
            guts1.e = s;
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts2 = (guts)gutm0.b_message;
            hfuo hfuo0 = guts2.i;
            if(!hfuo0.c()) {
                guts2.i = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, guts2.i);
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts3 = (guts)gutm0.b_message;
            gjuj0.getClass();
            guts3.j = gjuj0;
            guts3.b |= 8;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
            long v = System.currentTimeMillis();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hfwn)hftv0).b = v / 1000L;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hfwn)hftp1.b_message).c = (int)(v % 1000L * 1000000L);
            hfwn hfwn0 = (hfwn)hftp1.N_build();
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts4 = (guts)gutm0.b_message;
            hfwn0.getClass();
            guts4.g = hfwn0;
            guts4.b |= 2;
            String s3 = TimeZone.getDefault().getID();
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts5 = (guts)gutm0.b_message;
            s3.getClass();
            guts5.p = s3;
            guug guug0 = esyr.i(esqi0.z);
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts6 = (guts)gutm0.b_message;
            guts6.q = guug0.a();
            gtnf gtnf0 = esqi0.F;
            if(!gutm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gutm0).ensureMutable();
            }
            guts guts7 = (guts)gutm0.b_message;
            guts7.u = gtnf0.a();
            guts7.b |= 0x200;
            if(hyul.a.b().c()) {
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts8 = (guts)gutm0.b_message;
                gjxu0.getClass();
                guts8.k = gjxu0;
                guts8.b |= 16;
            }
            CardInfo cardInfo0 = esqi0.y;
            boolean z = true;
            if(cardInfo0 != null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtfc.a).v_newBuilder();
                String s4 = bbqr.c(cardInfo0.a);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gtfc)hftp2.b_message).b = s4;
                byte[] arr_b = cardInfo0.c;
                if(arr_b != null) {
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gtfc)hftp2.b_message).c = hfsf0;
                }
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts9 = (guts)gutm0.b_message;
                gtfc gtfc0 = (gtfc)hftp2.N_build();
                gtfc0.getClass();
                guts9.f = gtfc0;
                guts9.b |= 1;
                TokenStatus tokenStatus0 = cardInfo0.g;
                if(tokenStatus0 != null) {
                    TokenReference tokenReference0 = tokenStatus0.a;
                    if(tokenReference0 != null) {
                        gtnm gtnm0 = evjq.i(tokenReference0.b);
                        if(!gutm0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gutm0).ensureMutable();
                        }
                        guts guts10 = (guts)gutm0.b_message;
                        guts10.t = gtnm0.a();
                    }
                }
            }
            if(esqi0.w && esqi0.v == -1) {
                gutr gutr0 = gutr.b;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts11 = (guts)gutm0.b_message;
                guts11.r = gutr0.a();
            }
            else {
                gutr gutr1 = gutr.c;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts12 = (guts)gutm0.b_message;
                guts12.r = gutr1.a();
            }
            esqg esqg0 = esqi0.x;
            if(esqg0 != null) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gutt.a).v_newBuilder();
                boolean z1 = esyz.a(esqg0, cardInfo0);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                ((gutt)hftv1).i = z1;
                boolean z2 = esqg0.g;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp3.b_message;
                ((gutt)hftv2).n = z2;
                String s5 = bbqr.c(esqg0.h);
                if(!hftv2.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gutt)hftp3.b_message).y = s5;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts13 = (guts)gutm0.b_message;
                gutt gutt0 = (gutt)hftp3.N_build();
                gutt0.getClass();
                guts13.h = gutt0;
                guts13.b |= 4;
                if(esqg0.l != 0) {
                    gutl gutl1 = ((guts)gutm0.b_message).m;
                    gutl gutl2 = gutl1 == null ? gutl0 : gutl1;
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl2).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)gutl2));
                    String s6 = String.format("%x", ((int)esqg0.l));
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gutl gutl3 = (gutl)hftp4.b_message;
                    s6.getClass();
                    gutl3.c = s6;
                    if(!gutm0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gutm0).ensureMutable();
                    }
                    guts guts14 = (guts)gutm0.b_message;
                    gutl gutl4 = (gutl)hftp4.N_build();
                    gutl4.getClass();
                    guts14.m = gutl4;
                    guts14.b |= 0x40;
                }
            }
            esyr.e(esqi0.P, hftp0, gutm0);
            esyr.e(esqi0.O, hftp0, gutm0);
            esyr.e(esqi0.Q, hftp0, gutm0);
            if(hyqr.e() || hyqr.d() && esqi0.Z) {
                if(esqi0.ab) {
                    esyr.f(esqi0.R, hftp0);
                }
                if(esqi0.aa) {
                    gjua gjua0 = esqi0.S;
                    if(gjua0 != null) {
                        gjub gjub0 = ((gjuj)hftp0.b_message).ag;
                        if(gjub0 == null) {
                            gjub0 = gjub.a;
                        }
                        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)gjub0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)gjub0));
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gjub)hftp5.b_message).c = gjua0;
                        ((gjub)hftp5.b_message).b |= 1;
                        gjub gjub1 = (gjub)hftp5.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj1 = (gjuj)hftp0.b_message;
                        gjub1.getClass();
                        gjuj1.ag = gjub1;
                        gjuj1.c |= 0x20000000;
                    }
                }
            }
            Iterator iterator1 = list0.iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    gjuj gjuj2 = (gjuj)hftp0.N_build();
                    ProtoLiteBuilder hftp6 = etmv0.am(gjsj.b, esqi0.y);
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gjzl gjzl0 = (gjzl)hftp6.b_message;
                    gjuj2.getClass();
                    gjzl0.f = gjuj2;
                    gjzl0.b |= 2;
                    ProtoLiteBuilder hftp7 = etmv.ao(esqi0);
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gjzl gjzl1 = (gjzl)hftp6.b_message;
                    gjxu gjxu1 = (gjxu)hftp7.N_build();
                    gjxu1.getClass();
                    gjzl1.C = gjxu1;
                    gjzl1.b |= 0x40000000;
                    etmv0.l(((gjzl)hftp6.N_build()));
                    if(esqi0.e != null && esqi0.d != null) {
                        guts guts15 = (guts)((ProtoLiteBuilder)gutm0).N_build();
                        Level level1 = esgh.a();
                        esyr.a.g(level1).x("Reporting tap to server");
                        context0.startService(euja.a(context0, ((String)Objects.requireNonNull(esqi0.d)), ((String)Objects.requireNonNull(esqi0.e)), guts15));
                        String s7 = (String)Objects.requireNonNull(esqi0.e);
                        if(s7 != null) {
                            etgl etgl0 = new etgl(context0);
                            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)ftkg.a).v_newBuilder();
                            if(!hftp8.b_message.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            ((ftkg)hftp8.b_message).d = s7;
                            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)ftkl.a).v_newBuilder();
                            switch(esqi0.v) {
                                case -1: {
                                    s8 = "SUCCESS";
                                    break;
                                }
                                case 1: {
                                    s8 = "NO_CREDENTIAL";
                                    break;
                                }
                                case 7: {
                                    s8 = "NO_STORAGE_KEY";
                                    break;
                                }
                                case 9: {
                                    s8 = "ATTESTATION_FAILURE";
                                    break;
                                }
                                case 10: {
                                    s8 = "SCREEN_OFF";
                                    break;
                                }
                                case 11: {
                                    s8 = "TEAR";
                                    break;
                                }
                                case 12: {
                                    s8 = "PAYMENT_NOT_STARTED";
                                    break;
                                }
                                case 15: {
                                    s8 = "INTERNAL";
                                    break;
                                }
                                case 16: {
                                    s8 = "PAYMENTS_DISABLED";
                                    break;
                                }
                                case 17: {
                                    s8 = "THROTTLED";
                                    break;
                                }
                                case 18: {
                                    s8 = "PAY_ON_WEAR_DISABLED";
                                    break;
                                }
                                case 19: {
                                    s8 = "CDCVM_REQUIRED_SDK";
                                    break;
                                }
                                case 21: {
                                    s8 = "VELOCITY_CHECK";
                                    break;
                                }
                                case 22: {
                                    s8 = "NO_WALLET";
                                    break;
                                }
                                case 23: {
                                    s8 = "NO_CARD";
                                    break;
                                }
                                case 24: {
                                    s8 = "READER_ERROR_WRONG_AID";
                                    break;
                                }
                                case 25: {
                                    s8 = "READER_ERROR_WRONG_LENGTH";
                                    break;
                                }
                                case 26: {
                                    s8 = "READER_ERROR_IN_SDK";
                                    break;
                                }
                                case 27: {
                                    s8 = "CARD_NOT_SUPPORTED_AID_NOT_SUPPORTED";
                                    break;
                                }
                                case 28: {
                                    s8 = "CARD_NOT_SUPPORTED_MSD_ON_EMV";
                                    break;
                                }
                                case 29: {
                                    s8 = "CARD_NOT_SUPPORTED_SDK";
                                    break;
                                }
                                case 30: {
                                    s8 = "PPSE_ONLY";
                                    break;
                                }
                                case 0x1F: {
                                    s8 = "TRANSIT_INSUFFICIENT_BALANCE";
                                    break;
                                }
                                case 0x20: {
                                    s8 = "TRANSIT_INVALID_TICKET";
                                    break;
                                }
                                case 33: {
                                    s8 = "TRANSIT_EXPIRED_TICKET";
                                    break;
                                }
                                case 34: {
                                    s8 = "TRANSIT_SUSPENDED_TICKET";
                                    break;
                                }
                                case 35: {
                                    s8 = "TRANSIT_PASSBACK";
                                    break;
                                }
                                case 36: {
                                    s8 = "TRANSIT_UNACTIVATED_TICKET";
                                    break;
                                }
                                case 37: {
                                    s8 = "PAYMENT_CARDS_BLOCKED";
                                    break;
                                }
                                case 38: {
                                    s8 = "CLOSED_LOOP_PASSES_BUNDLE_ON_DIFFERENT_ACCOUNT";
                                    break;
                                }
                                case 39: {
                                    s8 = "PAYMENT_NOT_STARTED_MULTIPLE_CARDS";
                                    break;
                                }
                                case 40: {
                                    s8 = "ACCESS_SUSPENDED_CARD";
                                    break;
                                }
                                case 41: {
                                    s8 = "ODA_CERTS_EXPIRED";
                                    break;
                                }
                                case 46: {
                                    s8 = "SCREEN_OFF_NOT_WEAR_TRANSIT";
                                    break;
                                }
                                default: {
                                    s8 = "UNKNOWN";
                                }
                            }
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp9.b_message;
                            ((ftkl)hftv3).c = s8;
                            CardInfo cardInfo1 = esqi0.y;
                            if(cardInfo1 != null) {
                                switch(cardInfo1.f) {
                                    case 1: {
                                        s9 = "AMEX";
                                        break;
                                    }
                                    case 2: {
                                        s9 = "DISCOVER";
                                        break;
                                    }
                                    case 3: {
                                        s9 = "MASTERCARD";
                                        break;
                                    }
                                    case 4: {
                                        s9 = "VISA";
                                        break;
                                    }
                                    case 5: {
                                        s9 = "INTERAC";
                                        break;
                                    }
                                    case 6: {
                                        s9 = "PRIVATE_LABEL";
                                        break;
                                    }
                                    case 7: {
                                        s9 = "EFTPOS";
                                        break;
                                    }
                                    case 8: {
                                        s9 = "MAESTRO";
                                        break;
                                    }
                                    case 9: {
                                        s9 = "ID";
                                        break;
                                    }
                                    case 10: {
                                        s9 = "QUICPAY";
                                        break;
                                    }
                                    case 11: {
                                        s9 = "JCB";
                                        break;
                                    }
                                    case 12: {
                                        s9 = "ELO";
                                        break;
                                    }
                                    case 13: {
                                        s9 = "MIR";
                                        break;
                                    }
                                    default: {
                                        s9 = "OTHER";
                                    }
                                }
                                if(!hftv3.isImmutable()) {
                                    hftp9.ensureMutable();
                                }
                                ((ftkl)hftp9.b_message).d = s9;
                            }
                            if(hyuz.a.b().a()) {
                                boolean z3 = esqi0.E;
                                if(!hftp9.b_message.isImmutable()) {
                                    hftp9.ensureMutable();
                                }
                                ftkl ftkl0 = (ftkl)hftp9.b_message;
                                ftkl0.b |= 1;
                                ftkl0.e = z3;
                            }
                            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)ftkj.a).v_newBuilder();
                            int v1 = (int)hyqx.a.b().a();
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp10.b_message;
                            ((ftkj)hftv4).b |= 1;
                            ((ftkj)hftv4).c = v1;
                            int v2 = esqi0.ah;
                            if(v2 != 0) {
                                switch(v2) {
                                    case 1: {
                                        break;
                                    }
                                    case 2: {
                                        s1 = "NONE";
                                        break;
                                    }
                                    case 3: {
                                        s1 = "QAW_UNLOCKED";
                                        break;
                                    }
                                    case 4: {
                                        s1 = "QAW_LOCKED";
                                        break;
                                    }
                                    case 5: {
                                        s1 = "LPP_UNLOCKED";
                                        break;
                                    }
                                    case 6: {
                                        s1 = "LPP_LOCKED";
                                        break;
                                    }
                                    case 7: {
                                        s1 = "WALLET_HOME";
                                        break;
                                    }
                                    case 8: {
                                        s1 = "FOP_DETAIL";
                                        break;
                                    }
                                    case 9: {
                                        s1 = "TAP_UI_RETRY";
                                        break;
                                    }
                                    case 10: {
                                        s1 = "CLOSED_LOOP_CARD";
                                        break;
                                    }
                                    case 11: {
                                        s1 = "CLOSED_LOOP_DETAILS";
                                        break;
                                    }
                                    default: {
                                        s1 = "PRESENTATION_MODE";
                                    }
                                }
                                if(!hftv4.isImmutable()) {
                                    hftp10.ensureMutable();
                                }
                                ((ftkj)hftp10.b_message).d = s1;
                            }
                            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)ftke.a).v_newBuilder();
                            if(!hftp11.b_message.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ftke ftke0 = (ftke)hftp11.b_message;
                            ftkl ftkl1 = (ftkl)hftp9.N_build();
                            ftkl1.getClass();
                            ftke0.d = ftkl1;
                            ftke0.c = 2;
                            if(!hftp11.b_message.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ftke ftke1 = (ftke)hftp11.b_message;
                            ftkj ftkj0 = (ftkj)hftp10.N_build();
                            ftkj0.getClass();
                            ftke1.e = ftkj0;
                            ftke1.b |= 1;
                            ftke ftke2 = (ftke)hftp11.N_build();
                            if(!hftp8.b_message.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            ftkg ftkg0 = (ftkg)hftp8.b_message;
                            ftke2.getClass();
                            ftkg0.c = ftke2;
                            ftkg0.b = 3;
                            etgl0.cH(((ftkg)hftp8.N_build()).toBytesArray()).A(new esyq());
                        }
                    }
                    if(hytb.d()) {
                        guts guts16 = (guts)((ProtoLiteBuilder)gutm0).N_build();
                        gutr gutr2 = gutr.b(((guts)gutm0.b_message).r);
                        if(gutr2 == null) {
                            gutr2 = gutr.d;
                        }
                        if(gutr2 != gutr.b) {
                            z = false;
                        }
                        esyr.j(context0, esqi0, guts16, z, etmv0);
                        return;
                    }
                    gutr gutr3 = gutr.b(((guts)gutm0.b_message).r);
                    if(gutr3 == null) {
                        gutr3 = gutr.d;
                    }
                    if(gutr3 == gutr.b) {
                        esyr.j(context0, esqi0, ((guts)((ProtoLiteBuilder)gutm0).N_build()), true, etmv0);
                    }
                    return;
                }
                Object object1 = iterator1.next();
                esvw esvw0 = ((esqf)object1).b;
                if(esvw0.d().length != 0) {
                    try {
                        esyr.g(esvj.m(esvw0.d()), hftp0, gutm0);
                    }
                    catch(esvk esvk0) {
                        a.ae(esyr.a.j(), "Response not in TLV format", esvk0);
                    }
                }
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(esyr.a.j(), "Error reporting tap", illegalArgumentException0);
        }
    }
}

