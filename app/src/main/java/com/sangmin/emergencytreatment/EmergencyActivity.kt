package com.sangmin.emergencytreatment

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class EmergencyActivity : Application() {

    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "f1113c167de4e551538b6ce0f0225b51")
    }
}