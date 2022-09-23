package com.nuoye.selfdiscipline;

import androidx.multidex.MultiDexApplication;

import com.didi.drouter.api.DRouter;

/**
 * @author yangfan6
 */
public class SelfDisciplineApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        DRouter.init(this);
    }
}
