package com.makhalibagas.academy.ui.bookmark

import com.makhalibagas.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}