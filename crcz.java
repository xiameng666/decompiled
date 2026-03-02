import java.util.EnumMap;

final class crcz {
    public final EnumMap a;

    public crcz() {
        this.a = new EnumMap(crma.class);
    }

    public crcz(EnumMap enumMap0) {
        EnumMap enumMap1 = new EnumMap(crma.class);
        this.a = enumMap1;
        enumMap1.putAll(enumMap0);
    }

    public final void a(crma crma0, int v) {
        crcy crcy0 = crcy.a;
        switch(v) {
            case -30: {
                crcy0 = crcy.h;
                break;
            }
            case -10: {
                crcy0 = crcy.d;
                break;
            }
            case -20: 
            case 0: {
                crcy0 = crcy.f;
                break;
            }
            default: {
                if(v == 30) {
                    crcy0 = crcy.e;
                }
            }
        }
        this.a.put(crma0, crcy0);
    }

    public final void b(crma crma0, crcy crcy0) {
        this.a.put(crma0, crcy0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("1");
        crma[] arr_crma = crma.values();
        for(int v = 0; v < arr_crma.length; ++v) {
            crcy crcy0 = (crcy)this.a.get(arr_crma[v]);
            if(crcy0 == null) {
                crcy0 = crcy.a;
            }
            stringBuilder0.append(crcy0.k);
        }
        return stringBuilder0.toString();
    }
}

