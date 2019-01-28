package dae.screenutils.library

import android.content.ContextWrapper

fun ContextWrapper.isPhone(): Boolean {
    return resources.getBoolean(R.bool.isPhone)
}

fun ContextWrapper.isTablet(): Boolean {
    return resources.getBoolean(R.bool.isTablet)
}

fun ContextWrapper.isTV(): Boolean {
    return resources.getBoolean(R.bool.isTV)
}

fun ContextWrapper.isSmall(): Boolean {
    return resources.getBoolean(R.bool.isSmall)
}

fun ContextWrapper.isLarge(): Boolean {
    return resources.getBoolean(R.bool.isLarge)
}