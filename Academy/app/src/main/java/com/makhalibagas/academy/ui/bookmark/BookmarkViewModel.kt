package com.makhalibagas.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.makhalibagas.academy.data.CourseEntity
import com.makhalibagas.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}