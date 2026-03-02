package dagger.android;

import dagger.internal.DaggerCollections;
import dagger.internal.Preconditions;
import ibnf;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class DispatchingAndroidInjector implements AndroidInjector {
    private final Map a;

    public DispatchingAndroidInjector(Map map0, Map map1) {
        if(!map0.isEmpty()) {
            LinkedHashMap linkedHashMap0 = DaggerCollections.b(map0.size() + map1.size());
            linkedHashMap0.putAll(map1);
            for(Object object0: map0.entrySet()) {
                linkedHashMap0.put(((Class)((Map.Entry)object0).getKey()).getName(), ((Map.Entry)object0).getValue());
            }
            map1 = DesugarCollections.unmodifiableMap(linkedHashMap0);
        }
        this.a = map1;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        String s = object0.getClass().getName();
        Map map0 = this.a;
        ibnf ibnf0 = (ibnf)map0.get(s);
        if(ibnf0 == null) {
            ArrayList arrayList0 = new ArrayList();
            for(Class class0 = object0.getClass(); class0 != null; class0 = class0.getSuperclass()) {
                if(map0.containsKey(class0.getCanonicalName())) {
                    arrayList0.add(class0.getCanonicalName());
                }
            }
            throw new IllegalArgumentException((arrayList0.isEmpty() ? String.format("No injector factory bound for Class<%s>", object0.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", object0.getClass().getCanonicalName(), arrayList0)));
        }
        AndroidInjector.Factory androidInjector$Factory0 = (AndroidInjector.Factory)ibnf0.get();
        try {
            AndroidInjector androidInjector0 = androidInjector$Factory0.create(object0);
            Preconditions.d(androidInjector0, "%s.create(I) should not return null.", androidInjector$Factory0.getClass());
            androidInjector0.inject(object0);
        }
        catch(ClassCastException classCastException0) {
            throw new DispatchingAndroidInjector.InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", androidInjector$Factory0.getClass().getCanonicalName(), object0.getClass().getCanonicalName()), classCastException0);
        }
    }
}

