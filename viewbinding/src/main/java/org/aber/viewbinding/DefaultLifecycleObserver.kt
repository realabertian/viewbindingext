package org.aber.viewbinding

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

open class DefaultLifecycleObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                onCreate(source)
            }
            Lifecycle.Event.ON_DESTROY -> {
                onDestroy(source)
            }
        }
    }

    open fun onCreate(owner: LifecycleOwner) {}

    open fun onDestroy(owner: LifecycleOwner) {}
}