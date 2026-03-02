import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.internal.Preconditions;
import j..util.Collection.-EL;
import java.util.ArrayList;

public final class dvwc extends dokz implements doky {
    dspe a;
    private gged_interceptors ag;
    private gfsx ah;
    public static final int b;
    private static final bboh c;
    private gfsx d;

    static {
        dvwc.c = bboh.b("Pay", bbcu.cZ);
    }

    public dvwc() {
        this.d = gfqx.a;
        this.ag = ggna.a;
    }

    // Detected as a lambda impl.
    @Override  // doky
    public final boolean G() {
        this.y();
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        new dvqp(dolg0, new done()).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s1;
        String s;
        gfsx gfsx0;
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null || bundle1.isEmpty()) {
            ((ggtj)dvwc.c.i()).x("No arguments for ValuableFieldUpdateFragment");
            this.y();
        }
        else if(bundle1.getParcelable("VALUABLE") == null) {
            ((ggtj)dvwc.c.i()).x("No valuable argument for ValuableFieldUpdateFragment");
            this.y();
        }
        else {
            this.d = gfsx.l(((Valuable)bundle1.getParcelable("VALUABLE")));
            ArrayList arrayList0 = bundle1.getParcelableArrayList("FIELD_UPDATE_INFOS");
            if(arrayList0 == null) {
                ((ggtj)dvwc.c.i()).x("No fieldUpdateInfos argument for ValuableFieldUpdateFragment");
                this.y();
            }
            else {
                this.ag = (gged_interceptors)Collection.-EL.stream(arrayList0).map(new dvwb()).collect(ggaf.a);
            }
        }
        View view0 = layoutInflater0.inflate(0x7F0E0DF1, viewGroup0, false);  // layout:wallet_valuable_field_update_fragment
        if(this.d.i()) {
            gucv gucv0 = ((Valuable)this.d.d()).q.j;
            if(gucv0 == null) {
                gucv0 = gucv.a;
            }
            for(Object object0: gucv0.c) {
                gucn gucn0 = (gucn)object0;
                if(gucn0.b != 1) {
                    continue;
                }
                gfsx0 = gfsx.m(((gucl)gucn0.c));
                goto label_29;
            }
            gfsx0 = gfqx.a;
        label_29:
            this.ah = gfsx0;
            if(!gfsx0.i()) {
                ((ggtj)dvwc.c.i()).x("CardTemplateInfo is not present for ValuableFieldUpdateFragment");
                this.y();
                return view0;
            }
            if(!this.ag.isEmpty()) {
                MaterialToolbar materialToolbar0 = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
                if(materialToolbar0 != null) {
                    materialToolbar0.t(0x7F151C03);  // string:pay_back "Back"
                    materialToolbar0.x((/* MISSING LAMBDA PARAMETER */) -> {
                        this.y();
                        return true;
                    });
                }
                ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B0475);  // id:HeaderLogo
                if(imageView0 != null) {
                    guag guag0 = ((gucl)this.ah.d()).c;
                    if(guag0 == null) {
                        guag0 = guag.a;
                    }
                    gukv gukv0 = guag0.c == null ? gukv.a : guag0.c;
                    if((gukv0.b & 1) != 0) {
                        dsoy dsoy0 = this.a.b(new fsda(imageView0), gukv0);
                        dsoy0.i = false;
                        this.a.d(dsoy0);
                        imageView0.setVisibility(0);
                    }
                }
                TextView textView0 = (TextView)view0.findViewById(0x7F0B047A);  // id:HeaderText
                if(textView0 != null) {
                    Context context0 = this.getContext();
                    if(context0 != null) {
                        guag guag1 = ((gucl)this.ah.d()).c;
                        if(guag1 == null) {
                            guag1 = guag.a;
                        }
                        if(bbqr.d((guag1.g == null ? gunw.a : guag1.g).d)) {
                            s = ((Valuable)this.d.d()).p.e;
                        }
                        else {
                            guag guag2 = ((gucl)this.ah.d()).c;
                            if(guag2 == null) {
                                guag2 = guag.a;
                            }
                            s = (guag2.g == null ? gunw.a : guag2.g).d;
                        }
                        switch(((Valuable)this.d.d()).R.ordinal()) {
                            case 1: {
                                s1 = context0.getString(0x7F152334, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_loyalty_card "Updated information 
                                                                                       // for your %1$s loyalty card"
                                break;
                            }
                            case 2: {
                                s1 = context0.getString(0x7F152333, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_gift_card "Updated information 
                                                                                       // for your %1$s gift card"
                                break;
                            }
                            case 3: {
                                s1 = context0.getString(0x7F152335, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_offer "Updated information for 
                                                                                       // your %1$s offer"
                                break;
                            }
                            case 5: {
                                s1 = context0.getString(0x7F152330, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_event_ticket "Updated information 
                                                                                       // for your %1$s ticket"
                                break;
                            }
                            case 6: {
                                s1 = context0.getString(0x7F152331, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_flight "Updated information 
                                                                                       // for your %1$s boarding pass"
                                break;
                            }
                            case 7: {
                                s1 = context0.getString(0x7F152336, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_transit_card "Updated information 
                                                                                       // for your %1$s card"
                                break;
                            }
                            default: {
                                s1 = context0.getString(0x7F152332, new Object[]{s});  // string:pay_valuable_field_update_screen_header_text_generic_card "Updated information 
                                                                                       // for your %1$s pass"
                            }
                        }
                        textView0.setText(s1);
                        textView0.setVisibility(0);
                    }
                }
                LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B03E2);  // id:FieldUpdatesContainer
                if(linearLayout0 != null) {
                    gged_interceptors gged0 = this.ag;
                    int v = gged0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        gtyt gtyt0 = (gtyt)gged0.get(v1);
                        if(!gtyt0.c.isEmpty() && !gtyt0.b.isEmpty()) {
                            View view1 = layoutInflater0.inflate(0x7F0E0DF0, linearLayout0, false);  // layout:wallet_valuable_field_update
                            ((TextView)view1.findViewById(0x7F0B04F2)).setText(gtyt0.b);  // id:Label
                            ((TextView)view1.findViewById(0x7F0B0981)).setText(gtyt0.c);  // id:Value
                            linearLayout0.addView(view1);
                        }
                    }
                }
                return view0;
            }
            ((ggtj)dvwc.c.i()).x("FieldUpdateInfos is empty for ValuableFieldUpdateFragment");
            this.y();
            return view0;
        }
        ((ggtj)dvwc.c.i()).x("Valuable is not present for ValuableFieldUpdateFragment");
        this.y();
        return view0;
    }

    private final void y() {
        xob xob0 = this.an();
        if(xob0 == null) {
            return;
        }
        xob0.setResult(0);
        this.ar();
    }
}

