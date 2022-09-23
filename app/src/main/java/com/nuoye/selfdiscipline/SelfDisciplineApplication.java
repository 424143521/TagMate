package com.nuoye.selfdiscipline;

import android.app.Application;

import com.didi.drouter.api.DRouter;

/**
 * @author yangfan6
 */
public class SelfDisciplineApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DRouter.init(this);
    }
}
