import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class beww extends tk {
    private final List a;

    public beww(List list0) {
        this.a = list0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0864, viewGroup0, false);  // layout:pwm_import_preview_error_item
        ibuq.c(view0);
        return new bewv(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        int v2;
        ibuq.f(((bewv)uq0), "viewHolder");
        ((bewv)uq0).t.setVisibility(8);
        TextView textView0 = ((bewv)uq0).u;
        textView0.setVisibility(8);
        TextView textView1 = ((bewv)uq0).v;
        textView1.setVisibility(8);
        TextView textView2 = ((bewv)uq0).w;
        textView2.setVisibility(8);
        TextView textView3 = ((bewv)uq0).x;
        textView3.setVisibility(8);
        ((bewv)uq0).t.setVisibility((v == 0 ? 4 : 0));
        bewf bewf0 = (bewf)this.a.get(v);
        if((bewf0 instanceof bewi)) {
            String s = ((bewi)bewf0).a;
            int v1 = ((bewi)bewf0).b;
            if(s.length() == 0) {
                textView2.setVisibility(8);
            }
            else {
                textView2.setVisibility(0);
                textView2.setText(s);
            }
            textView3.setText(((bewv)uq0).a.getResources().getString(0x7F1526F4, new Object[]{v1}));  // string:pwm_import_preview_invalid_line_error "Make sure row %1$d is formatted correctly"
            textView3.setVisibility(0);
            return;
        }
        if(!(bewf0 instanceof bewj)) {
            throw new ibnq();
        }
        ibuq.f(((bewv)uq0), "viewHolder");
        ibuq.f(((bewj)bewf0), "nonImportableCredential");
        String s1 = ((bewj)bewf0).a;
        String s2 = ((bewj)bewf0).b;
        bewg bewg0 = ((bewj)bewf0).c;
        if(s1.length() == 0) {
            textView0.setVisibility(8);
        }
        else {
            textView0.setVisibility(0);
            textView0.setText(s1);
        }
        if(s2 != null && s2.length() != 0) {
            textView1.setVisibility(0);
            textView1.setText(s2);
        }
        else {
            textView1.setVisibility(8);
        }
        switch(bewg0.ordinal()) {
            case 0: {
                v2 = 0x7F1526F7;  // string:pwm_import_preview_note_too_long_error "Note is too long"
                break;
            }
            case 1: {
                v2 = 0x7F152702;  // string:pwm_import_preview_username_too_long_error "Username is too long"
                break;
            }
            case 2: {
                v2 = 0x7F1526FA;  // string:pwm_import_preview_password_too_long_error "Password is too long"
                break;
            }
            case 3: {
                v2 = 0x7F152701;  // string:pwm_import_preview_url_too_long_error "URL is too long"
                break;
            }
            case 4: {
                v2 = 0x7F1526F8;  // string:pwm_import_preview_password_empty_error "Password is empty"
                break;
            }
            case 5: {
                v2 = 0x7F1526FD;  // string:pwm_import_preview_url_and_username_empty_error "URL and username are empty"
                break;
            }
            case 6: {
                v2 = 0x7F1526FE;  // string:pwm_import_preview_url_empty_error "URL is empty"
                break;
            }
            case 7: {
                v2 = 0x7F1526FF;  // string:pwm_import_preview_url_has_non_ascii_characters_error "Non-ascii chars in 
                                  // URL"
                break;
            }
            case 8: {
                v2 = 0x7F152700;  // string:pwm_import_preview_url_invalid_error "Not a valid URL"
                break;
            }
            case 9: {
                v2 = 0x7F1526F1;  // string:pwm_import_preview_conflicting_password_exists_in_file_error "Conflicting 
                                  // password present earlier in the file"
                break;
            }
            case 10: {
                v2 = 0x7F1526F9;  // string:pwm_import_preview_password_exists_in_account_error "Password already exists"
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        textView3.setText(((bewv)uq0).a.getResources().getString(v2));
        textView3.setVisibility(0);
    }
}

