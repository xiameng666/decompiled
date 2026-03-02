package com.google.android.gms.significantplaces.settings;

import acp;
import adt;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import azts;
import ca;
import cmmy;
import cmnh;
import cmoc;
import cmog;
import cnjv;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import cpnp;
import cpnt;
import cprn;
import cprq;
import cpsa;
import epia;
import epil;
import epjk;
import epjl;
import epjn;
import epjo;
import epjp;
import epjq;
import epjr;
import epjs;
import epjt;
import epjv;
import epjw;
import epjx;
import epjy;
import epjz;
import epko;
import evql;
import fyhn;
import hydt;
import ibnn;
import ibuk;
import ibuq;
import im;
import lsd;
import xni;

@GmsCoreVeId(0x3FCF7)
public final class PlacePickerChimeraActivity extends xni implements cpnt {
    public cpnp j;
    public epia k;
    public acp l;
    public epjk m;
    public EditText n;
    private cmnh o;
    private evql p;
    private final ibnn q;
    private cprq r;
    private cpsa s;
    private final double t;

    public PlacePickerChimeraActivity() {
        epjv epjv0 = new epjv(this);
        this.q = new lsd(new ibuk(epko.class), new epjw(this), epjv0, new epjx(this));
        this.t = (double)hydt.b();
    }

    @Override  // cpnt
    public final void a(cpnp cpnp0) {
        this.j = cpnp0;
        cpnp cpnp1 = null;
        if(cpnp0 == null) {
            ibuq.j("map");
            cpnp0 = null;
        }
        cpnp0.j(true);
        this.l();
        cprq cprq0 = this.r;
        if(cprq0 != null) {
            cprq0.a();
        }
        this.r = null;
        cpsa cpsa0 = this.s;
        if(cpsa0 != null) {
            cpsa0.b();
        }
        this.s = null;
        cpnp cpnp2 = this.j;
        if(cpnp2 == null) {
            ibuq.j("map");
            cpnp2 = null;
        }
        cpnp2.l(new epjl(this));
        cpnp cpnp3 = this.j;
        if(cpnp3 == null) {
            ibuq.j("map");
        }
        else {
            cpnp1 = cpnp3;
        }
        cpnp1.k(() -> {
            cpnp cpnp0 = null;
            if(this.r == null || this.s == null) {
                cpnp cpnp1 = this.j;
                if(cpnp1 == null) {
                    ibuq.j("map");
                    cpnp1 = null;
                }
                CircleOptions circleOptions0 = new CircleOptions();
                cpnp cpnp2 = this.j;
                if(cpnp2 == null) {
                    ibuq.j("map");
                    cpnp2 = null;
                }
                circleOptions0.a(cpnp2.d().a);
                circleOptions0.b = this.t;
                circleOptions0.c();
                circleOptions0.b();
                circleOptions0.d();
                this.r = cpnp1.e(circleOptions0);
                cpnp cpnp3 = this.j;
                if(cpnp3 == null) {
                    ibuq.j("map");
                    cpnp3 = null;
                }
                MarkerOptions markerOptions0 = new MarkerOptions();
                cpnp cpnp4 = this.j;
                if(cpnp4 == null) {
                    ibuq.j("map");
                    cpnp4 = null;
                }
                markerOptions0.a(cpnp4.d().a);
                markerOptions0.b = "Drag to adjust your location";
                markerOptions0.d = cprn.b(0x7F080F13);
                cpsa cpsa0 = cpnp3.g(markerOptions0);
                this.s = cpsa0;
                if(cpsa0 != null) {
                    cpsa0.e();
                }
            }
            cprq cprq0 = this.r;
            if(cprq0 != null) {
                cpnp cpnp5 = this.j;
                if(cpnp5 == null) {
                    ibuq.j("map");
                    cpnp5 = null;
                }
                cprq0.b(cpnp5.d().a);
            }
            cprq cprq1 = this.r;
            if(cprq1 != null) {
                cprq1.c(true);
            }
            cpsa cpsa1 = this.s;
            if(cpsa1 != null) {
                cpnp cpnp6 = this.j;
                if(cpnp6 == null) {
                    ibuq.j("map");
                }
                else {
                    cpnp0 = cpnp6;
                }
                cpsa1.c(cpnp0.d().a);
            }
            cpsa cpsa2 = this.s;
            if(cpsa2 != null) {
                cpsa2.d(true);
            }
        });
    }

    // Detected as a lambda impl.
    public final void g(boolean z) {
        cpnp cpnp0 = null;
        if(this.r == null || this.s == null) {
            cpnp cpnp1 = this.j;
            if(cpnp1 == null) {
                ibuq.j("map");
                cpnp1 = null;
            }
            CircleOptions circleOptions0 = new CircleOptions();
            cpnp cpnp2 = this.j;
            if(cpnp2 == null) {
                ibuq.j("map");
                cpnp2 = null;
            }
            circleOptions0.a(cpnp2.d().a);
            circleOptions0.b = this.t;
            circleOptions0.c();
            circleOptions0.b();
            circleOptions0.d();
            this.r = cpnp1.e(circleOptions0);
            cpnp cpnp3 = this.j;
            if(cpnp3 == null) {
                ibuq.j("map");
                cpnp3 = null;
            }
            MarkerOptions markerOptions0 = new MarkerOptions();
            cpnp cpnp4 = this.j;
            if(cpnp4 == null) {
                ibuq.j("map");
                cpnp4 = null;
            }
            markerOptions0.a(cpnp4.d().a);
            markerOptions0.b = "Drag to adjust your location";
            markerOptions0.d = cprn.b(0x7F080F13);
            cpsa cpsa0 = cpnp3.g(markerOptions0);
            this.s = cpsa0;
            if(cpsa0 != null) {
                cpsa0.e();
            }
        }
        cprq cprq0 = this.r;
        if(cprq0 != null) {
            cpnp cpnp5 = this.j;
            if(cpnp5 == null) {
                ibuq.j("map");
                cpnp5 = null;
            }
            cprq0.b(cpnp5.d().a);
        }
        cprq cprq1 = this.r;
        if(cprq1 != null) {
            cprq1.c(z);
        }
        cpsa cpsa1 = this.s;
        if(cpsa1 != null) {
            cpnp cpnp6 = this.j;
            if(cpnp6 == null) {
                ibuq.j("map");
            }
            else {
                cpnp0 = cpnp6;
            }
            cpsa1.c(cpnp0.d().a);
        }
        cpsa cpsa2 = this.s;
        if(cpsa2 != null) {
            cpsa2.d(z);
        }
    }

    private final void l() {
        evql evql0 = this.p;
        if(evql0 == null) {
            ibuq.j("locationTask");
            evql0 = null;
        }
        evql0.b(new epjt(new epjs(this)));
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x52B1DE8B && v1 == -1) {
            cmnh cmnh0 = this.o;
            if(cmnh0 == null) {
                ibuq.j("flpClient");
                cmnh0 = null;
            }
            cmmy cmmy0 = new cmmy();
            cmmy0.d(102);
            cmmy0.c(60000L);
            cmmy0.e(2);
            this.p = cmnh0.c(cmmy0.a(), null);
            this.l();
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        epil.c(this);
        fyhn.b(this.getContainerActivity());
        this.o = new cnjv(this);
        this.setContentView(0x7F0E09BF);  // layout:significant_places_place_picker
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B18A7, new epjz());  // id:map_container
        ca0.a();
        im im0 = this.hL();
        if(im0 != null) {
            im0.o(true);
        }
        cmnh cmnh0 = this.o;
        EditText editText0 = null;
        if(cmnh0 == null) {
            ibuq.j("flpClient");
            cmnh0 = null;
        }
        this.p = cmnh0.d();
        this.k = new epia();
        this.l = this.registerForActivityResult(new adt(), new epjn(this));
        this.findViewById(0x7F0B0DC4).setOnClickListener(new epjo(this));  // id:button_use_this_place
        azts azts0 = new azts(this, null);
        cmog cmog0 = new cmog();
        cmoc cmoc0 = new cmoc(0L);
        cmoc0.k(102);
        cmog0.b(cmoc0.a());
        azts0.af(cmog0.a()).z(new epjp(this));
        this.n = (EditText)this.findViewById(0x7F0B11E8);  // id:edit_text_enter_address
        ((epko)this.q.a()).a.g(this, new epjy(new epjq(this)));
        this.m = new epjk();
        ca ca1 = new ca(this.getSupportFragmentManager());
        epjk epjk0 = this.m;
        if(epjk0 == null) {
            ibuq.j("placePickerFragment");
            epjk0 = null;
        }
        ca1.G(0x7F0B1F55, epjk0);  // id:search_container
        ca1.a();
        EditText editText1 = this.n;
        if(editText1 == null) {
            ibuq.j("editText");
        }
        else {
            editText0 = editText1;
        }
        editText0.setOnFocusChangeListener(new epjr(this));
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            epil.b(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // xni
    protected final void onStart() {
        super.onStart();
        epil.d(this);
    }

    @Override  // xni
    protected final void onStop() {
        epil.e(this);
        super.onStop();
    }
}

