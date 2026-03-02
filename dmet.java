import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.libraries.tapandpay.ui.card.WalletCard;
import com.google.android.libraries.tapandpay.ui.card.credit.CardCredit;
import j..util.Objects;
import java.io.File;

public final class dmet {
    public static final bboh a;
    public final Context b;
    public final Account c;
    public final gmcg d;
    private final File e;

    static {
        dmet.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmet(Context context0, Account account0, String s, gmcg gmcg0) {
        this.b = context0;
        this.c = account0;
        this.d = gmcg0;
        File file0 = dmet.l(context0, account0.name);
        File file1 = dmet.l(context0, s);
        if(hypp.c() && file1.exists()) {
            file0 = file1;
        }
        this.e = file0;
    }

    public final File a(String s) {
        if(hrnt.i()) {
            ccsg ccsg0 = ccsb.a;
            String s1 = dmet.b(s);
            return new File(ccsg0.b(this.e, s1));
        }
        String s2 = dmet.b(s);
        return new File(this.e, s2);
    }

    public static String b(String s) {
        byte[] arr_b = bbmq.aa(s, "MD5");
        batl.s(arr_b);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if((v1 & 0xF0) == 0) {
                stringBuilder0.append("0");
            }
            stringBuilder0.append(Integer.toHexString(v1 & 0xFF));
        }
        return stringBuilder0.toString();
    }

    public static String c(dmew dmew0) {
        return dmew0.h == null ? "" : dmew0.h.toString();
    }

    public static void d(Context context0, String s, AccountInfo accountInfo0) {
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.tapandpay.cardart.CardArtIntentOperation", "com.google.android.gms.tapandpay.cardart.SYNC_CARD_ART");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("EXTRA_CARD_ART", s);
        bauc.l(accountInfo0, intent0, "extra_account_info");
        context0.startService(intent0);
    }

    public final void e(dmew dmew0, ImageView imageView0) {
        this.g(dmew0, imageView0, null, null, false);
    }

    public final void f(dmew dmew0, ImageView imageView0, dmes dmes0) {
        this.g(dmew0, imageView0, dmes0, null, false);
    }

    public final void g(dmew dmew0, ImageView imageView0, dmes dmes0, String s, boolean z) {
        Drawable drawable0 = imageView0.getDrawable();
        if((drawable0 instanceof fsap) && dmew0 != null && String.valueOf(Objects.hash(new Object[]{dmew0, s})).equals(((fsap)drawable0).j) && (TextUtils.isEmpty(dmet.c(dmew0)) || ((fsap)drawable0).c() != null)) {
            return;
        }
        if(dmew0 == null) {
            new fsap(this.b);
            return;
        }
        Context context0 = this.b;
        fsap fsap0 = new fsap(context0);
        fsap0.r();
        fsap0.j = String.valueOf(Objects.hash(new Object[]{dmew0, s}));
        fsap0.i(dmew0.a);
        fsap0.n(dmew0.c);
        fsap0.p(dmew0.d);
        fsap0.k(dmew0.e);
        fsap0.l(dmew0.b);
        int v = dmew0.g;
        fsap0.j(v);
        int v1 = dmew0.f;
        fsap0.o(v1);
        fsap0.q();
        if(s != null) {
            fsap0.e(s);
            fsap0.m(z);
            if(hwke.j() && v1 == v) {
                v1 = context0.getColor(0x7F060DAB);  // color:pay_balance_text_color
            }
            fsap0.f(v1);
        }
        String s1 = dmet.c(dmew0);
        if(!TextUtils.isEmpty(s1)) {
            dmem dmem0 = new dmem(this, this.a(s1), s1);
            dmen dmen0 = new dmen(dmes0, fsap0, imageView0);
            dmeo dmeo0 = new dmeo(dmes0, imageView0, fsap0);
            donb.a(context0, this.d, dmem0, dmen0, dmeo0);
            return;
        }
        dmet.j(imageView0, fsap0);
    }

    public final void h(fsan fsan0, WalletCard walletCard0) {
        fujl fujl0 = this.i(fsan0);
        if(Objects.hash(new Object[]{fujl0.a, fujl0.b, fujl0.c, fujl0.d}) == Objects.hash(new Object[]{walletCard0.h.a, walletCard0.h.b, walletCard0.h.c, walletCard0.h.d})) {
            return;
        }
        walletCard0.g(fujl0);
    }

    public final fujl i(fsan fsan0) {
        Integer integer0;
        String s = fsan0.h == null ? "" : fsan0.h.toString();
        boolean z = false;
        fryh fryh0 = s.isEmpty() ? new fryh(0) : new fryj(s);
        String s1 = fsan0.b;
        fuib fuib0 = new fuib(new fryu(s1), new frxr(fsan0.f));
        Context context0 = this.b;
        ibuq.f(context0, "context");
        String s2 = null;
        switch(fsan0.a) {
            case 1: {
                integer0 = (int)0x7F153165;  // string:tp_amex "American Express"
                break;
            }
            case 2: {
                integer0 = (int)0x7F1531AE;  // string:tp_discover "Discover"
                break;
            }
            case 3: {
                integer0 = (int)0x7F15321C;  // string:tp_mastercard "Mastercard"
                break;
            }
            case 4: {
                integer0 = (int)0x7F1533A8;  // string:tp_visa "Visa"
                break;
            }
            case 5: {
                integer0 = (int)0x7F153209;  // string:tp_interac "Interac"
                break;
            }
            case 6: {
                integer0 = (int)0x7F1531B3;  // string:tp_eftpos "eftpos"
                break;
            }
            case 7: {
                integer0 = (int)0x7F153219;  // string:tp_maestro "Maestro"
                break;
            }
            case 8: {
                integer0 = (int)0x7F1531B4;  // string:tp_elo "Elo"
                break;
            }
            default: {
                integer0 = null;
            }
        }
        if(integer0 != null) {
            s2 = context0.getString(integer0.intValue());
        }
        String s3 = fsan0.d;
        if(s3 != null && s3.length() != 0) {
            boolean z1 = ibuq.m(s3, fsan0.e);
            if(s1.length() > 0 && ibzk.G(s3, s1)) {
                z = true;
            }
            if(z1 || z) {
                s3 = fsan0.c;
            }
        }
        else {
            s3 = fsan0.c;
        }
        String s4 = s2 == null ? context0.getString(0x7F153189, new Object[]{s3, fsao.a(s1)}) : context0.getString(0x7F153184, new Object[]{s3, s2, fsao.a(s1)});  // string:tp_card_other_full_content_description "%1$s Payment card ending with %2$s."
        ibuq.c(s4);
        return new fujl(fryh0, fuib0, new fryu(ibzk.s(s4).toString()), new frxp(fsan0.g));
    }

    public static final void j(ImageView imageView0, fsap fsap0) {
        imageView0.setImageDrawable(fsap0);
        imageView0.setContentDescription(fsap0.d());
    }

    public static final void k(fttm fttm0, fsap fsap0) {
        String s = fsap0.d();
        ibuq.f(s, "contentDescription");
        ibuq.f(s, "contentDescription");
        ((CardCredit)fttm0).g.setVisibility(0);
        fttm0.setContentDescription(s);
        ((CardCredit)fttm0).g.setImageDrawable(fsap0);
    }

    private static File l(Context context0, String s) {
        File file0 = hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "android_pay_card_art")) : new File(context0.getFilesDir(), "android_pay_card_art");
        return hrnt.i() ? new File(ccsb.a.b(file0, dmet.b(s))) : new File(file0, dmet.b(s));
    }
}

