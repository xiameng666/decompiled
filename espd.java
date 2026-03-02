import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.service.quickaccesswallet.WalletCard.Builder;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;

public final class espd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = String.format("%s::%s", ((int)((GlobalActionCard)object0).a), ((GlobalActionCard)object0).b);
        Bitmap bitmap0 = ((GlobalActionCard)object0).g;
        Icon icon0 = Icon.createWithBitmap(((GlobalActionCard)object0).c);
        String s1 = ((GlobalActionCard)object0).d;
        PendingIntent pendingIntent0 = ((GlobalActionCard)object0).h;
        Icon icon1 = bitmap0 == null ? null : Icon.createWithBitmap(bitmap0);
        String s2 = ((GlobalActionCard)object0).e;
        if(bbqa.d()) {
            int v = 2;
            switch(((GlobalActionCard)object0).a) {
                case 2: {
                    v = 1;
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    return new WalletCard.Builder(s, 0, icon0, s1, pendingIntent0).setCardIcon(icon1).setCardLabel(s2).build();
                }
            }
            return new WalletCard.Builder(s, v, icon0, s1, pendingIntent0).setCardIcon(icon1).setCardLabel(s2).build();
        }
        return new WalletCard.Builder(s, icon0, s1, pendingIntent0).setCardIcon(icon1).setCardLabel(s2).build();
    }
}

