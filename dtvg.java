import android.content.Context;

public final class dtvg implements dtvu {
    @Override  // dtvu
    public final String a(gtxg gtxg0, Context context0, hjzq hjzq0) {
        String s = duix.a(context0, gtxg0, hjzq0);
        return (gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)).equals(gtxf.c) ? context0.getString(0x7F151EB4, new Object[]{s}) : "ID card request approved";  // string:pay_id_card_added_message "New %1$s added"
    }
}

