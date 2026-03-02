import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class dxtn extends dokz {
    public Spinner a;
    private static final bboh b;
    private ftej c;
    private int d;

    static {
        dxtn.b = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            ((ggtj)dxtn.b.i()).x("Arguments cannot be null.");
            return;
        }
        this.d = bundle1.getInt("amountLabelResId");
        try {
            byte[] arr_b = bundle1.getByteArray("ProcessPaymentConfig");
            gftb.check(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftej.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.c = (ftej)hftv0;
        }
        catch(hfur unused_ex) {
            ((ggtj)dxtn.b.i()).x("Failed to parse ProcessPaymentConfig bytes.");
        }
    }

    @Override  // du
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0081, viewGroup0, false);  // layout:amount_input
        ((TextView)view0.findViewById(0x7F0B0079)).setText(0x7F151C06);  // id:AmountLabel
        view0.findViewById(0x7F0B07D8).setVisibility(0);  // id:SelectAmount
        view0.findViewById(0x7F0B0252).setVisibility(4);  // id:CurrentBalance
        Spinner spinner0 = (Spinner)view0.findViewById(0x7F0B07D8);  // id:SelectAmount
        this.a = spinner0;
        spinner0.setVisibility(0);
        Context context0 = this.getContext();
        gftb.check(context0);
        dxuu dxuu0 = new dxuu(context0, this.c.g, this.c.k, this.c.j);
        this.a.setAdapter(dxuu0);
        this.a.setSelection(dxuu0.a);
        this.a.setOnItemSelectedListener(new dxtm(this, dxuu0.a, dxuu0));
        if(this.d > 0) {
            ((TextView)view0.findViewById(0x7F0B0079)).setText(this.d);  // id:AmountLabel
        }
        return view0;
    }

    public long y() {
        return this.a.getSelectedItem() == null ? 0L : ((long)(((Long)this.a.getSelectedItem())));
    }

    public static dxtn z(ftej ftej0, int v) {
        dxtn dxtn0 = new dxtn();
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("ProcessPaymentConfig", ftej0.toBytesArray());
        bundle0.putInt("amountLabelResId", v);
        dxtn0.setArguments(bundle0);
        return dxtn0;
    }
}

