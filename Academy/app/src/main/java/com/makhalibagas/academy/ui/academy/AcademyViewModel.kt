package com.makhalibagas.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.makhalibagas.academy.data.CourseEntity
import com.makhalibagas.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}