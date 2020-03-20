package com.skydoves.balloondemo.factory

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.createBalloon
import com.skydoves.balloondemo.BalloonUtils
import com.skydoves.balloondemo.R

class DataBindingBalloonFactory : Balloon.Factory() {
    
    override fun create(context: Context, lifecycle: LifecycleOwner?): Balloon {
        return createBalloon(context) {
            setLayout(R.layout.layout_custom_data_binding)
            isDataBindingSupport(true)
            setArrowSize(10)
            setArrowOrientation(ArrowOrientation.TOP)
            setArrowPosition(0.5f)
            setWidthRatio(0.55f)
            setHeight(250)
            isRtlSupport(BalloonUtils.isRtlLayout())
            setCornerRadius(4f)
            setBackgroundColorResource(R.color.white)
            setBalloonAnimation(BalloonAnimation.CIRCULAR)
            setDismissWhenShowAgain(true)
            setLifecycleOwner(lifecycle)
        }
    }
}