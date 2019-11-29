/*
 * Copyright 2019 Lukoh Nam, goForer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package com.megazone.megatong.presentation.common.effect.transition

import android.transition.Transition

abstract class TransitionCallback : Transition.TransitionListener {
    override fun onTransitionStart(transition: Transition) {
        // no-op
    }

    override fun onTransitionEnd(transition: Transition) {
        // no-op
    }

    override fun onTransitionCancel(transition: Transition) {
        // no-op
    }

    override fun onTransitionPause(transition: Transition) {
        // no-op
    }

    override fun onTransitionResume(transition: Transition) {
        // no-op
    }
}