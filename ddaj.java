import com.google.android.gms.nearby.sharing.Attachment;
import java.util.List;

public final class ddaj {
    public static final int a(List list0, boolean z) {
        ibuq.f(list0, "attachments");
        Attachment attachment0 = (Attachment)ibpo.T(list0);
        if(attachment0 == null) {
            return 0x7F080B61;  // drawable:quantum_gm_ic_drive_zip_outline_vd_theme_24
        }
        if(attachment0.m()) {
            return 0x7F080C68;  // drawable:quantum_gm_ic_wifi_vd_theme_24
        }
        if(attachment0.i()) {
            return 0x7F080BFC;  // drawable:quantum_gm_ic_play_prism_vd_theme_24
        }
        if(djbr.v(list0)) {
            if(dizi.n(list0, new int[]{1})) {
                return 0x7F080BF5;  // drawable:quantum_gm_ic_photo_vd_theme_24
            }
            if(dizi.n(list0, new int[]{2})) {
                return 0x7F080C56;  // drawable:quantum_gm_ic_videocam_vd_theme_24
            }
            if(dizi.n(list0, new int[]{1, 2})) {
                return 0x7F080B2E;  // drawable:quantum_gm_ic_collections_vd_theme_24
            }
            if(dizi.n(list0, new int[]{4})) {
                return 0x7F080B01;  // drawable:quantum_gm_ic_audiotrack_vd_theme_24
            }
            if(dizi.n(list0, new int[]{3})) {
                return 0x7F080AEF;  // drawable:quantum_gm_ic_apps_vd_theme_24
            }
            return dizi.n(list0, new int[]{6}) ? 0x7F080B38 : 0x7F080B61;  // drawable:quantum_gm_ic_contacts_vd_theme_24
        }
        if(z) {
            return 0x7F0806A2;  // drawable:ic_access_point_clipboard_dark_theme
        }
        if(attachment0.l() && attachment0.a() == 2) {
            return 0x7F080BBC;  // drawable:quantum_gm_ic_location_on_vd_theme_24
        }
        return !attachment0.l() || attachment0.a() != 1 ? 0x7F080C44 : 0x7F080BB4;  // drawable:quantum_gm_ic_text_fields_vd_theme_24
    }

    public static final void b(List list0, boolean z, long v, hfc hfc0, goz goz0, int v1) {
        ibuq.f(hfc0, "modifier");
        goz goz1 = goz0.ao(89305170);
        int v2 = (v1 & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.Y(z) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.W(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            fiso.a(ism.a(ddaj.a(list0, z), goz1, 0), null, hfc0, v, goz1, v2 >> 3 & 0x380 | 56 | v2 << 3 & 0x1C00, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddai(list0, z, v, hfc0, v1);
        }
    }
}

