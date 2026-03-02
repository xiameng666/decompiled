import android.content.Context;

public final class dtvh implements dtvs {
    @Override  // dtvs
    public final String a(gtxg gtxg0, Context context0, hjzq hjzq0) {
        String s = duix.a(context0, gtxg0, hjzq0);
        return (gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)).equals(gtxf.c) ? context0.getString(0x7F151EB5, new Object[]{"pass"}) : context0.getString(0x7F151D04, new Object[]{s});  // string:pay_id_card_added_prompt "Your identity was verified. Tap to view %1$s."
    }
}

